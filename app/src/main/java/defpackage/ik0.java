package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ik0 extends nj0 {
    public final /* synthetic */ AtomicReferenceArray g;

    public ik0(long j, ik0 ik0Var, int i) {
        super(j, ik0Var, i);
        this.g = new AtomicReferenceArray(hk0.f);
    }

    @Override // defpackage.nj0
    public final int f() {
        return hk0.f;
    }

    @Override // defpackage.nj0
    public final void g(int i, tg tgVar) {
        this.g.set(i, hk0.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
