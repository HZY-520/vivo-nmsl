package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class j90 extends t20 implements ay, il {
    public h90 s;
    public boolean t;
    public j8 u;
    public i2 v;
    public float w;
    public l8 x;

    public static boolean o0(long j) {
        return !hl0.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean p0(long j) {
        return !hl0.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.il
    public final void B(ky kyVar) {
        oa oaVar = kyVar.e;
        long d = this.s.d();
        long floatToRawIntBits = (Float.floatToRawIntBits(p0(d) ? Float.intBitsToFloat((int) (d >> 32)) : Float.intBitsToFloat((int) (oaVar.u() >> 32))) << 32) | (Float.floatToRawIntBits(o0(d) ? Float.intBitsToFloat((int) (d & 4294967295L)) : Float.intBitsToFloat((int) (oaVar.u() & 4294967295L))) & 4294967295L);
        long A = (Float.intBitsToFloat((int) (oaVar.u() >> 32)) == 0.0f || Float.intBitsToFloat((int) (oaVar.u() & 4294967295L)) == 0.0f) ? 0L : t30.A(floatToRawIntBits, this.v.j(floatToRawIntBits, oaVar.u()));
        long a = this.u.a((Math.round(Float.intBitsToFloat((int) (A >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (A & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (oaVar.u() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (oaVar.u() & 4294967295L))) & 4294967295L), kyVar.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & 4294967295L);
        ((t3) oaVar.f.a).B(f, f2);
        try {
            this.s.c(kyVar, A, this.w, this.x);
            ((t3) oaVar.f.a).B(-f, -f2);
            kyVar.a();
        } catch (Throwable th) {
            ((t3) oaVar.f.a).B(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.ay
    public final v00 J(w00 w00Var, w10 w10Var, long j) {
        long a;
        boolean z = false;
        boolean z2 = wf.d(j) && wf.c(j);
        if (wf.f(j) && wf.e(j)) {
            z = true;
        }
        if (((!this.t || this.s.d() == 9205357640488583168L) && z2) || z) {
            a = wf.a(j, wf.h(j), 0, wf.g(j), 0, 10);
        } else {
            long d = this.s.d();
            int round = p0(d) ? Math.round(Float.intBitsToFloat((int) (d >> 32))) : wf.j(j);
            int round2 = o0(d) ? Math.round(Float.intBitsToFloat((int) (d & 4294967295L))) : wf.i(j);
            long floatToRawIntBits = (Float.floatToRawIntBits(xf.f(j, round)) << 32) | (Float.floatToRawIntBits(xf.e(j, round2)) & 4294967295L);
            if (this.t && this.s.d() != 9205357640488583168L) {
                float intBitsToFloat = !p0(this.s.d()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.s.d() >> 32));
                float intBitsToFloat2 = !o0(this.s.d()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.s.d() & 4294967295L));
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : t30.A(floatToRawIntBits2, this.v.j(floatToRawIntBits2, floatToRawIntBits));
            }
            a = wf.a(j, xf.f(j, Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)))), 0, xf.e(j, Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)))), 0, 10);
        }
        ec0 b = w10Var.b(a);
        return w00Var.l0(b.e, b.f, vm.e, new z2(b, 2));
    }

    @Override // defpackage.t20
    public final boolean d0() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.s + ", sizeToIntrinsics=" + this.t + ", alignment=" + this.u + ", alpha=" + this.w + ", colorFilter=" + this.x + ")";
    }
}
