package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class lb0 extends x {
    public final jb0 g;
    public int h;
    public er0 i;
    public int j;

    public lb0(jb0 jb0Var, int i) {
        super(i, jb0Var.l);
        this.g = jb0Var;
        this.h = jb0Var.e();
        this.j = -1;
        b();
    }

    public final void a() {
        if (this.h != this.g.e()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.x, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.e;
        jb0 jb0Var = this.g;
        jb0Var.add(i, obj);
        this.e++;
        this.f = jb0Var.a();
        this.h = jb0Var.e();
        this.j = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        jb0 jb0Var = this.g;
        Object[] objArr = jb0Var.j;
        if (objArr == null) {
            this.i = null;
            return;
        }
        int i = (jb0Var.l - 1) & (-32);
        int i2 = this.e;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (jb0Var.h / 5) + 1;
        er0 er0Var = this.i;
        if (er0Var == null) {
            this.i = new er0(objArr, i2, i, i3);
            return;
        }
        er0Var.e = i2;
        er0Var.f = i;
        er0Var.g = i3;
        Object[] objArr2 = er0Var.h;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            er0Var.h = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        er0Var.i = r0;
        er0Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.e;
        this.j = i;
        er0 er0Var = this.i;
        jb0 jb0Var = this.g;
        if (er0Var == null) {
            Object[] objArr = jb0Var.k;
            this.e = i + 1;
            return objArr[i];
        }
        if (er0Var.hasNext()) {
            this.e++;
            return er0Var.next();
        }
        Object[] objArr2 = jb0Var.k;
        int i2 = this.e;
        this.e = i2 + 1;
        return objArr2[i2 - er0Var.f];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.e;
        this.j = i - 1;
        er0 er0Var = this.i;
        jb0 jb0Var = this.g;
        if (er0Var == null) {
            Object[] objArr = jb0Var.k;
            int i2 = i - 1;
            this.e = i2;
            return objArr[i2];
        }
        int i3 = er0Var.f;
        if (i <= i3) {
            this.e = i - 1;
            return er0Var.previous();
        }
        Object[] objArr2 = jb0Var.k;
        int i4 = i - 1;
        this.e = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.x, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.j;
        if (i == -1) {
            throw new IllegalStateException();
        }
        jb0 jb0Var = this.g;
        jb0Var.b(i);
        int i2 = this.j;
        if (i2 < this.e) {
            this.e = i2;
        }
        this.f = jb0Var.a();
        this.h = jb0Var.e();
        this.j = -1;
        b();
    }

    @Override // defpackage.x, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.j;
        if (i == -1) {
            throw new IllegalStateException();
        }
        jb0 jb0Var = this.g;
        jb0Var.set(i, obj);
        this.h = jb0Var.e();
        b();
    }
}
