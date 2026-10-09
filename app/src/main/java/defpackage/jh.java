package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class jh implements nl {
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public jh(float f, float f2) {
        this.e = f;
        this.f = f2;
        if (Float.isNaN(f) || Float.isNaN(0.0f) || Float.isNaN(f2) || Float.isNaN(1.0f)) {
            fd0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", 0.0, " + f2 + ", 1.0.");
        }
        float[] fArr = new float[5];
        double d = -Math.sqrt(9.0d);
        int I = lw.I((float) ((-(d + 3.0d)) / (-6.0d)), fArr, 0);
        int I2 = lw.I((float) ((d - 3.0d) / (-6.0d)), fArr, I) + I;
        if (I2 > 1) {
            float f3 = fArr[0];
            float f4 = fArr[1];
            if (f3 > f4) {
                fArr[0] = f4;
                fArr[1] = f3;
            } else if (f3 == f4) {
                I2--;
            }
        }
        int I3 = lw.I(0.5f, fArr, I2) + I2;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i = 0; i < I3; i++) {
            float f5 = fArr[i];
            float f6 = ((((((-2.0f) * f5) + 3.0f) * f5) + 0.0f) * f5) + 0.0f;
            min = Math.min(min, f6);
            max = Math.max(max, f6);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.g = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.h = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01fd, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x022b, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b5, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x024f  */
    @Override // defpackage.nl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f) {
        float f2;
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float max = Math.max(f, 1.1920929E-7f);
        float f3 = this.e;
        float f4 = this.f;
        float f5 = f4 - max;
        double d = 0.0f - max;
        double d2 = ((d - ((f3 - max) * 2.0d)) + f5) * 3.0d;
        double d3 = (r7 - r5) * 3.0d;
        double d4 = ((r7 - f5) * 3.0d) + (-r5) + (1.0f - max);
        float f6 = Float.NaN;
        if (Math.abs(d4 - 0.0d) >= 1.0E-7d) {
            double d5 = d2 / d4;
            double d6 = d3 / d4;
            double d7 = d / d4;
            double d8 = ((d6 * 3.0d) - (d5 * d5)) / 9.0d;
            double d9 = ((d7 * 27.0d) + ((((2.0d * d5) * d5) * d5) - ((9.0d * d5) * d6))) / 54.0d;
            double d10 = d8 * d8 * d8;
            double d11 = (d9 * d9) + d10;
            double d12 = d5 / 3.0d;
            if (d11 < 0.0d) {
                double sqrt = Math.sqrt(-d10);
                double d13 = (-d9) / sqrt;
                if (d13 < -1.0d) {
                    d13 = -1.0d;
                }
                if (d13 > 1.0d) {
                    d13 = 1.0d;
                }
                double acos = Math.acos(d13);
                double q = dx0.q((float) sqrt) * 2.0f;
                float cos = (float) ((Math.cos(acos / 3.0d) * q) - d12);
                float f7 = cos < 0.0f ? 0.0f : cos;
                if (f7 > 1.0f) {
                    f7 = 1.0f;
                }
                if (Math.abs(f7 - cos) > 1.05E-6f) {
                    f7 = Float.NaN;
                }
                if (Float.isNaN(f7)) {
                    float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * q) - d12);
                    f7 = cos2 < 0.0f ? 0.0f : cos2;
                    if (f7 > 1.0f) {
                        f7 = 1.0f;
                    }
                    if (Math.abs(f7 - cos2) > 1.05E-6f) {
                        f7 = Float.NaN;
                    }
                    if (Float.isNaN(f7)) {
                        float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * q) - d12);
                        f2 = cos3 < 0.0f ? 0.0f : cos3;
                        if (f2 > 1.0f) {
                            f2 = 1.0f;
                        }
                    }
                }
                f6 = f7;
                if (Float.isNaN(f6)) {
                }
            } else if (d11 == 0.0d) {
                float f8 = -dx0.q((float) d9);
                float f9 = (float) d12;
                float f10 = (2.0f * f8) - f9;
                float f11 = f10 < 0.0f ? 0.0f : f10;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                if (Math.abs(f11 - f10) > 1.05E-6f) {
                    f11 = Float.NaN;
                }
                if (Float.isNaN(f11)) {
                    float f12 = (-f8) - f9;
                    f2 = f12 < 0.0f ? 0.0f : f12;
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                } else {
                    f6 = f11;
                }
                if (Float.isNaN(f6)) {
                }
            } else {
                double sqrt2 = Math.sqrt(d11);
                float q2 = (float) ((dx0.q((float) ((-d9) + sqrt2)) - dx0.q((float) (d9 + sqrt2))) - d12);
                f2 = q2 < 0.0f ? 0.0f : q2;
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
            }
        } else {
            if (Math.abs(d2 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d3 - 0.0d) >= 1.0E-7d) {
                    float f13 = (float) ((-d) / d3);
                    f2 = f13 < 0.0f ? 0.0f : f13;
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                }
                if (Float.isNaN(f6)) {
                    float f14 = (((((-0.6666666f) * f6) + 1.0f) * f6) + 0.0f) * 3.0f * f6;
                    float f15 = this.g;
                    if (f14 < f15) {
                        f14 = f15;
                    }
                    float f16 = this.h;
                    return f14 > f16 ? f16 : f14;
                }
                throw new IllegalArgumentException("The cubic curve with parameters (" + f3 + ", 0.0, " + f4 + ", 1.0) has no solution at " + f);
            }
            double sqrt3 = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
            double d14 = d2 * 2.0d;
            float f17 = (float) ((sqrt3 - d3) / d14);
            float f18 = f17 < 0.0f ? 0.0f : f17;
            if (f18 > 1.0f) {
                f18 = 1.0f;
            }
            if (Math.abs(f18 - f17) > 1.05E-6f) {
                f18 = Float.NaN;
            }
            if (Float.isNaN(f18)) {
                float f19 = (float) (((-d3) - sqrt3) / d14);
                f2 = f19 < 0.0f ? 0.0f : f19;
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
            } else {
                f6 = f18;
            }
            if (Float.isNaN(f6)) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jh)) {
            return false;
        }
        jh jhVar = (jh) obj;
        return this.e == jhVar.e && this.f == jhVar.f;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + j2.a(this.f, j2.a(0.0f, Float.hashCode(this.e) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.e + ", b=0.0, c=" + this.f + ", d=1.0)";
    }
}
