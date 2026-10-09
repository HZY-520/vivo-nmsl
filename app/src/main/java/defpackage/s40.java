package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class s40 implements ListIterator, fx {
    public final List e;
    public int f;

    public s40(int i, List list) {
        this.e = list;
        this.f = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.e.add(this.f, obj);
        this.f++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.e.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f;
        this.f = i + 1;
        return this.e.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f - 1;
        this.f = i;
        return this.e.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f - 1;
        this.f = i;
        this.e.remove(i);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.e.set(this.f, obj);
    }
}
