package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class b5 implements o90 {
    public final String e;
    public final zp0 f;
    public final List g;
    public final List h;
    public final gp i;
    public final si j;
    public final i5 k;
    public final CharSequence l;
    public final zx m;
    public v6 n;
    public final boolean o;
    public final int p;
    public final int q;

    /* JADX WARN: Code restructure failed: missing block: B:167:0x04f2, code lost:
    
        if ((r3.b.c & 1095216660480L) == 0) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x009b, code lost:
    
        if (r7 == 1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x09b0 A[LOOP:7: B:347:0x09ae->B:348:0x09b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x09e8  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ae  */
    /* JADX WARN: Type inference failed for: r0v0, types: [b5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v81, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b5(String str, zp0 zp0Var, List list, List list2, gp gpVar, si siVar, boolean z) {
        boolean booleanValue;
        Locale locale;
        int i;
        a5 a5Var;
        int i2;
        om0 om0Var;
        int size;
        int i3;
        Object obj;
        boolean z2;
        String str2;
        h00 h00Var;
        fp0 fp0Var;
        long j;
        long b;
        ep0 ep0Var;
        no0 no0Var;
        boolean z3;
        a5 a5Var2;
        ep0 ep0Var2;
        ur0 b2;
        Typeface typeface;
        om0 om0Var2;
        List list3;
        ?? r7;
        zp0 zp0Var2;
        List list4;
        boolean z4;
        Class<sr0> cls;
        float f;
        String str3;
        Class<sr0> cls2;
        CharSequence charSequence;
        long j2;
        b5 b5Var;
        qc0 qc0Var;
        long j3;
        float i4;
        int i5;
        int length;
        gp0 gp0Var;
        ArrayList arrayList;
        int size2;
        int i6;
        om0 om0Var3;
        ArrayList arrayList2;
        int i7;
        int[] iArr;
        int size3;
        int i8;
        boolean z5;
        gp0 gp0Var2;
        int size4;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z6;
        si siVar2;
        int i13;
        int i14;
        nc0 nc0Var;
        int i15;
        hs0 hs0Var;
        Class<sr0> cls3;
        boolean z7;
        int i16;
        sr0[] sr0VarArr;
        nc0 nc0Var2;
        int i17;
        ?? obj2 = new Object();
        obj2.e = str;
        obj2.f = zp0Var;
        obj2.g = list;
        obj2.h = list2;
        obj2.i = gpVar;
        obj2.j = siVar;
        float k = siVar.k();
        i5 i5Var = new i5(1);
        ((TextPaint) i5Var).density = k;
        i5Var.b = bp0.b;
        i5Var.c = 3;
        i5Var.d = rk0.d;
        obj2.k = i5Var;
        if (z20.k(zp0Var)) {
            t3 t3Var = jm.a;
            t3 t3Var2 = jm.a;
            zm0 zm0Var = (zm0) t3Var2.f;
            if (zm0Var == null) {
                if (em.k != null) {
                    zm0Var = t3Var2.o();
                    t3Var2.f = zm0Var;
                } else {
                    zm0Var = lw.m;
                }
            }
            booleanValue = ((Boolean) zm0Var.getValue()).booleanValue();
        } else {
            booleanValue = false;
        }
        obj2.o = booleanValue;
        int i18 = zp0Var.b.b;
        h00 h00Var2 = zp0Var.a.k;
        if (i18 != 4) {
            if (i18 != 5) {
                if (i18 == 1) {
                    i = 0;
                } else if (i18 == 2) {
                    i = 1;
                } else {
                    if (i18 != 3 && i18 != 0) {
                        z6.m("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((h00Var2 == null || (locale = ((g00) h00Var2.e.get(0)).a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                obj2.p = i;
                obj2.q = -1;
                a5Var = new a5(obj2);
                rp0 rp0Var = zp0Var.b.i;
                rp0Var = rp0Var == null ? rp0.c : rp0Var;
                i5Var.setFlags(rp0Var.b ? i5Var.getFlags() | 128 : i5Var.getFlags() & (-129));
                i2 = rp0Var.a;
                if (i2 == 1) {
                    i5Var.setFlags(i5Var.getFlags() | 64);
                    i5Var.setHinting(0);
                } else if (i2 == 2) {
                    i5Var.getFlags();
                    i5Var.setHinting(1);
                } else if (i2 == 3) {
                    i5Var.getFlags();
                    i5Var.setHinting(0);
                } else {
                    i5Var.getFlags();
                }
                om0Var = zp0Var.a;
                size = list.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i3);
                    if (((o6) obj).a instanceof om0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                z2 = obj != null;
                long j4 = om0Var.b;
                str2 = om0Var.g;
                h00Var = om0Var.k;
                ep0 ep0Var3 = om0Var.a;
                fp0Var = om0Var.j;
                j = om0Var.h;
                b = bq0.b(j4);
                if (cq0.a(b, 4294967296L)) {
                    i5Var.setTextSize(siVar.N(j4));
                    ep0Var = ep0Var3;
                } else {
                    ep0Var = ep0Var3;
                    if (cq0.a(b, 8589934592L)) {
                        i5Var.setTextSize(bq0.c(j4) * i5Var.getTextSize());
                    }
                }
                no0Var = om0Var.f;
                if (no0Var != null && om0Var.d == null && om0Var.c == null) {
                    z3 = z2;
                    ep0Var2 = ep0Var;
                    a5Var2 = a5Var;
                } else {
                    xp xpVar = om0Var.c;
                    xpVar = xpVar == null ? xp.g : xpVar;
                    vp vpVar = om0Var.d;
                    int i19 = vpVar != null ? vpVar.a : 0;
                    wp wpVar = om0Var.e;
                    int i20 = wpVar != null ? wpVar.a : 65535;
                    z3 = z2;
                    a5Var2 = a5Var;
                    b5 b5Var2 = a5Var2.e;
                    ep0Var2 = ep0Var;
                    b2 = ((hp) b5Var2.i).b(no0Var, xpVar, i19, i20);
                    if (b2 instanceof ur0) {
                        Object obj3 = b2.e;
                        obj3.getClass();
                        typeface = (Typeface) obj3;
                    } else {
                        v6 v6Var = new v6(b2, b5Var2.n);
                        b5Var2.n = v6Var;
                        Object obj4 = v6Var.c;
                        obj4.getClass();
                        typeface = (Typeface) obj4;
                    }
                    i5Var.setTypeface(typeface);
                }
                if (h00Var != null) {
                    h00 h00Var3 = h00.g;
                    if (!h00Var.equals(lw.u())) {
                        ArrayList arrayList3 = new ArrayList(bc.V(h00Var));
                        Iterator it = h00Var.e.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((g00) it.next()).a);
                        }
                        Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                        i5Var.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    i5Var.setFontFeatureSettings(str2);
                }
                if (fp0Var != null && !fp0Var.equals(fp0.c)) {
                    i5Var.setTextScaleX(i5Var.getTextScaleX() * fp0Var.a);
                    i5Var.setTextSkewX(i5Var.getTextSkewX() + fp0Var.b);
                }
                i5Var.d(ep0Var2.b());
                i5Var.c(ep0Var2.e(), 9205357640488583168L, ep0Var2.a());
                i5Var.f(om0Var.n);
                i5Var.g(om0Var.m);
                i5Var.e(om0Var.o);
                if (!cq0.a(bq0.b(j), 4294967296L) && bq0.c(j) != 0.0f) {
                    float textScaleX = i5Var.getTextScaleX() * i5Var.getTextSize();
                    float N = siVar.N(j);
                    if (textScaleX != 0.0f) {
                        i5Var.setLetterSpacing(N / textScaleX);
                    }
                } else if (cq0.a(bq0.b(j), 8589934592L)) {
                    i5Var.setLetterSpacing(bq0.c(j));
                }
                long j5 = om0Var.l;
                c8 c8Var = om0Var.i;
                boolean z8 = (z3 || !cq0.a(bq0.b(j), 4294967296L) || bq0.c(j) == 0.0f) ? false : true;
                long j6 = gc.f;
                boolean z9 = as0.a(j5, j6) && !as0.a(j5, gc.e);
                boolean z10 = c8Var == null && Float.compare(c8Var.a, 0.0f) != 0;
                om0Var2 = (!z8 || z9 || z10) ? new om0(0L, 0L, (xp) null, (vp) null, (wp) null, (no0) null, (String) null, z8 ? j : bq0.c, z10 ? c8Var : null, (fp0) null, (h00) null, z9 ? j5 : j6, (bp0) null, (rk0) null, 63103) : null;
                list3 = obj2.g;
                if (om0Var2 != null) {
                    int size5 = list3.size() + 1;
                    ArrayList arrayList4 = new ArrayList(size5);
                    int i21 = 0;
                    while (i21 < size5) {
                        arrayList4.add(i21 == 0 ? new o6(0, obj2.e.length(), om0Var2) : (o6) obj2.g.get(i21 - 1));
                        i21++;
                    }
                    list3 = arrayList4;
                }
                r7 = obj2.e;
                float textSize = obj2.k.getTextSize();
                zp0Var2 = obj2.f;
                list4 = obj2.h;
                si siVar3 = obj2.j;
                z4 = obj2.o;
                String str4 = obj2.e;
                if (obj2.q == -1) {
                    if (str4.length() <= 512) {
                        str4.getClass();
                        if (!(ln0.H(str4, '\n', 0, 2) >= 0)) {
                            i17 = 0;
                            obj2.q = i17;
                        }
                    }
                    i17 = 1;
                    obj2.q = i17;
                }
                y4 y4Var = z4.a;
                cls = sr0.class;
                if (z4 || em.k == null) {
                    f = 0.0f;
                    str3 = r7;
                    cls2 = cls;
                    charSequence = str3;
                } else {
                    qc0 qc0Var2 = zp0Var2.c;
                    om omVar = (qc0Var2 == null || (nc0Var2 = qc0Var2.a) == null) ? null : new om(nc0Var2.b);
                    boolean z11 = omVar != null && omVar.a == 2;
                    em a = em.a();
                    int length2 = r7.length();
                    if (!(a.b() == 1)) {
                        z6.m("Not initialized yet");
                        throw null;
                    }
                    if (length2 < 0) {
                        z6.l("end cannot be negative");
                        throw null;
                    }
                    if (!(length2 >= 0)) {
                        z6.l("start should be <= than end");
                        throw null;
                    }
                    if (!(r7.length() >= 0)) {
                        z6.l("start should be < than charSequence length");
                        throw null;
                    }
                    if (!(length2 <= r7.length())) {
                        z6.l("end should be < than charSequence length");
                        throw null;
                    }
                    if (r7.length() == 0 || length2 == 0) {
                        f = 0.0f;
                        str3 = r7;
                        cls2 = cls;
                    } else {
                        boolean z12 = z11;
                        v6 v6Var2 = a.e.b;
                        v6Var2.getClass();
                        if (r7 instanceof Spannable) {
                            hs0Var = new hs0((Spannable) r7);
                            f = 0.0f;
                            i15 = 0;
                        } else {
                            if (r7 instanceof Spanned) {
                                f = 0.0f;
                                if (((Spanned) r7).nextSpanTransition(-1, length2 + 1, cls) <= length2) {
                                    hs0Var = new hs0();
                                    i15 = 0;
                                    hs0Var.e = false;
                                    hs0Var.f = new SpannableString(r7);
                                }
                            } else {
                                f = 0.0f;
                            }
                            i15 = 0;
                            hs0Var = null;
                        }
                        if (hs0Var == null || (sr0VarArr = (sr0[]) hs0Var.f.getSpans(i15, length2, cls)) == null || sr0VarArr.length <= 0) {
                            str3 = r7;
                            cls3 = cls;
                            z7 = z12;
                            i16 = 0;
                        } else {
                            int length3 = sr0VarArr.length;
                            str3 = r7;
                            int i22 = 0;
                            int i23 = 0;
                            while (i23 < length3) {
                                int i24 = length3;
                                sr0 sr0Var = sr0VarArr[i23];
                                Class<sr0> cls4 = cls;
                                int spanStart = hs0Var.f.getSpanStart(sr0Var);
                                boolean z13 = z12;
                                int spanEnd = hs0Var.f.getSpanEnd(sr0Var);
                                if (spanStart != length2) {
                                    hs0Var.removeSpan(sr0Var);
                                }
                                i22 = Math.min(spanStart, i22);
                                length2 = Math.max(spanEnd, length2);
                                i23++;
                                cls = cls4;
                                z12 = z13;
                                length3 = i24;
                            }
                            cls3 = cls;
                            z7 = z12;
                            i16 = i22;
                        }
                        if (i16 == length2 || i16 >= str3.length()) {
                            cls2 = cls3;
                        } else {
                            cls2 = cls3;
                            hs0 hs0Var2 = (hs0) v6Var2.x(str3, i16, length2, Integer.MAX_VALUE, z7, new p2(5, hs0Var, (i2) v6Var2.a));
                            if (hs0Var2 != null) {
                                charSequence = hs0Var2.f;
                                charSequence.getClass();
                            }
                        }
                    }
                    charSequence = str3;
                    charSequence.getClass();
                }
                if (!list3.isEmpty() && list4.isEmpty() && lw.i(zp0Var2.b.d, gp0.c)) {
                    j2 = 0;
                    b5Var = obj2;
                } else {
                    j2 = 0;
                }
                SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                if (lw.i(zp0Var2.a.m, bp0.c)) {
                    spannableString.setSpan(z4.a, 0, str3.length(), 33);
                }
                qc0Var = zp0Var2.c;
                if ((qc0Var != null || (nc0Var = qc0Var.a) == null) ? false : nc0Var.a) {
                    q90 q90Var = zp0Var2.b;
                    if (q90Var.f == null) {
                        j3 = 1095216660480L;
                        float i25 = m20.i(q90Var.c, textSize, siVar3);
                        if (!Float.isNaN(i25)) {
                            spannableString.setSpan(new nz(i25), 0, spannableString.length(), 33);
                        }
                        gp0Var = zp0Var2.b.d;
                        if (gp0Var != null) {
                            long j7 = gp0Var.a;
                            long j8 = gp0Var.b;
                            SpannableString spannableString2 = spannableString;
                            if ((bq0.a(j7, u10.s(0)) && bq0.a(j8, u10.s(0))) || (j7 & j3) == j2 || (j8 & j3) == j2) {
                                spannableString = spannableString2;
                            } else {
                                long b3 = bq0.b(j7);
                                float N2 = cq0.a(b3, 4294967296L) ? siVar3.N(j7) : cq0.a(b3, 8589934592L) ? bq0.c(j7) * textSize : f;
                                long b4 = bq0.b(j8);
                                float N3 = cq0.a(b4, 4294967296L) ? siVar3.N(j8) : cq0.a(b4, 8589934592L) ? bq0.c(j8) * textSize : f;
                                spannableString = spannableString2;
                                spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(N2), (int) Math.ceil(N3)), 0, spannableString2.length(), 33);
                            }
                        }
                        arrayList = new ArrayList(list3.size());
                        size2 = list3.size();
                        for (i6 = 0; i6 < size2; i6++) {
                            o6 o6Var = (o6) list3.get(i6);
                            Object obj5 = o6Var.a;
                            if (obj5 instanceof om0) {
                                om0 om0Var4 = (om0) obj5;
                                if (om0Var4.f != null || om0Var4.d != null || om0Var4.c != null || ((om0) obj5).e != null) {
                                    arrayList.add(o6Var);
                                }
                            }
                        }
                        om0 om0Var5 = zp0Var2.a;
                        no0 no0Var2 = om0Var5.f;
                        om0 om0Var6 = (no0Var2 != null && om0Var5.d == null && om0Var5.c == null && om0Var5.e == null) ? null : new om0(0L, 0L, om0Var5.c, om0Var5.d, om0Var5.e, no0Var2, (String) null, 0L, (c8) null, (fp0) null, (h00) null, 0L, (bp0) null, (rk0) null, 65475);
                        et etVar = new et(spannableString, a5Var2, 1);
                        if (arrayList.size() <= 1) {
                            int size6 = arrayList.size();
                            int i26 = size6 * 2;
                            int[] iArr2 = new int[i26];
                            int size7 = arrayList.size();
                            for (int i27 = 0; i27 < size7; i27++) {
                                o6 o6Var2 = (o6) arrayList.get(i27);
                                iArr2[i27] = o6Var2.b;
                                iArr2[i27 + size6] = o6Var2.c;
                            }
                            if (i26 > 1) {
                                Arrays.sort(iArr2);
                            }
                            if (i26 == 0) {
                                throw new NoSuchElementException("Array is empty.");
                            }
                            int i28 = iArr2[0];
                            int i29 = 0;
                            while (i29 < i26) {
                                int i30 = iArr2[i29];
                                if (i30 == i28) {
                                    arrayList2 = arrayList;
                                    om0Var3 = om0Var6;
                                    i7 = i26;
                                    iArr = iArr2;
                                } else {
                                    int size8 = arrayList.size();
                                    om0Var3 = om0Var6;
                                    int i31 = 0;
                                    while (i31 < size8) {
                                        ArrayList arrayList5 = arrayList;
                                        o6 o6Var3 = (o6) arrayList.get(i31);
                                        int i32 = i26;
                                        int i33 = o6Var3.b;
                                        int[] iArr3 = iArr2;
                                        int i34 = o6Var3.c;
                                        if (i33 != i34 && q6.a(i28, i30, i33, i34)) {
                                            om0 om0Var7 = (om0) o6Var3.a;
                                            om0Var6 = om0Var6 != null ? om0Var6.c(om0Var7) : om0Var7;
                                        }
                                        i31++;
                                        arrayList = arrayList5;
                                        i26 = i32;
                                        iArr2 = iArr3;
                                    }
                                    arrayList2 = arrayList;
                                    i7 = i26;
                                    iArr = iArr2;
                                    if (om0Var6 != null) {
                                        etVar.c(om0Var6, Integer.valueOf(i28), Integer.valueOf(i30));
                                    }
                                    i28 = i30;
                                }
                                i29++;
                                om0Var6 = om0Var3;
                                arrayList = arrayList2;
                                i26 = i7;
                                iArr2 = iArr;
                            }
                        } else if (!arrayList.isEmpty()) {
                            om0 om0Var8 = (om0) ((o6) arrayList.get(0)).a;
                            etVar.c(om0Var6 != null ? om0Var6.c(om0Var8) : om0Var8, Integer.valueOf(((o6) arrayList.get(0)).b), Integer.valueOf(((o6) arrayList.get(0)).c));
                        }
                        size3 = list3.size();
                        i8 = 0;
                        z5 = false;
                        while (i8 < size3) {
                            o6 o6Var4 = (o6) list3.get(i8);
                            Object obj6 = o6Var4.a;
                            if (obj6 instanceof om0) {
                                int i35 = o6Var4.b;
                                int i36 = o6Var4.c;
                                if (i35 >= 0 && i35 < spannableString.length() && i36 > i35 && i36 <= spannableString.length()) {
                                    om0 om0Var9 = (om0) obj6;
                                    c8 c8Var2 = om0Var9.i;
                                    ep0 ep0Var4 = om0Var9.a;
                                    if (c8Var2 != null) {
                                        spannableString.setSpan(new d8(c8Var2.a, 0), i35, i36, 33);
                                    }
                                    i11 = size3;
                                    i12 = i8;
                                    m20.j(spannableString, ep0Var4.b(), i35, i36);
                                    dx0 e = ep0Var4.e();
                                    float a2 = ep0Var4.a();
                                    if (e != null) {
                                        if (e instanceof jm0) {
                                            m20.j(spannableString, ((jm0) e).G, i35, i36);
                                        } else {
                                            spannableString.setSpan(new qk0((j9) e, a2), i35, i36, 33);
                                        }
                                    }
                                    bp0 bp0Var = om0Var9.m;
                                    if (bp0Var != null) {
                                        int i37 = bp0Var.a;
                                        cp0 cp0Var = new cp0((i37 | 1) == i37, (i37 | 2) == i37);
                                        i13 = 33;
                                        spannableString.setSpan(cp0Var, i35, i36, 33);
                                    } else {
                                        i13 = 33;
                                    }
                                    siVar2 = siVar3;
                                    m20.k(spannableString, om0Var9.b, siVar2, i35, i36);
                                    String str5 = om0Var9.g;
                                    if (str5 != null) {
                                        spannableString.setSpan(new jp(0, str5), i35, i36, i13);
                                    }
                                    fp0 fp0Var2 = om0Var9.j;
                                    if (fp0Var2 != null) {
                                        spannableString.setSpan(new ScaleXSpan(fp0Var2.a), i35, i36, i13);
                                        spannableString.setSpan(new d8(fp0Var2.b, 1), i35, i36, i13);
                                    }
                                    m20.l(spannableString, om0Var9.k, i35, i36);
                                    long j9 = om0Var9.l;
                                    if (j9 != 16) {
                                        spannableString.setSpan(new BackgroundColorSpan(lw.F(j9)), i35, i36, 33);
                                    }
                                    rk0 rk0Var = om0Var9.n;
                                    if (rk0Var != null) {
                                        long j10 = rk0Var.b;
                                        z6 = z5;
                                        int F = lw.F(rk0Var.a);
                                        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                        float f2 = rk0Var.c;
                                        sk0 sk0Var = new sk0(F, intBitsToFloat, intBitsToFloat2, f2 == f ? Float.MIN_VALUE : f2);
                                        i14 = 33;
                                        spannableString.setSpan(sk0Var, i35, i36, 33);
                                    } else {
                                        z6 = z5;
                                        i14 = 33;
                                    }
                                    t10 t10Var = om0Var9.o;
                                    if (t10Var != null) {
                                        spannableString.setSpan(new kl(t10Var), i35, i36, i14);
                                    }
                                    if (cq0.a(bq0.b(om0Var9.h), 4294967296L) || cq0.a(bq0.b(om0Var9.h), 8589934592L)) {
                                        z5 = true;
                                        i8 = i12 + 1;
                                        size3 = i11;
                                        siVar3 = siVar2;
                                    }
                                    z5 = z6;
                                    i8 = i12 + 1;
                                    size3 = i11;
                                    siVar3 = siVar2;
                                }
                            }
                            i11 = size3;
                            i12 = i8;
                            z6 = z5;
                            siVar2 = siVar3;
                            z5 = z6;
                            i8 = i12 + 1;
                            size3 = i11;
                            siVar3 = siVar2;
                        }
                        si siVar4 = siVar3;
                        if (z5) {
                            int size9 = list3.size();
                            int i38 = 0;
                            while (i38 < size9) {
                                o6 o6Var5 = (o6) list3.get(i38);
                                n6 n6Var = (n6) o6Var5.a;
                                if (n6Var instanceof om0) {
                                    int i39 = o6Var5.b;
                                    int i40 = o6Var5.c;
                                    if (i39 >= 0 && i39 < spannableString.length() && i40 > i39 && i40 <= spannableString.length()) {
                                        long j11 = ((om0) n6Var).h;
                                        long b5 = bq0.b(j11);
                                        i10 = i38;
                                        Object uyVar = cq0.a(b5, 4294967296L) ? new uy(siVar4.N(j11)) : cq0.a(b5, 8589934592L) ? new ty(bq0.c(j11)) : null;
                                        if (uyVar != null) {
                                            spannableString.setSpan(uyVar, i39, i40, 33);
                                        }
                                        i38 = i10 + 1;
                                    }
                                }
                                i10 = i38;
                                i38 = i10 + 1;
                            }
                        }
                        gp0Var2 = zp0Var2.b.d;
                        if (gp0Var2 != null) {
                            long j12 = gp0Var2.a;
                            long b6 = bq0.b(j12);
                            if (cq0.a(b6, 4294967296L)) {
                                siVar4.N(j12);
                            } else if (cq0.a(b6, 8589934592L)) {
                                bq0.c(j12);
                            }
                        }
                        size4 = list3.size();
                        for (i9 = 0; i9 < size4; i9++) {
                            Object obj7 = ((o6) list3.get(i9)).a;
                        }
                        if (list4.size() > 0) {
                            b5Var = this;
                            charSequence = spannableString;
                            b5Var.l = charSequence;
                            b5Var.m = new zx(charSequence, b5Var.k, b5Var.p);
                            return;
                        }
                        o6 o6Var6 = (o6) list4.get(0);
                        if (o6Var6.a != null) {
                            z6.c();
                            throw null;
                        }
                        for (Object obj8 : spannableString.getSpans(o6Var6.b, o6Var6.c, cls2)) {
                            spannableString.removeSpan((sr0) obj8);
                        }
                        throw null;
                    }
                }
                j3 = 1095216660480L;
                c8 c8Var3 = zp0Var2.a.i;
                q90 q90Var2 = zp0Var2.b;
                rz rzVar = q90Var2.f;
                rzVar = rzVar == null ? rz.d : rzVar;
                i4 = m20.i(q90Var2.c, textSize, siVar3);
                if (!Float.isNaN(i4)) {
                    if (spannableString.length() == 0) {
                        i5 = 1;
                    } else {
                        if (spannableString.length() == 0) {
                            throw new NoSuchElementException("Char sequence is empty.");
                        }
                        i5 = 1;
                        if (spannableString.charAt(spannableString.length() - 1) != '\n') {
                            length = spannableString.length();
                            int i41 = length;
                            int i42 = rzVar.b;
                            spannableString.setSpan(new sz(i4, i41, (i42 & 1) <= 0, (i42 & 16) <= 0, rzVar.a, rzVar.c), 0, spannableString.length(), 33);
                        }
                    }
                    length = spannableString.length() + i5;
                    int i412 = length;
                    int i422 = rzVar.b;
                    spannableString.setSpan(new sz(i4, i412, (i422 & 1) <= 0, (i422 & 16) <= 0, rzVar.a, rzVar.c), 0, spannableString.length(), 33);
                }
                gp0Var = zp0Var2.b.d;
                if (gp0Var != null) {
                }
                arrayList = new ArrayList(list3.size());
                size2 = list3.size();
                while (i6 < size2) {
                }
                om0 om0Var52 = zp0Var2.a;
                no0 no0Var22 = om0Var52.f;
                if (no0Var22 != null) {
                }
                et etVar2 = new et(spannableString, a5Var2, 1);
                if (arrayList.size() <= 1) {
                }
                size3 = list3.size();
                i8 = 0;
                z5 = false;
                while (i8 < size3) {
                }
                si siVar42 = siVar3;
                if (z5) {
                }
                gp0Var2 = zp0Var2.b.d;
                if (gp0Var2 != null) {
                }
                size4 = list3.size();
                while (i9 < size4) {
                }
                if (list4.size() > 0) {
                }
            }
            i = 3;
            obj2.p = i;
            obj2.q = -1;
            a5Var = new a5(obj2);
            rp0 rp0Var2 = zp0Var.b.i;
            if (rp0Var2 == null) {
            }
            i5Var.setFlags(rp0Var2.b ? i5Var.getFlags() | 128 : i5Var.getFlags() & (-129));
            i2 = rp0Var2.a;
            if (i2 == 1) {
            }
            om0Var = zp0Var.a;
            size = list.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                }
                i3++;
            }
            if (obj != null) {
            }
            long j42 = om0Var.b;
            str2 = om0Var.g;
            h00Var = om0Var.k;
            ep0 ep0Var32 = om0Var.a;
            fp0Var = om0Var.j;
            j = om0Var.h;
            b = bq0.b(j42);
            if (cq0.a(b, 4294967296L)) {
            }
            no0Var = om0Var.f;
            if (no0Var != null) {
            }
            xp xpVar2 = om0Var.c;
            if (xpVar2 == null) {
            }
            vp vpVar2 = om0Var.d;
            if (vpVar2 != null) {
            }
            wp wpVar2 = om0Var.e;
            if (wpVar2 != null) {
            }
            z3 = z2;
            a5Var2 = a5Var;
            b5 b5Var22 = a5Var2.e;
            ep0Var2 = ep0Var;
            b2 = ((hp) b5Var22.i).b(no0Var, xpVar2, i19, i20);
            if (b2 instanceof ur0) {
            }
            i5Var.setTypeface(typeface);
            if (h00Var != null) {
            }
            if (str2 != null) {
                i5Var.setFontFeatureSettings(str2);
            }
            if (fp0Var != null) {
                i5Var.setTextScaleX(i5Var.getTextScaleX() * fp0Var.a);
                i5Var.setTextSkewX(i5Var.getTextSkewX() + fp0Var.b);
            }
            i5Var.d(ep0Var2.b());
            i5Var.c(ep0Var2.e(), 9205357640488583168L, ep0Var2.a());
            i5Var.f(om0Var.n);
            i5Var.g(om0Var.m);
            i5Var.e(om0Var.o);
            if (!cq0.a(bq0.b(j), 4294967296L)) {
            }
            if (cq0.a(bq0.b(j), 8589934592L)) {
            }
            long j52 = om0Var.l;
            c8 c8Var4 = om0Var.i;
            if (z3) {
            }
            long j62 = gc.f;
            if (as0.a(j52, j62)) {
            }
            if (c8Var4 == null) {
            }
            if (z8) {
            }
            list3 = obj2.g;
            if (om0Var2 != null) {
            }
            r7 = obj2.e;
            float textSize2 = obj2.k.getTextSize();
            zp0Var2 = obj2.f;
            list4 = obj2.h;
            si siVar32 = obj2.j;
            z4 = obj2.o;
            String str42 = obj2.e;
            if (obj2.q == -1) {
            }
            y4 y4Var2 = z4.a;
            cls = sr0.class;
            if (z4) {
            }
            f = 0.0f;
            str3 = r7;
            cls2 = cls;
            charSequence = str3;
            if (!list3.isEmpty()) {
            }
            j2 = 0;
            if (charSequence instanceof Spannable) {
            }
            if (lw.i(zp0Var2.a.m, bp0.c)) {
            }
            qc0Var = zp0Var2.c;
            if ((qc0Var != null || (nc0Var = qc0Var.a) == null) ? false : nc0Var.a) {
            }
            j3 = 1095216660480L;
            c8 c8Var32 = zp0Var2.a.i;
            q90 q90Var22 = zp0Var2.b;
            rz rzVar2 = q90Var22.f;
            if (rzVar2 == null) {
            }
            i4 = m20.i(q90Var22.c, textSize2, siVar32);
            if (!Float.isNaN(i4)) {
            }
            gp0Var = zp0Var2.b.d;
            if (gp0Var != null) {
            }
            arrayList = new ArrayList(list3.size());
            size2 = list3.size();
            while (i6 < size2) {
            }
            om0 om0Var522 = zp0Var2.a;
            no0 no0Var222 = om0Var522.f;
            if (no0Var222 != null) {
            }
            et etVar22 = new et(spannableString, a5Var2, 1);
            if (arrayList.size() <= 1) {
            }
            size3 = list3.size();
            i8 = 0;
            z5 = false;
            while (i8 < size3) {
            }
            si siVar422 = siVar32;
            if (z5) {
            }
            gp0Var2 = zp0Var2.b.d;
            if (gp0Var2 != null) {
            }
            size4 = list3.size();
            while (i9 < size4) {
            }
            if (list4.size() > 0) {
            }
        }
        i = 2;
        obj2.p = i;
        obj2.q = -1;
        a5Var = new a5(obj2);
        rp0 rp0Var22 = zp0Var.b.i;
        if (rp0Var22 == null) {
        }
        i5Var.setFlags(rp0Var22.b ? i5Var.getFlags() | 128 : i5Var.getFlags() & (-129));
        i2 = rp0Var22.a;
        if (i2 == 1) {
        }
        om0Var = zp0Var.a;
        size = list.size();
        i3 = 0;
        while (true) {
            if (i3 >= size) {
            }
            i3++;
        }
        if (obj != null) {
        }
        long j422 = om0Var.b;
        str2 = om0Var.g;
        h00Var = om0Var.k;
        ep0 ep0Var322 = om0Var.a;
        fp0Var = om0Var.j;
        j = om0Var.h;
        b = bq0.b(j422);
        if (cq0.a(b, 4294967296L)) {
        }
        no0Var = om0Var.f;
        if (no0Var != null) {
        }
        xp xpVar22 = om0Var.c;
        if (xpVar22 == null) {
        }
        vp vpVar22 = om0Var.d;
        if (vpVar22 != null) {
        }
        wp wpVar22 = om0Var.e;
        if (wpVar22 != null) {
        }
        z3 = z2;
        a5Var2 = a5Var;
        b5 b5Var222 = a5Var2.e;
        ep0Var2 = ep0Var;
        b2 = ((hp) b5Var222.i).b(no0Var, xpVar22, i19, i20);
        if (b2 instanceof ur0) {
        }
        i5Var.setTypeface(typeface);
        if (h00Var != null) {
        }
        if (str2 != null) {
        }
        if (fp0Var != null) {
        }
        i5Var.d(ep0Var2.b());
        i5Var.c(ep0Var2.e(), 9205357640488583168L, ep0Var2.a());
        i5Var.f(om0Var.n);
        i5Var.g(om0Var.m);
        i5Var.e(om0Var.o);
        if (!cq0.a(bq0.b(j), 4294967296L)) {
        }
        if (cq0.a(bq0.b(j), 8589934592L)) {
        }
        long j522 = om0Var.l;
        c8 c8Var42 = om0Var.i;
        if (z3) {
        }
        long j622 = gc.f;
        if (as0.a(j522, j622)) {
        }
        if (c8Var42 == null) {
        }
        if (z8) {
        }
        list3 = obj2.g;
        if (om0Var2 != null) {
        }
        r7 = obj2.e;
        float textSize22 = obj2.k.getTextSize();
        zp0Var2 = obj2.f;
        list4 = obj2.h;
        si siVar322 = obj2.j;
        z4 = obj2.o;
        String str422 = obj2.e;
        if (obj2.q == -1) {
        }
        y4 y4Var22 = z4.a;
        cls = sr0.class;
        if (z4) {
        }
        f = 0.0f;
        str3 = r7;
        cls2 = cls;
        charSequence = str3;
        if (!list3.isEmpty()) {
        }
        j2 = 0;
        if (charSequence instanceof Spannable) {
        }
        if (lw.i(zp0Var2.a.m, bp0.c)) {
        }
        qc0Var = zp0Var2.c;
        if ((qc0Var != null || (nc0Var = qc0Var.a) == null) ? false : nc0Var.a) {
        }
        j3 = 1095216660480L;
        c8 c8Var322 = zp0Var2.a.i;
        q90 q90Var222 = zp0Var2.b;
        rz rzVar22 = q90Var222.f;
        if (rzVar22 == null) {
        }
        i4 = m20.i(q90Var222.c, textSize22, siVar322);
        if (!Float.isNaN(i4)) {
        }
        gp0Var = zp0Var2.b.d;
        if (gp0Var != null) {
        }
        arrayList = new ArrayList(list3.size());
        size2 = list3.size();
        while (i6 < size2) {
        }
        om0 om0Var5222 = zp0Var2.a;
        no0 no0Var2222 = om0Var5222.f;
        if (no0Var2222 != null) {
        }
        et etVar222 = new et(spannableString, a5Var2, 1);
        if (arrayList.size() <= 1) {
        }
        size3 = list3.size();
        i8 = 0;
        z5 = false;
        while (i8 < size3) {
        }
        si siVar4222 = siVar322;
        if (z5) {
        }
        gp0Var2 = zp0Var2.b.d;
        if (gp0Var2 != null) {
        }
        size4 = list3.size();
        while (i9 < size4) {
        }
        if (list4.size() > 0) {
        }
    }

    public final float a() {
        float f;
        zx zxVar = this.m;
        float f2 = zxVar.e;
        TextPaint textPaint = zxVar.b;
        if (!Float.isNaN(f2)) {
            return zxVar.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = zxVar.a;
        lineInstance.setText(new db(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, q3.m);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new aw(i, next, 1));
            } else {
                aw awVar = (aw) priorityQueue.peek();
                if (awVar != null && awVar.f - awVar.e < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new aw(i, next, 1));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            aw awVar2 = (aw) it.next();
            float desiredWidth = Layout.getDesiredWidth(zxVar.b(), awVar2.e, awVar2.f, textPaint);
            while (it.hasNext()) {
                aw awVar3 = (aw) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(zxVar.b(), awVar3.e, awVar3.f, textPaint));
            }
            f = desiredWidth;
        }
        zxVar.e = f;
        return f;
    }

    @Override // defpackage.o90
    public final boolean b() {
        v6 v6Var = this.n;
        if (v6Var != null ? v6Var.v() : false) {
            return true;
        }
        if (!this.o && z20.k(this.f)) {
            t3 t3Var = jm.a;
            t3 t3Var2 = jm.a;
            zm0 zm0Var = (zm0) t3Var2.f;
            if (zm0Var == null) {
                if (em.k != null) {
                    zm0Var = t3Var2.o();
                    t3Var2.f = zm0Var;
                } else {
                    zm0Var = lw.m;
                }
            }
            if (((Boolean) zm0Var.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.o90
    public final float c() {
        return this.m.c();
    }
}
