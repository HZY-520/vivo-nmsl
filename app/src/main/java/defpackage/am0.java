package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class am0 extends in0 {
    public long c;

    public am0(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.in0
    public final void a(in0 in0Var) {
        in0Var.getClass();
        this.c = ((am0) in0Var).c;
    }

    @Override // defpackage.in0
    public final in0 b(long j) {
        return new am0(j, this.c);
    }
}
