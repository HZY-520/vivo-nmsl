package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class la extends hd {
    public static final /* synthetic */ long c = p7.a.objectFieldOffset(la.class.getDeclaredField("_resumed$volatile"));
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public la(ja jaVar, Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new CancellationException("Continuation " + jaVar + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
