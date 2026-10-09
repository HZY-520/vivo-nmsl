package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class f50 {
    public final b70 a;
    public final i50 b = new i50();
    public final LinkedHashSet c;

    public f50(b70 b70Var) {
        this.a = b70Var;
        new LinkedHashSet();
        new LinkedHashSet();
        this.c = new LinkedHashSet();
    }

    public final void a(y60 y60Var, int i) {
        if (i != 1 && i != 0) {
            z6.d(j2.g("Unsupported priority value: ", i));
        } else if (this.c.add(y60Var)) {
            this.b.a(this, y60Var, i);
        }
    }

    public final void b(h50 h50Var, e50 e50Var) {
        i50 i50Var = this.b;
        if (i50Var.e != 0) {
            return;
        }
        i50Var.b();
        i50Var.e = -1;
        i50Var.f = h50Var;
        if (e50Var != null) {
            i50Var.a.i(null, new k50(e50Var));
        }
    }
}
