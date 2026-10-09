package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class cb extends nj0 {
    public final o9 g;
    public final /* synthetic */ AtomicReferenceArray h;

    public cb(long j, cb cbVar, o9 o9Var, int i) {
        super(j, cbVar, i);
        this.g = o9Var;
        this.h = new AtomicReferenceArray(q9.b * 2);
    }

    @Override // defpackage.nj0
    public final int f() {
        return q9.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // defpackage.nj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, tg tgVar) {
        int i2 = q9.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.h.get(i * 2);
        while (true) {
            Object k = k(i);
            boolean z2 = k instanceof mu0;
            o9 o9Var = this.g;
            if (z2 || (k instanceof nu0)) {
                if (j(i, k, z ? q9.j : q9.k)) {
                    m(i, null);
                    l(i, !z);
                    if (z) {
                        o9Var.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (k == q9.j || k == q9.k) {
                    break;
                }
                if (k != q9.g && k != q9.f) {
                    if (k == q9.i || k == q9.d || k == q9.l) {
                        return;
                    }
                    z6.e(k, "unexpected state: ");
                    return;
                }
            }
        }
    }

    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object k(int i) {
        return this.h.get((i * 2) + 1);
    }

    public final void l(int i, boolean z) {
        if (z) {
            o9 o9Var = this.g;
            o9Var.getClass();
            o9Var.I((this.d * q9.b) + i);
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.h.set(i * 2, obj);
    }

    public final void n(int i, Object obj) {
        this.h.set((i * 2) + 1, obj);
    }
}
