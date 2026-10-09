package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ao0 implements tq {
    public final /* synthetic */ u20 e;
    public final /* synthetic */ tk0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ b40 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ eq k;
    public final /* synthetic */ float l;
    public final /* synthetic */ be m;

    public ao0(u20 u20Var, tk0 tk0Var, long j, float f, b40 b40Var, boolean z, eq eqVar, float f2, be beVar) {
        this.e = u20Var;
        this.f = tk0Var;
        this.g = j;
        this.h = f;
        this.i = b40Var;
        this.j = z;
        this.k = eqVar;
        this.l = f2;
        this.m = beVar;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        se seVar = (se) obj;
        int intValue = ((Number) obj2).intValue();
        gr grVar = (gr) seVar;
        if (grVar.I(intValue & 1, (intValue & 3) != 2)) {
            kt ktVar = jw.a;
            u20 c = t10.g(bo0.b(this.e.c(p20.a), this.f, bo0.c(this.g, this.h, grVar), ((si) grVar.i(kf.h)).o(this.l)), this.i, gg0.a(), this.j, this.k).c(new jb(new l0(10, (byte) 0)));
            b20 c2 = t8.c(b2.f, true);
            int hashCode = Long.hashCode(grVar.Q);
            xa0 k = grVar.k();
            u20 z = dx0.z(grVar, c);
            le.c.getClass();
            grVar.R();
            if (grVar.P) {
                grVar.j();
            } else {
                grVar.b0();
            }
            t30.t(grVar, b2.x, c2);
            t30.t(grVar, b2.w, k);
            bd bdVar = b2.y;
            if (grVar.P || !lw.i(grVar.G(), Integer.valueOf(hashCode))) {
                grVar.Y(Integer.valueOf(hashCode));
                grVar.b(bdVar, Integer.valueOf(hashCode));
            }
            t30.t(grVar, b2.v, z);
            this.m.invoke(grVar, 0);
            grVar.o(true);
        } else {
            grVar.L();
        }
        return fs0.a;
    }
}
