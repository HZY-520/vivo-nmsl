package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class i7 implements Iterator, fx {
    public int e;
    public int f;
    public boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i7(m7 m7Var, int i) {
        this(m7Var.g);
        this.h = i;
        switch (i) {
            case 1:
                this.i = m7Var;
                this(m7Var.g);
                break;
            default:
                this.i = m7Var;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f;
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                e = ((m7) obj).e(i);
                break;
            case 1:
                e = ((m7) obj).h(i);
                break;
            default:
                e = ((n7) obj).f[i];
                break;
        }
        this.f++;
        this.g = true;
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.g) {
            z6.m("Call next() before removing an element.");
            return;
        }
        int i = this.f - 1;
        this.f = i;
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                ((m7) obj).f(i);
                break;
            case 1:
                ((m7) obj).f(i);
                break;
            default:
                ((n7) obj).a(i);
                break;
        }
        this.e--;
        this.g = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i7(n7 n7Var) {
        this(n7Var.g);
        this.h = 2;
        this.i = n7Var;
    }

    public i7(int i) {
        this.e = i;
    }
}
