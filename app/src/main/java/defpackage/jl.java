package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public interface jl extends si {
    static void E(jl jlVar, s4 s4Var, long j, long j2, float f, l8 l8Var, int i, int i2) {
        jlVar.C(s4Var, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, l8Var, (i2 & 512) != 0 ? 1 : i);
    }

    static void G(jl jlVar, long j, float f) {
        jlVar.j(f, j, jlVar.H());
    }

    static void Z(jl jlVar, c5 c5Var, dx0 dx0Var, float f, tn0 tn0Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        t10 t10Var = tn0Var;
        if ((i & 8) != 0) {
            t10Var = nn.o;
        }
        jlVar.r(c5Var, dx0Var, f2, t10Var, (i & 32) != 0 ? 3 : 0);
    }

    static void w(jl jlVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            float intBitsToFloat = Float.intBitsToFloat((int) (jlVar.u() >> 32)) - Float.intBitsToFloat((int) (0 >> 32));
            j2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r13 & 4294967295L)) - Float.intBitsToFloat((int) (0 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        }
        jlVar.s(j, 0L, j2, nn.o, (i & 64) != 0 ? 3 : 0);
    }

    void C(s4 s4Var, long j, long j2, long j3, float f, l8 l8Var, int i);

    default long H() {
        return t30.k(t().s());
    }

    xx getLayoutDirection();

    void j(float f, long j, long j2);

    void r(c5 c5Var, dx0 dx0Var, float f, t10 t10Var, int i);

    void s(long j, long j2, long j3, t10 t10Var, int i);

    v6 t();

    default long u() {
        return t().s();
    }
}
