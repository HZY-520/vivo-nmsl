package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class rz {
    public static final rz d = new rz(oz.c, 17, 0);
    public final float a;
    public final int b;
    public final int c;

    public rz(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz)) {
            return false;
        }
        rz rzVar = (rz) obj;
        float f = rzVar.a;
        float f2 = oz.b;
        return Float.compare(this.a, f) == 0 && this.b == rzVar.b && this.c == rzVar.c;
    }

    public final int hashCode() {
        float f = oz.b;
        return Integer.hashCode(this.c) + j2.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String b = oz.b(this.a);
        String str = "Invalid";
        int i = this.b;
        String str2 = i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        int i2 = this.c;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        return "LineHeightStyle(alignment=" + b + ", trim=" + str2 + ",mode=" + str + ")";
    }
}
