package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class za implements ao {
    public final tg e;
    public final int f;
    public final m9 g;
    public final ao h;
    public final uq i;

    public za(uq uqVar, ao aoVar, tg tgVar, int i, m9 m9Var) {
        this.e = tgVar;
        this.f = i;
        this.g = m9Var;
        this.h = aoVar;
        this.i = uqVar;
    }

    public final Object a(bo boVar, og ogVar) {
        Object j = t10.j(new wa(this, boVar, null), ogVar);
        return j == dh.e ? j : fs0.a;
    }

    @Override // defpackage.ao
    public final Object b(bo boVar, ng ngVar) {
        int i = this.f;
        ng ngVar2 = null;
        dh dhVar = dh.e;
        fs0 fs0Var = fs0.a;
        if (i == -3) {
            tg context = ngVar.getContext();
            Boolean bool = Boolean.FALSE;
            bd bdVar = new bd(12);
            tg tgVar = this.e;
            tg g = !((Boolean) tgVar.m(bdVar, bool)).booleanValue() ? context.g(tgVar) : nh.r(context, tgVar, false);
            if (lw.i(g, context)) {
                Object a = a(boVar, (og) ngVar);
                if (a == dhVar) {
                    return a;
                }
            } else {
                b2 b2Var = b2.D;
                if (lw.i(g.j(b2Var), context.j(b2Var))) {
                    tg context2 = ngVar.getContext();
                    if (!(boVar instanceof kk0) && !(boVar instanceof l60)) {
                        boVar = new fo(boVar, context2);
                    }
                    Object S = kw.S(g, boVar, kw.P(g), new d(this, ngVar2, 5), ngVar);
                    if (S == dhVar) {
                        return S;
                    }
                }
            }
        }
        Object j = t10.j(new f(boVar, this, ngVar2, 2), ngVar);
        if (j != dhVar) {
            j = fs0Var;
        }
        return j == dhVar ? j : fs0Var;
    }

    public final String c() {
        ArrayList arrayList = new ArrayList(4);
        sm smVar = sm.e;
        tg tgVar = this.e;
        if (tgVar != smVar) {
            arrayList.add("context=" + tgVar);
        }
        int i = this.f;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        m9 m9Var = m9.e;
        m9 m9Var2 = this.g;
        if (m9Var2 != m9Var) {
            arrayList.add("onBufferOverflow=" + m9Var2);
        }
        return getClass().getSimpleName() + '[' + ac.d0(arrayList, ", ", null, null, null, 62) + ']';
    }

    public final String toString() {
        return this.h + " -> " + c();
    }
}
