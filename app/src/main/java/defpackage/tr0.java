package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class tr0 {
    public final no0 a;
    public final xp b;
    public final int c;
    public final int d;
    public final Object e;

    public tr0(no0 no0Var, xp xpVar, int i, int i2, Object obj) {
        this.a = no0Var;
        this.b = xpVar;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr0)) {
            return false;
        }
        tr0 tr0Var = (tr0) obj;
        return lw.i(this.a, tr0Var.a) && lw.i(this.b, tr0Var.b) && this.c == tr0Var.c && this.d == tr0Var.d && lw.i(this.e, tr0Var.e);
    }

    public final int hashCode() {
        no0 no0Var = this.a;
        int b = j2.b(this.d, j2.b(this.c, (((no0Var == null ? 0 : no0Var.hashCode()) * 31) + this.b.e) * 31, 31), 31);
        Object obj = this.e;
        return b + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str = "Invalid";
        int i = this.c;
        String str2 = i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
        int i2 = this.d;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        return "TypefaceRequest(fontFamily=" + this.a + ", fontWeight=" + this.b + ", fontStyle=" + str2 + ", fontSynthesis=" + str + ", resourceLoaderCacheKey=" + this.e + ")";
    }
}
