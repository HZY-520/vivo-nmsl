package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class i50 {
    public int e;
    public h50 f;
    public final cn0 a = nh.d(j50.a);
    public final be0 b = new be0(nh.d(new g50()));
    public final g7 c = new g7();
    public final g7 d = new g7();
    public final LinkedHashSet g = new LinkedHashSet();
    public final LinkedHashSet h = new LinkedHashSet();
    public final LinkedHashSet i = new LinkedHashSet();

    public final void a(f50 f50Var, h50 h50Var, int i) {
        f50Var.getClass();
        if (h50Var.a == null) {
            (i != 0 ? i != 1 ? this.g : this.h : this.i).add(h50Var);
            h50Var.a = f50Var;
            ((g50) this.b.e.getValue()).getClass();
            h50Var.b();
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(h50Var);
        f50 f50Var2 = h50Var.a;
        sb.append("' is already added to dispatcher ");
        sb.append(f50Var2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        Object next;
        Iterator it = this.c.iterator();
        if (it.hasNext()) {
            next = it.next();
        } else {
            Iterator it2 = this.d.iterator();
            if (!it2.hasNext()) {
                return;
            } else {
                next = it2.next();
            }
        }
        next.getClass();
        z6.c();
    }
}
