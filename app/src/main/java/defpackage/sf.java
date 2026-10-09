package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class sf extends tf {
    public final bg0 e;
    public final bg0 f;
    public final float[] g;

    public sf(bg0 bg0Var, bg0 bg0Var2) {
        super(bg0Var2, bg0Var, bg0Var2, null);
        float[] A;
        this.e = bg0Var;
        this.f = bg0Var2;
        float[] fArr = z1.c.b;
        qu0 qu0Var = bg0Var.d;
        float[] fArr2 = bg0Var.i;
        qu0 qu0Var2 = bg0Var2.d;
        float[] fArr3 = bg0Var2.j;
        if (dx0.l(qu0Var, qu0Var2)) {
            A = dx0.A(fArr3, fArr2);
        } else {
            float[] a = qu0Var.a();
            float[] a2 = qu0Var2.a();
            qu0 qu0Var3 = lr0.i;
            A = dx0.A(dx0.l(qu0Var2, qu0Var3) ? fArr3 : dx0.w(dx0.A(dx0.j(fArr, a2, new float[]{0.964212f, 1.0f, 0.825188f}), bg0Var2.i)), dx0.l(qu0Var, qu0Var3) ? fArr2 : dx0.A(dx0.j(fArr, a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = A;
    }

    @Override // defpackage.tf
    public final long a(long j) {
        float g = gc.g(j);
        float f = gc.f(j);
        float d = gc.d(j);
        float c = gc.c(j);
        xf0 xf0Var = this.e.p;
        float b = (float) xf0Var.b(g);
        float b2 = (float) xf0Var.b(f);
        float b3 = (float) xf0Var.b(d);
        float[] fArr = this.g;
        float f2 = (fArr[6] * b3) + (fArr[3] * b2) + (fArr[0] * b);
        float f3 = (fArr[7] * b3) + (fArr[4] * b2) + (fArr[1] * b);
        float f4 = (fArr[8] * b3) + (fArr[5] * b2) + (fArr[2] * b);
        bg0 bg0Var = this.f;
        xf0 xf0Var2 = bg0Var.m;
        return lw.b((float) xf0Var2.b(f2), (float) xf0Var2.b(f3), (float) xf0Var2.b(f4), c, bg0Var);
    }
}
