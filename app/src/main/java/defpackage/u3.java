package defpackage;

import com.vivo.cnm.lico.PhoneLayoutHook;
import io.github.libxposed.api.XposedModule;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class u3 implements tq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ u3(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        fs0 installTopBottomStatePositionReapply$lambda$38;
        int i = this.e;
        fs0 fs0Var = fs0.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                z3 z3Var = (z3) obj3;
                int intValue = ((Integer) obj).intValue();
                uj0 uj0Var = (uj0) obj2;
                if (!((vj0) obj4).b.b(uj0Var.f)) {
                    z3Var.l(intValue, uj0Var);
                    z3Var.k.p(fs0Var);
                }
                return fs0Var;
            case 1:
                ((Integer) obj2).getClass();
                nh.b((xd0) obj4, (tq) obj3, (se) obj, v10.q(9));
                return fs0Var;
            case 2:
                d60 d60Var = (d60) obj4;
                z50 z50Var = (z50) obj3;
                ma maVar = (ma) obj;
                es esVar = (es) obj2;
                iy iyVar = d60Var.y;
                if (iyVar.C()) {
                    d60Var.T = maVar;
                    d60Var.S = esVar;
                    a90 snapshotObserver = nh.c0(iyVar).getSnapshotObserver();
                    snapshotObserver.a.b(d60Var, d60.Z, z50Var);
                    d60Var.W = false;
                } else {
                    d60Var.W = true;
                }
                return fs0Var;
            case 3:
                installTopBottomStatePositionReapply$lambda$38 = PhoneLayoutHook.installTopBottomStatePositionReapply$lambda$38((ClassLoader) obj4, (Method) obj3, (XposedModule) obj, (Class) obj2);
                return installTopBottomStatePositionReapply$lambda$38;
            default:
                ((Integer) obj2).getClass();
                kp0.a((zp0) obj4, (tq) obj3, (se) obj, v10.q(1));
                return fs0Var;
        }
    }

    public /* synthetic */ u3(Object obj, tq tqVar, int i, int i2) {
        this.e = i2;
        this.f = obj;
        this.g = tqVar;
    }
}
