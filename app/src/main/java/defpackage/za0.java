package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class za0 implements Iterator, fx {
    public final gr0[] e;
    public int f;
    public boolean g = true;

    public za0(fr0 fr0Var, gr0[] gr0VarArr) {
        this.e = gr0VarArr;
        gr0VarArr[0].a(fr0Var.d, Integer.bitCount(fr0Var.a) * 2, 0);
        this.f = 0;
        a();
    }

    public final void a() {
        int i = this.f;
        gr0[] gr0VarArr = this.e;
        gr0 gr0Var = gr0VarArr[i];
        if (gr0Var.g < gr0Var.f) {
            return;
        }
        while (-1 < i) {
            int b = b(i);
            if (b == -1) {
                gr0 gr0Var2 = gr0VarArr[i];
                int i2 = gr0Var2.g;
                Object[] objArr = gr0Var2.e;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    gr0Var2.g = i2 + 1;
                    b = b(i);
                }
            }
            if (b != -1) {
                this.f = b;
                return;
            }
            if (i > 0) {
                gr0 gr0Var3 = gr0VarArr[i - 1];
                int i3 = gr0Var3.g;
                int length2 = gr0Var3.e.length;
                gr0Var3.g = i3 + 1;
            }
            gr0VarArr[i].a(fr0.e.d, 0, 0);
            i--;
        }
        this.g = false;
    }

    public final int b(int i) {
        gr0[] gr0VarArr = this.e;
        gr0 gr0Var = gr0VarArr[i];
        int i2 = gr0Var.g;
        if (i2 < gr0Var.f) {
            return i;
        }
        Object[] objArr = gr0Var.e;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        fr0 fr0Var = (fr0) obj;
        if (i == 6) {
            gr0 gr0Var2 = gr0VarArr[i + 1];
            Object[] objArr2 = fr0Var.d;
            gr0Var2.a(objArr2, objArr2.length, 0);
        } else {
            gr0VarArr[i + 1].a(fr0Var.d, Integer.bitCount(fr0Var.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.g) {
            throw new NoSuchElementException();
        }
        Object next = this.e[this.f].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
