package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class e60 {
    public static final g40 a;

    static {
        g40 g40Var = n60.a;
        a = new g40();
    }

    public static final void a(t20 t20Var, int i, int i2) {
        if (!(t20Var instanceof oi)) {
            b(t20Var, i & t20Var.g, i2);
            return;
        }
        oi oiVar = (oi) t20Var;
        int i3 = oiVar.s;
        b(t20Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (t20 t20Var2 = oiVar.t; t20Var2 != null; t20Var2 = t20Var2.j) {
            a(t20Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(t20 t20Var, int i, int i2) {
        if (i2 != 0 || t20Var.d0()) {
            if ((i & 2) != 0 && (t20Var instanceof ay)) {
                kw.x((ay) t20Var);
                if (i2 == 2) {
                    nh.Y(t20Var, 2).O0();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                nh.a0(t20Var).y();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                nh.a0(t20Var).M(false);
            }
            if ((i & 256) != 0 && (t20Var instanceof xr)) {
                if (i2 == 1) {
                    iy a0 = nh.a0(t20Var);
                    a0.S(a0.O + 1);
                } else if (i2 == 2) {
                    nh.a0(t20Var).S(r0.O - 1);
                }
                if (i2 != 2) {
                    iy a02 = nh.a0(t20Var);
                    if (a02.O != 0 && !a02.j() && !a02.k() && !a02.N) {
                        e3 c0 = nh.c0(a02);
                        p2 p2Var = c0.T.e;
                        if (a02.O > 0) {
                            ((t40) p2Var.f).b(a02);
                            a02.N = true;
                        }
                        c0.C(null);
                    }
                }
            }
            if ((i & 4) != 0 && (t20Var instanceof il)) {
                lw.x((il) t20Var);
            }
            if ((i & 8) != 0 && (t20Var instanceof sj0)) {
                nh.a0(t20Var).u = true;
            }
            if ((i & 64) != 0 && (t20Var instanceof x90)) {
                ly lyVar = nh.a0((x90) t20Var).I;
                lyVar.o.t = true;
                c10 c10Var = lyVar.p;
                if (c10Var != null) {
                    c10Var.z = true;
                }
            }
            if ((i & 2048) != 0 && (t20Var instanceof a8)) {
                s20 s20Var = ((a8) t20Var).s;
                cv.b("applyFocusProperties called on wrong node");
                s20Var.getClass();
                z6.c();
                return;
            }
            if ((i & 4096) != 0 && (t20Var instanceof a8)) {
                a8 a8Var = (a8) t20Var;
                po poVar = ((uo) nh.b0(a8Var).getFocusOwner()).d;
                if (poVar.d.a(a8Var)) {
                    poVar.a();
                }
            }
            if ((i & 2097152) != 0 && (t20Var instanceof wu) && i2 == 2) {
                ((wu) t20Var).q();
            }
        }
    }

    public static final void c(t20 t20Var) {
        if (!t20Var.r) {
            cv.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(t20Var, -1, 0);
    }

    public static final int d(t20 t20Var) {
        int i = t20Var.g;
        if (i != 0) {
            return i;
        }
        Class<?> cls = t20Var.getClass();
        g40 g40Var = a;
        int c = g40Var.c(cls);
        if (c >= 0) {
            return g40Var.c[c];
        }
        int i2 = t20Var instanceof ay ? 3 : 1;
        if (t20Var instanceof il) {
            i2 |= 4;
        }
        if (t20Var instanceof sj0) {
            i2 |= 8;
        }
        if (t20Var instanceof yc0) {
            i2 |= 16;
        }
        if (t20Var instanceof w20) {
            i2 |= 32;
        }
        if (t20Var instanceof x90) {
            i2 |= 64;
        }
        if (t20Var instanceof ux) {
            i2 |= 4194432;
        } else if (t20Var instanceof c20) {
            i2 |= 128;
        }
        if (t20Var instanceof xr) {
            i2 |= 256;
        }
        if (t20Var instanceof yo) {
            i2 |= 1024;
        }
        boolean z = t20Var instanceof a8;
        if (z) {
            i2 |= 2048;
        }
        if (z) {
            i2 |= 4096;
        }
        if (t20Var instanceof nx) {
            i2 |= 8192;
        }
        if (t20Var instanceof a3) {
            i2 |= 16384;
        }
        if (t20Var instanceof df) {
            i2 |= 32768;
        }
        if (t20Var instanceof dr0) {
            i2 |= 262144;
        }
        if (t20Var instanceof x8) {
            i2 |= 524288;
        }
        if (t20Var instanceof yo) {
            i2 |= 1048576;
        }
        if (t20Var instanceof wu) {
            i2 |= 2097152;
        }
        g40Var.f(i2, cls);
        return i2;
    }

    public static final int e(t20 t20Var) {
        if (!(t20Var instanceof oi)) {
            return d(t20Var);
        }
        oi oiVar = (oi) t20Var;
        int i = oiVar.s;
        for (t20 t20Var2 = oiVar.t; t20Var2 != null; t20Var2 = t20Var2.j) {
            i |= e(t20Var2);
        }
        return i;
    }

    public static final boolean f(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
