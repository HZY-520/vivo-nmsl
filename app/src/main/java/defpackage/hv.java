package defpackage;

import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class hv extends y00 {
    @Override // defpackage.w00
    public final int U(c2 c2Var) {
        c10 c10Var = this.y.y.I.p;
        c10Var.getClass();
        ly lyVar = c10Var.j;
        fy fyVar = lyVar.c;
        jy jyVar = c10Var.u;
        if (fyVar == fy.f) {
            jyVar.c = true;
            if (jyVar.b) {
                lyVar.e = true;
                lyVar.f = true;
            }
        } else {
            jyVar.d = true;
        }
        hv hvVar = c10Var.i().f0;
        Boolean valueOf = hvVar != null ? Boolean.valueOf(hvVar.s) : null;
        hv hvVar2 = c10Var.i().f0;
        if (hvVar2 != null) {
            hvVar2.s = true;
        }
        c10Var.q();
        hv hvVar3 = c10Var.i().f0;
        if (hvVar3 != null) {
            hvVar3.s = valueOf != null ? valueOf.booleanValue() : false;
        }
        Integer num = (Integer) jyVar.f.get(c2Var);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.D.f(intValue, c2Var);
        return intValue;
    }

    @Override // defpackage.w10
    public final ec0 b(long j) {
        List f;
        R(j);
        d60 d60Var = this.y;
        t40 t = d60Var.y.t();
        Object[] objArr = t.e;
        int i = t.g;
        for (int i2 = 0; i2 < i; i2++) {
            c10 c10Var = ((iy) objArr[i2]).I.p;
            c10Var.getClass();
            c10Var.n = gy.g;
        }
        iy iyVar = d60Var.y;
        b20 b20Var = iyVar.z;
        c10 c10Var2 = iyVar.I.p;
        c10Var2.getClass();
        t40 t40Var = c10Var2.v;
        ly lyVar = c10Var2.j;
        lyVar.a.i();
        if (c10Var2.w) {
            iy iyVar2 = lyVar.a;
            t40 t2 = iyVar2.t();
            Object[] objArr2 = t2.e;
            int i3 = t2.g;
            for (int i4 = 0; i4 < i3; i4++) {
                iy iyVar3 = (iy) objArr2[i4];
                if (t40Var.g <= i4) {
                    c10 c10Var3 = iyVar3.I.p;
                    c10Var3.getClass();
                    t40Var.b(c10Var3);
                } else {
                    c10 c10Var4 = iyVar3.I.p;
                    c10Var4.getClass();
                    Object[] objArr3 = t40Var.e;
                    Object obj = objArr3[i4];
                    objArr3[i4] = c10Var4;
                }
            }
            t40Var.k(((q40) iyVar2.i()).e.g, t40Var.g);
            c10Var2.w = false;
            f = t40Var.f();
        } else {
            f = t40Var.f();
        }
        s0(b20Var.f(this, f, j));
        return this;
    }

    @Override // defpackage.y00
    public final void p0() {
        c10 c10Var = this.y.y.I.p;
        c10Var.getClass();
        c10Var.X();
    }
}
