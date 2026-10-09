package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class gc {
    public static final long b = lw.d(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final /* synthetic */ int g = 0;
    public final long a;

    static {
        lw.d(4282664004L);
        lw.d(4287137928L);
        lw.d(4291611852L);
        lw.d(4294967295L);
        c = lw.d(4294901760L);
        lw.d(4278255360L);
        d = lw.d(4278190335L);
        lw.d(4294967040L);
        lw.d(4278255615L);
        lw.d(4294902015L);
        e = lw.c(0);
        f = lw.b(0.0f, 0.0f, 0.0f, 0.0f, qc.u);
    }

    public /* synthetic */ gc(long j) {
        this.a = j;
    }

    public static final long a(long j, nc ncVar) {
        tf tfVar;
        nc e2 = e(j);
        int i = e2.c;
        int i2 = ncVar.c;
        if ((i | i2) < 0) {
            tfVar = dx0.n(e2, ncVar);
        } else {
            y30 y30Var = uf.a;
            int i3 = i | (i2 << 6);
            Object b2 = y30Var.b(i3);
            if (b2 == null) {
                b2 = dx0.n(e2, ncVar);
                y30Var.h(i3, b2);
            }
            tfVar = (tf) b2;
        }
        return tfVar.a(j);
    }

    public static long b(long j, float f2) {
        return lw.b(g(j), f(j), d(j), f2, e(j));
    }

    public static final float c(long j) {
        float r;
        float f2;
        if ((63 & j) == 0) {
            r = (float) p30.r((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            r = (float) p30.r((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return r / f2;
    }

    public static final float d(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) p30.r((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - wn.a;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final nc e(long j) {
        float[] fArr = qc.a;
        return qc.y[(int) (j & 63)];
    }

    public static final float f(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) p30.r((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - wn.a;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) p30.r((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - wn.a;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String h(long j) {
        return "Color(" + g(j) + ", " + f(j) + ", " + d(j) + ", " + c(j) + ", " + e(j).a + ")";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gc) {
            return this.a == ((gc) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
