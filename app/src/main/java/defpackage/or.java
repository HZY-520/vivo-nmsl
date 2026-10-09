package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class or implements Iterator, fx {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final Object h;

    public or(n40 n40Var) {
        this.e = 1;
        this.h = n40Var;
        this.f = -1;
        this.g = j20.g(new m40(n40Var, this, null));
    }

    public void a() {
        Object invoke;
        int i = this.f;
        pr prVar = (pr) this.h;
        if (i == -2) {
            invoke = prVar.a.b();
        } else {
            pq pqVar = prVar.b;
            Object obj = this.g;
            obj.getClass();
            invoke = pqVar.invoke(obj);
        }
        this.g = invoke;
        this.f = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                if (this.f < 0) {
                    a();
                }
                return this.f == 1;
            case 1:
                return ((mk0) this.g).hasNext();
            default:
                return this.f < ((Map) this.h).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                if (this.f < 0) {
                    a();
                }
                if (this.f == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.g;
                obj.getClass();
                this.f = -1;
                return obj;
            case 1:
                return ((mk0) this.g).next();
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.g;
                this.f++;
                Object obj3 = ((Map) this.h).get(obj2);
                if (obj3 != null) {
                    this.g = ((yz) obj3).b;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.f;
                if (i != -1) {
                    ((n40) this.h).f.l(i);
                    this.f = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public or(pr prVar) {
        this.e = 0;
        this.h = prVar;
        this.f = -2;
    }

    public or(Object obj, Map map) {
        this.e = 2;
        this.g = obj;
        this.h = map;
    }
}
