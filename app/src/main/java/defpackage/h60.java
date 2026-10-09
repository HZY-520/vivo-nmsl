package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class h60 extends r implements ww {
    public static final h60 f = new h60(b2.N);

    @Override // defpackage.ww
    public final boolean a() {
        return true;
    }

    @Override // defpackage.ww
    public final boolean d() {
        return false;
    }

    @Override // defpackage.ww
    public final gb f(cx cxVar) {
        return i60.e;
    }

    @Override // defpackage.ww
    public final CancellationException l() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.ww
    public final tj o(pq pqVar) {
        return i60.e;
    }

    @Override // defpackage.ww
    public final Object s(og ogVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.ww
    public final tj t(boolean z, boolean z2, e eVar) {
        return i60.e;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.ww
    public final void b(CancellationException cancellationException) {
    }
}
