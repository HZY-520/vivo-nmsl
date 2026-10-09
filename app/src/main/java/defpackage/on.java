package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class on extends y20 {
    public final jj a;

    public on(jj jjVar) {
        this.a = jjVar;
    }

    @Override // defpackage.y20
    public final t20 d() {
        pn pnVar = new pn();
        pnVar.s = this.a;
        pnVar.t = 1.0f;
        return pnVar;
    }

    @Override // defpackage.y20
    public final void e(t20 t20Var) {
        pn pnVar = (pn) t20Var;
        pnVar.s = this.a;
        pnVar.t = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof on) {
            return this.a == ((on) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.a.hashCode() * 31);
    }
}
