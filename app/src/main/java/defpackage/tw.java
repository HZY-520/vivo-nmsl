package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class tw extends zw {
    public static final /* synthetic */ long j = p7.a.objectFieldOffset(tw.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final e i;

    public tw(e eVar) {
        this.i = eVar;
    }

    @Override // defpackage.zw
    public final boolean m() {
        return true;
    }

    @Override // defpackage.zw
    public final void n(Throwable th) {
        if (p7.a.compareAndSwapInt(this, j, 0, 1)) {
            this.i.invoke(th);
        }
    }
}
