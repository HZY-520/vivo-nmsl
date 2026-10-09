package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ya implements bo {
    public final /* synthetic */ int e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ya(Serializable serializable, Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = serializable;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    @Override // defpackage.bo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, ng ngVar) {
        xa xaVar;
        int i;
        int i2 = this.e;
        fs0 fs0Var = fs0.a;
        int i3 = 1;
        Serializable serializable = this.f;
        int i4 = 0;
        switch (i2) {
            case 0:
                if (ngVar instanceof xa) {
                    xaVar = (xa) ngVar;
                    int i5 = xaVar.i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        xaVar.i = i5 - Integer.MIN_VALUE;
                        Object obj2 = xaVar.g;
                        i = xaVar.i;
                        if (i != 0) {
                            t30.z(obj2);
                            ww wwVar = (ww) ((ve0) serializable).e;
                            if (wwVar != null) {
                                wwVar.b(new eb("Child of the scoped flow was cancelled", i4));
                                xaVar.e = this;
                                xaVar.f = obj;
                                xaVar.i = 1;
                                Object s = wwVar.s(xaVar);
                                dh dhVar = dh.e;
                                if (s == dhVar) {
                                    break;
                                }
                            }
                        } else if (i != 1) {
                            z6.m("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            obj = xaVar.f;
                            this = xaVar.e;
                            t30.z(obj2);
                        }
                        ((ve0) this.f).e = q3.A((ch) this.g, null, new wa((za) this.h, (bo) this.i, obj, null), 1);
                        break;
                    }
                }
                xaVar = new xa(this, ngVar);
                Object obj22 = xaVar.g;
                i = xaVar.i;
                if (i != 0) {
                }
                ((ve0) this.f).e = q3.A((ch) this.g, null, new wa((za) this.h, (bo) this.i, obj, null), 1);
            default:
                gw gwVar = (gw) obj;
                te0 te0Var = (te0) this.h;
                te0 te0Var2 = (te0) this.g;
                te0 te0Var3 = (te0) serializable;
                if (gwVar instanceof hd0) {
                    te0Var3.e++;
                } else if (gwVar instanceof id0) {
                    te0Var3.e--;
                } else if (gwVar instanceof gd0) {
                    te0Var3.e--;
                } else if (gwVar instanceof ot) {
                    te0Var2.e++;
                } else if (gwVar instanceof pt) {
                    te0Var2.e--;
                } else if (gwVar instanceof mo) {
                    te0Var.e++;
                } else if (gwVar instanceof no) {
                    te0Var.e--;
                }
                boolean z = te0Var3.e > 0;
                boolean z2 = te0Var2.e > 0;
                boolean z3 = te0Var.e > 0;
                rh rhVar = (rh) this.i;
                if (rhVar.t != z) {
                    rhVar.t = z;
                    i4 = 1;
                }
                if (rhVar.u != z2) {
                    rhVar.u = z2;
                    i4 = 1;
                }
                if (rhVar.v != z3) {
                    rhVar.v = z3;
                } else {
                    i3 = i4;
                }
                if (i3 != 0) {
                    lw.x(rhVar);
                    break;
                }
                break;
        }
        return fs0Var;
    }
}
