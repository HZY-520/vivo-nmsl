package defpackage;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Size;
import android.util.SizeF;
import android.view.DragEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class nh {
    public static final ng[] a = new ng[0];
    public static final float[][] b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] d = {95.047f, 100.0f, 108.883f};
    public static final double[][] e = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[][] f = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final Object g = new Object();
    public static final vi h = new vi(1.0f, 1.0f);
    public static final vi i = new vi(1.0f, 1.0f);
    public static final byte[] j = {112, 114, 111, 0};
    public static final byte[] k = {112, 114, 109, 0};
    public static final oe0 l = new oe0(0.0f, 0.0f, 10.0f, 10.0f);
    public static final mm m;
    public static final mm n;

    static {
        int i2 = 1;
        m = new mm("NONE", i2);
        n = new mm("PENDING", i2);
    }

    public static int A(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = d;
        return tc.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final boolean B(uj0 uj0Var) {
        d60 d2 = uj0Var.d();
        k40 k40Var = uj0Var.d.e;
        return (d2 != null ? d2.J0() : false) || k40Var.c(yj0.q) || k40Var.c(yj0.p);
    }

    public static final boolean C(uj0 uj0Var) {
        if (!B(uj0Var)) {
            qj0 qj0Var = uj0Var.d;
            if (qj0Var.g) {
                return true;
            }
            k40 k40Var = qj0Var.e;
            Object[] objArr = k40Var.b;
            Object[] objArr2 = k40Var.c;
            long[] jArr = k40Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((ak0) obj).c) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    public static float D(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final u20 E(u20 u20Var, f90 f90Var) {
        return u20Var.c(new e90(f90Var));
    }

    public static final u20 F(u20 u20Var, float f2) {
        return u20Var.c(new c90(f2, f2, f2, f2));
    }

    public static u20 G(u20 u20Var, float f2, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        float f3 = (i2 & 2) == 0 ? 6.0f : 0.0f;
        return u20Var.c(new c90(f2, f3, f2, f3));
    }

    public static final u20 H(u20 u20Var, float f2, float f3, float f4, float f5) {
        return u20Var.c(new c90(f2, f3, f4, f5));
    }

    public static u20 I(u20 u20Var, int i2) {
        return H(u20Var, (i2 & 1) != 0 ? 0.0f : 16.0f, (i2 & 2) != 0 ? 0.0f : 14.0f, 0.0f, (i2 & 8) != 0 ? 0.0f : 12.0f);
    }

    public static final kh J(yo yoVar) {
        int ordinal = yoVar.t0().ordinal();
        kh khVar = kh.e;
        if (ordinal != 0) {
            kh khVar2 = kh.f;
            if (ordinal == 1) {
                yo q = kw.q(yoVar);
                if (q == null) {
                    z6.l("ActiveParent with no focused child");
                    return null;
                }
                kh J = J(q);
                kh khVar3 = J != khVar ? J : null;
                if (khVar3 != null) {
                    return khVar3;
                }
                if (yoVar.t) {
                    return khVar;
                }
                yoVar.t = true;
                try {
                    vo q0 = yoVar.q0();
                    uo uoVar = (uo) b0(yoVar).getFocusOwner();
                    yo f2 = uoVar.f();
                    q0.k.getClass();
                    yo f3 = uoVar.f();
                    return (f2 == f3 || f3 == null) ? khVar : wo.d == wo.c ? khVar2 : kh.g;
                } finally {
                    yoVar.t = false;
                }
            }
            if (ordinal == 2) {
                return khVar2;
            }
            if (ordinal != 3) {
                z6.j();
                return null;
            }
        }
        return khVar;
    }

    public static final kh K(yo yoVar) {
        if (!yoVar.u) {
            yoVar.u = true;
            try {
                vo q0 = yoVar.q0();
                uo uoVar = (uo) b0(yoVar).getFocusOwner();
                yo f2 = uoVar.f();
                q0.j.getClass();
                yo f3 = uoVar.f();
                if (f2 != f3 && f3 != null) {
                    return wo.d == wo.c ? kh.f : kh.g;
                }
            } finally {
                yoVar.u = false;
            }
        }
        return kh.e;
    }

    public static final kh L(yo yoVar) {
        t20 t20Var;
        y50 y50Var;
        int ordinal = yoVar.t0().ordinal();
        kh khVar = kh.e;
        if (ordinal != 0) {
            if (ordinal == 1) {
                yo q = kw.q(yoVar);
                if (q != null) {
                    return J(q);
                }
                z6.l("ActiveParent with no focused child");
                return null;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    z6.j();
                    return null;
                }
                if (!yoVar.e.r) {
                    cv.b("visitAncestors called on an unattached node");
                }
                t20 t20Var2 = yoVar.e.i;
                iy a0 = a0(yoVar);
                loop0: while (true) {
                    if (a0 == null) {
                        t20Var = null;
                        break;
                    }
                    if ((a0.H.f.h & 1024) != 0) {
                        while (t20Var2 != null) {
                            if ((t20Var2.g & 1024) != 0) {
                                t20Var = t20Var2;
                                t40 t40Var = null;
                                while (t20Var != null) {
                                    if (t20Var instanceof yo) {
                                        break loop0;
                                    }
                                    if ((t20Var.g & 1024) != 0 && (t20Var instanceof oi)) {
                                        int i2 = 0;
                                        for (t20 t20Var3 = ((oi) t20Var).t; t20Var3 != null; t20Var3 = t20Var3.j) {
                                            if ((t20Var3.g & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    t20Var = t20Var3;
                                                } else {
                                                    if (t40Var == null) {
                                                        t40Var = new t40(new t20[16]);
                                                    }
                                                    if (t20Var != null) {
                                                        t40Var.b(t20Var);
                                                        t20Var = null;
                                                    }
                                                    t40Var.b(t20Var3);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    t20Var = N(t40Var);
                                }
                            }
                            t20Var2 = t20Var2.i;
                        }
                    }
                    a0 = a0.n();
                    t20Var2 = (a0 == null || (y50Var = a0.H) == null) ? null : y50Var.e;
                }
                yo yoVar2 = (yo) t20Var;
                if (yoVar2 == null) {
                    return khVar;
                }
                int ordinal2 = yoVar2.t0().ordinal();
                if (ordinal2 == 0) {
                    return K(yoVar2);
                }
                if (ordinal2 == 1) {
                    return L(yoVar2);
                }
                if (ordinal2 == 2) {
                    return kh.f;
                }
                if (ordinal2 != 3) {
                    z6.j();
                    return null;
                }
                kh L = L(yoVar2);
                kh khVar2 = L != khVar ? L : null;
                return khVar2 == null ? K(yoVar2) : khVar2;
            }
        }
        return khVar;
    }

    public static final Object M(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final t20 N(t40 t40Var) {
        int i2;
        if (t40Var == null || (i2 = t40Var.g) == 0) {
            return null;
        }
        return (t20) t40Var.j(i2 - 1);
    }

    public static final boolean O(yo yoVar, boolean z) {
        int ordinal = yoVar.t0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                yo q = kw.q(yoVar);
                if (!(q != null ? O(q, z) : true)) {
                    return false;
                }
                yoVar.p0(xo.f, xo.g);
                return true;
            }
            if (ordinal == 2) {
                return z;
            }
            if (ordinal != 3) {
                z6.j();
                return false;
            }
        }
        return true;
    }

    public static int[] R(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) kw.I(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static fj[] S(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, fj[] fjVarArr) {
        byte[] bArr3 = kw.n;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, kw.o)) {
                z6.m("Unsupported meta version");
                return null;
            }
            int I = (int) kw.I(fileInputStream, 2);
            byte[] H = kw.H(fileInputStream, (int) kw.I(fileInputStream, 4), (int) kw.I(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                z6.m("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(H);
            try {
                fj[] U = U(byteArrayInputStream, bArr2, I, fjVarArr);
                byteArrayInputStream.close();
                return U;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(kw.i, bArr2)) {
            z6.m("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            z6.m("Unsupported meta version");
            return null;
        }
        int I2 = (int) kw.I(fileInputStream, 1);
        byte[] H2 = kw.H(fileInputStream, (int) kw.I(fileInputStream, 4), (int) kw.I(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            z6.m("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(H2);
        try {
            fj[] T = T(byteArrayInputStream2, I2, fjVarArr);
            byteArrayInputStream2.close();
            return T;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static fj[] T(ByteArrayInputStream byteArrayInputStream, int i2, fj[] fjVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new fj[0];
        }
        if (i2 != fjVarArr.length) {
            z6.m("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int I = (int) kw.I(byteArrayInputStream, 2);
            iArr[i3] = (int) kw.I(byteArrayInputStream, 2);
            strArr[i3] = new String(kw.G(byteArrayInputStream, I), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            fj fjVar = fjVarArr[i4];
            if (!fjVar.b.equals(strArr[i4])) {
                z6.m("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            fjVar.e = i5;
            fjVar.h = R(byteArrayInputStream, i5);
        }
        return fjVarArr;
    }

    public static fj[] U(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, fj[] fjVarArr) {
        fj fjVar;
        if (byteArrayInputStream.available() == 0) {
            return new fj[0];
        }
        if (i2 != fjVarArr.length) {
            z6.m("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            kw.I(byteArrayInputStream, 2);
            String str = new String(kw.G(byteArrayInputStream, (int) kw.I(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long I = kw.I(byteArrayInputStream, 4);
            int I2 = (int) kw.I(byteArrayInputStream, 2);
            if (fjVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i4 = 0; i4 < fjVarArr.length; i4++) {
                    if (fjVarArr[i4].b.equals(substring)) {
                        fjVar = fjVarArr[i4];
                        break;
                    }
                }
            }
            fjVar = null;
            if (fjVar == null) {
                z6.m("Missing profile key: ".concat(str));
                return null;
            }
            fjVar.d = I;
            int[] R = R(byteArrayInputStream, I2);
            if (Arrays.equals(bArr, kw.m)) {
                fjVar.e = I2;
                fjVar.h = R;
            }
        }
        return fjVarArr;
    }

    public static fj[] V(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, kw.j)) {
            z6.m("Unsupported version");
            return null;
        }
        int I = (int) kw.I(fileInputStream, 1);
        byte[] H = kw.H(fileInputStream, (int) kw.I(fileInputStream, 4), (int) kw.I(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            z6.m("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(H);
        try {
            fj[] W = W(byteArrayInputStream, str, I);
            byteArrayInputStream.close();
            return W;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static fj[] W(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new fj[0];
        }
        fj[] fjVarArr = new fj[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int I = (int) kw.I(byteArrayInputStream, 2);
            int I2 = (int) kw.I(byteArrayInputStream, 2);
            fjVarArr[i4] = new fj(str, new String(kw.G(byteArrayInputStream, I), StandardCharsets.UTF_8), kw.I(byteArrayInputStream, 4), I2, (int) kw.I(byteArrayInputStream, 4), (int) kw.I(byteArrayInputStream, 4), new int[I2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            fj fjVar = fjVarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = fjVar.f;
            int i7 = fjVar.g;
            TreeMap treeMap = fjVar.i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) kw.I(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i9), 1);
                int I3 = (int) kw.I(byteArrayInputStream, 2);
                while (I3 > 0) {
                    kw.I(byteArrayInputStream, 2);
                    int I4 = (int) kw.I(byteArrayInputStream, 1);
                    if (I4 != 6 && I4 != 7) {
                        while (I4 > 0) {
                            kw.I(byteArrayInputStream, 1);
                            int i10 = i3;
                            int i11 = i5;
                            for (int I5 = (int) kw.I(byteArrayInputStream, 1); I5 > 0; I5--) {
                                kw.I(byteArrayInputStream, 2);
                            }
                            I4--;
                            i3 = i10;
                            i5 = i11;
                        }
                    }
                    I3--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i12 = i3;
            int i13 = i5;
            if (byteArrayInputStream.available() != i8) {
                z6.m("Read too much data during profile line parse");
                return null;
            }
            fjVar.h = R(byteArrayInputStream, fjVar.e);
            BitSet valueOf = BitSet.valueOf(kw.G(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i14 = i12; i14 < i7; i14++) {
                int i15 = valueOf.get(i14) ? 2 : i12;
                if (valueOf.get(i14 + i7)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
            i5 = i13 + 1;
            i3 = i12;
        }
        return fjVarArr;
    }

    public static final Object X(Object obj) {
        return obj instanceof hd ? t30.h(((hd) obj).a) : obj;
    }

    public static final d60 Y(ni niVar, int i2) {
        d60 d60Var = ((t20) niVar).e.l;
        d60Var.getClass();
        if (d60Var.A0() != niVar || !e60.f(i2)) {
            return d60Var;
        }
        d60 d60Var2 = d60Var.z;
        d60Var2.getClass();
        return d60Var2;
    }

    public static final d60 Z(ni niVar) {
        if (!((t20) niVar).e.r) {
            cv.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        d60 Y = Y(niVar, 2);
        if (!Y.A0().r) {
            cv.b("LayoutCoordinates is not attached.");
        }
        return Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(u20 u20Var, tk0 tk0Var, qa qaVar, ra raVar, uq uqVar, se seVar, int i2, int i3) {
        qa qaVar2;
        int i4;
        int i5;
        uq uqVar2;
        ra raVar2;
        qa qaVar3;
        de0 q;
        int i6;
        gr grVar = (gr) seVar;
        grVar.Q(1359693790);
        int i7 = i2 | (grVar.e(tk0Var) ? 32 : 16);
        if ((i3 & 4) == 0) {
            qaVar2 = qaVar;
            if (grVar.e(qaVar2)) {
                i4 = 256;
                i5 = i7 | i4 | 25600;
                int i8 = 1;
                if (grVar.I(i5 & 1, (74899 & i5) == 74898)) {
                    uqVar2 = uqVar;
                    grVar.L();
                    raVar2 = raVar;
                    qaVar3 = qaVar2;
                } else {
                    grVar.N();
                    if ((i2 & 1) == 0 || grVar.v()) {
                        if ((i3 & 4) != 0) {
                            qaVar2 = q3.u((kc) grVar.i(mc.a));
                            i5 &= -897;
                        }
                        i6 = i5 & (-7169);
                        raVar2 = new ra(q3.l, q3.k);
                    } else {
                        grVar.L();
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                        }
                        i6 = i5 & (-7169);
                        raVar2 = raVar;
                    }
                    qaVar3 = qaVar2;
                    grVar.p();
                    long j2 = qaVar3.a;
                    long j3 = qaVar3.b;
                    raVar2.getClass();
                    grVar.P(-1763481333);
                    grVar.P(167751211);
                    Object G = grVar.G();
                    if (G == re.a) {
                        G = p30.m(new ck(0.0f));
                        grVar.Y(G);
                    }
                    grVar.o(false);
                    grVar.o(false);
                    uqVar2 = uqVar;
                    bo0.a(u20Var, tk0Var, j2, j3, ((ck) ((p40) G).getValue()).e, kw.J(-97109725, new x2(i8, uqVar2), grVar), grVar, (i6 & 112) | 14155782, 16);
                }
                q = grVar.q();
                if (q == null) {
                    q.d = new sa(u20Var, tk0Var, qaVar3, raVar2, uqVar2, i2, i3);
                    return;
                }
                return;
            }
        } else {
            qaVar2 = qaVar;
        }
        i4 = 128;
        i5 = i7 | i4 | 25600;
        int i82 = 1;
        if (grVar.I(i5 & 1, (74899 & i5) == 74898)) {
        }
        q = grVar.q();
        if (q == null) {
        }
    }

    public static final iy a0(ni niVar) {
        d60 d60Var = ((t20) niVar).e.l;
        if (d60Var != null) {
            return d60Var.y;
        }
        throw j2.f("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(xd0 xd0Var, tq tqVar, se seVar, int i2) {
        rs0 rs0Var;
        boolean z;
        de0 q;
        gr grVar = (gr) seVar;
        grVar.Q(-149765515);
        fw fwVar = grVar.x;
        xa0 k2 = grVar.k();
        grVar.M(201, ue.b, 0, null);
        Object G = grVar.G();
        if (lw.i(G, re.a)) {
            rs0Var = null;
        } else {
            G.getClass();
            rs0Var = (rs0) G;
        }
        vd0 vd0Var = xd0Var.a;
        rs0 d2 = vd0Var.d(xd0Var, rs0Var);
        boolean equals = d2.equals(rs0Var);
        if (!equals) {
            grVar.Y(d2);
        }
        int i3 = 1;
        if (grVar.P) {
            if (xd0Var.g || !k2.containsKey(vd0Var)) {
                k2 = k2.b(vd0Var, d2);
            }
            grVar.J = true;
        } else {
            kl0 kl0Var = grVar.G;
            Object b2 = kl0Var.b(kl0Var.b, kl0Var.g);
            b2.getClass();
            xa0 xa0Var = (xa0) b2;
            if (!(grVar.w() && equals) && (xd0Var.g || !k2.containsKey(vd0Var))) {
                k2 = k2.b(vd0Var, d2);
            } else if ((equals && !grVar.w) || !grVar.w) {
                k2 = xa0Var;
            }
            if (grVar.y || xa0Var != k2) {
                z = true;
                if (z && !grVar.P) {
                    grVar.E(k2);
                }
                fwVar.c(grVar.w ? 1 : 0);
                grVar.w = z;
                grVar.K = k2;
                grVar.M(202, ue.c, 0, k2);
                tqVar.invoke(grVar, 0);
                grVar.o(false);
                grVar.o(false);
                grVar.w = fwVar.b() != 0;
                grVar.K = null;
                q = grVar.q();
                if (q == null) {
                    q.d = new u3(xd0Var, tqVar, i2, i3);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
            grVar.E(k2);
        }
        fwVar.c(grVar.w ? 1 : 0);
        grVar.w = z;
        grVar.K = k2;
        grVar.M(202, ue.c, 0, k2);
        tqVar.invoke(grVar, 0);
        grVar.o(false);
        grVar.o(false);
        grVar.w = fwVar.b() != 0;
        grVar.K = null;
        q = grVar.q();
        if (q == null) {
        }
    }

    public static final e3 b0(ni niVar) {
        e3 e3Var = a0(niVar).r;
        if (e3Var != null) {
            return e3Var;
        }
        throw j2.f("This node does not have an owner.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(xd0[] xd0VarArr, be beVar, se seVar, int i2) {
        xa0 X;
        boolean z;
        de0 q;
        gr grVar = (gr) seVar;
        grVar.Q(415205898);
        fw fwVar = grVar.x;
        xa0 k2 = grVar.k();
        grVar.M(201, ue.b, 0, null);
        if (grVar.P) {
            X = grVar.X(k2, kw.Q(xd0VarArr, k2, xa0.h));
            grVar.J = true;
        } else {
            kl0 kl0Var = grVar.G;
            Object g2 = kl0Var.g(kl0Var.g, 0);
            g2.getClass();
            xa0 xa0Var = (xa0) g2;
            kl0 kl0Var2 = grVar.G;
            Object g3 = kl0Var2.g(kl0Var2.g, 1);
            g3.getClass();
            xa0 xa0Var2 = (xa0) g3;
            xa0 Q = kw.Q(xd0VarArr, k2, xa0Var2);
            if (grVar.w() && !grVar.y && xa0Var2.equals(Q)) {
                grVar.l = grVar.G.q() + grVar.l;
                X = xa0Var;
            } else {
                X = grVar.X(k2, Q);
                if (grVar.y || !lw.i(X, xa0Var)) {
                    z = true;
                    if (z && !grVar.P) {
                        grVar.E(X);
                    }
                    fwVar.c(grVar.w ? 1 : 0);
                    grVar.w = z;
                    grVar.K = X;
                    grVar.M(202, ue.c, 0, X);
                    beVar.invoke(grVar, Integer.valueOf((i2 >> 3) & 14));
                    grVar.o(false);
                    grVar.o(false);
                    grVar.w = fwVar.b() != 0;
                    grVar.K = null;
                    q = grVar.q();
                    if (q == null) {
                        q.d = new zd(xd0VarArr, beVar, i2);
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        if (z) {
            grVar.E(X);
        }
        fwVar.c(grVar.w ? 1 : 0);
        grVar.w = z;
        grVar.K = X;
        grVar.M(202, ue.c, 0, X);
        beVar.invoke(grVar, Integer.valueOf((i2 >> 3) & 14));
        grVar.o(false);
        grVar.o(false);
        grVar.w = fwVar.b() != 0;
        grVar.K = null;
        q = grVar.q();
        if (q == null) {
        }
    }

    public static final e3 c0(iy iyVar) {
        e3 e3Var = iyVar.r;
        if (e3Var != null) {
            return e3Var;
        }
        throw j2.f("LayoutNode should be attached to an owner");
    }

    public static final cn0 d(Object obj) {
        if (obj == null) {
            obj = dx0.s;
        }
        return new cn0(obj);
    }

    public static final void d0(Object[] objArr, int i2, int i3) {
        objArr.getClass();
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static final void e(t40 t40Var, t20 t20Var) {
        t40 t = a0(t20Var).t();
        int i2 = t.g - 1;
        Object[] objArr = t.e;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                t40Var.b(((iy) objArr[i2]).H.f);
                i2--;
            }
        }
    }

    public static final void e0(i1 i1Var, uj0 uj0Var) {
        List i2;
        Object g2 = uj0Var.k().e.g(yj0.g);
        if (g2 == null) {
            g2 = null;
        }
        if (g2 != null) {
            z6.c();
            return;
        }
        uj0 l2 = uj0Var.l();
        if (l2 == null) {
            return;
        }
        Object g3 = l2.k().e.g(yj0.e);
        if (g3 == null) {
            g3 = null;
        }
        if (g3 != null) {
            Object g4 = l2.k().e.g(yj0.f);
            if ((g4 != null ? g4 : null) != null) {
                z6.c();
                return;
            }
            if (uj0Var.k().e.c(yj0.H)) {
                ArrayList arrayList = new ArrayList();
                i2 = l2.i((r3 & 1) != 0 ? !l2.b : false, (r3 & 2) == 0);
                int size = i2.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    uj0 uj0Var2 = (uj0) i2.get(i4);
                    if (uj0Var2.k().e.c(yj0.H)) {
                        arrayList.add(uj0Var2);
                        if (uj0Var2.c.o() < uj0Var.c.o()) {
                            i3++;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                boolean j2 = j(arrayList);
                int i5 = j2 ? 0 : i3;
                int i6 = j2 ? i3 : 0;
                Object g5 = uj0Var.k().e.g(yj0.H);
                if (g5 == null) {
                    g5 = Boolean.FALSE;
                }
                i1Var.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i5, 1, i6, 1, false, ((Boolean) g5).booleanValue()));
            }
        }
    }

    public static int f(double d2) {
        double d3 = (d2 + 16.0d) / 116.0d;
        double d4 = d2 > 8.0d ? d3 * d3 * d3 : d2 / 903.2962962962963d;
        double d5 = d3 * d3 * d3;
        boolean z = d5 > 0.008856451679035631d;
        double d6 = z ? d5 : d2 / 903.2962962962963d;
        if (!z) {
            d5 = d2 / 903.2962962962963d;
        }
        float[] fArr = d;
        double d7 = d6 * fArr[0];
        double d8 = d4 * fArr[1];
        double d9 = d5 * fArr[2];
        double[][] dArr = f;
        double[] dArr2 = dArr[0];
        double d10 = (dArr2[2] * d9) + (dArr2[1] * d8) + (dArr2[0] * d7);
        double[] dArr3 = dArr[1];
        double d11 = (dArr3[2] * d9) + (dArr3[1] * d8) + (dArr3[0] * d7);
        double[] dArr4 = dArr[2];
        return ((p(d10) & 255) << 16) | (-16777216) | ((p(d11) & 255) << 8) | (p((dArr4[2] * d9) + (dArr4[1] * d8) + (dArr4[0] * d7)) & 255);
    }

    public static final String f0(Object obj) {
        return j2.j(obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName(), "@", String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ay g(t20 t20Var) {
        if ((t20Var.g & 2) != 0) {
            if (t20Var instanceof ay) {
                return (ay) t20Var;
            }
            if (t20Var instanceof oi) {
                t20 t20Var2 = ((oi) t20Var).t;
                while (t20Var2 != 0) {
                    if (t20Var2 instanceof ay) {
                        return (ay) t20Var2;
                    }
                    t20Var2 = (!(t20Var2 instanceof oi) || (t20Var2.g & 2) == 0) ? t20Var2.j : ((oi) t20Var2).t;
                }
            }
        }
        return null;
    }

    public static tm0 g0(int i2) {
        return new tm0(1.0f, (i2 & 2) != 0 ? 1500.0f : 400.0f, null);
    }

    public static final Bundle h(k90... k90VarArr) {
        Bundle bundle = new Bundle(k90VarArr.length);
        for (k90 k90Var : k90VarArr) {
            String str = (String) k90Var.e;
            Object obj = k90Var.f;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + "\"");
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + "\"");
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final String h0(Object[] objArr, int i2, int i3, y yVar) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == yVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final int i(w00 w00Var, c2 c2Var) {
        w00 Y = w00Var.Y();
        if (Y == null) {
            cv.b("Child of " + w00Var + " cannot be null when calculating alignment line");
        }
        if (w00Var.e0().a().containsKey(c2Var)) {
            Integer num = (Integer) w00Var.e0().a().get(c2Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int X = Y.X(c2Var);
            if (X != Integer.MIN_VALUE) {
                boolean z = w00Var.r;
                boolean z2 = w00Var.s;
                Y.r = true;
                w00Var.s = true;
                w00Var.n0();
                Y.r = z;
                w00Var.s = z2;
                return X + ((int) (c2Var instanceof kt ? Y.g0() & 4294967295L : Y.g0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final String i0(ng ngVar) {
        Object qf0Var;
        if (ngVar instanceof lj) {
            return ((lj) ngVar).toString();
        }
        try {
            qf0Var = ngVar + '@' + y(ngVar);
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (rf0.a(qf0Var) != null) {
            qf0Var = ngVar.getClass().getName() + '@' + y(ngVar);
        }
        return (String) qf0Var;
    }

    public static final boolean j(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = um.e;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    uj0 uj0Var = (uj0) obj2;
                    uj0 uj0Var2 = (uj0) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (uj0Var2.g().a() >> 32)) - Float.intBitsToFloat((int) (uj0Var.g().a() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (uj0Var2.g().a() & 4294967295L)) - Float.intBitsToFloat((int) (uj0Var.g().a() & 4294967295L)));
                    arrayList2.add(new s60((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((s60) ac.Z(list)).a;
            } else {
                if (list.isEmpty()) {
                    c00.b("Empty collection can't be reduced.");
                }
                Object Z = ac.Z(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        Z = new s60(s60.e(((s60) Z).a, ((s60) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((s60) Z).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final String j0(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f3 = f2 * pow;
        int i2 = (int) f3;
        if (f3 - i2 >= 0.5f) {
            i2++;
        }
        float f4 = i2 / pow;
        return max > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    /* JADX WARN: Finally extract failed */
    public static boolean k0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, fj[] fjVarArr) {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = kw.m;
        byte[] bArr3 = kw.l;
        byte[] bArr4 = kw.i;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = kw.j;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] n2 = n(fjVarArr, bArr5);
                kw.T(byteArrayOutputStream, fjVarArr.length, 1);
                kw.T(byteArrayOutputStream, n2.length, 4);
                byte[] k2 = kw.k(n2);
                kw.T(byteArrayOutputStream, k2.length, 4);
                byteArrayOutputStream.write(k2);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                kw.T(byteArrayOutputStream, fjVarArr.length, 1);
                for (fj fjVar : fjVarArr) {
                    int size = fjVar.i.size() * 4;
                    String s = s(fjVar.a, fjVar.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    kw.U(byteArrayOutputStream, s.getBytes(charset).length);
                    kw.U(byteArrayOutputStream, fjVar.h.length);
                    kw.T(byteArrayOutputStream, size, 4);
                    kw.T(byteArrayOutputStream, fjVar.c, 4);
                    byteArrayOutputStream.write(s.getBytes(charset));
                    Iterator it = fjVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        kw.U(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        kw.U(byteArrayOutputStream, 0);
                    }
                    for (int i4 : fjVar.h) {
                        kw.U(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = kw.k;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] n3 = n(fjVarArr, bArr6);
                kw.T(byteArrayOutputStream, fjVarArr.length, 1);
                kw.T(byteArrayOutputStream, n3.length, 4);
                byte[] k3 = kw.k(n3);
                kw.T(byteArrayOutputStream, k3.length, 4);
                byteArrayOutputStream.write(k3);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            kw.U(byteArrayOutputStream, fjVarArr.length);
            for (fj fjVar2 : fjVarArr) {
                String str = fjVar2.a;
                TreeMap treeMap = fjVar2.i;
                String s2 = s(str, fjVar2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                kw.U(byteArrayOutputStream, s2.getBytes(charset2).length);
                kw.U(byteArrayOutputStream, treeMap.size());
                kw.U(byteArrayOutputStream, fjVar2.h.length);
                kw.T(byteArrayOutputStream, fjVar2.c, 4);
                byteArrayOutputStream.write(s2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    kw.U(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : fjVar2.h) {
                    kw.U(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            kw.U(byteArrayOutputStream2, fjVarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (fj fjVar3 : fjVarArr) {
                kw.T(byteArrayOutputStream2, fjVar3.c, 4);
                kw.T(byteArrayOutputStream2, fjVar3.d, 4);
                kw.T(byteArrayOutputStream2, fjVar3.g, 4);
                String s3 = s(fjVar3.a, fjVar3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = s3.getBytes(charset3).length;
                kw.U(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(s3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            cx0 cx0Var = new cx0(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(cx0Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < fjVarArr.length) {
                try {
                    fj fjVar4 = fjVarArr[i8];
                    kw.U(byteArrayOutputStream3, i8);
                    kw.U(byteArrayOutputStream3, fjVar4.e);
                    i9 = i9 + 4 + (fjVar4.e * i6);
                    int[] iArr = fjVar4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        kw.U(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            cx0 cx0Var2 = new cx0(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(cx0Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < fjVarArr.length; i14++) {
                try {
                    fj fjVar5 = fjVarArr[i14];
                    Iterator it3 = fjVar5.i.entrySet().iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        i15 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        o0(byteArrayOutputStream4, i15, fjVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            p0(byteArrayOutputStream4, fjVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            kw.U(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i16 = i13 + 6;
                            kw.T(byteArrayOutputStream3, length4, 4);
                            kw.U(byteArrayOutputStream3, i15);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i16 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            cx0 cx0Var3 = new cx0(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(cx0Var3);
            long size2 = 12 + (arrayList.size() * 16);
            kw.T(byteArrayOutputStream, arrayList.size(), 4);
            int i17 = 0;
            while (i17 < arrayList.size()) {
                cx0 cx0Var4 = (cx0) arrayList.get(i17);
                int i18 = cx0Var4.a;
                byte[] bArr7 = cx0Var4.b;
                if (i18 != 1) {
                    i2 = i12;
                    if (i18 == i2) {
                        j2 = 1;
                    } else if (i18 == 3) {
                        j2 = 2;
                    } else if (i18 == 4) {
                        j2 = 3;
                    } else {
                        if (i18 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                } else {
                    i2 = i12;
                    j2 = 0;
                }
                kw.T(byteArrayOutputStream, j2, 4);
                kw.T(byteArrayOutputStream, size2, 4);
                if (cx0Var4.c) {
                    long length5 = bArr7.length;
                    byte[] k4 = kw.k(bArr7);
                    arrayList2.add(k4);
                    kw.T(byteArrayOutputStream, k4.length, 4);
                    kw.T(byteArrayOutputStream, length5, 4);
                    length = k4.length;
                } else {
                    arrayList2.add(bArr7);
                    kw.T(byteArrayOutputStream, bArr7.length, 4);
                    kw.T(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i17++;
                i12 = i2;
            }
            for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i19));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static final cs0 l0(ng ngVar, tg tgVar, Object obj) {
        cs0 cs0Var = null;
        if ((ngVar instanceof eh) && tgVar.j(ds0.e) != null) {
            eh ehVar = (eh) ngVar;
            while (true) {
                if ((ehVar instanceof mj) || (ehVar = ehVar.getCallerFrame()) == null) {
                    break;
                }
                if (ehVar instanceof cs0) {
                    cs0Var = (cs0) ehVar;
                    break;
                }
            }
            if (cs0Var != null) {
                cs0Var.f0(tgVar, obj);
            }
        }
        return cs0Var;
    }

    public static void m0(ByteArrayOutputStream byteArrayOutputStream, fj fjVar) {
        p0(byteArrayOutputStream, fjVar);
        int i2 = fjVar.g;
        int[] iArr = fjVar.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            kw.U(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : fjVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static byte[] n(fj[] fjVarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (fj fjVar : fjVarArr) {
            i3 += ((((fjVar.g * 2) + 7) & (-8)) / 8) + (fjVar.e * 2) + s(fjVar.a, fjVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + fjVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, kw.k)) {
            int length = fjVarArr.length;
            while (i2 < length) {
                fj fjVar2 = fjVarArr[i2];
                n0(byteArrayOutputStream, fjVar2, s(fjVar2.a, fjVar2.b, bArr));
                m0(byteArrayOutputStream, fjVar2);
                i2++;
            }
        } else {
            for (fj fjVar3 : fjVarArr) {
                n0(byteArrayOutputStream, fjVar3, s(fjVar3.a, fjVar3.b, bArr));
            }
            int length2 = fjVarArr.length;
            while (i2 < length2) {
                m0(byteArrayOutputStream, fjVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static void n0(ByteArrayOutputStream byteArrayOutputStream, fj fjVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        kw.U(byteArrayOutputStream, str.getBytes(charset).length);
        kw.U(byteArrayOutputStream, fjVar.e);
        kw.T(byteArrayOutputStream, fjVar.f, 4);
        kw.T(byteArrayOutputStream, fjVar.c, 4);
        kw.T(byteArrayOutputStream, fjVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static boolean o(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = o(file2) && z;
        }
        return z;
    }

    public static void o0(ByteArrayOutputStream byteArrayOutputStream, int i2, fj fjVar) {
        int i3 = fjVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : fjVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static int p(double d2) {
        double d3 = d2 / 100.0d;
        int round = (int) Math.round((d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (round < 0) {
            return 0;
        }
        if (round > 255) {
            return 255;
        }
        return round;
    }

    public static void p0(ByteArrayOutputStream byteArrayOutputStream, fj fjVar) {
        int i2 = 0;
        for (Map.Entry entry : fjVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                kw.U(byteArrayOutputStream, intValue - i2);
                kw.U(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static final ao q(ao aoVar) {
        return aoVar instanceof an0 ? aoVar : aoVar instanceof zj ? aoVar : new zj(aoVar);
    }

    public static final tg r(tg tgVar, tg tgVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i2 = 12;
        boolean booleanValue = ((Boolean) tgVar.m(new bd(i2), bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) tgVar2.m(new bd(i2), bool)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return tgVar.g(tgVar2);
        }
        bd bdVar = new bd(10);
        sm smVar = sm.e;
        tg tgVar3 = (tg) tgVar.m(bdVar, smVar);
        Object obj = tgVar2;
        if (booleanValue2) {
            obj = tgVar2.m(new bd(11), smVar);
        }
        return tgVar3.g((tg) obj);
    }

    public static String s(String str, String str2, byte[] bArr) {
        byte[] bArr2 = kw.l;
        byte[] bArr3 = kw.m;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder(str);
                sb.append((Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    public static final y30 t(xj0 xj0Var, pq pqVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            uj0 a2 = xj0Var.a();
            iy iyVar = a2.c;
            if (iyVar.C() && iyVar.B()) {
                oe0 g2 = a2.g();
                y30 y30Var = new y30(48);
                t3 t3Var = new t3(20);
                t3Var.A(lw.B(g2));
                w(new t3(20), t3Var, pqVar, y30Var, a2, a2);
                return y30Var;
            }
            y30 y30Var2 = wv.a;
            y30Var2.getClass();
            return y30Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void u(t3 t3Var, t3 t3Var2, pq pqVar, y30 y30Var, uj0 uj0Var, uj0 uj0Var2) {
        List i2;
        t3 t3Var3 = t3Var;
        Region region = (Region) t3Var3.f;
        t3 t3Var4 = t3Var2;
        Region region2 = (Region) t3Var4.f;
        iy iyVar = uj0Var2.c;
        iy iyVar2 = uj0Var2.c;
        if (!iyVar.C() || !iyVar2.B() || region2.isEmpty()) {
            if (uj0Var2.n()) {
                v(y30Var, uj0Var, uj0Var2);
                return;
            }
            return;
        }
        oe0 m2 = uj0Var2.m();
        if (m2.d()) {
            Object f2 = uj0Var2.f();
            if (f2 == null) {
                iv ivVar = iyVar2.H.c;
                m2 = q3.s(ivVar).A(ivVar, false);
            } else {
                t20 t20Var = ((t20) f2).e;
                Object g2 = uj0Var2.d.e.g(pj0.b);
                if (g2 == null) {
                    g2 = null;
                }
                m2 = p30.e(t20Var, g2 != null, false);
            }
        }
        bw B = lw.B(m2);
        t3Var3.A(B);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i3 = uj0Var2.f;
            uj0 uj0Var3 = uj0Var;
            if (i3 == uj0Var3.f) {
                i3 = -1;
            }
            Rect bounds = region.getBounds();
            wj0 wj0Var = new wj0(uj0Var2, new bw(bounds.left, bounds.top, bounds.right, bounds.bottom));
            y30 y30Var2 = y30Var;
            y30Var2.h(i3, wj0Var);
            i2 = uj0Var2.i((r3 & 1) != 0 ? !uj0Var2.b : false, (r3 & 2) == 0);
            int size = i2.size() - 1;
            while (-1 < size) {
                if (!((Boolean) pqVar.invoke(i2.get(size))).booleanValue()) {
                    u(t3Var3, t3Var4, pqVar, y30Var2, uj0Var3, (uj0) i2.get(size));
                }
                size--;
                t3Var3 = t3Var;
                t3Var4 = t3Var2;
                y30Var2 = y30Var;
                uj0Var3 = uj0Var;
            }
            if (C(uj0Var2)) {
                region2.op(B.a, B.b, B.c, B.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void v(y30 y30Var, uj0 uj0Var, uj0 uj0Var2) {
        iy iyVar;
        uj0 l2 = uj0Var2.l();
        oe0 g2 = (l2 == null || (iyVar = l2.c) == null || !iyVar.C()) ? l : l2.g();
        int i2 = uj0Var2.f;
        if (i2 == uj0Var.f) {
            i2 = -1;
        }
        y30Var.h(i2, new wj0(uj0Var2, lw.B(g2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        if (r5 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        if (r0 != null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void w(t3 t3Var, t3 t3Var2, pq pqVar, y30 y30Var, uj0 uj0Var, uj0 uj0Var2) {
        List i2;
        boolean z;
        oe0 e2;
        y30 y30Var2 = y30Var;
        uj0 uj0Var3 = uj0Var;
        int i3 = uj0Var3.f;
        Region region = (Region) t3Var.f;
        t3 t3Var3 = t3Var2;
        Region region2 = (Region) t3Var3.f;
        iy iyVar = uj0Var2.c;
        qj0 qj0Var = uj0Var2.d;
        iy iyVar2 = uj0Var2.c;
        int i4 = uj0Var2.f;
        boolean z2 = (iyVar.C() && iyVar2.B()) ? false : true;
        if (region2.isEmpty() && i4 != i3) {
            return;
        }
        if (z2 && !uj0Var2.n()) {
            return;
        }
        bw B = lw.B(uj0Var2.m());
        t3Var.A(B);
        if (i4 == i3) {
            i4 = -1;
        }
        if (!region.op(region2, Region.Op.INTERSECT)) {
            if (uj0Var2.n()) {
                v(y30Var, uj0Var, uj0Var2);
                return;
            } else {
                if (i4 == -1) {
                    Rect bounds = region.getBounds();
                    y30Var2.h(i4, new wj0(uj0Var2, new bw(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                    return;
                }
                return;
            }
        }
        Rect bounds2 = region.getBounds();
        y30Var2.h(i4, new wj0(uj0Var2, new bw(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
        i2 = uj0Var2.i((r3 & 1) != 0 ? !uj0Var2.b : false, (r3 & 2) == 0);
        if (qj0Var.g) {
            uj0 l2 = uj0Var2.l();
            while (true) {
                if (l2 == null) {
                    l2 = null;
                    break;
                }
                k40 k40Var = l2.d.e;
                if (k40Var.c(yj0.w) || k40Var.c(yj0.v)) {
                    break;
                } else {
                    l2 = l2.l();
                }
            }
            if (l2 != null) {
                d60 d2 = uj0Var2.d();
                if (d2 != null) {
                    if (!d2.A0().r) {
                        d2 = null;
                    }
                }
                d2 = null;
                d60 d3 = l2.d();
                if (d3 != null) {
                    if (!d3.A0().r) {
                        d3 = null;
                    }
                }
                d3 = null;
                if (d2 != null && d3 != null) {
                    oe0 A = d3.A(d2, false);
                    z = !A.equals(A.c(z20.a(0L, t10.G(d3.g))));
                    if (z) {
                        t3 t3Var4 = new t3(20);
                        Object f2 = uj0Var2.f();
                        if (f2 == null) {
                            iv ivVar = iyVar2.H.c;
                            e2 = q3.s(ivVar).A(ivVar, false);
                        } else {
                            t20 t20Var = ((t20) f2).e;
                            Object g2 = qj0Var.e.g(pj0.b);
                            e2 = p30.e(t20Var, (g2 == null ? null : g2) != null, false);
                        }
                        t3Var4.A(lw.B(e2));
                        int size = i2.size() - 1;
                        while (-1 < size) {
                            if (!((Boolean) pqVar.invoke(i2.get(size))).booleanValue()) {
                                u(new t3(20), t3Var4, pqVar, y30Var2, uj0Var3, (uj0) i2.get(size));
                            }
                            size--;
                            y30Var2 = y30Var;
                            uj0Var3 = uj0Var;
                        }
                        if (C(uj0Var2)) {
                            return;
                        }
                        region2.op(B.a, B.b, B.c, B.d, Region.Op.DIFFERENCE);
                        return;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        pq pqVar2 = pqVar;
        int size2 = i2.size() - 1;
        while (-1 < size2) {
            if (!((Boolean) pqVar2.invoke(i2.get(size2))).booleanValue()) {
                w(t3Var, t3Var3, pqVar2, y30Var, uj0Var, (uj0) i2.get(size2));
            }
            size2--;
            t3Var3 = t3Var2;
            pqVar2 = pqVar;
        }
        if (C(uj0Var2)) {
        }
    }

    public static Set x() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final String y(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final long z(t3 t3Var) {
        DragEvent dragEvent = (DragEvent) t3Var.f;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    public abstract void P(h0 h0Var, h0 h0Var2);

    public abstract void Q(h0 h0Var, Thread thread);

    public abstract boolean k(i0 i0Var, e0 e0Var);

    public abstract boolean l(i0 i0Var, Object obj, Object obj2);

    public abstract boolean m(i0 i0Var, h0 h0Var, h0 h0Var2);
}
