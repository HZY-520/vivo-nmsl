package com.vivo.cnm.lico;

import defpackage.j2;
import defpackage.lw;
import defpackage.qf0;
import defpackage.zm;
import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class EnterAngleRelaxer {
    private static final String TAG = "Angle";
    public static final EnterAngleRelaxer INSTANCE = new EnterAngleRelaxer();
    private static final AtomicInteger hitCount = new AtomicInteger(0);
    public static final int $stable = 8;

    private EnterAngleRelaxer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$8(Field field, Field field2, XposedInterface.Chain chain) {
        Object qf0Var;
        Object qf0Var2;
        chain.getClass();
        Object thisObject = chain.getThisObject();
        Object arg = chain.getArg(0);
        Integer num = arg instanceof Integer ? (Integer) arg : null;
        Object arg2 = chain.getArg(1);
        Integer num2 = arg2 instanceof Integer ? (Integer) arg2 : null;
        if (thisObject == null || num == null || num2 == null) {
            return chain.proceed();
        }
        try {
            int intValue = num.intValue();
            Object obj = field.get(thisObject);
            obj.getClass();
            qf0Var = Integer.valueOf(intValue - ((Integer) obj).intValue());
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (qf0Var instanceof qf0) {
            qf0Var = null;
        }
        Integer num3 = (Integer) qf0Var;
        try {
            int intValue2 = num2.intValue();
            Object obj2 = field2.get(thisObject);
            obj2.getClass();
            qf0Var2 = Integer.valueOf(intValue2 - ((Integer) obj2).intValue());
        } catch (Throwable th2) {
            qf0Var2 = new qf0(th2);
        }
        Integer num4 = (Integer) (qf0Var2 instanceof qf0 ? null : qf0Var2);
        if (num3 == null || num4 == null) {
            return chain.proceed();
        }
        if (num3.intValue() > 0 || num4.intValue() > 0 || (num3.intValue() >= 0 && num4.intValue() >= 0)) {
            return chain.proceed();
        }
        int incrementAndGet = hitCount.incrementAndGet();
        if (incrementAndGet <= 20) {
            MLog.INSTANCE.i(TAG, "★ 方向放宽放行 (#" + incrementAndGet + ") dx=" + num3 + " dy=" + num4 + "（原判定会拒绝）");
        }
        return Boolean.TRUE;
    }

    public final void install(XposedModule xposedModule, ClassLoader classLoader) {
        Object qf0Var;
        xposedModule.getClass();
        classLoader.getClass();
        int i = 0;
        try {
            try {
                qf0Var = Class.forName("com.android.wm.shell.vivomultitask.VivoMultiTaskGestureHelper", false, classLoader);
            } catch (Throwable th) {
                qf0Var = new qf0(th);
            }
            Method method = null;
            if (qf0Var instanceof qf0) {
                qf0Var = null;
            }
            Class cls = (Class) qf0Var;
            if (cls == null) {
                MLog.INSTANCE.w(TAG, "找不到 VivoMultiTaskGestureHelper");
                return;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Method method2 = declaredMethods[i2];
                if (lw.i(method2.getName(), "passedAngleForEnterMultiTask") && method2.getParameterCount() == 2) {
                    method = method2;
                    break;
                }
                i2++;
            }
            if (method == null) {
                MLog.INSTANCE.w(TAG, "找不到 passedAngleForEnterMultiTask(int,int)");
                return;
            }
            method.setAccessible(true);
            Field declaredField = cls.getDeclaredField("mTouchDownX");
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("mTouchDownY");
            declaredField2.setAccessible(true);
            xposedModule.hook(method).setId("wb_relax_enter_angle").setExceptionMode(XposedInterface.ExceptionMode.DEFAULT).intercept(new zm(declaredField, declaredField2, i));
            MLog.INSTANCE.i(TAG, "★ 已挂 passedAngleForEnterMultiTask 放宽（接受左上/正左/正上）");
        } catch (Throwable th2) {
            MLog.INSTANCE.e(TAG, "★ 放宽方向判定失败", th2);
        }
    }

    public final String summary() {
        return j2.g("angleRelaxHits=", hitCount.get());
    }
}
