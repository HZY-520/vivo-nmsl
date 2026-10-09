package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class we0 {
    public static final xe0 a;

    static {
        xe0 xe0Var = null;
        try {
            xe0Var = (xe0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (xe0Var == null) {
            xe0Var = new xe0();
        }
        a = xe0Var;
    }

    public static lb a(Class cls) {
        a.getClass();
        return new lb(cls);
    }
}
