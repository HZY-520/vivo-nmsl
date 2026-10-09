package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class q20 extends t20 implements df, ay {
    public LinkedHashMap s;

    @Override // defpackage.ay
    public final v00 J(w00 w00Var, w10 w10Var, long j) {
        float f = ((ck) q3.o(this, jw.c)).e;
        if (f < 0.0f) {
            f = 0.0f;
        }
        ec0 b = w10Var.b(j);
        boolean z = this.r && !Float.isNaN(f) && ck.a(f, 0.0f) > 0;
        int D = !Float.isNaN(f) ? w00Var.D(f) : 0;
        int i = b.e;
        if (z) {
            i = Math.max(i, D);
        }
        int i2 = i;
        int i3 = b.f;
        if (z) {
            i3 = Math.max(i3, D);
        }
        int i4 = i3;
        if (z) {
            LinkedHashMap linkedHashMap = this.s;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.s = linkedHashMap;
            }
            mt0 mt0Var = jw.b;
            int round = Math.round((D - b.e) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(mt0Var, Integer.valueOf(round));
            kt ktVar = jw.a;
            int round2 = Math.round((D - b.f) / 2.0f);
            linkedHashMap.put(ktVar, Integer.valueOf(round2 >= 0 ? round2 : 0));
        }
        Map map = this.s;
        if (map == null) {
            map = vm.e;
        }
        return w00Var.k0(i2, i4, map, null, new qv(i2, b, i4));
    }
}
