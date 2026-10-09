package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class oq0 extends ji0 implements Runnable {
    public final long i;

    public oq0(long j, pq0 pq0Var) {
        super(pq0Var, pq0Var.getContext());
        this.i = j;
    }

    @Override // defpackage.cx
    public final String Q() {
        return super.Q() + "(timeMillis=" + this.i + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        q3.v(this.g);
        x(new nq0("Timed out waiting for " + this.i + " ms", this));
    }
}
