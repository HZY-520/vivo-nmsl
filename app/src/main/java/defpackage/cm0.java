package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class cm0 extends in0 {
    public Object c;

    public cm0(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.in0
    public final void a(in0 in0Var) {
        in0Var.getClass();
        this.c = ((cm0) in0Var).c;
    }

    @Override // defpackage.in0
    public final in0 b(long j) {
        return new cm0(j, this.c);
    }
}
