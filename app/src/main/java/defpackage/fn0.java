package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class fn0 extends in0 {
    public b0 c;
    public int d;
    public int e;

    public fn0(long j, b0 b0Var) {
        super(j);
        this.c = b0Var;
    }

    @Override // defpackage.in0
    public final void a(in0 in0Var) {
        synchronized (lr0.r) {
            in0Var.getClass();
            this.c = ((fn0) in0Var).c;
            this.d = ((fn0) in0Var).d;
            this.e = ((fn0) in0Var).e;
        }
    }

    @Override // defpackage.in0
    public final in0 b(long j) {
        return new fn0(j, this.c);
    }
}
