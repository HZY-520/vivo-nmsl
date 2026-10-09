package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class r4 implements ds {
    public static boolean f = true;
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    @Override // defpackage.ds
    public void a(es esVar) {
        synchronized (this.c) {
            if (!esVar.s) {
                esVar.s = true;
                esVar.b();
            }
        }
    }

    @Override // defpackage.ds
    public es b() {
        gs nsVar;
        gs gsVar;
        es esVar;
        synchronized (this.c) {
            try {
                e3 e3Var = (e3) this.b;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    e3Var.getUniqueDrawingId();
                }
                if (i >= 29) {
                    gsVar = new ls();
                } else {
                    if (f) {
                        try {
                            nsVar = new js((e3) this.b, new pa(), new oa());
                        } catch (Throwable unused) {
                            f = false;
                            nsVar = new ns(c((e3) this.b));
                        }
                    } else {
                        nsVar = new ns(c((e3) this.b));
                    }
                    gsVar = nsVar;
                }
                esVar = new es(gsVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return esVar;
    }

    public gl c(e3 e3Var) {
        bu0 bu0Var = (bu0) this.d;
        if (bu0Var != null) {
            return bu0Var;
        }
        bu0 bu0Var2 = new bu0(e3Var.getContext());
        bu0Var2.setClipChildren(false);
        bu0Var2.setClipToPadding(false);
        bu0Var2.setTag(2131034170, Boolean.TRUE);
        e3Var.addView(bu0Var2, -1);
        this.d = bu0Var2;
        return bu0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int d(p2 p2Var, e3 e3Var, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        ys ysVar = (ys) this.c;
        bt btVar = (bt) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            p2 v = ((t3) this.d).v(p2Var, e3Var);
            s00 s00Var = (s00) v.f;
            int d = s00Var.d();
            for (int i3 = 0; i3 < d; i3++) {
                vc0 vc0Var = (vc0) s00Var.e(i3);
                if (!vc0Var.d && !vc0Var.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int d2 = s00Var.d();
            for (int i4 = 0; i4 < d2; i4++) {
                vc0 vc0Var2 = (vc0) s00Var.e(i4);
                if (objArr != false || t30.c(vc0Var2)) {
                    ((iy) this.b).u(vc0Var2.c, btVar, vc0Var2.i, true);
                    if (!btVar.e.i()) {
                        ysVar.a(vc0Var2.a, btVar, t30.c(vc0Var2));
                        btVar.clear();
                    }
                }
            }
            boolean b = ysVar.b(v, z);
            int d3 = s00Var.d();
            int i5 = 0;
            while (true) {
                if (i5 >= d3) {
                    i = 0;
                    break;
                }
                vc0 vc0Var3 = (vc0) s00Var.e(i5);
                if (!s60.b(t30.o(vc0Var3, true), 0L) && vc0Var3.c()) {
                    i = 1;
                    break;
                }
                i5++;
            }
            int d4 = s00Var.d();
            int i6 = 0;
            while (true) {
                if (i6 >= d4) {
                    i2 = 0;
                    break;
                }
                if (((vc0) s00Var.e(i6)).c()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (b ? 1 : 0) | (i << 1) | (i2 << 2);
            this.a = false;
            return i7;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }
}
