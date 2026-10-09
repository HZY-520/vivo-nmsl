package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class b7 implements a7, e7 {
    public final float e;
    public final z6 f;
    public final float g;

    public b7(float f, z6 z6Var) {
        this.e = f;
        this.f = z6Var;
        this.g = f;
    }

    @Override // defpackage.a7, defpackage.e7
    public final float a() {
        return this.g;
    }

    @Override // defpackage.a7
    public final void e(w00 w00Var, int i, int[] iArr, xx xxVar, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int D = w00Var.D(this.e);
        boolean z = xxVar == xx.f;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int max = Math.max(0, i - iArr[i3]);
                iArr2[i5] = max;
                i4 = Math.min(D, max);
                i = iArr2[i5] - i4;
                i3++;
                i5++;
            }
            i2 = i + i4;
        } else {
            int length2 = iArr.length;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i6 < length2) {
                int i10 = iArr[i6];
                int min = Math.min(i7, i - i10);
                iArr2[i9] = min;
                int min2 = Math.min(D, (i - min) - i10);
                int i11 = iArr2[i9] + i10 + min2;
                i6++;
                i8 = min2;
                i7 = i11;
                i9++;
            }
            i2 = i - (i7 - i8);
        }
        if (i2 > 0) {
            int round = Math.round((1.0f + (xxVar == xx.e ? -1.0f : 1.0f)) * (i2 / 2.0f));
            if (z) {
                round -= i2;
            }
            if (round != 0) {
                int length3 = iArr2.length;
                for (int i12 = 0; i12 < length3; i12++) {
                    iArr2[i12] = iArr2[i12] + round;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b7) {
            b7 b7Var = (b7) obj;
            return ck.b(this.e, b7Var.e) && this.f == b7Var.f;
        }
        return false;
    }

    @Override // defpackage.e7
    public final void h(int i, w00 w00Var, int[] iArr, int[] iArr2) {
        e(w00Var, i, iArr, xx.e, iArr2);
    }

    public final int hashCode() {
        return this.f.hashCode() + j2.e(true, Float.hashCode(this.e) * 31, 31);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ck.c(this.e) + ", " + this.f + ")";
    }
}
