package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ss0 implements tu0 {
    public final String a;
    public final w90 b;

    public ss0(rv rvVar, String str) {
        this.a = str;
        this.b = p30.m(rvVar);
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

    public final rv e() {
        return (rv) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ss0) {
            return lw.i(e(), ((ss0) obj).e());
        }
        return false;
    }

    public final void f(rv rvVar) {
        this.b.setValue(rvVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ")";
    }
}
