package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class p80 extends u10 {
    public int b;
    public int d;
    public int f;
    public m80[] a = new m80[16];
    public int[] c = new int[16];
    public Object[] e = new Object[16];

    public final void L() {
        this.b = 0;
        this.d = 0;
        Arrays.fill(this.e, 0, this.f, (Object) null);
        this.f = 0;
    }

    public final void M(x6 x6Var, ol0 ol0Var, bf0 bf0Var, n80 n80Var) {
        if (this.b != 0) {
            o80 o80Var = new o80(this);
            while (true) {
                p80 p80Var = o80Var.d;
                m80 m80Var = p80Var.a[o80Var.a];
                er b = m80Var.b(o80Var);
                x6 x6Var2 = x6Var;
                ol0 ol0Var2 = ol0Var;
                bf0 bf0Var2 = bf0Var;
                n80 n80Var2 = n80Var;
                try {
                    m80Var.a(o80Var, x6Var2, ol0Var2, bf0Var2, n80Var2);
                    int i = o80Var.a;
                    int i2 = p80Var.b;
                    if (i < i2) {
                        m80 m80Var2 = p80Var.a[i];
                        o80Var.b += m80Var2.a;
                        o80Var.c += m80Var2.b;
                        int i3 = i + 1;
                        o80Var.a = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        x6Var = x6Var2;
                        ol0Var = ol0Var2;
                        bf0Var = bf0Var2;
                        n80Var = n80Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        L();
    }

    public final boolean N() {
        return this.b == 0;
    }

    public final void O(m80 m80Var) {
        int i = this.b;
        m80[] m80VarArr = this.a;
        if (i == m80VarArr.length) {
            m80[] m80VarArr2 = new m80[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(m80VarArr, 0, m80VarArr2, 0, i);
            this.a = m80VarArr2;
        }
        int i2 = this.d;
        int i3 = m80Var.a;
        int i4 = m80Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            o7.P(iArr, iArr2, 0, 0, length);
            this.c = iArr2;
        }
        int i7 = this.f + i4;
        Object[] objArr = this.e;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.e = objArr2;
        }
        m80[] m80VarArr3 = this.a;
        int i9 = this.b;
        this.b = i9 + 1;
        m80VarArr3[i9] = m80Var;
        this.d += m80Var.a;
        this.f += i4;
    }
}
