package com.vivo.cnm.lico;

import com.vivo.cnm.lico.FoldStateForcer;
import defpackage.dp;
import defpackage.fs0;
import defpackage.j2;
import defpackage.kw;
import defpackage.ln0;
import defpackage.lw;
import defpackage.qf0;
import defpackage.rf0;
import defpackage.zm;
import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class FoldStateForcer {
    private static final String COORDINATOR = "com.android.wm.shell.vivomultitask.VivoMultiTaskCoordinator";
    private static final String TAG = "Fold";
    public static final FoldStateForcer INSTANCE = new FoldStateForcer();
    private static final AtomicInteger getFoldHits = new AtomicInteger(0);
    private static final AtomicInteger stateHits = new AtomicInteger(0);
    public static final int $stable = 8;

    private FoldStateForcer() {
    }

    private final Class<?> findDeviceStateListener(Class<?> cls, ClassLoader classLoader) {
        Class<?> cls2;
        Object qf0Var;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        declaredClasses.getClass();
        int length = declaredClasses.length;
        int i = 0;
        loop0: while (true) {
            if (i >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i];
            Method[] declaredMethods = cls2.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (lw.i(method.getName(), "onDeviceStateChanged")) {
                    break loop0;
                }
            }
            i++;
        }
        if (cls2 != null) {
            return cls2;
        }
        for (int i2 = 1; i2 < 31; i2++) {
            try {
                qf0Var = Class.forName(cls.getName() + "$" + i2, false, classLoader);
            } catch (Throwable th) {
                qf0Var = new qf0(th);
            }
            if (qf0Var instanceof qf0) {
                qf0Var = null;
            }
            Class<?> cls3 = (Class) qf0Var;
            if (cls3 != null) {
                Method[] declaredMethods2 = cls3.getDeclaredMethods();
                declaredMethods2.getClass();
                for (Method method2 : declaredMethods2) {
                    if (lw.i(method2.getName(), "onDeviceStateChanged")) {
                        return cls3;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 install$lambda$18(ClassLoader classLoader, XposedModule xposedModule, Class cls) {
        Object qf0Var;
        Method method;
        MLog mLog;
        Method method2;
        xposedModule.getClass();
        cls.getClass();
        try {
            try {
                qf0Var = cls.getDeclaredField("mIsFolded");
            } catch (Throwable th) {
                qf0Var = new qf0(th);
            }
            Method method3 = null;
            if (qf0Var instanceof qf0) {
                qf0Var = null;
            }
            final Field field = (Field) qf0Var;
            final int i = 1;
            if (field != null) {
                field.setAccessible(true);
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            int length = declaredMethods.length;
            final int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i3];
                if (lw.i(method.getName(), "getFoldState") && method.getParameterCount() == 0) {
                    break;
                }
                i3++;
            }
            if (method != null) {
                method.setAccessible(true);
                xposedModule.hook(method).setId("wb_fold_state_false").setExceptionMode(XposedInterface.ExceptionMode.DEFAULT).intercept(new XposedInterface.Hooker() { // from class: ep
                    public final Object intercept(XposedInterface.Chain chain) {
                        Object install$lambda$18$lambda$4;
                        Object install$lambda$18$lambda$13;
                        Object install$lambda$18$lambda$17;
                        int i4 = i2;
                        Field field2 = field;
                        switch (i4) {
                            case 0:
                                install$lambda$18$lambda$4 = FoldStateForcer.install$lambda$18$lambda$4(field2, chain);
                                return install$lambda$18$lambda$4;
                            case 1:
                                install$lambda$18$lambda$13 = FoldStateForcer.install$lambda$18$lambda$13(field2, chain);
                                return install$lambda$18$lambda$13;
                            default:
                                install$lambda$18$lambda$17 = FoldStateForcer.install$lambda$18$lambda$17(field2, chain);
                                return install$lambda$18$lambda$17;
                        }
                    }
                });
                mLog = MLog.INSTANCE;
                mLog.i(TAG, "★ 已挂 getFoldState() -> false");
            } else {
                mLog = MLog.INSTANCE;
                mLog.w(TAG, "找不到 getFoldState()");
            }
            Class<?> findDeviceStateListener = INSTANCE.findDeviceStateListener(cls, classLoader);
            if (findDeviceStateListener == null || field == null) {
                mLog.w(TAG, "找不到 DeviceStateListener（inner=" + (findDeviceStateListener != null ? findDeviceStateListener.getName() : null) + " field=" + (field != null) + "）");
            } else {
                Method[] declaredMethods2 = findDeviceStateListener.getDeclaredMethods();
                declaredMethods2.getClass();
                int length2 = declaredMethods2.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        method2 = null;
                        break;
                    }
                    method2 = declaredMethods2[i4];
                    if (lw.i(method2.getName(), "onDeviceStateChanged")) {
                        break;
                    }
                    i4++;
                }
                if (method2 != null) {
                    method2.setAccessible(true);
                    Field[] declaredFields = findDeviceStateListener.getDeclaredFields();
                    declaredFields.getClass();
                    for (Field field2 : declaredFields) {
                        if (lw.i(field2.getType(), cls)) {
                            field2.setAccessible(true);
                            xposedModule.hook(method2).setId("wb_fold_state_force_field").setExceptionMode(XposedInterface.ExceptionMode.DEFAULT).intercept(new zm(field2, field, i));
                            MLog.INSTANCE.i(TAG, "已挂 " + findDeviceStateListener.getName() + "#onDeviceStateChanged（仅直板机屏蔽折叠分支）");
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
            if (field != null) {
                Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                declaredConstructors.getClass();
                int i5 = 0;
                while (true) {
                    if (!(i5 < declaredConstructors.length)) {
                        break;
                    }
                    int i6 = i5 + 1;
                    try {
                        xposedModule.hook(declaredConstructors[i5]).setId("wb_fold_constructor_field").intercept(new XposedInterface.Hooker() { // from class: ep
                            public final Object intercept(XposedInterface.Chain chain) {
                                Object install$lambda$18$lambda$4;
                                Object install$lambda$18$lambda$13;
                                Object install$lambda$18$lambda$17;
                                int i42 = i;
                                Field field22 = field;
                                switch (i42) {
                                    case 0:
                                        install$lambda$18$lambda$4 = FoldStateForcer.install$lambda$18$lambda$4(field22, chain);
                                        return install$lambda$18$lambda$4;
                                    case 1:
                                        install$lambda$18$lambda$13 = FoldStateForcer.install$lambda$18$lambda$13(field22, chain);
                                        return install$lambda$18$lambda$13;
                                    default:
                                        install$lambda$18$lambda$17 = FoldStateForcer.install$lambda$18$lambda$17(field22, chain);
                                        return install$lambda$18$lambda$17;
                                }
                            }
                        });
                        i5 = i6;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw new NoSuchElementException(e.getMessage());
                    }
                }
                Method[] declaredMethods3 = cls.getDeclaredMethods();
                declaredMethods3.getClass();
                int length3 = declaredMethods3.length;
                while (true) {
                    if (i2 >= length3) {
                        break;
                    }
                    Method method4 = declaredMethods3[i2];
                    if (lw.i(method4.getName(), "onDisplayConfigurationChanged")) {
                        method3 = method4;
                        break;
                    }
                    i2++;
                }
                if (method3 != null) {
                    final int i7 = 2;
                    xposedModule.hook(method3).setId("wb_fold_display_field").intercept(new XposedInterface.Hooker() { // from class: ep
                        public final Object intercept(XposedInterface.Chain chain) {
                            Object install$lambda$18$lambda$4;
                            Object install$lambda$18$lambda$13;
                            Object install$lambda$18$lambda$17;
                            int i42 = i7;
                            Field field22 = field;
                            switch (i42) {
                                case 0:
                                    install$lambda$18$lambda$4 = FoldStateForcer.install$lambda$18$lambda$4(field22, chain);
                                    return install$lambda$18$lambda$4;
                                case 1:
                                    install$lambda$18$lambda$13 = FoldStateForcer.install$lambda$18$lambda$13(field22, chain);
                                    return install$lambda$18$lambda$13;
                                default:
                                    install$lambda$18$lambda$17 = FoldStateForcer.install$lambda$18$lambda$17(field22, chain);
                                    return install$lambda$18$lambda$17;
                            }
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            MLog.INSTANCE.e(TAG, "★ 强制展开失败", th2);
        }
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$18$lambda$10(Field field, Field field2, XposedInterface.Chain chain) {
        Object qf0Var;
        chain.getClass();
        try {
            field2.setBoolean(field.get(chain.getThisObject()), false);
            qf0Var = fs0.a;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "折叠回调外部字段写入失败", a);
        }
        if (qf0Var instanceof qf0) {
            return chain.proceed();
        }
        int incrementAndGet = stateHits.incrementAndGet();
        if (incrementAndGet <= 5) {
            MLog.INSTANCE.i(TAG, "直板机 DeviceStateListener 保持 mIsFolded=false (#" + incrementAndGet + ")");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$18$lambda$13(Field field, XposedInterface.Chain chain) {
        Object qf0Var;
        chain.getClass();
        Object proceed = chain.proceed();
        try {
            field.setBoolean(chain.getThisObject(), false);
            qf0Var = fs0.a;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "初始化展开字段失败", a);
        }
        return proceed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$18$lambda$17(Field field, XposedInterface.Chain chain) {
        Object qf0Var;
        chain.getClass();
        try {
            field.setBoolean(chain.getThisObject(), false);
            qf0Var = fs0.a;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "显示配置展开字段失败", a);
        }
        return chain.proceed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$18$lambda$4(Field field, XposedInterface.Chain chain) {
        chain.getClass();
        if (field != null) {
            try {
                field.setBoolean(chain.getThisObject(), false);
            } catch (Throwable unused) {
            }
        }
        int incrementAndGet = getFoldHits.incrementAndGet();
        if (incrementAndGet <= 5) {
            MLog.INSTANCE.i(TAG, "★ getFoldState() -> false (#" + incrementAndGet + ")");
        }
        return Boolean.FALSE;
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
        xposedModule.getClass();
        classLoader.getClass();
        String sysProp = sysProp("ro.vivo.device.type");
        List<String> C = kw.C("fold", "flip", "tablet", "pad");
        int i = 0;
        if (!C.isEmpty()) {
            for (String str : C) {
                String lowerCase = sysProp.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (ln0.D(lowerCase, str, false)) {
                    MLog.INSTANCE.i(TAG, "设备是 " + sysProp + "，保留原折叠语义，不强制展开");
                    return;
                }
            }
        }
        MLog.INSTANCE.i(TAG, "设备类型 '" + sysProp + "' 非折叠 ⇒ 强制 getFoldState()=false");
        ClassWatch.INSTANCE.watch(xposedModule, classLoader, COORDINATOR, new dp(classLoader, i));
    }

    public final String summary() {
        return j2.i("foldGet=", getFoldHits.get(), ", foldSet=", stateHits.get());
    }
}
