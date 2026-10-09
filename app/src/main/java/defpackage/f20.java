package defpackage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class f20 {
    public final ld a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public f20(ld ldVar) {
        this.a = ldVar;
    }

    public final void a() {
        this.b.remove((Object) null);
        e20 e20Var = (e20) this.c.remove(null);
        if (e20Var != null) {
            e20Var.a.b(e20Var.b);
            e20Var.b = null;
        }
        this.a.run();
    }
}
