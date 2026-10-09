package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class yj implements bo {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public yj(g5 g5Var, ch chVar) {
        this.f = g5Var;
        this.g = chVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a1  */
    @Override // defpackage.bo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, ng ngVar) {
        xj xjVar;
        int i;
        io ioVar;
        Object obj2;
        int i2;
        int i3 = this.e;
        dh dhVar = dh.e;
        Object obj3 = this.f;
        fs0 fs0Var = fs0.a;
        Object obj4 = this.g;
        ng ngVar2 = null;
        switch (i3) {
            case 0:
                ve0 ve0Var = (ve0) obj3;
                if (ngVar instanceof xj) {
                    xjVar = (xj) ngVar;
                    int i4 = xjVar.g;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        xjVar.g = i4 - Integer.MIN_VALUE;
                        Object obj5 = xjVar.e;
                        i = xjVar.g;
                        if (i != 0) {
                            t30.z(obj5);
                            Object obj6 = ve0Var.e;
                            if (obj6 == dx0.s || !lw.i(obj6, obj)) {
                                ve0Var.e = obj;
                                xjVar.g = 1;
                                if (((bo) obj4).d(obj, xjVar) == dhVar) {
                                    return dhVar;
                                }
                            }
                        } else {
                            if (i != 1) {
                                z6.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            t30.z(obj5);
                        }
                        return fs0Var;
                    }
                }
                xjVar = new xj(this, ngVar);
                Object obj52 = xjVar.e;
                i = xjVar.g;
                if (i != 0) {
                }
                return fs0Var;
            case 1:
                if (ngVar instanceof io) {
                    ioVar = (io) ngVar;
                    int i5 = ioVar.g;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ioVar.g = i5 - Integer.MIN_VALUE;
                        obj2 = ioVar.f;
                        i2 = ioVar.g;
                        if (i2 != 0) {
                            t30.z(obj2);
                            ioVar.e = this;
                            ioVar.i = obj;
                            ioVar.g = 1;
                            obj2 = ((tq) obj4).invoke(obj, ioVar);
                            if (obj2 == dhVar) {
                                return dhVar;
                            }
                        } else {
                            if (i2 != 1) {
                                z6.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = ioVar.i;
                            this = ioVar.e;
                            t30.z(obj2);
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            return fs0Var;
                        }
                        ((ve0) this.f).e = obj;
                        throw new a(this);
                    }
                }
                ioVar = new io(this, ngVar);
                obj2 = ioVar.f;
                i2 = ioVar.g;
                if (i2 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            default:
                gw gwVar = (gw) obj;
                g5 g5Var = (g5) obj3;
                if (!(gwVar instanceof jd0)) {
                    ch chVar = (ch) obj4;
                    r4 r4Var = g5Var.x;
                    float f = 0.0f;
                    if (r4Var == null) {
                        boolean z = g5Var.t;
                        pi piVar = g5Var.w;
                        r4Var = new r4();
                        r4Var.a = z;
                        r4Var.b = piVar;
                        r4Var.c = new y5(Float.valueOf(0.0f), lw.s, Float.valueOf(0.01f), 8);
                        r4Var.d = new ArrayList();
                        lw.x(g5Var);
                        g5Var.x = r4Var;
                    }
                    ArrayList arrayList = (ArrayList) r4Var.d;
                    if (gwVar instanceof ot) {
                        arrayList.add(gwVar);
                    } else if (gwVar instanceof pt) {
                        arrayList.remove(((pt) gwVar).a);
                    } else if (gwVar instanceof mo) {
                        arrayList.add(gwVar);
                    } else if (gwVar instanceof no) {
                        arrayList.remove(((no) gwVar).a);
                    } else if (gwVar instanceof al) {
                        arrayList.add(gwVar);
                    } else if (gwVar instanceof bl) {
                        arrayList.remove(((bl) gwVar).a);
                    } else if (gwVar instanceof zk) {
                        arrayList.remove(((zk) gwVar).a);
                    }
                    gw gwVar2 = (gw) ac.f0(arrayList);
                    if (!lw.i((gw) r4Var.e, gwVar2)) {
                        if (gwVar2 != null) {
                            ((pi) r4Var.b).b();
                            boolean z2 = gwVar2 instanceof ot;
                            if (z2) {
                                f = 0.08f;
                            } else if (gwVar2 instanceof mo) {
                                f = 0.1f;
                            } else if (gwVar2 instanceof al) {
                                f = 0.16f;
                            }
                            jr0 jr0Var = hg0.a;
                            if (!z2) {
                                if (gwVar2 instanceof mo) {
                                    jr0Var = new jr0(45, ol.b);
                                } else if (gwVar2 instanceof al) {
                                    jr0Var = new jr0(45, ol.b);
                                }
                            }
                            q3.A(chVar, null, new en0(r4Var, f, jr0Var, null), 3);
                        } else {
                            gw gwVar3 = (gw) r4Var.e;
                            jr0 jr0Var2 = hg0.a;
                            if (!(gwVar3 instanceof ot) && !(gwVar3 instanceof mo) && (gwVar3 instanceof al)) {
                                jr0Var2 = new jr0(150, ol.b);
                            }
                            q3.A(chVar, null, new d(r4Var, jr0Var2, ngVar2, 13), 3);
                        }
                        r4Var.e = gwVar2;
                    }
                } else if (g5Var.A) {
                    g5Var.o0((jd0) gwVar);
                } else {
                    g5Var.B.a(gwVar);
                }
                return fs0Var;
        }
    }

    public yj(zj zjVar, ve0 ve0Var, bo boVar) {
        this.f = ve0Var;
        this.g = boVar;
    }

    public yj(tq tqVar, ve0 ve0Var) {
        this.g = tqVar;
        this.f = ve0Var;
    }
}
