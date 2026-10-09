package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class ql0 {
    public vl0 a;
    public long b;
    public boolean c;
    public int d;

    public ql0(long j, vl0 vl0Var) {
        int i;
        int numberOfTrailingZeros;
        this.a = vl0Var;
        this.b = j;
        zh0 zh0Var = xl0.a;
        if (j != 0) {
            vl0 d = d();
            long j2 = d.g;
            long[] jArr = d.h;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = d.f;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = d.e;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (xl0.c) {
                i = xl0.f.a(j);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public static void q(ql0 ql0Var) {
        xl0.b.y(ql0Var);
    }

    public final void a() {
        synchronized (xl0.c) {
            b();
            p();
        }
    }

    public void b() {
        xl0.d = xl0.d.b(g());
    }

    public abstract void c();

    public vl0 d() {
        return this.a;
    }

    public abstract pq e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract pq i();

    public final ql0 j() {
        v6 v6Var = xl0.b;
        ql0 ql0Var = (ql0) v6Var.n();
        v6Var.y(this);
        return ql0Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(gn0 gn0Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            xl0.t(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(vl0 vl0Var) {
        this.a = vl0Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract ql0 u(pq pqVar);
}
