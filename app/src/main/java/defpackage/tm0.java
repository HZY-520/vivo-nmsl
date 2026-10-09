package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class tm0 implements f6 {
    public final float a;
    public final float b;
    public final Object c;

    public tm0(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // defpackage.f6
    public final et0 a(kr0 kr0Var) {
        Object obj = this.c;
        return new t3(this.a, this.b, obj == null ? null : (l6) kr0Var.a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tm0) {
            tm0 tm0Var = (tm0) obj;
            if (tm0Var.a == this.a && tm0Var.b == this.b && lw.i(tm0Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + j2.a(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
