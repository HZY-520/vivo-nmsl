package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vz extends xz {
    public final String a;
    public final pp0 b;

    public vz(String str, pp0 pp0Var) {
        this.a = str;
        this.b = pp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz)) {
            return false;
        }
        vz vzVar = (vz) obj;
        return this.a.equals(vzVar.a) && lw.i(this.b, vzVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pp0 pp0Var = this.b;
        return (hashCode + (pp0Var != null ? pp0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return j2.j("LinkAnnotation.Clickable(tag=", this.a, ")");
    }
}
