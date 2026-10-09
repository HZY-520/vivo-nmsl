package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class bt implements List, fx {
    public final h40 e = new h40(16);
    public final c40 f = new c40(16);
    public int g = -1;

    public final long a() {
        long c = kw.c(Float.POSITIVE_INFINITY, false, false);
        int i = this.g + 1;
        int i2 = this.e.b - 1;
        if (i > i2) {
            return c;
        }
        while (i >= 0) {
            c40 c40Var = this.f;
            if (i >= c40Var.b) {
                break;
            }
            long j = c40Var.a[i];
            if (lr0.g(j, c) < 0) {
                c = j;
            }
            if ((lr0.q(c) < 0.0f && lr0.A(c)) || i == i2) {
                return c;
            }
            i++;
        }
        z6.f("Index must be between 0 and size");
        return 0L;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(int i, int i2) {
        c40 c40Var;
        int i3;
        if (i >= i2) {
            return;
        }
        this.e.m(i, i2);
        if (i < 0 || i > (i3 = (c40Var = this.f).b) || i2 < 0 || i2 > i3) {
            z6.f("Index must be between 0 and size");
            return;
        }
        if (i2 < i) {
            z6.l("The end index must be < start index");
        } else if (i2 != i) {
            if (i2 < i3) {
                long[] jArr = c40Var.a;
                o7.Q(jArr, jArr, i, i2, i3);
            }
            c40Var.b -= i2 - i;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.g = -1;
        this.e.d();
        this.f.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof t20) && indexOf((t20) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((t20) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object g = this.e.g(i);
        g.getClass();
        return (t20) g;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof t20)) {
            return -1;
        }
        t20 t20Var = (t20) obj;
        h40 h40Var = this.e;
        int i = h40Var.b - 1;
        if (i < 0) {
            return -1;
        }
        int i2 = 0;
        while (!lw.i(h40Var.g(i2), t20Var)) {
            if (i2 == i) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.e.i();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new zs(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof t20) {
            t20 t20Var = (t20) obj;
            h40 h40Var = this.e;
            for (int i = h40Var.b - 1; -1 < i; i--) {
                if (lw.i(h40Var.g(i), t20Var)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new zs(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.e.b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new at(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return lr0.K(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return lr0.L(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new zs(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
