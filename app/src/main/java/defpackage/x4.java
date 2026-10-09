package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class x4 {
    public final b5 a;
    public final int b;
    public final long c;
    public final lp0 d;
    public final CharSequence e;
    public final float f;
    public final List g;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x4(b5 b5Var, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        lp0 a;
        int i14;
        x4 x4Var;
        int i15;
        int i16;
        int i17;
        Layout layout;
        qk0[] qk0VarArr;
        CharSequence charSequence;
        List list;
        boolean z;
        int i18;
        CharSequence charSequence2 = b5Var.l;
        this.a = b5Var;
        this.b = i;
        this.c = j;
        if (wf.i(j) != 0 || wf.j(j) != 0) {
            dv.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            dv.a("maxLines should be greater than 0");
        }
        zp0 zp0Var = b5Var.f;
        q90 q90Var = zp0Var.b;
        om0 om0Var = zp0Var.a;
        if (i2 == 2) {
            i3 = 0;
            if (!bq0.a(om0Var.h, u10.s(0)) && !bq0.a(om0Var.h, bq0.c) && (i18 = q90Var.a) != 0 && i18 != 5 && i18 != 4 && charSequence2.length() != 0) {
                Spannable spannable = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannable = spannable == null ? new SpannableString(charSequence2) : spannable;
                if (!z20.n(spannable, hu.class)) {
                    spannable.setSpan(new hu(), spannable.length() - 1, spannable.length() - 1, 33);
                }
                charSequence2 = spannable;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        int i19 = q90Var.a;
        int i20 = i19 == 1 ? 3 : i19 == 2 ? 4 : i19 == 3 ? 2 : (i19 != 5 && i19 == 6) ? 1 : i3;
        int i21 = i19 == 4 ? 1 : i3;
        int i22 = q90Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i23 = q90Var.g;
        int i24 = i23 & 255;
        if (i24 != 1) {
            if (i24 == 2) {
                i4 = 1;
            } else if (i24 == 3) {
                i4 = 2;
            }
            i5 = (i23 >> 8) & 255;
            if (i5 != 1) {
                if (i5 == 2) {
                    i6 = i20;
                    i7 = 1;
                } else if (i5 == 3) {
                    i6 = i20;
                    i7 = 2;
                } else if (i5 == 4) {
                    i6 = i20;
                    i7 = 3;
                }
                i8 = (i23 >> 16) & 255;
                if (i8 == 1) {
                    i10 = i4;
                    i11 = i3;
                    i9 = 2;
                } else {
                    i9 = 2;
                    if (i8 == 2) {
                        i10 = i4;
                        i11 = 1;
                    } else {
                        i10 = i4;
                        i11 = i3;
                    }
                }
                if (i2 == i9) {
                    truncateAt2 = TextUtils.TruncateAt.END;
                } else {
                    if (i2 != 5) {
                        if (i2 == 4) {
                            i12 = i10;
                            i13 = 1;
                            truncateAt = TextUtils.TruncateAt.START;
                        } else {
                            i12 = i10;
                            i13 = 1;
                            truncateAt = null;
                        }
                        a = a(i6, i21, truncateAt, i, i22, i12, i7, i11, charSequence3);
                        Layout layout2 = a.e;
                        i14 = i6;
                        if (Build.VERSION.SDK_INT < 35 || b5Var.k.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                            x4Var = this;
                            i15 = i;
                            i16 = i14;
                            i17 = 2;
                        } else {
                            int ellipsisStart = layout2.getEllipsisStart(0);
                            int ellipsisCount = layout2.getEllipsisCount(0) + ellipsisStart;
                            CharSequence subSequence = charSequence3.subSequence(0, ellipsisStart);
                            CharSequence subSequence2 = charSequence3.subSequence(ellipsisCount, charSequence3.length());
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            charSequenceArr[0] = subSequence;
                            charSequenceArr[i13] = "…";
                            i17 = 2;
                            charSequenceArr[2] = subSequence2;
                            x4Var = this;
                            i15 = i;
                            i16 = i14;
                            a = x4Var.a(i16, i21, truncateAt, i15, i22, i12, i7, i11, TextUtils.concat(charSequenceArr));
                        }
                        int i25 = a.f;
                        if (i2 == i17 || a.a() <= wf.g(j) || i15 <= i13) {
                            x4Var.d = a;
                        } else {
                            int g = wf.g(j);
                            int i26 = 0;
                            while (true) {
                                if (i26 >= i25) {
                                    break;
                                }
                                if (a.c(i26) > g) {
                                    i25 = i26;
                                    break;
                                }
                                i26++;
                            }
                            if (i25 >= 0 && i25 != x4Var.b) {
                                a = x4Var.a(i16, i21, truncateAt, i25 < 1 ? 1 : i25, i22, i12, i7, i11, x4Var.e);
                            }
                            x4Var.d = a;
                        }
                        x4Var.f = a.a();
                        x4Var.a.k.c(om0Var.a.e(), (Float.floatToRawIntBits(x4Var.f) & 4294967295L) | (Float.floatToRawIntBits(x4Var.b()) << 32), om0Var.a.a());
                        layout = a.e;
                        if (layout.getText() instanceof Spanned) {
                            CharSequence text = layout.getText();
                            text.getClass();
                            Spanned spanned = (Spanned) text;
                            if (spanned.nextSpanTransition(-1, spanned.length(), qk0.class) != spanned.length()) {
                                CharSequence text2 = layout.getText();
                                text2.getClass();
                                qk0VarArr = (qk0[]) ((Spanned) text2).getSpans(0, layout.getText().length(), qk0.class);
                                if (qk0VarArr != null) {
                                    for (qk0 qk0Var : qk0VarArr) {
                                        qk0Var.g.setValue(new hl0((Float.floatToRawIntBits(x4Var.f) & 4294967295L) | (Float.floatToRawIntBits(x4Var.b()) << 32)));
                                    }
                                }
                                charSequence = x4Var.e;
                                if (charSequence instanceof Spanned) {
                                    Spanned spanned2 = (Spanned) charSequence;
                                    Object[] spans = spanned2.getSpans(0, charSequence.length(), hc0.class);
                                    ArrayList arrayList = new ArrayList(spans.length);
                                    for (Object obj : spans) {
                                        hc0 hc0Var = (hc0) obj;
                                        int spanStart = spanned2.getSpanStart(hc0Var);
                                        int spanEnd = spanned2.getSpanEnd(hc0Var);
                                        int e = x4Var.d.e(spanStart);
                                        boolean z2 = e >= x4Var.b;
                                        if (x4Var.d.e.getEllipsisCount(e) > 0) {
                                            if (spanEnd > x4Var.d.e.getEllipsisStart(e) + x4Var.d.e.getLineStart(e)) {
                                                z = true;
                                                boolean z3 = spanEnd <= x4Var.d.d(e);
                                                if (z && !z3 && !z2) {
                                                    boolean z4 = x4Var.d.e.getParagraphDirection(e) == 1;
                                                    boolean isRtlCharAt = x4Var.d.e.isRtlCharAt(spanStart);
                                                    if (z4 && !isRtlCharAt) {
                                                        x4Var.d.g(spanStart, false);
                                                        hc0Var.b();
                                                    } else if (z4 && isRtlCharAt) {
                                                        x4Var.d.h(spanStart, false);
                                                        hc0Var.b();
                                                    } else {
                                                        lp0 lp0Var = x4Var.d;
                                                        if (isRtlCharAt) {
                                                            lp0Var.g(spanStart, false);
                                                            hc0Var.b();
                                                        } else {
                                                            lp0Var.h(spanStart, false);
                                                            hc0Var.b();
                                                        }
                                                    }
                                                    throw null;
                                                }
                                                arrayList.add(null);
                                            }
                                        }
                                        z = false;
                                        if (spanEnd <= x4Var.d.d(e)) {
                                        }
                                        if (z) {
                                        }
                                        arrayList.add(null);
                                    }
                                    list = arrayList;
                                } else {
                                    list = um.e;
                                }
                                x4Var.g = list;
                            }
                        }
                        qk0VarArr = null;
                        if (qk0VarArr != null) {
                        }
                        charSequence = x4Var.e;
                        if (charSequence instanceof Spanned) {
                        }
                        x4Var.g = list;
                    }
                    truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                }
                i12 = i10;
                i13 = 1;
                truncateAt = truncateAt2;
                a = a(i6, i21, truncateAt, i, i22, i12, i7, i11, charSequence3);
                Layout layout22 = a.e;
                i14 = i6;
                if (Build.VERSION.SDK_INT < 35) {
                }
                x4Var = this;
                i15 = i;
                i16 = i14;
                i17 = 2;
                int i252 = a.f;
                if (i2 == i17) {
                }
                x4Var.d = a;
                x4Var.f = a.a();
                x4Var.a.k.c(om0Var.a.e(), (Float.floatToRawIntBits(x4Var.f) & 4294967295L) | (Float.floatToRawIntBits(x4Var.b()) << 32), om0Var.a.a());
                layout = a.e;
                if (layout.getText() instanceof Spanned) {
                }
                qk0VarArr = null;
                if (qk0VarArr != null) {
                }
                charSequence = x4Var.e;
                if (charSequence instanceof Spanned) {
                }
                x4Var.g = list;
            }
            i6 = i20;
            i7 = i3;
            i8 = (i23 >> 16) & 255;
            if (i8 == 1) {
            }
            if (i2 == i9) {
            }
            i12 = i10;
            i13 = 1;
            truncateAt = truncateAt2;
            a = a(i6, i21, truncateAt, i, i22, i12, i7, i11, charSequence3);
            Layout layout222 = a.e;
            i14 = i6;
            if (Build.VERSION.SDK_INT < 35) {
            }
            x4Var = this;
            i15 = i;
            i16 = i14;
            i17 = 2;
            int i2522 = a.f;
            if (i2 == i17) {
            }
            x4Var.d = a;
            x4Var.f = a.a();
            x4Var.a.k.c(om0Var.a.e(), (Float.floatToRawIntBits(x4Var.f) & 4294967295L) | (Float.floatToRawIntBits(x4Var.b()) << 32), om0Var.a.a());
            layout = a.e;
            if (layout.getText() instanceof Spanned) {
            }
            qk0VarArr = null;
            if (qk0VarArr != null) {
            }
            charSequence = x4Var.e;
            if (charSequence instanceof Spanned) {
            }
            x4Var.g = list;
        }
        i4 = i3;
        i5 = (i23 >> 8) & 255;
        if (i5 != 1) {
        }
        i6 = i20;
        i7 = i3;
        i8 = (i23 >> 16) & 255;
        if (i8 == 1) {
        }
        if (i2 == i9) {
        }
        i12 = i10;
        i13 = 1;
        truncateAt = truncateAt2;
        a = a(i6, i21, truncateAt, i, i22, i12, i7, i11, charSequence3);
        Layout layout2222 = a.e;
        i14 = i6;
        if (Build.VERSION.SDK_INT < 35) {
        }
        x4Var = this;
        i15 = i;
        i16 = i14;
        i17 = 2;
        int i25222 = a.f;
        if (i2 == i17) {
        }
        x4Var.d = a;
        x4Var.f = a.a();
        x4Var.a.k.c(om0Var.a.e(), (Float.floatToRawIntBits(x4Var.f) & 4294967295L) | (Float.floatToRawIntBits(x4Var.b()) << 32), om0Var.a.a());
        layout = a.e;
        if (layout.getText() instanceof Spanned) {
        }
        qk0VarArr = null;
        if (qk0VarArr != null) {
        }
        charSequence = x4Var.e;
        if (charSequence instanceof Spanned) {
        }
        x4Var.g = list;
    }

    public final lp0 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        nc0 nc0Var;
        float b = b();
        b5 b5Var = this.a;
        i5 i5Var = b5Var.k;
        int i8 = b5Var.p;
        zx zxVar = b5Var.m;
        zp0 zp0Var = b5Var.f;
        y4 y4Var = z4.a;
        qc0 qc0Var = zp0Var.c;
        return new lp0(charSequence, b, i5Var, i, truncateAt, i8, (qc0Var == null || (nc0Var = qc0Var.a) == null) ? false : nc0Var.a, i3, i5, i6, i7, i4, i2, zxVar);
    }

    public final float b() {
        return wf.h(this.c);
    }

    public final void c(ma maVar) {
        Canvas a = o2.a(maVar);
        lp0 lp0Var = this.d;
        if (lp0Var.d) {
            a.save();
            a.clipRect(0.0f, 0.0f, b(), this.f);
        }
        int i = lp0Var.g;
        if (a.getClipBounds(lp0Var.n)) {
            if (i != 0) {
                a.translate(0.0f, i);
            }
            ThreadLocal threadLocal = op0.a;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new ap0();
                threadLocal.set(obj);
            }
            ap0 ap0Var = (ap0) obj;
            ap0Var.a = a;
            try {
                lp0Var.e.draw(ap0Var);
                if (i != 0) {
                    a.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                ap0Var.a = null;
            }
        }
        if (lp0Var.d) {
            a.restore();
        }
    }
}
