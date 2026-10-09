package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class gn extends hn {
    public final Runnable g;

    public gn(long j, Runnable runnable) {
        super(j);
        this.g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.run();
    }

    @Override // defpackage.hn
    public final String toString() {
        return super.toString() + this.g;
    }
}
