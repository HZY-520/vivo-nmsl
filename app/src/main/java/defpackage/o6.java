package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class o6 {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public o6(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        dv.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj;
        return lw.i(this.a, o6Var.a) && this.b == o6Var.b && this.c == o6Var.c && lw.i(this.d, o6Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + j2.b(this.c, j2.b(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public o6(int i, int i2, Object obj) {
        this(obj, i, i2, "");
    }
}
