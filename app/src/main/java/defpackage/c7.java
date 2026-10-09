package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class c7 implements a7 {
    @Override // defpackage.a7
    public final void e(w00 w00Var, int i, int[] iArr, xx xxVar, int[] iArr2) {
        int i2 = 0;
        if (xxVar == xx.e) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            i6 += iArr[i2];
            i2++;
        }
        int i7 = i - i6;
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i8 = iArr[length3];
            iArr2[length3] = i7;
            i7 += i8;
        }
    }

    public final String toString() {
        return "Arrangement#Start";
    }
}
