package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class dr extends da implements cr, ex, br {
    public final int k;
    public final int l;

    public dr(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.k = i;
        this.l = 0;
    }

    @Override // defpackage.da
    public final ex a() {
        we0.a.getClass();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ex] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dr) {
            dr drVar = (dr) obj;
            return this.h.equals(drVar.h) && this.i.equals(drVar.i) && this.l == drVar.l && this.k == drVar.k && lw.i(this.f, drVar.f) && d().equals(drVar.d());
        }
        if (!(obj instanceof dr)) {
            return false;
        }
        ?? r0 = this.e;
        if (r0 == 0) {
            a();
            this.e = this;
        } else {
            this = r0;
        }
        return obj.equals(this);
    }

    @Override // defpackage.cr
    public final int getArity() {
        return this.k;
    }

    public final int hashCode() {
        d();
        return this.i.hashCode() + ((this.h.hashCode() + (d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        ex exVar = this.e;
        if (exVar == null) {
            a();
            this.e = this;
            exVar = this;
        }
        if (exVar != this) {
            return exVar.toString();
        }
        String str = this.h;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : j2.j("function ", str, " (Kotlin reflection is not available)");
    }

    public dr(int i, Class cls, String str, String str2, int i2) {
        this(i, ca.e, cls, str, str2, i2);
    }
}
