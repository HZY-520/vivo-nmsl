package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class p30 implements vt0 {
    public static final void a(final long j, final zp0 zp0Var, final be beVar, se seVar, final int i) {
        gr grVar = (gr) seVar;
        grVar.Q(-684938728);
        int i2 = (grVar.d(j) ? 4 : 2) | i | (grVar.e(zp0Var) ? 32 : 16);
        if (grVar.I(i2 & 1, (i2 & 147) != 146)) {
            ll llVar = kp0.a;
            nh.c(new xd0[]{dg.a.a(new gc(j)), llVar.a(((zp0) grVar.i(llVar)).c(zp0Var))}, beVar, grVar, 56);
        } else {
            grVar.L();
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new tq(j, zp0Var, beVar, i) { // from class: wd0
                public final /* synthetic */ long e;
                public final /* synthetic */ zp0 f;
                public final /* synthetic */ be g;

                @Override // defpackage.tq
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int q2 = v10.q(385);
                    p30.a(this.e, this.f, this.g, (se) obj, q2);
                    return fs0.a;
                }
            };
        }
    }

    public static final long b(int i, int i2) {
        if (i < 0 || i2 < 0) {
            dv.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = sp0.c;
        return j;
    }

    public static StaticLayout c(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            dv.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            dv.a("invalid end value");
        }
        if (i3 < 0) {
            dv.a("invalid maxLines value");
        }
        if (i < 0) {
            dv.a("invalid width value");
        }
        if (i4 < 0) {
            dv.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        obtain.setJustificationMode(i5);
        obtain.setUseLineSpacingFromFallbacks(true);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            f1.d(obtain, i7, i8);
        }
        if (i10 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static final void d(c5 c5Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double d12 = ((d2 * sin) + (d * cos)) / d10;
        double d13 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d14 = ((d4 * sin) + (d3 * cos)) / d10;
        double d15 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d20) / 1.99999d);
            d(c5Var, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d21);
        double d22 = d16 * sqrt2;
        double d23 = sqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double atan2 = Math.atan2(d13 - d9, d12 - d8);
        double atan22 = Math.atan2(d15 - d9, d14 - d8) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * cos) - (d25 * sin);
        double d27 = (d25 * cos) + (d24 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d11);
        double sin2 = Math.sin(d11);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d28 = -d10;
        double d29 = d28 * cos2;
        double d30 = d6 * sin2;
        double d31 = (d29 * sin3) - (d30 * cos3);
        double d32 = d28 * sin2;
        double d33 = d6 * cos2;
        double d34 = (cos3 * d33) + (sin3 * d32);
        double d35 = atan22 / ceil;
        double d36 = atan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < ceil) {
            double d40 = d36 + d35;
            double sin4 = Math.sin(d40);
            double cos4 = Math.cos(d40);
            int i2 = ceil;
            double d41 = (((d10 * cos2) * cos4) + d26) - (d30 * sin4);
            double d42 = (d33 * sin4) + (d10 * sin2 * cos4) + d27;
            double d43 = (d29 * sin4) - (d30 * cos4);
            double d44 = (cos4 * d33) + (sin4 * d32);
            double d45 = d40 - d36;
            double tan = Math.tan(d45 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            c5Var.a.cubicTo((float) ((d37 * sqrt3) + d), (float) ((d38 * sqrt3) + d39), (float) (d41 - (sqrt3 * d43)), (float) (d42 - (sqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            sin2 = sin2;
            d26 = d26;
            d = d41;
            i++;
            d32 = d32;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            ceil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    public static final oe0 e(t20 t20Var, boolean z, boolean z2) {
        if (!t20Var.e.r) {
            return oe0.e;
        }
        if (z) {
            return nh.Y(t20Var, 8).X0();
        }
        d60 Y = nh.Y(t20Var, 8);
        return q3.s(Y).A(Y, z2);
    }

    public static final String f(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Bundle g(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        z6.l(j2.j("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    public static int h(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        z6.l(j2.g("type needs to be >= FIRST and <= LAST, type=", i));
        return 0;
    }

    public static final void i(sj0 sj0Var) {
        nh.a0(sj0Var).z();
    }

    public static final boolean j(float f, float f2, c5 c5Var) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        c5 a = e5.a();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            e5.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = a.b;
        if (rectF == null) {
            rectF = new RectF();
            a.b = rectF;
        }
        rectF.set(f3, f4, f5, f6);
        Path path = a.a;
        RectF rectF2 = a.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        c5 a2 = e5.a();
        Path.Op op = Path.Op.INTERSECT;
        Path path2 = a2.a;
        if (!(c5Var instanceof c5)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path3 = c5Var.a;
        if (!(a instanceof c5)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path2.op(path3, a.a, op);
        boolean isEmpty = a2.a.isEmpty();
        a2.c();
        a.c();
        return !isEmpty;
    }

    public static final boolean k(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static final boolean l(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static w90 m(Object obj) {
        return new w90(obj, b2.W);
    }

    public static final void n(ol0 ol0Var, x6 x6Var, int i) {
        while (true) {
            int i2 = ol0Var.v;
            if (i > i2 && i < ol0Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            ol0Var.J();
            if (ol0Var.w(ol0Var.v)) {
                x6Var.i();
            }
            ol0Var.i();
        }
    }

    public static final void o(List list, c5 c5Var) {
        Path path;
        int i;
        float f;
        int i2;
        sa0 sa0Var;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        List list2 = list;
        Path path2 = c5Var.a;
        Path.FillType fillType = path2.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path2.rewind();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path2.setFillType(fillType2);
        sa0 sa0Var2 = list2.isEmpty() ? aa0.c : (sa0) list2.get(0);
        int size = list2.size();
        float f12 = 0.0f;
        int i3 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (i3 < size) {
            sa0 sa0Var3 = (sa0) list2.get(i3);
            if (sa0Var3 instanceof aa0) {
                path2.close();
                path = path2;
                i = size;
                f = f12;
                i2 = i3;
                sa0Var = sa0Var3;
                f13 = f17;
                f15 = f13;
                f14 = f18;
                f16 = f14;
            } else {
                if (sa0Var3 instanceof ma0) {
                    ma0 ma0Var = (ma0) sa0Var3;
                    float f19 = ma0Var.c;
                    f15 += f19;
                    float f20 = ma0Var.d;
                    f16 += f20;
                    path2.rMoveTo(f19, f20);
                    path = path2;
                    i = size;
                    f = f12;
                    i2 = i3;
                    f17 = f15;
                    f18 = f16;
                } else {
                    if (sa0Var3 instanceof ea0) {
                        ea0 ea0Var = (ea0) sa0Var3;
                        float f21 = ea0Var.c;
                        float f22 = ea0Var.d;
                        path2.moveTo(f21, f22);
                        path = path2;
                        f16 = f22;
                        f18 = f16;
                        f15 = f21;
                        f17 = f15;
                    } else {
                        if (sa0Var3 instanceof la0) {
                            la0 la0Var = (la0) sa0Var3;
                            float f23 = la0Var.d;
                            float f24 = la0Var.c;
                            path2.rLineTo(f24, f23);
                            f15 += f24;
                            f16 += f23;
                        } else if (sa0Var3 instanceof da0) {
                            da0 da0Var = (da0) sa0Var3;
                            float f25 = da0Var.d;
                            float f26 = da0Var.c;
                            path2.lineTo(f26, f25);
                            path = path2;
                            f15 = f26;
                            f16 = f25;
                        } else if (sa0Var3 instanceof ka0) {
                            float f27 = ((ka0) sa0Var3).c;
                            path2.rLineTo(f27, f12);
                            f15 += f27;
                        } else if (sa0Var3 instanceof ca0) {
                            float f28 = ((ca0) sa0Var3).c;
                            path2.lineTo(f28, f16);
                            path = path2;
                            f15 = f28;
                        } else if (sa0Var3 instanceof qa0) {
                            float f29 = ((qa0) sa0Var3).c;
                            path2.rLineTo(f12, f29);
                            f16 += f29;
                        } else if (sa0Var3 instanceof ra0) {
                            float f30 = ((ra0) sa0Var3).c;
                            path2.lineTo(f15, f30);
                            path = path2;
                            f16 = f30;
                        } else {
                            if (sa0Var3 instanceof ja0) {
                                ja0 ja0Var = (ja0) sa0Var3;
                                path2.rCubicTo(ja0Var.c, ja0Var.d, ja0Var.e, ja0Var.f, ja0Var.g, ja0Var.h);
                                f4 = ja0Var.e + f15;
                                f5 = ja0Var.f + f16;
                                f15 += ja0Var.g;
                                f11 = ja0Var.h;
                            } else {
                                if (sa0Var3 instanceof ba0) {
                                    ba0 ba0Var = (ba0) sa0Var3;
                                    path2.cubicTo(ba0Var.c, ba0Var.d, ba0Var.e, ba0Var.f, ba0Var.g, ba0Var.h);
                                    f4 = ba0Var.e;
                                    f6 = ba0Var.f;
                                    f7 = ba0Var.g;
                                    f8 = ba0Var.h;
                                } else if (sa0Var3 instanceof oa0) {
                                    if (sa0Var2.a) {
                                        f9 = f15 - f13;
                                        f10 = f16 - f14;
                                    } else {
                                        f9 = f12;
                                        f10 = f9;
                                    }
                                    oa0 oa0Var = (oa0) sa0Var3;
                                    path2.rCubicTo(f9, f10, oa0Var.c, oa0Var.d, oa0Var.e, oa0Var.f);
                                    f4 = oa0Var.c + f15;
                                    f5 = oa0Var.d + f16;
                                    f15 += oa0Var.e;
                                    f11 = oa0Var.f;
                                } else if (sa0Var3 instanceof ga0) {
                                    if (sa0Var2.a) {
                                        f15 = (f15 * 2.0f) - f13;
                                        f16 = (2.0f * f16) - f14;
                                    }
                                    ga0 ga0Var = (ga0) sa0Var3;
                                    path2.cubicTo(f15, f16, ga0Var.c, ga0Var.d, ga0Var.e, ga0Var.f);
                                    f4 = ga0Var.c;
                                    f6 = ga0Var.d;
                                    f7 = ga0Var.e;
                                    f8 = ga0Var.f;
                                } else if (sa0Var3 instanceof na0) {
                                    na0 na0Var = (na0) sa0Var3;
                                    float f31 = na0Var.f;
                                    float f32 = na0Var.e;
                                    float f33 = na0Var.d;
                                    float f34 = na0Var.c;
                                    path2.rQuadTo(f34, f33, f32, f31);
                                    float f35 = f34 + f15;
                                    float f36 = f33 + f16;
                                    f15 += f32;
                                    f16 += f31;
                                    path = path2;
                                    f13 = f35;
                                    f14 = f36;
                                } else if (sa0Var3 instanceof fa0) {
                                    fa0 fa0Var = (fa0) sa0Var3;
                                    float f37 = fa0Var.f;
                                    float f38 = fa0Var.e;
                                    float f39 = fa0Var.d;
                                    f4 = fa0Var.c;
                                    path2.quadTo(f4, f39, f38, f37);
                                    path = path2;
                                    f16 = f37;
                                    f15 = f38;
                                    f14 = f39;
                                    i = size;
                                    f = f12;
                                    i2 = i3;
                                    sa0Var = sa0Var3;
                                    f13 = f4;
                                } else if (sa0Var3 instanceof pa0) {
                                    if (sa0Var2.b) {
                                        f2 = f15 - f13;
                                        f3 = f16 - f14;
                                    } else {
                                        f2 = f12;
                                        f3 = f2;
                                    }
                                    pa0 pa0Var = (pa0) sa0Var3;
                                    float f40 = pa0Var.d;
                                    float f41 = pa0Var.c;
                                    path2.rQuadTo(f2, f3, f41, f40);
                                    f4 = f2 + f15;
                                    f5 = f3 + f16;
                                    f15 += f41;
                                    f16 += f40;
                                    path = path2;
                                    f14 = f5;
                                    i = size;
                                    f = f12;
                                    i2 = i3;
                                    sa0Var = sa0Var3;
                                    f13 = f4;
                                } else if (sa0Var3 instanceof ha0) {
                                    if (sa0Var2.b) {
                                        f15 = (f15 * 2.0f) - f13;
                                        f16 = (2.0f * f16) - f14;
                                    }
                                    ha0 ha0Var = (ha0) sa0Var3;
                                    float f42 = ha0Var.d;
                                    float f43 = ha0Var.c;
                                    path2.quadTo(f15, f16, f43, f42);
                                    path = path2;
                                    i = size;
                                    f = f12;
                                    i2 = i3;
                                    f14 = f16;
                                    sa0Var = sa0Var3;
                                    f16 = f42;
                                    f13 = f15;
                                    f15 = f43;
                                } else if (sa0Var3 instanceof ia0) {
                                    ia0 ia0Var = (ia0) sa0Var3;
                                    float f44 = ia0Var.h + f15;
                                    float f45 = ia0Var.i + f16;
                                    i = size;
                                    f = 0.0f;
                                    path = path2;
                                    i2 = i3;
                                    d(c5Var, f15, f16, f44, f45, ia0Var.c, ia0Var.d, ia0Var.e, ia0Var.f, ia0Var.g);
                                    f13 = f44;
                                    f15 = f13;
                                    f14 = f45;
                                    f16 = f14;
                                    sa0Var = sa0Var3;
                                } else {
                                    path = path2;
                                    i = size;
                                    f = f12;
                                    i2 = i3;
                                    if (!(sa0Var3 instanceof z90)) {
                                        z6.j();
                                        return;
                                    }
                                    z90 z90Var = (z90) sa0Var3;
                                    float f46 = z90Var.i;
                                    float f47 = z90Var.h;
                                    sa0Var = sa0Var3;
                                    d(c5Var, f15, f16, f47, f46, z90Var.c, z90Var.d, z90Var.e, z90Var.f, z90Var.g);
                                    f14 = f46;
                                    f16 = f14;
                                    f13 = f47;
                                    f15 = f13;
                                }
                                path = path2;
                                f15 = f7;
                                f16 = f8;
                                i = size;
                                f = f12;
                                i2 = i3;
                                sa0Var = sa0Var3;
                                f14 = f6;
                                f13 = f4;
                            }
                            f16 += f11;
                            path = path2;
                            f14 = f5;
                            i = size;
                            f = f12;
                            i2 = i3;
                            sa0Var = sa0Var3;
                            f13 = f4;
                        }
                        path = path2;
                    }
                    i = size;
                    f = f12;
                    i2 = i3;
                }
                sa0Var = sa0Var3;
            }
            i3 = i2 + 1;
            list2 = list;
            size = i;
            path2 = path;
            sa0Var2 = sa0Var;
            f12 = f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [pq] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [t20] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [t20] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [t40] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [t40] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void p(t20 t20Var, Object obj, pq pqVar) {
        y50 y50Var;
        if (!t20Var.e.r) {
            cv.b("visitAncestors called on an unattached node");
        }
        t20 t20Var2 = t20Var.e.i;
        iy a0 = nh.a0(t20Var);
        while (a0 != null) {
            if ((a0.H.f.h & 262144) != 0) {
                while (t20Var2 != null) {
                    if ((t20Var2.g & 262144) != 0) {
                        oi oiVar = t20Var2;
                        ?? r4 = 0;
                        while (oiVar != 0) {
                            if (oiVar instanceof dr0) {
                                dr0 dr0Var = (dr0) oiVar;
                                if (!(obj.equals(dr0Var.i()) ? ((Boolean) pqVar.invoke(dr0Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((oiVar.g & 262144) != 0 && (oiVar instanceof oi)) {
                                t20 t20Var3 = oiVar.t;
                                int i = 0;
                                oiVar = oiVar;
                                r4 = r4;
                                while (t20Var3 != null) {
                                    if ((t20Var3.g & 262144) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            oiVar = t20Var3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new t40(new t20[16]);
                                            }
                                            if (oiVar != 0) {
                                                r4.b(oiVar);
                                                oiVar = 0;
                                            }
                                            r4.b(t20Var3);
                                        }
                                    }
                                    t20Var3 = t20Var3.j;
                                    oiVar = oiVar;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            oiVar = nh.N(r4);
                        }
                    }
                    t20Var2 = t20Var2.i;
                }
            }
            a0 = a0.n();
            t20Var2 = (a0 == null || (y50Var = a0.H) == null) ? null : y50Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [dr0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [pq] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [t20] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [t20] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [t40] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [t40] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void q(dr0 dr0Var, pq pqVar) {
        t20 t20Var = (t20) dr0Var;
        if (!t20Var.e.r) {
            cv.b("visitSubtreeIf called on an unattached node");
        }
        t40 t40Var = new t40(new t20[16]);
        t20 t20Var2 = t20Var.e;
        t20 t20Var3 = t20Var2.j;
        if (t20Var3 == null) {
            nh.e(t40Var, t20Var2);
        } else {
            t40Var.b(t20Var3);
        }
        while (true) {
            int i = t40Var.g;
            if (i == 0) {
                return;
            }
            t20 t20Var4 = (t20) t40Var.j(i - 1);
            if ((t20Var4.h & 262144) != 0) {
                for (t20 t20Var5 = t20Var4; t20Var5 != null && t20Var5.r; t20Var5 = t20Var5.j) {
                    if ((t20Var5.g & 262144) != 0) {
                        oi oiVar = t20Var5;
                        ?? r7 = 0;
                        while (oiVar != 0) {
                            if (oiVar instanceof dr0) {
                                dr0 dr0Var2 = (dr0) oiVar;
                                cr0 cr0Var = (lw.i(dr0Var.i(), dr0Var2.i()) && dr0Var.getClass() == dr0Var2.getClass()) ? (cr0) pqVar.invoke(dr0Var2) : cr0.e;
                                if (cr0Var == cr0.g) {
                                    return;
                                }
                                if (cr0Var == cr0.f) {
                                    break;
                                }
                            } else if ((oiVar.g & 262144) != 0 && (oiVar instanceof oi)) {
                                t20 t20Var6 = oiVar.t;
                                int i2 = 0;
                                oiVar = oiVar;
                                r7 = r7;
                                while (t20Var6 != null) {
                                    if ((t20Var6.g & 262144) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            oiVar = t20Var6;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new t40(new t20[16]);
                                            }
                                            if (oiVar != 0) {
                                                r7.b(oiVar);
                                                oiVar = 0;
                                            }
                                            r7.b(t20Var6);
                                        }
                                    }
                                    t20Var6 = t20Var6.j;
                                    oiVar = oiVar;
                                    r7 = r7;
                                }
                                if (i2 == 1) {
                                }
                            }
                            oiVar = nh.N(r7);
                        }
                    }
                }
            }
            nh.e(t40Var, t20Var4);
        }
    }

    public static final double r(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }
}
