package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class wf0 extends w {
    public final List e;

    public wf0(List list) {
        this.e = list;
    }

    @Override // defpackage.m
    public final int a() {
        return this.e.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= size() - 1) {
            return this.e.get((size() - 1) - i);
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new aw(0, size() - 1, 1) + "].");
    }

    @Override // defpackage.w, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new vf0(this, 0);
    }

    @Override // defpackage.w, java.util.List
    public final ListIterator listIterator() {
        return new vf0(this, 0);
    }

    @Override // defpackage.w, java.util.List
    public final ListIterator listIterator(int i) {
        return new vf0(this, i);
    }
}
