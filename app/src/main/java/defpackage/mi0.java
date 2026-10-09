package defpackage;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class mi0 {
    public final w90 a = p30.m(Boolean.FALSE);

    public final void a(e3 e3Var, xj0 xj0Var, tg tgVar, Consumer consumer) {
        t40 t40Var = new t40(new ni0[16]);
        v10.r(xj0Var.a(), 0, new li0(1, t40Var, t40.class, "add", "add(Ljava/lang/Object;)Z", 8));
        final pq[] pqVarArr = {new zh0(21), new zh0(22)};
        Arrays.sort(t40Var.e, 0, t40Var.g, new Comparator() { // from class: ed
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                for (pq pqVar : pqVarArr) {
                    int m = q3.m((Comparable) pqVar.invoke(obj), (Comparable) pqVar.invoke(obj2));
                    if (m != 0) {
                        return m;
                    }
                }
                return 0;
            }
        });
        int i = t40Var.g;
        ni0 ni0Var = (ni0) (i == 0 ? null : t40Var.e[i - 1]);
        if (ni0Var == null) {
            return;
        }
        bw bwVar = ni0Var.c;
        he heVar = new he(ni0Var.a, bwVar, t10.a(tgVar), this, e3Var);
        d60 d60Var = ni0Var.d;
        long j = (bwVar.b & 4294967295L) | (bwVar.a << 32);
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(e3Var, m20.n(lw.B(q3.s(d60Var).A(d60Var, true))), new Point((int) (j >> 32), (int) (j & 4294967295L)), heVar);
        scrollCaptureTarget.setScrollBounds(m20.n(bwVar));
        consumer.accept(scrollCaptureTarget);
    }
}
