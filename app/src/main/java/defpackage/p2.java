package defpackage;

import android.R;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class p2 implements wb, lm, ao, ka, n80, xh0 {
    public final /* synthetic */ int e;
    public Object f;
    public Object g;

    public p2(int i) {
        this.e = i;
        switch (i) {
            case 4:
                this.f = new ht0(0);
                this.g = new ht0(0);
                break;
            case 10:
                this.f = new k40();
                this.g = new k40();
                break;
            case 11:
                this.f = new t40(new iy[16]);
                break;
            case 16:
                this.f = new LinkedHashMap();
                this.g = new LinkedHashMap();
                break;
            case 19:
                this.f = new ic0(15);
                this.g = new d10(16);
                break;
            case 20:
                this.f = new t40(new Reference[16]);
                this.g = new ReferenceQueue();
                break;
            default:
                this.f = new j1(this);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [t20] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [t20] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [t40] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [t40] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void j(iy iyVar) {
        if (iyVar.O > 0) {
            if (iyVar.I.c == fy.i && !iyVar.j() && !iyVar.k() && !iyVar.P && iyVar.C()) {
                t20 t20Var = iyVar.H.f;
                if ((t20Var.h & 256) != 0) {
                    while (t20Var != null) {
                        if ((t20Var.g & 256) != 0) {
                            oi oiVar = t20Var;
                            ?? r5 = 0;
                            while (oiVar != 0) {
                                if (oiVar instanceof xr) {
                                    xr xrVar = (xr) oiVar;
                                    xrVar.l(nh.Y(xrVar, 256));
                                } else if ((oiVar.g & 256) != 0 && (oiVar instanceof oi)) {
                                    t20 t20Var2 = oiVar.t;
                                    int i = 0;
                                    oiVar = oiVar;
                                    r5 = r5;
                                    while (t20Var2 != null) {
                                        if ((t20Var2.g & 256) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                oiVar = t20Var2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new t40(new t20[16]);
                                                }
                                                if (oiVar != 0) {
                                                    r5.b(oiVar);
                                                    oiVar = 0;
                                                }
                                                r5.b(t20Var2);
                                            }
                                        }
                                        t20Var2 = t20Var2.j;
                                        oiVar = oiVar;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                oiVar = nh.N(r5);
                            }
                        }
                        if ((t20Var.h & 256) == 0) {
                            break;
                        } else {
                            t20Var = t20Var.j;
                        }
                    }
                }
            }
            iyVar.N = false;
            t40 t = iyVar.t();
            Object[] objArr = t.e;
            int i2 = t.g;
            for (int i3 = 0; i3 < i2; i3++) {
                j((iy) objArr[i3]);
            }
        }
    }

    @Override // defpackage.lm
    public Object a() {
        return (hs0) this.f;
    }

    @Override // defpackage.ao
    public Object b(bo boVar, ng ngVar) {
        Object b = ((za) this.f).b(new fo(new re0(), boVar, (he0) this.g), ngVar);
        return b == dh.e ? b : fs0.a;
    }

    @Override // defpackage.n80
    public List c(Integer num) {
        List c = ((n80) this.f).c(null);
        ol0 ol0Var = (ol0) this.g;
        int i = ol0Var.v;
        return i < 0 ? c : ac.g0(lw.l(ol0Var, num, i, Integer.valueOf(ol0Var.B(ol0Var.b, i))), c);
    }

    @Override // defpackage.ka
    public void cancel() {
        if (((q7) this.g).compareAndSet(1, 1)) {
            return;
        }
        ((v7) this.f).b();
    }

    @Override // defpackage.lm
    public boolean d(CharSequence charSequence, int i, int i2, rr0 rr0Var) {
        if ((rr0Var.c & 4) > 0) {
            return true;
        }
        if (((hs0) this.f) == null) {
            this.f = new hs0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((i2) this.g).getClass();
        ((hs0) this.f).setSpan(new sr0(rr0Var), i, i2, 33);
        return true;
    }

    @Override // defpackage.n80
    public boolean e() {
        return ((n80) this.f).e();
    }

    @Override // defpackage.xh0
    public Object f(gh0 gh0Var, Object obj) {
        return ((tq) this.f).invoke(gh0Var, obj);
    }

    public boolean g(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((p2) this.g).f;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (u10.l(((xc0) obj).a, j)) {
                break;
            }
            i++;
        }
        xc0 xc0Var = (xc0) obj;
        if (xc0Var != null) {
            return xc0Var.h;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x05a8, code lost:
    
        if (r4.isEmpty() != false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x08be, code lost:
    
        if (r5 == false) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014b, code lost:
    
        if (r21.isEmpty() != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x08a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x09db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0a60 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0b6d  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0ca4  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0cb5  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0c9a  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0cbc  */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r2v21, types: [um] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r48v1 */
    /* JADX WARN: Type inference failed for: r48v2, types: [i1] */
    /* JADX WARN: Type inference failed for: r48v3 */
    /* JADX WARN: Type inference failed for: r48v4 */
    /* JADX WARN: Type inference failed for: r7v131, types: [android.view.ViewParent] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i1 h(int i) {
        ?? r48;
        qm0 qm0Var;
        iy iyVar;
        List i2;
        k3 k3Var;
        e3 e3Var;
        w30 w30Var;
        uj0 uj0Var;
        jg0 jg0Var;
        qj0 qj0Var;
        i1 i1Var;
        String str;
        Resources resources;
        k40 k40Var;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo;
        jg0 jg0Var2;
        int i3;
        int i4;
        k3 k3Var2;
        boolean z;
        uj0 uj0Var2;
        boolean z2;
        p0 p0Var;
        i1 i1Var2;
        p0 p0Var2;
        p0 p0Var3;
        String l;
        ArrayList arrayList;
        CharSequence e;
        td0 td0Var;
        Object g;
        ki0 ki0Var;
        ki0 ki0Var2;
        int d;
        e3 e3Var2;
        int d2;
        String str2;
        Object g2;
        Object g3;
        iy iyVar2;
        List i5;
        List list;
        iy n;
        boolean z3;
        boolean z4;
        List i6;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i7;
        boolean z5;
        uj0 uj0Var3;
        int i8;
        List i9;
        k3 k3Var3 = (k3) this.g;
        AccessibilityManager accessibilityManager = k3Var3.k;
        e3 e3Var3 = k3Var3.h;
        if (((gz) e3Var3.getComposeViewContext().d().getLifecycle()).b == yy.e) {
            if (!accessibilityManager.isEnabled()) {
                i1Var2 = new i1(AccessibilityNodeInfo.obtain());
                k3Var2 = k3Var3;
                i4 = i;
                if (k3Var2.s) {
                    if (i4 == k3Var2.o) {
                        k3Var2.q = i1Var2;
                    }
                    if (i4 == k3Var2.p) {
                        k3Var2.r = i1Var2;
                    }
                }
                return i1Var2;
            }
            i1Var2 = null;
            k3Var2 = k3Var3;
            i4 = i;
            if (k3Var2.s) {
            }
            return i1Var2;
        }
        wj0 wj0Var = (wj0) k3Var3.k().b(i);
        if (wj0Var == null) {
            if (!accessibilityManager.isEnabled()) {
                i1Var2 = new i1(AccessibilityNodeInfo.obtain());
                k3Var2 = k3Var3;
                i4 = i;
                if (k3Var2.s) {
                }
                return i1Var2;
            }
            i1Var2 = null;
            k3Var2 = k3Var3;
            i4 = i;
            if (k3Var2.s) {
            }
            return i1Var2;
        }
        uj0 uj0Var4 = wj0Var.a;
        qj0 k = uj0Var4.k();
        iy iyVar3 = uj0Var4.c;
        Object g4 = k.e.g(yj0.o);
        if (g4 == null) {
            g4 = null;
        }
        boolean i10 = lw.i(g4, Boolean.TRUE);
        if (i10) {
            if (!(Build.VERSION.SDK_INT >= 34 ? t0.e(accessibilityManager) : true)) {
                k3Var2 = k3Var3;
                i4 = i;
                i1Var2 = null;
                if (k3Var2.s) {
                }
                return i1Var2;
            }
        }
        ?? obtain = AccessibilityNodeInfo.obtain();
        i1 i1Var3 = new i1(obtain);
        int i11 = Build.VERSION.SDK_INT;
        String str3 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
        if (i11 >= 34) {
            t0.g(obtain, i10);
            r48 = 0;
        } else {
            r48 = 0;
            r48 = 0;
            Bundle extras = obtain.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-65)) | (i10 ? 64 : 0));
            }
        }
        if (i == -1) {
            ?? parentForAccessibility = e3Var3.getParentForAccessibility();
            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : r48;
            i1Var3.b = -1;
            obtain.setParent(view);
        } else {
            uj0 l2 = uj0Var4.l();
            Integer valueOf = l2 != null ? Integer.valueOf(l2.f) : r48;
            if (valueOf == null) {
                cv.c("semanticsNode " + i + " has null parent");
                throw new id();
            }
            int intValue = valueOf.intValue();
            if (intValue == e3Var3.getSemanticsOwner().a().f) {
                intValue = -1;
            }
            i1Var3.b = intValue;
            obtain.setParent(e3Var3, intValue);
        }
        i1Var3.c = i;
        obtain.setSource(e3Var3, i);
        obtain.setBoundsInScreen(k3Var3.c(wj0Var));
        w30 w30Var2 = k3Var3.N;
        qm0 qm0Var2 = k3Var3.w;
        Resources resources2 = e3Var3.getContext().getResources();
        i1Var3.f("android.view.View");
        qj0 qj0Var2 = uj0Var4.d;
        k40 k40Var2 = qj0Var2.e;
        if (k40Var2.c(yj0.E)) {
            i1Var3.f("android.widget.EditText");
        }
        if (k40Var2.c(yj0.A)) {
            i1Var3.f("android.widget.TextView");
        }
        Object g5 = k40Var2.g(yj0.x);
        if (g5 == null) {
            g5 = r48;
        }
        jg0 jg0Var3 = (jg0) g5;
        if (jg0Var3 != null) {
            int i12 = jg0Var3.a;
            if (uj0Var4.n()) {
                qm0Var = qm0Var2;
                i8 = 4;
                iyVar = iyVar3;
            } else {
                qm0Var = qm0Var2;
                i8 = 4;
                i9 = uj0Var4.i((r3 & 1) != 0 ? !uj0Var4.b : false, (r3 & 2) == 0);
                iyVar = iyVar3;
            }
            if (i12 == i8) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(2131230816));
            } else if (i12 == 2) {
                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(2131230815));
            } else {
                String p = v10.p(i12);
                if (i12 != 5 || kw.A(uj0Var4) || qj0Var2.g) {
                    i1Var3.f(p);
                }
            }
        } else {
            qm0Var = qm0Var2;
            iyVar = iyVar3;
        }
        obtain.setPackageName(e3Var3.getContext().getPackageName());
        obtain.setImportantForAccessibility(nh.C(uj0Var4));
        boolean e2 = i11 >= 34 ? t0.e(accessibilityManager) : true;
        i2 = uj0Var4.i((r3 & 1) != 0 ? !uj0Var4.b : false, (r3 & 2) == 0);
        int size = i2.size();
        boolean z6 = e2;
        int i13 = 0;
        int i14 = 0;
        while (i14 < size) {
            int i15 = size;
            uj0 uj0Var5 = (uj0) i2.get(i14);
            List list2 = i2;
            vv k2 = k3Var3.k();
            int i16 = i14;
            int i17 = uj0Var5.f;
            if (k2.a(i17)) {
                if (e3Var3.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(uj0Var5.c) != null) {
                    z6.c();
                    return r48;
                }
                if (i17 != -1) {
                    wj0 wj0Var2 = (wj0) k3Var3.k().b(i17);
                    if (wj0Var2 == null || (uj0Var3 = wj0Var2.a) == null) {
                        z5 = false;
                    } else {
                        Object g6 = uj0Var3.k().e.g(yj0.o);
                        if (g6 == null) {
                            g6 = r48;
                        }
                        z5 = lw.i(g6, Boolean.TRUE);
                    }
                    if (z6 || !z5) {
                        obtain.addChild(e3Var3, i17);
                    }
                    w30Var2.f(i17, i13);
                    i13++;
                }
            }
            i14 = i16 + 1;
            i2 = list2;
            size = i15;
        }
        int i18 = k3Var3.o;
        AccessibilityNodeInfo accessibilityNodeInfo2 = i1Var3.a;
        if (i == i18) {
            accessibilityNodeInfo2.setAccessibilityFocused(true);
            i1Var3.a(d1.d);
        } else {
            accessibilityNodeInfo2.setAccessibilityFocused(false);
            i1Var3.a(d1.c);
        }
        p6 t = kw.t(uj0Var4);
        if (t != null) {
            e3Var3.getFontFamilyResolver();
            si density = e3Var3.getDensity();
            v6 v6Var = k3Var3.J;
            e3Var = e3Var3;
            String str4 = t.f;
            i1Var = i1Var3;
            List list3 = t.e;
            SpannableString spannableString2 = new SpannableString(str4);
            ArrayList arrayList4 = t.g;
            if (arrayList4 != null) {
                int size2 = arrayList4.size();
                k3Var = k3Var3;
                int i19 = 0;
                while (i19 < size2) {
                    int i20 = i19;
                    o6 o6Var = (o6) arrayList4.get(i19);
                    ArrayList arrayList5 = arrayList4;
                    om0 om0Var = (om0) o6Var.a;
                    int i21 = size2;
                    int i22 = o6Var.b;
                    int i23 = o6Var.c;
                    w30 w30Var3 = w30Var2;
                    jg0 jg0Var4 = jg0Var3;
                    qj0 qj0Var3 = qj0Var2;
                    long b = om0Var.a.b();
                    uj0 uj0Var6 = uj0Var4;
                    long j = om0Var.b;
                    xp xpVar = om0Var.c;
                    vp vpVar = om0Var.d;
                    fp0 fp0Var = om0Var.j;
                    h00 h00Var = om0Var.k;
                    String str5 = str3;
                    Resources resources3 = resources2;
                    long j2 = om0Var.l;
                    bp0 bp0Var = om0Var.m;
                    ep0 ep0Var = om0Var.a;
                    k40 k40Var3 = k40Var2;
                    AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfo2;
                    long b2 = ep0Var.b();
                    int i24 = gc.g;
                    if (!as0.a(b, b2)) {
                        ep0Var = b != 16 ? new sc(b) : b2.X;
                    }
                    m20.j(spannableString2, ep0Var.b(), i22, i23);
                    SpannableString spannableString3 = spannableString2;
                    m20.k(spannableString3, j, density, i22, i23);
                    if (xpVar == null && vpVar == null) {
                        i7 = 33;
                    } else {
                        xp xpVar2 = xpVar == null ? xp.g : xpVar;
                        int i25 = vpVar != null ? vpVar.a : 0;
                        boolean z7 = lw.m(xpVar2.e, xp.f.e) >= 0;
                        boolean z8 = i25 == 1;
                        StyleSpan styleSpan = new StyleSpan((z8 && z7) ? 3 : z7 ? 1 : z8 ? 2 : 0);
                        i7 = 33;
                        spannableString3.setSpan(styleSpan, i22, i23, 33);
                    }
                    if (bp0Var != null) {
                        int i26 = bp0Var.a;
                        if ((i26 | 1) == i26) {
                            spannableString3.setSpan(new UnderlineSpan(), i22, i23, i7);
                        }
                        if ((i26 | 2) == i26) {
                            spannableString3.setSpan(new StrikethroughSpan(), i22, i23, i7);
                        }
                    }
                    if (fp0Var != null) {
                        spannableString3.setSpan(new ScaleXSpan(fp0Var.a), i22, i23, i7);
                    }
                    m20.l(spannableString3, h00Var, i22, i23);
                    if (j2 != 16) {
                        spannableString3.setSpan(new BackgroundColorSpan(lw.F(j2)), i22, i23, i7);
                    }
                    spannableString2 = spannableString3;
                    i19 = i20 + 1;
                    k40Var2 = k40Var3;
                    arrayList4 = arrayList5;
                    size2 = i21;
                    w30Var2 = w30Var3;
                    qj0Var2 = qj0Var3;
                    jg0Var3 = jg0Var4;
                    uj0Var4 = uj0Var6;
                    str3 = str5;
                    resources2 = resources3;
                    accessibilityNodeInfo2 = accessibilityNodeInfo3;
                }
            } else {
                k3Var = k3Var3;
            }
            w30Var = w30Var2;
            uj0Var = uj0Var4;
            AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfo2;
            SpannableString spannableString4 = spannableString2;
            jg0Var = jg0Var3;
            qj0Var = qj0Var2;
            str = str3;
            resources = resources2;
            k40Var = k40Var2;
            int length = str4.length();
            ?? r2 = um.e;
            if (list3 != null) {
                arrayList2 = new ArrayList(list3.size());
                int size3 = list3.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    Object obj = list3.get(i27);
                    o6 o6Var2 = (o6) obj;
                    if ((o6Var2.a instanceof it0) && q6.a(0, length, o6Var2.b, o6Var2.c)) {
                        arrayList2.add(obj);
                    }
                }
            } else {
                arrayList2 = r2;
            }
            int size4 = arrayList2.size();
            for (int i28 = 0; i28 < size4; i28++) {
                o6 o6Var3 = (o6) arrayList2.get(i28);
                it0 it0Var = (it0) o6Var3.a;
                int i29 = o6Var3.b;
                int i30 = o6Var3.c;
                if (!(it0Var instanceof it0)) {
                    z6.j();
                    return r48;
                }
                spannableString4.setSpan(new TtsSpan.VerbatimBuilder(it0Var.a).build(), i29, i30, 33);
            }
            int length2 = str4.length();
            if (list3 != null) {
                arrayList3 = new ArrayList(list3.size());
                int size5 = list3.size();
                for (int i31 = 0; i31 < size5; i31++) {
                    Object obj2 = list3.get(i31);
                    o6 o6Var4 = (o6) obj2;
                    if ((o6Var4.a instanceof ps0) && q6.a(0, length2, o6Var4.b, o6Var4.c)) {
                        arrayList3.add(obj2);
                    }
                }
            } else {
                arrayList3 = r2;
            }
            int size6 = arrayList3.size();
            for (int i32 = 0; i32 < size6; i32++) {
                o6 o6Var5 = (o6) arrayList3.get(i32);
                ps0 ps0Var = (ps0) o6Var5.a;
                int i33 = o6Var5.b;
                int i34 = o6Var5.c;
                WeakHashMap weakHashMap = (WeakHashMap) v6Var.a;
                Object obj3 = weakHashMap.get(ps0Var);
                if (obj3 == null) {
                    obj3 = new URLSpan(ps0Var.a);
                    weakHashMap.put(ps0Var, obj3);
                }
                spannableString4.setSpan((URLSpan) obj3, i33, i34, 33);
            }
            int length3 = str4.length();
            if (list3 != null) {
                r2 = new ArrayList(list3.size());
                int size7 = list3.size();
                for (int i35 = 0; i35 < size7; i35++) {
                    Object obj4 = list3.get(i35);
                    o6 o6Var6 = (o6) obj4;
                    if ((o6Var6.a instanceof xz) && q6.a(0, length3, o6Var6.b, o6Var6.c)) {
                        r2.add(obj4);
                    }
                }
            }
            int size8 = r2.size();
            for (int i36 = 0; i36 < size8; i36++) {
                o6 o6Var7 = (o6) r2.get(i36);
                int i37 = o6Var7.b;
                Object obj5 = o6Var7.a;
                int i38 = o6Var7.c;
                if (i37 != i38) {
                    xz xzVar = (xz) obj5;
                    if (xzVar instanceof wz) {
                        obj5.getClass();
                        wz wzVar = (wz) obj5;
                        o6 o6Var8 = new o6(i37, i38, wzVar);
                        WeakHashMap weakHashMap2 = (WeakHashMap) v6Var.b;
                        Object obj6 = weakHashMap2.get(o6Var8);
                        if (obj6 == null) {
                            obj6 = new URLSpan(wzVar.a);
                            weakHashMap2.put(o6Var8, obj6);
                        }
                        spannableString4.setSpan((URLSpan) obj6, i37, i38, 33);
                    } else {
                        WeakHashMap weakHashMap3 = (WeakHashMap) v6Var.c;
                        Object obj7 = weakHashMap3.get(o6Var7);
                        if (obj7 == null) {
                            obj7 = new de(xzVar);
                            weakHashMap3.put(o6Var7, obj7);
                        }
                        spannableString4.setSpan((ClickableSpan) obj7, i37, i38, 33);
                    }
                }
            }
            spannableString = (SpannableString) k3.H(spannableString4);
            accessibilityNodeInfo = accessibilityNodeInfo4;
        } else {
            k3Var = k3Var3;
            e3Var = e3Var3;
            w30Var = w30Var2;
            uj0Var = uj0Var4;
            jg0Var = jg0Var3;
            qj0Var = qj0Var2;
            i1Var = i1Var3;
            str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
            resources = resources2;
            k40Var = k40Var2;
            spannableString = r48;
            accessibilityNodeInfo = accessibilityNodeInfo2;
        }
        accessibilityNodeInfo.setText(spannableString);
        ak0 ak0Var = yj0.L;
        if (k40Var.c(ak0Var)) {
            obtain.setContentInvalid(true);
            Object g7 = k40Var.g(ak0Var);
            if (g7 == null) {
                g7 = r48;
            }
            obtain.setError((CharSequence) g7);
        }
        uj0 uj0Var7 = uj0Var;
        Resources resources4 = resources;
        String s = kw.s(uj0Var7, resources4);
        if (Build.VERSION.SDK_INT >= 30) {
            e1.g(accessibilityNodeInfo, s);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", s);
        }
        obtain.setCheckable(kw.r(uj0Var7));
        Object g8 = k40Var.g(yj0.I);
        if (g8 == null) {
            g8 = r48;
        }
        qq0 qq0Var = (qq0) g8;
        if (qq0Var != null) {
            if (qq0Var == qq0.e) {
                accessibilityNodeInfo.setChecked(true);
            } else if (qq0Var == qq0.f) {
                accessibilityNodeInfo.setChecked(false);
            }
        }
        Object g9 = k40Var.g(yj0.H);
        if (g9 == null) {
            g9 = r48;
        }
        Boolean bool = (Boolean) g9;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (jg0Var == null) {
                jg0Var2 = jg0Var;
                i3 = 4;
            } else {
                jg0Var2 = jg0Var;
                i3 = 4;
                if (jg0Var2.a == 4) {
                    obtain.setSelected(booleanValue);
                }
            }
            accessibilityNodeInfo.setChecked(booleanValue);
        } else {
            jg0Var2 = jg0Var;
            i3 = 4;
        }
        qj0 qj0Var4 = qj0Var;
        if (qj0Var4.g) {
            i6 = uj0Var7.i((r3 & 1) != 0 ? !uj0Var7.b : false, (r3 & 2) == 0);
        }
        Object g10 = k40Var.g(yj0.a);
        if (g10 == null) {
            g10 = r48;
        }
        List list4 = (List) g10;
        obtain.setContentDescription(list4 != null ? (String) ac.a0(list4) : r48);
        Object g11 = k40Var.g(yj0.y);
        if (g11 == null) {
            g11 = r48;
        }
        String str6 = (String) g11;
        if (str6 != null) {
            uj0 uj0Var8 = uj0Var7;
            while (true) {
                if (uj0Var8 == null) {
                    z4 = false;
                    break;
                }
                qj0 qj0Var5 = uj0Var8.d;
                ak0 ak0Var2 = kw.p;
                if (qj0Var5.e.c(ak0Var2)) {
                    z4 = ((Boolean) qj0Var5.c(ak0Var2)).booleanValue();
                    break;
                }
                uj0Var8 = uj0Var8.l();
            }
            if (z4) {
                obtain.setViewIdResourceName(str6);
            }
        }
        Object g12 = k40Var.g(yj0.h);
        if (g12 == null) {
            g12 = r48;
        }
        if (((fs0) g12) != null) {
            accessibilityNodeInfo.setHeading(true);
        }
        Object g13 = k40Var.g(yj0.i);
        if (g13 == null) {
            g13 = r48;
        }
        if (((fs0) g13) != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                obtain.setTextEntryKey(true);
            } else {
                Bundle extras2 = accessibilityNodeInfo.getExtras();
                if (extras2 != null) {
                    String str7 = str;
                    extras2.putInt(str7, (extras2.getInt(str7, 0) & (-9)) | 8);
                }
            }
        }
        i4 = i;
        if (i4 != -1) {
            int d3 = w30Var.d(uj0Var7.f);
            if (d3 != -1) {
                obtain.setDrawingOrder(d3);
            } else {
                Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
            }
        }
        obtain.setPassword(k40Var.c(yj0.K));
        Object g14 = k40Var.g(yj0.M);
        if (g14 == null) {
            g14 = r48;
        }
        Boolean bool2 = Boolean.TRUE;
        obtain.setEditable(lw.i(g14, bool2));
        Object g15 = k40Var.g(yj0.N);
        if (g15 == null) {
            g15 = r48;
        }
        Integer num = (Integer) g15;
        obtain.setMaxTextLength(num != null ? num.intValue() : -1);
        obtain.setEnabled(kw.l(uj0Var7));
        ak0 ak0Var3 = yj0.l;
        obtain.setFocusable(k40Var.c(ak0Var3));
        if (obtain.isFocusable()) {
            obtain.setFocused(((Boolean) qj0Var4.c(ak0Var3)).booleanValue());
            if (!obtain.isFocused()) {
                k3Var2 = k3Var;
                z = true;
                accessibilityNodeInfo.addAction(1);
                accessibilityNodeInfo.setVisibleToUser(nh.B(uj0Var7) ^ z);
                if (uj0Var7.n()) {
                    uj0Var2 = uj0Var7;
                } else {
                    uj0Var2 = uj0Var7.l();
                    uj0Var2.getClass();
                }
                if (uj0Var2.m().d()) {
                    z2 = false;
                } else {
                    z2 = false;
                    accessibilityNodeInfo.setVisibleToUser(false);
                }
                j2.n(z20.m(qj0Var4, yj0.k));
                accessibilityNodeInfo.setClickable(z2);
                p0Var = (p0) z20.m(qj0Var4, pj0.b);
                if (p0Var != null) {
                    boolean i39 = lw.i(z20.m(qj0Var4, yj0.H), bool2);
                    boolean z9 = (jg0Var2 != null && jg0Var2.a == 4) || (jg0Var2 != null && jg0Var2.a == 3);
                    accessibilityNodeInfo.setClickable(!z9 || (z9 && !i39));
                    if (kw.l(uj0Var7) && obtain.isClickable()) {
                        i1Var2 = i1Var;
                        i1Var2.a(new d1(p0Var.a, 16));
                        accessibilityNodeInfo.setLongClickable(false);
                        p0Var2 = (p0) z20.m(qj0Var4, pj0.c);
                        if (p0Var2 != null) {
                            accessibilityNodeInfo.setLongClickable(true);
                            if (kw.l(uj0Var7)) {
                                i1Var2.a(new d1(p0Var2.a, 32));
                            }
                        }
                        p0Var3 = (p0) z20.m(qj0Var4, pj0.o);
                        if (p0Var3 != null) {
                            i1Var2.a(new d1(p0Var3.a, 16384));
                        }
                        if (kw.l(uj0Var7)) {
                            p0 p0Var4 = (p0) z20.m(qj0Var4, pj0.j);
                            if (p0Var4 != null) {
                                i1Var2.a(new d1(p0Var4.a, 2097152));
                            }
                            p0 p0Var5 = (p0) z20.m(qj0Var4, pj0.n);
                            if (p0Var5 != null) {
                                i1Var2.a(new d1(p0Var5.a, R.id.accessibilityActionImeEnter));
                            }
                            p0 p0Var6 = (p0) z20.m(qj0Var4, pj0.p);
                            if (p0Var6 != null) {
                                i1Var2.a(new d1(p0Var6.a, 65536));
                            }
                            p0 p0Var7 = (p0) z20.m(qj0Var4, pj0.q);
                            if (p0Var7 != null && obtain.isFocused()) {
                                p2 p2Var = (p2) e3Var.getClipboardManager();
                                ClipboardManager clipboardManager = (ClipboardManager) p2Var.g;
                                if (clipboardManager == null) {
                                    Object systemService = ((Context) p2Var.f).getSystemService("clipboard");
                                    systemService.getClass();
                                    clipboardManager = (ClipboardManager) systemService;
                                    p2Var.g = clipboardManager;
                                }
                                ClipDescription primaryClipDescription = clipboardManager.getPrimaryClipDescription();
                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                    i1Var2.a(new d1(p0Var7.a, 32768));
                                }
                            }
                        }
                        l = k3.l(uj0Var7);
                        if (l != null && l.length() != 0) {
                            obtain.setTextSelection(k3Var2.j(uj0Var7), k3Var2.i(uj0Var7));
                            p0 p0Var8 = (p0) z20.m(qj0Var4, pj0.i);
                            i1Var2.a(new d1(p0Var8 == null ? p0Var8.a : r48, 131072));
                            accessibilityNodeInfo.addAction(256);
                            accessibilityNodeInfo.addAction(512);
                            accessibilityNodeInfo.setMovementGranularities(11);
                            list = (List) z20.m(qj0Var4, yj0.a);
                            if ((list != null || list.isEmpty()) && k40Var.c(pj0.a) && (!k40Var.c(yj0.E) || lw.i(z20.m(qj0Var4, ak0Var3), bool2))) {
                                n = iyVar.n();
                                while (true) {
                                    if (n == null) {
                                        n = r48;
                                        break;
                                    }
                                    qj0 q = n.q();
                                    if (q != null && q.g) {
                                        if (q.e.c(yj0.E)) {
                                            break;
                                        }
                                    }
                                    n = n.n();
                                }
                                if (n != null) {
                                    qj0 q2 = n.q();
                                    if (q2 != null) {
                                        Object g16 = q2.e.g(yj0.l);
                                        if (g16 == null) {
                                            g16 = r48;
                                        }
                                        z3 = lw.i(g16, Boolean.TRUE);
                                    } else {
                                        z3 = false;
                                    }
                                }
                                accessibilityNodeInfo.setMovementGranularities(obtain.getMovementGranularities() | 20);
                            }
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        e = i1Var2.e();
                        if (e != null && e.length() != 0 && k40Var.c(pj0.a)) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (k40Var.c(yj0.y)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (k40Var.c(yj0.O)) {
                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        obtain.setAvailableExtraData(arrayList);
                        td0Var = (td0) z20.m(qj0Var4, yj0.c);
                        if (td0Var != null) {
                            ak0 ak0Var4 = pj0.h;
                            if (k40Var.c(ak0Var4)) {
                                i1Var2.f("android.widget.SeekBar");
                            } else {
                                i1Var2.f("android.widget.ProgressBar");
                            }
                            if (td0Var != td0.b) {
                                obtain.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                            }
                            if (k40Var.c(ak0Var4)) {
                                kw.l(uj0Var7);
                            }
                        }
                        q3.b(i1Var2, uj0Var7);
                        g = uj0Var7.k().e.g(yj0.f);
                        if (g == null) {
                            g = r48;
                        }
                        if (g == null) {
                            ArrayList arrayList6 = new ArrayList();
                            Object g17 = uj0Var7.k().e.g(yj0.e);
                            if (g17 == null) {
                                g17 = r48;
                            }
                            if (g17 != null) {
                                i5 = uj0Var7.i((r3 & 1) != 0 ? !uj0Var7.b : false, (r3 & 2) == 0);
                                int size9 = i5.size();
                                for (int i40 = 0; i40 < size9; i40++) {
                                    uj0 uj0Var9 = (uj0) i5.get(i40);
                                    if (uj0Var9.k().e.c(yj0.H)) {
                                        arrayList6.add(uj0Var9);
                                    }
                                }
                            }
                            if (!arrayList6.isEmpty()) {
                                boolean j3 = nh.j(arrayList6);
                                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(j3 ? 1 : arrayList6.size(), j3 ? arrayList6.size() : 1, false, 0));
                            }
                        } else {
                            z6.c();
                        }
                        nh.e0(i1Var2, uj0Var7);
                        ki0Var = (ki0) z20.m(qj0Var4, yj0.v);
                        p0 p0Var9 = (p0) z20.m(qj0Var4, pj0.d);
                        if (ki0Var != null && p0Var9 != null) {
                            g3 = uj0Var7.k().e.g(yj0.f);
                            if (g3 == null) {
                                g3 = r48;
                            }
                            if (g3 == null) {
                                Object g18 = uj0Var7.k().e.g(yj0.e);
                                if (g18 == null) {
                                    g18 = r48;
                                }
                                if (g18 == null) {
                                    i1Var2.f("android.widget.HorizontalScrollView");
                                }
                            }
                            if (((Number) ki0Var.b.b()).floatValue() > 0.0f) {
                                accessibilityNodeInfo.setScrollable(true);
                            }
                            if (kw.l(uj0Var7)) {
                                boolean r = k3.r(ki0Var);
                                xx xxVar = xx.f;
                                if (r) {
                                    i1Var2.a(d1.e);
                                    iyVar2 = iyVar;
                                    i1Var2.a(iyVar2.B == xxVar ? d1.h : d1.j);
                                } else {
                                    iyVar2 = iyVar;
                                }
                                if (k3.q(ki0Var)) {
                                    i1Var2.a(d1.f);
                                    i1Var2.a(iyVar2.B == xxVar ? d1.j : d1.h);
                                }
                            }
                        }
                        ki0Var2 = (ki0) z20.m(qj0Var4, yj0.w);
                        if (ki0Var2 != null && p0Var9 != null) {
                            g2 = uj0Var7.k().e.g(yj0.f);
                            if (g2 == null) {
                                g2 = r48;
                            }
                            if (g2 == null) {
                                Object g19 = uj0Var7.k().e.g(yj0.e);
                                if (g19 == null) {
                                    g19 = r48;
                                }
                                if (g19 == null) {
                                    i1Var2.f("android.widget.ScrollView");
                                }
                            }
                            if (((Number) ki0Var2.b.b()).floatValue() > 0.0f) {
                                accessibilityNodeInfo.setScrollable(true);
                            }
                            if (kw.l(uj0Var7)) {
                                if (k3.r(ki0Var2)) {
                                    i1Var2.a(d1.e);
                                    i1Var2.a(d1.i);
                                }
                                if (k3.q(ki0Var2)) {
                                    i1Var2.a(d1.f);
                                    i1Var2.a(d1.g);
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 29) {
                            qj0 qj0Var6 = uj0Var7.d;
                            k40 k40Var4 = qj0Var6.e;
                            Object g20 = qj0Var6.e.g(yj0.x);
                            if (g20 == null) {
                                g20 = r48;
                            }
                            jg0 jg0Var5 = (jg0) g20;
                            if (kw.l(uj0Var7) && (jg0Var5 == null || jg0Var5.a != 8)) {
                                Object g21 = k40Var4.g(pj0.w);
                                if (g21 == null) {
                                    g21 = r48;
                                }
                                p0 p0Var10 = (p0) g21;
                                if (p0Var10 != null) {
                                    Class cls = r48;
                                    i1Var2.a(new d1(cls, R.id.accessibilityActionPageUp, p0Var10.a, cls));
                                }
                                Object g22 = k40Var4.g(pj0.y);
                                if (g22 == null) {
                                    g22 = null;
                                }
                                p0 p0Var11 = (p0) g22;
                                if (p0Var11 != null) {
                                    i1Var2.a(new d1(null, R.id.accessibilityActionPageDown, p0Var11.a, null));
                                }
                                Object g23 = k40Var4.g(pj0.x);
                                if (g23 == null) {
                                    g23 = null;
                                }
                                p0 p0Var12 = (p0) g23;
                                if (p0Var12 != null) {
                                    i1Var2.a(new d1(null, R.id.accessibilityActionPageLeft, p0Var12.a, null));
                                }
                                Object g24 = k40Var4.g(pj0.z);
                                if (g24 == null) {
                                    g24 = null;
                                }
                                p0 p0Var13 = (p0) g24;
                                if (p0Var13 != null) {
                                    i1Var2.a(new d1(null, R.id.accessibilityActionPageRight, p0Var13.a, null));
                                }
                            }
                        }
                        accessibilityNodeInfo.setPaneTitle((CharSequence) z20.m(qj0Var4, yj0.d));
                        if (kw.l(uj0Var7)) {
                            p0 p0Var14 = (p0) z20.m(qj0Var4, pj0.r);
                            if (p0Var14 != null) {
                                i1Var2.a(new d1(p0Var14.a, 262144));
                            }
                            p0 p0Var15 = (p0) z20.m(qj0Var4, pj0.s);
                            if (p0Var15 != null) {
                                i1Var2.a(new d1(p0Var15.a, 524288));
                            }
                            p0 p0Var16 = (p0) z20.m(qj0Var4, pj0.t);
                            if (p0Var16 != null) {
                                i1Var2.a(new d1(p0Var16.a, 1048576));
                            }
                            ak0 ak0Var5 = pj0.v;
                            if (qj0Var4.e.c(ak0Var5)) {
                                List list5 = (List) qj0Var4.c(ak0Var5);
                                int size10 = list5.size();
                                x30 x30Var = k3.R;
                                int i41 = x30Var.b;
                                if (size10 >= i41) {
                                    z6.m(j2.h("Can't have more than ", i41, " custom actions for one widget"));
                                    return null;
                                }
                                qm0 qm0Var3 = new qm0();
                                g40 g40Var = n60.a;
                                g40 g40Var2 = new g40();
                                qm0 qm0Var4 = qm0Var;
                                if (qm0Var4.b(i4)) {
                                    g40 g40Var3 = (g40) q3.l(qm0Var4, i4);
                                    int[] iArr = x30Var.a;
                                    int i42 = x30Var.b;
                                    int[] iArr2 = new int[16];
                                    int i43 = 0;
                                    int i44 = 0;
                                    while (i43 < i42) {
                                        int i45 = iArr[i43];
                                        int i46 = i42;
                                        int i47 = i44 + 1;
                                        int i48 = i43;
                                        if (iArr2.length < i47) {
                                            iArr2 = Arrays.copyOf(iArr2, Math.max(i47, (iArr2.length * 3) / 2));
                                        }
                                        iArr2[i44] = i45;
                                        i43 = i48 + 1;
                                        i44 = i47;
                                        i42 = i46;
                                    }
                                    ArrayList arrayList7 = new ArrayList();
                                    if (list5.size() > 0) {
                                        j2.n(list5.get(0));
                                        g40Var3.getClass();
                                        throw null;
                                    }
                                    if (arrayList7.size() > 0) {
                                        j2.n(arrayList7.get(0));
                                        if (i44 <= 0) {
                                            z6.f("Index must be between 0 and size");
                                            return null;
                                        }
                                        int i49 = iArr2[0];
                                        throw null;
                                    }
                                } else if (list5.size() > 0) {
                                    j2.n(list5.get(0));
                                    x30Var.b(0);
                                    throw null;
                                }
                                k3Var2.v.c(i4, qm0Var3);
                                qm0Var4.c(i4, g40Var2);
                            }
                        }
                        accessibilityNodeInfo.setScreenReaderFocusable(kw.z(uj0Var7, resources4));
                        d = k3Var2.F.d(i4);
                        if (d != -1) {
                            v10.l(e3Var.getAndroidViewsHandler$ui(), d);
                            e3Var2 = e3Var;
                            accessibilityNodeInfo.setTraversalBefore(e3Var2, d);
                            k3Var2.b(i4, i1Var2, k3Var2.H, null);
                        } else {
                            e3Var2 = e3Var;
                        }
                        d2 = k3Var2.G.d(i4);
                        if (d2 != -1) {
                            v10.l(e3Var2.getAndroidViewsHandler$ui(), d2);
                        }
                        str2 = (String) z20.m(qj0Var4, kw.q);
                        if (str2 != null) {
                            i1Var2.f(str2);
                        }
                        if (k3Var2.s) {
                        }
                        return i1Var2;
                    }
                }
                i1Var2 = i1Var;
                accessibilityNodeInfo.setLongClickable(false);
                p0Var2 = (p0) z20.m(qj0Var4, pj0.c);
                if (p0Var2 != null) {
                }
                p0Var3 = (p0) z20.m(qj0Var4, pj0.o);
                if (p0Var3 != null) {
                }
                if (kw.l(uj0Var7)) {
                }
                l = k3.l(uj0Var7);
                if (l != null) {
                    obtain.setTextSelection(k3Var2.j(uj0Var7), k3Var2.i(uj0Var7));
                    p0 p0Var82 = (p0) z20.m(qj0Var4, pj0.i);
                    i1Var2.a(new d1(p0Var82 == null ? p0Var82.a : r48, 131072));
                    accessibilityNodeInfo.addAction(256);
                    accessibilityNodeInfo.addAction(512);
                    accessibilityNodeInfo.setMovementGranularities(11);
                    list = (List) z20.m(qj0Var4, yj0.a);
                    if (list != null) {
                    }
                    n = iyVar.n();
                    while (true) {
                        if (n == null) {
                        }
                        n = n.n();
                    }
                    if (n != null) {
                    }
                    accessibilityNodeInfo.setMovementGranularities(obtain.getMovementGranularities() | 20);
                }
                arrayList = new ArrayList();
                arrayList.add("androidx.compose.ui.semantics.id");
                e = i1Var2.e();
                if (e != null) {
                    arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                }
                if (k40Var.c(yj0.y)) {
                }
                if (k40Var.c(yj0.O)) {
                }
                obtain.setAvailableExtraData(arrayList);
                td0Var = (td0) z20.m(qj0Var4, yj0.c);
                if (td0Var != null) {
                }
                q3.b(i1Var2, uj0Var7);
                g = uj0Var7.k().e.g(yj0.f);
                if (g == null) {
                }
                if (g == null) {
                }
                nh.e0(i1Var2, uj0Var7);
                ki0Var = (ki0) z20.m(qj0Var4, yj0.v);
                p0 p0Var92 = (p0) z20.m(qj0Var4, pj0.d);
                if (ki0Var != null) {
                    g3 = uj0Var7.k().e.g(yj0.f);
                    if (g3 == null) {
                    }
                    if (g3 == null) {
                    }
                    if (((Number) ki0Var.b.b()).floatValue() > 0.0f) {
                    }
                    if (kw.l(uj0Var7)) {
                    }
                }
                ki0Var2 = (ki0) z20.m(qj0Var4, yj0.w);
                if (ki0Var2 != null) {
                    g2 = uj0Var7.k().e.g(yj0.f);
                    if (g2 == null) {
                    }
                    if (g2 == null) {
                    }
                    if (((Number) ki0Var2.b.b()).floatValue() > 0.0f) {
                    }
                    if (kw.l(uj0Var7)) {
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                }
                accessibilityNodeInfo.setPaneTitle((CharSequence) z20.m(qj0Var4, yj0.d));
                if (kw.l(uj0Var7)) {
                }
                accessibilityNodeInfo.setScreenReaderFocusable(kw.z(uj0Var7, resources4));
                d = k3Var2.F.d(i4);
                if (d != -1) {
                }
                d2 = k3Var2.G.d(i4);
                if (d2 != -1) {
                }
                str2 = (String) z20.m(qj0Var4, kw.q);
                if (str2 != null) {
                }
                if (k3Var2.s) {
                }
                return i1Var2;
            }
            accessibilityNodeInfo.addAction(2);
            k3Var2 = k3Var;
            k3Var2.p = i4;
        } else {
            k3Var2 = k3Var;
        }
        z = true;
        accessibilityNodeInfo.setVisibleToUser(nh.B(uj0Var7) ^ z);
        if (uj0Var7.n()) {
        }
        if (uj0Var2.m().d()) {
        }
        j2.n(z20.m(qj0Var4, yj0.k));
        accessibilityNodeInfo.setClickable(z2);
        p0Var = (p0) z20.m(qj0Var4, pj0.b);
        if (p0Var != null) {
        }
        i1Var2 = i1Var;
        accessibilityNodeInfo.setLongClickable(false);
        p0Var2 = (p0) z20.m(qj0Var4, pj0.c);
        if (p0Var2 != null) {
        }
        p0Var3 = (p0) z20.m(qj0Var4, pj0.o);
        if (p0Var3 != null) {
        }
        if (kw.l(uj0Var7)) {
        }
        l = k3.l(uj0Var7);
        if (l != null) {
        }
        arrayList = new ArrayList();
        arrayList.add("androidx.compose.ui.semantics.id");
        e = i1Var2.e();
        if (e != null) {
        }
        if (k40Var.c(yj0.y)) {
        }
        if (k40Var.c(yj0.O)) {
        }
        obtain.setAvailableExtraData(arrayList);
        td0Var = (td0) z20.m(qj0Var4, yj0.c);
        if (td0Var != null) {
        }
        q3.b(i1Var2, uj0Var7);
        g = uj0Var7.k().e.g(yj0.f);
        if (g == null) {
        }
        if (g == null) {
        }
        nh.e0(i1Var2, uj0Var7);
        ki0Var = (ki0) z20.m(qj0Var4, yj0.v);
        p0 p0Var922 = (p0) z20.m(qj0Var4, pj0.d);
        if (ki0Var != null) {
        }
        ki0Var2 = (ki0) z20.m(qj0Var4, yj0.w);
        if (ki0Var2 != null) {
        }
        if (Build.VERSION.SDK_INT >= 29) {
        }
        accessibilityNodeInfo.setPaneTitle((CharSequence) z20.m(qj0Var4, yj0.d));
        if (kw.l(uj0Var7)) {
        }
        accessibilityNodeInfo.setScreenReaderFocusable(kw.z(uj0Var7, resources4));
        d = k3Var2.F.d(i4);
        if (d != -1) {
        }
        d2 = k3Var2.G.d(i4);
        if (d2 != -1) {
        }
        str2 = (String) z20.m(qj0Var4, kw.q);
        if (str2 != null) {
        }
        if (k3Var2.s) {
        }
        return i1Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r3 < r1) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i() {
        Object[] objArr;
        t40 t40Var = (t40) this.f;
        Arrays.sort(t40Var.e, 0, t40Var.g, zo.h);
        int i = t40Var.g;
        iy[] iyVarArr = (iy[]) this.g;
        if (iyVarArr != null) {
            int length = iyVarArr.length;
            objArr = iyVarArr;
        }
        objArr = new iy[Math.max(16, i)];
        this.g = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = t40Var.e[i2];
        }
        t40Var.g();
        while (true) {
            i--;
            if (-1 >= i) {
                this.g = objArr;
                return;
            }
            iy iyVar = objArr[i];
            iyVar.getClass();
            if (iyVar.N) {
                j(iyVar);
            }
            objArr[i] = 0;
        }
    }

    public AutofillManager k() {
        AutofillManager autofillManager = (AutofillManager) this.g;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager autofillManager2 = (AutofillManager) ((Context) this.f).getSystemService(AutofillManager.class);
        if (autofillManager2 != null) {
            this.g = autofillManager2;
            return autofillManager2;
        }
        z6.m("Could not locate AutofillManager from context");
        return null;
    }

    public AutofillId l(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return bg.b(m2.f(this.f), ((View) this.g).getAutofillId(), j);
        }
        return null;
    }

    public void m(View view, int i, boolean z) {
        k().notifyViewVisibilityChanged(view, i, z);
    }

    public String toString() {
        switch (this.e) {
            case 2:
                return "AnimationResult(endReason=" + ((d6) this.g) + ", endState=" + ((g6) this.f) + ")";
            case 21:
                return "Bounds{lower=" + ((nv) this.f) + " upper=" + ((nv) this.g) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ p2(Context context, int i) {
        this.e = i;
        this.f = context;
    }

    public p2(v7 v7Var) {
        this.e = 12;
        this.f = v7Var;
        this.g = new q7(0);
    }

    public /* synthetic */ p2(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    public p2(ArrayList arrayList, ArrayList arrayList2) {
        this.e = 7;
        int size = arrayList.size();
        this.f = new int[size];
        this.g = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.g)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public p2(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.e = 21;
        lowerBound = bounds.getLowerBound();
        this.f = nv.c(lowerBound);
        upperBound = bounds.getUpperBound();
        this.g = nv.c(upperBound);
    }

    public p2(int i, int i2) {
        this.e = 7;
        this.f = new int[]{i, i2};
        this.g = new float[]{0.0f, 1.0f};
    }

    public p2(int i, int i2, int i3) {
        this.e = 7;
        this.f = new int[]{i, i2, i3};
        this.g = new float[]{0.0f, 0.5f, 1.0f};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p2(k3 k3Var) {
        this(1);
        this.e = 1;
        this.g = k3Var;
    }
}
