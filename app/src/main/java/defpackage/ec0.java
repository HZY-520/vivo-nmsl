package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class ec0 {
    public int e;
    public int f;
    public long g = 0;
    public long h = fc0.b;
    public long i = 0;

    public int L() {
        return (int) (this.g & 4294967295L);
    }

    public int M() {
        return (int) (this.g >> 32);
    }

    public final void O() {
        this.e = t30.g((int) (this.g >> 32), wf.j(this.h), wf.h(this.h));
        this.f = t30.g((int) (this.g & 4294967295L), wf.i(this.h), wf.g(this.h));
        int i = this.e;
        long j = this.g;
        this.i = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public abstract void P(long j, float f, pq pqVar);

    public final void Q(long j) {
        if (ew.a(this.g, j)) {
            return;
        }
        this.g = j;
        O();
    }

    public final void R(long j) {
        if (wf.b(this.h, j)) {
            return;
        }
        this.h = j;
        O();
    }

    public abstract Object e();
}
