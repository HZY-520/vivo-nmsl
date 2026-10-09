package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.os.Trace;
import android.text.TextPaint;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class q3 {
    public static final l0 a;
    public static final float[][] b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] d = {95.047f, 100.0f, 108.883f};
    public static final float[][] e = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final be f = new be(-1759434350, false, new bd(4));
    public static final Class[] g = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final lc h = lc.i;
    public static final lc i = lc.j;
    public static final float j = 0.38f;
    public static final float k = 6.0f;
    public static final float l = 1.0f;
    public static final mp m = new mp(2);
    public static final ic0 n = new ic0(3);
    public static final Object o = new Object();

    static {
        byte b2 = 0;
        a = new l0(b2, b2);
    }

    public static wm0 A(ch chVar, tg tgVar, tq tqVar, int i2) {
        if ((i2 & 1) != 0) {
            tgVar = sm.e;
        }
        fh fhVar = (i2 & 2) != 0 ? fh.e : fh.h;
        tg r = nh.r(chVar.e(), tgVar, true);
        fi fiVar = pj.a;
        if (r != fiVar && r.j(b2.D) == null) {
            r = r.g(fiVar);
        }
        wm0 pyVar = fhVar == fh.f ? new py(r, tqVar) : new wm0(r, true);
        pyVar.d0(fhVar, pyVar, tqVar);
        return pyVar;
    }

    public static float B(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static tg C(rg rgVar, sg sgVar) {
        sgVar.getClass();
        return lw.i(rgVar.getKey(), sgVar) ? sm.e : rgVar;
    }

    public static void D(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static final u20 E(u20 u20Var) {
        return u20Var.c(new u60());
    }

    public static tg H(rg rgVar, tg tgVar) {
        tgVar.getClass();
        return tgVar == sm.e ? rgVar : (tg) tgVar.m(new bd(9), rgVar);
    }

    public static final long I(ou ouVar, q80 q80Var, nu nuVar, boolean z) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j2;
        long j3 = ouVar.g;
        if (q80Var != null) {
            int i2 = nuVar.a;
            if (i2 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
            } else if (i2 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (j3 & 4294967295L));
            }
            if (q80Var == q80.f) {
                long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
                floatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j2 = floatToRawIntBits2 << 32;
            } else {
                long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                j2 = floatToRawIntBits3 << 32;
            }
            j3 = j2 | (floatToRawIntBits & 4294967295L);
        }
        long d2 = s60.d(L(ouVar, q80Var, nuVar), j3);
        if (z || !ouVar.i) {
            return d2;
        }
        return 0L;
    }

    public static final void J(float[] fArr, float[] fArr2) {
        float q = q(fArr2, 0, fArr, 0);
        float q2 = q(fArr2, 0, fArr, 1);
        float q3 = q(fArr2, 0, fArr, 2);
        float q4 = q(fArr2, 0, fArr, 3);
        float q5 = q(fArr2, 1, fArr, 0);
        float q6 = q(fArr2, 1, fArr, 1);
        float q7 = q(fArr2, 1, fArr, 2);
        float q8 = q(fArr2, 1, fArr, 3);
        float q9 = q(fArr2, 2, fArr, 0);
        float q10 = q(fArr2, 2, fArr, 1);
        float q11 = q(fArr2, 2, fArr, 2);
        float q12 = q(fArr2, 2, fArr, 3);
        float q13 = q(fArr2, 3, fArr, 0);
        float q14 = q(fArr2, 3, fArr, 1);
        float q15 = q(fArr2, 3, fArr, 2);
        float q16 = q(fArr2, 3, fArr, 3);
        fArr[0] = q;
        fArr[1] = q2;
        fArr[2] = q3;
        fArr[3] = q4;
        fArr[4] = q5;
        fArr[5] = q6;
        fArr[6] = q7;
        fArr[7] = q8;
        fArr[8] = q9;
        fArr[9] = q10;
        fArr[10] = q11;
        fArr[11] = q12;
        fArr[12] = q13;
        fArr[13] = q14;
        fArr[14] = q15;
        fArr[15] = q16;
    }

    public static final void K(float[] fArr, float f2, float f3, float[] fArr2) {
        u10.E(fArr2);
        u10.H(fArr2, f2, f3);
        J(fArr, fArr2);
    }

    public static final long L(ou ouVar, q80 q80Var, nu nuVar) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j2;
        if (q80Var == null) {
            return ouVar.c;
        }
        int i2 = nuVar.a;
        if (i2 == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (ouVar.c >> 32));
        } else {
            if (i2 != 2) {
                return ouVar.c;
            }
            intBitsToFloat = Float.intBitsToFloat((int) (ouVar.c & 4294967295L));
        }
        if (q80Var == q80.f) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j2 = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            j2 = floatToRawIntBits3 << 32;
        }
        return j2 | (4294967295L & floatToRawIntBits);
    }

    public static final void M(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static final be0 N(t3 t3Var, mg mgVar, ym0 ym0Var, Float f2) {
        va.b.getClass();
        ua uaVar = ua.a;
        p2 p2Var = new p2(18, t3Var, sm.e);
        cn0 d2 = nh.d(f2);
        tg tgVar = (tg) p2Var.g;
        ao aoVar = (ao) p2Var.f;
        fh fhVar = ym0Var.equals(el0.a) ? fh.e : fh.h;
        z5 z5Var = new z5(ym0Var, aoVar, d2, f2, null, 3);
        tg r = nh.r(mgVar.e(), tgVar, true);
        fi fiVar = pj.a;
        if (r != fiVar && r.j(b2.D) == null) {
            r = r.g(fiVar);
        }
        q pyVar = fhVar == fh.f ? new py(r, z5Var) : new wm0(r, true);
        pyVar.d0(fhVar, pyVar, z5Var);
        return new be0(d2);
    }

    public static u20 O(my myVar, ti0 ti0Var) {
        return myVar.c(k(r20.a, ot0.b)).c(new ui0(ti0Var, q80.e, ti0Var.e, true)).c(new gj0(ti0Var));
    }

    public static final Object P(tg tgVar, tq tqVar, go0 go0Var) {
        Unsafe unsafe;
        long j2;
        tg context = go0Var.getContext();
        tg g2 = !((Boolean) tgVar.m(new bd(12), Boolean.FALSE)).booleanValue() ? context.g(tgVar) : nh.r(context, tgVar, false);
        r(g2);
        if (g2 == context) {
            ji0 ji0Var = new ji0(go0Var, g2);
            return z20.u(ji0Var, ji0Var, tqVar);
        }
        b2 b2Var = b2.D;
        if (lw.i(g2.j(b2Var), context.j(b2Var))) {
            cs0 cs0Var = new cs0(g2, go0Var);
            tg tgVar2 = cs0Var.g;
            Object R = kw.R(tgVar2, null);
            try {
                return z20.u(cs0Var, cs0Var, tqVar);
            } finally {
                kw.M(tgVar2, R);
            }
        }
        mj mjVar = new mj(go0Var, g2);
        try {
            dx0.C(lr0.x(lr0.h(mjVar, mjVar, tqVar)), fs0.a);
            do {
                unsafe = p7.a;
                j2 = mj.i;
                int intVolatile = unsafe.getIntVolatile(mjVar, j2);
                if (intVolatile != 0) {
                    if (intVolatile != 2) {
                        z6.m("Already suspended");
                        return null;
                    }
                    Object G = dx0.G(mjVar.J());
                    if (G instanceof hd) {
                        throw ((hd) G).a;
                    }
                    return G;
                }
            } while (!unsafe.compareAndSwapInt(mjVar, j2, 0, 1));
            return dh.e;
        } catch (Throwable th) {
            mjVar.resumeWith(new qf0(th));
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa  */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Q(Context context, Executor executor, od0 od0Var, boolean z) {
        boolean z2;
        ?? r7;
        fj[] fjVarArr;
        fj[] fjVarArr2;
        fj[] fjVarArr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        Throwable th;
        Throwable th2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ?? byteArrayOutputStream;
        ej ejVar;
        String str;
        String str2;
        FileInputStream a2;
        boolean z9;
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z10 = readLong == packageInfo.lastUpdateTime;
                            if (z10) {
                                od0Var.f(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        sd0.c(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = nh.j;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            ej ejVar2 = new ej(assets, executor, od0Var, name, file2);
            byte[] bArr3 = ejVar2.c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        ejVar2.b(4, null);
                    }
                    ejVar2.f = true;
                    try {
                        try {
                            r7 = ejVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e2) {
                            od0Var.f(6, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            fjVarArr2 = ejVar2.g;
                            if (fjVarArr2 != null) {
                            }
                            od0 od0Var2 = ejVar2.b;
                            fjVarArr3 = ejVar2.g;
                            byte[] bArr4 = ejVar2.c;
                            boolean z11 = r7;
                            z11 = r7;
                            if (fjVarArr3 != null) {
                            }
                            bArr = ejVar2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            sd0.c(context, (z6 || !z) ? false : z9);
                        } catch (IOException e3) {
                            od0Var.f(7, e3);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            fjVarArr2 = ejVar2.g;
                            if (fjVarArr2 != null) {
                            }
                            od0 od0Var22 = ejVar2.b;
                            fjVarArr3 = ejVar2.g;
                            byte[] bArr42 = ejVar2.c;
                            boolean z112 = r7;
                            z112 = r7;
                            if (fjVarArr3 != null) {
                            }
                            bArr = ejVar2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            sd0.c(context, (z6 || !z) ? false : z9);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e4) {
                                    od0Var.f(8, e4);
                                    try {
                                        r7.close();
                                    } catch (IOException e5) {
                                        od0Var.f(7, e5);
                                    }
                                    fjVarArr = null;
                                    ejVar2.g = fjVarArr;
                                    fjVarArr2 = ejVar2.g;
                                    if (fjVarArr2 != null) {
                                    }
                                    od0 od0Var222 = ejVar2.b;
                                    fjVarArr3 = ejVar2.g;
                                    byte[] bArr422 = ejVar2.c;
                                    boolean z1122 = r7;
                                    z1122 = r7;
                                    if (fjVarArr3 != null) {
                                    }
                                    bArr = ejVar2.h;
                                    if (bArr != null) {
                                    }
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    sd0.c(context, (z6 || !z) ? false : z9);
                                }
                            } catch (IOException e6) {
                                od0Var.f(7, e6);
                                r7.close();
                                fjVarArr = null;
                                ejVar2.g = fjVarArr;
                                fjVarArr2 = ejVar2.g;
                                if (fjVarArr2 != null) {
                                }
                                od0 od0Var2222 = ejVar2.b;
                                fjVarArr3 = ejVar2.g;
                                byte[] bArr4222 = ejVar2.c;
                                boolean z11222 = r7;
                                z11222 = r7;
                                if (fjVarArr3 != null) {
                                }
                                bArr = ejVar2.h;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                sd0.c(context, (z6 || !z) ? false : z9);
                            }
                            if (!Arrays.equals(bArr2, kw.G(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            fjVarArr = nh.V(r7, kw.G(r7, 4), ejVar2.e);
                            try {
                                r7.close();
                            } catch (IOException e7) {
                                od0Var.f(7, e7);
                            }
                            ejVar2.g = fjVarArr;
                        }
                        fjVarArr2 = ejVar2.g;
                        if (fjVarArr2 != null && (r7 = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                a2 = ejVar2.a(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e8) {
                                od0Var.f(9, e8);
                                str = r7;
                            } catch (IOException e9) {
                                od0Var.f(7, e9);
                                str = r7;
                            } catch (IllegalStateException e10) {
                                ejVar2.g = null;
                                od0Var.f(8, e10);
                                str = r7;
                            }
                            if (a2 == null) {
                                try {
                                    if (!Arrays.equals(nh.k, kw.G(a2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] G = kw.G(a2, 4);
                                    ejVar2.g = nh.S(a2, G, bArr3, fjVarArr2);
                                    a2.close();
                                    ejVar = ejVar2;
                                    r7 = G;
                                    if (ejVar != null) {
                                        ejVar2 = ejVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (a2 != null) {
                                    a2.close();
                                    str = str2;
                                }
                                ejVar = null;
                                r7 = str;
                                if (ejVar != null) {
                                }
                            }
                        }
                        od0 od0Var22222 = ejVar2.b;
                        fjVarArr3 = ejVar2.g;
                        byte[] bArr42222 = ejVar2.c;
                        boolean z112222 = r7;
                        z112222 = r7;
                        if (fjVarArr3 != null && bArr42222 != null) {
                            z7 = ejVar2.f;
                            if (z7) {
                                z6.m("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr2);
                                    byteArrayOutputStream.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e11) {
                                od0Var22222.f(7, e11);
                                z8 = z7;
                            } catch (IllegalStateException e12) {
                                od0Var22222.f(8, e12);
                                z8 = z7;
                            }
                            if (nh.k0(byteArrayOutputStream, bArr42222, fjVarArr3)) {
                                ejVar2.h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                z8 = byteArrayOutputStream;
                                ejVar2.g = null;
                                z112222 = z8;
                            } else {
                                od0Var22222.f(5, null);
                                ejVar2.g = null;
                                byteArrayOutputStream.close();
                                z112222 = byteArrayOutputStream;
                            }
                        }
                        bArr = ejVar2.h;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!ejVar2.f) {
                                    z6.m("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(ejVar2.d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z5 = true;
                                                                                ejVar2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                ejVar2.h = null;
                                                                                ejVar2.g = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e13) {
                                        e = e13;
                                        z112222 = true;
                                        ejVar2.b(6, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        sd0.c(context, (z6 || !z) ? false : z9);
                                    } catch (IOException e14) {
                                        e = e14;
                                        z112222 = true;
                                        ejVar2.b(7, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        sd0.c(context, (z6 || !z) ? false : z9);
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    ejVar2.b(6, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    sd0.c(context, (z6 || !z) ? false : z9);
                                } catch (IOException e16) {
                                    e = e16;
                                    ejVar2.b(7, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    sd0.c(context, (z6 || !z) ? false : z9);
                                }
                            } finally {
                                ejVar2.h = null;
                                ejVar2.g = null;
                            }
                        }
                        if (z4) {
                            D(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z9 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            ejVar2.b(4, null);
                        }
                        ejVar2.f = true;
                        r7 = ejVar2.a(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        fjVarArr2 = ejVar2.g;
                        if (fjVarArr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            a2 = ejVar2.a(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (a2 == null) {
                            }
                        }
                        od0 od0Var222222 = ejVar2.b;
                        fjVarArr3 = ejVar2.g;
                        byte[] bArr422222 = ejVar2.c;
                        boolean z1122222 = r7;
                        z1122222 = r7;
                        if (fjVarArr3 != null) {
                            z7 = ejVar2.f;
                            if (z7) {
                            }
                        }
                        bArr = ejVar2.h;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        ejVar2.b(4, null);
                    }
                }
                sd0.c(context, (z6 || !z) ? false : z9);
            }
            ejVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z9 = z2;
            sd0.c(context, (z6 || !z) ? false : z9);
        } catch (PackageManager.NameNotFoundException e17) {
            od0Var.f(7, e17);
            sd0.c(context, false);
        }
    }

    public static float R() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final u20 u20Var, final zp0 zp0Var, final int i2, final boolean z, final int i3, final int i4, se seVar, final int i5) {
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        boolean z4;
        int length;
        gr grVar = (gr) seVar;
        grVar.Q(-1040751001);
        if ((i5 & 6) == 0) {
            i6 = (grVar.e(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= grVar.e(u20Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= grVar.e(zp0Var) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= grVar.g(null) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 = i2;
            i6 |= grVar.c(i7) ? 16384 : 8192;
        } else {
            i7 = i2;
        }
        if ((196608 & i5) == 0) {
            z2 = z;
            i6 |= grVar.f(z2) ? 131072 : 65536;
        } else {
            z2 = z;
        }
        if ((1572864 & i5) == 0) {
            i6 |= grVar.c(i3) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i6 |= grVar.c(i4) ? 8388608 : 4194304;
        }
        int i8 = i6 | 100663296;
        if ((805306368 & i5) == 0) {
            i8 |= (1073741824 & i5) == 0 ? grVar.e(null) : grVar.g(null) ? 536870912 : 268435456;
        }
        if (grVar.I(i8 & 1, (306783379 & i8) != 306783378)) {
            if (i4 <= 0 || i3 <= 0) {
                fv.a("both minLines " + i4 + " and maxLines " + i3 + " must be greater than zero");
            }
            if (i4 > i3) {
                fv.a("minLines " + i4 + " must be less than or equal to maxLines " + i3);
            }
            if (grVar.i(oj0.a) != null) {
                z6.c();
                return;
            }
            grVar.P(357055103);
            grVar.o(false);
            final gp gpVar = (gp) grVar.i(kf.k);
            Executor executor = (Executor) grVar.i(g8.a);
            if (executor != null && (length = str.length()) >= 8 && length < 1000) {
                Boolean bool = g8.b;
                if (bool == null) {
                    bool = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                    g8.b = bool;
                }
                if (bool.booleanValue()) {
                    grVar.P(-1250263182);
                    final xx xxVar = (xx) grVar.i(kf.n);
                    final si siVar = (si) grVar.i(kf.h);
                    try {
                        z3 = false;
                        z4 = true;
                        final boolean z5 = z2;
                        try {
                            executor.execute(new Runnable() { // from class: f8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    o40 C;
                                    zp0 zp0Var2 = zp0.this;
                                    xx xxVar2 = xxVar;
                                    String str2 = str;
                                    si siVar2 = siVar;
                                    gp gpVar2 = gpVar;
                                    boolean z6 = z5;
                                    Trace.beginSection("BackgroundTextMeasurement");
                                    try {
                                        ql0 h2 = xl0.h();
                                        o40 o40Var = h2 instanceof o40 ? (o40) h2 : null;
                                        if (o40Var == null || (C = o40Var.C(null, null)) == null) {
                                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                        }
                                        try {
                                            ql0 j2 = C.j();
                                            try {
                                                zp0 s = t30.s(zp0Var2, xxVar2);
                                                um umVar = um.e;
                                                b5 b5Var = new b5(str2, s, umVar, umVar, gpVar2, siVar2, z6);
                                                b5Var.c();
                                                b5Var.a();
                                                C.w().c();
                                                Trace.endSection();
                                            } finally {
                                                ql0.q(j2);
                                            }
                                        } finally {
                                        }
                                    } catch (Throwable th) {
                                        Trace.endSection();
                                        throw th;
                                    }
                                }
                            });
                        } catch (RejectedExecutionException unused) {
                        }
                    } catch (RejectedExecutionException unused2) {
                        z3 = false;
                        z4 = true;
                    }
                    grVar.o(z3);
                    grVar.P(358076243);
                    grVar.o(z3);
                    boolean z6 = z4;
                    u20 c2 = u20Var.c(new vp0(str, zp0Var, gpVar, i7, z, i3, i4));
                    s8 s8Var = s8.c;
                    int hashCode = Long.hashCode(grVar.Q);
                    u20 z7 = dx0.z(grVar, c2);
                    xa0 k2 = grVar.k();
                    le.c.getClass();
                    grVar.R();
                    if (grVar.P) {
                        grVar.b0();
                    } else {
                        grVar.j();
                    }
                    t30.t(grVar, b2.x, s8Var);
                    t30.t(grVar, b2.w, k2);
                    t30.p(grVar);
                    t30.t(grVar, b2.v, z7);
                    t30.t(grVar, b2.y, Integer.valueOf(hashCode));
                    grVar.o(z6);
                }
            }
            z3 = false;
            z4 = true;
            grVar.P(-1248455541);
            grVar.o(false);
            grVar.P(358076243);
            grVar.o(z3);
            boolean z62 = z4;
            u20 c22 = u20Var.c(new vp0(str, zp0Var, gpVar, i7, z, i3, i4));
            s8 s8Var2 = s8.c;
            int hashCode2 = Long.hashCode(grVar.Q);
            u20 z72 = dx0.z(grVar, c22);
            xa0 k22 = grVar.k();
            le.c.getClass();
            grVar.R();
            if (grVar.P) {
            }
            t30.t(grVar, b2.x, s8Var2);
            t30.t(grVar, b2.w, k22);
            t30.p(grVar);
            t30.t(grVar, b2.v, z72);
            t30.t(grVar, b2.y, Integer.valueOf(hashCode2));
            grVar.o(z62);
        } else {
            grVar.L();
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new tq() { // from class: e8
                @Override // defpackage.tq
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q3.a(str, u20Var, zp0Var, i2, z, i3, i4, (se) obj, v10.q(i5 | 1));
                    return fs0.a;
                }
            };
        }
    }

    public static final void b(i1 i1Var, uj0 uj0Var) {
        if (kw.l(uj0Var)) {
            Object g2 = uj0Var.d.e.g(pj0.h);
            if (g2 == null) {
                g2 = null;
            }
            p0 p0Var = (p0) g2;
            if (p0Var != null) {
                i1Var.a(new d1(null, R.id.accessibilityActionSetProgress, p0Var.a, null));
            }
        }
    }

    public static final er c(er erVar) {
        if (erVar == null) {
            erVar = null;
        }
        if (erVar != null) {
            return erVar;
        }
        ue.b("Inconsistent composition");
        throw new id();
    }

    public static final oe0 d(wx wxVar) {
        wx f2 = wxVar.f();
        return f2 != null ? f2.A(wxVar, true) : new oe0(0.0f, 0.0f, (int) (wxVar.B() >> 32), (int) (wxVar.B() & 4294967295L));
    }

    public static final oe0 e(wx wxVar, boolean z) {
        wx s = s(wxVar);
        float B = (int) (s.B() >> 32);
        float B2 = (int) (s.B() & 4294967295L);
        oe0 A = s.A(wxVar, z);
        float f2 = A.a;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > B) {
                f2 = B;
            }
        }
        float f3 = A.b;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > B2) {
                f3 = B2;
            }
        }
        float f4 = A.c;
        if (z) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 <= B) {
                B = f4;
            }
            f4 = B;
        }
        float f5 = A.d;
        if (z) {
            float f6 = f5 >= 0.0f ? f5 : 0.0f;
            if (f6 <= B2) {
                B2 = f6;
            }
            f5 = B2;
        }
        if (f2 == f4 || f3 == f5) {
            return oe0.e;
        }
        long d2 = s.d((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long d3 = s.d((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long d4 = s.d((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
        long d5 = s.d((Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d3 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (d5 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (d4 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (d3 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (d5 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (d4 & 4294967295L));
        return new oe0(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final boolean f(Object obj) {
        if (obj instanceof bm0) {
            bm0 bm0Var = (bm0) obj;
            if (bm0Var.d() == b2.R || bm0Var.d() == b2.W || bm0Var.d() == b2.U) {
                Object value = bm0Var.getValue();
                if (value == null) {
                    return true;
                }
                return f(value);
            }
        } else if (!(obj instanceof br) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (g[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(ou ouVar) {
        return !ouVar.h && ouVar.d;
    }

    public static final boolean h(ou ouVar) {
        return ouVar.h && !ouVar.d;
    }

    public static final void i(int i2) {
        if (i2 >= 1) {
            return;
        }
        z6.d(j2.g("Expected positive parallelism level, but got ", i2));
    }

    public static void j(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            z6.l(j2.i("fromIndex: ", i2, " > toIndex: ", i3));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
    }

    public static final u20 k(u20 u20Var, tk0 tk0Var) {
        return lw.v(u20Var, 0.0f, 0L, tk0Var, true, 0L, 0L, 1042431);
    }

    public static final Object l(qm0 qm0Var, int i2) {
        Object obj;
        qm0Var.getClass();
        int j2 = lw.j(qm0Var.e, qm0Var.g, i2);
        if (j2 < 0 || (obj = qm0Var.f[j2]) == o) {
            return null;
        }
        return obj;
    }

    public static int m(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final boolean n(hk hkVar, long j2) {
        if (!hkVar.e.r) {
            return false;
        }
        iv ivVar = nh.a0(hkVar).H.c;
        if (!ivVar.e0.r) {
            return false;
        }
        long K0 = ivVar.K0(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (K0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (K0 & 4294967295L));
        long j3 = hkVar.u;
        float f2 = ((int) (j3 >> 32)) + intBitsToFloat;
        float f3 = ((int) (j3 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f2) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object o(df dfVar, vd0 vd0Var) {
        if (!((t20) dfVar).e.r) {
            cv.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        xa0 xa0Var = (xa0) nh.a0(dfVar).D;
        xa0Var.getClass();
        return kw.F(xa0Var, vd0Var);
    }

    public static final Object p(long j2, og ogVar) {
        if (j2 > 0) {
            ja jaVar = new ja(1, lr0.x(ogVar));
            jaVar.r();
            if (j2 < Long.MAX_VALUE) {
                v(jaVar.i).c(j2, jaVar);
            }
            Object p = jaVar.p();
            if (p == dh.e) {
                return p;
            }
        }
        return fs0.a;
    }

    public static final float q(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final void r(tg tgVar) {
        ww wwVar = (ww) tgVar.j(b2.N);
        if (wwVar != null && !wwVar.a()) {
            throw wwVar.l();
        }
    }

    public static final wx s(wx wxVar) {
        wx wxVar2;
        wx f2 = wxVar.f();
        while (true) {
            wx wxVar3 = f2;
            wxVar2 = wxVar;
            wxVar = wxVar3;
            if (wxVar == null) {
                break;
            }
            f2 = wxVar.f();
        }
        d60 d60Var = wxVar2 instanceof d60 ? (d60) wxVar2 : null;
        if (d60Var == null) {
            return wxVar2;
        }
        d60 d60Var2 = d60Var.A;
        while (true) {
            d60 d60Var3 = d60Var2;
            d60 d60Var4 = d60Var;
            d60Var = d60Var3;
            if (d60Var == null) {
                return d60Var4;
            }
            d60Var2 = d60Var.A;
        }
    }

    public static rg t(rg rgVar, sg sgVar) {
        sgVar.getClass();
        if (lw.i(rgVar.getKey(), sgVar)) {
            return rgVar;
        }
        return null;
    }

    public static qa u(kc kcVar) {
        qa qaVar = kcVar.X;
        if (qaVar != null) {
            return qaVar;
        }
        lc lcVar = h;
        qa qaVar2 = new qa(mc.d(kcVar, lcVar), mc.a(kcVar, mc.d(kcVar, lcVar)), lw.o(gc.b(mc.d(kcVar, i), j), mc.d(kcVar, lcVar)), gc.b(mc.a(kcVar, mc.d(kcVar, lcVar)), 0.38f));
        kcVar.X = qaVar2;
        return qaVar2;
    }

    public static final mi v(tg tgVar) {
        rg j2 = tgVar.j(b2.D);
        mi miVar = j2 instanceof mi ? (mi) j2 : null;
        return miVar == null ? uh.a : miVar;
    }

    public static final ww w(tg tgVar) {
        ww wwVar = (ww) tgVar.j(b2.N);
        if (wwVar != null) {
            return wwVar;
        }
        z6.e(tgVar, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static int x(float f2) {
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

    public static final tj y(ww wwVar, boolean z, zw zwVar) {
        if (wwVar instanceof cx) {
            return ((cx) wwVar).N(z, zwVar);
        }
        return wwVar.t(zwVar.m(), z, new e(1, zwVar, zw.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 1));
    }

    public static final boolean z(tg tgVar) {
        ww wwVar = (ww) tgVar.j(b2.N);
        if (wwVar != null) {
            return wwVar.a();
        }
        return true;
    }

    public abstract void F(Throwable th);

    public abstract void G(l20 l20Var);
}
