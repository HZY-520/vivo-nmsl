package defpackage;

import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class iv extends d60 {
    public static final v4 g0;
    public final ro0 e0;
    public hv f0;

    static {
        v4 b = dx0.b();
        b.d(gc.c);
        b.a.setStrokeWidth(1.0f);
        b.f(1);
        g0 = b;
    }

    public iv(iy iyVar) {
        super(iyVar);
        ro0 ro0Var = new ro0();
        ro0Var.h = 0;
        this.e0 = ro0Var;
        ro0Var.l = this;
        this.f0 = iyVar.l != null ? new hv(this) : null;
    }

    @Override // defpackage.d60
    public final t20 A0() {
        return this.e0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // defpackage.d60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H0(c60 c60Var, long j, bt btVar, int i, boolean z) {
        int i2;
        boolean z2;
        iy iyVar = this.y;
        boolean z3 = false;
        if (c60Var.i(iyVar)) {
            if (a1(j)) {
                i2 = i;
                z2 = z;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(s0(j, z0())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
            }
            z3 = true;
            if (z3) {
                return;
            }
            int i3 = btVar.g;
            t40 s = iyVar.s();
            Object[] objArr = s.e;
            int i4 = s.g - 1;
            while (i4 >= 0) {
                iy iyVar2 = (iy) objArr[i4];
                if (iyVar2.C()) {
                    c60Var.f(iyVar2, j, btVar, i2, z2);
                    long a = btVar.a();
                    if (lr0.q(a) < 0.0f && lr0.A(a) && !lr0.z(a) && !c60Var.g(btVar, iyVar2)) {
                        break;
                    }
                }
                i4--;
                i2 = i;
            }
            btVar.g = i3;
            return;
        }
        i2 = i;
        z2 = z;
        if (z3) {
        }
    }

    @Override // defpackage.ec0
    public final void P(long j, float f, pq pqVar) {
        S0(j, f, pqVar);
        if (this.r) {
            return;
        }
        this.y.I.o.V();
    }

    @Override // defpackage.d60
    public final void R0(ma maVar, es esVar) {
        iy iyVar = this.y;
        e3 c0 = nh.c0(iyVar);
        t40 s = iyVar.s();
        Object[] objArr = s.e;
        int i = s.g;
        for (int i2 = 0; i2 < i; i2++) {
            iy iyVar2 = (iy) objArr[i2];
            if (iyVar2.C()) {
                iyVar2.g(maVar, esVar);
            }
        }
        if (c0.getShowLayoutBounds()) {
            long j = this.g;
            maVar.l(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, g0);
        }
    }

    @Override // defpackage.w00
    public final int U(c2 c2Var) {
        hv hvVar = this.f0;
        if (hvVar != null) {
            return hvVar.U(c2Var);
        }
        a20 a20Var = this.y.I.o;
        fy fyVar = a20Var.j.c;
        jy jyVar = a20Var.A;
        if (fyVar == fy.e) {
            jyVar.c = true;
            if (jyVar.b) {
                a20Var.y = true;
                a20Var.z = true;
            }
        } else {
            jyVar.d = true;
        }
        iv i = a20Var.i();
        boolean z = i.s;
        i.s = true;
        a20Var.q();
        i.s = z;
        Integer num = (Integer) jyVar.f.get(c2Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.w10
    public final ec0 b(long j) {
        List f;
        R(j);
        iy iyVar = this.y;
        t40 t = iyVar.t();
        Object[] objArr = t.e;
        int i = t.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((iy) objArr[i2]).I.o.p = gy.g;
        }
        b20 b20Var = iyVar.z;
        a20 a20Var = iyVar.I.o;
        t40 t40Var = a20Var.B;
        ly lyVar = a20Var.j;
        lyVar.a.W();
        if (a20Var.C) {
            iy iyVar2 = lyVar.a;
            t40 t2 = iyVar2.t();
            Object[] objArr2 = t2.e;
            int i3 = t2.g;
            for (int i4 = 0; i4 < i3; i4++) {
                iy iyVar3 = (iy) objArr2[i4];
                if (t40Var.g <= i4) {
                    t40Var.b(iyVar3.I.o);
                } else {
                    a20 a20Var2 = iyVar3.I.o;
                    Object[] objArr3 = t40Var.e;
                    Object obj = objArr3[i4];
                    objArr3[i4] = a20Var2;
                }
            }
            t40Var.k(((q40) iyVar2.i()).e.g, t40Var.g);
            a20Var.C = false;
            f = t40Var.f();
        } else {
            f = t40Var.f();
        }
        V0(b20Var.f(this, f, j));
        M0();
        return this;
    }

    @Override // defpackage.d60
    public final void v0() {
        if (this.f0 == null) {
            this.f0 = new hv(this);
        }
    }

    @Override // defpackage.d60
    public final y00 y0() {
        return this.f0;
    }
}
