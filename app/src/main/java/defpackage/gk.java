package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class gk implements pq {
    public final /* synthetic */ ve0 e;
    public final /* synthetic */ hk f;
    public final /* synthetic */ t3 g;

    public gk(ve0 ve0Var, hk hkVar, t3 t3Var) {
        this.e = ve0Var;
        this.f = hkVar;
        this.g = t3Var;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        dr0 dr0Var = (dr0) obj;
        hk hkVar = (hk) dr0Var;
        if (!((e4) nh.b0(this.f).m33getDragAndDropManager()).b.contains(hkVar) || !q3.n(hkVar, nh.z(this.g))) {
            return cr0.e;
        }
        this.e.e = dr0Var;
        return cr0.g;
    }
}
