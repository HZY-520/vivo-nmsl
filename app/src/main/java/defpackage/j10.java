package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class j10 extends l10 implements Iterator, fx {
    public final /* synthetic */ int i;

    public j10(m10 m10Var, int i) {
        this.i = i;
        this.h = m10Var;
        this.f = -1;
        this.g = m10Var.l;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.i) {
            case 0:
                b();
                int i = this.e;
                m10 m10Var = (m10) this.h;
                if (i >= m10Var.j) {
                    throw new NoSuchElementException();
                }
                this.e = i + 1;
                this.f = i;
                k10 k10Var = new k10(m10Var, i);
                c();
                return k10Var;
            case 1:
                b();
                int i2 = this.e;
                m10 m10Var2 = (m10) this.h;
                if (i2 >= m10Var2.j) {
                    throw new NoSuchElementException();
                }
                this.e = i2 + 1;
                this.f = i2;
                Object obj = m10Var2.e[i2];
                c();
                return obj;
            default:
                b();
                int i3 = this.e;
                m10 m10Var3 = (m10) this.h;
                if (i3 >= m10Var3.j) {
                    throw new NoSuchElementException();
                }
                this.e = i3 + 1;
                this.f = i3;
                Object[] objArr = m10Var3.f;
                objArr.getClass();
                Object obj2 = objArr[this.f];
                c();
                return obj2;
        }
    }
}
