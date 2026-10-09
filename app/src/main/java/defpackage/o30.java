package defpackage;

import android.view.ViewConfiguration;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class o30 extends k60 {
    public final t3 f;
    public final o9 g;
    public wm0 h;

    public o30(mj0 mj0Var, t3 t3Var, ae aeVar, si siVar) {
        super(mj0Var, aeVar, siVar);
        this.f = t3Var;
        this.g = lw.a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(o30 o30Var, ve0 ve0Var, se0 se0Var, mj0 mj0Var, ve0 ve0Var2, long j, og ogVar) {
        n30 n30Var;
        int i;
        se0 se0Var2;
        mj0 mj0Var2;
        ve0 ve0Var3;
        j30 j30Var;
        boolean z;
        if (ogVar instanceof n30) {
            n30Var = (n30) ogVar;
            int i2 = n30Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n30Var.k = i2 - Integer.MIN_VALUE;
                Object obj = n30Var.j;
                i = n30Var.k;
                ng ngVar = null;
                if (i != 0) {
                    t30.z(obj);
                    if (j < 0) {
                        return Boolean.FALSE;
                    }
                    qh qhVar = new qh(o30Var, ngVar, 2);
                    n30Var.e = o30Var;
                    n30Var.f = ve0Var;
                    n30Var.g = se0Var;
                    n30Var.h = mj0Var;
                    n30Var.i = ve0Var2;
                    n30Var.k = 1;
                    obj = j20.r(j, qhVar, n30Var);
                    dh dhVar = dh.e;
                    if (obj == dhVar) {
                        return dhVar;
                    }
                    se0Var2 = se0Var;
                    mj0Var2 = mj0Var;
                    ve0Var3 = ve0Var2;
                } else {
                    if (i != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ve0 ve0Var4 = n30Var.i;
                    mj0 mj0Var3 = n30Var.h;
                    se0Var2 = n30Var.g;
                    ve0 ve0Var5 = n30Var.f;
                    o30 o30Var2 = n30Var.e;
                    t30.z(obj);
                    ve0Var3 = ve0Var4;
                    mj0Var2 = mj0Var3;
                    ve0Var = ve0Var5;
                    o30Var = o30Var2;
                }
                j30Var = (j30) obj;
                if (j30Var == null) {
                    boolean z2 = ((j30) ve0Var.e).c;
                    long j2 = j30Var.a;
                    ve0Var.e = new j30(j2, j30Var.b, z2);
                    se0Var2.e = mj0Var2.j(mj0Var2.f(j2));
                    ve0Var3.e = kw.a(0.0f, 30);
                    p2 p2Var = o30Var.e;
                    long j3 = j30Var.b;
                    long j4 = j30Var.a;
                    ((ht0) p2Var.f).a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
                    ((ht0) p2Var.g).a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
                    z = !p30.k(se0Var2.e);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        n30Var = new n30(ogVar);
        Object obj2 = n30Var.j;
        i = n30Var.k;
        ng ngVar2 = null;
        if (i != 0) {
        }
        j30Var = (j30) obj2;
        if (j30Var == null) {
        }
        return Boolean.valueOf(z);
    }

    public static j30 g(o9 o9Var) {
        j30 j30Var = null;
        mk0 g = j20.g(new bq(new i30(o9Var, 0), null));
        while (g.hasNext()) {
            j30 j30Var2 = (j30) g.next();
            if (j30Var != null) {
                j30Var2 = j30Var.a(j30Var2);
            }
            j30Var = j30Var2;
        }
        return j30Var;
    }

    public final float c(kj0 kj0Var, float f) {
        mj0 mj0Var = this.a;
        long i = mj0Var.i(mj0Var.e(f));
        mj0 mj0Var2 = kj0Var.a;
        return mj0Var.h(mj0Var.f(mj0Var2.d(mj0Var2.k, i, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0168 A[PHI: r12
      0x0168: PHI (r12v6 java.lang.Object) = (r12v4 java.lang.Object), (r12v7 java.lang.Object) binds: [B:38:0x00fe, B:28:0x0166] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0169 A[PHI: r16
      0x0169: PHI (r16v1 fs0) = (r16v0 fs0), (r16v2 fs0) binds: [B:36:0x00d4, B:28:0x0166] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(mj0 mj0Var, j30 j30Var, float f, float f2, og ogVar) {
        k30 k30Var;
        int i;
        fs0 fs0Var;
        ve0 ve0Var;
        Object obj;
        se0 se0Var;
        float f3;
        mj0 mj0Var2;
        long a;
        if (ogVar instanceof k30) {
            k30Var = (k30) ogVar;
            int i2 = k30Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k30Var.j = i2 - Integer.MIN_VALUE;
                k30 k30Var2 = k30Var;
                Object obj2 = k30Var2.h;
                i = k30Var2.j;
                p2 p2Var = this.e;
                fs0 fs0Var2 = fs0.a;
                Object obj3 = dh.e;
                if (i != 0) {
                    t30.z(obj2);
                    ve0 ve0Var2 = new ve0();
                    ve0Var2.e = j30Var;
                    fs0Var = fs0Var2;
                    long j = j30Var.b;
                    long j2 = j30Var.a;
                    ((ht0) p2Var.f).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
                    ((ht0) p2Var.g).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
                    j30 g = g(this.g);
                    if (g != null) {
                        long j3 = g.b;
                        long j4 = g.a;
                        ((ht0) p2Var.f).a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
                        ((ht0) p2Var.g).a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
                        ve0Var = ve0Var2;
                        ve0Var.e = ((j30) ve0Var.e).a(g);
                    } else {
                        ve0Var = ve0Var2;
                    }
                    se0 se0Var2 = new se0();
                    float h = mj0Var.h(mj0Var.f(((j30) ve0Var.e).a));
                    se0Var2.e = h;
                    if (!p30.k(h)) {
                        ve0 ve0Var3 = new ve0();
                        ve0Var3.e = kw.a(0.0f, 30);
                        obj = obj3;
                        tq m30Var = new m30(se0Var2, ve0Var3, ve0Var, f, this, f2, mj0Var, null);
                        k30Var2.e = mj0Var;
                        k30Var2.f = se0Var2;
                        k30Var2.g = f2;
                        k30Var2.j = 1;
                        if (b(m30Var, k30Var2) != obj) {
                            se0Var = se0Var2;
                            f3 = f2;
                            mj0Var2 = mj0Var;
                        }
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        t30.z(obj2);
                        return fs0Var2;
                    }
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f3 = k30Var2.g;
                se0Var = k30Var2.f;
                mj0Var2 = k30Var2.e;
                t30.z(obj2);
                obj = obj3;
                fs0Var = fs0Var2;
                a = m20.a(((ht0) p2Var.f).b(Float.MAX_VALUE), ((ht0) p2Var.g).b(Float.MAX_VALUE));
                if (a == 0) {
                    float e = mj0Var2.e(Math.signum(se0Var.e)) * Math.min(Math.abs(se0Var.e) / 100.0f, f3) * 1000.0f;
                    if (e == 0.0f) {
                        a = 0;
                    } else {
                        a = mj0Var2.d == q80.f ? m20.a(e, 0.0f) : m20.a(0.0f, e);
                    }
                }
                ft0 ft0Var = new ft0(a);
                k30Var2.e = null;
                k30Var2.f = null;
                k30Var2.j = 2;
                return this.b.invoke(ft0Var, k30Var2) != obj ? obj : fs0Var;
            }
        }
        k30Var = new k30(this, ogVar);
        k30 k30Var22 = k30Var;
        Object obj22 = k30Var22.h;
        i = k30Var22.j;
        p2 p2Var2 = this.e;
        fs0 fs0Var22 = fs0.a;
        Object obj32 = dh.e;
        if (i != 0) {
        }
        a = m20.a(((ht0) p2Var2.f).b(Float.MAX_VALUE), ((ht0) p2Var2.g).b(Float.MAX_VALUE));
        if (a == 0) {
        }
        ft0 ft0Var2 = new ft0(a);
        k30Var22.e = null;
        k30Var22.f = null;
        k30Var22.j = 2;
        if (this.b.invoke(ft0Var2, k30Var22) != obj) {
        }
    }

    public final boolean f(rc0 rc0Var) {
        long j;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.f;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List list = rc0Var.a;
        s60 s60Var = new s60(0L);
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            j = s60Var.a;
            if (i >= size) {
                break;
            }
            s60Var = new s60(s60.e(j, ((vc0) list.get(i)).j));
            i++;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f) & 4294967295L);
        mj0 mj0Var = this.a;
        float j2 = mj0Var.j(mj0Var.f(floatToRawIntBits));
        if (j2 != 0.0f) {
            fj0 fj0Var = mj0Var.a;
            z = j2 > 0.0f ? fj0Var.d() : fj0Var.a();
        }
        if (z) {
            return !(this.g.p(new j30(floatToRawIntBits, ((vc0) ac.Z(rc0Var.a)).b, false)) instanceof bb);
        }
        return this.d;
    }
}
