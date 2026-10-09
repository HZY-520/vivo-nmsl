package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ab extends bb {
    public final Throwable a;

    public ab(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ab) {
            return lw.i(this.a, ((ab) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.bb
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
