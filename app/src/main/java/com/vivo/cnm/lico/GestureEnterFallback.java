package com.vivo.cnm.lico;

import android.content.Context;
import android.view.MotionEvent;
import com.vivo.cnm.lico.GestureEnterFallback;
import defpackage.bd;
import defpackage.eq;
import defpackage.fs0;
import defpackage.j2;
import defpackage.lw;
import defpackage.m20;
import defpackage.qf0;
import defpackage.rf0;
import defpackage.ur;
import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class GestureEnterFallback {
    private static final String HELPER = "com.android.wm.shell.vivomultitask.VivoMultiTaskGestureHelper";
    private static final String TAG = "Fallback";
    public static final GestureEnterFallback INSTANCE = new GestureEnterFallback();
    private static final AtomicInteger fired = new AtomicInteger(0);
    private static final AtomicInteger skipped = new AtomicInteger(0);
    public static final int $stable = 8;

    private GestureEnterFallback() {
    }

    private final boolean enterDirectly(Object obj, ClassLoader classLoader, int i) {
        Object qf0Var;
        try {
            Class<?> cls = Class.forName("com.vivo.smartmultiwindow.SystemServicesProxy", false, classLoader);
            cls.getMethod("enterVivoMultiTask", Integer.TYPE).invoke(cls.getMethod("getInstance", Context.class).invoke(null, obj), Integer.valueOf(i));
            qf0Var = Boolean.TRUE;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.w(TAG, "enterVivoMultiTask 调用失败：" + a);
            qf0Var = Boolean.FALSE;
        }
        return ((Boolean) qf0Var).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean fromLauncher(Object obj) {
        Object qf0Var;
        boolean z;
        Object obj2;
        Object qf0Var2;
        try {
            Field declaredField = obj.getClass().getDeclaredField("mEnterMultiTaskTarget");
            z = true;
            declaredField.setAccessible(true);
            obj2 = declaredField.get(obj);
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (obj2 != null) {
            try {
                qf0Var2 = obj2.getClass().getField("taskInfo").get(obj2);
            } catch (Throwable th2) {
                qf0Var2 = new qf0(th2);
            }
            if (rf0.a(qf0Var2) != null) {
                qf0Var2 = obj2.getClass().getMethod("getTaskInfo", null).invoke(obj2, null);
            }
            if (qf0Var2 != null) {
                Object invoke = qf0Var2.getClass().getMethod("getActivityType", null).invoke(qf0Var2, null);
                Integer num = invoke instanceof Integer ? (Integer) invoke : null;
                if (num != null && num.intValue() == 2) {
                    qf0Var = Boolean.valueOf(z);
                    Object obj3 = Boolean.FALSE;
                    if (qf0Var instanceof qf0) {
                        qf0Var = obj3;
                    }
                    return ((Boolean) qf0Var).booleanValue();
                }
                z = false;
                qf0Var = Boolean.valueOf(z);
                Object obj32 = Boolean.FALSE;
                if (qf0Var instanceof qf0) {
                }
                return ((Boolean) qf0Var).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 install$lambda$13(XposedModule xposedModule, Class cls) {
        Method method;
        fs0 fs0Var = fs0.a;
        xposedModule.getClass();
        cls.getClass();
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i];
                if (lw.i(method.getName(), "onSlideEnterUpOrCancel")) {
                    break;
                }
                i++;
            }
            if (method == null) {
                MLog.INSTANCE.w(TAG, "找不到 onSlideEnterUpOrCancel");
                return fs0Var;
            }
            Field declaredField = cls.getDeclaredField("mGestureEnterStarted");
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("mContext");
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mMultiTaskCoordinator");
            declaredField3.setAccessible(true);
            Field declaredField4 = cls.getDeclaredField("mTouchDownX");
            declaredField4.setAccessible(true);
            Field declaredField5 = cls.getDeclaredField("mTouchDownY");
            declaredField5.setAccessible(true);
            method.setAccessible(true);
            xposedModule.hook(method).setId("wb_enter_fallback").setExceptionMode(XposedInterface.ExceptionMode.DEFAULT).intercept(new ur(cls, declaredField, declaredField2, declaredField3, declaredField4, declaredField5));
            MLog.INSTANCE.i(TAG, "★ 已挂 onSlideEnterUpOrCancel 兜底（正常路径没进就自己进）");
            return fs0Var;
        } catch (Throwable th) {
            MLog.INSTANCE.e(TAG, "★ 安装失败", th);
            return fs0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object install$lambda$13$lambda$12(Class cls, Field field, Field field2, Field field3, Field field4, Field field5, XposedInterface.Chain chain) {
        Object qf0Var;
        Object qf0Var2;
        Object qf0Var3;
        Object qf0Var4;
        Object qf0Var5;
        int i;
        int i2;
        MotionEvent motionEvent;
        boolean z;
        chain.getClass();
        Object thisObject = chain.getThisObject();
        try {
            qf0Var = Boolean.valueOf(field.getBoolean(thisObject));
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Object obj = Boolean.FALSE;
        if (qf0Var instanceof qf0) {
            qf0Var = obj;
        }
        boolean booleanValue = ((Boolean) qf0Var).booleanValue();
        try {
            qf0Var2 = field2.get(thisObject);
        } catch (Throwable th2) {
            qf0Var2 = new qf0(th2);
        }
        if (qf0Var2 instanceof qf0) {
            qf0Var2 = null;
        }
        try {
            qf0Var3 = field3.get(thisObject);
        } catch (Throwable th3) {
            qf0Var3 = new qf0(th3);
        }
        if (qf0Var3 instanceof qf0) {
            qf0Var3 = null;
        }
        boolean z2 = true;
        boolean z3 = false;
        try {
            i = field4.getInt(thisObject);
            i2 = field5.getInt(thisObject);
            Object arg = chain.getArg(1);
            motionEvent = arg instanceof MotionEvent ? (MotionEvent) arg : null;
        } catch (Throwable th4) {
            qf0Var4 = new qf0(th4);
        }
        if (motionEvent != null && (i != 0 || i2 != 0)) {
            float x = i - motionEvent.getX();
            float y = i2 - motionEvent.getY();
            if (x > 0.0f && y > 0.0f && x + y > 150.0f) {
                z = true;
                qf0Var4 = Boolean.valueOf(z);
                Object obj2 = Boolean.FALSE;
                if (qf0Var4 instanceof qf0) {
                    qf0Var4 = obj2;
                }
                boolean booleanValue2 = ((Boolean) qf0Var4).booleanValue();
                Object proceed = chain.proceed();
                if (qf0Var3 != null) {
                    GestureEnterFallback gestureEnterFallback = INSTANCE;
                    try {
                        if (!gestureEnterFallback.invokeBool(qf0Var3, "isVivoMultiTaskActive") && !gestureEnterFallback.invokeBool(qf0Var3, "isVivoMultiTaskVisible") && !gestureEnterFallback.invokeBool(qf0Var3, "isInVivoMultiTaskMode")) {
                            z2 = false;
                        }
                        qf0Var5 = Boolean.valueOf(z2);
                    } catch (Throwable th5) {
                        qf0Var5 = new qf0(th5);
                    }
                    Object obj3 = Boolean.FALSE;
                    if (qf0Var5 instanceof qf0) {
                        qf0Var5 = obj3;
                    }
                    z3 = ((Boolean) qf0Var5).booleanValue();
                }
                if (!z3) {
                    MLog.INSTANCE.i(TAG, "★ 手势开始时已在工作台（退出/切换手势），兜底不介入");
                } else if ((booleanValue || booleanValue2) && qf0Var2 != null && qf0Var3 != null) {
                    if (!booleanValue) {
                        MLog.INSTANCE.i(TAG, "★ 引擎没接管但滑动方向明确（inward），也走兜底");
                    }
                    GestureEnterFallback gestureEnterFallback2 = INSTANCE;
                    thisObject.getClass();
                    gestureEnterFallback2.scheduleCheck(qf0Var2, qf0Var3, thisObject, cls.getClassLoader());
                }
                return proceed;
            }
        }
        z = false;
        qf0Var4 = Boolean.valueOf(z);
        Object obj22 = Boolean.FALSE;
        if (qf0Var4 instanceof qf0) {
        }
        boolean booleanValue22 = ((Boolean) qf0Var4).booleanValue();
        Object proceed2 = chain.proceed();
        if (qf0Var3 != null) {
        }
        if (!z3) {
        }
        return proceed2;
    }

    private final boolean invokeBool(Object obj, String str) {
        Object qf0Var;
        try {
            Method declaredMethod = obj.getClass().getDeclaredMethod(str, null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(obj, null);
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

    private final void scheduleCheck(final Object obj, final Object obj2, final Object obj3, final ClassLoader classLoader) {
        Thread thread = new Thread(new Runnable() { // from class: tr
            @Override // java.lang.Runnable
            public final void run() {
                GestureEnterFallback.scheduleCheck$lambda$16(obj2, obj3, obj, classLoader);
            }
        }, "wb-enter-fallback");
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleCheck$lambda$16(Object obj, Object obj2, final Object obj3, final ClassLoader classLoader) {
        try {
            Thread.sleep(400L);
        } catch (Throwable unused) {
        }
        GestureEnterFallback gestureEnterFallback = INSTANCE;
        boolean invokeBool = gestureEnterFallback.invokeBool(obj, "isVivoMultiTaskActive");
        boolean invokeBool2 = gestureEnterFallback.invokeBool(obj, "isInEnterPendingAnimation");
        boolean invokeBool3 = gestureEnterFallback.invokeBool(obj, "isVivoMultiTaskVisible");
        boolean invokeBool4 = gestureEnterFallback.invokeBool(obj, "isInPendingTransition");
        if (invokeBool || invokeBool2 || invokeBool3 || invokeBool4) {
            int incrementAndGet = skipped.incrementAndGet();
            if (incrementAndGet <= 5) {
                MLog.INSTANCE.i(TAG, "正常路径已进/在途（active=" + invokeBool + " pending=" + invokeBool2 + " visible=" + invokeBool3 + " inFlight=" + invokeBool4 + "），兜底不介入 (#" + incrementAndGet + ")");
                return;
            }
            return;
        }
        final int i = gestureEnterFallback.fromLauncher(obj2) ? 8 : 1;
        int incrementAndGet2 = fired.incrementAndGet();
        MLog mLog = MLog.INSTANCE;
        mLog.i(TAG, "★ 正常路径没进（active=" + invokeBool + " pending=" + invokeBool2 + "）→ 兜底 enterVivoMultiTask(" + i + ") (#" + incrementAndGet2 + ")");
        if (DesktopEntry.INSTANCE.runOnShell$app(new eq() { // from class: sr
            @Override // defpackage.eq
            public final Object b() {
                fs0 scheduleCheck$lambda$16$lambda$15;
                scheduleCheck$lambda$16$lambda$15 = GestureEnterFallback.scheduleCheck$lambda$16$lambda$15(obj3, classLoader, i);
                return scheduleCheck$lambda$16$lambda$15;
            }
        })) {
            return;
        }
        mLog.w(TAG, "★ 投递 shell 线程失败，放弃兜底");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 scheduleCheck$lambda$16$lambda$15(Object obj, ClassLoader classLoader, int i) {
        boolean ensureLeash$app = DesktopEntry.INSTANCE.ensureLeash$app("gesture");
        fs0 fs0Var = fs0.a;
        if (!ensureLeash$app) {
            MLog.INSTANCE.w(TAG, "★ 根任务 leash 不可用 → 放弃兜底（避免 SystemUI 崩溃）");
            return fs0Var;
        }
        boolean enterDirectly = INSTANCE.enterDirectly(obj, classLoader, i);
        MLog.INSTANCE.i(TAG, "★ 兜底调用结果 ok=" + enterDirectly);
        return fs0Var;
    }

    private final String sysProp(String str) {
        Object qf0Var;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            qf0Var = invoke instanceof String ? (String) invoke : null;
            if (qf0Var == null) {
                qf0Var = "";
            }
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        return (String) (qf0Var instanceof qf0 ? "" : qf0Var);
    }

    public final void install(XposedModule xposedModule, ClassLoader classLoader) {
        Object qf0Var;
        xposedModule.getClass();
        classLoader.getClass();
        try {
            qf0Var = sysProp("ro.vivo.device.type");
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (qf0Var instanceof qf0) {
            qf0Var = "";
        }
        String str = (String) qf0Var;
        Set m = m20.m("foldable", "flip", "tablet");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (!m.contains(lowerCase)) {
            ClassWatch.INSTANCE.watch(xposedModule, classLoader, HELPER, new bd(18));
            return;
        }
        MLog.INSTANCE.i(TAG, "设备是 " + str + "，不启用兜底");
    }

    public final String summary() {
        return j2.i("fallbackFired=", fired.get(), ", fallbackSkip=", skipped.get());
    }
}
