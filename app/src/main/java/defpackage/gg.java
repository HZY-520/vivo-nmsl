package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class gg extends go0 implements tq {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ hg g;
    public final /* synthetic */ os0 h;
    public final /* synthetic */ d9 i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(hg hgVar, os0 os0Var, d9 d9Var, long j, ng ngVar) {
        super(2, ngVar);
        this.g = hgVar;
        this.h = os0Var;
        this.i = d9Var;
        this.j = j;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        gg ggVar = new gg(this.g, this.h, this.i, this.j, ngVar);
        ggVar.f = obj;
        return ggVar;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        return ((gg) create((ch) obj, (ng) obj2)).invokeSuspend(fs0.a);
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        hg hgVar = this.g;
        t3 t3Var = hgVar.w;
        int i = this.e;
        try {
            try {
                if (i == 0) {
                    t30.z(obj);
                    ww w = q3.w(((ch) this.f).e());
                    hgVar.z = true;
                    mj0 mj0Var = hgVar.t;
                    v40 v40Var = v40.e;
                    fg fgVar = new fg(this.h, hgVar, this.i, this.j, w, null);
                    this.e = 1;
                    Object g = mj0Var.g(v40Var, fgVar, this);
                    dh dhVar = dh.e;
                    if (g == dhVar) {
                        return dhVar;
                    }
                } else {
                    if (i != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t30.z(obj);
                }
                t3Var.y();
                hgVar.z = false;
                t3Var.l(null);
                hgVar.x = false;
                return fs0.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            hgVar.z = false;
            t3Var.l(null);
            hgVar.x = false;
            throw th;
        }
    }
}
