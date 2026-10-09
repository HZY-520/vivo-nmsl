package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class gr0 implements Iterator, fx {
    public Object[] e = fr0.e.d;
    public int f;
    public int g;

    public final void a(Object[] objArr, int i, int i2) {
        this.e = objArr;
        this.f = i;
        this.g = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
