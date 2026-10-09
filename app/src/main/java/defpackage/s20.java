package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public interface s20 extends u20 {
    @Override // defpackage.u20
    default Object a(tq tqVar, Object obj) {
        return tqVar.invoke(obj, this);
    }

    @Override // defpackage.u20
    default boolean b(pq pqVar) {
        return ((Boolean) pqVar.invoke(this)).booleanValue();
    }
}
