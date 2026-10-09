package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class z7 extends t20 implements il, q60, sj0 {
    public long s;
    public tk0 t;
    public long u;
    public xx v;
    public v10 w;
    public tk0 x;
    public v10 y;

    @Override // defpackage.il
    public final void B(ky kyVar) {
        v10 v10Var;
        ky kyVar2;
        c5 c5Var;
        ky kyVar3 = kyVar;
        oa oaVar = kyVar3.e;
        if (this.t != lw.q) {
            nn nnVar = nn.o;
            int i = 3;
            if (hl0.a(oaVar.u(), this.u) && kyVar3.getLayoutDirection() == this.v && lw.i(this.x, this.t)) {
                v10Var = this.w;
                v10Var.getClass();
            } else {
                m20.h(this, new s2(i, this, kyVar3));
                v10Var = this.y;
                this.y = null;
            }
            this.w = v10Var;
            this.u = oaVar.u();
            this.v = kyVar3.getLayoutDirection();
            this.x = this.t;
            v10Var.getClass();
            if (!as0.a(this.s, gc.f)) {
                long j = this.s;
                if (v10Var instanceof t80) {
                    oe0 oe0Var = ((t80) v10Var).b;
                    float f = oe0Var.a;
                    float f2 = oe0Var.b;
                    long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                    float f3 = oe0Var.c - oe0Var.a;
                    float f4 = oe0Var.d - oe0Var.b;
                    kyVar2 = kyVar;
                    kyVar2.s(j, floatToRawIntBits, (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), nnVar, 3);
                } else {
                    kyVar2 = kyVar3;
                    if (v10Var instanceof u80) {
                        u80 u80Var = (u80) v10Var;
                        c5Var = u80Var.c;
                        if (c5Var == null) {
                            ng0 ng0Var = u80Var.b;
                            float f5 = ng0Var.b;
                            float f6 = ng0Var.a;
                            float intBitsToFloat = Float.intBitsToFloat((int) (ng0Var.h >> 32));
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
                            float f7 = ng0Var.c - f6;
                            float f8 = ng0Var.d - f5;
                            long floatToRawIntBits3 = (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L);
                            long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                            int i2 = (int) (floatToRawIntBits2 >> 32);
                            int i3 = (int) (floatToRawIntBits2 & 4294967295L);
                            oaVar.e.c.h(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (floatToRawIntBits3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (floatToRawIntBits3 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (floatToRawIntBits4 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits4 & 4294967295L)), oa.a(oaVar, j, nnVar, 3));
                        }
                    } else {
                        if (!(v10Var instanceof s80)) {
                            z6.j();
                            return;
                        }
                        c5Var = ((s80) v10Var).b;
                    }
                    kyVar2.c(c5Var, j, nnVar);
                }
                kyVar2.a();
            }
        } else if (!as0.a(this.s, gc.f)) {
            jl.w(kyVar, this.s, 0L, 126);
            kyVar3 = kyVar;
        }
        kyVar2 = kyVar3;
        kyVar2.a();
    }

    @Override // defpackage.sj0
    public final void O(bk0 bk0Var) {
        zj0.b(bk0Var, this.t);
    }

    @Override // defpackage.sj0
    public final boolean c() {
        return false;
    }

    @Override // defpackage.q60
    public final void z() {
        this.u = 9205357640488583168L;
        this.v = null;
        this.w = null;
        this.x = null;
        lw.x(this);
    }
}
