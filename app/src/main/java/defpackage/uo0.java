package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class uo0 implements c6 {
    public final et0 a;
    public final kr0 b;
    public final Object c;
    public final Object d;
    public final l6 e;
    public final l6 f;
    public final l6 g;
    public long h;
    public l6 i;

    public uo0(f6 f6Var, kr0 kr0Var, Object obj, Object obj2, l6 l6Var) {
        this.a = f6Var.a(kr0Var);
        this.b = kr0Var;
        this.c = obj2;
        this.d = obj;
        this.e = (l6) kr0Var.a.invoke(obj);
        pq pqVar = kr0Var.a;
        this.f = (l6) pqVar.invoke(obj2);
        this.g = l6Var != null ? lw.p(l6Var) : ((l6) pqVar.invoke(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.c6
    public final boolean a() {
        this.a.a();
        return false;
    }

    @Override // defpackage.c6
    public final Object b(long j) {
        if (g(j)) {
            return this.c;
        }
        l6 g = this.a.g(j, this.e, this.f, this.g);
        int b = g.b();
        for (int i = 0; i < b; i++) {
            if (Float.isNaN(g.a(i))) {
                fd0.b("AnimationVector cannot contain a NaN. " + g + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.invoke(g);
    }

    @Override // defpackage.c6
    public final long c() {
        long j = this.h;
        if (j >= 0) {
            return j;
        }
        long i = this.a.i(this.e, this.f, this.g);
        this.h = i;
        return i;
    }

    @Override // defpackage.c6
    public final kr0 d() {
        return this.b;
    }

    @Override // defpackage.c6
    public final Object e() {
        return this.c;
    }

    @Override // defpackage.c6
    public final l6 f(long j) {
        boolean g = g(j);
        l6 l6Var = this.g;
        if (!g) {
            return this.a.e(j, this.e, this.f, l6Var);
        }
        l6 l6Var2 = this.i;
        if (l6Var2 != null) {
            return l6Var2;
        }
        l6 h = this.a.h(this.e, this.f, l6Var);
        this.i = h;
        return h;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
