package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class mj0 {
    public fj0 a;
    public i4 b;
    public xh c;
    public q80 d;
    public boolean e;
    public l20 f;
    public final ej0 g;
    public final cj0 h;
    public boolean i;
    public int j = 1;
    public ri0 k = zi0.a;
    public final kj0 l = new kj0(this);
    public final l m = new l(23, this);

    public mj0(fj0 fj0Var, i4 i4Var, xh xhVar, q80 q80Var, boolean z, l20 l20Var, ej0 ej0Var, cj0 cj0Var) {
        this.a = fj0Var;
        this.b = i4Var;
        this.c = xhVar;
        this.d = q80Var;
        this.e = z;
        this.f = l20Var;
        this.g = ej0Var;
        this.h = cj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, og ogVar) {
        hj0 hj0Var;
        int i;
        mj0 mj0Var;
        Throwable th;
        ue0 ue0Var;
        if (ogVar instanceof hj0) {
            hj0Var = (hj0) ogVar;
            int i2 = hj0Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hj0Var.h = i2 - Integer.MIN_VALUE;
                Object obj = hj0Var.f;
                i = hj0Var.h;
                if (i != 0) {
                    t30.z(obj);
                    ue0 ue0Var2 = new ue0();
                    ue0Var2.e = j;
                    this.i = true;
                    try {
                        v40 v40Var = v40.e;
                        mj0Var = this;
                        try {
                            jj0 jj0Var = new jj0(mj0Var, ue0Var2, j, null);
                            hj0Var.e = ue0Var2;
                            hj0Var.h = 1;
                            Object g = mj0Var.g(v40Var, jj0Var, hj0Var);
                            dh dhVar = dh.e;
                            if (g == dhVar) {
                                return dhVar;
                            }
                            ue0Var = ue0Var2;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            mj0Var.i = false;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        mj0Var = this;
                    }
                } else {
                    if (i != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ue0Var = hj0Var.e;
                    try {
                        t30.z(obj);
                        mj0Var = this;
                    } catch (Throwable th4) {
                        th = th4;
                        mj0Var = this;
                        mj0Var.i = false;
                        throw th;
                    }
                }
                mj0Var.i = false;
                return new ft0(ue0Var.e);
            }
        }
        hj0Var = new hj0(this, ogVar);
        Object obj2 = hj0Var.f;
        i = hj0Var.h;
        if (i != 0) {
        }
        mj0Var.i = false;
        return new ft0(ue0Var.e);
    }

    public final boolean b() {
        i4 i4Var;
        return this.a.d() || this.a.a() || ((i4Var = this.b) != null && i4Var.e());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if ((r6 instanceof defpackage.xh) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(long j, boolean z, go0 go0Var) {
        fs0 fs0Var = fs0.a;
        if (z) {
            xh xhVar = this.c;
            wi0 wi0Var = zi0.a;
        }
        long a = ft0.a(j, 0.0f, 0.0f, this.d == q80.f ? 1 : 2);
        lj0 lj0Var = new lj0(this, null);
        i4 i4Var = this.b;
        dh dhVar = dh.e;
        if (i4Var == null || !b()) {
            lj0 lj0Var2 = new lj0(lj0Var.h, go0Var);
            lj0Var2.g = a;
            Object invokeSuspend = lj0Var2.invokeSuspend(fs0Var);
            if (invokeSuspend == dhVar) {
                return invokeSuspend;
            }
        } else {
            Object b = i4Var.b(a, lj0Var, go0Var);
            if (b == dhVar) {
                return b;
            }
        }
        return fs0Var;
    }

    public final long d(ri0 ri0Var, long j, int i) {
        t50 t50Var = (t50) this.f.e;
        t50 p0 = t50Var != null ? t50Var.p0() : null;
        long f = p0 != null ? p0.f(j, i) : 0L;
        long d = s60.d(j, f);
        long f2 = f(i(ri0Var.a(h(f(this.d == q80.f ? s60.a(d, 1) : s60.a(d, 2))))));
        ej0 ej0Var = this.g;
        if (ej0Var.r) {
            ViewTreeObserver viewTreeObserver = nh.b0(ej0Var).getViewTreeObserver();
            try {
                Method method = e3.Q0;
                if (method == null) {
                    method = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    method.setAccessible(true);
                    e3.Q0 = method;
                }
                method.invoke(viewTreeObserver, null);
            } catch (Exception unused) {
            }
        }
        long d2 = s60.d(d, f2);
        t50 t50Var2 = (t50) this.f.e;
        t50 p02 = t50Var2 != null ? t50Var2.p0() : null;
        return s60.e(s60.e(f, f2), p02 != null ? p02.A(i, f2, d2) : 0L);
    }

    public final float e(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long f(long j) {
        return this.e ? s60.f(j, -1.0f) : j;
    }

    public final Object g(v40 v40Var, tq tqVar, og ogVar) {
        Object b = this.a.b(v40Var, new f(this, tqVar, null, 9), ogVar);
        return b == dh.e ? b : fs0.a;
    }

    public final float h(long j) {
        return Float.intBitsToFloat((int) (this.d == q80.f ? j >> 32 : j & 4294967295L));
    }

    public final long i(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == q80.f) {
            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float j(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double atan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        q80 q80Var = this.d;
        if (atan2 >= 0.7853981633974483d) {
            if (q80Var == q80.e) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (q80Var == q80.f) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
