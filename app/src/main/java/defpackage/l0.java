package defpackage;

import android.content.Context;
import com.vivo.cnm.lico.BuildConfig;
import com.vivo.cnm.lico.ClassWatch;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class l0 implements pq {
    public final /* synthetic */ int e;

    public /* synthetic */ l0(int i) {
        this.e = 23;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        List watch$lambda$0;
        mt mtVar;
        int Y;
        switch (this.e) {
            case 0:
                return Boolean.valueOf(!false);
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.valueOf(u10.u((uj0) obj));
            case 3:
                return (ip0) obj;
            case 4:
                xa0 xa0Var = (xa0) obj;
                ll llVar = s3.a;
                xa0Var.getClass();
                kw.F(xa0Var, llVar);
                return ((Context) kw.F(xa0Var, s3.b)).getResources();
            case Gates.MAX_WINDOWS /* 5 */:
                return Boolean.valueOf(u10.u((uj0) obj));
            case 6:
                return fs0.a;
            case 7:
                return fs0.a;
            case MainActivity.$stable /* 8 */:
                xa0 xa0Var2 = (xa0) obj;
                ll llVar2 = s3.b;
                xa0Var2.getClass();
                if (((Context) kw.F(xa0Var2, llVar2)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return f9.b;
                }
                d9.a.getClass();
                return c9.c;
            case 9:
                zj0.a((bk0) obj, 0);
                return fs0.a;
            case 10:
                return fs0.a;
            case 11:
                ((dr0) obj).getClass();
                throw new ClassCastException();
            case 12:
                ((dr0) obj).getClass();
                throw new ClassCastException();
            case 13:
                watch$lambda$0 = ClassWatch.watch$lambda$0((String) obj);
                return watch$lambda$0;
            case 14:
                ((Long) obj).getClass();
                return fs0.a;
            case 15:
                le leVar = (le) obj;
                iy iyVar = leVar instanceof iy ? (iy) leVar : null;
                if (iyVar != null && iyVar.P) {
                    cv.b("Apply is called on deactivated node " + leVar);
                }
                return fs0.a;
            case 16:
                return Boolean.valueOf(!(((s20) obj) instanceof qe));
            case BuildConfig.VERSION_CODE /* 17 */:
                rg rgVar = (rg) obj;
                if (rgVar instanceof vg) {
                    return (vg) rgVar;
                }
                return null;
            case 18:
                return Boolean.valueOf(q3.f(obj));
            case 19:
                return fs0.a;
            case 20:
                return obj;
            case 21:
                return fs0.a;
            case 22:
                return fs0.a;
            case 23:
                return Boolean.valueOf(((yo) obj).o0());
            case 24:
                synchronized (xl0.c) {
                    List list = xl0.i;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((pq) list.get(i)).invoke(obj);
                    }
                }
                return fs0.a;
            case 25:
                return fs0.a;
            case 26:
                gc0 gc0Var = (gc0) obj;
                if (gc0Var.p()) {
                    w00 w00Var = gc0Var.f;
                    if (!w00Var.s) {
                        pq c = gc0Var.e.c();
                        gc0Var.e.getClass();
                        if (c == null) {
                            w00Var.l = null;
                            w00Var.m = null;
                            w00Var.k = null;
                            w00Var.o0();
                        } else {
                            w00Var.l = null;
                            w00Var.m = null;
                            w00Var.V(gc0Var, 9223372034707292159L, 0L);
                            w00Var.k = c;
                        }
                    }
                }
                return fs0.a;
            case 27:
                gc0 gc0Var2 = (gc0) obj;
                if (gc0Var2.p() && (mtVar = gc0Var2.g) != null) {
                    w00 w00Var2 = gc0Var2.f;
                    k40 k40Var = w00Var2.v;
                    l40 l40Var = k40Var != null ? (l40) k40Var.g(mtVar) : null;
                    if (l40Var != null) {
                        xg0 xg0Var = w00Var2.u;
                        if (xg0Var != null && (Y = o7.Y(xg0Var.b, mtVar)) >= 0) {
                            mt[] mtVarArr = xg0Var.b;
                            int i2 = Y + 1;
                            o7.R(mtVarArr, mtVarArr, Y, i2, xg0Var.a);
                            mt[] mtVarArr2 = xg0Var.b;
                            int i3 = xg0Var.a;
                            mtVarArr2[i3 - 1] = null;
                            float[] fArr = xg0Var.c;
                            System.arraycopy(fArr, i2, fArr, Y, i3 - i2);
                            byte[] bArr = xg0Var.d;
                            System.arraycopy(bArr, i2, bArr, Y, xg0Var.a - i2);
                            xg0Var.a--;
                        }
                        w00Var2.m0(l40Var);
                        l40Var.b();
                    }
                }
                return fs0.a;
            case 28:
                m90 m90Var = (m90) obj;
                return "[" + m90Var.b + ", " + m90Var.c + ")";
            default:
                f5 f5Var = ((u50) obj).a;
                if (f5Var != null) {
                    f5Var.b();
                }
                return fs0.a;
        }
    }

    public /* synthetic */ l0(int i, byte b) {
        this.e = i;
    }
}
