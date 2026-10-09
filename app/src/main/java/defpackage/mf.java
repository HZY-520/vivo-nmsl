package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class mf implements rs0 {
    public final pq a;

    public mf(pq pqVar) {
        this.a = pqVar;
    }

    @Override // defpackage.rs0
    public final Object a(xa0 xa0Var) {
        return this.a.invoke(xa0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mf) && lw.i(this.a, ((mf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ")";
    }
}
