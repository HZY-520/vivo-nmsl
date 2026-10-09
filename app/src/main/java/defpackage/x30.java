package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class x30 {
    public int[] a;
    public int b;

    public x30(int i) {
        this.a = i == 0 ? dw.a : new int[i];
    }

    public final void a(int i) {
        int i2 = this.b + 1;
        int[] iArr = this.a;
        if (iArr.length < i2) {
            iArr = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
            this.a = iArr;
        }
        int i3 = this.b;
        iArr[i3] = i;
        this.b = i3 + 1;
    }

    public final int b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        z6.f("Index must be between 0 and size");
        return 0;
    }

    public final void c(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            z6.f("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            o7.P(iArr, iArr, i, i + 1, i2);
        }
        this.b--;
    }

    public final void d(int i, int i2) {
        if (i < 0 || i >= this.b) {
            z6.f("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x30) {
            x30 x30Var = (x30) obj;
            int i = x30Var.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = x30Var.a;
                aw C = t30.C(0, i2);
                int i3 = C.e;
                int i4 = C.f;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ x30() {
        this(16);
    }
}
