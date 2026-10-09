package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class dn0 extends o0 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.o0
    public final boolean a(n0 n0Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(nh.m);
        return true;
    }

    @Override // defpackage.o0
    public final ng[] b(n0 n0Var) {
        this.a.set(null);
        return nh.a;
    }
}
