package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import com.vivo.cnm.lico.BuildConfig;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class l implements pq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l(t3 t3Var, hk hkVar, re0 re0Var) {
        this.e = 10;
        this.f = re0Var;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                return obj == ((m) this.f) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                ya0 ya0Var = (ya0) this.f;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                StringBuilder sb = new StringBuilder(key == ya0Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != ya0Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                jy jyVar = (jy) this.f;
                g2 g2Var = (g2) obj;
                fs0 fs0Var = fs0.a;
                if (g2Var.I() != Integer.MAX_VALUE) {
                    if (g2Var.F().b) {
                        g2Var.q();
                    }
                    for (Map.Entry entry2 : g2Var.F().f.entrySet()) {
                        jyVar.a((c2) entry2.getKey(), ((Number) entry2.getValue()).intValue(), g2Var.i());
                    }
                    d60 d60Var = g2Var.i().A;
                    d60Var.getClass();
                    while (!d60Var.equals(jyVar.a.i())) {
                        for (c2 c2Var : jyVar.b(d60Var).keySet()) {
                            jyVar.a(c2Var, jyVar.c(d60Var, c2Var), d60Var);
                        }
                        d60Var = d60Var.A;
                        d60Var.getClass();
                    }
                }
                return fs0Var;
            case 3:
                return Boolean.valueOf(((yo) obj).w0(((lo) this.f).a));
            case 4:
                u00 u00Var = (u00) obj;
                e3 e3Var = ((a3) this.f).t;
                if (e3Var.getInsetsListener().k.g() > 0) {
                    y30 y30Var = gw0.a;
                    u00Var.e = true;
                    w00 w00Var = u00Var.h;
                    wx b0 = w00Var.b0();
                    if (xv.a(u00Var.f, 9223372034707292159L)) {
                        u00Var.f = kw.N(b0.a(0L));
                        u00Var.g = b0.B();
                    }
                    w00Var.d0().I.b();
                    long B = b0.B();
                    k40 k40Var = e3Var.getInsetsListener().j;
                    int i = (int) (B >> 32);
                    int i2 = (int) (4294967295L & B);
                    for (ew0 ew0Var : gw0.b) {
                        Object g = k40Var.g(ew0Var);
                        g.getClass();
                        uw0 uw0Var = (uw0) g;
                        gw0.a(u00Var, ((fw0) ew0Var).c, uw0Var.h, i, i2);
                        if (((Boolean) uw0Var.b.getValue()).booleanValue()) {
                            gw0.a(u00Var, uw0Var.f, uw0Var.j, i, i2);
                            gw0.a(u00Var, uw0Var.g, uw0Var.k, i, i2);
                        }
                        gw0.a(u00Var, ((fw0) ew0Var).d, uw0Var.i, i, i2);
                    }
                    h40 h40Var = e3Var.getInsetsListener().l;
                    if (h40Var.j()) {
                        fm0 fm0Var = e3Var.getInsetsListener().m;
                        Object[] objArr = h40Var.a;
                        int i3 = h40Var.b;
                        while (r3 < i3) {
                            p40 p40Var = (p40) objArr[r3];
                            jv jvVar = (jv) fm0Var.get(r3);
                            Rect rect = (Rect) p40Var.getValue();
                            u00Var.a(jvVar.b(), rect.left);
                            u00Var.a(jvVar.d(), rect.top);
                            u00Var.a(jvVar.c(), rect.right);
                            u00Var.a(jvVar.a(), rect.bottom);
                            r3++;
                        }
                    }
                }
                return fs0.a;
            case Gates.MAX_WINDOWS /* 5 */:
                return Boolean.valueOf(((vv) this.f).a(((uj0) obj).f));
            case 6:
                return Boolean.valueOf(kw.z((uj0) obj, (Resources) this.f));
            case 7:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f;
                if (((Throwable) obj) != null) {
                    cancellationSignal.cancel();
                }
                return fs0.a;
            case MainActivity.$stable /* 8 */:
                pe peVar = (pe) this.f;
                h5 h5Var = peVar.w;
                if (h5Var != null) {
                    return h5Var;
                }
                h5 h5Var2 = new h5(peVar.a);
                peVar.w = h5Var2;
                return h5Var2;
            case 9:
                cr0 cr0Var = cr0.e;
                t3 t3Var = (t3) this.f;
                hk hkVar = (hk) obj;
                if (!hkVar.e.r) {
                    return cr0.f;
                }
                hk hkVar2 = hkVar.t;
                if (hkVar2 != null) {
                    l lVar = new l(9, t3Var);
                    if (lVar.invoke(hkVar2) == cr0Var) {
                        p30.q(hkVar2, lVar);
                    }
                }
                hkVar.t = null;
                hkVar.s = null;
                return cr0Var;
            case 10:
                re0 re0Var = (re0) this.f;
                hk hkVar3 = (hk) obj;
                if (!hkVar3.r) {
                    return cr0.f;
                }
                if (hkVar3.t != null) {
                    cv.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                hkVar3.t = null;
                re0Var.e = re0Var.e;
                return cr0.e;
            case 11:
                rr rrVar = (rr) obj;
                return Boolean.valueOf(rrVar instanceof cl ? ((Boolean) ((tk) this.f).invoke(rrVar)).booleanValue() : true);
            case 12:
                tr0 tr0Var = (tr0) obj;
                return ((hp) this.f).a(new tr0(null, tr0Var.b, tr0Var.c, tr0Var.d, tr0Var.e)).e;
            case 13:
                o9 o9Var = (o9) this.f;
                fs0 fs0Var2 = fs0.a;
                if (as.b.compareAndSet(false, true)) {
                    o9Var.p(fs0Var2);
                }
                return fs0Var2;
            case 14:
                hs hsVar = (hs) this.f;
                jl jlVar = (jl) obj;
                ma o = jlVar.t().o();
                tq tqVar = hsVar.h;
                if (tqVar != null) {
                    tqVar.invoke(o, (es) jlVar.t().b);
                }
                return fs0.a;
            case 15:
                os osVar = (os) this.f;
                qs0 qs0Var = (qs0) obj;
                osVar.g(qs0Var);
                pq pqVar = osVar.i;
                if (pqVar != null) {
                    pqVar.invoke(qs0Var);
                }
                return fs0.a;
            case 16:
                po0 po0Var = (po0) this.f;
                dr0 dr0Var = (dr0) obj;
                dr0Var.getClass();
                po0Var.s = ((po0) dr0Var).t;
                return Boolean.FALSE;
            case BuildConfig.VERSION_CODE /* 17 */:
                ((d50) this.f).d(null);
                return fs0.a;
            case 18:
                ((h40) this.f).a((s20) obj);
                return Boolean.TRUE;
            case 19:
                ((cf) this.f).t(obj);
                return fs0.a;
            case 20:
                le0 le0Var = (le0) this.f;
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (le0Var.c) {
                    try {
                        ww wwVar = le0Var.d;
                        if (wwVar != null) {
                            cn0 cn0Var = le0Var.u;
                            ge0 ge0Var = ge0.f;
                            cn0Var.getClass();
                            cn0Var.i(null, ge0Var);
                            wwVar.b(cancellationException);
                            le0Var.r = null;
                            wwVar.o(new c(7, le0Var, th));
                        } else {
                            le0Var.e = cancellationException;
                            cn0 cn0Var2 = le0Var.u;
                            ge0 ge0Var2 = ge0.e;
                            cn0Var2.getClass();
                            cn0Var2.i(null, ge0Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return fs0.a;
            case 21:
                ArrayList arrayList = (ArrayList) this.f;
                dc0 dc0Var = (dc0) obj;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    dc0.i(dc0Var, (ec0) arrayList.get(i4), 0, 0);
                }
                return fs0.a;
            case 22:
                ti0 ti0Var = (ti0) this.f;
                float floatValue = ((Float) obj).floatValue();
                t90 t90Var = ti0Var.a;
                float g2 = t90Var.g() + floatValue + ti0Var.g;
                float f = t30.f(g2, 0.0f, ti0Var.f.g());
                r3 = g2 == f ? 1 : 0;
                float g3 = f - t90Var.g();
                int round = Math.round(g3);
                t90Var.h(t90Var.g() + round);
                ti0Var.g = g3 - round;
                if (r3 == 0) {
                    floatValue = g3;
                }
                return Float.valueOf(floatValue);
            case 23:
                mj0 mj0Var = (mj0) this.f;
                return new s60(mj0Var.d(mj0Var.k, ((s60) obj).a, mj0Var.j));
            case 24:
                zj0.a((bk0) obj, ((jg0) this.f).a);
                return fs0.a;
            case 25:
                String str = (String) this.f;
                jx[] jxVarArr = zj0.a;
                ((bk0) obj).a(yj0.a, kw.B(str));
                return fs0.a;
            case 26:
                gl0 gl0Var = (gl0) this.f;
                uf0 uf0Var = (uf0) obj;
                float f2 = gl0Var.s;
                if (uf0Var.f != f2) {
                    uf0Var.e |= 1;
                    uf0Var.f = f2;
                }
                float f3 = gl0Var.t;
                if (uf0Var.g != f3) {
                    uf0Var.e |= 2;
                    uf0Var.g = f3;
                }
                float f4 = gl0Var.u;
                if (uf0Var.h != f4) {
                    uf0Var.e |= 4;
                    uf0Var.h = f4;
                }
                float f5 = gl0Var.v;
                if (uf0Var.i != f5) {
                    uf0Var.e |= 8;
                    uf0Var.i = f5;
                }
                float f6 = gl0Var.w;
                if (uf0Var.j != f6) {
                    uf0Var.e |= 16;
                    uf0Var.j = f6;
                }
                float f7 = gl0Var.x;
                if (uf0Var.k != f7) {
                    uf0Var.e = 32 | uf0Var.e;
                    uf0Var.k = f7;
                }
                float f8 = gl0Var.y;
                if (uf0Var.n != f8) {
                    uf0Var.e |= 256;
                    uf0Var.n = f8;
                }
                float f9 = gl0Var.z;
                if (uf0Var.o != f9) {
                    uf0Var.e |= 512;
                    uf0Var.o = f9;
                }
                float f10 = gl0Var.A;
                if (uf0Var.p != f10) {
                    uf0Var.e |= 1024;
                    uf0Var.p = f10;
                }
                float f11 = gl0Var.B;
                if (uf0Var.q != f11) {
                    uf0Var.e |= 2048;
                    uf0Var.q = f11;
                }
                long j = gl0Var.C;
                long j2 = uf0Var.r;
                int i5 = zq0.b;
                if (j2 != j) {
                    uf0Var.e |= 4096;
                    uf0Var.r = j;
                }
                tk0 tk0Var = gl0Var.D;
                if (!lw.i(uf0Var.s, tk0Var)) {
                    uf0Var.e |= 8192;
                    uf0Var.s = tk0Var;
                }
                boolean z = gl0Var.E;
                if (uf0Var.t != z) {
                    uf0Var.e |= 16384;
                    uf0Var.t = z;
                }
                long j3 = gl0Var.F;
                long j4 = uf0Var.l;
                int i6 = gc.g;
                if (!as0.a(j4, j3)) {
                    uf0Var.e |= 64;
                    uf0Var.l = j3;
                }
                long j5 = gl0Var.G;
                if (!as0.a(uf0Var.m, j5)) {
                    uf0Var.e |= 128;
                    uf0Var.m = j5;
                }
                int i7 = gl0Var.H;
                if (uf0Var.u != i7) {
                    uf0Var.e |= 32768;
                    uf0Var.u = i7;
                }
                int i8 = gl0Var.I;
                if (uf0Var.A != i8) {
                    uf0Var.e |= 524288;
                    uf0Var.A = i8;
                }
                l8 l8Var = gl0Var.J;
                if (!lw.i(uf0Var.z, l8Var)) {
                    uf0Var.e |= 262144;
                    uf0Var.z = l8Var;
                }
                sx sxVar = gl0Var.K;
                if (!lw.i(uf0Var.w, sxVar)) {
                    uf0Var.e |= 1048576;
                    uf0Var.w = sxVar;
                }
                return fs0.a;
            case 27:
                hm0 hm0Var = (hm0) this.f;
                synchronized (hm0Var.g) {
                    gm0 gm0Var = hm0Var.i;
                    gm0Var.getClass();
                    Object obj2 = gm0Var.b;
                    obj2.getClass();
                    int i9 = gm0Var.d;
                    g40 g40Var = gm0Var.c;
                    if (g40Var == null) {
                        g40Var = new g40();
                        gm0Var.c = g40Var;
                        gm0Var.f.l(obj2, g40Var);
                    }
                    gm0Var.b(obj, i9, obj2, g40Var);
                }
                return fs0.a;
            default:
                e6 e6Var = (e6) obj;
                ((gf) this.f).invoke(e6Var.e.getValue(), lw.s.b.invoke(e6Var.f));
                return fs0.a;
        }
    }

    public /* synthetic */ l(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    public /* synthetic */ l(d50 d50Var, c50 c50Var) {
        this.e = 17;
        this.f = d50Var;
    }
}
