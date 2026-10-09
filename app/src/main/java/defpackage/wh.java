package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class wh extends go0 implements tq {
    public se0 e;
    public g6 f;
    public int g;
    public final /* synthetic */ float h;
    public final /* synthetic */ xh i;
    public final /* synthetic */ ij0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(float f, xh xhVar, ij0 ij0Var, ng ngVar) {
        super(2, ngVar);
        this.h = f;
        this.i = xhVar;
        this.j = ij0Var;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        return new wh(this.h, this.i, this.j, ngVar);
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        return ((wh) create((ch) obj, (ng) obj2)).invokeSuspend(fs0.a);
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        float f;
        se0 se0Var;
        g6 g6Var;
        int i = this.g;
        if (i == 0) {
            t30.z(obj);
            f = this.h;
            if (Math.abs(f) > 1.0f) {
                se0 se0Var2 = new se0();
                se0Var2.e = f;
                se0 se0Var3 = new se0();
                g6 a = kw.a(f, 28);
                try {
                    xh xhVar = this.i;
                    t3 t3Var = xhVar.a;
                    vh vhVar = new vh(se0Var3, this.j, se0Var2, xhVar);
                    this.e = se0Var2;
                    this.f = a;
                    this.g = 1;
                    Object c = u10.c(a, new oh(t3Var, lw.s, a.f.getValue(), a.g), Long.MIN_VALUE, vhVar, this);
                    Object obj2 = dh.e;
                    if (c != obj2) {
                        c = fs0.a;
                    }
                    if (c == obj2) {
                        return obj2;
                    }
                    se0Var = se0Var2;
                } catch (CancellationException unused) {
                    se0Var = se0Var2;
                    g6Var = a;
                    se0Var.e = ((Number) g6Var.e.b.invoke(g6Var.g)).floatValue();
                    f = se0Var.e;
                    return new Float(f);
                }
            }
            return new Float(f);
        }
        if (i != 1) {
            z6.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g6Var = this.f;
        se0Var = this.e;
        try {
            t30.z(obj);
        } catch (CancellationException unused2) {
            se0Var.e = ((Number) g6Var.e.b.invoke(g6Var.g)).floatValue();
            f = se0Var.e;
            return new Float(f);
        }
        f = se0Var.e;
        return new Float(f);
    }
}
