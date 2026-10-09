package defpackage;

import com.vivo.cnm.lico.PhoneLayoutHook;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class y9 implements tq {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ y9(eq eqVar, u20 u20Var, boolean z, tk0 tk0Var, t9 t9Var, x9 x9Var, f90 f90Var, uq uqVar, int i) {
        this.g = eqVar;
        this.h = u20Var;
        this.f = z;
        this.i = tk0Var;
        this.j = t9Var;
        this.k = x9Var;
        this.l = f90Var;
        this.m = uqVar;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        Object install$lambda$20$lambda$19$lambda$11;
        int i = this.e;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.j;
        Object obj7 = this.i;
        Object obj8 = this.h;
        Object obj9 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int q = v10.q(805306417);
                kw.b((eq) obj9, (u20) obj8, this.f, (tk0) obj7, (t9) obj6, (x9) obj5, (f90) obj4, (uq) obj3, (se) obj, q);
                return fs0.a;
            default:
                install$lambda$20$lambda$19$lambda$11 = PhoneLayoutHook.install$lambda$20$lambda$19$lambda$11(this.f, (ClassLoader) obj9, (Field) obj8, (Method) obj7, (Method) obj6, (Method) obj5, (Method) obj4, (Method) obj3, obj, (List) obj2);
                return install$lambda$20$lambda$19$lambda$11;
        }
    }

    public /* synthetic */ y9(boolean z, ClassLoader classLoader, Field field, Method method, Method method2, Method method3, Method method4, Method method5) {
        this.f = z;
        this.g = classLoader;
        this.h = field;
        this.i = method;
        this.j = method2;
        this.k = method3;
        this.l = method4;
        this.m = method5;
    }
}
