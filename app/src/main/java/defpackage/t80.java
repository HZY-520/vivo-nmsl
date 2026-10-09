package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class t80 extends v10 {
    public final oe0 b;

    public t80(oe0 oe0Var) {
        this.b = oe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t80) {
            return this.b.equals(((t80) obj).b);
        }
        return false;
    }

    @Override // defpackage.v10
    public final oe0 f() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
