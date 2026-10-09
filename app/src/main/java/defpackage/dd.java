package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class dd implements u20 {
    public final u20 a;
    public final u20 b;

    public dd(u20 u20Var, u20 u20Var2) {
        this.a = u20Var;
        this.b = u20Var2;
    }

    @Override // defpackage.u20
    public final Object a(tq tqVar, Object obj) {
        return this.b.a(tqVar, this.a.a(tqVar, obj));
    }

    @Override // defpackage.u20
    public final boolean b(pq pqVar) {
        return this.a.b(pqVar) && this.b.b(pqVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dd)) {
            return false;
        }
        dd ddVar = (dd) obj;
        return this.a.equals(ddVar.a) && lw.i(this.b, ddVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = (StringBuilder) a(new bd(1), new StringBuilder("["));
        sb.append("]");
        return sb.toString();
    }
}
