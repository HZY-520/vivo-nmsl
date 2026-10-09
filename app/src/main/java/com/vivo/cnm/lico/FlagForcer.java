package com.vivo.cnm.lico;

import defpackage.fs0;
import defpackage.qf0;
import defpackage.rf0;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class FlagForcer {
    public static final int $stable = 0;
    public static final FlagForcer INSTANCE = new FlagForcer();
    private static final String TAG = "Flag";

    private FlagForcer() {
    }

    private final boolean write(Field field) {
        Object qf0Var;
        try {
            field.setBoolean(null, true);
        } catch (Throwable unused) {
        }
        if (field.getBoolean(null)) {
            return true;
        }
        try {
            Field declaredField = Field.class.getDeclaredField("modifiers");
            declaredField.setAccessible(true);
            declaredField.setInt(field, field.getModifiers() & (-17));
            qf0Var = fs0.a;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.w(TAG, "摘 final 修饰失败（继续尝试直接写）: " + a);
        }
        try {
            field.setBoolean(null, true);
        } catch (Throwable unused2) {
        }
        return field.getBoolean(null);
    }

    public final Boolean forceIfLoaded(ClassLoader classLoader, String str, String str2) {
        Object qf0Var;
        classLoader.getClass();
        str.getClass();
        str2.getClass();
        try {
            qf0Var = Class.forName(str, false, classLoader);
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (qf0Var instanceof qf0) {
            qf0Var = null;
        }
        Class<?> cls = (Class) qf0Var;
        if (cls == null) {
            return null;
        }
        return Boolean.valueOf(forceOn(cls, str2));
    }

    public final boolean forceOn(Class<?> cls, String str) {
        cls.getClass();
        str.getClass();
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            boolean z = declaredField.getBoolean(null);
            if (!z && !write(declaredField)) {
                MLog.e$default(MLog.INSTANCE, TAG, cls.getName() + "." + str + " 写入失败，仍为 " + declaredField.getBoolean(null), null, 4, null);
                return false;
            }
            boolean z2 = declaredField.getBoolean(null);
            MLog.INSTANCE.i(TAG, cls.getName() + "." + str + ": " + z + " -> " + z2);
            return z2;
        } catch (Throwable th) {
            MLog.INSTANCE.e(TAG, "强制 " + cls.getName() + "." + str + " 失败", th);
            return false;
        }
    }
}
