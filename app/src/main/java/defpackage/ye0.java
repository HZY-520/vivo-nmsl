package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ye0 extends v10 {
    public final v10 b;
    public final int c;

    public ye0(v10 v10Var, int i) {
        this.b = v10Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ye0)) {
            return false;
        }
        ye0 ye0Var = (ye0) obj;
        return ye0Var.b.equals(this.b) && ye0Var.c == this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.c * 31);
    }
}
