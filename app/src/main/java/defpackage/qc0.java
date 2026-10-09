package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class qc0 {
    public final nc0 a;

    public qc0(nc0 nc0Var) {
        this.a = nc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qc0) {
            return lw.i(this.a, ((qc0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        nc0 nc0Var = this.a;
        if (nc0Var != null) {
            return nc0Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.a + ")";
    }
}
