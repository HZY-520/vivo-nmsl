package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class zs implements ListIterator, fx {
    public final /* synthetic */ int e;
    public int f;
    public int g;
    public int h;
    public final Object i;

    public zs(fm0 fm0Var, int i) {
        this.e = 3;
        this.i = fm0Var;
        this.f = i - 1;
        this.g = -1;
        this.h = lr0.w(fm0Var);
    }

    public void a() {
        int i;
        i = ((AbstractList) ((zz) this.i).i).modCount;
        if (i != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        int i3 = this.e;
        Object obj2 = this.i;
        switch (i3) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                zz zzVar = (zz) obj2;
                int i4 = this.f;
                this.f = i4 + 1;
                zzVar.add(i4, obj);
                this.g = -1;
                i = ((AbstractList) zzVar).modCount;
                this.h = i;
                return;
            case 2:
                b();
                a00 a00Var = (a00) obj2;
                int i5 = this.f;
                this.f = i5 + 1;
                a00Var.add(i5, obj);
                this.g = -1;
                i2 = ((AbstractList) a00Var).modCount;
                this.h = i2;
                return;
            default:
                c();
                fm0 fm0Var = (fm0) obj2;
                fm0Var.add(this.f + 1, obj);
                this.g = -1;
                this.f++;
                this.h = lr0.w(fm0Var);
                return;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((a00) this.i)).modCount;
        if (i != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (lr0.w((fm0) this.i) != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                if (this.f < this.h) {
                    break;
                }
                break;
            case 1:
                if (this.f < ((zz) obj).g) {
                    break;
                }
                break;
            case 2:
                if (this.f < ((a00) obj).f) {
                    break;
                }
                break;
            default:
                if (this.f < ((fm0) obj).size() - 1) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.e) {
            case 0:
                if (this.f > this.g) {
                }
                break;
            case 1:
                if (this.f > 0) {
                }
                break;
            case 2:
                if (this.f > 0) {
                }
                break;
            default:
                if (this.f >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                h40 h40Var = ((bt) obj).e;
                int i2 = this.f;
                this.f = i2 + 1;
                Object g = h40Var.g(i2);
                g.getClass();
                return (t20) g;
            case 1:
                a();
                int i3 = this.f;
                zz zzVar = (zz) obj;
                if (i3 >= zzVar.g) {
                    throw new NoSuchElementException();
                }
                this.f = i3 + 1;
                this.g = i3;
                return zzVar.e[zzVar.f + i3];
            case 2:
                b();
                int i4 = this.f;
                a00 a00Var = (a00) obj;
                if (i4 >= a00Var.f) {
                    throw new NoSuchElementException();
                }
                this.f = i4 + 1;
                this.g = i4;
                return a00Var.e[i4];
            default:
                c();
                int i5 = this.f + 1;
                this.g = i5;
                fm0 fm0Var = (fm0) obj;
                lr0.N(i5, fm0Var.size());
                Object obj2 = fm0Var.get(i5);
                this.f = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.e) {
            case 0:
                return this.f - this.g;
            case 1:
                return this.f;
            case 2:
                return this.f;
            default:
                return this.f + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                h40 h40Var = ((bt) obj).e;
                int i2 = this.f - 1;
                this.f = i2;
                Object g = h40Var.g(i2);
                g.getClass();
                return (t20) g;
            case 1:
                a();
                int i3 = this.f;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.f = i4;
                this.g = i4;
                zz zzVar = (zz) obj;
                return zzVar.e[zzVar.f + i4];
            case 2:
                b();
                int i5 = this.f;
                if (i5 <= 0) {
                    throw new NoSuchElementException();
                }
                int i6 = i5 - 1;
                this.f = i6;
                this.g = i6;
                return ((a00) obj).e[i6];
            default:
                c();
                fm0 fm0Var = (fm0) obj;
                lr0.N(this.f, fm0Var.size());
                int i7 = this.f;
                this.g = i7;
                this.f--;
                return fm0Var.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.e) {
            case 0:
                return (this.f - this.g) - 1;
            case 1:
                i = this.f;
                break;
            case 2:
                i = this.f;
                break;
            default:
                return this.f;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        int i3 = this.e;
        Object obj = this.i;
        switch (i3) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                zz zzVar = (zz) obj;
                a();
                int i4 = this.g;
                if (i4 == -1) {
                    z6.m("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                zzVar.b(i4);
                this.f = this.g;
                this.g = -1;
                i = ((AbstractList) zzVar).modCount;
                this.h = i;
                return;
            case 2:
                a00 a00Var = (a00) obj;
                b();
                int i5 = this.g;
                if (i5 == -1) {
                    z6.m("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                a00Var.b(i5);
                this.f = this.g;
                this.g = -1;
                i2 = ((AbstractList) a00Var).modCount;
                this.h = i2;
                return;
            default:
                c();
                fm0 fm0Var = (fm0) obj;
                fm0Var.remove(this.g);
                this.f--;
                this.g = -1;
                this.h = lr0.w(fm0Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i2 = this.g;
                if (i2 != -1) {
                    ((zz) obj2).set(i2, obj);
                    return;
                } else {
                    z6.m("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i3 = this.g;
                if (i3 != -1) {
                    ((a00) obj2).set(i3, obj);
                    return;
                } else {
                    z6.m("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                fm0 fm0Var = (fm0) obj2;
                c();
                int i4 = this.g;
                if (i4 < 0) {
                    z6.m("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    fm0Var.set(i4, obj);
                    this.h = lr0.w(fm0Var);
                    return;
                }
        }
    }

    public zs(a00 a00Var, int i) {
        int i2;
        this.e = 2;
        this.i = a00Var;
        this.f = i;
        this.g = -1;
        i2 = ((AbstractList) a00Var).modCount;
        this.h = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zs(bt btVar, int i, int i2) {
        this(btVar, (i2 & 1) != 0 ? 0 : i, 0, btVar.e.b);
        this.e = 0;
    }

    public zs(bt btVar, int i, int i2, int i3) {
        this.e = 0;
        this.i = btVar;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public zs(zz zzVar, int i) {
        int i2;
        this.e = 1;
        this.i = zzVar;
        this.f = i;
        this.g = -1;
        i2 = ((AbstractList) zzVar).modCount;
        this.h = i2;
    }
}
