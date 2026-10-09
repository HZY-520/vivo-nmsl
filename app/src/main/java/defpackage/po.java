package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class po {
    public final uo a;
    public final e3 b;
    public final l40 c;
    public final l40 d;
    public boolean e;

    public po(uo uoVar, e3 e3Var) {
        this.a = uoVar;
        this.b = e3Var;
        int i = hi0.a;
        this.c = new l40();
        this.d = new l40();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        b3 b3Var = new b3(0, this, po.class, "invalidateNodes", "invalidateNodes()V", 0, 1);
        h40 h40Var = this.b.t0;
        if (!h40Var.e(b3Var)) {
            h40Var.a(b3Var);
        }
        this.e = true;
    }
}
