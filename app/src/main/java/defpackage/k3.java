package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class k3 extends s0 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final x30 R;
    public final o9 A;
    public boolean B;
    public h3 C;
    public y30 D;
    public final z30 E;
    public final w30 F;
    public final w30 G;
    public final String H;
    public final String I;
    public final v6 J;
    public final y30 K;
    public vj0 L;
    public boolean M;
    public final w30 N;
    public final o O;
    public final ArrayList P;
    public final f3 Q;
    public final e3 h;
    public int i = Integer.MIN_VALUE;
    public final f3 j = new f3(this, 0);
    public final AccessibilityManager k;
    public long l;
    public List m;
    public final p2 n;
    public int o;
    public int p;
    public i1 q;
    public i1 r;
    public boolean s;
    public final y30 t;
    public final y30 u;
    public final qm0 v;
    public final qm0 w;
    public int x;
    public Integer y;
    public final n7 z;

    static {
        int[] iArr = {2131034113, 2131034114, 2131034125, 2131034136, 2131034139, 2131034140, 2131034141, 2131034142, 2131034143, 2131034144, 2131034115, 2131034116, 2131034117, 2131034118, 2131034119, 2131034120, 2131034121, 2131034122, 2131034123, 2131034124, 2131034126, 2131034127, 2131034128, 2131034129, 2131034130, 2131034131, 2131034132, 2131034133, 2131034134, 2131034135, 2131034137, 2131034138};
        int i = uv.a;
        x30 x30Var = new x30(32);
        int i2 = x30Var.b;
        if (i2 < 0) {
            z6.f("");
            return;
        }
        int i3 = i2 + 32;
        int[] iArr2 = x30Var.a;
        if (iArr2.length < i3) {
            iArr2 = Arrays.copyOf(iArr2, Math.max(i3, (iArr2.length * 3) / 2));
            x30Var.a = iArr2;
        }
        int i4 = x30Var.b;
        if (i2 != i4) {
            o7.P(iArr2, iArr2, i3, i2, i4);
        }
        o7.S(iArr, iArr2, i2, 0, 12);
        x30Var.b += 32;
        R = x30Var;
    }

    public k3(e3 e3Var) {
        this.h = e3Var;
        Object systemService = e3Var.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.k = (AccessibilityManager) systemService;
        this.l = 100L;
        new Handler(Looper.getMainLooper());
        this.n = new p2(this);
        this.o = Integer.MIN_VALUE;
        this.p = Integer.MIN_VALUE;
        this.t = new y30();
        this.u = new y30();
        this.v = new qm0();
        this.w = new qm0();
        this.x = -1;
        this.z = new n7();
        int i = 1;
        this.A = lw.a(1, 6, null);
        this.B = true;
        y30 y30Var = wv.a;
        y30Var.getClass();
        this.D = y30Var;
        this.E = new z30();
        this.F = new w30();
        this.G = new w30();
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.I = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.J = new v6(10);
        this.K = new y30();
        this.L = new vj0(e3Var.getSemanticsOwner().a(), y30Var);
        int i2 = tv.a;
        this.N = new w30();
        e3Var.addOnAttachStateChangeListener(this);
        this.O = new o(i, this);
        this.P = new ArrayList();
        this.Q = new f3(this, i);
    }

    public static Rect D(v10 v10Var, float f, float f2) {
        if (!(v10Var instanceof t80) && !(v10Var instanceof u80)) {
            return null;
        }
        oe0 f3 = v10Var.f();
        return new Rect((int) (f3.a + f), (int) (f3.b + f2), (int) (f3.c + f), (int) (f3.d + f2));
    }

    public static float[] F(v10 v10Var) {
        if (!(v10Var instanceof u80)) {
            return null;
        }
        ng0 ng0Var = ((u80) v10Var).b;
        long j = ng0Var.h;
        long j2 = ng0Var.g;
        long j3 = ng0Var.f;
        long j4 = ng0Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region G(v10 v10Var, float f, float f2) {
        if (!(v10Var instanceof s80)) {
            return null;
        }
        s80 s80Var = (s80) v10Var;
        oe0 e = s80Var.f().e(f, f2);
        Region region = new Region(new Rect((int) (e.a + 0.0f), (int) (e.b + 0.0f), (int) (e.c + 0.0f), (int) (e.d + 0.0f)));
        Region region2 = new Region();
        c5 c5Var = s80Var.b;
        if (!(c5Var instanceof c5)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = c5Var.a;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence H(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String l(uj0 uj0Var) {
        p6 p6Var;
        if (uj0Var != null) {
            qj0 qj0Var = uj0Var.d;
            k40 k40Var = qj0Var.e;
            ak0 ak0Var = yj0.a;
            if (k40Var.c(ak0Var)) {
                return c00.a((List) qj0Var.c(ak0Var), ",", null, 62);
            }
            ak0 ak0Var2 = yj0.E;
            if (k40Var.c(ak0Var2)) {
                Object g = k40Var.g(ak0Var2);
                if (g == null) {
                    g = null;
                }
                p6 p6Var2 = (p6) g;
                if (p6Var2 != null) {
                    return p6Var2.f;
                }
            } else {
                Object g2 = k40Var.g(yj0.A);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null && (p6Var = (p6) ac.a0(list)) != null) {
                    return p6Var.f;
                }
            }
        }
        return null;
    }

    public static final boolean p(ki0 ki0Var, float f) {
        oi0 oi0Var = ki0Var.a;
        if (f >= 0.0f || ((Number) oi0Var.b()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) oi0Var.b()).floatValue() < ((Number) ki0Var.b.b()).floatValue();
        }
        return true;
    }

    public static final boolean q(ki0 ki0Var) {
        oi0 oi0Var = ki0Var.a;
        if (((Number) oi0Var.b()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) oi0Var.b()).floatValue();
        ((Number) ki0Var.b.b()).floatValue();
        return false;
    }

    public static final boolean r(ki0 ki0Var) {
        oi0 oi0Var = ki0Var.a;
        if (((Number) oi0Var.b()).floatValue() < ((Number) ki0Var.b.b()).floatValue()) {
            return true;
        }
        ((Number) oi0Var.b()).floatValue();
        return false;
    }

    public static /* synthetic */ void w(k3 k3Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        k3Var.v(i, i2, num, null);
    }

    public final void A(iy iyVar, z30 z30Var) {
        qj0 q;
        if (iyVar.B() && !this.h.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(iyVar)) {
            iy iyVar2 = null;
            if (!iyVar.H.c(8)) {
                iyVar = iyVar.n();
                while (true) {
                    if (iyVar == null) {
                        iyVar = null;
                        break;
                    } else if (iyVar.H.c(8)) {
                        break;
                    } else {
                        iyVar = iyVar.n();
                    }
                }
            }
            if (iyVar == null || (q = iyVar.q()) == null) {
                return;
            }
            if (!q.g) {
                iy n = iyVar.n();
                while (true) {
                    if (n != null) {
                        qj0 q2 = n.q();
                        if (q2 != null && q2.g) {
                            iyVar2 = n;
                            break;
                        }
                        n = n.n();
                    } else {
                        break;
                    }
                }
                if (iyVar2 != null) {
                    iyVar = iyVar2;
                }
            }
            int i = iyVar.f;
            if (z30Var.a(i)) {
                w(this, s(i), 2048, 1, 8);
            }
        }
    }

    public final void B(iy iyVar) {
        if (iyVar.B() && !this.h.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(iyVar)) {
            int i = iyVar.f;
            ki0 ki0Var = (ki0) this.t.b(i);
            ki0 ki0Var2 = (ki0) this.u.b(i);
            if (ki0Var == null && ki0Var2 == null) {
                return;
            }
            AccessibilityEvent g = g(i, 4096);
            if (ki0Var != null) {
                g.setScrollX((int) ((Number) ki0Var.a.b()).floatValue());
                g.setMaxScrollX((int) ((Number) ki0Var.b.b()).floatValue());
            }
            if (ki0Var2 != null) {
                g.setScrollY((int) ((Number) ki0Var2.a.b()).floatValue());
                g.setMaxScrollY((int) ((Number) ki0Var2.b.b()).floatValue());
            }
            u(g);
        }
    }

    public final boolean C(uj0 uj0Var, int i, int i2, boolean z) {
        String l;
        qj0 qj0Var = uj0Var.d;
        int i3 = uj0Var.f;
        ak0 ak0Var = pj0.i;
        if (qj0Var.e.c(ak0Var) && kw.l(uj0Var)) {
            uq uqVar = (uq) ((p0) uj0Var.d.c(ak0Var)).b;
            if (uqVar != null) {
                return ((Boolean) uqVar.c(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.x) && (l = l(uj0Var)) != null) {
            if (i < 0 || i != i2 || i2 > l.length()) {
                i = -1;
            }
            this.x = i;
            boolean z2 = l.length() > 0;
            u(h(s(i3), z2 ? Integer.valueOf(this.x) : null, z2 ? Integer.valueOf(this.x) : null, z2 ? Integer.valueOf(l.length()) : null, l));
            y(i3);
            return true;
        }
        return false;
    }

    public final Rect E(float f, float f2, float f3, float f4) {
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        e3 e3Var = this.h;
        long q = e3Var.q((Float.floatToRawIntBits(f2) & 4294967295L) | (floatToRawIntBits << 32));
        long q2 = e3Var.q((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (q >> 32);
        int i2 = (int) (q2 >> 32);
        int i3 = (int) (q & 4294967295L);
        int i4 = (int) (q2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int i3;
        char c2;
        z30 z30Var = new z30();
        z30 z30Var2 = this.E;
        int[] iArr = z30Var2.b;
        long[] jArr3 = z30Var2.a;
        int length = jArr3.length - 2;
        y30 y30Var = this.K;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i5];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j5 & 255) < 128) {
                            int i8 = iArr[(i5 << 3) + i7];
                            c2 = c3;
                            wj0 wj0Var = (wj0) k().b(i8);
                            uj0 uj0Var = wj0Var != null ? wj0Var.a : null;
                            if (uj0Var != null) {
                                if (uj0Var.d.e.c(yj0.d)) {
                                }
                            }
                            z30Var.a(i8);
                            vj0 vj0Var = (vj0) y30Var.b(i8);
                            if (vj0Var != null) {
                                Object g = vj0Var.a.e.g(yj0.d);
                                r23 = g != 0 ? g : null;
                            }
                            x(i8, 32, r23);
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i7++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = z30Var.b;
        long[] jArr4 = z30Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr4[i9];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j6 & j2) < j) {
                            int i12 = iArr2[(i9 << 3) + i11];
                            int hashCode = Integer.hashCode(i12) * (-862048943);
                            int i13 = hashCode ^ (hashCode << 16);
                            int i14 = i13 & 127;
                            int i15 = z30Var2.c;
                            int i16 = (i13 >>> 7) & i15;
                            i = i4;
                            int i17 = 0;
                            while (true) {
                                long[] jArr5 = z30Var2.a;
                                int i18 = i16 >> 3;
                                jArr2 = jArr4;
                                int i19 = (i16 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i18] >>> i19) | ((jArr5[i18 + 1] << (64 - i19)) & ((-i19) >> 63));
                                int i20 = i15;
                                long j8 = (i14 * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    i3 = (i16 + (Long.numberOfTrailingZeros(j9) >> 3)) & i20;
                                    int i21 = i20;
                                    if (z30Var2.b[i3] == i12) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i20 = i21;
                                }
                                i17 += 8;
                                i16 = (i16 + i17) & i2;
                                jArr4 = jArr2;
                                i15 = i2;
                                j6 = j4;
                            }
                            int i22 = i3;
                            if (i22 >= 0) {
                                z30Var2.f(i22);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i4;
                        }
                        j6 = j4 >> i;
                        i11++;
                        i4 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i10 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                jArr4 = jArr;
                i4 = 8;
            }
        }
        y30Var.c();
        vv k = k();
        int[] iArr3 = k.b;
        Object[] objArr = k.c;
        long[] jArr6 = k.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i23 = 0;
            while (true) {
                long j10 = jArr6[i23];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i24 = 8 - ((~(i23 - length3)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j10 & j2) < j) {
                            int i26 = (i23 << 3) + i25;
                            int i27 = iArr3[i26];
                            uj0 uj0Var2 = ((wj0) objArr[i26]).a;
                            qj0 qj0Var = uj0Var2.d;
                            ak0 ak0Var = yj0.d;
                            if (qj0Var.e.c(ak0Var) && z30Var2.a(i27)) {
                                x(i27, 16, (String) uj0Var2.d.c(ak0Var));
                            }
                            y30Var.h(i27, new vj0(uj0Var2, k()));
                        }
                        j10 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    }
                }
                if (i23 == length3) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.L = new vj0(this.h.getSemanticsOwner().a(), k());
    }

    @Override // defpackage.s0
    public final p2 a(View view) {
        return this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, i1 i1Var, String str, Bundle bundle) {
        uj0 uj0Var;
        RectF[] rectFArr;
        int i2;
        int i3;
        np0 np0Var;
        float h;
        float f;
        RectF[] rectFArr2;
        int i4;
        AccessibilityNodeInfo accessibilityNodeInfo = i1Var.a;
        wj0 wj0Var = (wj0) k().b(i);
        if (wj0Var == null || (uj0Var = wj0Var.a) == null) {
            return;
        }
        iy iyVar = uj0Var.c;
        qj0 qj0Var = uj0Var.d;
        k40 k40Var = qj0Var.e;
        String l = l(uj0Var);
        if (lw.i(str, this.H)) {
            int d = this.F.d(i);
            if (d != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d);
                return;
            }
            return;
        }
        if (lw.i(str, this.I)) {
            int d2 = this.G.d(i);
            if (d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d2);
                return;
            }
            return;
        }
        boolean c = k40Var.c(pj0.a);
        e3 e3Var = this.h;
        if (!c || bundle == null || !lw.i(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            ak0 ak0Var = yj0.y;
            if (k40Var.c(ak0Var) && bundle != null && lw.i(str, "androidx.compose.ui.semantics.testTag")) {
                Object g = k40Var.g(ak0Var);
                String str2 = (String) (g == null ? null : g);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (lw.i(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo.getExtras().putInt(str, uj0Var.f);
                return;
            }
            if (lw.i(str, "androidx.compose.ui.semantics.shapeType")) {
                Object g2 = k40Var.g(yj0.O);
                tk0 tk0Var = (tk0) (g2 == null ? null : g2);
                if (tk0Var != null) {
                    Rect rect = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect);
                    oe0 m = m(uj0Var, rect, tk0Var);
                    float f2 = m.b;
                    float f3 = m.a;
                    v10 a = tk0Var.a(m.b(), iyVar.B, e3Var.getDensity());
                    if (a instanceof t80) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", D(a, f3, f2));
                        return;
                    } else if (a instanceof u80) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", D(a, f3, f2));
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", F(a));
                        return;
                    } else if (!(a instanceof s80)) {
                        z6.j();
                        return;
                    } else {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", G(a, f3, f2));
                        return;
                    }
                }
                return;
            }
            if (lw.i(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object g3 = k40Var.g(yj0.O);
                tk0 tk0Var2 = (tk0) (g3 == null ? null : g3);
                if (tk0Var2 != null) {
                    Rect rect2 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect2);
                    oe0 m2 = m(uj0Var, rect2, tk0Var2);
                    Rect D = D(tk0Var2.a(m2.b(), iyVar.B, e3Var.getDensity()), m2.a, m2.b);
                    if (D != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", D);
                        return;
                    }
                    return;
                }
                return;
            }
            if (lw.i(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object g4 = k40Var.g(yj0.O);
                tk0 tk0Var3 = (tk0) (g4 == null ? null : g4);
                if (tk0Var3 != null) {
                    Rect rect3 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect3);
                    float[] F = F(tk0Var3.a(m(uj0Var, rect3, tk0Var3).b(), iyVar.B, e3Var.getDensity()));
                    if (F != null) {
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", F);
                        return;
                    }
                    return;
                }
                return;
            }
            if (lw.i(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object g5 = k40Var.g(yj0.O);
                tk0 tk0Var4 = (tk0) (g5 == null ? null : g5);
                if (tk0Var4 != null) {
                    Rect rect4 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect4);
                    oe0 m3 = m(uj0Var, rect4, tk0Var4);
                    Region G = G(tk0Var4.a(m3.b(), iyVar.B, e3Var.getDensity()), m3.a, m3.b);
                    if (G != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", G);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i6 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i6 > 0 && i5 >= 0) {
            if (i5 < (l != null ? l.length() : Integer.MAX_VALUE)) {
                np0 h2 = v10.h(qj0Var);
                if (h2 != null) {
                    iv ivVar = iyVar.H.c;
                    if (!ivVar.e0.r) {
                        ivVar = null;
                    }
                    if (ivVar != null) {
                        long K0 = ivVar.K0(0L);
                        oe0 g6 = uj0Var.g();
                        RectF[] rectFArr3 = new RectF[i6];
                        int i7 = 0;
                        while (i7 < i6) {
                            int i8 = i5 + i7;
                            if (i8 >= h2.a.a.f.length()) {
                                i2 = i5;
                                i3 = i6;
                                np0Var = h2;
                                rectFArr2 = rectFArr3;
                                i4 = i7;
                            } else {
                                q5 q5Var = h2.b;
                                p6 p6Var = (p6) ((l20) q5Var.c).e;
                                i2 = i5;
                                if (i8 < 0 || i8 >= p6Var.f.length()) {
                                    int length = p6Var.f.length();
                                    StringBuilder sb = new StringBuilder("offset(");
                                    sb.append(i8);
                                    i3 = i6;
                                    sb.append(") is out of bounds [0, ");
                                    sb.append(length);
                                    sb.append(")");
                                    dv.a(sb.toString());
                                } else {
                                    i3 = i6;
                                }
                                ArrayList arrayList = (ArrayList) q5Var.e;
                                m90 m90Var = (m90) arrayList.get(t30.i(i8, arrayList));
                                x4 x4Var = m90Var.a;
                                int a2 = m90Var.a(i8);
                                CharSequence charSequence = x4Var.e;
                                if (a2 < 0 || a2 >= charSequence.length()) {
                                    dv.a("offset(" + a2 + ") is out of bounds [0," + charSequence.length() + ")");
                                }
                                lp0 lp0Var = x4Var.d;
                                int e = lp0Var.e(a2);
                                float f4 = lp0Var.f(e);
                                float c2 = lp0Var.c(e);
                                Layout layout = lp0Var.e;
                                np0Var = h2;
                                boolean z = layout.getParagraphDirection(e) == 1;
                                boolean isRtlCharAt = layout.isRtlCharAt(a2);
                                if (z && !isRtlCharAt) {
                                    f = lp0Var.g(a2, false);
                                    h = lp0Var.g(a2 + 1, true);
                                } else if (z && isRtlCharAt) {
                                    float h3 = lp0Var.h(a2, false);
                                    f = lp0Var.h(a2 + 1, true);
                                    h = h3;
                                } else if (isRtlCharAt) {
                                    float g7 = lp0Var.g(a2, false);
                                    f = lp0Var.g(a2 + 1, true);
                                    h = g7;
                                } else {
                                    float h4 = lp0Var.h(a2, false);
                                    h = lp0Var.h(a2 + 1, true);
                                    f = h4;
                                }
                                RectF rectF = new RectF(f, f4, h, c2);
                                long floatToRawIntBits = (Float.floatToRawIntBits(m90Var.f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                                int i9 = (int) (floatToRawIntBits >> 32);
                                rectFArr2 = rectFArr3;
                                i4 = i7;
                                int i10 = (int) (floatToRawIntBits & 4294967295L);
                                oe0 f5 = new oe0(Float.intBitsToFloat(i9) + rectF.left, Float.intBitsToFloat(i10) + rectF.top + 0.0f, Float.intBitsToFloat(i9) + rectF.right, Float.intBitsToFloat(i10) + rectF.bottom + 0.0f).f(K0);
                                if ((((((g6.a > f5.c ? 1 : (g6.a == f5.c ? 0 : -1)) < 0) & ((f5.a > g6.c ? 1 : (f5.a == g6.c ? 0 : -1)) < 0)) & ((f5.b > g6.d ? 1 : (f5.b == g6.d ? 0 : -1)) < 0)) & ((g6.b > f5.d ? 1 : (g6.b == f5.d ? 0 : -1)) < 0) ? f5.c(g6) : null) != null) {
                                    long q = e3Var.q((Float.floatToRawIntBits(r0.a) << 32) | (Float.floatToRawIntBits(r0.b) & 4294967295L));
                                    long q2 = e3Var.q((Float.floatToRawIntBits(r0.d) & 4294967295L) | (Float.floatToRawIntBits(r0.c) << 32));
                                    int i11 = (int) (q >> 32);
                                    int i12 = (int) (q2 >> 32);
                                    int i13 = (int) (q & 4294967295L);
                                    int i14 = (int) (q2 & 4294967295L);
                                    rectFArr2[i4] = new RectF(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.min(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.max(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)));
                                }
                            }
                            i7 = i4 + 1;
                            i5 = i2;
                            i6 = i3;
                            rectFArr3 = rectFArr2;
                            h2 = np0Var;
                        }
                        rectFArr = rectFArr3;
                        if (rectFArr != null) {
                            return;
                        }
                        accessibilityNodeInfo.getExtras().putParcelableArray(str, rectFArr);
                        return;
                    }
                }
                rectFArr = null;
                if (rectFArr != null) {
                }
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect c(wj0 wj0Var) {
        bw bwVar = wj0Var.b;
        return E(bwVar.a, bwVar.b, bwVar.c, bwVar.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
    
        if (defpackage.q3.p(r4, r2) == r7) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005c, B:21:0x006e, B:23:0x0076, B:25:0x007f, B:65:0x0046, B:67:0x004d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0102 -> B:14:0x0105). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(og ogVar) {
        i3 i3Var;
        int i;
        n7 n7Var;
        n7 n7Var2;
        z30 z30Var;
        n9 n9Var;
        z30 z30Var2;
        n9 n9Var2;
        int i2;
        long j;
        Object a;
        try {
            if (ogVar instanceof i3) {
                i3Var = (i3) ogVar;
                int i3 = i3Var.i;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    i3Var.i = i3 - Integer.MIN_VALUE;
                    Object obj = i3Var.g;
                    i = i3Var.i;
                    n7Var = this.z;
                    dh dhVar = dh.e;
                    if (i != 0) {
                        t30.z(obj);
                        z30Var = new z30();
                        o9 o9Var = this.A;
                        o9Var.getClass();
                        n9Var = new n9(o9Var);
                        i3Var.e = z30Var;
                        i3Var.f = n9Var;
                        i3Var.i = 1;
                        a = n9Var.a(i3Var);
                        if (a != dhVar) {
                        }
                    } else if (i == 1) {
                        n9Var2 = i3Var.f;
                        z30Var2 = i3Var.e;
                        t30.z(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            z6.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        n9Var2 = i3Var.f;
                        z30Var2 = i3Var.e;
                        t30.z(obj);
                        char c = 2;
                        n7Var2 = n7Var;
                        z30Var = z30Var2;
                        n7Var = n7Var2;
                        n9Var = n9Var2;
                        i3Var.e = z30Var;
                        i3Var.f = n9Var;
                        i3Var.i = 1;
                        a = n9Var.a(i3Var);
                        if (a != dhVar) {
                            return dhVar;
                        }
                        n9 n9Var3 = n9Var;
                        z30Var2 = z30Var;
                        obj = a;
                        n9Var2 = n9Var3;
                        if (((Boolean) obj).booleanValue()) {
                            n7Var.clear();
                            return fs0.a;
                        }
                        n9Var2.c();
                        if (n()) {
                            Trace.beginSection("Compose:semantics:boundUpdates");
                            try {
                                try {
                                    int i4 = n7Var.g;
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        iy iyVar = (iy) n7Var.f[i5];
                                        A(iyVar, z30Var2);
                                        B(iyVar);
                                    }
                                    z30Var2.d = 0;
                                    long[] jArr = z30Var2.a;
                                    if (jArr != gi0.a) {
                                        try {
                                            o7.W(jArr);
                                            long[] jArr2 = z30Var2.a;
                                            i2 = z30Var2.c;
                                            int i6 = i2 >> 3;
                                            jArr2[i6] = ((~j) & jArr2[i6]) | j;
                                        } catch (Throwable th) {
                                            th = th;
                                            Trace.endSection();
                                            throw th;
                                        }
                                        j = 255 << ((i2 & 7) << 3);
                                        n7Var2 = n7Var;
                                    } else {
                                        n7Var2 = n7Var;
                                    }
                                    Trace.endSection();
                                    Handler handler = this.h.getHandler();
                                    if (!this.M && handler != null) {
                                        this.M = true;
                                        handler.post(this.O);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    n7Var2.clear();
                                    throw th;
                                }
                                z30Var2.e = gi0.a(z30Var2.c) - z30Var2.d;
                            } catch (Throwable th3) {
                                th = th3;
                                n7Var2 = n7Var;
                            }
                        } else {
                            n7Var2 = n7Var;
                        }
                        n7Var2.clear();
                        this.t.c();
                        this.u.c();
                        long j2 = this.l;
                        i3Var.e = z30Var2;
                        i3Var.f = n9Var2;
                        c = 2;
                        i3Var.i = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th4) {
            th = th4;
            n7Var2 = n7Var;
        }
        i3Var = new i3(this, ogVar);
        Object obj2 = i3Var.g;
        i = i3Var.i;
        n7Var = this.z;
        dh dhVar2 = dh.e;
    }

    public final boolean e(boolean z, int i, long j) {
        ak0 ak0Var;
        int i2;
        if (lw.i(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            vv k = k();
            if (!s60.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    ak0Var = yj0.w;
                } else {
                    if (z) {
                        z6.j();
                        return false;
                    }
                    ak0Var = yj0.v;
                }
                Object[] objArr = k.c;
                long[] jArr = k.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    wj0 wj0Var = (wj0) objArr[(i3 << 3) + i6];
                                    bw bwVar = wj0Var.b;
                                    float f = bwVar.a;
                                    i2 = i4;
                                    float f2 = bwVar.b;
                                    float f3 = bwVar.c;
                                    float f4 = bwVar.d;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((intBitsToFloat2 < f4) & (intBitsToFloat >= f) & (intBitsToFloat < f3) & (intBitsToFloat2 >= f2)) {
                                        Object g = wj0Var.a.d.e.g(ak0Var);
                                        if (g == null) {
                                            g = null;
                                        }
                                        ki0 ki0Var = (ki0) g;
                                        if (ki0Var != null) {
                                            oi0 oi0Var = ki0Var.a;
                                            if (i < 0) {
                                                if (((Number) oi0Var.b()).floatValue() <= 0.0f) {
                                                }
                                                z2 = true;
                                            } else {
                                                if (((Number) oi0Var.b()).floatValue() >= ((Number) ki0Var.b.b()).floatValue()) {
                                                }
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void f() {
        Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (n()) {
                t(this.h.getSemanticsOwner().a(), this.L);
            }
            Trace.endSection();
            Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
            try {
                z(k());
                Trace.endSection();
                Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                try {
                    I();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent g(int i, int i2) {
        wj0 wj0Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        e3 e3Var = this.h;
        obtain.setPackageName(e3Var.getContext().getPackageName());
        obtain.setSource(e3Var, i);
        if (n() && (wj0Var = (wj0) k().b(i)) != null) {
            uj0 uj0Var = wj0Var.a;
            obtain.setPassword(uj0Var.d.e.c(yj0.K));
            Object g = uj0Var.d.e.g(yj0.o);
            if (g == null) {
                g = null;
            }
            boolean i3 = lw.i(g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                t0.f(obtain, i3);
            }
        }
        return obtain;
    }

    public final AccessibilityEvent h(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent g = g(i, 8192);
        if (num != null) {
            g.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            g.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            g.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            g.getText().add(charSequence);
        }
        return g;
    }

    public final int i(uj0 uj0Var) {
        qj0 qj0Var = uj0Var.d;
        if (!qj0Var.e.c(yj0.a)) {
            ak0 ak0Var = yj0.F;
            if (qj0Var.e.c(ak0Var)) {
                return (int) (((sp0) qj0Var.c(ak0Var)).a & 4294967295L);
            }
        }
        return this.x;
    }

    public final int j(uj0 uj0Var) {
        qj0 qj0Var = uj0Var.d;
        if (!qj0Var.e.c(yj0.a)) {
            ak0 ak0Var = yj0.F;
            if (qj0Var.e.c(ak0Var)) {
                return (int) (((sp0) qj0Var.c(ak0Var)).a >> 32);
            }
        }
        return this.x;
    }

    public final vv k() {
        if (this.B) {
            this.B = false;
            e3 e3Var = this.h;
            this.D = nh.t(e3Var.getSemanticsOwner(), new l0(2, (byte) 0));
            if (n()) {
                y30 y30Var = this.D;
                Resources resources = e3Var.getContext().getResources();
                w30 w30Var = this.F;
                w30Var.a();
                w30 w30Var2 = this.G;
                w30Var2.a();
                wj0 wj0Var = (wj0) y30Var.b(-1);
                uj0 uj0Var = wj0Var != null ? wj0Var.a : null;
                uj0Var.getClass();
                ArrayList b = dk0.b(uj0Var, new l(5, y30Var), new l(6, resources), kw.B(uj0Var));
                int i = 1;
                int size = b.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((uj0) b.get(i - 1)).f;
                        int i3 = ((uj0) b.get(i)).f;
                        w30Var.f(i2, i3);
                        w30Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.D;
    }

    public final oe0 m(uj0 uj0Var, Rect rect, tk0 tk0Var) {
        j3 j3Var = new j3(tk0Var);
        iy iyVar = uj0Var.c;
        t20 t20Var = iyVar.H.f;
        ni niVar = null;
        if ((t20Var.h & 8) != 0) {
            loop0: while (true) {
                if (t20Var == null) {
                    break;
                }
                if ((t20Var.g & 8) != 0) {
                    t20 t20Var2 = t20Var;
                    t40 t40Var = null;
                    while (t20Var2 != null) {
                        if (t20Var2 instanceof sj0) {
                            ((sj0) t20Var2).O(j3Var);
                            if (j3Var.e) {
                                niVar = t20Var2;
                                break loop0;
                            }
                        } else if ((t20Var2.g & 8) != 0 && (t20Var2 instanceof oi)) {
                            int i = 0;
                            for (t20 t20Var3 = ((oi) t20Var2).t; t20Var3 != null; t20Var3 = t20Var3.j) {
                                if ((t20Var3.g & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        t20Var2 = t20Var3;
                                    } else {
                                        if (t40Var == null) {
                                            t40Var = new t40(new t20[16]);
                                        }
                                        if (t20Var2 != null) {
                                            t40Var.b(t20Var2);
                                            t20Var2 = null;
                                        }
                                        t40Var.b(t20Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        t20Var2 = nh.N(t40Var);
                    }
                }
                if ((t20Var.h & 8) == 0) {
                    break;
                }
                t20Var = t20Var.j;
            }
        }
        ni niVar2 = (sj0) niVar;
        if (niVar2 == null || !((t20) niVar2).e.r) {
            return q3.e(iyVar.H.d, false);
        }
        d60 Z = nh.Z(niVar2);
        oe0 A = q3.s(Z).A(Z, false);
        Rect E = E(A.a, A.b, A.c, A.d);
        float f = E.left - rect.left;
        float f2 = E.top - rect.top;
        return new oe0(f, f2, E.width() + f, E.height() + f2);
    }

    public final boolean n() {
        AccessibilityManager accessibilityManager = this.k;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> list = this.m;
        if (list == null) {
            list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.m = list;
        }
        return !list.isEmpty();
    }

    public final void o(iy iyVar) {
        if (this.z.add(iyVar)) {
            this.A.p(fs0.a);
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.m = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.m = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.k;
        if (accessibilityManager.isEnabled()) {
            this.m = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.h.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.O);
        AccessibilityManager accessibilityManager = this.k;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final int s(int i) {
        if (i == this.h.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    public final void t(uj0 uj0Var, vj0 vj0Var) {
        List i;
        List i2;
        int[] iArr = dw.a;
        z30 z30Var = new z30();
        i = uj0Var.i((r3 & 1) != 0 ? !uj0Var.b : false, (r3 & 2) == 0);
        iy iyVar = uj0Var.c;
        int size = i.size();
        for (int i3 = 0; i3 < size; i3++) {
            uj0 uj0Var2 = (uj0) i.get(i3);
            vv k = k();
            int i4 = uj0Var2.f;
            if (k.a(i4)) {
                if (!vj0Var.b.b(i4)) {
                    o(iyVar);
                    return;
                }
                z30Var.a(i4);
            }
        }
        z30 z30Var2 = vj0Var.b;
        int[] iArr2 = z30Var2.b;
        long[] jArr = z30Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j = jArr[i5];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j) < 128 && !z30Var.b(iArr2[(i5 << 3) + i7])) {
                            o(iyVar);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        i2 = uj0Var.i((r3 & 1) != 0 ? !uj0Var.b : false, (r3 & 2) == 0);
        int size2 = i2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            uj0 uj0Var3 = (uj0) i2.get(i8);
            vj0 vj0Var2 = (vj0) this.K.b(uj0Var3.f);
            if (vj0Var2 != null && k().a(uj0Var3.f)) {
                t(uj0Var3, vj0Var2);
            }
        }
    }

    public final boolean u(AccessibilityEvent accessibilityEvent) {
        if (!n()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.s = true;
        }
        try {
            return ((Boolean) this.j.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.s = false;
        }
    }

    public final boolean v(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !n()) {
            return false;
        }
        AccessibilityEvent g = g(i, i2);
        if (num != null) {
            g.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            g.setContentDescription(c00.a(list, ",", null, 62));
        }
        return u(g);
    }

    public final void x(int i, int i2, String str) {
        AccessibilityEvent g = g(s(i), 32);
        g.setContentChangeTypes(i2);
        if (str != null) {
            g.getText().add(str);
        }
        u(g);
    }

    public final void y(int i) {
        h3 h3Var = this.C;
        if (h3Var != null) {
            uj0 uj0Var = h3Var.a;
            if (i != uj0Var.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - h3Var.f <= 1000) {
                AccessibilityEvent g = g(s(uj0Var.f), 131072);
                g.setFromIndex(h3Var.d);
                g.setToIndex(h3Var.e);
                g.setAction(h3Var.b);
                g.setMovementGranularity(h3Var.c);
                g.getText().add(l(uj0Var));
                u(g);
            }
        }
        this.C = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x050f, code lost:
    
        if (r5 != null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0514, code lost:
    
        if (r5 == null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0127, code lost:
    
        if (defpackage.lw.i(r1, r13) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(vv vvVar) {
        Integer num;
        ArrayList arrayList;
        ArrayList arrayList2;
        int[] iArr;
        long[] jArr;
        Integer num2;
        int i;
        int i2;
        Integer num3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int i4;
        Integer num4;
        int i5;
        qj0 qj0Var;
        uj0 uj0Var;
        boolean z;
        int i6;
        boolean z2;
        boolean z3;
        k40 k40Var;
        iy iyVar;
        int i7;
        qj0 qj0Var2;
        Integer num5;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long j;
        int i8;
        iy iyVar2;
        uj0 uj0Var2;
        int i9;
        int i10;
        k40 k40Var2;
        int i11;
        Integer num6;
        qi0 qi0Var;
        boolean z4;
        ArrayList arrayList7;
        qi0 qi0Var2;
        boolean z5;
        int i12;
        String str;
        int i13;
        int i14;
        AccessibilityEvent h;
        k3 k3Var = this;
        vv vvVar2 = vvVar;
        Integer num7 = 64;
        ArrayList arrayList8 = k3Var.P;
        ArrayList arrayList9 = new ArrayList(arrayList8);
        arrayList8.clear();
        int[] iArr3 = vvVar2.b;
        long[] jArr3 = vvVar2.a;
        int i15 = 2;
        int length = jArr3.length - 2;
        int i16 = 0;
        Integer num8 = 0;
        if (length < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j2 = jArr3[i17];
            int i18 = i15;
            int i19 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i20 = 8;
                int i21 = 8 - ((~(i17 - i19)) >>> 31);
                long j3 = j2;
                int i22 = i16;
                while (i22 < i21) {
                    if ((j3 & 255) < 128) {
                        int i23 = iArr3[(i17 << 3) + i22];
                        vj0 vj0Var = (vj0) k3Var.K.b(i23);
                        if (vj0Var != null) {
                            qj0 qj0Var3 = vj0Var.a;
                            k40 k40Var3 = qj0Var3.e;
                            wj0 wj0Var = (wj0) vvVar2.b(i23);
                            int i24 = i20;
                            uj0 uj0Var3 = wj0Var != null ? wj0Var.a : null;
                            if (uj0Var3 == null) {
                                throw j2.f("no value for specified key");
                            }
                            iy iyVar3 = uj0Var3.c;
                            qj0 qj0Var4 = uj0Var3.d;
                            iArr2 = iArr3;
                            int i25 = uj0Var3.f;
                            jArr2 = jArr3;
                            k40 k40Var4 = qj0Var4.e;
                            i4 = i17;
                            Object[] objArr = k40Var4.b;
                            Object[] objArr2 = k40Var4.c;
                            long[] jArr4 = k40Var4.a;
                            i2 = i22;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                iy iyVar4 = iyVar3;
                                i3 = i21;
                                int i26 = 0;
                                z2 = false;
                                while (true) {
                                    long j4 = jArr4[i26];
                                    uj0 uj0Var4 = uj0Var3;
                                    int i27 = i26;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                        int i29 = 0;
                                        while (i29 < i28) {
                                            if ((j4 & 255) < 128) {
                                                int i30 = (i27 << 3) + i29;
                                                Object obj = objArr[i30];
                                                int i31 = length2;
                                                Object obj2 = objArr2[i30];
                                                qj0Var2 = qj0Var3;
                                                ak0 ak0Var = (ak0) obj;
                                                j = j4;
                                                ak0 ak0Var2 = yj0.v;
                                                if (lw.i(ak0Var, ak0Var2) || lw.i(ak0Var, yj0.w)) {
                                                    int size = arrayList9.size();
                                                    i8 = i29;
                                                    int i32 = 0;
                                                    while (true) {
                                                        if (i32 >= size) {
                                                            qi0Var = null;
                                                            break;
                                                        }
                                                        int i33 = size;
                                                        if (((qi0) arrayList9.get(i32)).e == i23) {
                                                            qi0Var = (qi0) arrayList9.get(i32);
                                                            break;
                                                        } else {
                                                            i32++;
                                                            size = i33;
                                                        }
                                                    }
                                                    if (qi0Var != null) {
                                                        z4 = false;
                                                    } else {
                                                        qi0Var = new qi0(i23, arrayList8);
                                                        z4 = true;
                                                    }
                                                    arrayList8.add(qi0Var);
                                                } else {
                                                    i8 = i29;
                                                    z4 = false;
                                                }
                                                if (!z4) {
                                                    Object g = k40Var3.g(ak0Var);
                                                    if (g == null) {
                                                        g = null;
                                                    }
                                                }
                                                ak0 ak0Var3 = yj0.d;
                                                if (lw.i(ak0Var, ak0Var3)) {
                                                    obj2.getClass();
                                                    String str2 = (String) obj2;
                                                    boolean c = k40Var3.c(ak0Var3);
                                                    int i34 = i24;
                                                    if (c) {
                                                        k3Var.x(i23, i34, str2);
                                                    }
                                                } else {
                                                    int i35 = i24;
                                                    if (lw.i(ak0Var, yj0.b)) {
                                                        w(k3Var, k3Var.s(i23), 2048, num7, i35);
                                                        w(k3Var, k3Var.s(i23), 2048, num8, i35);
                                                    } else if (lw.i(ak0Var, yj0.I)) {
                                                        w(k3Var, k3Var.s(i23), 2048, 8192, 8);
                                                        w(k3Var, k3Var.s(i23), 2048, num8, 8);
                                                    } else if (lw.i(ak0Var, yj0.L)) {
                                                        w(k3Var, k3Var.s(i23), 2048, 3072, 8);
                                                    } else if (lw.i(ak0Var, yj0.c)) {
                                                        w(k3Var, k3Var.s(i23), 2048, num7, 8);
                                                        w(k3Var, k3Var.s(i23), 2048, num8, 8);
                                                    } else {
                                                        ak0 ak0Var4 = yj0.H;
                                                        arrayList5 = arrayList9;
                                                        if (lw.i(ak0Var, ak0Var4)) {
                                                            Object g2 = k40Var4.g(yj0.x);
                                                            if (g2 == null) {
                                                                g2 = null;
                                                            }
                                                            jg0 jg0Var = (jg0) g2;
                                                            if (jg0Var != null && jg0Var.a == 4) {
                                                                Object g3 = k40Var4.g(ak0Var4);
                                                                if (g3 == null) {
                                                                    g3 = null;
                                                                }
                                                                if (lw.i(g3, Boolean.TRUE)) {
                                                                    AccessibilityEvent g4 = k3Var.g(k3Var.s(i23), 4);
                                                                    uj0Var2 = uj0Var4;
                                                                    iyVar2 = iyVar4;
                                                                    uj0 uj0Var5 = new uj0(uj0Var2.a, true, iyVar2, qj0Var4);
                                                                    Object g5 = uj0Var5.k().e.g(yj0.a);
                                                                    if (g5 == null) {
                                                                        g5 = null;
                                                                    }
                                                                    List list = (List) g5;
                                                                    i10 = i28;
                                                                    String a = list != null ? c00.a(list, ",", null, 62) : null;
                                                                    Object g6 = uj0Var5.k().e.g(yj0.A);
                                                                    if (g6 == null) {
                                                                        g6 = null;
                                                                    }
                                                                    List list2 = (List) g6;
                                                                    arrayList7 = arrayList8;
                                                                    String a2 = list2 != null ? c00.a(list2, ",", null, 62) : null;
                                                                    if (a != null) {
                                                                        g4.setContentDescription(a);
                                                                    }
                                                                    if (a2 != null) {
                                                                        g4.getText().add(a2);
                                                                    }
                                                                    k3Var.u(g4);
                                                                } else {
                                                                    arrayList7 = arrayList8;
                                                                    iyVar2 = iyVar4;
                                                                    uj0Var2 = uj0Var4;
                                                                    i10 = i28;
                                                                    w(k3Var, k3Var.s(i23), 2048, num8, 8);
                                                                }
                                                            } else {
                                                                arrayList7 = arrayList8;
                                                                iyVar2 = iyVar4;
                                                                uj0Var2 = uj0Var4;
                                                                i10 = i28;
                                                                w(k3Var, k3Var.s(i23), 2048, num7, 8);
                                                                w(k3Var, k3Var.s(i23), 2048, num8, 8);
                                                            }
                                                        } else {
                                                            arrayList7 = arrayList8;
                                                            iyVar2 = iyVar4;
                                                            uj0Var2 = uj0Var4;
                                                            i10 = i28;
                                                            if (lw.i(ak0Var, yj0.a)) {
                                                                int s = k3Var.s(i23);
                                                                obj2.getClass();
                                                                k3Var.v(s, 2048, 4, (List) obj2);
                                                            } else {
                                                                ak0 ak0Var5 = yj0.E;
                                                                String str3 = "";
                                                                if (lw.i(ak0Var, ak0Var5)) {
                                                                    if (k40Var4.c(pj0.j)) {
                                                                        Object g7 = k40Var3.g(ak0Var5);
                                                                        if (g7 == null) {
                                                                            g7 = null;
                                                                        }
                                                                        p6 p6Var = (p6) g7;
                                                                        if (p6Var == null) {
                                                                            p6Var = "";
                                                                        }
                                                                        Object g8 = k40Var4.g(ak0Var5);
                                                                        if (g8 == null) {
                                                                            g8 = null;
                                                                        }
                                                                        CharSequence charSequence = (p6) g8;
                                                                        if (charSequence == null) {
                                                                            charSequence = "";
                                                                        }
                                                                        CharSequence H = H(charSequence);
                                                                        int length3 = p6Var.length();
                                                                        int length4 = charSequence.length();
                                                                        int i36 = length3 > length4 ? length4 : length3;
                                                                        Integer num9 = num8;
                                                                        int i37 = 0;
                                                                        while (true) {
                                                                            num5 = num7;
                                                                            if (i37 >= i36) {
                                                                                i13 = length3;
                                                                                break;
                                                                            }
                                                                            i13 = length3;
                                                                            if (p6Var.charAt(i37) != charSequence.charAt(i37)) {
                                                                                break;
                                                                            }
                                                                            i37++;
                                                                            length3 = i13;
                                                                            num7 = num5;
                                                                        }
                                                                        int i38 = 0;
                                                                        while (true) {
                                                                            if (i38 >= i36 - i37) {
                                                                                i14 = i38;
                                                                                break;
                                                                            }
                                                                            i14 = i38;
                                                                            if (p6Var.charAt((i13 - 1) - i38) != charSequence.charAt((length4 - 1) - i14)) {
                                                                                break;
                                                                            } else {
                                                                                i38 = i14 + 1;
                                                                            }
                                                                        }
                                                                        int i39 = (i13 - i14) - i37;
                                                                        int i40 = (length4 - i14) - i37;
                                                                        ak0 ak0Var6 = yj0.K;
                                                                        boolean c2 = k40Var3.c(ak0Var6);
                                                                        boolean c3 = k40Var4.c(ak0Var6);
                                                                        boolean c4 = k40Var3.c(yj0.E);
                                                                        boolean z6 = c4 && !c2 && c3;
                                                                        boolean z7 = c4 && c2 && !c3;
                                                                        if (z6 || z7) {
                                                                            i11 = i23;
                                                                            k40Var2 = k40Var3;
                                                                            num8 = num9;
                                                                            h = k3Var.h(k3Var.s(i23), num8, num9, Integer.valueOf(length4), H);
                                                                        } else {
                                                                            h = k3Var.g(k3Var.s(i23), 16);
                                                                            h.setFromIndex(i37);
                                                                            h.setRemovedCount(i39);
                                                                            h.setAddedCount(i40);
                                                                            h.setBeforeText(p6Var);
                                                                            h.getText().add(H);
                                                                            i11 = i23;
                                                                            k40Var2 = k40Var3;
                                                                            num8 = num9;
                                                                        }
                                                                        h.setClassName("android.widget.EditText");
                                                                        if (Build.VERSION.SDK_INT >= 37) {
                                                                            g3.a(uj0Var2, h);
                                                                        }
                                                                        k3Var.u(h);
                                                                        if (z6 || z7) {
                                                                            long j5 = ((sp0) qj0Var4.c(yj0.F)).a;
                                                                            h.setFromIndex((int) (j5 >> 32));
                                                                            h.setToIndex((int) (j5 & 4294967295L));
                                                                            k3Var.u(h);
                                                                        }
                                                                    } else {
                                                                        i11 = i23;
                                                                        k40Var2 = k40Var3;
                                                                        num5 = num7;
                                                                        w(k3Var, k3Var.s(i11), 2048, Integer.valueOf(i18), 8);
                                                                    }
                                                                    num6 = num8;
                                                                    arrayList6 = arrayList7;
                                                                    i9 = i31;
                                                                    i24 = 8;
                                                                    k40Var3 = k40Var2;
                                                                    iyVar4 = iyVar2;
                                                                    i28 = i10;
                                                                    i29 = i8 + 1;
                                                                    i23 = i11;
                                                                    uj0Var4 = uj0Var2;
                                                                    j4 = j >> 8;
                                                                    arrayList8 = arrayList6;
                                                                    length2 = i9;
                                                                    num8 = num6;
                                                                    qj0Var3 = qj0Var2;
                                                                    arrayList9 = arrayList5;
                                                                    num7 = num5;
                                                                } else {
                                                                    i11 = i23;
                                                                    k40Var2 = k40Var3;
                                                                    num5 = num7;
                                                                    i9 = i31;
                                                                    ak0 ak0Var7 = yj0.F;
                                                                    if (lw.i(ak0Var, ak0Var7)) {
                                                                        Object g9 = k40Var4.g(ak0Var5);
                                                                        if (g9 == null) {
                                                                            g9 = null;
                                                                        }
                                                                        p6 p6Var2 = (p6) g9;
                                                                        if (p6Var2 != null && (str = p6Var2.f) != null) {
                                                                            str3 = str;
                                                                        }
                                                                        long j6 = ((sp0) qj0Var4.c(ak0Var7)).a;
                                                                        num6 = num8;
                                                                        k3Var = this;
                                                                        k3Var.u(k3Var.h(k3Var.s(i11), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str3.length()), H(str3)));
                                                                        k3Var.y(i25);
                                                                    } else {
                                                                        num6 = num8;
                                                                        if (lw.i(ak0Var, ak0Var2) || lw.i(ak0Var, yj0.w)) {
                                                                            k3Var.o(iyVar2);
                                                                            int size2 = arrayList7.size();
                                                                            int i41 = 0;
                                                                            while (true) {
                                                                                if (i41 >= size2) {
                                                                                    arrayList6 = arrayList7;
                                                                                    qi0Var2 = null;
                                                                                    break;
                                                                                }
                                                                                arrayList6 = arrayList7;
                                                                                if (((qi0) arrayList6.get(i41)).e == i11) {
                                                                                    qi0Var2 = (qi0) arrayList6.get(i41);
                                                                                    break;
                                                                                } else {
                                                                                    i41++;
                                                                                    arrayList7 = arrayList6;
                                                                                }
                                                                            }
                                                                            qi0Var2.getClass();
                                                                            Object g10 = k40Var4.g(ak0Var2);
                                                                            if (g10 == null) {
                                                                                g10 = null;
                                                                            }
                                                                            qi0Var2.i = (ki0) g10;
                                                                            Object g11 = k40Var4.g(yj0.w);
                                                                            if (g11 == null) {
                                                                                g11 = null;
                                                                            }
                                                                            qi0Var2.j = (ki0) g11;
                                                                            if (qi0Var2.f.contains(qi0Var2)) {
                                                                                k3Var.h.getSnapshotObserver().a.b(qi0Var2, k3Var.Q, new s2(1, qi0Var2, k3Var));
                                                                                i24 = 8;
                                                                                k40Var3 = k40Var2;
                                                                                iyVar4 = iyVar2;
                                                                                i28 = i10;
                                                                                i29 = i8 + 1;
                                                                                i23 = i11;
                                                                                uj0Var4 = uj0Var2;
                                                                                j4 = j >> 8;
                                                                                arrayList8 = arrayList6;
                                                                                length2 = i9;
                                                                                num8 = num6;
                                                                                qj0Var3 = qj0Var2;
                                                                                arrayList9 = arrayList5;
                                                                                num7 = num5;
                                                                            }
                                                                            i24 = 8;
                                                                            k40Var3 = k40Var2;
                                                                            iyVar4 = iyVar2;
                                                                            i28 = i10;
                                                                            i29 = i8 + 1;
                                                                            i23 = i11;
                                                                            uj0Var4 = uj0Var2;
                                                                            j4 = j >> 8;
                                                                            arrayList8 = arrayList6;
                                                                            length2 = i9;
                                                                            num8 = num6;
                                                                            qj0Var3 = qj0Var2;
                                                                            arrayList9 = arrayList5;
                                                                            num7 = num5;
                                                                        } else if (lw.i(ak0Var, yj0.l)) {
                                                                            obj2.getClass();
                                                                            if (((Boolean) obj2).booleanValue()) {
                                                                                i12 = 8;
                                                                                k3Var.u(k3Var.g(k3Var.s(i25), 8));
                                                                            } else {
                                                                                i12 = 8;
                                                                            }
                                                                            w(k3Var, k3Var.s(i25), 2048, num6, i12);
                                                                        } else {
                                                                            ak0 ak0Var8 = pj0.v;
                                                                            if (lw.i(ak0Var, ak0Var8)) {
                                                                                List list3 = (List) qj0Var4.c(ak0Var8);
                                                                                Object g12 = k40Var2.g(ak0Var8);
                                                                                if (g12 == null) {
                                                                                    g12 = null;
                                                                                }
                                                                                List list4 = (List) g12;
                                                                                if (list4 != null) {
                                                                                    int i42 = hi0.a;
                                                                                    l40 l40Var = new l40();
                                                                                    if (list3.size() > 0) {
                                                                                        list3.get(0).getClass();
                                                                                        z6.c();
                                                                                        return;
                                                                                    }
                                                                                    l40 l40Var2 = new l40();
                                                                                    if (list4.size() > 0) {
                                                                                        list4.get(0).getClass();
                                                                                        z6.c();
                                                                                        return;
                                                                                    }
                                                                                    z5 = z2 || !l40Var.equals(l40Var2);
                                                                                } else {
                                                                                    z5 = z2 || !list3.isEmpty();
                                                                                }
                                                                                z2 = z5;
                                                                            } else {
                                                                                if (!z2 && (obj2 instanceof p0)) {
                                                                                    p0 p0Var = (p0) obj2;
                                                                                    Object g13 = k40Var2.g(ak0Var);
                                                                                    if (g13 == null) {
                                                                                        g13 = null;
                                                                                    }
                                                                                    if (p0Var != g13) {
                                                                                        if (g13 instanceof p0) {
                                                                                            String str4 = p0Var.a;
                                                                                            p0 p0Var2 = (p0) g13;
                                                                                            br brVar = p0Var2.b;
                                                                                            if (lw.i(str4, p0Var2.a)) {
                                                                                                br brVar2 = p0Var.b;
                                                                                                if (brVar2 == null) {
                                                                                                }
                                                                                                if (brVar2 != null) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z2 = false;
                                                                                }
                                                                                z2 = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    arrayList6 = arrayList7;
                                                                    i24 = 8;
                                                                    k40Var3 = k40Var2;
                                                                    iyVar4 = iyVar2;
                                                                    i28 = i10;
                                                                    i29 = i8 + 1;
                                                                    i23 = i11;
                                                                    uj0Var4 = uj0Var2;
                                                                    j4 = j >> 8;
                                                                    arrayList8 = arrayList6;
                                                                    length2 = i9;
                                                                    num8 = num6;
                                                                    qj0Var3 = qj0Var2;
                                                                    arrayList9 = arrayList5;
                                                                    num7 = num5;
                                                                }
                                                            }
                                                        }
                                                        num6 = num8;
                                                        i11 = i23;
                                                        k40Var2 = k40Var3;
                                                        num5 = num7;
                                                        arrayList6 = arrayList7;
                                                        i9 = i31;
                                                        i24 = 8;
                                                        k40Var3 = k40Var2;
                                                        iyVar4 = iyVar2;
                                                        i28 = i10;
                                                        i29 = i8 + 1;
                                                        i23 = i11;
                                                        uj0Var4 = uj0Var2;
                                                        j4 = j >> 8;
                                                        arrayList8 = arrayList6;
                                                        length2 = i9;
                                                        num8 = num6;
                                                        qj0Var3 = qj0Var2;
                                                        arrayList9 = arrayList5;
                                                        num7 = num5;
                                                    }
                                                }
                                                num5 = num7;
                                                arrayList5 = arrayList9;
                                                arrayList6 = arrayList8;
                                                iyVar2 = iyVar4;
                                                uj0Var2 = uj0Var4;
                                                i9 = i31;
                                            } else {
                                                qj0Var2 = qj0Var3;
                                                num5 = num7;
                                                arrayList5 = arrayList9;
                                                arrayList6 = arrayList8;
                                                j = j4;
                                                i8 = i29;
                                                iyVar2 = iyVar4;
                                                uj0Var2 = uj0Var4;
                                                i9 = length2;
                                            }
                                            num6 = num8;
                                            i11 = i23;
                                            i10 = i28;
                                            k40Var2 = k40Var3;
                                            i24 = 8;
                                            k40Var3 = k40Var2;
                                            iyVar4 = iyVar2;
                                            i28 = i10;
                                            i29 = i8 + 1;
                                            i23 = i11;
                                            uj0Var4 = uj0Var2;
                                            j4 = j >> 8;
                                            arrayList8 = arrayList6;
                                            length2 = i9;
                                            num8 = num6;
                                            qj0Var3 = qj0Var2;
                                            arrayList9 = arrayList5;
                                            num7 = num5;
                                        }
                                        qj0Var = qj0Var3;
                                        num3 = num7;
                                        arrayList3 = arrayList9;
                                        arrayList4 = arrayList8;
                                        iyVar = iyVar4;
                                        uj0Var = uj0Var4;
                                        z = true;
                                        i7 = length2;
                                        num4 = num8;
                                        i6 = i23;
                                        int i43 = i28;
                                        k40Var = k40Var3;
                                        if (i43 != i24) {
                                            break;
                                        }
                                    } else {
                                        qj0Var = qj0Var3;
                                        k40Var = k40Var3;
                                        num3 = num7;
                                        arrayList3 = arrayList9;
                                        arrayList4 = arrayList8;
                                        iyVar = iyVar4;
                                        uj0Var = uj0Var4;
                                        z = true;
                                        i7 = length2;
                                        num4 = num8;
                                        i6 = i23;
                                    }
                                    if (i27 == i7) {
                                        break;
                                    }
                                    num8 = num4;
                                    i23 = i6;
                                    k40Var3 = k40Var;
                                    iyVar4 = iyVar;
                                    arrayList9 = arrayList3;
                                    i24 = 8;
                                    i26 = i27 + 1;
                                    arrayList8 = arrayList4;
                                    length2 = i7;
                                    uj0Var3 = uj0Var;
                                    qj0Var3 = qj0Var;
                                    num7 = num3;
                                }
                            } else {
                                qj0Var = qj0Var3;
                                num3 = num7;
                                arrayList3 = arrayList9;
                                arrayList4 = arrayList8;
                                i3 = i21;
                                uj0Var = uj0Var3;
                                z = true;
                                num4 = num8;
                                i6 = i23;
                                z2 = false;
                            }
                            if (!z2) {
                                Iterator it = qj0Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z3 = false;
                                        break;
                                    } else {
                                        if (!uj0Var.k().e.c((ak0) ((Map.Entry) it.next()).getKey())) {
                                            z3 = z;
                                            break;
                                        }
                                    }
                                }
                                z2 = z3;
                            }
                            if (z2) {
                                i5 = 8;
                                w(k3Var, k3Var.s(i6), 2048, num4, 8);
                            } else {
                                i5 = 8;
                            }
                            j3 >>= i5;
                            i22 = i2 + 1;
                            vvVar2 = vvVar;
                            arrayList8 = arrayList4;
                            num8 = num4;
                            i20 = i5;
                            iArr3 = iArr2;
                            jArr3 = jArr2;
                            i17 = i4;
                            i21 = i3;
                            arrayList9 = arrayList3;
                            num7 = num3;
                        }
                    }
                    i2 = i22;
                    num3 = num7;
                    arrayList3 = arrayList9;
                    arrayList4 = arrayList8;
                    iArr2 = iArr3;
                    jArr2 = jArr3;
                    i3 = i21;
                    i4 = i17;
                    num4 = num8;
                    i5 = i20;
                    j3 >>= i5;
                    i22 = i2 + 1;
                    vvVar2 = vvVar;
                    arrayList8 = arrayList4;
                    num8 = num4;
                    i20 = i5;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i17 = i4;
                    i21 = i3;
                    arrayList9 = arrayList3;
                    num7 = num3;
                }
                num = num7;
                arrayList = arrayList9;
                arrayList2 = arrayList8;
                iArr = iArr3;
                jArr = jArr3;
                int i44 = i17;
                num2 = num8;
                if (i21 != i20) {
                    return;
                } else {
                    i = i44;
                }
            } else {
                num = num7;
                arrayList = arrayList9;
                arrayList2 = arrayList8;
                iArr = iArr3;
                jArr = jArr3;
                num2 = num8;
                i = i17;
            }
            if (i == i19) {
                return;
            }
            i17 = i + 1;
            vvVar2 = vvVar;
            length = i19;
            arrayList8 = arrayList2;
            num8 = num2;
            i15 = i18;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList9 = arrayList;
            num7 = num;
            i16 = 0;
        }
    }
}
