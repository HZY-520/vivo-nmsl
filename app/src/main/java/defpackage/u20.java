package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public interface u20 {
    Object a(tq tqVar, Object obj);

    boolean b(pq pqVar);

    default u20 c(u20 u20Var) {
        return u20Var == r20.a ? this : new dd(this, u20Var);
    }
}
