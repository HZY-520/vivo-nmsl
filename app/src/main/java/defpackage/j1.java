package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class j1 extends AccessibilityNodeProvider {
    public final p2 a;

    public j1(p2 p2Var) {
        this.a = p2Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        ((k3) this.a.g).b(i, new i1(accessibilityNodeInfo), str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        i1 h = this.a.h(i);
        if (h == null) {
            return null;
        }
        return h.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        i1 h;
        p2 p2Var = this.a;
        k3 k3Var = (k3) p2Var.g;
        if (i == 1) {
            int i2 = k3Var.p;
            if (i2 != Integer.MIN_VALUE) {
                h = p2Var.h(i2);
            }
            h = null;
        } else if (i == 2) {
            h = p2Var.h(k3Var.o);
        } else {
            z6.l(j2.g("Unknown focus type: ", i));
            h = null;
        }
        if (h == null) {
            return null;
        }
        return h.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 34 ? defpackage.t0.e(r4) : true) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x01bf, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0741, code lost:
    
        if (r0 != 16) goto L496;
     */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0149  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAction(int i, int i2, Bundle bundle) {
        boolean z;
        uj0 uj0Var;
        boolean z2;
        int i3;
        u0 u0Var;
        int i4;
        int i5;
        v0 v0Var;
        np0 h;
        eq eqVar;
        eq eqVar2;
        eq eqVar3;
        eq eqVar4;
        eq eqVar5;
        eq eqVar6;
        eq eqVar7;
        eq eqVar8;
        eq eqVar9;
        pq pqVar;
        p0 p0Var;
        long j;
        float f;
        float f2;
        float f3;
        float f4;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        pq pqVar2;
        eq eqVar10;
        long j2;
        p0 p0Var2;
        eq eqVar11;
        float intBitsToFloat;
        p0 p0Var3;
        eq eqVar12;
        pq pqVar3;
        eq eqVar13;
        eq eqVar14;
        eq eqVar15;
        eq eqVar16;
        k3 k3Var = (k3) this.a.g;
        AccessibilityManager accessibilityManager = k3Var.k;
        Float valueOf = Float.valueOf(0.0f);
        e3 e3Var = k3Var.h;
        wj0 wj0Var = (wj0) k3Var.k().b(i);
        if (wj0Var != null && (uj0Var = wj0Var.a) != null) {
            iy iyVar = uj0Var.c;
            int i6 = uj0Var.f;
            qj0 qj0Var = uj0Var.d;
            k40 k40Var = qj0Var.e;
            Object g = k40Var.g(yj0.o);
            if (g == null) {
                g = null;
            }
            Boolean bool = Boolean.TRUE;
            int i7 = 1;
            if (lw.i(g, bool)) {
            }
            if (i2 == 64) {
                z2 = true;
                z = false;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = k3Var.o) != i) {
                    if (i3 != Integer.MIN_VALUE) {
                        k3.w(k3Var, i3, 65536, null, 12);
                    }
                    k3Var.o = i;
                    e3Var.invalidate();
                    k3.w(k3Var, i, 32768, null, 12);
                    return z2;
                }
                return z;
            }
            if (i2 == 128) {
                z2 = true;
                z = false;
                if (k3Var.o == i) {
                    k3Var.o = Integer.MIN_VALUE;
                    k3Var.q = null;
                    e3Var.invalidate();
                    k3.w(k3Var, i, 65536, null, 12);
                }
                return z;
            }
            if (i2 == 256 || i2 == 512) {
                if (bundle != null) {
                    int i8 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                    boolean z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                    boolean z4 = i2 == 256;
                    Integer num = k3Var.y;
                    if (num == null || i6 != num.intValue()) {
                        k3Var.x = -1;
                        k3Var.y = Integer.valueOf(i6);
                    }
                    String l = k3.l(uj0Var);
                    if (l != null && l.length() != 0) {
                        String l2 = k3.l(uj0Var);
                        if (l2 != null && l2.length() != 0) {
                            if (i8 == 1) {
                                Locale locale = e3Var.getContext().getResources().getConfiguration().locale;
                                v0Var = v0.e;
                                if (v0Var == null) {
                                    v0Var = new v0(0);
                                    v0Var.d = BreakIterator.getCharacterInstance(locale);
                                    v0.e = v0Var;
                                }
                                v0Var.f(l2);
                            } else if (i8 != 2) {
                                if (i8 != 4) {
                                    if (i8 == 8) {
                                        x0 x0Var = x0.c;
                                        x0 x0Var2 = x0Var;
                                        if (x0Var == null) {
                                            x0 x0Var3 = new x0();
                                            x0.c = x0Var3;
                                            x0Var2 = x0Var3;
                                        }
                                        x0Var2.a = l2;
                                        u0Var = x0Var2;
                                        if (u0Var != null) {
                                            int i9 = k3Var.i(uj0Var);
                                            if (i9 == -1) {
                                                i9 = z4 ? 0 : l.length();
                                            }
                                            int[] a = z4 ? u0Var.a(i9) : u0Var.d(i9);
                                            if (a != null) {
                                                int i10 = a[0];
                                                int i11 = a[1];
                                                if (z3 && !k40Var.c(yj0.a) && k40Var.c(yj0.E)) {
                                                    i4 = k3Var.j(uj0Var);
                                                    if (i4 == -1) {
                                                        i4 = z4 ? i10 : i11;
                                                    }
                                                    i5 = z4 ? i11 : i10;
                                                } else {
                                                    i4 = z4 ? i11 : i10;
                                                    i5 = i4;
                                                }
                                                int i12 = z4 ? 256 : 512;
                                                z2 = true;
                                                k3Var.C = new h3(uj0Var, i12, i8, i10, i11, SystemClock.uptimeMillis());
                                                k3Var.C(uj0Var, i4, i5, true);
                                            }
                                        }
                                    }
                                }
                                if (k40Var.c(pj0.a) && (h = v10.h(qj0Var)) != null) {
                                    if (i8 == 4) {
                                        v0 v0Var2 = v0.g;
                                        v0 v0Var3 = v0Var2;
                                        if (v0Var2 == null) {
                                            v0 v0Var4 = new v0(2);
                                            v0.g = v0Var4;
                                            v0Var3 = v0Var4;
                                        }
                                        v0Var3.a = l2;
                                        v0Var3.d = h;
                                        u0Var = v0Var3;
                                    } else {
                                        w0 w0Var = w0.e;
                                        w0 w0Var2 = w0Var;
                                        if (w0Var == null) {
                                            w0 w0Var3 = new w0();
                                            new Rect();
                                            w0.e = w0Var3;
                                            w0Var2 = w0Var3;
                                        }
                                        w0Var2.a = l2;
                                        w0Var2.c = h;
                                        w0Var2.d = uj0Var;
                                        u0Var = w0Var2;
                                    }
                                    if (u0Var != null) {
                                    }
                                }
                            } else {
                                Locale locale2 = e3Var.getContext().getResources().getConfiguration().locale;
                                v0Var = v0.f;
                                if (v0Var == null) {
                                    v0Var = new v0(i7);
                                    v0Var.d = BreakIterator.getWordInstance(locale2);
                                    v0.f = v0Var;
                                }
                                v0Var.f(l2);
                            }
                            u0Var = v0Var;
                            if (u0Var != null) {
                            }
                        }
                        u0Var = null;
                        if (u0Var != null) {
                        }
                    }
                }
            } else if (i2 == 16384) {
                Object g2 = k40Var.g(pj0.o);
                p0 p0Var4 = (p0) (g2 == null ? null : g2);
                if (p0Var4 != null && (eqVar = (eq) p0Var4.b) != null) {
                    return ((Boolean) eqVar.b()).booleanValue();
                }
            } else {
                if (i2 == 131072) {
                    boolean C = k3Var.C(uj0Var, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                    if (C) {
                        k3.w(k3Var, k3Var.s(i6), 0, null, 12);
                    }
                    return C;
                }
                if (kw.l(uj0Var)) {
                    if (i2 == 1) {
                        if (e3Var.isInTouchMode()) {
                            e3Var.requestFocusFromTouch();
                        }
                        Object g3 = k40Var.g(pj0.u);
                        p0 p0Var5 = (p0) (g3 == null ? null : g3);
                        if (p0Var5 != null && (eqVar2 = (eq) p0Var5.b) != null) {
                            return ((Boolean) eqVar2.b()).booleanValue();
                        }
                    } else if (i2 != 2) {
                        xx xxVar = xx.f;
                        switch (i2) {
                            case 16:
                                Object g4 = k40Var.g(pj0.b);
                                if (g4 == null) {
                                    g4 = null;
                                }
                                p0 p0Var6 = (p0) g4;
                                Boolean bool2 = (p0Var6 == null || (eqVar3 = (eq) p0Var6.b) == null) ? null : (Boolean) eqVar3.b();
                                k3.w(k3Var, i, 1, null, 12);
                                if (bool2 != null) {
                                    return bool2.booleanValue();
                                }
                                break;
                            case 32:
                                Object g5 = k40Var.g(pj0.c);
                                p0 p0Var7 = (p0) (g5 == null ? null : g5);
                                if (p0Var7 != null && (eqVar4 = (eq) p0Var7.b) != null) {
                                    return ((Boolean) eqVar4.b()).booleanValue();
                                }
                                break;
                            case 4096:
                            case 8192:
                                boolean z5 = i2 == 4096;
                                boolean z6 = i2 == 8192;
                                boolean z7 = i2 == 16908345;
                                boolean z8 = i2 == 16908347;
                                boolean z9 = i2 == 16908344;
                                boolean z10 = i2 == 16908346;
                                boolean z11 = z7 || z8 || z5 || z6;
                                if (!z9 && !z10 && !z5 && !z6) {
                                    i7 = 0;
                                }
                                if (z5 || z6) {
                                    Object g6 = k40Var.g(yj0.c);
                                    if (g6 == null) {
                                        g6 = null;
                                    }
                                    td0 td0Var = (td0) g6;
                                    Object g7 = k40Var.g(pj0.h);
                                    if (g7 == null) {
                                        g7 = null;
                                    }
                                    p0 p0Var8 = (p0) g7;
                                    if (td0Var != null && p0Var8 != null) {
                                        float f5 = z6 ? -0.0f : 0.0f;
                                        pq pqVar4 = (pq) p0Var8.b;
                                        if (pqVar4 != null) {
                                            return ((Boolean) pqVar4.invoke(Float.valueOf(0.0f + f5))).booleanValue();
                                        }
                                    }
                                }
                                long b = q3.d(iyVar.H.c).b();
                                ArrayList arrayList = new ArrayList();
                                Object g8 = k40Var.g(pj0.A);
                                if (g8 == null) {
                                    g8 = null;
                                }
                                p0 p0Var9 = (p0) g8;
                                Float f6 = (p0Var9 == null || (pqVar3 = (pq) p0Var9.b) == null || !((Boolean) pqVar3.invoke(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                Object g9 = k40Var.g(pj0.d);
                                if (g9 == null) {
                                    g9 = null;
                                }
                                p0 p0Var10 = (p0) g9;
                                if (p0Var10 != null) {
                                    br brVar = p0Var10.b;
                                    Object g10 = k40Var.g(yj0.v);
                                    if (g10 == null) {
                                        g10 = null;
                                    }
                                    ki0 ki0Var = (ki0) g10;
                                    if (ki0Var == null || !z11) {
                                        j2 = b;
                                    } else {
                                        if (f6 != null) {
                                            intBitsToFloat = f6.floatValue();
                                            j2 = b;
                                        } else {
                                            j2 = b;
                                            intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                                        }
                                        if (z7 || z6) {
                                            intBitsToFloat = -intBitsToFloat;
                                        }
                                        if (iyVar.B == xxVar && (z7 || z8)) {
                                            intBitsToFloat = -intBitsToFloat;
                                        }
                                        if (k3.p(ki0Var, intBitsToFloat)) {
                                            ak0 ak0Var = pj0.x;
                                            if (k40Var.c(ak0Var) || k40Var.c(pj0.z)) {
                                                if (intBitsToFloat > 0.0f) {
                                                    Object g11 = k40Var.g(pj0.z);
                                                    p0Var3 = (p0) (g11 == null ? null : g11);
                                                } else {
                                                    Object g12 = k40Var.g(ak0Var);
                                                    p0Var3 = (p0) (g12 == null ? null : g12);
                                                }
                                                if (p0Var3 != null && (eqVar12 = (eq) p0Var3.b) != null) {
                                                    return ((Boolean) eqVar12.b()).booleanValue();
                                                }
                                            } else {
                                                tq tqVar = (tq) brVar;
                                                if (tqVar != null) {
                                                    return ((Boolean) tqVar.invoke(Float.valueOf(intBitsToFloat), valueOf)).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                    Object g13 = k40Var.g(yj0.w);
                                    if (g13 == null) {
                                        g13 = null;
                                    }
                                    ki0 ki0Var2 = (ki0) g13;
                                    if (ki0Var2 != null && i7 != 0) {
                                        float floatValue = f6 != null ? f6.floatValue() : Float.intBitsToFloat((int) (j2 & 4294967295L));
                                        if (z9 || z6) {
                                            floatValue = -floatValue;
                                        }
                                        if (k3.p(ki0Var2, floatValue)) {
                                            ak0 ak0Var2 = pj0.w;
                                            if (k40Var.c(ak0Var2) || k40Var.c(pj0.y)) {
                                                if (floatValue > 0.0f) {
                                                    Object g14 = k40Var.g(pj0.y);
                                                    p0Var2 = (p0) (g14 == null ? null : g14);
                                                } else {
                                                    Object g15 = k40Var.g(ak0Var2);
                                                    p0Var2 = (p0) (g15 == null ? null : g15);
                                                }
                                                if (p0Var2 != null && (eqVar11 = (eq) p0Var2.b) != null) {
                                                    return ((Boolean) eqVar11.b()).booleanValue();
                                                }
                                            } else {
                                                tq tqVar2 = (tq) brVar;
                                                if (tqVar2 != null) {
                                                    return ((Boolean) tqVar2.invoke(valueOf, Float.valueOf(floatValue))).booleanValue();
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            case 32768:
                                Object g16 = k40Var.g(pj0.q);
                                p0 p0Var11 = (p0) (g16 == null ? null : g16);
                                if (p0Var11 != null && (eqVar5 = (eq) p0Var11.b) != null) {
                                    return ((Boolean) eqVar5.b()).booleanValue();
                                }
                                break;
                            case 65536:
                                Object g17 = k40Var.g(pj0.p);
                                p0 p0Var12 = (p0) (g17 == null ? null : g17);
                                if (p0Var12 != null && (eqVar6 = (eq) p0Var12.b) != null) {
                                    return ((Boolean) eqVar6.b()).booleanValue();
                                }
                                break;
                            case 262144:
                                Object g18 = k40Var.g(pj0.r);
                                p0 p0Var13 = (p0) (g18 == null ? null : g18);
                                if (p0Var13 != null && (eqVar7 = (eq) p0Var13.b) != null) {
                                    return ((Boolean) eqVar7.b()).booleanValue();
                                }
                                break;
                            case 524288:
                                Object g19 = k40Var.g(pj0.s);
                                p0 p0Var14 = (p0) (g19 == null ? null : g19);
                                if (p0Var14 != null && (eqVar8 = (eq) p0Var14.b) != null) {
                                    return ((Boolean) eqVar8.b()).booleanValue();
                                }
                                break;
                            case 1048576:
                                Object g20 = k40Var.g(pj0.t);
                                p0 p0Var15 = (p0) (g20 == null ? null : g20);
                                if (p0Var15 != null && (eqVar9 = (eq) p0Var15.b) != null) {
                                    return ((Boolean) eqVar9.b()).booleanValue();
                                }
                                break;
                            case 2097152:
                                String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                Object g21 = k40Var.g(pj0.j);
                                p0 p0Var16 = (p0) (g21 == null ? null : g21);
                                if (p0Var16 != null && (pqVar = (pq) p0Var16.b) != null) {
                                    if (string == null) {
                                        string = "";
                                    }
                                    return ((Boolean) pqVar.invoke(new p6(string))).booleanValue();
                                }
                                break;
                            case R.id.accessibilityActionShowOnScreen:
                                uj0 l3 = uj0Var.l();
                                if (l3 != null) {
                                    Object g22 = l3.d.e.g(pj0.d);
                                    if (g22 == null) {
                                        g22 = null;
                                    }
                                    p0Var = (p0) g22;
                                    while (p0Var == null && l3 != null) {
                                        l3 = l3.l();
                                        if (l3 != null) {
                                            Object g23 = l3.d.e.g(pj0.d);
                                            if (g23 == null) {
                                                g23 = null;
                                            }
                                            p0Var = (p0) g23;
                                        }
                                    }
                                    if (l3 == null) {
                                        oe0 g24 = uj0Var.g();
                                        return e3Var.requestRectangleOnScreen(new Rect((int) Math.floor(g24.a), (int) Math.floor(g24.b), t10.B((float) Math.ceil(g24.c)), t10.B((float) Math.ceil(g24.d))));
                                    }
                                    long j3 = 0;
                                    long j4 = 0;
                                    boolean z12 = false;
                                    while (l3 != null) {
                                        iy iyVar2 = l3.c;
                                        k40 k40Var2 = l3.d.e;
                                        Object g25 = k40Var2.g(pj0.d);
                                        if (g25 == null) {
                                            g25 = null;
                                        }
                                        p0 p0Var17 = (p0) g25;
                                        if (p0Var17 != null) {
                                            oe0 d = q3.d(iyVar2.H.c);
                                            wx f7 = iyVar2.H.c.f();
                                            oe0 f8 = d.f(f7 != null ? ((d60) f7).K0(j3) : j3);
                                            d60 d2 = uj0Var.d();
                                            if (d2 != null) {
                                                if (!d2.A0().r) {
                                                    d2 = null;
                                                }
                                                if (d2 != null) {
                                                    j = d2.K0(j3);
                                                    long e = s60.e(j, j4);
                                                    d60 d3 = uj0Var.d();
                                                    oe0 a2 = z20.a(e, t10.G(d3 == null ? d3.g : 0L));
                                                    f = a2.a - f8.a;
                                                    f2 = a2.c - f8.c;
                                                    if (Math.signum(f) == Math.signum(f2)) {
                                                        f = 0.0f;
                                                    } else if (Math.abs(f) >= Math.abs(f2)) {
                                                        f = f2;
                                                    }
                                                    f3 = a2.b - f8.b;
                                                    f4 = a2.d - f8.d;
                                                    if (Math.signum(f3) == Math.signum(f4)) {
                                                        f3 = 0.0f;
                                                    } else if (Math.abs(f3) >= Math.abs(f4)) {
                                                        f3 = f4;
                                                    }
                                                    floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                                                    if (s60.b(floatToRawIntBits, 0L)) {
                                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                                                        Object g26 = k40Var2.g(yj0.v);
                                                        if (g26 == null) {
                                                            g26 = null;
                                                        }
                                                        if (iyVar.B == xxVar) {
                                                            intBitsToFloat2 = -intBitsToFloat2;
                                                        }
                                                        Object g27 = k40Var2.g(yj0.w);
                                                        if (g27 == null) {
                                                            g27 = null;
                                                        }
                                                        floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                                                    } else {
                                                        floatToRawIntBits2 = floatToRawIntBits;
                                                    }
                                                    tq tqVar3 = (tq) p0Var17.b;
                                                    z12 = (tqVar3 == null && ((Boolean) tqVar3.invoke(Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L))))).booleanValue()) || z12;
                                                    j4 = s60.d(j4, floatToRawIntBits);
                                                }
                                            }
                                            j = j3;
                                            long e2 = s60.e(j, j4);
                                            d60 d32 = uj0Var.d();
                                            oe0 a22 = z20.a(e2, t10.G(d32 == null ? d32.g : 0L));
                                            f = a22.a - f8.a;
                                            f2 = a22.c - f8.c;
                                            if (Math.signum(f) == Math.signum(f2)) {
                                            }
                                            f3 = a22.b - f8.b;
                                            f4 = a22.d - f8.d;
                                            if (Math.signum(f3) == Math.signum(f4)) {
                                            }
                                            floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                                            if (s60.b(floatToRawIntBits, 0L)) {
                                            }
                                            tq tqVar32 = (tq) p0Var17.b;
                                            if (tqVar32 == null) {
                                            }
                                            j4 = s60.d(j4, floatToRawIntBits);
                                        }
                                        l3 = l3.l();
                                        j3 = 0;
                                    }
                                    return z12;
                                }
                                p0Var = null;
                                break;
                            case R.id.accessibilityActionSetProgress:
                                if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                    Object g28 = k40Var.g(pj0.h);
                                    p0 p0Var18 = (p0) (g28 == null ? null : g28);
                                    if (p0Var18 != null && (pqVar2 = (pq) p0Var18.b) != null) {
                                        return ((Boolean) pqVar2.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                    }
                                }
                                break;
                            case R.id.accessibilityActionImeEnter:
                                Object g29 = k40Var.g(pj0.n);
                                p0 p0Var19 = (p0) (g29 == null ? null : g29);
                                if (p0Var19 != null && (eqVar10 = (eq) p0Var19.b) != null) {
                                    return ((Boolean) eqVar10.b()).booleanValue();
                                }
                                break;
                            default:
                                switch (i2) {
                                    case R.id.accessibilityActionScrollUp:
                                    case R.id.accessibilityActionScrollLeft:
                                    case R.id.accessibilityActionScrollDown:
                                    case R.id.accessibilityActionScrollRight:
                                        break;
                                    default:
                                        switch (i2) {
                                            case R.id.accessibilityActionPageUp:
                                                Object g30 = k40Var.g(pj0.w);
                                                p0 p0Var20 = (p0) (g30 == null ? null : g30);
                                                if (p0Var20 != null && (eqVar13 = (eq) p0Var20.b) != null) {
                                                    return ((Boolean) eqVar13.b()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageDown:
                                                Object g31 = k40Var.g(pj0.y);
                                                p0 p0Var21 = (p0) (g31 == null ? null : g31);
                                                if (p0Var21 != null && (eqVar14 = (eq) p0Var21.b) != null) {
                                                    return ((Boolean) eqVar14.b()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageLeft:
                                                Object g32 = k40Var.g(pj0.x);
                                                p0 p0Var22 = (p0) (g32 == null ? null : g32);
                                                if (p0Var22 != null && (eqVar15 = (eq) p0Var22.b) != null) {
                                                    return ((Boolean) eqVar15.b()).booleanValue();
                                                }
                                                break;
                                            case R.id.accessibilityActionPageRight:
                                                Object g33 = k40Var.g(pj0.z);
                                                p0 p0Var23 = (p0) (g33 == null ? null : g33);
                                                if (p0Var23 != null && (eqVar16 = (eq) p0Var23.b) != null) {
                                                    return ((Boolean) eqVar16.b()).booleanValue();
                                                }
                                                break;
                                            default:
                                                qm0 qm0Var = k3Var.v;
                                                qm0Var.getClass();
                                                qm0 qm0Var2 = (qm0) q3.l(qm0Var, i);
                                                if (qm0Var2 != null && ((CharSequence) q3.l(qm0Var2, i2)) != null) {
                                                    Object g34 = k40Var.g(pj0.v);
                                                    List list = (List) (g34 == null ? null : g34);
                                                    if (list != null && list.size() > 0) {
                                                        list.get(0).getClass();
                                                        z6.c();
                                                        return false;
                                                    }
                                                }
                                                break;
                                        }
                                }
                        }
                    } else {
                        Object g35 = k40Var.g(yj0.l);
                        if (g35 == null) {
                            g35 = null;
                        }
                        if (lw.i(g35, bool)) {
                            ((uo) e3Var.getFocusOwner()).b(8, false, true);
                            return true;
                        }
                    }
                }
            }
            return z2;
        }
        z = false;
        return z;
    }
}
