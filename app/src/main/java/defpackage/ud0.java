package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class ud0 extends da implements jx {
    public final boolean k;

    public ud0(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
        this.k = false;
    }

    public final ex e() {
        if (this.k) {
            return this;
        }
        ex exVar = this.e;
        if (exVar != null) {
            return exVar;
        }
        ex a = a();
        this.e = a;
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ud0) {
            ud0 ud0Var = (ud0) obj;
            return d().equals(ud0Var.d()) && this.h.equals(ud0Var.h) && this.i.equals(ud0Var.i) && lw.i(this.f, ud0Var.f);
        }
        if (obj instanceof jx) {
            return obj.equals(e());
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + (d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        ex e = e();
        if (e != this) {
            return e.toString();
        }
        return "property " + this.h + " (Kotlin reflection is not available)";
    }
}
