package defpackage;

import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class k60 {
    public final mj0 a;
    public final tq b;
    public si c;
    public boolean d;
    public final p2 e = new p2(4);

    public k60(mj0 mj0Var, tq tqVar, si siVar) {
        this.a = mj0Var;
        this.b = tqVar;
        this.c = siVar;
    }

    public static void a(rc0 rc0Var) {
        List list = rc0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((vc0) list.get(i)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(tq tqVar, og ogVar) {
        j60 j60Var;
        int i;
        if (ogVar instanceof j60) {
            j60Var = (j60) ogVar;
            int i2 = j60Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j60Var.g = i2 - Integer.MIN_VALUE;
                Object obj = j60Var.e;
                i = j60Var.g;
                ng ngVar = null;
                if (i != 0) {
                    t30.z(obj);
                    this.d = true;
                    d dVar = new d(this, tqVar, ngVar, 9);
                    j60Var.g = 1;
                    wn0 wn0Var = new wn0(j60Var, j60Var.getContext());
                    Object u = z20.u(wn0Var, wn0Var, dVar);
                    dh dhVar = dh.e;
                    if (u == dhVar) {
                        return dhVar;
                    }
                } else {
                    if (i != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t30.z(obj);
                }
                this.d = false;
                return fs0.a;
            }
        }
        j60Var = new j60(this, ogVar);
        Object obj2 = j60Var.e;
        i = j60Var.g;
        ng ngVar2 = null;
        if (i != 0) {
        }
        this.d = false;
        return fs0.a;
    }
}
