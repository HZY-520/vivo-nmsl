package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class bh0 implements ng, eh {
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(bh0.class, Object.class, "result");
    public final ng e;
    private volatile Object result;

    public bh0(ng ngVar) {
        dh dhVar = dh.e;
        this.e = ngVar;
        this.result = dhVar;
    }

    @Override // defpackage.eh
    public final eh getCallerFrame() {
        ng ngVar = this.e;
        if (ngVar instanceof eh) {
            return (eh) ngVar;
        }
        return null;
    }

    @Override // defpackage.ng
    public final tg getContext() {
        return this.e.getContext();
    }

    @Override // defpackage.ng
    public final void resumeWith(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        while (true) {
            Object obj2 = this.result;
            dh dhVar = dh.f;
            if (obj2 == dhVar) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, dhVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != dhVar) {
                        break;
                    }
                }
                return;
            }
            dh dhVar2 = dh.e;
            if (obj2 != dhVar2) {
                z6.m("Already resumed");
                return;
            }
            dh dhVar3 = dh.g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, dhVar2, dhVar3)) {
                if (atomicReferenceFieldUpdater.get(this) != dhVar2) {
                    break;
                }
            }
            this.e.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.e;
    }
}
