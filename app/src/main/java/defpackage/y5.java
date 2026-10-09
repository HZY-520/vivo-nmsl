package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class y5 {
    public final kr0 a;
    public final Object b;
    public final g6 c;
    public final w90 d;
    public final w90 e;
    public final b50 f;
    public final l6 g;
    public final l6 h;
    public final l6 i;
    public final l6 j;

    public y5(Object obj, kr0 kr0Var, Object obj2) {
        this.a = kr0Var;
        this.b = obj2;
        g6 g6Var = new g6(kr0Var, obj, null, 60);
        this.c = g6Var;
        this.d = p30.m(Boolean.FALSE);
        this.e = p30.m(obj);
        this.f = new b50();
        new tm0(1.0f, 1500.0f, obj2);
        l6 l6Var = g6Var.g;
        boolean z = l6Var instanceof h6;
        l6 l6Var2 = z ? lw.e : l6Var instanceof i6 ? lw.f : l6Var instanceof j6 ? lw.g : lw.h;
        this.g = l6Var2;
        l6 l6Var3 = z ? lw.a : l6Var instanceof i6 ? lw.b : l6Var instanceof j6 ? lw.c : lw.d;
        this.h = l6Var3;
        this.i = l6Var2;
        this.j = l6Var3;
    }

    public static Object a(y5 y5Var, Object obj, f6 f6Var, go0 go0Var) {
        Object invoke = y5Var.a.b.invoke(y5Var.c.g);
        Object value = y5Var.c.f.getValue();
        kr0 kr0Var = y5Var.a;
        uo0 uo0Var = new uo0(f6Var, kr0Var, value, obj, (l6) kr0Var.a.invoke(invoke));
        long j = y5Var.c.h;
        b50 b50Var = y5Var.f;
        w5 w5Var = new w5(y5Var, invoke, uo0Var, j, null);
        b50Var.getClass();
        return t10.j(new a6(b50Var, w5Var, null), go0Var);
    }

    public final Object b(Object obj) {
        l6 l6Var = this.g;
        l6 l6Var2 = this.i;
        boolean i = lw.i(l6Var2, l6Var);
        l6 l6Var3 = this.j;
        if (!i || !lw.i(l6Var3, this.h)) {
            kr0 kr0Var = this.a;
            l6 l6Var4 = (l6) kr0Var.a.invoke(obj);
            int b = l6Var4.b();
            boolean z = false;
            for (int i2 = 0; i2 < b; i2++) {
                if (l6Var4.a(i2) < l6Var2.a(i2) || l6Var4.a(i2) > l6Var3.a(i2)) {
                    l6Var4.e(t30.f(l6Var4.a(i2), l6Var2.a(i2), l6Var3.a(i2)), i2);
                    z = true;
                }
            }
            if (z) {
                return kr0Var.b.invoke(l6Var4);
            }
        }
        return obj;
    }

    public final Object c(ck ckVar, go0 go0Var) {
        x5 x5Var = new x5(this, ckVar, null);
        b50 b50Var = this.f;
        b50Var.getClass();
        Object j = t10.j(new a6(b50Var, x5Var, null), go0Var);
        return j == dh.e ? j : fs0.a;
    }

    public /* synthetic */ y5(Comparable comparable, kr0 kr0Var, Float f, int i) {
        this(comparable, kr0Var, (i & 4) != 0 ? null : f);
    }
}
