package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class g extends go0 implements tq {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ long g;
    public Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, long j, Object obj2, ng ngVar, int i) {
        super(2, ngVar);
        this.e = i;
        this.i = obj;
        this.g = j;
        this.j = obj2;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        int i = this.e;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                return new g((ww) obj3, this.g, (b40) obj2, ngVar, 0);
            default:
                g gVar = new g((mj0) obj3, this.g, (se0) obj2, ngVar, 1);
                gVar.h = obj;
                return gVar;
        }
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        switch (i) {
            case 0:
                return ((g) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            default:
                return ((g) create((kj0) obj, (ng) obj2)).invokeSuspend(fs0Var);
        }
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        id0 id0Var;
        int i = this.e;
        int i2 = 2;
        Object obj2 = this.j;
        long j = this.g;
        dh dhVar = dh.e;
        Object obj3 = this.i;
        fs0 fs0Var = fs0.a;
        switch (i) {
            case 0:
                b40 b40Var = (b40) obj2;
                int i3 = this.f;
                if (i3 == 0) {
                    t30.z(obj);
                    this.f = 1;
                    if (((ww) obj3).s(this) == dhVar) {
                    }
                } else if (i3 == 1) {
                    t30.z(obj);
                } else if (i3 == 2) {
                    id0Var = (id0) this.h;
                    t30.z(obj);
                    this.h = null;
                    this.f = 3;
                    if (b40Var.a(id0Var, this) == dhVar) {
                    }
                } else if (i3 != 3) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    t30.z(obj);
                    break;
                }
                hd0 hd0Var = new hd0(j);
                id0 id0Var2 = new id0(hd0Var);
                this.h = id0Var2;
                this.f = 2;
                if (b40Var.a(hd0Var, this) != dhVar) {
                    id0Var = id0Var2;
                    this.h = null;
                    this.f = 3;
                    if (b40Var.a(id0Var, this) == dhVar) {
                    }
                }
                break;
            default:
                mj0 mj0Var = (mj0) obj3;
                int i4 = this.f;
                if (i4 == 0) {
                    t30.z(obj);
                    kj0 kj0Var = (kj0) this.h;
                    float h = mj0Var.h(j);
                    gf gfVar = new gf((se0) obj2, mj0Var, kj0Var, i2);
                    this.f = 1;
                    tm0 g0 = nh.g0(7);
                    kr0 kr0Var = lw.s;
                    Float f = new Float(0.0f);
                    Float f2 = new Float(h);
                    Float f3 = new Float(0.0f);
                    pq pqVar = kr0Var.a;
                    l6 l6Var = (l6) pqVar.invoke(f3);
                    if (l6Var == null) {
                        l6Var = ((l6) pqVar.invoke(f)).c();
                    }
                    l6 l6Var2 = l6Var;
                    Object c = u10.c(new g6(kr0Var, f, l6Var2, 56), new uo0(g0, kr0Var, f, f2, l6Var2), Long.MIN_VALUE, new l(28, gfVar), this);
                    if (c != dhVar) {
                        c = fs0Var;
                    }
                    if (c != dhVar) {
                        c = fs0Var;
                    }
                    if (c == dhVar) {
                    }
                } else if (i4 != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    t30.z(obj);
                }
                break;
        }
        return fs0Var;
    }
}
