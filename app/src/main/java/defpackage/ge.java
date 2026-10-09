package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ge extends go0 implements tq {
    public int e;
    public /* synthetic */ float f;
    public final /* synthetic */ he g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(he heVar, ng ngVar) {
        super(2, ngVar);
        this.g = heVar;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        ge geVar = new ge(this.g, ngVar);
        geVar.f = ((Number) obj).floatValue();
        return geVar;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        return ((ge) create(Float.valueOf(((Number) obj).floatValue()), (ng) obj2)).invokeSuspend(fs0.a);
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            t30.z(obj);
            float f = this.f;
            he heVar = this.g;
            Object g = heVar.a.d.e.g(pj0.e);
            tq tqVar = (tq) (g != null ? g : null);
            if (tqVar == null) {
                throw j2.f("Required value was null.");
            }
            s60 s60Var = new s60((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            this.e = 1;
            obj = tqVar.invoke(s60Var, this);
            dh dhVar = dh.e;
            if (obj == dhVar) {
                return dhVar;
            }
        } else {
            if (i != 1) {
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t30.z(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((s60) obj).a & 4294967295L)));
    }
}
