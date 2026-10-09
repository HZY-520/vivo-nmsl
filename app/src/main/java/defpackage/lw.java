package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class lw {
    public static final v6 n;
    public static v6 o;
    public static final h6 a = new h6(Float.POSITIVE_INFINITY);
    public static final i6 b = new i6(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final j6 c = new j6(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final k6 d = new k6(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final h6 e = new h6(Float.NEGATIVE_INFINITY);
    public static final i6 f = new i6(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final j6 g = new j6(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final k6 h = new k6(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final bb i = new bb();
    public static final int[] j = new int[0];
    public static final long[] k = new long[0];
    public static final Object[] l = new Object[0];
    public static final cu m = new cu(false);
    public static final StackTraceElement[] p = new StackTraceElement[0];
    public static final ot0 q = new ot0(1);
    public static final mm r = new mm("NO_VALUE", 1);
    public static final kr0 s = new kr0(new xs0(0), new xs0(17));
    public static final kr0 t = new kr0(new xs0(1), new xs0(2));
    public static final kr0 u = new kr0(new xs0(3), new xs0(4));
    public static final kr0 v = new kr0(new xs0(5), new xs0(6));
    public static final kr0 w = new kr0(new xs0(7), new xs0(8));
    public static final kr0 x = new kr0(new xs0(9), new xs0(10));
    public static final kr0 y = new kr0(new xs0(11), new xs0(12));
    public static final kr0 z = new kr0(new xs0(13), new xs0(14));
    public static final kr0 A = new kr0(new xs0(15), new xs0(16));

    static {
        Object obj = null;
        n = new v6(obj, obj, obj);
    }

    public static final void A(ja jaVar, ng ngVar, boolean z2) {
        Object q2 = jaVar.q();
        Throwable e2 = jaVar.e(q2);
        Object qf0Var = e2 != null ? new qf0(e2) : jaVar.f(q2);
        if (!z2) {
            ngVar.resumeWith(qf0Var);
            return;
        }
        ngVar.getClass();
        lj ljVar = (lj) ngVar;
        og ogVar = ljVar.i;
        Object obj = ljVar.k;
        tg context = ogVar.getContext();
        Object R = kw.R(context, obj);
        cs0 l0 = R != kw.s ? nh.l0(ogVar, context, R) : null;
        try {
            ogVar.resumeWith(qf0Var);
            if (l0 == null || l0.e0()) {
                kw.M(context, R);
            }
        } catch (Throwable th) {
            if (l0 == null || l0.e0()) {
                kw.M(context, R);
            }
            throw th;
        }
    }

    public static final bw B(oe0 oe0Var) {
        return new bw(Math.round(oe0Var.a), Math.round(oe0Var.b), Math.round(oe0Var.c), Math.round(oe0Var.d));
    }

    public static void C(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static final void D(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static void E(String str) {
        id idVar = new id(j2.j("lateinit property ", str, " has not been initialized"));
        C(idVar, lw.class.getName());
        throw idVar;
    }

    public static final int F(long j2) {
        float[] fArr = qc.a;
        return (int) (gc.a(j2, qc.e) >>> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [zd0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList G(kl0 kl0Var, int i2, Integer num) {
        ?? zd0Var = new zd0(kl0Var);
        int o2 = kl0Var.o(i2);
        er a2 = kl0Var.a(i2);
        while (i2 >= 0) {
            zd0Var.c(kl0Var.h(i2), kl0Var.i(i2) ? kl0Var.n(kl0Var.b, i2) : re.a, kl0Var.a.e(i2), num);
            if (o2 >= 0) {
                er erVar = a2;
                a2 = kl0Var.a(o2);
                i2 = o2;
                o2 = kl0Var.o(o2);
                num = erVar;
            } else {
                i2 = o2;
                num = a2;
            }
        }
        return zd0Var.a;
    }

    public static void H(View view, float[] fArr, float[] fArr2, int[] iArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            H((View) parent, fArr, fArr2, iArr);
            q3.K(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            q3.K(fArr, view.getLeft(), view.getTop(), fArr2);
        } else {
            view.getLocationInWindow(iArr);
            q3.K(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            q3.K(fArr, iArr[0], iArr[1], fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        lr0.H(fArr2, matrix);
        q3.J(fArr, fArr2);
    }

    public static final int I(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static o9 a(int i2, int i3, m9 m9Var) {
        int i4 = i3 & 2;
        m9 m9Var2 = m9.e;
        if (i4 != 0) {
            m9Var = m9Var2;
        }
        if (i2 == -2) {
            if (m9Var != m9Var2) {
                return new qf(1, m9Var);
            }
            va.b.getClass();
            return new o9(ua.b);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? m9Var == m9Var2 ? new o9(i2) : new qf(i2, m9Var) : new o9(Integer.MAX_VALUE) : m9Var == m9Var2 ? new o9(0) : new qf(1, m9Var);
        }
        if (m9Var == m9Var2) {
            return new qf(1, m9.f);
        }
        z6.l("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long b(float f2, float f3, float f4, float f5, nc ncVar) {
        int i2;
        int i3;
        int i4;
        float b2;
        float a2;
        int i5;
        int i6;
        int i7;
        int i8;
        float b3;
        float a3;
        int i9;
        int i10;
        int i11;
        if (ncVar.c()) {
            float f6 = f5 < 0.0f ? 0.0f : f5;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f2 < 0.0f ? 0.0f : f2;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f3 < 0.0f ? 0.0f : f3;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i14 = i13 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            long j2 = (i14 | ((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 255.0f) + 0.5f))) << 32;
            int i15 = gc.g;
            return j2;
        }
        if (((int) (ncVar.b >> 32)) != 3) {
            bv.a("Color only works with ColorSpaces with 3 components");
        }
        int i16 = ncVar.c;
        if (i16 == -1) {
            bv.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float b4 = ncVar.b(0);
        float a4 = ncVar.a(0);
        if (f2 >= b4) {
            b4 = f2;
        }
        if (b4 <= a4) {
            a4 = b4;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a4);
        int i17 = floatToRawIntBits >>> 31;
        int i18 = (floatToRawIntBits >>> 23) & 255;
        int i19 = floatToRawIntBits & 8388607;
        if (i18 == 255) {
            i3 = i19 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i18 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else if (i2 > 0) {
                int i20 = i19 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i20) + 1) | (i17 << 15);
                    short s2 = (short) i4;
                    b2 = ncVar.b(1);
                    a2 = ncVar.a(1);
                    if (f3 >= b2) {
                        b2 = f3;
                    }
                    if (b2 <= a2) {
                        a2 = b2;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a2);
                    int i21 = floatToRawIntBits2 >>> 31;
                    i5 = (floatToRawIntBits2 >>> 23) & 255;
                    int i22 = floatToRawIntBits2 & 8388607;
                    if (i5 != 255) {
                        i7 = i22 != 0 ? 512 : 0;
                        i6 = 31;
                    } else {
                        i6 = i5 - 112;
                        if (i6 >= 31) {
                            i7 = 0;
                            i6 = 49;
                        } else if (i6 > 0) {
                            int i23 = i22 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i8 = (((i6 << 10) | i23) + 1) | (i21 << 15);
                                short s3 = (short) i8;
                                b3 = ncVar.b(2);
                                a3 = ncVar.a(2);
                                if (f4 >= b3) {
                                    b3 = f4;
                                }
                                if (b3 <= a3) {
                                    a3 = b3;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(a3);
                                int i24 = floatToRawIntBits3 >>> 31;
                                i9 = (floatToRawIntBits3 >>> 23) & 255;
                                int i25 = 8388607 & floatToRawIntBits3;
                                if (i9 == 255) {
                                    i10 = i25 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i26 = i9 - 112;
                                    if (i26 >= 31) {
                                        i10 = 0;
                                        r7 = 49;
                                    } else if (i26 > 0) {
                                        int i27 = i25 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i11 = (((i26 << 10) | i27) + 1) | (i24 << 15);
                                            long j3 = (i16 & 63) | ((s2 & 65535) << 48) | ((s3 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            int i28 = gc.g;
                                            return j3;
                                        }
                                        i10 = i27;
                                        r7 = i26;
                                    } else if (i26 >= -10) {
                                        int i29 = (i25 | 8388608) >> (1 - i26);
                                        if ((i29 & 4096) != 0) {
                                            i29 += 8192;
                                        }
                                        i10 = i29 >> 13;
                                    } else {
                                        i10 = 0;
                                    }
                                }
                                i11 = i10 | (i24 << 15) | (r7 << 10);
                                if (f5 >= 0.0f) {
                                }
                                long j32 = (i16 & 63) | ((s2 & 65535) << 48) | ((s3 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                int i282 = gc.g;
                                return j32;
                            }
                            i7 = i23;
                        } else if (i6 >= -10) {
                            int i30 = (i22 | 8388608) >> (1 - i6);
                            if ((i30 & 4096) != 0) {
                                i30 += 8192;
                            }
                            i7 = i30 >> 13;
                            i6 = 0;
                        } else {
                            i7 = 0;
                            i6 = 0;
                        }
                    }
                    i8 = i7 | (i21 << 15) | (i6 << 10);
                    short s32 = (short) i8;
                    b3 = ncVar.b(2);
                    a3 = ncVar.a(2);
                    if (f4 >= b3) {
                    }
                    if (b3 <= a3) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a3);
                    int i242 = floatToRawIntBits32 >>> 31;
                    i9 = (floatToRawIntBits32 >>> 23) & 255;
                    int i252 = 8388607 & floatToRawIntBits32;
                    if (i9 == 255) {
                    }
                    i11 = i10 | (i242 << 15) | (r7 << 10);
                    if (f5 >= 0.0f) {
                    }
                    long j322 = (i16 & 63) | ((s2 & 65535) << 48) | ((s32 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    int i2822 = gc.g;
                    return j322;
                }
                i3 = i20;
            } else if (i2 >= -10) {
                int i31 = (i19 | 8388608) >> (1 - i2);
                if ((i31 & 4096) != 0) {
                    i31 += 8192;
                }
                i3 = i31 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
        }
        i4 = i3 | (i17 << 15) | (i2 << 10);
        short s22 = (short) i4;
        b2 = ncVar.b(1);
        a2 = ncVar.a(1);
        if (f3 >= b2) {
        }
        if (b2 <= a2) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a2);
        int i212 = floatToRawIntBits22 >>> 31;
        i5 = (floatToRawIntBits22 >>> 23) & 255;
        int i222 = floatToRawIntBits22 & 8388607;
        if (i5 != 255) {
        }
        i8 = i7 | (i212 << 15) | (i6 << 10);
        short s322 = (short) i8;
        b3 = ncVar.b(2);
        a3 = ncVar.a(2);
        if (f4 >= b3) {
        }
        if (b3 <= a3) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a3);
        int i2422 = floatToRawIntBits322 >>> 31;
        i9 = (floatToRawIntBits322 >>> 23) & 255;
        int i2522 = 8388607 & floatToRawIntBits322;
        if (i9 == 255) {
        }
        i11 = i10 | (i2422 << 15) | (r7 << 10);
        if (f5 >= 0.0f) {
        }
        long j3222 = (i16 & 63) | ((s22 & 65535) << 48) | ((s322 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        int i28222 = gc.g;
        return j3222;
    }

    public static final long c(int i2) {
        long j2 = i2 << 32;
        int i3 = gc.g;
        return j2;
    }

    public static final long d(long j2) {
        long j3 = j2 << 32;
        int i2 = gc.g;
        return j3;
    }

    public static long e(int i2, int i3, int i4) {
        return c(((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final wi f(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        sp a2 = tp.a(f2);
        if (a2 == null) {
            a2 = new tz(f2);
        }
        return new wi(f3, f2, a2);
    }

    public static s4 g(int i2, int i3, int i4) {
        ColorSpace colorSpace;
        ColorSpace.Rgb rgb;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace.Named named;
        ColorSpace colorSpace4;
        ColorSpace.Named named2;
        ColorSpace.Named named3;
        bg0 bg0Var = qc.e;
        t10.E(i4);
        Bitmap.Config E = t10.E(i4);
        if (i(bg0Var, bg0Var)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (i(bg0Var, qc.q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (i(bg0Var, qc.r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (i(bg0Var, qc.o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (i(bg0Var, qc.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (i(bg0Var, qc.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (i(bg0Var, qc.t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (i(bg0Var, qc.s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (i(bg0Var, qc.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (i(bg0Var, qc.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (i(bg0Var, qc.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (i(bg0Var, qc.h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (i(bg0Var, qc.f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (i(bg0Var, qc.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (i(bg0Var, qc.p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (i(bg0Var, qc.n)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 34) {
                if (i(bg0Var, qc.v)) {
                    named3 = ColorSpace.Named.BT2020_HLG;
                    colorSpace4 = ColorSpace.get(named3);
                } else if (i(bg0Var, qc.w)) {
                    named2 = ColorSpace.Named.BT2020_PQ;
                    colorSpace4 = ColorSpace.get(named2);
                } else {
                    colorSpace4 = null;
                }
                if (colorSpace4 != null) {
                    colorSpace2 = colorSpace4;
                    return new s4(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, E, true, colorSpace2));
                }
            }
            if (i5 >= 36) {
                if (i(bg0Var, qc.x)) {
                    named = ColorSpace.Named.OK_LAB;
                    colorSpace3 = ColorSpace.get(named);
                } else {
                    colorSpace3 = null;
                }
                if (colorSpace3 != null) {
                    colorSpace2 = colorSpace3;
                    return new s4(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, E, true, colorSpace2));
                }
            }
            if (bg0Var != null) {
                String str = bg0Var.a;
                float[] a2 = bg0Var.d.a();
                yq0 yq0Var = bg0Var.g;
                ColorSpace.Rgb.TransferParameters transferParameters = yq0Var != null ? new ColorSpace.Rgb.TransferParameters(yq0Var.b, yq0Var.c, yq0Var.d, yq0Var.e, yq0Var.f, yq0Var.g, yq0Var.a) : null;
                float[] fArr = bg0Var.i;
                final int i6 = 0;
                if (transferParameters != null) {
                    rgb = new ColorSpace.Rgb(str, bg0Var.h, a2, transferParameters);
                    if (!Float.isNaN(fArr[0]) && !Arrays.equals(rgb.getTransform(), fArr)) {
                        colorSpace = new ColorSpace.Rgb(str, fArr, transferParameters);
                    }
                } else {
                    float[] fArr2 = bg0Var.h;
                    final ag0 ag0Var = bg0Var.l;
                    DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: oc
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d2) {
                            int i7 = i6;
                            pq pqVar = ag0Var;
                            switch (i7) {
                            }
                            return ((Number) pqVar.invoke(Double.valueOf(d2))).doubleValue();
                        }
                    };
                    final ag0 ag0Var2 = bg0Var.o;
                    final int i7 = 1;
                    rgb = new ColorSpace.Rgb(str, fArr2, a2, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: oc
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d2) {
                            int i72 = i7;
                            pq pqVar = ag0Var2;
                            switch (i72) {
                            }
                            return ((Number) pqVar.invoke(Double.valueOf(d2))).doubleValue();
                        }
                    }, bg0Var.e, bg0Var.f);
                }
                colorSpace2 = rgb;
                return new s4(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, E, true, colorSpace2));
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        colorSpace2 = colorSpace;
        return new s4(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, E, true, colorSpace2));
    }

    public static void h(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = vw.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = kc0.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static boolean i(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final int j(int[] iArr, int i2, int i3) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int k(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [zd0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [er] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List l(ol0 ol0Var, Integer num, int i2, Integer num2) {
        int i3;
        int q2;
        h40 h40Var;
        if (ol0Var.w || ol0Var.n() == 0) {
            return um.e;
        }
        ?? zd0Var = new zd0(ol0Var);
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = ol0Var.v;
            if (i3 < 0) {
                i3 = ol0Var.B(ol0Var.b, i2);
            }
        }
        if (num == 0) {
            int K = ol0Var.i - ol0Var.K(ol0Var.b, ol0Var.p(i2));
            y30 y30Var = ol0Var.s;
            num = Integer.valueOf(K + ((y30Var == null || (h40Var = (h40) y30Var.b(i2)) == null) ? 0 : h40Var.b));
        }
        int p2 = ol0Var.p(i2) * 5;
        int[] iArr = ol0Var.b;
        if (p2 < iArr.length) {
            q2 = ol0Var.q(i2);
        } else {
            int B = i3 >= 0 ? ol0Var.B(iArr, i3) : i3;
            q2 = ol0Var.q(i3);
            int i4 = i3;
            i3 = B;
            i2 = i4;
        }
        while (i2 >= 0) {
            zd0Var.c(q2, (ol0Var.b[(ol0Var.p(i2) * 5) + 1] & 536870912) != 0 ? ol0Var.r(i2) : re.a, ol0Var.L(i2), num);
            num = ol0Var.b(i2);
            if (i3 >= 0) {
                int B2 = ol0Var.B(ol0Var.b, i3);
                q2 = ol0Var.q(i3);
                int i5 = i3;
                i3 = B2;
                i2 = i5;
            } else {
                i2 = i3;
            }
        }
        return zd0Var.a;
    }

    public static int m(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int n(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long o(long j2, long j3) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long a2 = gc.a(j2, gc.e(j3));
        float c2 = gc.c(j3);
        float c3 = gc.c(a2);
        float f2 = 1.0f - c3;
        float f3 = (c2 * f2) + c3;
        float g2 = f3 == 0.0f ? 0.0f : (((gc.g(j3) * c2) * f2) + (gc.g(a2) * c3)) / f3;
        float f4 = f3 == 0.0f ? 0.0f : (((gc.f(j3) * c2) * f2) + (gc.f(a2) * c3)) / f3;
        float d2 = f3 == 0.0f ? 0.0f : (((gc.d(j3) * c2) * f2) + (gc.d(a2) * c3)) / f3;
        if (gc.e(j3).c()) {
            return (((int) ((d2 * 255.0f) + 0.5f)) | (((((int) ((f3 * 255.0f) + 0.5f)) << 24) | (((int) ((g2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f4 * 255.0f) + 0.5f)) << 8))) << 32;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(g2);
        int i11 = floatToRawIntBits >>> 31;
        int i12 = (floatToRawIntBits >>> 23) & 255;
        int i13 = floatToRawIntBits & 8388607;
        int i14 = 49;
        int i15 = 0;
        if (i12 == 255) {
            i3 = i13 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i12 - 112;
            if (i2 >= 31) {
                i2 = 49;
                i3 = 0;
            } else if (i2 > 0) {
                int i16 = i13 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i16) + 1) | (i11 << 15);
                    short s2 = (short) i4;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f4);
                    int i17 = floatToRawIntBits2 >>> 31;
                    i5 = (floatToRawIntBits2 >>> 23) & 255;
                    int i18 = floatToRawIntBits2 & 8388607;
                    if (i5 != 255) {
                        i7 = i18 != 0 ? 512 : 0;
                        i6 = 31;
                    } else {
                        i6 = i5 - 112;
                        if (i6 >= 31) {
                            i6 = 49;
                            i7 = 0;
                        } else if (i6 > 0) {
                            int i19 = i18 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i8 = (((i6 << 10) | i19) + 1) | (i17 << 15);
                                short s3 = (short) i8;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(d2);
                                int i20 = floatToRawIntBits3 >>> 31;
                                i9 = (floatToRawIntBits3 >>> 23) & 255;
                                int i21 = 8388607 & floatToRawIntBits3;
                                if (i9 == 255) {
                                    i14 = 31;
                                    i15 = i21 == 0 ? 0 : 512;
                                } else {
                                    int i22 = i9 - 112;
                                    if (i22 < 31) {
                                        if (i22 > 0) {
                                            i15 = i21 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i10 = (((i22 << 10) | i15) + 1) | (i20 << 15);
                                                return ((((short) i10) & 65535) << 16) | ((s2 & 65535) << 48) | ((s3 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f3, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.c & 63);
                                            }
                                            i14 = i22;
                                        } else if (i22 >= -10) {
                                            int i23 = (i21 | 8388608) >> (1 - i22);
                                            if ((i23 & 4096) != 0) {
                                                i23 += 8192;
                                            }
                                            i14 = 0;
                                            i15 = i23 >> 13;
                                        } else {
                                            i14 = 0;
                                        }
                                    }
                                }
                                i10 = (i20 << 15) | (i14 << 10) | i15;
                                return ((((short) i10) & 65535) << 16) | ((s2 & 65535) << 48) | ((s3 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f3, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.c & 63);
                            }
                            i7 = i19;
                        } else if (i6 >= -10) {
                            int i24 = (i18 | 8388608) >> (1 - i6);
                            if ((i24 & 4096) != 0) {
                                i24 += 8192;
                            }
                            i7 = i24 >> 13;
                            i6 = 0;
                        } else {
                            i7 = 0;
                            i6 = 0;
                        }
                    }
                    i8 = i7 | (i17 << 15) | (i6 << 10);
                    short s32 = (short) i8;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(d2);
                    int i202 = floatToRawIntBits32 >>> 31;
                    i9 = (floatToRawIntBits32 >>> 23) & 255;
                    int i212 = 8388607 & floatToRawIntBits32;
                    if (i9 == 255) {
                    }
                    i10 = (i202 << 15) | (i14 << 10) | i15;
                    return ((((short) i10) & 65535) << 16) | ((s2 & 65535) << 48) | ((s32 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f3, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.c & 63);
                }
                i3 = i16;
            } else if (i2 >= -10) {
                int i25 = (i13 | 8388608) >> (1 - i2);
                if ((i25 & 4096) != 0) {
                    i25 += 8192;
                }
                i3 = i25 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
        }
        i4 = i3 | (i11 << 15) | (i2 << 10);
        short s22 = (short) i4;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f4);
        int i172 = floatToRawIntBits22 >>> 31;
        i5 = (floatToRawIntBits22 >>> 23) & 255;
        int i182 = floatToRawIntBits22 & 8388607;
        if (i5 != 255) {
        }
        i8 = i7 | (i172 << 15) | (i6 << 10);
        short s322 = (short) i8;
        int floatToRawIntBits322 = Float.floatToRawIntBits(d2);
        int i2022 = floatToRawIntBits322 >>> 31;
        i9 = (floatToRawIntBits322 >>> 23) & 255;
        int i2122 = 8388607 & floatToRawIntBits322;
        if (i9 == 255) {
        }
        i10 = (i2022 << 15) | (i14 << 10) | i15;
        return ((((short) i10) & 65535) << 16) | ((s22 & 65535) << 48) | ((s322 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f3, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.c & 63);
    }

    public static final l6 p(l6 l6Var) {
        l6 c2 = l6Var.c();
        int b2 = c2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            c2.e(l6Var.a(i2), i2);
        }
        return c2;
    }

    public static final hp q(Context context) {
        i2 i2Var = new i2(3);
        context.getApplicationContext();
        return new hp(i2Var, new o4(Build.VERSION.SDK_INT >= 31 ? yp.a.a(context) : 0));
    }

    public static cu0 r(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                newInstance.getClass();
                return (cu0) newInstance;
            } catch (IllegalAccessException e2) {
                z6.i("Cannot create an instance of ", cls, e2);
                return null;
            } catch (InstantiationException e3) {
                z6.i("Cannot create an instance of ", cls, e3);
                return null;
            }
        } catch (NoSuchMethodException e4) {
            z6.i("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    public static long s(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int min = Math.min(i4, 262142);
        int min2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    xf.j(i7);
                    throw new id();
                }
                i6 = 8190;
            }
        }
        return xf.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, min, min2);
    }

    public static long t(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int min = Math.min(i2, 262142);
        int min2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    xf.j(i7);
                    throw new id();
                }
                i6 = 8190;
            }
        }
        return xf.a(min, min2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    public static h00 u() {
        v6 v6Var = lc0.a;
        v6Var.getClass();
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((ic0) v6Var.c)) {
            try {
                h00 h00Var = (h00) v6Var.b;
                if (h00Var != null && localeList == ((LocaleList) v6Var.a)) {
                    return h00Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(new g00(localeList.get(i2)));
                }
                h00 h00Var2 = new h00(arrayList);
                v6Var.a = localeList;
                v6Var.b = h00Var2;
                return h00Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static u20 v(u20 u20Var, float f2, long j2, tk0 tk0Var, boolean z2, long j3, long j4, int i2) {
        return u20Var.c(new fs(1.0f, 1.0f, 1.0f, 0.0f, 0.0f, (i2 & 32) != 0 ? 0.0f : f2, 0.0f, 0.0f, 0.0f, 8.0f, (i2 & 1024) != 0 ? zq0.a : j2, (i2 & 2048) != 0 ? q : tk0Var, z2, (i2 & 16384) != 0 ? is.a : j3, (i2 & 32768) != 0 ? is.a : j4, 0, 3, null, sx.a));
    }

    public static final void w(tg tgVar, Throwable th) {
        try {
            wg wgVar = (wg) tgVar.j(b2.E);
            if (wgVar != null) {
                wgVar.k(tgVar, th);
            } else {
                kw.w(tgVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                h(runtimeException, th);
                th = runtimeException;
            }
            kw.w(tgVar, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void x(il ilVar) {
        if (((t20) ilVar).e.r) {
            nh.Y(ilVar, 1).I0();
        }
    }

    public static final boolean y(qj0 qj0Var) {
        ak0 ak0Var = yj0.s;
        k40 k40Var = qj0Var.e;
        Object g2 = k40Var.g(ak0Var);
        if (g2 == null) {
            g2 = null;
        }
        if (i(g2, b2.A)) {
            return false;
        }
        return k40Var.b(pj0.f) || k40Var.b(pj0.g);
    }

    public static final boolean z(iy iyVar) {
        if (iyVar.l == null) {
            return false;
        }
        iy n2 = iyVar.n();
        if ((n2 != null ? n2.l : null) == null) {
            return true;
        }
        iyVar.I.getClass();
        return false;
    }
}
