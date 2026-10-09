package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class en0 extends go0 implements tq {
    public int e;
    public final /* synthetic */ r4 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ f6 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en0(r4 r4Var, float f, f6 f6Var, ng ngVar) {
        super(2, ngVar);
        this.f = r4Var;
        this.g = f;
        this.h = f6Var;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        return new en0(this.f, this.g, this.h, ngVar);
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        return ((en0) create((ch) obj, (ng) obj2)).invokeSuspend(fs0.a);
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            t30.z(obj);
            y5 y5Var = (y5) this.f.c;
            Float f = new Float(this.g);
            this.e = 1;
            Object a = y5.a(y5Var, f, this.h, this);
            dh dhVar = dh.e;
            if (a == dhVar) {
                return dhVar;
            }
        } else {
            if (i != 1) {
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t30.z(obj);
        }
        return fs0.a;
    }
}
