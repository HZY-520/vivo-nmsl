package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class lp0 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public final Layout e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    public final float j;
    public final Paint.FontMetricsInt k;
    public final int l;
    public final sz[] m;
    public final Rect n = new Rect();
    public x7 o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0179 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lp0(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, zx zxVar) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout c;
        boolean z2;
        int i10;
        sz[] szVarArr;
        int i11;
        int i12;
        int i13;
        long j;
        int i14;
        long j2;
        char c2;
        int i15;
        long j3;
        long a;
        int i16;
        boolean isFallbackLineSpacingEnabled;
        boolean isFallbackLineSpacingEnabled2;
        int i17;
        Layout layout;
        int i18;
        Paint.FontMetricsInt fontMetricsInt;
        boolean z3;
        int i19;
        int i20;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic b = op0.b(i2);
        Layout.Alignment alignment = zo0.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : zo0.b : zo0.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z4 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, d8.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a2 = zxVar.a();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (a2 == null || zxVar.c() > f || z4) {
                i9 = i3;
                textDirectionHeuristic = b;
                c = p30.c(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
                z2 = false;
            } else {
                if (ceil < 0) {
                    dv.a("negative width");
                }
                if (ceil < 0) {
                    dv.a("negative ellipsized width");
                }
                c = Build.VERSION.SDK_INT >= 33 ? c1.b(charSequence, textPaint, ceil, alignment2, a2, z, truncateAt, ceil) : new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a2, z, truncateAt, ceil);
                i9 = i3;
                textDirectionHeuristic = b;
                z2 = true;
            }
            this.e = c;
            Trace.endSection();
            int min = Math.min(c.getLineCount(), i9);
            this.f = min;
            int i21 = min - 1;
            this.d = min >= i9 && (c.getEllipsisCount(i21) > 0 || c.getLineEnd(i21) != charSequence.length());
            if (c.getText() instanceof Spanned) {
                CharSequence text = c.getText();
                text.getClass();
                if (z20.n((Spanned) text, sz.class) || c.getText().length() <= 0) {
                    CharSequence text2 = c.getText();
                    text2.getClass();
                    i10 = 0;
                    szVarArr = (sz[]) ((Spanned) text2).getSpans(0, c.getText().length(), sz.class);
                    this.m = szVarArr;
                    if (szVarArr != null) {
                        sz szVar = szVarArr.length == 0 ? null : szVarArr[i10];
                        if (szVar != null) {
                            if (szVar.g) {
                                i11 = 2;
                                if (szVar.j == 2) {
                                    i20 = 1;
                                    i12 = i20;
                                    if (szVarArr != null) {
                                        sz szVar2 = szVarArr.length == 0 ? null : szVarArr[i10];
                                        if (szVar2 != null && szVar2.h && szVar2.j == i11) {
                                            i13 = 1;
                                            if (i12 != 0 || i13 == 0) {
                                                j = op0.b;
                                                if (z) {
                                                    i14 = 33;
                                                } else {
                                                    if (z2) {
                                                        BoringLayout boringLayout = (BoringLayout) c;
                                                        i14 = 33;
                                                        if (Build.VERSION.SDK_INT >= 33) {
                                                            isFallbackLineSpacingEnabled2 = boringLayout.isFallbackLineSpacingEnabled();
                                                            i16 = isFallbackLineSpacingEnabled2;
                                                        } else {
                                                            i16 = i10;
                                                        }
                                                    } else {
                                                        i14 = 33;
                                                        StaticLayout staticLayout = (StaticLayout) c;
                                                        if (Build.VERSION.SDK_INT >= 33) {
                                                            isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                                                            i16 = isFallbackLineSpacingEnabled;
                                                        } else {
                                                            i16 = 1;
                                                        }
                                                    }
                                                    if (i16 == 0) {
                                                        TextPaint paint = c.getPaint();
                                                        CharSequence text3 = c.getText();
                                                        c2 = ' ';
                                                        Rect e = m20.e(paint, text3, c.getLineStart(i10), c.getLineEnd(i10));
                                                        int lineAscent = c.getLineAscent(i10);
                                                        j2 = 4294967295L;
                                                        int i22 = e.top;
                                                        int topPadding = i22 < lineAscent ? lineAscent - i22 : c.getTopPadding();
                                                        i15 = 1;
                                                        e = min != 1 ? m20.e(paint, text3, c.getLineStart(i21), c.getLineEnd(i21)) : e;
                                                        int lineDescent = c.getLineDescent(i21);
                                                        int i23 = e.bottom;
                                                        int bottomPadding = i23 > lineDescent ? i23 - lineDescent : c.getBottomPadding();
                                                        if (topPadding != 0 || bottomPadding != 0) {
                                                            j3 = op0.a(topPadding, bottomPadding);
                                                            a = op0.a(i12 != 0 ? i10 : (int) (j3 >> c2), i13 != 0 ? i10 : (int) (j3 & j2));
                                                        }
                                                        j3 = j;
                                                        a = op0.a(i12 != 0 ? i10 : (int) (j3 >> c2), i13 != 0 ? i10 : (int) (j3 & j2));
                                                    }
                                                }
                                                c2 = ' ';
                                                j2 = 4294967295L;
                                                i15 = 1;
                                                j3 = j;
                                                a = op0.a(i12 != 0 ? i10 : (int) (j3 >> c2), i13 != 0 ? i10 : (int) (j3 & j2));
                                            } else {
                                                a = op0.b;
                                                j = a;
                                                c2 = ' ';
                                                j2 = 4294967295L;
                                                i15 = 1;
                                                i14 = 33;
                                            }
                                            if (szVarArr != null) {
                                                int length2 = szVarArr.length;
                                                int i24 = i10;
                                                int i25 = i24;
                                                for (int i26 = i25; i26 < length2; i26++) {
                                                    sz szVar3 = szVarArr[i26];
                                                    int i27 = szVar3.o;
                                                    i24 = i27 < 0 ? Math.max(i24, Math.abs(i27)) : i24;
                                                    int i28 = szVar3.p;
                                                    if (i28 < 0) {
                                                        i25 = Math.max(i24, Math.abs(i28));
                                                    }
                                                }
                                                j = (i24 == 0 && i25 == 0) ? op0.b : op0.a(i24, i25);
                                            }
                                            this.g = Math.max((int) (a >> c2), (int) (j >> c2));
                                            this.h = Math.max((int) (a & j2), (int) (j & j2));
                                            TextPaint textPaint2 = this.a;
                                            sz[] szVarArr2 = this.m;
                                            i17 = this.f - i15;
                                            layout = this.e;
                                            if (layout.getLineStart(i17) == layout.getLineEnd(i17) || szVarArr2 == null || szVarArr2.length == 0) {
                                                i18 = i10;
                                                fontMetricsInt = null;
                                            } else {
                                                SpannableString spannableString = new SpannableString("\u200b");
                                                if (szVarArr2.length == 0) {
                                                    throw new NoSuchElementException("Array is empty.");
                                                }
                                                sz szVar4 = szVarArr2[i10];
                                                int length3 = spannableString.length();
                                                if (i17 == 0 || !(z3 = szVar4.h)) {
                                                    boolean z5 = szVar4.h;
                                                    z3 = z5 ? 1 : 0;
                                                    i19 = z5;
                                                } else {
                                                    i19 = i10;
                                                }
                                                spannableString.setSpan(new sz(szVar4.e, length3, i19, z3, szVar4.i, szVar4.j), i10, spannableString.length(), i14);
                                                i18 = i10;
                                                StaticLayout c3 = p30.c(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, vx.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                                                fontMetricsInt = new Paint.FontMetricsInt();
                                                fontMetricsInt.ascent = c3.getLineAscent(i18);
                                                fontMetricsInt.descent = c3.getLineDescent(i18);
                                                fontMetricsInt.top = c3.getLineTop(i18);
                                                fontMetricsInt.bottom = c3.getLineBottom(i18);
                                            }
                                            this.l = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (c(i21) - f(i21))) : i18;
                                            this.k = fontMetricsInt;
                                            Layout layout2 = this.e;
                                            this.i = lr0.r(layout2, i21, layout2.getPaint());
                                            Layout layout3 = this.e;
                                            this.j = lr0.s(layout3, i21, layout3.getPaint());
                                        }
                                    }
                                    i13 = i10;
                                    if (i12 != 0) {
                                    }
                                    j = op0.b;
                                    if (z) {
                                    }
                                    c2 = ' ';
                                    j2 = 4294967295L;
                                    i15 = 1;
                                    j3 = j;
                                    a = op0.a(i12 != 0 ? i10 : (int) (j3 >> c2), i13 != 0 ? i10 : (int) (j3 & j2));
                                    if (szVarArr != null) {
                                    }
                                    this.g = Math.max((int) (a >> c2), (int) (j >> c2));
                                    this.h = Math.max((int) (a & j2), (int) (j & j2));
                                    TextPaint textPaint22 = this.a;
                                    sz[] szVarArr22 = this.m;
                                    i17 = this.f - i15;
                                    layout = this.e;
                                    if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                                    }
                                    i18 = i10;
                                    fontMetricsInt = null;
                                    this.l = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (c(i21) - f(i21))) : i18;
                                    this.k = fontMetricsInt;
                                    Layout layout22 = this.e;
                                    this.i = lr0.r(layout22, i21, layout22.getPaint());
                                    Layout layout32 = this.e;
                                    this.j = lr0.s(layout32, i21, layout32.getPaint());
                                }
                            } else {
                                i11 = 2;
                            }
                            i20 = i10;
                            i12 = i20;
                            if (szVarArr != null) {
                            }
                            i13 = i10;
                            if (i12 != 0) {
                            }
                            j = op0.b;
                            if (z) {
                            }
                            c2 = ' ';
                            j2 = 4294967295L;
                            i15 = 1;
                            j3 = j;
                            a = op0.a(i12 != 0 ? i10 : (int) (j3 >> c2), i13 != 0 ? i10 : (int) (j3 & j2));
                            if (szVarArr != null) {
                            }
                            this.g = Math.max((int) (a >> c2), (int) (j >> c2));
                            this.h = Math.max((int) (a & j2), (int) (j & j2));
                            TextPaint textPaint222 = this.a;
                            sz[] szVarArr222 = this.m;
                            i17 = this.f - i15;
                            layout = this.e;
                            if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                            }
                            i18 = i10;
                            fontMetricsInt = null;
                            this.l = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (c(i21) - f(i21))) : i18;
                            this.k = fontMetricsInt;
                            Layout layout222 = this.e;
                            this.i = lr0.r(layout222, i21, layout222.getPaint());
                            Layout layout322 = this.e;
                            this.j = lr0.s(layout322, i21, layout322.getPaint());
                        }
                    }
                    i11 = 2;
                    i12 = i10;
                    if (szVarArr != null) {
                    }
                    i13 = i10;
                    if (i12 != 0) {
                    }
                    j = op0.b;
                    if (z) {
                    }
                    c2 = ' ';
                    j2 = 4294967295L;
                    i15 = 1;
                    j3 = j;
                    a = op0.a(i12 != 0 ? i10 : (int) (j3 >> c2), i13 != 0 ? i10 : (int) (j3 & j2));
                    if (szVarArr != null) {
                    }
                    this.g = Math.max((int) (a >> c2), (int) (j >> c2));
                    this.h = Math.max((int) (a & j2), (int) (j & j2));
                    TextPaint textPaint2222 = this.a;
                    sz[] szVarArr2222 = this.m;
                    i17 = this.f - i15;
                    layout = this.e;
                    if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
                    }
                    i18 = i10;
                    fontMetricsInt = null;
                    this.l = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (c(i21) - f(i21))) : i18;
                    this.k = fontMetricsInt;
                    Layout layout2222 = this.e;
                    this.i = lr0.r(layout2222, i21, layout2222.getPaint());
                    Layout layout3222 = this.e;
                    this.j = lr0.s(layout3222, i21, layout3222.getPaint());
                }
            }
            szVarArr = null;
            i10 = 0;
            this.m = szVarArr;
            if (szVarArr != null) {
            }
            i11 = 2;
            i12 = i10;
            if (szVarArr != null) {
            }
            i13 = i10;
            if (i12 != 0) {
            }
            j = op0.b;
            if (z) {
            }
            c2 = ' ';
            j2 = 4294967295L;
            i15 = 1;
            j3 = j;
            a = op0.a(i12 != 0 ? i10 : (int) (j3 >> c2), i13 != 0 ? i10 : (int) (j3 & j2));
            if (szVarArr != null) {
            }
            this.g = Math.max((int) (a >> c2), (int) (j >> c2));
            this.h = Math.max((int) (a & j2), (int) (j & j2));
            TextPaint textPaint22222 = this.a;
            sz[] szVarArr22222 = this.m;
            i17 = this.f - i15;
            layout = this.e;
            if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
            }
            i18 = i10;
            fontMetricsInt = null;
            this.l = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (c(i21) - f(i21))) : i18;
            this.k = fontMetricsInt;
            Layout layout22222 = this.e;
            this.i = lr0.r(layout22222, i21, layout22222.getPaint());
            Layout layout32222 = this.e;
            this.j = lr0.s(layout32222, i21, layout32222.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.e;
        return (z ? layout.getLineBottom(this.f - 1) : layout.getHeight()) + this.g + this.h + this.l;
    }

    public final x7 b() {
        x7 x7Var = this.o;
        if (x7Var != null) {
            return x7Var;
        }
        x7 x7Var2 = new x7(this.e);
        this.o = x7Var2;
        return x7Var2;
    }

    public final float c(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.f;
        int i3 = i2 - 1;
        Layout layout = this.e;
        if (i != i3 || (fontMetricsInt = this.k) == null) {
            return this.g + layout.getLineBottom(i) + (i == i2 + (-1) ? this.h : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int d(int i) {
        ThreadLocal threadLocal = op0.a;
        Layout layout = this.e;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final int e(int i) {
        int i2 = this.f;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.e.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final float f(int i) {
        return this.e.getLineTop(i) + (i == 0 ? 0 : this.g);
    }

    public final float g(int i, boolean z) {
        return (e(i) == this.f - 1 ? this.i + this.j : 0.0f) + b().d(i, true, z);
    }

    public final float h(int i, boolean z) {
        return (e(i) == this.f + (-1) ? this.i + this.j : 0.0f) + b().d(i, false, z);
    }
}
