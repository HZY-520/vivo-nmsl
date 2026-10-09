package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class fo implements bo {
    public final /* synthetic */ int e = 1;
    public final Object f;
    public final Object g;
    public final go0 h;

    public fo(bo boVar, tg tgVar) {
        this.f = tgVar;
        this.g = kw.P(tgVar);
        this.h = new d(boVar, null, 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        if (r13 == r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    @Override // defpackage.bo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, ng ngVar) {
        eo eoVar;
        Object obj2;
        int i;
        int i2 = this.e;
        fs0 fs0Var = fs0.a;
        dh dhVar = dh.e;
        go0 go0Var = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i2) {
            case 0:
                if (ngVar instanceof eo) {
                    eoVar = (eo) ngVar;
                    int i3 = eoVar.i;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        eoVar.i = i3 - Integer.MIN_VALUE;
                        obj2 = eoVar.g;
                        i = eoVar.i;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    obj = eoVar.f;
                                    this = eoVar.e;
                                    t30.z(obj2);
                                } else if (i != 3) {
                                    z6.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            }
                            t30.z(obj2);
                            return fs0Var;
                        }
                        t30.z(obj2);
                        if (!((re0) obj4).e) {
                            eoVar.e = this;
                            eoVar.f = obj;
                            eoVar.i = 2;
                            obj2 = ((he0) go0Var).invoke(obj, eoVar);
                            break;
                        } else {
                            eoVar.i = 1;
                            if (((bo) obj3).d(obj, eoVar) != dhVar) {
                                return fs0Var;
                            }
                        }
                        return dhVar;
                        if (!((Boolean) obj2).booleanValue()) {
                            return fs0Var;
                        }
                        ((re0) this.f).e = true;
                        bo boVar = (bo) this.g;
                        eoVar.e = null;
                        eoVar.f = null;
                        eoVar.i = 3;
                        if (boVar.d(obj, eoVar) != dhVar) {
                            return fs0Var;
                        }
                        return dhVar;
                    }
                }
                eoVar = new eo(this, ngVar);
                obj2 = eoVar.g;
                i = eoVar.i;
                if (i == 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
            default:
                Object S = kw.S((tg) obj4, obj, obj3, (d) go0Var, ngVar);
                return S == dhVar ? S : fs0Var;
        }
    }

    public fo(re0 re0Var, bo boVar, he0 he0Var) {
        this.f = re0Var;
        this.g = boVar;
        this.h = he0Var;
    }
}
