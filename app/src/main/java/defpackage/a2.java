package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class a2 implements cr, Serializable {
    public final Object e;
    public final Class f;
    public final String g;
    public final String h;
    public final boolean i = false;
    public final int j;
    public final int k;

    public a2(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.e = obj;
        this.f = cls;
        this.g = str;
        this.h = str2;
        this.j = i;
        this.k = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return this.i == a2Var.i && this.j == a2Var.j && this.k == a2Var.k && lw.i(this.e, a2Var.e) && this.f.equals(a2Var.f) && this.g.equals(a2Var.g) && this.h.equals(a2Var.h);
    }

    @Override // defpackage.cr
    public final int getArity() {
        return this.j;
    }

    public final int hashCode() {
        Object obj = this.e;
        return ((((((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31)) * 31)) * 31) + (this.i ? 1231 : 1237)) * 31) + this.j) * 31) + this.k;
    }

    public final String toString() {
        we0.a.getClass();
        return xe0.a(this);
    }
}
