package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class cu0 {
    public final du0 a = new du0();

    public final void a() {
        du0 du0Var = this.a;
        if (!du0Var.d) {
            du0Var.d = true;
            synchronized (du0Var.a) {
                try {
                    Iterator it = du0Var.b.values().iterator();
                    while (it.hasNext()) {
                        du0.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = du0Var.c.iterator();
                    while (it2.hasNext()) {
                        du0.a((AutoCloseable) it2.next());
                    }
                    du0Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
