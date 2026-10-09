package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class mk0 implements Iterator, ng, fx {
    public int e;
    public Object f;
    public ng g;

    public final RuntimeException b() {
        int i = this.e;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.e);
    }

    public final void c(Object obj, pf0 pf0Var) {
        this.f = obj;
        this.e = 3;
        this.g = pf0Var;
    }

    @Override // defpackage.ng
    public final tg getContext() {
        return sm.e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.e;
            if (i != 0) {
                break;
            }
            this.e = 5;
            ng ngVar = this.g;
            ngVar.getClass();
            this.g = null;
            ngVar.resumeWith(fs0.a);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.e = 1;
            throw null;
        }
        if (i != 3) {
            throw b();
        }
        this.e = 0;
        Object obj = this.f;
        this.f = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.ng
    public final void resumeWith(Object obj) {
        t30.z(obj);
        this.e = 4;
    }
}
