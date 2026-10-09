package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class be implements tq, uq, vq, wq, xq, yq, zq, ar, fq, gq, iq, jq, kq, lq, mq, nq, oq, qq, rq {
    public final int e;
    public final boolean f;
    public br g;
    public de0 h;
    public ArrayList i;

    public be(int i, boolean z, br brVar) {
        this.e = i;
        this.f = z;
        this.g = brVar;
    }

    public final Object a(se seVar, int i) {
        gr grVar = (gr) seVar;
        grVar.Q(this.e);
        e(grVar);
        int f = i | (grVar.e(this) ? kw.f(2, 0) : kw.f(1, 0));
        br brVar = this.g;
        lr0.e(2, brVar);
        Object invoke = ((tq) brVar).invoke(grVar, Integer.valueOf(f));
        de0 q = grVar.q();
        if (q != null) {
            q.d = new ae(2, this, be.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return invoke;
    }

    @Override // defpackage.uq
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3) {
        return d(obj, (se) obj2, ((Number) obj3).intValue());
    }

    public final Object d(Object obj, se seVar, int i) {
        gr grVar = (gr) seVar;
        grVar.Q(this.e);
        e(grVar);
        int f = grVar.e(this) ? kw.f(2, 1) : kw.f(1, 1);
        br brVar = this.g;
        lr0.e(3, brVar);
        Object c = ((uq) brVar).c(obj, grVar, Integer.valueOf(f | i));
        de0 q = grVar.q();
        if (q != null) {
            q.d = new zd(i, 0, this, obj);
        }
        return c;
    }

    public final void e(se seVar) {
        de0 u;
        if (!this.f || (u = ((gr) seVar).u()) == null) {
            return;
        }
        u.b |= 1;
        de0 de0Var = this.h;
        if (de0Var == null || !de0Var.a() || de0Var == u || lw.i(de0Var.c, u.c)) {
            this.h = u;
            return;
        }
        ArrayList arrayList = this.i;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.i = arrayList2;
            arrayList2.add(u);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            de0 de0Var2 = (de0) arrayList.get(i);
            if (de0Var2 == null || !de0Var2.a() || de0Var2 == u || lw.i(de0Var2.c, u.c)) {
                arrayList.set(i, u);
                return;
            }
        }
        arrayList.add(u);
    }

    @Override // defpackage.tq
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((se) obj, ((Number) obj2).intValue());
    }
}
