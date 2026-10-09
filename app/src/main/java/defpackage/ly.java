package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ly {
    public final iy a;
    public boolean b;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public c10 p;
    public fy c = fy.i;
    public final a20 o = new a20(this);

    public ly(iy iyVar) {
        this.a = iyVar;
    }

    public final d60 a() {
        return this.a.H.d;
    }

    public final void b() {
        fy fyVar = this.a.I.c;
        fy fyVar2 = fy.g;
        fy fyVar3 = fy.h;
        if (fyVar == fyVar2 || fyVar == fyVar3) {
            if (this.o.D) {
                g(true);
            } else {
                f(true);
            }
        }
        if (fyVar == fyVar3) {
            c10 c10Var = this.p;
            if (c10Var == null || !c10Var.x) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        c10 c10Var = this.p;
        if (c10Var != null) {
            ly lyVar = c10Var.j;
            lyVar.c = fy.f;
            iy iyVar = lyVar.a;
            lyVar.d = false;
            c10Var.B = j;
            a90 snapshotObserver = nh.c0(iyVar).getSnapshotObserver();
            a10 a10Var = c10Var.C;
            snapshotObserver.a.b(iyVar, snapshotObserver.b, a10Var);
            lyVar.e = true;
            lyVar.f = true;
            boolean z = lw.z(iyVar);
            a20 a20Var = lyVar.o;
            if (z) {
                a20Var.y = true;
                a20Var.z = true;
            } else {
                a20Var.x = true;
            }
            lyVar.c = fy.i;
        }
    }

    public final void d(int i) {
        int i2 = this.k;
        this.k = i;
        if ((i2 == 0) != (i == 0)) {
            iy n = this.a.n();
            ly lyVar = n != null ? n.I : null;
            if (lyVar != null) {
                int i3 = lyVar.k;
                if (i == 0) {
                    lyVar.d(i3 - 1);
                } else {
                    lyVar.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.n;
        this.n = i;
        if ((i2 == 0) != (i == 0)) {
            iy n = this.a.n();
            ly lyVar = n != null ? n.I : null;
            if (lyVar != null) {
                int i3 = lyVar.n;
                if (i == 0) {
                    lyVar.e(i3 - 1);
                } else {
                    lyVar.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.i) {
                d(this.k + 1);
            } else {
                if (z || this.i) {
                    return;
                }
                d(this.k - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (z && !this.j) {
                d(this.k + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.k - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.l) {
                e(this.n + 1);
            } else {
                if (z || this.l) {
                    return;
                }
                e(this.n - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (z && !this.m) {
                e(this.n + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.n - 1);
            }
        }
    }

    public final void j() {
        a20 a20Var = this.o;
        ly lyVar = a20Var.j;
        Object obj = a20Var.u;
        iy iyVar = this.a;
        if ((obj != null || lyVar.a().e() != null) && a20Var.t) {
            a20Var.t = false;
            a20Var.u = lyVar.a().e();
            iy n = iyVar.n();
            if (n != null) {
                iy.N(n, false, 7);
            }
        }
        c10 c10Var = this.p;
        if (c10Var != null) {
            ly lyVar2 = c10Var.j;
            if (c10Var.A == null) {
                y00 y0 = lyVar2.a().y0();
                y0.getClass();
                if (y0.y.e() == null) {
                    return;
                }
            }
            if (c10Var.z) {
                c10Var.z = false;
                y00 y02 = lyVar2.a().y0();
                y02.getClass();
                c10Var.A = y02.y.e();
                if (lw.z(iyVar)) {
                    iy n2 = iyVar.n();
                    if (n2 != null) {
                        iy.N(n2, false, 7);
                        return;
                    }
                    return;
                }
                iy n3 = iyVar.n();
                if (n3 != null) {
                    iy.L(n3, false, 7);
                }
            }
        }
    }
}
