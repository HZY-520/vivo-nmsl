package defpackage;

import com.vivo.cnm.lico.PhoneLayoutHook;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class gf implements tq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ gf(e3 e3Var, i2 i2Var, be beVar, int i) {
        this.e = 0;
        this.f = e3Var;
        this.g = i2Var;
        this.h = beVar;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        Object install$lambda$20$lambda$19$lambda$17;
        int i = this.e;
        fs0 fs0Var = fs0.a;
        int i2 = 1;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                kf.a((e3) obj5, (i2) obj4, (be) obj3, (se) obj, v10.q(1));
                break;
            case 1:
                install$lambda$20$lambda$19$lambda$17 = PhoneLayoutHook.install$lambda$20$lambda$19$lambda$17((String) obj5, (Field) obj4, (Method) obj3, obj, (List) obj2);
                break;
            case 2:
                se0 se0Var = (se0) obj5;
                mj0 mj0Var = (mj0) obj4;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long i3 = mj0Var.i(mj0Var.e(floatValue - se0Var.e));
                mj0 mj0Var2 = ((kj0) obj3).a;
                se0Var.e += mj0Var.e(mj0Var.h(mj0Var2.d(mj0Var2.k, i3, 1)));
                break;
            default:
                yw0 yw0Var = (yw0) obj5;
                pe peVar = (pe) obj4;
                be beVar = (be) obj3;
                se seVar = (se) obj;
                int intValue = ((Integer) obj2).intValue();
                int i4 = 0;
                gr grVar = (gr) seVar;
                if (!grVar.I(intValue & 1, (intValue & 3) != 2)) {
                    grVar.L();
                    break;
                } else {
                    e3 e3Var = yw0Var.e;
                    boolean g = grVar.g(yw0Var);
                    Object G = grVar.G();
                    ng ngVar = null;
                    i2 i2Var = re.a;
                    if (g || G == i2Var) {
                        G = new xw0(yw0Var, ngVar, i4);
                        grVar.Y(G);
                    }
                    kw.d(grVar, (tq) G, e3Var);
                    boolean g2 = grVar.g(yw0Var);
                    Object G2 = grVar.G();
                    if (g2 || G2 == i2Var) {
                        G2 = new xw0(yw0Var, ngVar, i2);
                        grVar.Y(G2);
                    }
                    kw.d(grVar, (tq) G2, e3Var);
                    peVar.a(e3Var, beVar, grVar, 0);
                    break;
                }
        }
        return fs0Var;
    }

    public /* synthetic */ gf(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
