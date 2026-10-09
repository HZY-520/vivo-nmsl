package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class oh implements c6 {
    public final l20 a;
    public final kr0 b;
    public final Object c;
    public final l6 d;
    public final l6 e;
    public final l6 f;
    public final Object g;
    public final long h;

    public oh(t3 t3Var, kr0 kr0Var, Object obj, l6 l6Var) {
        l20 l20Var = new l20((t3) t3Var.f);
        this.a = l20Var;
        this.b = kr0Var;
        this.c = obj;
        l6 l6Var2 = (l6) kr0Var.a.invoke(obj);
        this.d = l6Var2;
        this.e = lw.p(l6Var);
        pq pqVar = kr0Var.b;
        l6 l6Var3 = (l6) l20Var.h;
        if (l6Var3 == null) {
            l6Var3 = l6Var2.c();
            l20Var.h = l6Var3;
        }
        int b = l6Var3.b();
        int i = 0;
        while (true) {
            l6 l6Var4 = (l6) l20Var.h;
            if (i >= b) {
                if (l6Var4 == null) {
                    lw.E("targetVector");
                    throw null;
                }
                this.g = pqVar.invoke(l6Var4);
                l20 l20Var2 = this.a;
                l6 l6Var5 = this.d;
                l6 l6Var6 = (l6) l20Var2.g;
                if (l6Var6 == null) {
                    l6Var6 = l6Var5.c();
                    l20Var2.g = l6Var6;
                }
                int b2 = l6Var6.b();
                long j = 0;
                for (int i2 = 0; i2 < b2; i2++) {
                    t3 t3Var2 = (t3) l20Var2.e;
                    l6Var5.getClass();
                    j = Math.max(j, ((long) (Math.exp(((tn) t3Var2.f).b(l6Var.a(i2)) / (un.a - 1.0d)) * 1000.0d)) * 1000000);
                }
                this.h = j;
                l6 p = lw.p(this.a.k(j, this.d, l6Var));
                this.f = p;
                int b3 = p.b();
                for (int i3 = 0; i3 < b3; i3++) {
                    l6 l6Var7 = this.f;
                    float a = l6Var7.a(i3);
                    this.a.getClass();
                    this.a.getClass();
                    l6Var7.e(t30.f(a, -0.0f, 0.0f), i3);
                }
                return;
            }
            if (l6Var4 == null) {
                lw.E("targetVector");
                throw null;
            }
            t3 t3Var3 = (t3) l20Var.e;
            float a2 = l6Var2.a(i);
            float a3 = l6Var.a(i);
            double b4 = ((tn) t3Var3.f).b(a3);
            double d = un.a;
            l6Var4.e((Math.signum(a3) * ((float) (Math.exp((d / (d - 1.0d)) * b4) * r9.a * r9.b))) + a2, i);
            i++;
            l20Var = l20Var;
            b = b;
        }
    }

    @Override // defpackage.c6
    public final boolean a() {
        return false;
    }

    @Override // defpackage.c6
    public final Object b(long j) {
        if (g(j)) {
            return this.g;
        }
        pq pqVar = this.b.b;
        l20 l20Var = this.a;
        l6 l6Var = (l6) l20Var.f;
        l6 l6Var2 = this.d;
        if (l6Var == null) {
            l6Var = l6Var2.c();
            l20Var.f = l6Var;
        }
        int b = l6Var.b();
        int i = 0;
        while (true) {
            l6 l6Var3 = (l6) l20Var.f;
            if (i >= b) {
                if (l6Var3 != null) {
                    return pqVar.invoke(l6Var3);
                }
                lw.E("valueVector");
                throw null;
            }
            if (l6Var3 == null) {
                lw.E("valueVector");
                throw null;
            }
            t3 t3Var = (t3) l20Var.e;
            float a = l6Var2.a(i);
            long j2 = j / 1000000;
            sn a2 = ((tn) t3Var.f).a(this.e.a(i));
            long j3 = a2.c;
            l6Var3.e((Math.signum(a2.a) * a2.b * n4.a(j3 > 0 ? j2 / j3 : 1.0f).a) + a, i);
            i++;
        }
    }

    @Override // defpackage.c6
    public final long c() {
        return this.h;
    }

    @Override // defpackage.c6
    public final kr0 d() {
        return this.b;
    }

    @Override // defpackage.c6
    public final Object e() {
        return this.g;
    }

    @Override // defpackage.c6
    public final l6 f(long j) {
        if (g(j)) {
            return this.f;
        }
        return this.a.k(j, this.d, this.e);
    }
}
