package defpackage;

import android.content.Context;
import android.graphics.Region;
import android.util.Log;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class t3 implements dm, ru0, tf0, od0, ao, m6, et0 {
    public final /* synthetic */ int e;
    public Object f;

    public t3(int i) {
        this.e = i;
        switch (i) {
            case 6:
                this.f = new km0(lr0.e);
                break;
            case 10:
                this.f = p30.m(Boolean.FALSE);
                break;
            case 11:
                i10 i10Var = new i10();
                this.f = i10Var;
                if (!i10Var.f) {
                    if (i10Var.g) {
                        ed0.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    i10Var.a();
                    i10Var.g = true;
                    break;
                }
                break;
            case 12:
                this.f = new LinkedHashMap(0, 0.75f, true);
                break;
            case 14:
                this.f = new ArrayList(32);
                break;
            case 15:
                this.f = new s00();
                break;
            case 20:
                this.f = new Region();
                break;
            case 28:
                this.f = new e10();
                break;
            default:
                this.f = new t40(new eg[16]);
                break;
        }
    }

    public void A(bw bwVar) {
        ((Region) this.f).set(bwVar.a, bwVar.b, bwVar.c, bwVar.d);
    }

    public void B(float f, float f2) {
        ((v6) this.f).o().e(f, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(bo boVar, ng ngVar) {
        s sVar;
        int i;
        yg0 yg0Var;
        if (ngVar instanceof s) {
            sVar = (s) ngVar;
            int i2 = sVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.h = i2 - Integer.MIN_VALUE;
                Object obj = sVar.f;
                i = sVar.h;
                fs0 fs0Var = fs0.a;
                if (i != 0) {
                    t30.z(obj);
                    yg0 yg0Var2 = new yg0(boVar, sVar.getContext());
                    try {
                        sVar.e = yg0Var2;
                        sVar.h = 1;
                        try {
                            Object invoke = ((tq) this.f).invoke(yg0Var2, sVar);
                            dh dhVar = dh.e;
                            if (invoke != dhVar) {
                                invoke = fs0Var;
                            }
                            if (invoke == dhVar) {
                                return dhVar;
                            }
                            yg0Var = yg0Var2;
                        } catch (Throwable th) {
                            th = th;
                            yg0Var = yg0Var2;
                            yg0Var.releaseIntercepted();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (i != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yg0Var = sVar.e;
                    try {
                        t30.z(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        yg0Var.releaseIntercepted();
                        throw th;
                    }
                }
                yg0Var.releaseIntercepted();
                return fs0Var;
            }
        }
        sVar = new s(this, (og) ngVar);
        Object obj2 = sVar.f;
        i = sVar.h;
        fs0 fs0Var2 = fs0.a;
        if (i != 0) {
        }
        yg0Var.releaseIntercepted();
        return fs0Var2;
    }

    @Override // defpackage.dm
    public void c(q3 q3Var) {
        nf nfVar = new nf("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), nfVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new gm(this, q3Var, threadPoolExecutor, 0));
    }

    @Override // defpackage.od0
    public void d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.et0
    public l6 e(long j, l6 l6Var, l6 l6Var2, l6 l6Var3) {
        return ((l20) this.f).e(j, l6Var, l6Var2, l6Var3);
    }

    @Override // defpackage.od0
    public void f(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case Gates.MAX_WINDOWS /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case MainActivity.$stable /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f).setResultCode(i);
    }

    @Override // defpackage.et0
    public l6 g(long j, l6 l6Var, l6 l6Var2, l6 l6Var3) {
        return ((l20) this.f).g(j, l6Var, l6Var2, l6Var3);
    }

    @Override // defpackage.m6
    public xn get(int i) {
        switch (this.e) {
            case 24:
                return ((yn[]) this.f)[i];
            case 25:
                return (yn) this.f;
            default:
                return (xn) this.f;
        }
    }

    @Override // defpackage.et0
    public l6 h(l6 l6Var, l6 l6Var2, l6 l6Var3) {
        return ((l20) this.f).h(l6Var, l6Var2, l6Var3);
    }

    @Override // defpackage.et0
    public long i(l6 l6Var, l6 l6Var2, l6 l6Var3) {
        return ((l20) this.f).i(l6Var, l6Var2, l6Var3);
    }

    public void j(iy iyVar) {
        if (!iyVar.B()) {
            cv.b("DepthSortedSet.add called on an unattached node");
        }
        ((km0) this.f).add(iyVar);
    }

    public long k(long j) {
        e10 e10Var = (e10) this.f;
        if (ft0.b(j) <= 0.0f || ft0.c(j) <= 0.0f) {
            cv.b("maximumVelocity should be a positive value. You specified=".concat(ft0.f(j)));
        }
        return m20.a(e10Var.a.b(ft0.b(j)), e10Var.b.b(ft0.c(j)));
    }

    public void l(CancellationException cancellationException) {
        t40 t40Var = (t40) this.f;
        int i = t40Var.g;
        ha[] haVarArr = new ha[i];
        for (int i2 = 0; i2 < i; i2++) {
            haVarArr[i2] = ((eg) t40Var.e[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            haVarArr[i3].i(cancellationException);
        }
        if (t40Var.g == 0) {
            return;
        }
        fv.c("uncancelled requests present");
    }

    public void m() {
        ((ArrayList) this.f).add(aa0.c);
    }

    public void n(float f, float f2, float f3, float f4, float f5, float f6) {
        ((ArrayList) this.f).add(new ja0(f, f2, f3, f4, f5, f6));
    }

    public zm0 o() {
        em a = em.a();
        if (a.b() == 1) {
            return new cu(true);
        }
        w90 m = p30.m(Boolean.FALSE);
        ai aiVar = new ai(m, this);
        a.a.writeLock().lock();
        try {
            if (a.c != 1 && a.c != 2) {
                a.b.add(aiVar);
                a.a.writeLock().unlock();
                return m;
            }
            a.d.post(new cm(Arrays.asList(aiVar), a.c, null));
            a.a.writeLock().unlock();
            return m;
        } catch (Throwable th) {
            a.a.writeLock().unlock();
            throw th;
        }
    }

    public void p(float f) {
        ((ArrayList) this.f).add(new ka0(f));
    }

    public void q(float f, float f2, float f3, float f4) {
        v6 v6Var = (v6) this.f;
        ma o = v6Var.o();
        float intBitsToFloat = Float.intBitsToFloat((int) (v6Var.s() >> 32)) - (f3 + f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (v6Var.s() & 4294967295L)) - (f4 + f2);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            bv.a("Width and height must be greater than or equal to zero");
        }
        v6Var.C(floatToRawIntBits);
        o.e(f, f2);
    }

    public long r() {
        qi qiVar = (qi) this.f;
        long j = ((ig0) qiVar.x.f).b;
        if (j != 16) {
            return j;
        }
        dg0 dg0Var = (dg0) q3.o(qiVar, gg0.a);
        if (dg0Var != null) {
            long j2 = dg0Var.a;
            if (j2 != 16) {
                return j2;
            }
        }
        return ((gc) q3.o(qiVar, dg.a)).a;
    }

    public void s(float f, float f2) {
        ((ArrayList) this.f).add(new da0(f, f2));
    }

    public void t(float f, float f2) {
        ((ArrayList) this.f).add(new la0(f, f2));
    }

    public String toString() {
        switch (this.e) {
            case 6:
                return ((km0) this.f).toString();
            default:
                return super.toString();
        }
    }

    public void u(float f, float f2) {
        ((ArrayList) this.f).add(new ea0(f, f2));
    }

    public p2 v(p2 p2Var, e3 e3Var) {
        Object obj;
        long j;
        boolean z;
        long D;
        s00 s00Var = (s00) this.f;
        ArrayList arrayList = (ArrayList) p2Var.f;
        s00 s00Var2 = new s00(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            xc0 xc0Var = (xc0) arrayList.get(i);
            long j2 = xc0Var.a;
            int k = lw.k(s00Var.f, s00Var.h, j2);
            if (k < 0 || (obj = s00Var.g[k]) == kw.h) {
                obj = null;
            }
            wc0 wc0Var = (wc0) obj;
            if (wc0Var == null) {
                j = xc0Var.b;
                D = xc0Var.d;
                z = false;
            } else {
                j = wc0Var.a;
                z = wc0Var.c;
                D = e3Var.D(wc0Var.b);
            }
            long j3 = xc0Var.a;
            int i2 = i;
            ArrayList arrayList2 = arrayList;
            int i3 = size;
            s00Var2.b(j3, new vc0(j3, xc0Var.b, xc0Var.d, xc0Var.e, xc0Var.f, j, D, z, xc0Var.g, xc0Var.i, xc0Var.j, xc0Var.k, xc0Var.l, xc0Var.m));
            boolean z2 = xc0Var.e;
            if (z2) {
                s00Var.b(j2, new wc0(xc0Var.b, xc0Var.c, z2));
            } else {
                s00Var.c(j2);
            }
            i = i2 + 1;
            arrayList = arrayList2;
            size = i3;
        }
        return new p2(8, s00Var2, p2Var);
    }

    public void w(float f, float f2, float f3, float f4) {
        ((ArrayList) this.f).add(new oa0(f, f2, f3, f4));
    }

    public boolean x(iy iyVar) {
        if (!iyVar.B()) {
            cv.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((km0) this.f).remove(iyVar);
    }

    public void y() {
        t40 t40Var = (t40) this.f;
        aw C = t30.C(0, t40Var.g);
        int i = C.e;
        int i2 = C.f;
        if (i <= i2) {
            while (true) {
                ((eg) t40Var.e[i]).b.resumeWith(fs0.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        t40Var.g();
    }

    public void z(float f, float f2, long j) {
        ma o = ((v6) this.f).o();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        o.e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        o.a(f, f2);
        o.e(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    @Override // defpackage.et0
    public void a() {
    }

    public /* synthetic */ t3(int i, boolean z) {
        this.e = i;
    }

    public t3(float f, float f2, l6 l6Var) {
        Object t3Var;
        this.e = 27;
        int i = dt0.a;
        if (l6Var == null && f == 1.0f && f2 == 1500.0f) {
            t3Var = ii.e;
        } else if (l6Var != null) {
            t3Var = new t3(l6Var, f, f2);
        } else {
            t3Var = new t3(f, f2);
        }
        this.f = new l20(t3Var);
    }

    public t3(si siVar) {
        this.e = 22;
        this.f = new tn(rm0.a, siVar);
    }

    public /* synthetic */ t3(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    public t3(View view) {
        this.e = 9;
        this.f = view;
        lr0.B(new f5(5, this));
    }

    public t3(long[] jArr) {
        c40 c40Var;
        this.e = 21;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            c40Var = new c40(copyOf.length);
            int i = c40Var.b;
            if (i >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i;
                    long[] jArr2 = c40Var.a;
                    if (jArr2.length < length) {
                        jArr2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        c40Var.a = jArr2;
                    }
                    int i2 = c40Var.b;
                    if (i != i2) {
                        o7.Q(jArr2, jArr2, copyOf.length + i, i, i2);
                    }
                    o7.Q(copyOf, jArr2, i, 0, copyOf.length);
                    c40Var.b += copyOf.length;
                }
            } else {
                z6.f("");
                throw null;
            }
        } else {
            c40Var = new c40();
        }
        this.f = c40Var;
    }

    public t3(Context context) {
        this.e = 8;
        this.f = context.getApplicationContext();
    }

    public t3(l6 l6Var, float f, float f2) {
        this.e = 24;
        int b = l6Var.b();
        yn[] ynVarArr = new yn[b];
        for (int i = 0; i < b; i++) {
            ynVarArr[i] = new yn(f, f2, l6Var.a(i));
        }
        this.f = ynVarArr;
    }

    public t3(float f, float f2) {
        this.e = 25;
        this.f = new yn(f, f2);
    }
}
