package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class qh extends go0 implements tq {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qh(Object obj, ng ngVar, int i) {
        super(2, ngVar);
        this.e = i;
        this.g = obj;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        int i = 2;
        switch (this.e) {
            case 0:
                return new qh((rh) this.g, ngVar, 0);
            case 1:
                return new qh((bp) this.g, ngVar, 1);
            case 2:
                return new qh((o30) this.g, ngVar, i);
            case 3:
                qh qhVar = new qh(i, ngVar);
                qhVar.g = obj;
                return qhVar;
            default:
                return new qh((ko0) this.g, ngVar, 4);
        }
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        ch chVar = (ch) obj;
        ng ngVar = (ng) obj2;
        switch (i) {
        }
        return ((qh) create(chVar, ngVar)).invokeSuspend(fs0Var);
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        ch chVar;
        int i = this.e;
        int i2 = 2;
        fs0 fs0Var = fs0.a;
        dh dhVar = dh.e;
        ng ngVar = null;
        switch (i) {
            case 0:
                int i3 = this.f;
                if (i3 == 0) {
                    t30.z(obj);
                    te0 te0Var = new te0();
                    te0 te0Var2 = new te0();
                    te0 te0Var3 = new te0();
                    rh rhVar = (rh) this.g;
                    bl0 bl0Var = rhVar.s.a;
                    ya yaVar = new ya(te0Var, te0Var2, te0Var3, rhVar, 1);
                    this.f = 1;
                    bl0.j(bl0Var, yaVar, this);
                    break;
                } else if (i3 != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    t30.z(obj);
                    break;
                }
            case 1:
                int i4 = this.f;
                if (i4 == 0) {
                    t30.z(obj);
                    bp bpVar = (bp) this.g;
                    this.f = 1;
                    if (lr0.f(bpVar, null, this) == dhVar) {
                        break;
                    }
                } else if (i4 != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    t30.z(obj);
                    break;
                }
                break;
            case 2:
                int i5 = this.f;
                if (i5 == 0) {
                    t30.z(obj);
                    o9 o9Var = ((o30) this.g).g;
                    this.f = 1;
                    Object j = t10.j(new d(o9Var, ngVar, 10), this);
                    if (j == dhVar) {
                        break;
                    }
                } else if (i5 != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    t30.z(obj);
                    break;
                }
                break;
            case 3:
                int i6 = this.f;
                if (i6 == 0) {
                    t30.z(obj);
                    chVar = (ch) this.g;
                } else if (i6 != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    chVar = (ch) this.g;
                    t30.z(obj);
                }
                while (q3.z(chVar.e())) {
                    a60 a60Var = new a60(i2);
                    this.g = chVar;
                    this.f = 1;
                    if (z20.l(getContext()).c(a60Var, this) == dhVar) {
                        break;
                    }
                }
                break;
            default:
                ko0 ko0Var = (ko0) this.g;
                int i7 = this.f;
                if (i7 == 0) {
                    t30.z(obj);
                    PointerInputEventHandler pointerInputEventHandler = ko0Var.u;
                    this.f = 2;
                    if (pointerInputEventHandler.invoke(ko0Var, this) == dhVar) {
                        break;
                    }
                } else if (i7 != 1 && i7 != 2) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    t30.z(obj);
                    break;
                }
                break;
        }
        return dhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qh(int i, ng ngVar) {
        super(i, ngVar);
        this.e = 3;
    }
}
