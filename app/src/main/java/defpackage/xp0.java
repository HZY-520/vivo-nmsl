package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class xp0 {
    public final String a;
    public String b;
    public boolean c = false;
    public p90 d = null;

    public xp0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp0)) {
            return false;
        }
        xp0 xp0Var = (xp0) obj;
        return lw.i(this.a, xp0Var.a) && lw.i(this.b, xp0Var.b) && this.c == xp0Var.c && lw.i(this.d, xp0Var.d);
    }

    public final int hashCode() {
        int e = j2.e(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        p90 p90Var = this.d;
        return e + (p90Var == null ? 0 : p90Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ")";
    }
}
