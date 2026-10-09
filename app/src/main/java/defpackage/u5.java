package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class u5 implements tu0 {
    public final int a;
    public final String b;
    public final w90 c = p30.m(nv.e);
    public final w90 d = p30.m(Boolean.TRUE);

    public u5(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.tu0
    public final int a(w00 w00Var, xx xxVar) {
        return e().a;
    }

    @Override // defpackage.tu0
    public final int b(w00 w00Var) {
        return e().b;
    }

    @Override // defpackage.tu0
    public final int c(w00 w00Var, xx xxVar) {
        return e().c;
    }

    @Override // defpackage.tu0
    public final int d(w00 w00Var) {
        return e().d;
    }

    public final nv e() {
        return (nv) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u5) {
            return this.a == ((u5) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(yv0 yv0Var, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            this.c.setValue(yv0Var.a.h(i2));
            f(yv0Var.a.s(i2));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b + "(" + e().a + ", " + e().b + ", " + e().c + ", " + e().d + ")";
    }
}
