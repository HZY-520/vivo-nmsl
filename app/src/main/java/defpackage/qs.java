package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class qs implements Iterator, fx {
    public final ll0 e;
    public final int f;
    public int g;
    public final int h;

    public qs(ll0 ll0Var, int i, int i2) {
        this.e = ll0Var;
        this.f = i2;
        this.g = i;
        this.h = ll0Var.l;
        if (ll0Var.k) {
            nl0.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ll0 ll0Var = this.e;
        int i = ll0Var.l;
        int i2 = this.h;
        if (i != i2) {
            nl0.e();
        }
        int i3 = this.g;
        this.g = ll0Var.e[(i3 * 5) + 3] + i3;
        return new ml0(ll0Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
