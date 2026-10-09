package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class t4 {
    public int a;
    public Object b;
    public Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public int a(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        int i8 = i & 33554431;
        long[] jArr = (long[]) this.b;
        int i9 = this.a;
        int i10 = i9 + 3;
        this.a = i10;
        int length = jArr.length;
        if (length <= i10) {
            int max = Math.max(length * 2, i10);
            this.b = Arrays.copyOf(jArr, max);
            this.c = Arrays.copyOf((long[]) this.c, max);
        }
        long[] jArr2 = (long[]) this.b;
        jArr2[i9] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i9 + 1] = (i4 << 32) | (i5 & 4294967295L);
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (Math.min(0, 1023) << 50) | (i11 << 25) | (i & 33554431);
        if (i6 == -1) {
            return i9;
        }
        if ((i7 != -4) == false) {
            cv.b("Inserted child " + i8 + " without valid parent index");
        }
        int i12 = i7 + 2;
        long j = jArr2[i12];
        if (!((33554431 & ((int) j)) == i11)) {
            cv.b("Inserted child " + i8 + " without valid parent index or parent " + i11 + " not found");
        }
        int i13 = pe0.b;
        jArr2[i12] = ((-1151795604700004353L) & j) | (Math.min((i9 - i7) / 3, 1023) << 50);
        return i9;
    }

    public void b(long j, int i, int i2, int i3) {
        long j2;
        char c;
        int i4;
        char c2 = '2';
        if ((((int) (j >> 50)) & 1023) > 0) {
            int i5 = pe0.b;
            long j3 = -1125899873288193L;
            int i6 = 33554431;
            char c3 = 25;
            long[] jArr = (long[]) this.b;
            long[] jArr2 = (long[]) this.c;
            int i7 = this.a;
            jArr2[0] = (j & (-1125899873288193L)) | ((i & 33554431) << 25);
            int i8 = 1;
            while (i8 > 0) {
                i8--;
                long j4 = jArr2[i8];
                int i9 = ((int) j4) & i6;
                int i10 = ((int) (j4 >> c3)) & i6;
                int i11 = ((int) (j4 >> c2)) & 1023;
                int i12 = i11 == 1023 ? i7 : (i11 * 3) + i10;
                if (i10 < 0) {
                    return;
                }
                while (i10 < i7 - 2 && i10 <= i12) {
                    int i13 = i10 + 2;
                    long j5 = jArr[i13];
                    char c4 = c2;
                    int i14 = i6;
                    if ((((int) (j5 >> c3)) & i14) == i9) {
                        long j6 = jArr[i10];
                        int i15 = i10 + 1;
                        j2 = j3;
                        long j7 = jArr[i15];
                        c = c3;
                        i4 = i12;
                        jArr[i10] = ((((int) j6) + i3) & 4294967295L) | ((((int) (j6 >> 32)) + i2) << 32);
                        jArr[i15] = ((((int) j7) + i3) & 4294967295L) | ((((int) (j7 >> 32)) + i2) << 32);
                        jArr[i13] = (((j5 >> 63) & 1) << 60) | j5;
                        if ((((int) (j5 >> c4)) & 1023) > 0) {
                            int i16 = pe0.b;
                            jArr2[i8] = (j5 & j2) | (((i10 + 3) & i14) << c);
                            i8++;
                        }
                    } else {
                        j2 = j3;
                        c = c3;
                        i4 = i12;
                    }
                    i10 += 3;
                    i12 = i4;
                    i6 = i14;
                    c3 = c;
                    c2 = c4;
                    j3 = j2;
                }
                i6 = i6;
                c3 = c3;
                c2 = c2;
                j3 = j3;
            }
        }
    }
}
