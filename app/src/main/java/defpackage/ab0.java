package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class ab0 extends za0 {
    public final wa0 h;
    public Object i;
    public boolean j;
    public int k;

    public ab0(wa0 wa0Var, gr0[] gr0VarArr) {
        super(wa0Var.f, gr0VarArr);
        this.h = wa0Var;
        this.k = wa0Var.h;
    }

    public final void c(int i, fr0 fr0Var, Object obj, int i2) {
        int i3 = i2 * 5;
        gr0[] gr0VarArr = this.e;
        if (i3 <= 30) {
            int m = 1 << t30.m(i, i3);
            if (fr0Var.h(m)) {
                gr0VarArr[i2].a(fr0Var.d, Integer.bitCount(fr0Var.a) * 2, fr0Var.f(m));
                this.f = i2;
                return;
            } else {
                int t = fr0Var.t(m);
                fr0 s = fr0Var.s(t);
                gr0VarArr[i2].a(fr0Var.d, Integer.bitCount(fr0Var.a) * 2, t);
                c(i, s, obj, i2 + 1);
                return;
            }
        }
        gr0 gr0Var = gr0VarArr[i2];
        Object[] objArr = fr0Var.d;
        gr0Var.a(objArr, objArr.length, 0);
        while (true) {
            gr0 gr0Var2 = gr0VarArr[i2];
            if (lw.i(gr0Var2.e[gr0Var2.g], obj)) {
                this.f = i2;
                return;
            } else {
                gr0VarArr[i2].g += 2;
            }
        }
    }

    @Override // defpackage.za0, java.util.Iterator
    public final Object next() {
        if (this.h.h != this.k) {
            throw new ConcurrentModificationException();
        }
        if (!this.g) {
            throw new NoSuchElementException();
        }
        gr0 gr0Var = this.e[this.f];
        this.i = gr0Var.e[gr0Var.g];
        this.j = true;
        return super.next();
    }

    @Override // defpackage.za0, java.util.Iterator
    public final void remove() {
        if (!this.j) {
            throw new IllegalStateException();
        }
        boolean z = this.g;
        wa0 wa0Var = this.h;
        if (!z) {
            lr0.c(wa0Var).remove(this.i);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            gr0 gr0Var = this.e[this.f];
            Object obj = gr0Var.e[gr0Var.g];
            lr0.c(wa0Var).remove(this.i);
            c(obj != null ? obj.hashCode() : 0, wa0Var.f, obj, 0);
        }
        this.i = null;
        this.j = false;
        this.k = wa0Var.h;
    }
}
