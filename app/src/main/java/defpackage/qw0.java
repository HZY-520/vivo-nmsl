package defpackage;

import com.vivo.cnm.lico.Gates;
import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class qw0 implements cz {
    public final /* synthetic */ mg e;
    public final /* synthetic */ p5 f;
    public final /* synthetic */ le0 g;
    public final /* synthetic */ ve0 h;

    public qw0(mg mgVar, p5 p5Var, le0 le0Var, ve0 ve0Var) {
        this.e = mgVar;
        this.f = p5Var;
        this.g = le0Var;
        this.h = ve0Var;
    }

    @Override // defpackage.cz
    public final void e(ez ezVar, xy xyVar) {
        boolean z;
        ha haVar = null;
        switch (pw0.a[xyVar.ordinal()]) {
            case 1:
                q3.A(this.e, null, new z5(this.h, this.g, ezVar, this, null, 5), 1);
                return;
            case 2:
                p5 p5Var = this.f;
                if (p5Var != null) {
                    qx qxVar = (qx) p5Var.g;
                    synchronized (qxVar.a) {
                        try {
                            synchronized (qxVar.a) {
                                z = qxVar.d;
                            }
                            if (!z) {
                                ArrayList arrayList = qxVar.b;
                                qxVar.b = qxVar.c;
                                qxVar.c = arrayList;
                                qxVar.d = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((ng) arrayList.get(i)).resumeWith(fs0.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                le0 le0Var = this.g;
                synchronized (le0Var.c) {
                    if (le0Var.t) {
                        le0Var.t = false;
                        haVar = le0Var.c();
                    }
                }
                if (haVar != null) {
                    ((ja) haVar).resumeWith(fs0.a);
                    return;
                }
                return;
            case 3:
                le0 le0Var2 = this.g;
                synchronized (le0Var2.c) {
                    le0Var2.t = true;
                }
                return;
            case 4:
                this.g.b();
                return;
            case Gates.MAX_WINDOWS /* 5 */:
            case 6:
            case 7:
                return;
            default:
                z6.j();
                return;
        }
    }
}
