package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class sg0 {
    public float a;
    public boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg0)) {
            return false;
        }
        sg0 sg0Var = (sg0) obj;
        return Float.compare(this.a, sg0Var.a) == 0 && this.b == sg0Var.b;
    }

    public final int hashCode() {
        return j2.e(this.b, Float.hashCode(this.a) * 31, 961);
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=null, flowLayoutData=null)";
    }
}
