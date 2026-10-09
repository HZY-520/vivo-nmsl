package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class dx0 {
    public static final xs0 A;
    public static final float B = 24.0f;
    public static final float C = 24.0f;
    public static Method D;
    public static Method E;
    public static boolean F;
    public static final mm c;
    public static final mm d;
    public static final mm l;
    public static final mm m;
    public static final mm n;
    public static final mm o;
    public static final mm p;
    public static final mm s;
    public static final p2 u;
    public static final p2 v;
    public static final p2 w;
    public static final p2 x;
    public static final p2 y;
    public static final be a = new be(954879418, false, new bd(2));
    public static final be b = new be(1918065384, false, new bd(3));
    public static final lc e = lc.h;
    public static final lc f = lc.f;
    public static final float g = 0.1f;
    public static final lc h = lc.g;
    public static final float i = 0.38f;
    public static final float j = 1.0f;
    public static final lc k = lc.e;
    public static final pm q = new pm(false);
    public static final pm r = new pm(true);
    public static final StackTraceElement[] t = new StackTraceElement[0];
    public static final hq0 z = new hq0(0, new long[0], new Object[0]);

    static {
        int i2 = 1;
        c = new mm("UNDEFINED", i2);
        d = new mm("REUSABLE_CLAIMED", i2);
        l = new mm("COMPLETING_ALREADY", i2);
        m = new mm("COMPLETING_WAITING_CHILDREN", i2);
        n = new mm("COMPLETING_RETRY", i2);
        o = new mm("TOO_LATE_TO_CANCEL", i2);
        p = new mm("SEALED", i2);
        s = new mm("NULL", i2);
        int i3 = 17;
        u = new p2(i3, new yh0(26), new zh0(16));
        v = new p2(i3, new yh0(27), new zh0(i3));
        int i4 = 18;
        w = new p2(i3, new yh0(28), new zh0(i4));
        x = new p2(i3, new yh0(29), new zh0(19));
        y = new p2(i3, new ei0(0), new zh0(20));
        A = new xs0(i4);
    }

    public static final float[] A(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] B(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static final void C(ng ngVar, Object obj) {
        if (!(ngVar instanceof lj)) {
            ngVar.resumeWith(obj);
            return;
        }
        lj ljVar = (lj) ngVar;
        vg vgVar = ljVar.h;
        og ogVar = ljVar.i;
        Throwable a2 = rf0.a(obj);
        Object hdVar = a2 == null ? obj : new hd(a2, false);
        if (vgVar.i(ogVar.getContext())) {
            ljVar.j = hdVar;
            ljVar.g = 1;
            vgVar.h(ogVar.getContext(), ljVar);
            return;
        }
        en a3 = gq0.a();
        if (a3.g >= 4294967296L) {
            ljVar.j = hdVar;
            ljVar.g = 1;
            a3.u(ljVar);
            return;
        }
        a3.v(true);
        try {
            ww wwVar = (ww) ogVar.getContext().j(b2.N);
            if (wwVar == null || wwVar.a()) {
                Object obj2 = ljVar.k;
                tg context = ogVar.getContext();
                Object R = kw.R(context, obj2);
                cs0 l0 = R != kw.s ? nh.l0(ogVar, context, R) : null;
                try {
                    ogVar.resumeWith(obj);
                } finally {
                    if (l0 == null || l0.e0()) {
                        kw.M(context, R);
                    }
                }
            } else {
                ljVar.resumeWith(t30.h(wwVar.l()));
            }
            while (a3.x()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final u20 D(u20 u20Var) {
        return u20Var.c(new oo0());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String E(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static String F(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return j2.j("CornerRadius.circular(", nh.j0(Float.intBitsToFloat(i2)), ")");
        }
        return "CornerRadius.elliptical(" + nh.j0(Float.intBitsToFloat(i2)) + ", " + nh.j0(Float.intBitsToFloat(i3)) + ")";
    }

    public static final Object G(Object obj) {
        gu guVar = obj instanceof gu ? (gu) obj : null;
        return guVar != null ? guVar.a : obj;
    }

    public static final long a(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final v4 b() {
        return new v4(new Paint(7));
    }

    public static float c(EdgeEffect edgeEffect, float f2, float f3, si siVar) {
        float f4 = pl.a;
        double k2 = siVar.k() * 386.0878f * 160.0f * 0.84f;
        double d2 = pl.a * k2;
        float exp = (float) (Math.exp((pl.b / pl.c) * Math.log((Math.abs(f2) * 0.35f) / d2)) * d2);
        int i2 = Build.VERSION.SDK_INT;
        if (exp > (i2 >= 31 ? x3.d(edgeEffect) : 0.0f) * f3) {
            return 0.0f;
        }
        int B2 = t10.B(f2);
        if (i2 >= 31) {
            edgeEffect.onAbsorb(B2);
            return f2;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(B2);
        }
        return f2;
    }

    public static nc d(nc ncVar) {
        qu0 qu0Var = lr0.i;
        if (t10.l(ncVar.b, 12884901888L)) {
            bg0 bg0Var = (bg0) ncVar;
            qu0 qu0Var2 = bg0Var.d;
            if (!l(qu0Var2, qu0Var)) {
                return new bg0(bg0Var.a, bg0Var.h, qu0Var, A(j(z1.c.b, qu0Var2.a(), qu0Var.a()), bg0Var.i), bg0Var.k, bg0Var.n, bg0Var.e, bg0Var.f, bg0Var.g, -1);
            }
        }
        return ncVar;
    }

    public static final void f(cu0 cu0Var, rh0 rh0Var, zy zyVar) {
        AutoCloseable autoCloseable;
        rh0Var.getClass();
        zyVar.getClass();
        du0 du0Var = cu0Var.a;
        synchronized (du0Var.a) {
            autoCloseable = (AutoCloseable) du0Var.b.get("androidx.lifecycle.savedstate.vm.tag");
        }
        lh0 lh0Var = (lh0) autoCloseable;
        if (lh0Var == null || lh0Var.g) {
            return;
        }
        lh0Var.d(rh0Var, zyVar);
        yy yyVar = ((gz) zyVar).b;
        if (yyVar == yy.f || yyVar.compareTo(yy.h) >= 0) {
            rh0Var.d();
        } else {
            zyVar.a(new ei(1, zyVar, rh0Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(jo0 jo0Var, sc0 sc0Var, b8 b8Var) {
        aq aqVar;
        int i2;
        dh dhVar;
        int size;
        int i3;
        if (b8Var instanceof aq) {
            aqVar = (aq) b8Var;
            int i4 = aqVar.h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aqVar.h = i4 - Integer.MIN_VALUE;
                Object obj = aqVar.g;
                i2 = aqVar.h;
                if (i2 != 0) {
                    t30.z(obj);
                    List list = jo0Var.i.w.a;
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        if (((vc0) list.get(i5)).d) {
                            aqVar.e = jo0Var;
                            aqVar.f = sc0Var;
                            aqVar.h = 1;
                            obj = jo0Var.b(sc0Var, aqVar);
                            dhVar = dh.e;
                            if (obj == dhVar) {
                            }
                            List list2 = ((rc0) obj).a;
                            size = list2.size();
                            i3 = 0;
                            while (i3 < size) {
                            }
                            return fs0.a;
                        }
                    }
                    return fs0.a;
                }
                if (i2 != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sc0 sc0Var2 = aqVar.f;
                jo0 jo0Var2 = aqVar.e;
                t30.z(obj);
                sc0Var = sc0Var2;
                jo0Var = jo0Var2;
                List list22 = ((rc0) obj).a;
                size = list22.size();
                i3 = 0;
                while (i3 < size) {
                    if (((vc0) list22.get(i3)).d) {
                        aqVar.e = jo0Var;
                        aqVar.f = sc0Var;
                        aqVar.h = 1;
                        obj = jo0Var.b(sc0Var, aqVar);
                        dhVar = dh.e;
                        if (obj == dhVar) {
                            return dhVar;
                        }
                        List list222 = ((rc0) obj).a;
                        size = list222.size();
                        i3 = 0;
                        while (i3 < size) {
                        }
                    } else {
                        i3++;
                    }
                }
                return fs0.a;
            }
        }
        aqVar = new aq(b8Var);
        Object obj2 = aqVar.g;
        i2 = aqVar.h;
        if (i2 != 0) {
        }
    }

    public static final Object h(zc0 zc0Var, tq tqVar, ng ngVar) {
        dh dhVar;
        fs0 fs0Var;
        bq bqVar = new bq(ngVar.getContext(), tqVar, null);
        ko0 ko0Var = (ko0) zc0Var;
        ko0Var.getClass();
        ja jaVar = new ja(1, lr0.x(ngVar));
        jaVar.r();
        jo0 jo0Var = new jo0(ko0Var, jaVar);
        synchronized (ko0Var.y) {
            ko0Var.x.b(jo0Var);
            ng x2 = lr0.x(lr0.h(jo0Var, jo0Var, bqVar));
            dhVar = dh.e;
            bh0 bh0Var = new bh0(x2);
            fs0Var = fs0.a;
            bh0Var.resumeWith(fs0Var);
        }
        jaVar.t(new i9(2, jo0Var));
        Object p2 = jaVar.p();
        return p2 == dhVar ? p2 : fs0Var;
    }

    public static final u20 i(u20 u20Var, long j2, tk0 tk0Var) {
        return u20Var.c(new y7(j2, tk0Var));
    }

    public static final float[] j(float[] fArr, float[] fArr2, float[] fArr3) {
        B(fArr, fArr2);
        B(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] w2 = w(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return A(w2, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String k(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final boolean l(qu0 qu0Var, qu0 qu0Var2) {
        if (qu0Var == qu0Var2) {
            return true;
        }
        return Math.abs(qu0Var.a - qu0Var2.a) < 0.001f && Math.abs(qu0Var.b - qu0Var2.b) < 0.001f;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static rp m(Context context) {
        ProviderInfo providerInfo;
        pp ppVar;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        m20.d(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                ppVar = new pp(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (ppVar != null) {
                return null;
            }
            return new rp(new qp(context, ppVar));
        }
        ppVar = null;
        if (ppVar != null) {
        }
    }

    public static final tf n(nc ncVar, nc ncVar2) {
        return ncVar == ncVar2 ? new rf(ncVar, ncVar, 1) : (t10.l(ncVar.b, 12884901888L) && t10.l(ncVar2.b, 12884901888L)) ? new sf((bg0) ncVar, (bg0) ncVar2) : new tf(ncVar, ncVar2, 0);
    }

    public static void o(Canvas canvas, boolean z2) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z2) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!F) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    D = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    E = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    D = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    E = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = D;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = E;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            F = true;
        }
        if (z2) {
            try {
                Method method4 = D;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z2 || (method = E) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final boolean p(long j2, long j3) {
        return j2 == j3;
    }

    public static final float q(float f2) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f2) & 8589934591L) / 3)) + 709952852);
        float f3 = intBitsToFloat - ((intBitsToFloat - (f2 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static View r(View view, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            Method method = e3.R0;
            if (method == null) {
                method = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", null);
                e3.R0 = method;
                method.setAccessible(true);
            }
            if (lw.i(method.invoke(view, null), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View r2 = r(viewGroup.getChildAt(i3), i2);
                    if (r2 != null) {
                        return r2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(ao aoVar, tq tqVar, og ogVar) {
        jo joVar;
        int i2;
        mm mmVar;
        tq tqVar2;
        ve0 ve0Var;
        a e2;
        yj yjVar;
        Object obj;
        if (ogVar instanceof jo) {
            joVar = (jo) ogVar;
            int i3 = joVar.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                joVar.i = i3 - Integer.MIN_VALUE;
                Object obj2 = joVar.h;
                i2 = joVar.i;
                mmVar = s;
                if (i2 != 0) {
                    t30.z(obj2);
                    ve0 ve0Var2 = new ve0();
                    ve0Var2.e = mmVar;
                    yj yjVar2 = new yj(tqVar, ve0Var2);
                    try {
                        joVar.e = (go0) tqVar;
                        joVar.f = ve0Var2;
                        joVar.g = yjVar2;
                        joVar.i = 1;
                        Object b2 = aoVar.b(yjVar2, joVar);
                        Object obj3 = dh.e;
                        if (b2 == obj3) {
                            return obj3;
                        }
                        tqVar2 = tqVar;
                        ve0Var = ve0Var2;
                    } catch (a e3) {
                        tqVar2 = tqVar;
                        ve0Var = ve0Var2;
                        e2 = e3;
                        yjVar = yjVar2;
                        if (e2.e != yjVar) {
                        }
                        obj = ve0Var.e;
                        if (obj == mmVar) {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yjVar = joVar.g;
                    ve0Var = joVar.f;
                    tqVar2 = (tq) joVar.e;
                    try {
                        t30.z(obj2);
                    } catch (a e4) {
                        e2 = e4;
                        if (e2.e != yjVar) {
                            throw e2;
                        }
                        obj = ve0Var.e;
                        if (obj == mmVar) {
                        }
                    }
                }
                obj = ve0Var.e;
                if (obj == mmVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + tqVar2);
            }
        }
        joVar = new jo(ogVar);
        Object obj22 = joVar.h;
        i2 = joVar.i;
        mmVar = s;
        if (i2 != 0) {
        }
        obj = ve0Var.e;
        if (obj == mmVar) {
        }
    }

    public static boolean t() {
        try {
            if (e3.L0 == null) {
                e3.L0 = Class.forName("android.os.SystemProperties");
            }
            Method method = e3.M0;
            if (method == null) {
                Class cls = e3.L0;
                method = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                e3.M0 = method;
            }
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return lw.i(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final int u(Layout layout, int i2, boolean z2) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                if (z2) {
                    return lineForOffset - 1;
                }
            } else if (!z2) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final Paint v(v4 v4Var) {
        if (v4Var == null) {
            bv.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + we0.a(v4Var.getClass()).a());
        }
        return v4Var.a;
    }

    public static final float[] w(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static final boolean x(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 != 0.0f) {
            float f31 = 1.0f / f30;
            fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
            fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
            fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
            fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
            fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
            fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
            fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
            fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
            fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        return !(f30 == 0.0f);
    }

    public static final u20 y(se seVar, u20 u20Var) {
        if (u20Var.b(new l0(16, (byte) 0))) {
            return u20Var;
        }
        ((gr) seVar).M(1219399079, null, 0, null);
        u20 u20Var2 = (u20) u20Var.a(new n(4, seVar), r20.a);
        ((gr) seVar).o(false);
        return u20Var2;
    }

    public static final u20 z(se seVar, u20 u20Var) {
        gr grVar = (gr) seVar;
        grVar.P(439770924);
        u20 y2 = y(grVar, u20Var);
        grVar.o(false);
        return y2;
    }

    public abstract void e(float f2, long j2, v4 v4Var);
}
