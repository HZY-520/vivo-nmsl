package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class un0 implements List, gx {
    public final fm0 e;
    public final int f;
    public int g;
    public int h;

    public un0(fm0 fm0Var, int i, int i2) {
        this.e = fm0Var;
        this.f = i;
        this.g = lr0.w(fm0Var);
        this.h = i2 - i;
    }

    public final void a() {
        if (lr0.w(this.e) != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.f + this.h;
        fm0 fm0Var = this.e;
        fm0Var.add(i, obj);
        this.h++;
        this.g = lr0.w(fm0Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.f;
        fm0 fm0Var = this.e;
        boolean addAll = fm0Var.addAll(i2, collection);
        if (addAll) {
            this.h = collection.size() + this.h;
            this.g = lr0.w(fm0Var);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.h > 0) {
            a();
            int i = this.h;
            int i2 = this.f;
            fm0 fm0Var = this.e;
            fm0Var.d(i2, i + i2);
            this.h = 0;
            this.g = lr0.w(fm0Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        lr0.N(i, this.h);
        return this.e.get(this.f + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int nextInt;
        a();
        int i = this.h;
        int i2 = this.f;
        Iterator it = t30.C(i2, i + i2).iterator();
        do {
            zv zvVar = (zv) it;
            if (!zvVar.g) {
                return -1;
            }
            nextInt = zvVar.nextInt();
        } while (!lw.i(obj, this.e.get(nextInt)));
        return nextInt - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.h == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.h;
        int i2 = this.f;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (lw.i(obj, this.e.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        te0 te0Var = new te0();
        te0Var.e = i - 1;
        return new vf0(te0Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.f + i;
        fm0 fm0Var = this.e;
        Object remove = fm0Var.remove(i2);
        this.h--;
        this.g = lr0.w(fm0Var);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        b0 b0Var;
        ql0 h;
        boolean d;
        a();
        fm0 fm0Var = this.e;
        int i2 = this.f;
        int i3 = this.h + i2;
        int size = fm0Var.size();
        do {
            synchronized (lr0.r) {
                fn0 fn0Var = fm0Var.e;
                fn0Var.getClass();
                fn0 fn0Var2 = (fn0) xl0.f(fn0Var);
                i = fn0Var2.d;
                b0Var = fn0Var2.c;
            }
            b0Var.getClass();
            jb0 e = b0Var.e();
            e.subList(i2, i3).retainAll(collection);
            b0 c = e.c();
            if (lw.i(c, b0Var)) {
                break;
            }
            fn0 fn0Var3 = fm0Var.e;
            fn0Var3.getClass();
            synchronized (xl0.c) {
                h = xl0.h();
                d = lr0.d((fn0) xl0.w(fn0Var3, fm0Var, h), i, c, true);
            }
            xl0.l(h, fm0Var);
        } while (!d);
        int size2 = size - fm0Var.size();
        if (size2 > 0) {
            this.g = lr0.w(this.e);
            this.h -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        lr0.N(i, this.h);
        a();
        int i2 = i + this.f;
        fm0 fm0Var = this.e;
        Object obj2 = fm0Var.set(i2, obj);
        this.g = lr0.w(fm0Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.h;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.h) {
            dd0.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.f;
        return new un0(this.e, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return lr0.K(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return lr0.L(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.f + i;
        fm0 fm0Var = this.e;
        fm0Var.add(i2, obj);
        this.h++;
        this.g = lr0.w(fm0Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.h, collection);
    }
}
