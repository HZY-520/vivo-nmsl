package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class z30 {
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    public int e;

    public z30(int i) {
        this.a = gi0.a;
        this.b = dw.a;
        if (i >= 0) {
            d(gi0.d(i));
        } else {
            z6.l("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        r22 = r4;
        r8 = (r8 & ((~r8) << 6)) & (-9187201950435737472L);
        r8 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (r8 == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        r3 = c(r5);
        r12 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r37.e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (((r37.a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        r3 = r37.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (r3 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        if (java.lang.Long.compareUnsigned(r37.d * 32, r3 * 25) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        r3 = r37.a;
        r4 = r37.c;
        r6 = r37.b;
        r7 = (r4 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
    
        if (r14 >= r7) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cf, code lost:
    
        r27 = r8;
        r8 = r3[r14] & (-9187201950435737472L);
        r3[r14] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r14 = r14 + 1;
        r12 = r12;
        r8 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ec, code lost:
    
        r25 = r12;
        r7 = defpackage.o7.X(r3);
        r8 = r7 - 1;
        r3[r8] = (r3[r8] & 72057594037927935L) | (-72057594037927936L);
        r3[r7] = r3[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010d, code lost:
    
        if (r7 == r4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010f, code lost:
    
        r8 = r7 >> 3;
        r9 = (r7 & 7) << 3;
        r12 = (r3[r8] >> r9) & r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011c, code lost:
    
        if (r12 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0123, code lost:
    
        if (r12 == 254) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0126, code lost:
    
        r12 = java.lang.Integer.hashCode(r6[r7]) * r22;
        r13 = (r12 ^ (r12 << 16)) >>> 7;
        r14 = c(r13);
        r13 = r13 & r4;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0147, code lost:
    
        if ((((r14 - r13) & r4) / 8) != (((r7 - r13) & r4) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0149, code lost:
    
        r28 = r6;
        r3[r8] = ((~(r25 << r9)) & r3[r8]) | ((r12 & 127) << r9);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0167, code lost:
    
        r6 = r28;
        r15 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016c, code lost:
    
        r28 = r6;
        r32 = r7;
        r6 = r14 >> 3;
        r33 = r3[r6];
        r7 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017e, code lost:
    
        if (((r33 >> r7) & r25) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0180, code lost:
    
        r3[r6] = (r33 & (~(r25 << r7))) | ((r12 & 127) << r7);
        r3[r8] = (r3[r8] & (~(r25 << r9))) | (128 << r9);
        r28[r14] = r28[r32];
        r28[r32] = 0;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01be, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a4, code lost:
    
        r3[r6] = ((r12 & 127) << r7) | (r33 & (~(r25 << r7)));
        r6 = r28[r14];
        r28[r14] = r28[r32];
        r28[r32] = r6;
        r7 = r32 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011e, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01cc, code lost:
    
        r29 = r15;
        r37.e = defpackage.gi0.a(r37.c) - r37.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0253, code lost:
    
        r3 = c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0257, code lost:
    
        r14 = r3;
        r37.d++;
        r3 = r37.e;
        r4 = r37.a;
        r5 = r14 >> 3;
        r6 = r4[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0270, code lost:
    
        if (((r6 >> r8) & r25) != r20) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0272, code lost:
    
        r9 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0277, code lost:
    
        r37.e = r3 - r9;
        r3 = r37.c;
        r6 = (r6 & (~(r25 << r8))) | (r10 << r8);
        r4[r5] = r6;
        r4[(((r14 - 7) & r3) + (r3 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0275, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01db, code lost:
    
        r25 = 255;
        r29 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e5, code lost:
    
        r3 = defpackage.gi0.b(r37.c);
        r4 = r37.a;
        r6 = r37.b;
        r7 = r37.c;
        d(r3);
        r3 = r37.a;
        r8 = r37.b;
        r9 = r37.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01fc, code lost:
    
        if (r12 >= r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x020b, code lost:
    
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r20) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x020d, code lost:
    
        r13 = r6[r12];
        r14 = java.lang.Integer.hashCode(r13) * r22;
        r14 = r14 ^ (r14 << 16);
        r15 = c(r14 >>> 7);
        r19 = r3;
        r18 = r4;
        r3 = r14 & 127;
        r14 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r3 = (r19[r14] & (~(255 << r23))) | (r3 << r23);
        r19[r14] = r3;
        r19[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r3;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x024c, code lost:
    
        r12 = r12 + 1;
        r4 = r18;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0248, code lost:
    
        r19 = r3;
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e2, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x009f, code lost:
    
        r25 = 255;
        r29 = true;
        r20 = 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = this.d;
        int i5 = -862048943;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.c;
        int i10 = i7 & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            boolean z2 = true;
            int i14 = i11;
            long j = (((-i13) >> 63) & (jArr[i12 + 1] << (64 - i13))) | (jArr[i12] >>> i13);
            long j2 = i8;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j4) >> 3) + i10) & i9;
                int i15 = i5;
                if (this.b[i3] == i) {
                    z = true;
                    break loop0;
                }
                j4 &= j4 - 1;
                i5 = i15;
            }
            i11 = i14 + 8;
            i10 = (i10 + i11) & i9;
            i5 = i2;
        }
        this.b[i3] = i;
        if (this.d != i4) {
            return z;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.c;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.b[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        return i2 >= 0;
    }

    public final int c(int i) {
        int i2 = this.c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void d(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, gi0.c(i)) : 0;
        this.c = max;
        if (max == 0) {
            jArr = gi0.a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            o7.W(jArr);
        }
        this.a = jArr;
        int i2 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.e = gi0.a(this.c) - this.d;
        this.b = new int[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.c;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.b[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        boolean z = i2 >= 0;
        if (z) {
            f(i2);
        }
        return z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z30)) {
            return false;
        }
        z30 z30Var = (z30) obj;
        if (z30Var.d != this.d) {
            return false;
        }
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !z30Var.b(iArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final void f(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        i2 = Integer.hashCode(iArr[(i << 3) + i4]) + i2;
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = iArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(i5);
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ z30() {
        this(6);
    }
}
