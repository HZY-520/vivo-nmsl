package com.vivo.cnm.lico;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import defpackage.ac;
import defpackage.fs0;
import defpackage.lw;
import defpackage.mb;
import defpackage.qf0;
import defpackage.rf0;
import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class LauncherEntryHook {
    public static final int $stable = 0;
    private static final String ACTION = "com.vivo.cnm.lico.action.ENTER_WORKBENCH";
    public static final LauncherEntryHook INSTANCE = new LauncherEntryHook();
    private static final String OWNER = "com.vivo.cnm.lico";
    private static final String SYSTEMUI = "com.android.systemui";
    private static final String TAG = "Launcher";

    private LauncherEntryHook() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$5$lambda$4(LauncherEntryHook launcherEntryHook, XposedInterface.Chain chain) {
        Object qf0Var;
        Object obj;
        chain.getClass();
        List args = chain.getArgs();
        args.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : args) {
            if (obj2 instanceof Intent) {
                arrayList.add(obj2);
            }
        }
        Intent intent = (Intent) ac.a0(arrayList);
        ComponentName component = intent != null ? intent.getComponent() : null;
        if (lw.i(component != null ? component.getPackageName() : null, "com.vivo.cnm.lico")) {
            String className = component.getClassName();
            className.getClass();
            if (className.endsWith("EntryActivity")) {
                List args2 = chain.getArgs();
                args2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : args2) {
                    if (obj3 instanceof Context) {
                        arrayList2.add(obj3);
                    }
                }
                Context context = (Context) ac.a0(arrayList2);
                MLog.INSTANCE.i(TAG, "拦截 " + intent.getComponent() + " 启动 → 直接发广播进工作台");
                if (context != null) {
                    try {
                        context.sendBroadcast(new Intent("com.vivo.cnm.lico.action.ENTER_WORKBENCH").setPackage("com.android.systemui"));
                        obj = fs0.a;
                    } catch (Throwable th) {
                        qf0Var = new qf0(th);
                    }
                } else {
                    obj = null;
                }
                qf0Var = obj;
                Throwable a = rf0.a(qf0Var);
                if (a != null) {
                    MLog.INSTANCE.e(TAG, "发送进入广播失败", a);
                }
                return null;
            }
        }
        return chain.proceed();
    }

    public final void install(XposedModule xposedModule, ClassLoader classLoader) {
        Object qf0Var;
        Method method;
        xposedModule.getClass();
        classLoader.getClass();
        try {
            int i = 0;
            Method[] declaredMethods = Class.forName("android.app.Instrumentation", false, classLoader).getDeclaredMethods();
            declaredMethods.getClass();
            int length = declaredMethods.length;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i];
                if (lw.i(method.getName(), "execStartActivity") && method.getParameterTypes().length == 7) {
                    break;
                } else {
                    i++;
                }
            }
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (method == null) {
            MLog.INSTANCE.w(TAG, "找不到 Instrumentation.execStartActivity，桌面图标仍走 Activity");
            return;
        }
        method.setAccessible(true);
        xposedModule.hook(method).setId("fucwb_launcher_entry").setExceptionMode(XposedInterface.ExceptionMode.DEFAULT).intercept(new mb(2, this));
        MLog.INSTANCE.i(TAG, "★ 桌面图标直通入口已挂（不再启动模块 Activity）");
        qf0Var = fs0.a;
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "挂桌面图标直通入口失败", a);
        }
    }
}
