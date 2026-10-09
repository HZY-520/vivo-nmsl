package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class k90 implements Serializable {
    public final Object e;
    public final Object f;

    public k90(Object obj, Object obj2) {
        this.e = obj;
        this.f = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k90)) {
            return false;
        }
        k90 k90Var = (k90) obj;
        return lw.i(this.e, k90Var.e) && lw.i(this.f, k90Var.f);
    }

    public final int hashCode() {
        Object obj = this.e;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.e + ", " + this.f + ')';
    }
}
