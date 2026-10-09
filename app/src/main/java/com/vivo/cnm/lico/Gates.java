package com.vivo.cnm.lico;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import defpackage.ac;
import defpackage.bd;
import defpackage.fs0;
import defpackage.lw;
import defpackage.mr;
import defpackage.qf0;
import defpackage.rf0;
import defpackage.y2;
import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class Gates {
    public static final String FEATURE_KEY = "vivo.software.multitask";
    public static final int MAX_WINDOWS = 5;
    private static final long SETTINGS_DELAY_MS = 25000;
    private static final String TAG = "Gates";
    private static final int USER_ALL = -2;
    public static final String VERSION_OVERRIDE = "2.0";
    private static volatile ClassLoader srvClassLoader;
    public static final Gates INSTANCE = new Gates();
    private static final AtomicBoolean featureHookInstalled = new AtomicBoolean(false);
    private static final AtomicBoolean settingsFixed = new AtomicBoolean(false);
    private static final String[] SECURE_KEYS = {"vivo_multi_task_slide_enter_gesture", "vivo_multi_task_auto_top_bottom", "vivo_multi_task_realtime_active"};
    public static final int $stable = 8;

    private Gates() {
    }

    private final void ensureSettingsNow() {
        Object qf0Var;
        Context systemContext = systemContext();
        if (systemContext == null) {
            MLog.INSTANCE.w(TAG, "④ 拿不到 system context，跳过设置兜底");
            return;
        }
        ContentResolver contentResolver = systemContext.getContentResolver();
        for (String str : SECURE_KEYS) {
            contentResolver.getClass();
            int secureGetInt = secureGetInt(contentResolver, str);
            if (secureGetInt == 1) {
                MLog.INSTANCE.i(TAG, "④ " + str + " 已是 1");
            } else {
                try {
                    qf0Var = Boolean.valueOf(securePutInt(contentResolver, str, 1));
                } catch (Throwable th) {
                    qf0Var = new qf0(th);
                }
                Object obj = Boolean.FALSE;
                if (qf0Var instanceof qf0) {
                    qf0Var = obj;
                }
                boolean booleanValue = ((Boolean) qf0Var).booleanValue();
                MLog.INSTANCE.i(TAG, "④ " + str + ": " + secureGetInt + " -> " + secureGetInt(contentResolver, str) + " (put ok=" + booleanValue + ")");
            }
        }
    }

    private final boolean hookReturnTrue(XposedModule xposedModule, ClassLoader classLoader, String str, String str2) {
        Object qf0Var;
        Object qf0Var2;
        try {
            try {
                qf0Var = Class.forName(str, false, classLoader);
            } catch (Throwable th) {
                qf0Var = new qf0(th);
            }
            Method method = null;
            if (qf0Var instanceof qf0) {
                qf0Var = null;
            }
            Class cls = (Class) qf0Var;
            if (cls == null) {
                MLog.INSTANCE.w(TAG, "类不存在，跳过：" + str);
                return false;
            }
            try {
                qf0Var2 = cls.getDeclaredMethod(str2, null);
            } catch (Throwable th2) {
                qf0Var2 = new qf0(th2);
            }
            if (qf0Var2 instanceof qf0) {
                qf0Var2 = null;
            }
            Method method2 = (Method) qf0Var2;
            if (method2 == null) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                declaredMethods.getClass();
                int length = declaredMethods.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Method method3 = declaredMethods[i];
                    if (lw.i(method3.getName(), str2) && method3.getParameterCount() == 0) {
                        method = method3;
                        break;
                    }
                    i++;
                }
                method2 = method;
            }
            if (method2 == null) {
                MLog.INSTANCE.w(TAG, "方法不存在，跳过：" + str + "#" + str2);
                return false;
            }
            method2.setAccessible(true);
            xposedModule.hook(method2).setId("wb_gate_" + str + "#" + str2).setExceptionMode(XposedInterface.ExceptionMode.DEFAULT).intercept(new mr(3));
            MLog.INSTANCE.i(TAG, "③ 已挂 " + str + "#" + str2 + " -> true");
            return true;
        } catch (Throwable th3) {
            MLog.INSTANCE.e(TAG, "③ 挂 " + str + "#" + str2 + " 失败", th3);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object hookReturnTrue$lambda$8(XposedInterface.Chain chain) {
        chain.getClass();
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object hookSettingsDeviceType$lambda$29(XposedInterface.Chain chain) {
        chain.getClass();
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object installFeatureFlagHook$lambda$0(XposedInterface.Chain chain) {
        chain.getClass();
        List args = chain.getArgs();
        args.getClass();
        Object b0 = ac.b0(0, args);
        String str = b0 instanceof String ? (String) b0 : null;
        return (str == null || !str.startsWith(FEATURE_KEY)) ? chain.proceed() : Boolean.TRUE;
    }

    private final void installVersionAttributeHook(XposedModule xposedModule, ClassLoader classLoader) {
        try {
            Method declaredMethod = Class.forName("android.util.FtFeature", false, classLoader).getDeclaredMethod("getFeatureAttribute", String.class, String.class, String.class);
            declaredMethod.setAccessible(true);
            xposedModule.hook(declaredMethod).setId("wb_ft_feature_attribute").setExceptionMode(XposedInterface.ExceptionMode.DEFAULT).intercept(new mr(0));
            MLog.INSTANCE.i(TAG, "②b FtFeature.getFeatureAttribute 已挂（version -> 2.0）");
        } catch (Throwable th) {
            MLog.INSTANCE.w(TAG, "②b 挂 getFeatureAttribute 失败：" + th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object installVersionAttributeHook$lambda$1(XposedInterface.Chain chain) {
        chain.getClass();
        List args = chain.getArgs();
        args.getClass();
        Object b0 = ac.b0(0, args);
        String str = b0 instanceof String ? (String) b0 : null;
        List args2 = chain.getArgs();
        args2.getClass();
        Object b02 = ac.b0(1, args2);
        return (str != null && str.startsWith(FEATURE_KEY) && lw.i(b02 instanceof String ? (String) b02 : null, "version")) ? VERSION_OVERRIDE : chain.proceed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleSettingsEnsure$lambda$13() {
        Object qf0Var;
        try {
            Thread.sleep(SETTINGS_DELAY_MS);
        } catch (Throwable unused) {
        }
        try {
            INSTANCE.ensureSettingsNow();
            qf0Var = fs0.a;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "④ 设置兜底失败", a);
        }
        try {
            Thread.sleep(60000L);
        } catch (Throwable unused2) {
        }
    }

    private final int secureGetInt(ContentResolver contentResolver, String str) {
        Object qf0Var;
        Object qf0Var2;
        try {
            Class cls = Integer.TYPE;
            Object invoke = Settings.Secure.class.getMethod("getIntForUser", ContentResolver.class, String.class, cls, cls).invoke(null, contentResolver, str, r0, Integer.valueOf(USER_ALL));
            invoke.getClass();
            qf0Var = (Integer) invoke;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (rf0.a(qf0Var) != null) {
            try {
                qf0Var2 = Integer.valueOf(Settings.Secure.getInt(contentResolver, str, -1));
            } catch (Throwable th2) {
                qf0Var2 = new qf0(th2);
            }
            qf0Var = Integer.valueOf(((Number) (qf0Var2 instanceof qf0 ? -1 : qf0Var2)).intValue());
        }
        return ((Number) qf0Var).intValue();
    }

    private final boolean securePutInt(ContentResolver contentResolver, String str, int i) {
        Object qf0Var;
        Object qf0Var2;
        try {
            Class cls = Integer.TYPE;
            Object invoke = Settings.Secure.class.getMethod("putIntForUser", ContentResolver.class, String.class, cls, cls).invoke(null, contentResolver, str, Integer.valueOf(i), Integer.valueOf(USER_ALL));
            invoke.getClass();
            qf0Var = (Boolean) invoke;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (rf0.a(qf0Var) != null) {
            try {
                qf0Var2 = Boolean.valueOf(Settings.Secure.putInt(contentResolver, str, i));
            } catch (Throwable th2) {
                qf0Var2 = new qf0(th2);
            }
            Object obj = Boolean.FALSE;
            if (qf0Var2 instanceof qf0) {
                qf0Var2 = obj;
            }
            qf0Var = (Boolean) qf0Var2;
        }
        return ((Boolean) qf0Var).booleanValue();
    }

    private final boolean securePutString(ContentResolver contentResolver, String str, String str2) {
        Object qf0Var;
        Object qf0Var2;
        try {
            Object invoke = Settings.Secure.class.getMethod("putStringForUser", ContentResolver.class, String.class, String.class, Integer.TYPE).invoke(null, contentResolver, str, str2, Integer.valueOf(USER_ALL));
            invoke.getClass();
            qf0Var = (Boolean) invoke;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (rf0.a(qf0Var) != null) {
            try {
                qf0Var2 = Boolean.valueOf(Settings.Secure.putString(contentResolver, str, str2));
            } catch (Throwable th2) {
                qf0Var2 = new qf0(th2);
            }
            Object obj = Boolean.FALSE;
            if (qf0Var2 instanceof qf0) {
                qf0Var2 = obj;
            }
            qf0Var = (Boolean) qf0Var2;
        }
        return ((Boolean) qf0Var).booleanValue();
    }

    private final Context systemContext() {
        Object qf0Var;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("getSystemContext", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
            qf0Var = invoke instanceof Context ? (Context) invoke : null;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        return (Context) (qf0Var instanceof qf0 ? null : qf0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 watchManagerConstant$lambda$4(XposedModule xposedModule, Class cls) {
        xposedModule.getClass();
        cls.getClass();
        FlagForcer.INSTANCE.forceOn(cls, "SUPPORT_VIVO_MULTI_TASK");
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 watchStaticFlags$lambda$2(XposedModule xposedModule, Class cls) {
        xposedModule.getClass();
        cls.getClass();
        FlagForcer.INSTANCE.forceOn(cls, "SUPPORT_VIVO_MULTI_TASK");
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 watchStaticFlags$lambda$3(XposedModule xposedModule, Class cls) {
        xposedModule.getClass();
        cls.getClass();
        FlagForcer.INSTANCE.forceOn(cls, "SUPPORT_VIVO_MULTI_TASK");
        return fs0.a;
    }

    public final void forceManagerConstant(ClassLoader classLoader) {
        classLoader.getClass();
        FlagForcer.INSTANCE.forceIfLoaded(classLoader, "com.android.server.wm.VivoMultiTaskManagerService", "SUPPORT_VIVO_MULTI_TASK");
    }

    public final void forceStaticFlags(ClassLoader classLoader) {
        classLoader.getClass();
        FlagForcer flagForcer = FlagForcer.INSTANCE;
        flagForcer.forceIfLoaded(classLoader, "com.vivo.multitask.VivoMultiTaskConstants", "SUPPORT_VIVO_MULTI_TASK");
        flagForcer.forceIfLoaded(classLoader, "android.util.VivoFreeformUtil", "SUPPORT_VIVO_MULTI_TASK");
    }

    public final void hookSettingsDeviceType(XposedModule xposedModule, ClassLoader classLoader) {
        Object qf0Var;
        xposedModule.getClass();
        classLoader.getClass();
        int i = 0;
        try {
            try {
                qf0Var = Class.forName("com.vivo.settings.utils.DeviceUtils", false, classLoader);
            } catch (Throwable th) {
                qf0Var = new qf0(th);
            }
            Method method = null;
            if (qf0Var instanceof qf0) {
                qf0Var = null;
            }
            Class cls = (Class) qf0Var;
            if (cls == null) {
                MLog.INSTANCE.w(TAG, "②c 找不到 com.vivo.settings.utils.DeviceUtils");
                return;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            int length = declaredMethods.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method2 = declaredMethods[i];
                if (lw.i(method2.getName(), "isFoldable") && method2.getParameterCount() == 0) {
                    method = method2;
                    break;
                }
                i++;
            }
            if (method == null) {
                MLog.INSTANCE.w(TAG, "②c 找不到 DeviceUtils.isFoldable()");
                return;
            }
            method.setAccessible(true);
            xposedModule.hook(method).setId("wb_settings_is_foldable").setExceptionMode(XposedInterface.ExceptionMode.DEFAULT).intercept(new mr(1));
            MLog.INSTANCE.i(TAG, "②c 已挂 DeviceUtils.isFoldable() -> true（让「折叠屏专区」显示）");
        } catch (Throwable th2) {
            MLog.INSTANCE.e(TAG, "②c 挂 DeviceUtils.isFoldable 失败", th2);
        }
    }

    public final void installCore(XposedModule xposedModule, ClassLoader classLoader) {
        xposedModule.getClass();
        classLoader.getClass();
        installFeatureFlagHook(xposedModule, classLoader);
        forceStaticFlags(classLoader);
        watchStaticFlags(xposedModule, classLoader);
    }

    public final void installFeatureFlagHook(XposedModule xposedModule, ClassLoader classLoader) {
        xposedModule.getClass();
        classLoader.getClass();
        if (featureHookInstalled.compareAndSet(false, true)) {
            try {
                Method declaredMethod = Class.forName("android.util.FtFeature", false, classLoader).getDeclaredMethod("isFeatureSupport", String.class);
                declaredMethod.setAccessible(true);
                xposedModule.hook(declaredMethod).setId("wb_ft_feature_support").setPriority(50).setExceptionMode(XposedInterface.ExceptionMode.DEFAULT).intercept(new mr(2)).getClass();
            } catch (Throwable th) {
                featureHookInstalled.set(false);
                MLog.INSTANCE.e(TAG, "① 挂 FtFeature.isFeatureSupport 失败", th);
            }
            installVersionAttributeHook(xposedModule, classLoader);
        }
    }

    public final void installRuntimeGates(XposedModule xposedModule, ClassLoader classLoader) {
        xposedModule.getClass();
        classLoader.getClass();
        srvClassLoader = classLoader;
        hookReturnTrue(xposedModule, classLoader, "com.android.server.wm.VivoMultiTaskManagerService", "isSupportVivoMultiTask");
        hookReturnTrue(xposedModule, classLoader, "com.android.server.wm.ActivityTaskManagerService", "isSupportVivoMultiTask");
    }

    public final void installSystemServer(XposedModule xposedModule, ClassLoader classLoader) {
        xposedModule.getClass();
        classLoader.getClass();
        srvClassLoader = classLoader;
        forceManagerConstant(classLoader);
        watchManagerConstant(xposedModule, classLoader);
        installRuntimeGates(xposedModule, classLoader);
        scheduleSettingsEnsure();
    }

    public final void installUi(XposedModule xposedModule, ClassLoader classLoader) {
        xposedModule.getClass();
        classLoader.getClass();
        EnterAngleRelaxer.INSTANCE.install(xposedModule, classLoader);
        FoldStateForcer.INSTANCE.install(xposedModule, classLoader);
        GestureEnterFallback.INSTANCE.install(xposedModule, classLoader);
        PhoneLayoutHook.INSTANCE.install(xposedModule, classLoader);
    }

    public final void scheduleSettingsEnsure() {
        if (settingsFixed.compareAndSet(false, true)) {
            Thread thread = new Thread(new y2(2), "wb-settings");
            thread.setDaemon(true);
            thread.start();
            MLog.INSTANCE.i(TAG, "④ 设置兜底已排程（延迟 25000ms）");
        }
    }

    public final void watchManagerConstant(XposedModule xposedModule, ClassLoader classLoader) {
        xposedModule.getClass();
        classLoader.getClass();
        ClassWatch.INSTANCE.watch(xposedModule, classLoader, "com.android.server.wm.VivoMultiTaskManagerService", new bd(15));
    }

    public final void watchStaticFlags(XposedModule xposedModule, ClassLoader classLoader) {
        xposedModule.getClass();
        classLoader.getClass();
        ClassWatch classWatch = ClassWatch.INSTANCE;
        classWatch.watch(xposedModule, classLoader, "com.vivo.multitask.VivoMultiTaskConstants", new bd(16));
        classWatch.watch(xposedModule, classLoader, "android.util.VivoFreeformUtil", new bd(17));
    }
}
