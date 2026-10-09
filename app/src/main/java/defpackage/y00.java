package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class y00 extends w00 implements w10 {
    public LinkedHashMap A;
    public v00 C;
    public final g40 D;
    public final d60 y;
    public long z = 0;
    public final z00 B = new z00(this);

    public y00(d60 d60Var) {
        this.y = d60Var;
        g40 g40Var = n60.a;
        this.D = new g40();
    }

    @Override // defpackage.ec0
    public final void P(long j, float f, pq pqVar) {
        q0(j);
        if (this.r) {
            return;
        }
        p0();
    }

    @Override // defpackage.w00
    public final w00 Y() {
        d60 d60Var = this.y.z;
        if (d60Var != null) {
            return d60Var.y0();
        }
        return null;
    }

    @Override // defpackage.w00
    public final wx b0() {
        return this.B;
    }

    @Override // defpackage.w00
    public final boolean c0() {
        return this.C != null;
    }

    @Override // defpackage.w00
    public final iy d0() {
        return this.y.y;
    }

    @Override // defpackage.ec0, defpackage.w10
    public final Object e() {
        return this.y.e();
    }

    @Override // defpackage.w00
    public final v00 e0() {
        v00 v00Var = this.C;
        if (v00Var != null) {
            return v00Var;
        }
        throw j2.f("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.w00
    public final w00 f0() {
        d60 d60Var = this.y.A;
        if (d60Var != null) {
            return d60Var.y0();
        }
        return null;
    }

    @Override // defpackage.si
    public final float g() {
        return this.y.g();
    }

    @Override // defpackage.w00
    public final long g0() {
        return this.z;
    }

    @Override // defpackage.w00
    public final xx getLayoutDirection() {
        return this.y.y.B;
    }

    @Override // defpackage.w00
    public final boolean j0() {
        return true;
    }

    @Override // defpackage.si
    public final float k() {
        return this.y.k();
    }

    @Override // defpackage.w00
    public final void n0() {
        P(this.z, 0.0f, null);
    }

    public void p0() {
        e0().e();
    }

    public final void q0(long j) {
        if (!xv.a(this.z, j)) {
            this.z = j;
            d60 d60Var = this.y;
            c10 c10Var = d60Var.y.I.p;
            if (c10Var != null) {
                c10Var.W();
            }
            w00.i0(d60Var);
        }
        if (this.s) {
            return;
        }
        W(e0());
    }

    public final long r0(y00 y00Var, boolean z) {
        long j = 0;
        while (!this.equals(y00Var)) {
            if (!this.p || !z) {
                j = xv.c(j, this.z);
            }
            d60 d60Var = this.y.A;
            d60Var.getClass();
            this = d60Var.y0();
            this.getClass();
        }
        return j;
    }

    public final void s0(v00 v00Var) {
        LinkedHashMap linkedHashMap;
        if (v00Var != null) {
            Q((v00Var.b() & 4294967295L) | (v00Var.d() << 32));
        } else {
            Q(0L);
        }
        if (!lw.i(this.C, v00Var) && v00Var != null && ((((linkedHashMap = this.A) != null && !linkedHashMap.isEmpty()) || !v00Var.a().isEmpty()) && !lw.i(v00Var.a(), this.A))) {
            c10 c10Var = this.y.y.I.p;
            c10Var.getClass();
            c10Var.u.f();
            LinkedHashMap linkedHashMap2 = this.A;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.A = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(v00Var.a());
        }
        this.C = v00Var;
    }
}
