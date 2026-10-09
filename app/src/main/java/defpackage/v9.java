package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class v9 implements bo {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v9(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.bo
    public final Object d(Object obj, ng ngVar) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                gw gwVar = (gw) obj;
                fm0 fm0Var = (fm0) obj2;
                if (!(gwVar instanceof ot)) {
                    if (!(gwVar instanceof pt)) {
                        if (!(gwVar instanceof mo)) {
                            if (!(gwVar instanceof no)) {
                                if (!(gwVar instanceof hd0)) {
                                    if (!(gwVar instanceof id0)) {
                                        if (gwVar instanceof gd0) {
                                            fm0Var.remove(((gd0) gwVar).a);
                                            break;
                                        }
                                    } else {
                                        fm0Var.remove(((id0) gwVar).a);
                                        break;
                                    }
                                } else {
                                    fm0Var.add(gwVar);
                                    break;
                                }
                            } else {
                                fm0Var.remove(((no) gwVar).a);
                                break;
                            }
                        } else {
                            fm0Var.add(gwVar);
                            break;
                        }
                    } else {
                        fm0Var.remove(((pt) gwVar).a);
                        break;
                    }
                } else {
                    fm0Var.add(gwVar);
                    break;
                }
                break;
            default:
                ((b30) obj2).g.g(((Number) obj).floatValue());
                break;
        }
        return fs0Var;
    }
}
