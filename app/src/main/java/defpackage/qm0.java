package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class qm0 implements Cloneable {
    public /* synthetic */ int[] e;
    public /* synthetic */ Object[] f;
    public /* synthetic */ int g;

    public qm0() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.e = new int[i4];
        this.f = new Object[i4];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qm0 clone() {
        Object clone = super.clone();
        clone.getClass();
        qm0 qm0Var = (qm0) clone;
        qm0Var.e = (int[]) this.e.clone();
        qm0Var.f = (Object[]) this.f.clone();
        return qm0Var;
    }

    public final boolean b(int i) {
        return lw.j(this.e, this.g, i) >= 0;
    }

    public final void c(int i, Object obj) {
        int j = lw.j(this.e, this.g, i);
        if (j >= 0) {
            this.f[j] = obj;
            return;
        }
        int i2 = ~j;
        int i3 = this.g;
        if (i2 < i3) {
            Object[] objArr = this.f;
            if (objArr[i2] == q3.o) {
                this.e[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.e.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.e = Arrays.copyOf(this.e, i7);
            this.f = Arrays.copyOf(this.f, i7);
        }
        int i8 = this.g;
        if (i8 - i2 != 0) {
            int[] iArr = this.e;
            int i9 = i2 + 1;
            o7.P(iArr, iArr, i9, i2, i8);
            Object[] objArr2 = this.f;
            o7.R(objArr2, objArr2, i9, i2, this.g);
        }
        this.e[i2] = i;
        this.f[i2] = obj;
        this.g++;
    }

    public final Object d(int i) {
        Object[] objArr = this.f;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i = this.g;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.g;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.e[i3]);
            sb.append('=');
            Object d = d(i3);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
