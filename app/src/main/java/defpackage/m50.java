package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class m50 extends o40 {
    public final o40 o;
    public boolean p;

    public m50(long j, vl0 vl0Var, pq pqVar, pq pqVar2, o40 o40Var) {
        super(j, vl0Var, pqVar, pqVar2);
        this.o = o40Var;
        o40Var.k();
    }

    @Override // defpackage.o40, defpackage.ql0
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.o40
    public final m20 w() {
        m50 m50Var;
        o40 o40Var = this.o;
        if (o40Var.m || o40Var.c) {
            return new sl0(this);
        }
        l40 l40Var = this.h;
        long j = this.b;
        HashMap m = l40Var != null ? xl0.m(o40Var.g(), this, this.o.d()) : null;
        Object obj = xl0.c;
        synchronized (obj) {
            try {
                xl0.v(this);
                if (l40Var == null || l40Var.d == 0) {
                    m50Var = this;
                    m50Var.a();
                } else {
                    m50Var = this;
                    m20 z = m50Var.z(this.o.g(), l40Var, m, this.o.d());
                    if (!z.equals(tl0.c)) {
                        return z;
                    }
                    l40 x = m50Var.o.x();
                    if (x != null) {
                        x.i(l40Var);
                    } else {
                        m50Var.o.B(l40Var);
                        m50Var.h = null;
                    }
                }
                if (lw.n(m50Var.o.g(), j) < 0) {
                    m50Var.o.v();
                }
                o40 o40Var2 = m50Var.o;
                o40Var2.r(o40Var2.d().b(j).a(m50Var.j));
                m50Var.o.A(j);
                o40 o40Var3 = m50Var.o;
                int i = m50Var.d;
                m50Var.d = -1;
                if (i >= 0) {
                    int[] iArr = o40Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i;
                    o40Var3.k = copyOf;
                } else {
                    o40Var3.getClass();
                }
                o40 o40Var4 = m50Var.o;
                vl0 vl0Var = m50Var.j;
                o40Var4.getClass();
                synchronized (obj) {
                    o40Var4.j = o40Var4.j.d(vl0Var);
                    o40 o40Var5 = m50Var.o;
                    int[] iArr2 = m50Var.k;
                    o40Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = o40Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                            iArr2 = copyOf2;
                        }
                        o40Var5.k = iArr2;
                    }
                }
                m50Var.m = true;
                if (!m50Var.p) {
                    m50Var.p = true;
                    m50Var.o.l();
                }
                return tl0.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
