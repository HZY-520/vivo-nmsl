package com.vivo.cnm.lico;

import android.app.ActivityManager;
import android.app.Application;
import android.app.Instrumentation;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.SurfaceControl;
import com.vivo.cnm.lico.DesktopEntry;
import defpackage.ac;
import defpackage.bd;
import defpackage.eq;
import defpackage.fs0;
import defpackage.hf;
import defpackage.j2;
import defpackage.lw;
import defpackage.m2;
import defpackage.mb;
import defpackage.qf0;
import defpackage.rf0;
import defpackage.s2;
import defpackage.u2;
import defpackage.y2;
import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class DesktopEntry {
    private static final String ACTION = "com.vivo.cnm.lico.action.ENTER_WORKBENCH";
    private static final String ACTION_PING = "com.vivo.cnm.lico.action.PING";
    private static final String ACTION_STATUS = "com.vivo.cnm.lico.action.STATUS";
    private static final String APP_PACKAGE = "com.vivo.cnm.lico";
    private static final String CONTROLLER = "com.android.wm.shell.vivomultitask.VivoMultiTaskController";
    private static final String DRAG_MANAGER = "com.android.wm.shell.vivomultitask.VivoMultiTaskDragEventManager";
    private static final int ENTER_FROM_LAUNCHER = 8;
    private static final int EXIT_REASON_BUTTON = 3;
    private static final int MAX_ENTER_RETRY = 2;
    private static final int MULTITASK_WINDOWING_MODE = 100;
    private static final String PROXY = "com.vivo.smartmultiwindow.SystemServicesProxy";
    private static final String TAG = "Entry";
    private static final long VERIFY_POLL_MS = 500;
    private static final long VERIFY_WINDOW_MS = 3000;
    private static volatile Object controller;
    private static volatile Object coordinator;
    private static volatile ClassLoader moduleLoader;
    public static final DesktopEntry INSTANCE = new DesktopEntry();
    private static final AtomicBoolean installed = new AtomicBoolean(false);
    private static final AtomicLong lastEnter = new AtomicLong(0);
    private static final AtomicBoolean repairChecked = new AtomicBoolean(false);
    private static final Handler main = new Handler(Looper.getMainLooper());
    private static volatile String lastEntrySummary = "";
    public static final int $stable = 8;

    private DesktopEntry() {
    }

    private final boolean boolOf(Object obj, String str) {
        Object qf0Var;
        if (obj == null) {
            return false;
        }
        try {
            Object invoke = obj.getClass().getMethod(str, null).invoke(obj, null);
            Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
            qf0Var = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Object obj2 = Boolean.FALSE;
        if (qf0Var instanceof qf0) {
            qf0Var = obj2;
        }
        return ((Boolean) qf0Var).booleanValue();
    }

    private final void callEnter(Context context, ClassLoader classLoader, int i) {
        Object qf0Var;
        try {
            Class<?> findProxy = findProxy(classLoader, context.getClassLoader());
            findProxy.getMethod("enterVivoMultiTask", Integer.TYPE).invoke(findProxy.getMethod("getInstance", Context.class).invoke(null, context), Integer.valueOf(i));
            MLog.INSTANCE.i(TAG, "enterVivoMultiTask(" + i + ") 已调用");
            qf0Var = fs0.a;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, j2.h("enterVivoMultiTask(", i, ") 调用失败"), a);
        }
    }

    private final boolean ensureWorkbenchUi(Object obj, Context context) {
        Object qf0Var;
        Object leashOf;
        Object invoke;
        try {
            Object invoke2 = obj.getClass().getMethod("getVivoMultiTaskUiModel", null).invoke(obj, null);
            if (invoke2 != null && (leashOf = leashOf(obj)) != null && (invoke = obj.getClass().getMethod("getMultiRootTaskInfo", null).invoke(obj, null)) != null) {
                Object invoke3 = invoke2.getClass().getMethod("getVivoMultiTaskUiManager", null).invoke(invoke2, null);
                Object surfaceOf = invoke3 != null ? surfaceOf(invoke3) : null;
                if (invoke3 == null || surfaceOf == null) {
                    Object fieldOf = fieldOf(invoke, "configuration");
                    if (fieldOf == null) {
                        fieldOf = context.getResources().getConfiguration();
                    }
                    if (invoke3 == null) {
                        invoke2.getClass().getMethod("recoveryAppWindowUi", m2.g(), ActivityManager.RunningTaskInfo.class, Integer.TYPE).invoke(invoke2, leashOf, invoke, 8);
                        invoke3 = invoke2.getClass().getMethod("getVivoMultiTaskUiManager", null).invoke(invoke2, null);
                        surfaceOf = invoke3 != null ? surfaceOf(invoke3) : null;
                    }
                    if (invoke3 != null && surfaceOf == null) {
                        Object fieldOf2 = fieldOf(invoke3, "mContext");
                        Context context2 = fieldOf2 instanceof Context ? (Context) fieldOf2 : null;
                        if (context2 == null) {
                            context2 = context;
                        }
                        invoke3.getClass().getMethod("init", Context.class, Configuration.class, Boolean.TYPE).invoke(invoke3, context2, fieldOf, Boolean.TRUE);
                        surfaceOf = surfaceOf(invoke3);
                    }
                    boolean z = (invoke3 == null || surfaceOf == null) ? false : true;
                    MLog.INSTANCE.i(TAG, "工作台 UI 自检 manager=" + (invoke3 != null) + " surface=" + (surfaceOf != null) + " → " + (z ? "就绪" : "未就绪"));
                    r6 = z;
                } else {
                    r6 = true;
                }
            }
            qf0Var = Boolean.valueOf(r6);
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "工作台 UI 自检失败", a);
            qf0Var = Boolean.FALSE;
        }
        return ((Boolean) qf0Var).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enter(Context context, ClassLoader classLoader) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = lastEnter;
        long j = atomicLong.get();
        if (elapsedRealtime - j < 1200 || !atomicLong.compareAndSet(j, elapsedRealtime) || runOnShell$app(new s2(5, context, classLoader))) {
            return;
        }
        MLog.INSTANCE.w(TAG, "拿不到 shell 执行器，放弃本次进入（避免线程校验崩溃）");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 enter$lambda$27(Context context, ClassLoader classLoader) {
        Object qf0Var;
        fs0 fs0Var = fs0.a;
        try {
            INSTANCE.enterInner(context, classLoader);
            qf0Var = fs0Var;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            lastEnter.set(0L);
            MLog.INSTANCE.e(TAG, "进入流程异常", a);
        }
        return fs0Var;
    }

    private final void enterInner(Context context, ClassLoader classLoader) {
        Object qf0Var;
        Method method;
        Object resolveCoordinator = resolveCoordinator(classLoader);
        if (resolveCoordinator == null) {
            MLog.INSTANCE.w(TAG, "coordinator 不可得（构造器 hook 未命中且单例为空），放弃本次进入");
            return;
        }
        if (boolOf(resolveCoordinator, "isVivoMultiTaskActive")) {
            MLog.INSTANCE.i(TAG, "已在工作台 → 退出");
            try {
                Object obj = controller;
                qf0Var = (obj == null || (method = obj.getClass().getMethod("exitFromVivoMultiTask", Integer.TYPE)) == null) ? null : method.invoke(controller, Integer.valueOf(EXIT_REASON_BUTTON));
            } catch (Throwable th) {
                qf0Var = new qf0(th);
            }
            Throwable a = rf0.a(qf0Var);
            if (a != null) {
                MLog.INSTANCE.e(TAG, "退出工作台失败", a);
                return;
            }
            return;
        }
        if (!ensureLeash$app("enter")) {
            MLog.INSTANCE.w(TAG, "根任务 leash 不可用 → 放弃进入（避免 SystemUI 崩溃）");
            return;
        }
        if (!ensureWorkbenchUi(resolveCoordinator, context)) {
            MLog.INSTANCE.w(TAG, "工作台 UI 未就绪（mLeash 为空）→ 放弃进入（避免 SystemUI 崩溃）");
            return;
        }
        lastEntrySummary = "请求进入 way=8";
        MLog.INSTANCE.i(TAG, "leash 与 UI 均就绪，请求进入 way=8（启动器语义，用历史卡片）");
        callEnter(context, classLoader, 8);
        verifyEntered(context, classLoader, 1, 0L);
    }

    private final Object fieldOf(Object obj, String str) {
        Object qf0Var;
        if (obj == null) {
            return null;
        }
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            qf0Var = declaredField.get(obj);
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (qf0Var instanceof qf0) {
            return null;
        }
        return qf0Var;
    }

    private final Class<?> findProxy(ClassLoader classLoader, ClassLoader classLoader2) {
        Object qf0Var;
        try {
            qf0Var = Class.forName(PROXY, false, classLoader);
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (rf0.a(qf0Var) != null) {
            if (classLoader2 == null) {
                classLoader2 = ClassLoader.getSystemClassLoader();
            }
            qf0Var = Class.forName(PROXY, false, classLoader2);
        }
        qf0Var.getClass();
        return (Class) qf0Var;
    }

    private final void hookApplicationLifecycle(XposedModule xposedModule, final ClassLoader classLoader) {
        XposedInterface.HookHandle qf0Var;
        XposedInterface.HookHandle qf0Var2;
        final int i = 1;
        try {
            Method declaredMethod = Application.class.getDeclaredMethod("attach", Context.class);
            declaredMethod.setAccessible(true);
            final int i2 = 0;
            qf0Var = xposedModule.hook(declaredMethod).setId("fucwb_desktop_entry_attach").setExceptionMode(XposedInterface.ExceptionMode.DEFAULT).intercept(new XposedInterface.Hooker(this) { // from class: cj
                public final /* synthetic */ DesktopEntry b;

                {
                    this.b = this;
                }

                public final Object intercept(XposedInterface.Chain chain) {
                    Object hookApplicationLifecycle$lambda$15$lambda$14;
                    Object hookApplicationLifecycle$lambda$18$lambda$17;
                    int i3 = i2;
                    ClassLoader classLoader2 = classLoader;
                    DesktopEntry desktopEntry = this.b;
                    switch (i3) {
                        case 0:
                            hookApplicationLifecycle$lambda$15$lambda$14 = DesktopEntry.hookApplicationLifecycle$lambda$15$lambda$14(desktopEntry, classLoader2, chain);
                            return hookApplicationLifecycle$lambda$15$lambda$14;
                        default:
                            hookApplicationLifecycle$lambda$18$lambda$17 = DesktopEntry.hookApplicationLifecycle$lambda$18$lambda$17(desktopEntry, classLoader2, chain);
                            return hookApplicationLifecycle$lambda$18$lambda$17;
                    }
                }
            });
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "挂 Application.attach 失败", a);
        }
        try {
            Method declaredMethod2 = Instrumentation.class.getDeclaredMethod("callApplicationOnCreate", Application.class);
            declaredMethod2.setAccessible(true);
            qf0Var2 = xposedModule.hook(declaredMethod2).setId("fucwb_desktop_entry_create").setExceptionMode(XposedInterface.ExceptionMode.DEFAULT).intercept(new XposedInterface.Hooker(this) { // from class: cj
                public final /* synthetic */ DesktopEntry b;

                {
                    this.b = this;
                }

                public final Object intercept(XposedInterface.Chain chain) {
                    Object hookApplicationLifecycle$lambda$15$lambda$14;
                    Object hookApplicationLifecycle$lambda$18$lambda$17;
                    int i3 = i;
                    ClassLoader classLoader2 = classLoader;
                    DesktopEntry desktopEntry = this.b;
                    switch (i3) {
                        case 0:
                            hookApplicationLifecycle$lambda$15$lambda$14 = DesktopEntry.hookApplicationLifecycle$lambda$15$lambda$14(desktopEntry, classLoader2, chain);
                            return hookApplicationLifecycle$lambda$15$lambda$14;
                        default:
                            hookApplicationLifecycle$lambda$18$lambda$17 = DesktopEntry.hookApplicationLifecycle$lambda$18$lambda$17(desktopEntry, classLoader2, chain);
                            return hookApplicationLifecycle$lambda$18$lambda$17;
                    }
                }
            });
        } catch (Throwable th2) {
            qf0Var2 = new qf0(th2);
        }
        Throwable a2 = rf0.a(qf0Var2);
        if (a2 != null) {
            MLog.INSTANCE.e(TAG, "挂 callApplicationOnCreate 失败", a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object hookApplicationLifecycle$lambda$15$lambda$14(DesktopEntry desktopEntry, ClassLoader classLoader, XposedInterface.Chain chain) {
        chain.getClass();
        Object proceed = chain.proceed();
        Object thisObject = chain.getThisObject();
        desktopEntry.register(thisObject instanceof Application ? (Application) thisObject : null, classLoader);
        return proceed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object hookApplicationLifecycle$lambda$18$lambda$17(DesktopEntry desktopEntry, ClassLoader classLoader, XposedInterface.Chain chain) {
        chain.getClass();
        Object proceed = chain.proceed();
        List args = chain.getArgs();
        args.getClass();
        Object b0 = ac.b0(0, args);
        desktopEntry.register(b0 instanceof Application ? (Application) b0 : null, classLoader);
        return proceed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 install$lambda$5(XposedModule xposedModule, Class cls) {
        Object qf0Var;
        Constructor<?> constructor;
        fs0 fs0Var = fs0.a;
        xposedModule.getClass();
        cls.getClass();
        DesktopEntry desktopEntry = INSTANCE;
        try {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            declaredConstructors.getClass();
            int i = 1;
            if (declaredConstructors.length == 0) {
                constructor = null;
            } else {
                Constructor<?> constructor2 = declaredConstructors[0];
                int length = declaredConstructors.length - 1;
                if (length != 0) {
                    int parameterCount = constructor2.getParameterCount();
                    if (1 <= length) {
                        int i2 = 1;
                        while (true) {
                            Constructor<?> constructor3 = declaredConstructors[i2];
                            int parameterCount2 = constructor3.getParameterCount();
                            if (parameterCount < parameterCount2) {
                                constructor2 = constructor3;
                                parameterCount = parameterCount2;
                            }
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
                constructor = constructor2;
            }
            if (constructor != null) {
                constructor.setAccessible(true);
                xposedModule.hook(constructor).setId("fucwb_desktop_controller").intercept(new mb(i, desktopEntry));
            }
            qf0Var = fs0Var;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "挂 VivoMultiTaskController 失败", a);
        }
        return fs0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$5$lambda$3$lambda$2(DesktopEntry desktopEntry, XposedInterface.Chain chain) {
        Object qf0Var;
        chain.getClass();
        Object proceed = chain.proceed();
        Object thisObject = chain.getThisObject();
        controller = thisObject;
        try {
            qf0Var = thisObject.getClass().getMethod("getVivoMultiTaskHandler", null).invoke(thisObject, null);
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        coordinator = qf0Var instanceof qf0 ? null : qf0Var;
        MLog.INSTANCE.i(TAG, "VivoMultiTaskController 构造器命中，coordinator=" + (coordinator != null));
        return proceed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void install$lambda$9() {
        INSTANCE.runOnShellDelayed(0L, new hf(4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:40:0x000f, B:42:0x001b, B:5:0x0025, B:7:0x0031, B:11:0x003e, B:14:0x0047), top: B:39:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final fs0 install$lambda$9$lambda$8() {
        Method method;
        Object invoke;
        Object qf0Var;
        Method method2;
        DesktopEntry desktopEntry = INSTANCE;
        Object resolveCoordinator = desktopEntry.resolveCoordinator(moduleLoader);
        boolean z = false;
        if (resolveCoordinator != null) {
            try {
                method = resolveCoordinator.getClass().getMethod("getVivoMultiTaskUiModel", null);
            } catch (Throwable th) {
                qf0Var = new qf0(th);
            }
            if (method != null) {
                invoke = method.invoke(resolveCoordinator, null);
                Object invoke2 = (invoke != null || (method2 = invoke.getClass().getMethod("getVivoMultiTaskUiManager", null)) == null) ? null : method2.invoke(invoke, null);
                qf0Var = "uiManager=" + (invoke2 == null) + " surface=" + ((invoke2 != null ? desktopEntry.surfaceOf(invoke2) : null) == null);
                if (qf0Var instanceof qf0) {
                    qf0Var = "uiManager=?";
                }
                String str = (String) qf0Var;
                MLog mLog = MLog.INSTANCE;
                boolean z2 = resolveCoordinator == null;
                if (resolveCoordinator != null && INSTANCE.leashOf(resolveCoordinator) != null) {
                    z = true;
                }
                mLog.i(TAG, "启动自检 coordinator=" + z2 + " leash=" + z + " " + str);
                if (resolveCoordinator != null) {
                    INSTANCE.ensureLeash$app("startup");
                }
                return fs0.a;
            }
        }
        invoke = null;
        if (invoke != null) {
        }
        if (invoke2 == null) {
        }
        if ((invoke2 != null ? desktopEntry.surfaceOf(invoke2) : null) == null) {
        }
        qf0Var = "uiManager=" + (invoke2 == null) + " surface=" + ((invoke2 != null ? desktopEntry.surfaceOf(invoke2) : null) == null);
        if (qf0Var instanceof qf0) {
        }
        String str2 = (String) qf0Var;
        MLog mLog2 = MLog.INSTANCE;
        if (resolveCoordinator == null) {
        }
        if (resolveCoordinator != null) {
            z = true;
        }
        mLog2.i(TAG, "启动自检 coordinator=" + z2 + " leash=" + z + " " + str2);
        if (resolveCoordinator != null) {
        }
        return fs0.a;
    }

    private final Object leashOf(Object obj) {
        Object qf0Var;
        try {
            qf0Var = obj.getClass().getMethod("getMultiRootLeash", null).invoke(obj, null);
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (qf0Var instanceof qf0) {
            return null;
        }
        return qf0Var;
    }

    private final void register(Application application, final ClassLoader classLoader) {
        Object qf0Var;
        if (application == null || !installed.compareAndSet(false, true)) {
            return;
        }
        try {
            application.registerReceiver(new BroadcastReceiver() { // from class: com.vivo.cnm.lico.DesktopEntry$register$receiver$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    context.getClass();
                    intent.getClass();
                    if (lw.i(intent.getAction(), EntryActivity.ACTION_ENTER_WORKBENCH)) {
                        DesktopEntry.INSTANCE.enter(context, classLoader);
                    }
                }
            }, new IntentFilter("com.vivo.cnm.lico.action.ENTER_WORKBENCH"), MAX_ENTER_RETRY);
            registerStatusResponder(application);
            MLog.INSTANCE.i(TAG, "桌面入口广播已注册");
            qf0Var = fs0.a;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            installed.set(false);
            MLog.INSTANCE.e(TAG, "注册桌面入口广播失败", a);
        }
    }

    private final void registerCurrentApplication(ClassLoader classLoader) {
        try {
            Object invoke = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null).invoke(null, null);
            Object invoke2 = invoke.getClass().getMethod("getApplication", null).invoke(invoke, null);
            register(invoke2 instanceof Application ? (Application) invoke2 : null, classLoader);
        } catch (Throwable unused) {
        }
    }

    private final void registerStatusResponder(Application application) {
        Object qf0Var;
        try {
            qf0Var = application.registerReceiver(new BroadcastReceiver() { // from class: com.vivo.cnm.lico.DesktopEntry$registerStatusResponder$responder$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Object qf0Var2;
                    context.getClass();
                    intent.getClass();
                    if (lw.i(intent.getAction(), StatusProbe.ACTION_PING)) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("pid", Process.myPid());
                        bundle.putString("version", Build.DISPLAY);
                        try {
                            context.sendBroadcast(new Intent(StatusProbe.ACTION_STATUS).setPackage(BuildConfig.APPLICATION_ID).putExtra(StatusProbe.EXTRA_STATUS, bundle));
                            qf0Var2 = fs0.a;
                        } catch (Throwable th) {
                            qf0Var2 = new qf0(th);
                        }
                        Throwable a = rf0.a(qf0Var2);
                        if (a != null) {
                            MLog.INSTANCE.e("Entry", "回状态失败", a);
                        }
                        MLog.INSTANCE.i("Entry", "已回状态 pid=" + bundle.getInt("pid"));
                    }
                }
            }, new IntentFilter("com.vivo.cnm.lico.action.PING"), MAX_ENTER_RETRY);
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "注册状态应答器失败", a);
        }
    }

    private final boolean repairLeashIfNeeded(String str) {
        Object qf0Var;
        SurfaceControl surfaceControl;
        int i;
        Object qf0Var2;
        Object resolveCoordinator = resolveCoordinator(moduleLoader);
        if (resolveCoordinator != null) {
            if (leashOf(resolveCoordinator) != null) {
                return true;
            }
            if (repairChecked.compareAndSet(false, true) || !lw.i(str, "startup")) {
                try {
                    ActivityManager.RunningTaskInfo runningTaskInfo = null;
                    Object fieldOf = fieldOf(resolveCoordinator.getClass().getMethod("getTaskOrganizer", null).invoke(resolveCoordinator, null), "mTasks");
                    SparseArray sparseArray = fieldOf instanceof SparseArray ? (SparseArray) fieldOf : null;
                    if (sparseArray != null) {
                        ArrayList arrayList = new ArrayList();
                        int size = sparseArray.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                surfaceControl = null;
                                break;
                            }
                            Object valueAt = sparseArray.valueAt(i2);
                            if (valueAt != null) {
                                Object invoke = valueAt.getClass().getMethod("getTaskInfo", null).invoke(valueAt, null);
                                ActivityManager.RunningTaskInfo runningTaskInfo2 = invoke instanceof ActivityManager.RunningTaskInfo ? (ActivityManager.RunningTaskInfo) invoke : null;
                                if (runningTaskInfo2 == null) {
                                    continue;
                                } else {
                                    try {
                                        Object invoke2 = runningTaskInfo2.getClass().getMethod("getWindowingMode", null).invoke(runningTaskInfo2, null);
                                        qf0Var2 = invoke2 instanceof Integer ? (Integer) invoke2 : null;
                                    } catch (Throwable th) {
                                        qf0Var2 = new qf0(th);
                                    }
                                    boolean z = qf0Var2 instanceof qf0;
                                    Object obj = qf0Var2;
                                    if (z) {
                                        obj = null;
                                    }
                                    Integer num = (Integer) obj;
                                    if (num != null) {
                                        int intValue = num.intValue();
                                        arrayList.add(num);
                                        if (intValue == MULTITASK_WINDOWING_MODE) {
                                            Object invoke3 = valueAt.getClass().getMethod("getLeash", null).invoke(valueAt, null);
                                            surfaceControl = m2.v(invoke3) ? m2.e(invoke3) : null;
                                            runningTaskInfo = runningTaskInfo2;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i2++;
                        }
                        if (runningTaskInfo != null && surfaceControl != null) {
                            resolveCoordinator.getClass().getMethod("onTaskAppeared", ActivityManager.RunningTaskInfo.class, m2.g()).invoke(resolveCoordinator, runningTaskInfo, surfaceControl);
                            r3 = leashOf(resolveCoordinator) != null;
                            MLog mLog = MLog.INSTANCE;
                            i = runningTaskInfo.taskId;
                            mLog.i(TAG, "[" + str + "] 补 onTaskAppeared(taskId=" + i + ") → leash=" + (r3 ? "有效" : "仍为空"));
                        }
                        MLog.INSTANCE.w(TAG, "[" + str + "] 找不到工作台根任务：organizer 任务数=" + sparseArray.size() + " 窗口模式=" + arrayList);
                    }
                    qf0Var = Boolean.valueOf(r3);
                } catch (Throwable th2) {
                    qf0Var = new qf0(th2);
                }
                Throwable a = rf0.a(qf0Var);
                Object obj2 = qf0Var;
                if (a != null) {
                    MLog.INSTANCE.e(TAG, j2.j("[", str, "] 修复根任务 leash 失败"), a);
                    obj2 = Boolean.FALSE;
                }
                return ((Boolean) obj2).booleanValue();
            }
        }
        return false;
    }

    private final Object resolveCoordinator(ClassLoader classLoader) {
        Object qf0Var;
        Object qf0Var2;
        Object obj = coordinator;
        if (obj != null) {
            return obj;
        }
        if (classLoader == null && (classLoader = moduleLoader) == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        try {
            Class<?> cls = Class.forName(DRAG_MANAGER, false, classLoader);
            Object invoke = cls.getMethod("getInstance", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mMultiTaskCoordinator");
            declaredField.setAccessible(true);
            qf0Var = declaredField.get(invoke);
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (qf0Var instanceof qf0) {
            qf0Var = null;
        }
        if (qf0Var == null) {
            MLog.INSTANCE.w(TAG, "VivoMultiTaskDragEventManager 里还没有 coordinator");
            return null;
        }
        coordinator = qf0Var;
        try {
            qf0Var2 = qf0Var.getClass().getMethod("getVivoMultiTaskController", null).invoke(qf0Var, null);
        } catch (Throwable th2) {
            qf0Var2 = new qf0(th2);
        }
        controller = qf0Var2 instanceof qf0 ? null : qf0Var2;
        MLog.INSTANCE.i(TAG, "从 ROM 单例取到 coordinator=" + qf0Var.getClass().getSimpleName() + " controller=" + (controller != null));
        return qf0Var;
    }

    private final boolean runOnShellDelayed(long j, eq eqVar) {
        Object qf0Var;
        Object shellExecutor = shellExecutor();
        if (shellExecutor == null) {
            return false;
        }
        try {
            shellExecutor.getClass().getMethod("executeDelayed", Runnable.class, Long.TYPE).invoke(shellExecutor, new u2(eqVar, MAX_ENTER_RETRY), Long.valueOf(j));
            qf0Var = Boolean.TRUE;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "投递 shell 延迟任务失败", a);
            qf0Var = Boolean.FALSE;
        }
        return ((Boolean) qf0Var).booleanValue();
    }

    private final Object shellExecutor() {
        Object qf0Var;
        Method method;
        try {
            if (controller == null) {
                resolveCoordinator(moduleLoader);
            }
            Object obj = controller;
            qf0Var = (obj == null || (method = obj.getClass().getMethod("getRemoteCallExecutor", null)) == null) ? null : method.invoke(controller, null);
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (qf0Var instanceof qf0) {
            return null;
        }
        return qf0Var;
    }

    private final Object surfaceOf(Object obj) {
        Object qf0Var;
        try {
            qf0Var = obj.getClass().getMethod("getSurfaceControl", null).invoke(obj, null);
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (qf0Var instanceof qf0) {
            return null;
        }
        return qf0Var;
    }

    private final void verifyEntered(final Context context, final ClassLoader classLoader, final int i, final long j) {
        runOnShellDelayed(VERIFY_POLL_MS, new eq() { // from class: bj
            @Override // defpackage.eq
            public final Object b() {
                fs0 verifyEntered$lambda$37;
                verifyEntered$lambda$37 = DesktopEntry.verifyEntered$lambda$37(j, i, context, classLoader);
                return verifyEntered$lambda$37;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 verifyEntered$lambda$37(long j, int i, Context context, ClassLoader classLoader) {
        fs0 fs0Var = fs0.a;
        Object obj = coordinator;
        if (obj == null) {
            return fs0Var;
        }
        DesktopEntry desktopEntry = INSTANCE;
        boolean boolOf = desktopEntry.boolOf(obj, "isVivoMultiTaskActive");
        boolean boolOf2 = desktopEntry.boolOf(obj, "isInEnterPendingAnimation");
        boolean boolOf3 = desktopEntry.boolOf(obj, "isVivoMultiTaskVisible");
        boolean boolOf4 = desktopEntry.boolOf(obj, "isInPendingTransition");
        long j2 = VERIFY_POLL_MS + j;
        if (boolOf || boolOf2 || boolOf3 || boolOf4) {
            MLog.INSTANCE.i(TAG, "进入已生效/在途（+" + j2 + "ms）active=" + boolOf + " pending=" + boolOf2 + " visible=" + boolOf3 + " inFlight=" + boolOf4);
            lastEntrySummary = j2.h("已进入（重试 ", i + (-1), " 次）");
            return fs0Var;
        }
        if (j2 < VERIFY_WINDOW_MS) {
            desktopEntry.verifyEntered(context, classLoader, i, j2);
            return fs0Var;
        }
        if (i > MAX_ENTER_RETRY) {
            MLog.INSTANCE.w(TAG, "重试 2 次仍未进入，放弃（工作台历史为空？）");
            lastEntrySummary = "失败：重试 2 次仍未进入";
            return fs0Var;
        }
        MLog.INSTANCE.w(TAG, "进入未生效（可能被在途转场 abort）→ 重试 way=8 #" + i);
        desktopEntry.callEnter(context, classLoader, 8);
        desktopEntry.verifyEntered(context, classLoader, i + 1, 0L);
        return fs0Var;
    }

    public final boolean ensureLeash$app(String str) {
        str.getClass();
        Object resolveCoordinator = resolveCoordinator(moduleLoader);
        if (resolveCoordinator == null) {
            return false;
        }
        if (leashOf(resolveCoordinator) != null) {
            return true;
        }
        return repairLeashIfNeeded(str);
    }

    public final void install(XposedModule xposedModule, ClassLoader classLoader) {
        xposedModule.getClass();
        classLoader.getClass();
        moduleLoader = classLoader;
        ClassWatch.INSTANCE.watch(xposedModule, classLoader, CONTROLLER, new bd(13));
        registerCurrentApplication(classLoader);
        hookApplicationLifecycle(xposedModule, classLoader);
        main.postDelayed(new y2(1), 2500L);
    }

    public final boolean runOnShell$app(eq eqVar) {
        Object qf0Var;
        eqVar.getClass();
        Object shellExecutor = shellExecutor();
        if (shellExecutor == null) {
            return false;
        }
        try {
            shellExecutor.getClass().getMethod("execute", Runnable.class).invoke(shellExecutor, new u2(eqVar, EXIT_REASON_BUTTON));
            qf0Var = Boolean.TRUE;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "投递 shell 线程失败", a);
            qf0Var = Boolean.FALSE;
        }
        return ((Boolean) qf0Var).booleanValue();
    }
}
