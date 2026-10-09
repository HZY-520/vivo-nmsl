package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class jb extends y20 {
    public final l0 a;

    public jb(l0 l0Var) {
        this.a = l0Var;
    }

    @Override // defpackage.y20
    public final t20 d() {
        ib ibVar = new ib();
        ibVar.s = this.a;
        return ibVar;
    }

    @Override // defpackage.y20
    public final void e(t20 t20Var) {
        ib ibVar = (ib) t20Var;
        ibVar.s = this.a;
        p30.i(ibVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jb) {
            return this.a == ((jb) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
