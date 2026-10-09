package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class cl0 extends o0 {
    public long a;
    public ja b;

    @Override // defpackage.o0
    public final boolean a(n0 n0Var) {
        bl0 bl0Var = (bl0) n0Var;
        if (this.a >= 0) {
            return false;
        }
        long j = bl0Var.m;
        if (j < bl0Var.n) {
            bl0Var.n = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.o0
    public final ng[] b(n0 n0Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((bl0) n0Var).u(j);
    }
}
