package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class a8 extends t20 implements ay, il, sj0, yc0, w20, x90, ux, xr, z80 {
    public s20 s;

    @Override // defpackage.il
    public final void B(ky kyVar) {
        s20 s20Var = this.s;
        s20Var.getClass();
        kyVar.a();
    }

    @Override // defpackage.yc0
    public final boolean I() {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.ay
    public final v00 J(w00 w00Var, w10 w10Var, long j) {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.sj0
    public final void O(bk0 bk0Var) {
        s20 s20Var = this.s;
        s20Var.getClass();
        qj0 qj0Var = new qj0();
        int i = 0;
        qj0Var.g = false;
        ((w6) s20Var).a.invoke(qj0Var);
        bk0Var.getClass();
        qj0 qj0Var2 = (qj0) bk0Var;
        k40 k40Var = qj0Var2.e;
        if (qj0Var.g) {
            qj0Var2.g = true;
        }
        if (qj0Var.h) {
            qj0Var2.h = true;
        }
        k40 k40Var2 = qj0Var.e;
        Object[] objArr = k40Var2.b;
        Object[] objArr2 = k40Var2.c;
        long[] jArr = k40Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = i; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        ak0 ak0Var = (ak0) obj;
                        if (!k40Var.b(ak0Var)) {
                            k40Var.l(ak0Var, obj2);
                        } else if (obj2 instanceof p0) {
                            Object g = k40Var.g(ak0Var);
                            g.getClass();
                            p0 p0Var = (p0) g;
                            String str = p0Var.a;
                            if (str == null) {
                                str = ((p0) obj2).a;
                            }
                            br brVar = p0Var.b;
                            if (brVar == null) {
                                brVar = ((p0) obj2).b;
                            }
                            k40Var.l(ak0Var, new p0(str, brVar));
                        }
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            }
            i2++;
            i = 0;
        }
    }

    @Override // defpackage.yc0
    public final void P() {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.x90
    public final Object T(Object obj) {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.il
    public final void U() {
        lw.x(this);
    }

    @Override // defpackage.yc0
    public final boolean W() {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.w20
    public final b2 d() {
        return b2.H;
    }

    @Override // defpackage.t20
    public final void g0() {
        o0(true);
    }

    @Override // defpackage.t20
    public final void h0() {
        if (!this.r) {
            cv.b("unInitializeModifier called on unattached node");
        }
        if ((this.g & 8) != 0) {
            nh.b0(this).w();
        }
    }

    @Override // defpackage.xr
    public final void l(d60 d60Var) {
        this.s.getClass();
        throw new ClassCastException();
    }

    public final void o0(boolean z) {
        if (!this.r) {
            cv.b("initializeModifier called on unattached node");
        }
        if ((this.g & 4) != 0 && !z) {
            nh.Y(this, 2).I0();
        }
        if ((this.g & 2) != 0) {
            ro0 ro0Var = nh.a0(this).H.e;
            ro0Var.getClass();
            if (ro0Var.s) {
                d60 d60Var = this.l;
                d60Var.getClass();
                ((dy) d60Var).b1(this);
                y80 y80Var = d60Var.X;
                if (y80Var != null) {
                    ((hs) y80Var).c();
                }
            }
            if (!z) {
                nh.Y(this, 2).I0();
                nh.a0(this).y();
            }
        }
        if ((this.g & 8) != 0) {
            nh.b0(this).w();
        }
    }

    @Override // defpackage.z80
    public final boolean p() {
        return this.r;
    }

    public final void p0() {
        s20 s20Var = this.s;
        cv.b("onFocusEvent called on wrong node");
        s20Var.getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        return this.s.toString();
    }

    @Override // defpackage.yc0
    public final void x(rc0 rc0Var, sc0 sc0Var, long j) {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.ni, defpackage.yc0
    public final void a() {
    }

    @Override // defpackage.ux, defpackage.c20
    public final void b(long j) {
    }

    @Override // defpackage.ux
    public final void h(wx wxVar) {
    }
}
