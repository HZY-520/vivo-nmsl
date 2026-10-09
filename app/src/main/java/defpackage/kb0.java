package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class kb0 extends x {
    public final Object[] g;
    public final er0 h;

    public kb0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.g = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.h = new er0(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        er0 er0Var = this.h;
        if (er0Var.hasNext()) {
            this.e++;
            return er0Var.next();
        }
        int i = this.e;
        this.e = i + 1;
        return this.g[i - er0Var.f];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.e;
        er0 er0Var = this.h;
        int i2 = er0Var.f;
        if (i <= i2) {
            this.e = i - 1;
            return er0Var.previous();
        }
        int i3 = i - 1;
        this.e = i3;
        return this.g[i3 - i2];
    }
}
