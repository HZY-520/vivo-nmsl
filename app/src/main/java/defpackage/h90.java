package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class h90 {
    public v4 a;
    public l8 b;
    public float c = 1.0f;
    public xx d = xx.e;

    public abstract void a(float f);

    public abstract void b(l8 l8Var);

    public final void c(jl jlVar, long j, float f, l8 l8Var) {
        if (this.c != f) {
            a(f);
            this.c = f;
        }
        if (!lw.i(this.b, l8Var)) {
            b(l8Var);
            this.b = l8Var;
        }
        xx layoutDirection = jlVar.getLayoutDirection();
        if (this.d != layoutDirection) {
            this.d = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (jlVar.u() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (jlVar.u() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((t3) jlVar.t().a).q(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    e(jlVar);
                }
            } finally {
                ((t3) jlVar.t().a).q(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract long d();

    public abstract void e(jl jlVar);
}
