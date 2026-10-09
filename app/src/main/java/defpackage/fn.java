package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class fn extends hn {
    public final ja g;
    public final /* synthetic */ jn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(jn jnVar, long j, ja jaVar) {
        super(j);
        this.h = jnVar;
        this.g = jaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.B(this.h);
    }

    @Override // defpackage.hn
    public final String toString() {
        return super.toString() + this.g;
    }
}
