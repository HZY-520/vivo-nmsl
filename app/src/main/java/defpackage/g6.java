package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class g6 implements zm0 {
    public final kr0 e;
    public final w90 f;
    public l6 g;
    public long h;
    public long i;
    public boolean j;

    public g6(kr0 kr0Var, Object obj, l6 l6Var, long j, long j2, boolean z) {
        l6 l6Var2;
        this.e = kr0Var;
        this.f = p30.m(obj);
        if (l6Var != null) {
            l6Var2 = lw.p(l6Var);
        } else {
            l6Var2 = (l6) kr0Var.a.invoke(obj);
            l6Var2.d();
        }
        this.g = l6Var2;
        this.h = j;
        this.i = j2;
        this.j = z;
    }

    @Override // defpackage.zm0
    public final Object getValue() {
        return this.f.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f.getValue() + ", velocity=" + this.e.b.invoke(this.g) + ", isRunning=" + this.j + ", lastFrameTimeNanos=" + this.h + ", finishedTimeNanos=" + this.i + ")";
    }

    public /* synthetic */ g6(kr0 kr0Var, Object obj, l6 l6Var, int i) {
        this(kr0Var, obj, (i & 4) != 0 ? null : l6Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
