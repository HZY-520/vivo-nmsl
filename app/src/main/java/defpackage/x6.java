package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public interface x6 {
    void a(int i, Object obj);

    void b(Object obj);

    void c();

    void d(int i, Object obj);

    void e(int i, int i2, int i3);

    Object f();

    void g(int i, int i2);

    default void h(tq tqVar, Object obj) {
        tqVar.invoke(f(), obj);
    }

    void i();
}
