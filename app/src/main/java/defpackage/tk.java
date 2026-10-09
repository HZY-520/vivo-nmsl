package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class tk implements pq {
    public final /* synthetic */ float e;
    public final /* synthetic */ re0 f;

    public /* synthetic */ tk(float f, re0 re0Var) {
        this.e = f;
        this.f = re0Var;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        boolean z;
        re0 re0Var;
        cl clVar = (cl) obj;
        boolean i = lw.i(clVar.X(), "waiting");
        boolean z2 = false;
        if (clVar.e() != null) {
            q80 e = clVar.e();
            e.getClass();
            int i2 = el.a;
            q80 q80Var = q80.f;
            float f = this.e;
            if (e != q80Var ? !(f <= 30.0f || f > 90.0f) : f <= 30.0f) {
                z = true;
                re0Var = this.f;
                if (!re0Var.e || (i && z)) {
                    z2 = true;
                }
                re0Var.e = z2;
                return Boolean.valueOf(!z2);
            }
        }
        z = false;
        re0Var = this.f;
        if (!re0Var.e) {
        }
        z2 = true;
        re0Var.e = z2;
        return Boolean.valueOf(!z2);
    }
}
