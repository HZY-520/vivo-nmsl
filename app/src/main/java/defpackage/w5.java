package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class w5 extends go0 implements pq {
    public g6 e;
    public re0 f;
    public int g;
    public final /* synthetic */ y5 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ uo0 j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(y5 y5Var, Object obj, uo0 uo0Var, long j, ng ngVar) {
        super(1, ngVar);
        this.h = y5Var;
        this.i = obj;
        this.j = uo0Var;
        this.k = j;
    }

    @Override // defpackage.b8
    public final ng create(ng ngVar) {
        return new w5(this.h, this.i, this.j, this.k, ngVar);
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        return ((w5) create((ng) obj)).invokeSuspend(fs0.a);
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        g6 g6Var;
        re0 re0Var;
        uo0 uo0Var = this.j;
        int i = this.g;
        y5 y5Var = this.h;
        try {
            if (i == 0) {
                t30.z(obj);
                y5Var.c.g = (l6) y5Var.a.a.invoke(this.i);
                y5Var.e.setValue(uo0Var.c);
                y5Var.d.setValue(Boolean.TRUE);
                g6 g6Var2 = y5Var.c;
                g6 g6Var3 = new g6(g6Var2.e, g6Var2.f.getValue(), lw.p(g6Var2.g), g6Var2.h, Long.MIN_VALUE, g6Var2.j);
                re0 re0Var2 = new re0();
                long j = this.k;
                v5 v5Var = new v5(y5Var, g6Var3, re0Var2, 0);
                this.e = g6Var3;
                this.f = re0Var2;
                this.g = 1;
                Object c = u10.c(g6Var3, uo0Var, j, v5Var, this);
                dh dhVar = dh.e;
                if (c == dhVar) {
                    return dhVar;
                }
                g6Var = g6Var3;
                re0Var = re0Var2;
            } else {
                if (i != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                re0Var = this.f;
                g6Var = this.e;
                t30.z(obj);
            }
            d6 d6Var = re0Var.e ? d6.e : d6.f;
            g6 g6Var4 = y5Var.c;
            g6Var4.g.d();
            g6Var4.h = Long.MIN_VALUE;
            y5Var.d.setValue(Boolean.FALSE);
            return new p2(2, g6Var, d6Var);
        } catch (CancellationException e) {
            g6 g6Var5 = y5Var.c;
            g6Var5.g.d();
            g6Var5.h = Long.MIN_VALUE;
            y5Var.d.setValue(Boolean.FALSE);
            throw e;
        }
    }
}
