package defpackage;

import android.os.Looper;
import android.view.View;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class c implements pq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        int i;
        boolean z;
        int i2 = 2;
        switch (this.e) {
            case 0:
                ((b40) this.f).b((gd0) this.g);
                return fs0.a;
            case 1:
                ((t40) ((t3) this.f).f).i((eg) this.g);
                return fs0.a;
            case 2:
                ((b40) this.f).b((gw) this.g);
                return fs0.a;
            case 3:
                ((ts) this.f).g.removeCallbacks((ss) this.g);
                return fs0.a;
            case 4:
                v60 v60Var = (v60) this.f;
                ec0 ec0Var = (ec0) this.g;
                dc0 dc0Var = (dc0) obj;
                boolean z2 = v60Var.u;
                float f = v60Var.s;
                if (z2) {
                    dc0.h(dc0Var, ec0Var, dc0Var.D(f), dc0Var.D(v60Var.t));
                } else {
                    dc0.e(dc0Var, ec0Var, dc0Var.D(f), dc0Var.D(v60Var.t));
                }
                return fs0.a;
            case Gates.MAX_WINDOWS /* 5 */:
                d90 d90Var = (d90) this.f;
                ec0 ec0Var2 = (ec0) this.g;
                dc0 dc0Var2 = (dc0) obj;
                boolean z3 = d90Var.w;
                float f2 = d90Var.s;
                if (z3) {
                    dc0.h(dc0Var2, ec0Var2, dc0Var2.D(f2), dc0Var2.D(d90Var.t));
                } else {
                    dc0.e(dc0Var2, ec0Var2, dc0Var2.D(f2), dc0Var2.D(d90Var.t));
                }
                return fs0.a;
            case 6:
                cf cfVar = (cf) this.f;
                l40 l40Var = (l40) this.g;
                cfVar.u(obj);
                if (l40Var != null) {
                    l40Var.a(obj);
                }
                return fs0.a;
            case 7:
                le0 le0Var = (le0) this.f;
                Throwable th = (Throwable) this.g;
                Throwable th2 = (Throwable) obj;
                synchronized (le0Var.c) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                lw.h(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    le0Var.e = th;
                    cn0 cn0Var = le0Var.u;
                    ge0 ge0Var = ge0.e;
                    cn0Var.getClass();
                    cn0Var.i(null, ge0Var);
                }
                return fs0.a;
            case MainActivity.$stable /* 8 */:
                kj0 kj0Var = (kj0) this.f;
                mj0 mj0Var = (mj0) this.g;
                ok okVar = (ok) obj;
                float f3 = okVar.b ? -1.0f : 1.0f;
                long j = okVar.a;
                kj0Var.a(s60.f(mj0Var.d == q80.f ? s60.a(j, 1) : s60.a(j, 2), f3), 1);
                return fs0.a;
            case 9:
                ec0 ec0Var3 = (ec0) this.f;
                l lVar = ((gl0) this.g).L;
                ((dc0) obj).d(ec0Var3);
                ec0Var3.P(xv.c(0L, ec0Var3.i), 0.0f, lVar);
                return fs0.a;
            case 10:
                os0 os0Var = (os0) this.f;
                pq pqVar = (pq) this.g;
                ((Long) obj).getClass();
                float f4 = os0Var.e;
                os0Var.e = 0.0f;
                pqVar.invoke(Float.valueOf(f4));
                return fs0.a;
            default:
                yw0 yw0Var = (yw0) this.f;
                be beVar = (be) this.g;
                pe peVar = (pe) obj;
                if (!yw0Var.g) {
                    ez d = peVar.d();
                    View view = peVar.a;
                    zy lifecycle = d.getLifecycle();
                    yw0Var.i = beVar;
                    if (yw0Var.h == null) {
                        if (lw.i(Looper.myLooper(), view.getHandler().getLooper())) {
                            yw0Var.h = lifecycle;
                            lifecycle.a(yw0Var);
                        } else {
                            view.post(new w3(i2, yw0Var, lifecycle));
                        }
                    } else if (((gz) lifecycle).b.compareTo(yy.g) >= 0) {
                        cf cfVar2 = yw0Var.f;
                        be beVar2 = new be(-1723985096, true, new gf(yw0Var, peVar, beVar, 3));
                        synchronized (cfVar2.h) {
                            i = cfVar2.y;
                            z = i == 1;
                            if (z) {
                                cfVar2.y = 0;
                                i = 0;
                            }
                        }
                        if (i != 0) {
                            dd0.b(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
                        }
                        if (z) {
                            gr grVar = cfVar2.x;
                            grVar.z = 0;
                            grVar.y = true;
                            cfVar2.j(beVar2);
                            if (grVar.F || grVar.z != 0) {
                                dd0.a("Cannot disable reuse from root if it was caused by other groups");
                            }
                            grVar.z = -1;
                            grVar.y = false;
                        } else {
                            cfVar2.j(beVar2);
                        }
                    }
                }
                return fs0.a;
        }
    }
}
