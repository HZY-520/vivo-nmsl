package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.vivo.cnm.lico.BuildConfig;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class f5 implements eq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f5(gr grVar, r30 r30Var) {
        this.e = 4;
        this.f = grVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0269  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    @Override // defpackage.eq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        Object obj;
        boolean z = false;
        boolean z2 = true;
        Context context = null;
        context = null;
        switch (this.e) {
            case 0:
                lw.x((g5) this.f);
                return fs0.a;
            case 1:
                return ((j9) ((dx0) this.f)).I;
            case 2:
                pe peVar = (pe) this.f;
                boolean a = ew.a(0L, 0L);
                View view = peVar.a;
                if (!a) {
                    return new yi(0L, lw.f(view.getContext()).n(t10.G(0L)));
                }
                Context context2 = view.getContext();
                Context context3 = context2;
                while (context3 instanceof ContextWrapper) {
                    if ((context3 instanceof Activity) || (context3 instanceof InputMethodService) || (context3 instanceof Application)) {
                        context = context3;
                    } else {
                        ContextWrapper contextWrapper = (ContextWrapper) context3;
                        if (contextWrapper.getBaseContext() != null) {
                            context3 = contextWrapper.getBaseContext();
                        }
                    }
                    if (context != null) {
                        Configuration configuration = context2.getResources().getConfiguration();
                        wi f = lw.f(context2);
                        long a2 = dx0.a(configuration.screenWidthDp, configuration.screenHeightDp);
                        long K = f.K(a2);
                        return new yi((((int) Float.intBitsToFloat((int) (K & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (K >> 32))) << 32), a2);
                    }
                    jw0.a.getClass();
                    iw0 iw0Var = iw0.a;
                    kw0 kw0Var = iw0.b;
                    kw0Var.getClass();
                    int i = Build.VERSION.SDK_INT;
                    hw0 f2 = (i >= 34 ? ui.f : i >= 30 ? r8.f : b2.Z).f(context, kw0Var.b);
                    long height = (f2.a().height() & 4294967295L) | (f2.a().width() << 32);
                    return new yi(height, lw.f(context).n(t10.G(height)));
                }
                if (context != null) {
                }
                break;
            case 3:
                ((yo) this.f).q0();
                return fs0.a;
            case 4:
                ((gr) this.f).y(null, null);
                return fs0.a;
            case Gates.MAX_WINDOWS /* 5 */:
                Object systemService = ((View) ((t3) this.f).f).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 6:
                ly lyVar = ((iy) this.f).I;
                lyVar.o.C = true;
                c10 c10Var = lyVar.p;
                if (c10Var != null) {
                    c10Var.w = true;
                }
                return fs0.a;
            case 7:
                i10 i10Var = (i10) ((iz) this.f).a.f;
                if (!i10Var.f) {
                    if (i10Var.g) {
                        ed0.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    i10Var.a();
                    i10Var.g = true;
                }
                return fs0.a;
            case MainActivity.$stable /* 8 */:
                return (ch) ((l20) this.f).h;
            case 9:
                return ((t50) this.f).o0();
            case 10:
                return new c70((d70) this.f);
            case 11:
                qe0 qe0Var = (qe0) this.f;
                qe0Var.i = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    qe0Var.a();
                    Trace.endSection();
                    return fs0.a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 12:
                gh0 gh0Var = (gh0) this.f;
                xh0 xh0Var = gh0Var.e;
                Object obj2 = gh0Var.h;
                if (obj2 != null) {
                    return xh0Var.f(gh0Var, obj2);
                }
                z6.l("Value should be initialized");
                return null;
            case 13:
                vi0 vi0Var = (vi0) this.f;
                j4 j4Var = (j4) q3.o(vi0Var, x80.a);
                vi0Var.C = j4Var;
                vi0Var.D = j4Var != null ? new i4(j4Var.a, j4Var.b, j4Var.c, j4Var.d) : null;
                return fs0.a;
            case 14:
                return (ViewParent) this.f;
            case 15:
                qk0 qk0Var = (qk0) this.f;
                w90 w90Var = qk0Var.g;
                if (((hl0) w90Var.getValue()).a == 9205357640488583168L || hl0.c(((hl0) w90Var.getValue()).a)) {
                    return null;
                }
                j9 j9Var = qk0Var.e;
                long j = ((hl0) w90Var.getValue()).a;
                return j9Var.I;
            case 16:
                hm0 hm0Var = (hm0) this.f;
                while (true) {
                    Object obj3 = hm0Var.g;
                    synchronized (obj3) {
                        try {
                            if (hm0Var.c) {
                                obj = obj3;
                            } else {
                                hm0Var.c = z2;
                                try {
                                    t40 t40Var = hm0Var.f;
                                    Object[] objArr = t40Var.e;
                                    int i2 = t40Var.g;
                                    for (?? r6 = z; r6 < i2; r6++) {
                                        try {
                                            gm0 gm0Var = (gm0) objArr[r6];
                                            l40 l40Var = gm0Var.g;
                                            pq pqVar = gm0Var.a;
                                            Object[] objArr2 = l40Var.b;
                                            long[] jArr = l40Var.a;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                ?? r12 = z;
                                                while (true) {
                                                    long j2 = jArr[r12];
                                                    obj = obj3;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i3 = 8 - ((~(r12 - length)) >>> 31);
                                                        for (?? r15 = z; r15 < i3; r15++) {
                                                            if ((j2 & 255) < 128) {
                                                                try {
                                                                    pqVar.invoke(objArr2[(r12 << 3) + r15]);
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    z = false;
                                                                    hm0Var.c = z;
                                                                    throw th;
                                                                }
                                                            }
                                                            j2 >>= 8;
                                                        }
                                                        if (i3 != 8) {
                                                        }
                                                    }
                                                    if (r12 != length) {
                                                        z = false;
                                                        obj3 = obj;
                                                        r12++;
                                                    }
                                                }
                                            } else {
                                                obj = obj3;
                                            }
                                            l40Var.b();
                                            z = false;
                                            obj3 = obj;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            obj = obj3;
                                        }
                                    }
                                    obj = obj3;
                                    try {
                                        hm0Var.c = z;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj = obj3;
                                }
                            }
                            if (!hm0Var.a()) {
                                return fs0.a;
                            }
                            z2 = true;
                        } catch (Throwable th6) {
                            th = th6;
                            obj = obj3;
                        }
                    }
                }
            case BuildConfig.VERSION_CODE /* 17 */:
                return new BaseInputConnection(((ip0) this.f).a, false);
            case 18:
                yp0 yp0Var = (yp0) this.f;
                yp0Var.C = null;
                p30.i(yp0Var);
                kw.x(yp0Var);
                lw.x(yp0Var);
                return Boolean.TRUE;
            default:
                bt0 bt0Var = (bt0) this.f;
                fs0 fs0Var = fs0.a;
                bt0Var.h.setValue(fs0Var);
                return fs0Var;
        }
    }

    public /* synthetic */ f5(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    public /* synthetic */ f5(dx0 dx0Var, long j) {
        this.e = 1;
        this.f = dx0Var;
    }
}
