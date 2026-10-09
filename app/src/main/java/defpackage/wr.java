package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class wr implements pq {
    public final /* synthetic */ int e;
    public final /* synthetic */ pq f;

    public /* synthetic */ wr(pq pqVar, int i) {
        this.e = i;
        this.f = pqVar;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        int i = this.e;
        pq pqVar = this.f;
        switch (i) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                if (dr0Var instanceof vr) {
                    return Boolean.valueOf(((Boolean) pqVar.invoke(((vr) dr0Var).s)).booleanValue());
                }
                z6.m("Node is not a GestureNode instance");
                return null;
            case 1:
                ql0 ql0Var = (ql0) pqVar.invoke((vl0) obj);
                synchronized (xl0.c) {
                    xl0.d = xl0.d.e(ql0Var.g());
                }
                return ql0Var;
            default:
                Long l = (Long) obj;
                l.getClass();
                return pqVar.invoke(l);
        }
    }
}
