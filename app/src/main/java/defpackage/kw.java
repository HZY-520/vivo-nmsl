package defpackage;

import android.R;
import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class kw {
    public static final mm e;
    public static final mm f;
    public static final mp g;
    public static final mm s;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final Object h = new Object();
    public static final byte[] i = {48, 49, 53, 0};
    public static final byte[] j = {48, 49, 48, 0};
    public static final byte[] k = {48, 48, 57, 0};
    public static final byte[] l = {48, 48, 53, 0};
    public static final byte[] m = {48, 48, 49, 0};
    public static final byte[] n = {48, 48, 49, 0};
    public static final byte[] o = {48, 48, 50, 0};
    public static final ak0 p = new ak0("TestTagsAsResourceId", false, new ei0(14));
    public static final ak0 q = new ak0("AccessibilityClassName", true, new ei0(6));
    public static final ak0 r = new ak0("CredentialRequest", false, new ei0(15));
    public static final ei0 t = new ei0(18);
    public static final ei0 u = new ei0(19);
    public static final ei0 v = new ei0(20);

    static {
        int i2 = 1;
        e = new mm("RESUME_TOKEN", i2);
        f = new mm("CLOSED", i2);
        g = new mp(i2);
        s = new mm("NO_THREAD_ELEMENTS", i2);
    }

    public static final boolean A(uj0 uj0Var) {
        List i2;
        int i3;
        if (!uj0Var.n()) {
            i2 = uj0Var.i((r3 & 1) != 0 ? !uj0Var.b : false, (r3 & 2) == 0);
            int size = i2.size();
            for (i3 = 0; i3 < size; i3++) {
                if (u10.u((uj0) i2.get(i3))) {
                }
            }
            iy n2 = uj0Var.c.n();
            while (true) {
                if (n2 == null) {
                    n2 = null;
                    break;
                }
                qj0 q2 = n2.q();
                if (q2 != null && q2.g) {
                    break;
                }
                n2 = n2.n();
            }
            return !(n2 != null);
        }
        return false;
    }

    public static List B(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static List C(Object... objArr) {
        if (objArr.length <= 0) {
            return um.e;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static u20 D(u20 u20Var, h90 h90Var, float f2, l8 l8Var, int i2) {
        j8 j8Var = b2.j;
        if ((i2 & 16) != 0) {
            f2 = 1.0f;
        }
        return u20Var.c(new i90(h90Var, j8Var, f2, l8Var));
    }

    public static final long E(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + ((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final Object F(xa0 xa0Var, vd0 vd0Var) {
        vd0Var.getClass();
        Object obj = xa0Var.get(vd0Var);
        if (obj == null) {
            obj = vd0Var.b();
        }
        return ((rs0) obj).a(xa0Var);
    }

    public static byte[] G(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                z6.m(j2.g("Not enough bytes to read: ", i2));
                return null;
            }
            i3 += read;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] H(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static long I(InputStream inputStream, int i2) {
        byte[] G = G(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (G[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static final be J(int i2, br brVar, se seVar) {
        gr grVar = (gr) seVar;
        Object G = grVar.G();
        if (G == re.a) {
            G = new be(i2, true, brVar);
            grVar.Y(G);
        }
        be beVar = (be) G;
        if (!beVar.g.equals(brVar)) {
            beVar.g = brVar;
            if (beVar.f) {
                de0 de0Var = beVar.h;
                if (de0Var != null) {
                    cf cfVar = de0Var.a;
                    if (cfVar != null) {
                        cfVar.n(de0Var, null);
                    }
                    beVar.h = null;
                }
                ArrayList arrayList = beVar.i;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        de0 de0Var2 = (de0) arrayList.get(i3);
                        cf cfVar2 = de0Var2.a;
                        if (cfVar2 != null) {
                            cfVar2.n(de0Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return beVar;
    }

    public static final void K(ArrayList arrayList, int i2, int i3) {
        int n2 = n(i2, arrayList);
        if (n2 < 0) {
            n2 = -(n2 + 1);
        }
        while (n2 < arrayList.size() && ((rw) arrayList.get(n2)).b < i3) {
        }
    }

    public static final View L(t20 t20Var) {
        if (!t20Var.e.r) {
            cv.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return nh.c0(nh.a0(t20Var));
    }

    public static final void M(tg tgVar, Object obj) {
        if (obj == s) {
            return;
        }
        if (!(obj instanceof jq0)) {
            Object m2 = tgVar.m(u, null);
            m2.getClass();
            Trace.endSection();
            return;
        }
        jq0 jq0Var = (jq0) obj;
        fq0[] fq0VarArr = jq0Var.c;
        int length = fq0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            fq0VarArr[length].getClass();
            Trace.endSection();
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    public static final long N(long j2) {
        return (Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j2 >> 32))) << 32);
    }

    public static final void O(yo yoVar) {
        t20 t20Var;
        y50 y50Var;
        if (!yoVar.e.r) {
            cv.b("visitAncestors called on an unattached node");
        }
        t20 t20Var2 = yoVar.e.i;
        iy a0 = nh.a0(yoVar);
        loop0: while (true) {
            t20Var = null;
            if (a0 == null) {
                break;
            }
            if ((a0.H.f.h & 1024) != 0) {
                while (t20Var2 != null) {
                    if ((t20Var2.g & 1024) != 0) {
                        t20 t20Var3 = t20Var2;
                        t40 t40Var = null;
                        while (t20Var3 != null) {
                            if (t20Var3 instanceof yo) {
                                t20Var = t20Var3;
                                break loop0;
                            }
                            if ((t20Var3.g & 1024) != 0 && (t20Var3 instanceof oi)) {
                                int i2 = 0;
                                for (t20 t20Var4 = ((oi) t20Var3).t; t20Var4 != null; t20Var4 = t20Var4.j) {
                                    if ((t20Var4.g & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            t20Var3 = t20Var4;
                                        } else {
                                            if (t40Var == null) {
                                                t40Var = new t40(new t20[16]);
                                            }
                                            if (t20Var3 != null) {
                                                t40Var.b(t20Var3);
                                                t20Var3 = null;
                                            }
                                            t40Var.b(t20Var4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            t20Var3 = nh.N(t40Var);
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
            yoVar.s0();
        } else {
            yoVar2.s0();
            yoVar.s0();
        }
    }

    public static final Object P(tg tgVar) {
        Object m2 = tgVar.m(t, 0);
        m2.getClass();
        return m2;
    }

    public static final xa0 Q(xd0[] xd0VarArr, xa0 xa0Var, xa0 xa0Var2) {
        wa0 wa0Var = new wa0(xa0.h);
        for (xd0 xd0Var : xd0VarArr) {
            vd0 vd0Var = xd0Var.a;
            if (xd0Var.g || !xa0Var.containsKey(vd0Var)) {
                wa0Var.put(vd0Var, vd0Var.d(xd0Var, (rs0) xa0Var2.get(vd0Var)));
            }
        }
        return wa0Var.a();
    }

    public static final Object R(tg tgVar, Object obj) {
        if (obj == null) {
            obj = P(tgVar);
        }
        if (obj == 0) {
            return s;
        }
        if (obj instanceof Integer) {
            return tgVar.m(v, new jq0(((Number) obj).intValue(), tgVar));
        }
        Trace.beginSection("Compose:LaunchedEffect");
        return fs0.a;
    }

    public static final Object S(tg tgVar, Object obj, Object obj2, tq tqVar, ng ngVar) {
        Object R = R(tgVar, obj2);
        try {
            um0 um0Var = new um0(ngVar, tgVar);
            lr0.e(2, tqVar);
            Object invoke = tqVar.invoke(obj, um0Var);
            M(tgVar, R);
            if (invoke == dh.e) {
                ngVar.getClass();
            }
            return invoke;
        } catch (Throwable th) {
            M(tgVar, R);
            throw th;
        }
    }

    public static void T(OutputStream outputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void U(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        T(byteArrayOutputStream, i2, 2);
    }

    public static g6 a(float f2, int i2) {
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return new g6(lw.s, Float.valueOf(0.0f), new h6(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void b(eq eqVar, u20 u20Var, boolean z, tk0 tk0Var, t9 t9Var, x9 x9Var, f90 f90Var, uq uqVar, se seVar, int i2) {
        u20 u20Var2;
        uq uqVar2;
        boolean z2;
        t9 t9Var2;
        x9 x9Var2;
        f90 f90Var2;
        t9 t9Var3;
        x9 x9Var3;
        f90 f90Var3;
        boolean z3;
        t9 t9Var4;
        t9 t9Var5;
        Object obj;
        boolean z4;
        long j2;
        x9 x9Var4;
        boolean z5;
        gr grVar = (gr) seVar;
        grVar.Q(-1310015664);
        int i3 = i2 | (grVar.g(eqVar) ? 4 : 2) | 384 | (grVar.e(tk0Var) ? 2048 : 1024) | 114892800;
        if (grVar.I(i3 & 1, (306783379 & i3) != 306783378)) {
            grVar.N();
            if ((i2 & 1) == 0 || grVar.v()) {
                f90 f90Var4 = u9.a;
                kc kcVar = (kc) grVar.i(mc.a);
                t9 t9Var6 = kcVar.W;
                if (t9Var6 == null) {
                    t9Var3 = new t9(mc.d(kcVar, dx0.e), mc.d(kcVar, dx0.k), gc.b(mc.d(kcVar, dx0.f), dx0.g), gc.b(mc.d(kcVar, dx0.h), dx0.i));
                    kcVar.W = t9Var3;
                } else {
                    t9Var3 = t9Var6;
                }
                x9Var3 = new x9(dx0.j);
                f90Var3 = u9.a;
                z3 = true;
                t9Var4 = t9Var3;
            } else {
                grVar.L();
                z3 = z;
                t9Var4 = t9Var;
                x9Var3 = x9Var;
                f90Var3 = f90Var;
            }
            grVar.p();
            grVar.P(1691738187);
            Object G = grVar.G();
            i2 i2Var = re.a;
            Object obj2 = G;
            if (G == i2Var) {
                b40 b40Var = new b40();
                grVar.Y(b40Var);
                obj2 = b40Var;
            }
            b40 b40Var2 = (b40) obj2;
            grVar.o(false);
            long j3 = z3 ? t9Var4.a : t9Var4.c;
            long j4 = z3 ? t9Var4.b : t9Var4.d;
            g6 g6Var = null;
            boolean z6 = false;
            boolean z7 = false;
            if (x9Var3 == null) {
                grVar.P(1691921830);
                grVar.o(false);
                t9Var5 = t9Var4;
                x9Var4 = x9Var3;
                j2 = j4;
            } else {
                grVar.P(-499611205);
                Object G2 = grVar.G();
                Object obj3 = G2;
                if (G2 == i2Var) {
                    fm0 fm0Var = new fm0();
                    grVar.Y(fm0Var);
                    obj3 = fm0Var;
                }
                fm0 fm0Var2 = (fm0) obj3;
                boolean e2 = grVar.e(b40Var2);
                Object G3 = grVar.G();
                Object obj4 = G3;
                if (e2 || G3 == i2Var) {
                    d dVar = new d(b40Var2, fm0Var2, z6 ? 1 : 0, 3);
                    grVar.Y(dVar);
                    obj4 = dVar;
                }
                d(grVar, (tq) obj4, b40Var2);
                gw gwVar = (gw) ac.f0(fm0Var2);
                float f2 = (z3 && !(gwVar instanceof hd0) && (gwVar instanceof ot)) ? x9Var3.a : 0.0f;
                Object G4 = grVar.G();
                if (G4 == i2Var) {
                    t9Var5 = t9Var4;
                    y5 y5Var = new y5(new ck(f2), lw.u, z7 ? 1 : 0, 12);
                    grVar.Y(y5Var);
                    obj = y5Var;
                } else {
                    t9Var5 = t9Var4;
                    obj = G4;
                }
                y5 y5Var2 = (y5) obj;
                ck ckVar = new ck(f2);
                boolean g2 = grVar.g(y5Var2);
                Object z8 = grVar.z();
                if ((z8 instanceof Float) && f2 == ((Number) z8).floatValue()) {
                    z4 = false;
                } else {
                    grVar.Z(Float.valueOf(f2));
                    z4 = true;
                }
                boolean e3 = g2 | z4 | grVar.e(x9Var3) | grVar.g(gwVar);
                Object G5 = grVar.G();
                if (e3 || G5 == i2Var) {
                    j2 = j4;
                    x9Var4 = x9Var3;
                    w9 w9Var = new w9(y5Var2, f2, z3, x9Var4, gwVar, null);
                    grVar.Y(w9Var);
                    G5 = w9Var;
                } else {
                    x9Var4 = x9Var3;
                    j2 = j4;
                }
                d(grVar, (tq) G5, ckVar);
                g6Var = y5Var2.c;
                grVar.o(false);
            }
            float f3 = g6Var != null ? ((ck) g6Var.f.getValue()).e : 0.0f;
            Object G6 = grVar.G();
            Object obj5 = G6;
            if (G6 == i2Var) {
                l0 l0Var = new l0(9, (byte) 0);
                grVar.Y(l0Var);
                obj5 = l0Var;
            }
            AtomicInteger atomicInteger = rj0.a;
            w6 w6Var = new w6((pq) obj5);
            u20Var2 = u20Var;
            u20 c2 = u20Var2.c(w6Var);
            uqVar2 = uqVar;
            be J = J(-535639973, new aa(j2, f90Var3, uqVar2), grVar);
            ll llVar = bo0.a;
            if (b40Var2 == null) {
                grVar.P(-1701037204);
                Object G7 = grVar.G();
                Object obj6 = G7;
                if (G7 == i2Var) {
                    b40 b40Var3 = new b40();
                    grVar.Y(b40Var3);
                    obj6 = b40Var3;
                }
                b40Var2 = (b40) obj6;
                z5 = false;
            } else {
                z5 = false;
                grVar.P(2023337163);
            }
            grVar.o(z5);
            b40 b40Var4 = b40Var2;
            ll llVar2 = bo0.a;
            float f4 = ((ck) grVar.i(llVar2)).e + 0.0f;
            nh.c(new xd0[]{dg.a.a(new gc(j2)), llVar2.a(new ck(f4))}, J(849208527, new ao0(c2, tk0Var, j3, f4, b40Var4, z3, eqVar, f3, J), grVar), grVar, 56);
            t9Var2 = t9Var5;
            z2 = z3;
            f90Var2 = f90Var3;
            x9Var2 = x9Var4;
        } else {
            u20Var2 = u20Var;
            uqVar2 = uqVar;
            grVar.L();
            z2 = z;
            t9Var2 = t9Var;
            x9Var2 = x9Var;
            f90Var2 = f90Var;
        }
        de0 q2 = grVar.q();
        if (q2 != null) {
            q2.d = new y9(eqVar, u20Var2, z2, tk0Var, t9Var2, x9Var2, f90Var2, uqVar2, i2);
        }
    }

    public static final long c(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void d(se seVar, tq tqVar, Object obj) {
        tg tgVar = ((gr) seVar).O;
        gr grVar = (gr) seVar;
        boolean e2 = grVar.e(obj);
        Object G = grVar.G();
        if (e2 || G == re.a) {
            G = new rx(tgVar, tqVar);
            grVar.Y(G);
        }
    }

    public static ArrayList e(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new f7(objArr, true));
    }

    public static final int f(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final void g(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            z6.f(j2.i("index: ", i2, ", size: ", i3));
        }
    }

    public static final void h(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            z6.f(j2.i("index: ", i2, ", size: ", i3));
        }
    }

    public static final void i(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            z6.l(j2.i("fromIndex: ", i2, " > toIndex: ", i3));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
    }

    public static final void j(kl0 kl0Var, ArrayList arrayList, int i2) {
        boolean j2 = kl0Var.j(i2);
        int[] iArr = kl0Var.b;
        if (j2) {
            arrayList.add(kl0Var.l(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            j(kl0Var, arrayList, i4);
        }
    }

    public static byte[] k(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static final boolean l(uj0 uj0Var) {
        qj0 k2 = uj0Var.k();
        return !k2.e.c(yj0.j);
    }

    public static final yo m(yo yoVar) {
        yo f2 = ((uo) nh.b0(yoVar).getFocusOwner()).f();
        if (f2 == null || !f2.r) {
            return null;
        }
        return f2;
    }

    public static final int n(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int m2 = lw.m(((rw) list.get(i4)).b, i2);
            if (m2 < 0) {
                i3 = i4 + 1;
            } else {
                if (m2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final Object o(nj0 nj0Var, long j2, tq tqVar) {
        while (true) {
            nj0 nj0Var2 = nj0Var;
            while (true) {
                if (nj0Var2.d >= j2 && !nj0Var2.c()) {
                    return nj0Var2;
                }
                Object objectVolatile = p7.a.getObjectVolatile(nj0Var2, pf.a);
                mm mmVar = f;
                if (objectVolatile == mmVar) {
                    return mmVar;
                }
                nj0Var = (nj0) ((pf) objectVolatile);
                if (nj0Var != null) {
                    break;
                }
                nj0 nj0Var3 = (nj0) tqVar.invoke(Long.valueOf(nj0Var2.d + 1), nj0Var2);
                while (true) {
                    Unsafe unsafe = p7.a;
                    long j3 = pf.a;
                    if (unsafe.compareAndSwapObject(nj0Var2, j3, (Object) null, nj0Var3)) {
                        if (nj0Var2.c()) {
                            nj0Var2.d();
                        }
                        nj0Var2 = nj0Var3;
                    } else if (unsafe.getObjectVolatile(nj0Var2, j3) != null) {
                        break;
                    }
                }
            }
        }
    }

    public static final oe0 p(yo yoVar) {
        d60 d60Var;
        if (yoVar.r && (d60Var = yoVar.l) != null) {
            wx s2 = q3.s(d60Var);
            if (!s2.x()) {
                s2 = null;
            }
            if (s2 != null) {
                return yoVar.r0(s2);
            }
        }
        return oe0.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final yo q(yo yoVar) {
        boolean z = yoVar.e.r;
        if (z) {
            if (!z) {
                cv.b("visitChildren called on an unattached node");
            }
            t40 t40Var = new t40(new t20[16]);
            t20 t20Var = yoVar.e;
            t20 t20Var2 = t20Var.j;
            if (t20Var2 == null) {
                nh.e(t40Var, t20Var);
            } else {
                t40Var.b(t20Var2);
            }
            loop0: while (true) {
                int i2 = t40Var.g;
                if (i2 == 0) {
                    break;
                }
                t20 t20Var3 = (t20) t40Var.j(i2 - 1);
                if ((t20Var3.h & 1024) == 0) {
                    nh.e(t40Var, t20Var3);
                } else {
                    while (true) {
                        if (t20Var3 == null) {
                            break;
                        }
                        if ((t20Var3.g & 1024) != 0) {
                            t40 t40Var2 = null;
                            while (t20Var3 != null) {
                                if (t20Var3 instanceof yo) {
                                    yo yoVar2 = (yo) t20Var3;
                                    if (yoVar2.e.r) {
                                        int ordinal = yoVar2.t0().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            break loop0;
                                        }
                                        if (ordinal != 3) {
                                            z6.j();
                                            return null;
                                        }
                                    }
                                } else if ((t20Var3.g & 1024) != 0 && (t20Var3 instanceof oi)) {
                                    int i3 = 0;
                                    for (t20 t20Var4 = ((oi) t20Var3).t; t20Var4 != null; t20Var4 = t20Var4.j) {
                                        if ((t20Var4.g & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                t20Var3 = t20Var4;
                                            } else {
                                                if (t40Var2 == null) {
                                                    t40Var2 = new t40(new t20[16]);
                                                }
                                                if (t20Var3 != null) {
                                                    t40Var2.b(t20Var3);
                                                    t20Var3 = null;
                                                }
                                                t40Var2.b(t20Var4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                t20Var3 = nh.N(t40Var2);
                            }
                        } else {
                            t20Var3 = t20Var3.j;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final boolean r(uj0 uj0Var) {
        Object g2 = uj0Var.d.e.g(yj0.I);
        if (g2 == null) {
            g2 = null;
        }
        qq0 qq0Var = (qq0) g2;
        k40 k40Var = uj0Var.d.e;
        Object g3 = k40Var.g(yj0.x);
        if (g3 == null) {
            g3 = null;
        }
        jg0 jg0Var = (jg0) g3;
        boolean z = qq0Var != null;
        Object g4 = k40Var.g(yj0.H);
        if (((Boolean) (g4 != null ? g4 : null)) == null || (jg0Var != null && jg0Var.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String s(uj0 uj0Var, Resources resources) {
        qj0 qj0Var = uj0Var.d;
        qj0 qj0Var2 = uj0Var.d;
        Object g2 = qj0Var.e.g(yj0.b);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        k40 k40Var = qj0Var2.e;
        Object g3 = k40Var.g(yj0.I);
        if (g3 == null) {
            g3 = null;
        }
        qq0 qq0Var = (qq0) g3;
        Object g4 = k40Var.g(yj0.x);
        if (g4 == null) {
            g4 = null;
        }
        jg0 jg0Var = (jg0) g4;
        if (qq0Var != null) {
            int ordinal = qq0Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        z6.j();
                        return null;
                    }
                    if (g2 == null) {
                        g2 = resources.getString(2131230738);
                    }
                } else if (jg0Var != null && jg0Var.a == 2 && g2 == null) {
                    g2 = resources.getString(2131230812);
                }
            } else if (jg0Var != null && jg0Var.a == 2 && g2 == null) {
                g2 = resources.getString(2131230813);
            }
        }
        Object g5 = k40Var.g(yj0.H);
        if (g5 == null) {
            g5 = null;
        }
        Boolean bool = (Boolean) g5;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((jg0Var == null || jg0Var.a != 4) && g2 == null) {
                g2 = booleanValue ? resources.getString(2131230809) : resources.getString(2131230806);
            }
        }
        Object g6 = k40Var.g(yj0.c);
        if (g6 == null) {
            g6 = null;
        }
        td0 td0Var = (td0) g6;
        if (td0Var != null) {
            if (td0Var != td0.b) {
                if (g2 == null) {
                    g2 = resources.getString(2131230817, 0);
                }
            } else if (g2 == null) {
                g2 = resources.getString(2131230737);
            }
        }
        ak0 ak0Var = yj0.E;
        if (k40Var.c(ak0Var)) {
            k40 k40Var2 = new uj0(uj0Var.a, true, uj0Var.c, qj0Var2).k().e;
            Object g7 = k40Var2.g(yj0.a);
            if (g7 == null) {
                g7 = null;
            }
            Collection collection = (Collection) g7;
            if (collection == null || collection.isEmpty()) {
                Object g8 = k40Var2.g(yj0.A);
                if (g8 == null) {
                    g8 = null;
                }
                Collection collection2 = (Collection) g8;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g9 = k40Var2.g(ak0Var);
                    if (g9 == null) {
                        g9 = null;
                    }
                    CharSequence charSequence = (CharSequence) g9;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(2131230811);
                    }
                }
            }
            g2 = str;
        }
        return (String) g2;
    }

    public static final p6 t(uj0 uj0Var) {
        Object g2 = uj0Var.d.e.g(yj0.E);
        if (g2 == null) {
            g2 = null;
        }
        p6 p6Var = (p6) g2;
        Object g3 = uj0Var.d.e.g(yj0.A);
        if (g3 == null) {
            g3 = null;
        }
        List list = (List) g3;
        return p6Var == null ? list != null ? (p6) ac.a0(list) : null : p6Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class u(lb lbVar) {
        Class cls = lbVar.a;
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return cls;
    }

    public static int v(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final void w(tg tgVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = xg.a.iterator();
        while (it.hasNext()) {
            try {
                ((wg) it.next()).k(tgVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    lw.h(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            lw.h(th, new hj(tgVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final void x(ay ayVar) {
        nh.a0(ayVar).y();
    }

    public static final boolean y(yo yoVar) {
        iy iyVar;
        d60 d60Var;
        iy iyVar2;
        d60 d60Var2 = yoVar.l;
        return (d60Var2 == null || (iyVar = d60Var2.y) == null || !iyVar.C() || (d60Var = yoVar.l) == null || (iyVar2 = d60Var.y) == null || !iyVar2.B()) ? false : true;
    }

    public static final boolean z(uj0 uj0Var, Resources resources) {
        if (nh.B(uj0Var)) {
            return false;
        }
        qj0 qj0Var = uj0Var.d;
        if (qj0Var.g) {
            return true;
        }
        Object g2 = qj0Var.e.g(yj0.a);
        if (g2 == null) {
            g2 = null;
        }
        List list = (List) g2;
        return !((list != null ? (String) ac.a0(list) : null) == null && t(uj0Var) == null && s(uj0Var, resources) == null && !r(uj0Var)) && A(uj0Var);
    }
}
