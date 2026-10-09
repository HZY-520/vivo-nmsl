package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class wo0 extends vo0 {
    public final Runnable g;

    public wo0(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.g;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(nh.y(runnable));
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
