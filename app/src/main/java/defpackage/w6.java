package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class w6 extends y20 {
    public final pq a;

    public w6(pq pqVar) {
        this.a = pqVar;
    }

    @Override // defpackage.y20
    public final t20 d() {
        pg pgVar = new pg();
        pgVar.s = this.a;
        return pgVar;
    }

    @Override // defpackage.y20
    public final void e(t20 t20Var) {
        pg pgVar = (pg) t20Var;
        pgVar.getClass();
        pgVar.s = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6) && this.a == ((w6) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Boolean.hashCode(false) * 31);
    }
}
