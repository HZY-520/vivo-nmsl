package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class zn0 implements tq {
    public final /* synthetic */ u20 e;
    public final /* synthetic */ tk0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ be j;

    public zn0(u20 u20Var, tk0 tk0Var, long j, float f, float f2, be beVar) {
        this.e = u20Var;
        this.f = tk0Var;
        this.g = j;
        this.h = f;
        this.i = f2;
        this.j = beVar;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        se seVar = (se) obj;
        int intValue = ((Number) obj2).intValue();
        gr grVar = (gr) seVar;
        boolean I = grVar.I(intValue & 1, (intValue & 3) != 2);
        fs0 fs0Var = fs0.a;
        if (!I) {
            grVar.L();
            return fs0Var;
        }
        u20 b = bo0.b(this.e, this.f, bo0.c(this.g, this.h, grVar), ((si) grVar.i(kf.h)).o(this.i));
        Object G = grVar.G();
        i2 i2Var = re.a;
        if (G == i2Var) {
            G = new zh0(26);
            grVar.Y(G);
        }
        AtomicInteger atomicInteger = rj0.a;
        u20 c = b.c(new w6((pq) G));
        Object G2 = grVar.G();
        if (G2 == i2Var) {
            G2 = yn0.a;
            grVar.Y(G2);
        }
        rc0 rc0Var = io0.a;
        u20 c2 = c.c(new ho0(fs0Var, null, (PointerInputEventHandler) G2, 6));
        b20 c3 = t8.c(b2.f, true);
        int hashCode = Long.hashCode(grVar.Q);
        xa0 k = grVar.k();
        u20 z = dx0.z(grVar, c2);
        le.c.getClass();
        grVar.R();
        if (grVar.P) {
            grVar.j();
        } else {
            grVar.b0();
        }
        t30.t(grVar, b2.x, c3);
        t30.t(grVar, b2.w, k);
        bd bdVar = b2.y;
        if (grVar.P || !lw.i(grVar.G(), Integer.valueOf(hashCode))) {
            grVar.Y(Integer.valueOf(hashCode));
            grVar.b(bdVar, Integer.valueOf(hashCode));
        }
        t30.t(grVar, b2.v, z);
        this.j.invoke(grVar, 0);
        grVar.o(true);
        return fs0Var;
    }
}
