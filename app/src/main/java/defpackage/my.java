package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class my extends y20 {
    public final float a;

    public my(float f) {
        this.a = f;
    }

    @Override // defpackage.y20
    public final t20 d() {
        ny nyVar = new ny();
        nyVar.s = this.a;
        nyVar.t = true;
        return nyVar;
    }

    @Override // defpackage.y20
    public final void e(t20 t20Var) {
        ny nyVar = (ny) t20Var;
        nyVar.s = this.a;
        nyVar.t = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        my myVar = obj instanceof my ? (my) obj : null;
        return myVar != null && this.a == myVar.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Float.hashCode(this.a) * 31);
    }
}
