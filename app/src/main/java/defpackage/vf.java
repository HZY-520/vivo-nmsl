package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vf implements lk0 {
    public final AtomicReference a;

    public vf(lk0 lk0Var) {
        this.a = new AtomicReference(lk0Var);
    }

    @Override // defpackage.lk0
    public final Iterator iterator() {
        lk0 lk0Var = (lk0) this.a.getAndSet(null);
        if (lk0Var != null) {
            return lk0Var.iterator();
        }
        z6.m("This sequence can be consumed only once.");
        return null;
    }
}
