package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class fm0 implements Parcelable, gn0, List, RandomAccess, gx {
    public static final Parcelable.Creator<fm0> CREATOR = new em0();
    public fn0 e;

    public fm0(b0 b0Var) {
        ql0 h = xl0.h();
        fn0 fn0Var = new fn0(h.g(), b0Var);
        if (!(h instanceof zr)) {
            fn0Var.b = new fn0(1L, b0Var);
        }
        this.e = fn0Var;
    }

    @Override // defpackage.gn0
    public final in0 a() {
        return this.e;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        b0 b0Var;
        ql0 h;
        boolean d;
        do {
            synchronized (lr0.r) {
                fn0 fn0Var = this.e;
                fn0Var.getClass();
                fn0 fn0Var2 = (fn0) xl0.f(fn0Var);
                i = fn0Var2.d;
                b0Var = fn0Var2.c;
            }
            b0Var.getClass();
            b0 c = b0Var.c(obj);
            if (c.equals(b0Var)) {
                return false;
            }
            fn0 fn0Var3 = this.e;
            fn0Var3.getClass();
            synchronized (xl0.c) {
                h = xl0.h();
                d = lr0.d((fn0) xl0.w(fn0Var3, this, h), i, c, true);
            }
            xl0.l(h, this);
        } while (!d);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        b0 b0Var;
        ql0 h;
        boolean d;
        do {
            synchronized (lr0.r) {
                fn0 fn0Var = this.e;
                fn0Var.getClass();
                fn0 fn0Var2 = (fn0) xl0.f(fn0Var);
                i = fn0Var2.d;
                b0Var = fn0Var2.c;
            }
            b0Var.getClass();
            b0 d2 = b0Var.d(collection);
            if (lw.i(d2, b0Var)) {
                return false;
            }
            fn0 fn0Var3 = this.e;
            fn0Var3.getClass();
            synchronized (xl0.c) {
                h = xl0.h();
                d = lr0.d((fn0) xl0.w(fn0Var3, this, h), i, d2, true);
            }
            xl0.l(h, this);
        } while (!d);
        return true;
    }

    @Override // defpackage.gn0
    public final void c(in0 in0Var) {
        in0Var.b = this.e;
        this.e = (fn0) in0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        ql0 h;
        fn0 fn0Var = this.e;
        fn0Var.getClass();
        synchronized (xl0.c) {
            h = xl0.h();
            fn0 fn0Var2 = (fn0) xl0.w(fn0Var, this, h);
            synchronized (lr0.r) {
                fn0Var2.c = pl0.f;
                fn0Var2.d++;
                fn0Var2.e++;
            }
        }
        xl0.l(h, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return lr0.u(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return lr0.u(this).c.containsAll(collection);
    }

    public final void d(int i, int i2) {
        int i3;
        b0 b0Var;
        ql0 h;
        boolean d;
        do {
            synchronized (lr0.r) {
                fn0 fn0Var = this.e;
                fn0Var.getClass();
                fn0 fn0Var2 = (fn0) xl0.f(fn0Var);
                i3 = fn0Var2.d;
                b0Var = fn0Var2.c;
            }
            b0Var.getClass();
            jb0 e = b0Var.e();
            e.subList(i, i2).clear();
            b0 c = e.c();
            if (lw.i(c, b0Var)) {
                return;
            }
            fn0 fn0Var3 = this.e;
            fn0Var3.getClass();
            synchronized (xl0.c) {
                h = xl0.h();
                d = lr0.d((fn0) xl0.w(fn0Var3, this, h), i3, c, true);
            }
            xl0.l(h, this);
        } while (!d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return lr0.u(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return lr0.u(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return lr0.u(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return lr0.u(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new zs(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        b0 b0Var;
        ql0 h;
        boolean d;
        do {
            synchronized (lr0.r) {
                fn0 fn0Var = this.e;
                fn0Var.getClass();
                fn0 fn0Var2 = (fn0) xl0.f(fn0Var);
                i = fn0Var2.d;
                b0Var = fn0Var2.c;
            }
            b0Var.getClass();
            int indexOf = b0Var.indexOf(obj);
            b0 g = indexOf != -1 ? b0Var.g(indexOf) : b0Var;
            if (g.equals(b0Var)) {
                return false;
            }
            fn0 fn0Var3 = this.e;
            fn0Var3.getClass();
            synchronized (xl0.c) {
                h = xl0.h();
                d = lr0.d((fn0) xl0.w(fn0Var3, this, h), i, g, true);
            }
            xl0.l(h, this);
        } while (!d);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        b0 b0Var;
        ql0 h;
        boolean d;
        do {
            synchronized (lr0.r) {
                fn0 fn0Var = this.e;
                fn0Var.getClass();
                fn0 fn0Var2 = (fn0) xl0.f(fn0Var);
                i = fn0Var2.d;
                b0Var = fn0Var2.c;
            }
            b0Var.getClass();
            b0 f = b0Var.f(new a0(0, collection));
            if (lw.i(f, b0Var)) {
                return false;
            }
            fn0 fn0Var3 = this.e;
            fn0Var3.getClass();
            synchronized (xl0.c) {
                h = xl0.h();
                d = lr0.d((fn0) xl0.w(fn0Var3, this, h), i, f, true);
            }
            xl0.l(h, this);
        } while (!d);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return lr0.E(this, new a0(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        b0 b0Var;
        ql0 h;
        boolean d;
        Object obj2 = get(i);
        do {
            synchronized (lr0.r) {
                fn0 fn0Var = this.e;
                fn0Var.getClass();
                fn0 fn0Var2 = (fn0) xl0.f(fn0Var);
                i2 = fn0Var2.d;
                b0Var = fn0Var2.c;
            }
            b0Var.getClass();
            b0 h2 = b0Var.h(i, obj);
            if (h2.equals(b0Var)) {
                break;
            }
            fn0 fn0Var3 = this.e;
            fn0Var3.getClass();
            synchronized (xl0.c) {
                h = xl0.h();
                d = lr0.d((fn0) xl0.w(fn0Var3, this, h), i2, h2, false);
            }
            xl0.l(h, this);
        } while (!d);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return lr0.u(this).c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            dd0.a("fromIndex or toIndex are out of bounds");
        }
        return new un0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return lr0.K(this);
    }

    public final String toString() {
        fn0 fn0Var = this.e;
        fn0Var.getClass();
        return "SnapshotStateList(value=" + ((fn0) xl0.f(fn0Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b0 b0Var = lr0.u(this).c;
        int a = b0Var.a();
        parcel.writeInt(a);
        for (int i2 = 0; i2 < a; i2++) {
            parcel.writeValue(b0Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return lr0.L(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new zs(this, i);
    }

    public fm0() {
        this(pl0.f);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        b0 b0Var;
        ql0 h;
        boolean d;
        do {
            synchronized (lr0.r) {
                fn0 fn0Var = this.e;
                fn0Var.getClass();
                fn0 fn0Var2 = (fn0) xl0.f(fn0Var);
                i2 = fn0Var2.d;
                b0Var = fn0Var2.c;
            }
            b0Var.getClass();
            b0 b = b0Var.b(i, obj);
            if (b.equals(b0Var)) {
                return;
            }
            fn0 fn0Var3 = this.e;
            fn0Var3.getClass();
            synchronized (xl0.c) {
                h = xl0.h();
                d = lr0.d((fn0) xl0.w(fn0Var3, this, h), i2, b, true);
            }
            xl0.l(h, this);
        } while (!d);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return lr0.E(this, new so(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        b0 b0Var;
        ql0 h;
        boolean d;
        Object obj = get(i);
        do {
            synchronized (lr0.r) {
                fn0 fn0Var = this.e;
                fn0Var.getClass();
                fn0 fn0Var2 = (fn0) xl0.f(fn0Var);
                i2 = fn0Var2.d;
                b0Var = fn0Var2.c;
            }
            b0Var.getClass();
            b0 g = b0Var.g(i);
            if (g.equals(b0Var)) {
                break;
            }
            fn0 fn0Var3 = this.e;
            fn0Var3.getClass();
            synchronized (xl0.c) {
                h = xl0.h();
                d = lr0.d((fn0) xl0.w(fn0Var3, this, h), i2, g, true);
            }
            xl0.l(h, this);
        } while (!d);
        return obj;
    }
}
