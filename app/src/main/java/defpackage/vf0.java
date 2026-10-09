package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vf0 implements ListIterator, fx {
    public final /* synthetic */ int e = 1;
    public final Object f;
    public final /* synthetic */ Object g;

    public vf0(wf0 wf0Var, int i) {
        this.g = wf0Var;
        List list = wf0Var.e;
        if (i >= 0 && i <= wf0Var.a()) {
            this.f = list.listIterator(wf0Var.a() - i);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new aw(0, wf0Var.a(), 1) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((te0) obj).e < ((un0) this.g).h - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasNext();
            default:
                return ((te0) obj).e >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            default:
                te0 te0Var = (te0) obj;
                int i2 = te0Var.e + 1;
                un0 un0Var = (un0) this.g;
                lr0.N(i2, un0Var.h);
                te0Var.e = i2;
                return un0Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                wf0 wf0Var = (wf0) this.g;
                return (wf0Var.size() - 1) - ((ListIterator) obj).previousIndex();
            default:
                return ((te0) obj).e + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            default:
                te0 te0Var = (te0) obj;
                int i2 = te0Var.e;
                un0 un0Var = (un0) this.g;
                lr0.N(i2, un0Var.h);
                te0Var.e = i2 - 1;
                return un0Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                wf0 wf0Var = (wf0) this.g;
                return (wf0Var.size() - 1) - ((ListIterator) obj).nextIndex();
            default:
                return ((te0) obj).e;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public vf0(te0 te0Var, un0 un0Var) {
        this.f = te0Var;
        this.g = un0Var;
    }
}
