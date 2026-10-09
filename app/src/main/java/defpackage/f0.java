package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class f0 extends nh {
    public final AtomicReferenceFieldUpdater o;
    public final AtomicReferenceFieldUpdater p;
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater s;

    public f0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.o = atomicReferenceFieldUpdater;
        this.p = atomicReferenceFieldUpdater2;
        this.q = atomicReferenceFieldUpdater3;
        this.r = atomicReferenceFieldUpdater4;
        this.s = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.nh
    public final void P(h0 h0Var, h0 h0Var2) {
        this.p.lazySet(h0Var, h0Var2);
    }

    @Override // defpackage.nh
    public final void Q(h0 h0Var, Thread thread) {
        this.o.lazySet(h0Var, thread);
    }

    @Override // defpackage.nh
    public final boolean k(i0 i0Var, e0 e0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.r;
            if (atomicReferenceFieldUpdater.compareAndSet(i0Var, e0Var, e0.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(i0Var) == e0Var);
        return false;
    }

    @Override // defpackage.nh
    public final boolean l(i0 i0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.s;
            if (atomicReferenceFieldUpdater.compareAndSet(i0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(i0Var) == obj);
        return false;
    }

    @Override // defpackage.nh
    public final boolean m(i0 i0Var, h0 h0Var, h0 h0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.q;
            if (atomicReferenceFieldUpdater.compareAndSet(i0Var, h0Var, h0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(i0Var) == h0Var);
        return false;
    }
}
