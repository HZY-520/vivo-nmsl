package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class zv implements Iterator, fx {
    public final int e;
    public final int f;
    public boolean g;
    public int h;

    public zv(int i, int i2, int i3) {
        this.e = i3;
        this.f = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.g = z;
        this.h = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.h;
        if (i != this.f) {
            this.h = this.e + i;
            return i;
        }
        if (!this.g) {
            throw new NoSuchElementException();
        }
        this.g = false;
        return i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
