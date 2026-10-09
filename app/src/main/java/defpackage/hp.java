package defpackage;

import android.graphics.Typeface;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class hp implements gp {
    public final o4 a;
    public final p2 b;

    public hp(i2 i2Var, o4 o4Var) {
        p2 p2Var = ip.a;
        kp kpVar = lp.a;
        ts tsVar = oj.a;
        kpVar.getClass();
        t10.a(q3.H(kpVar, tsVar).g(sm.e).g(new xn0(null)));
        new ic0(0);
        this.a = o4Var;
        this.b = p2Var;
        new l(12, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083 A[Catch: Exception -> 0x008b, TRY_ENTER, TryCatch #1 {Exception -> 0x008b, blocks: (B:25:0x003e, B:27:0x0047, B:30:0x004c, B:32:0x0050, B:33:0x005b, B:48:0x0083, B:49:0x008a, B:51:0x0057), top: B:24:0x003e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ur0 a(tr0 tr0Var) {
        Typeface a;
        Object remove;
        p2 p2Var = this.b;
        synchronized (((ic0) p2Var.f)) {
            try {
                ur0 ur0Var = (ur0) ((d10) p2Var.g).a(tr0Var);
                if (ur0Var != null) {
                    if (ur0Var.f) {
                        return ur0Var;
                    }
                    d10 d10Var = (d10) p2Var.g;
                    synchronized (d10Var.c) {
                        remove = ((LinkedHashMap) d10Var.b.f).remove(tr0Var);
                        if (remove != null) {
                            d10Var.d--;
                        }
                    }
                }
                try {
                    no0 no0Var = tr0Var.a;
                    int i = tr0Var.c;
                    xp xpVar = tr0Var.b;
                    ur0 ur0Var2 = null;
                    if (no0Var != null && !(no0Var instanceof yh)) {
                        if (no0Var instanceof qr) {
                            a = ic0.a("sans-serif", xpVar, i);
                            ur0Var2 = new ur0(a);
                        }
                        if (ur0Var2 != null) {
                            throw new IllegalStateException("Could not load font");
                        }
                        synchronized (((ic0) p2Var.f)) {
                            if (((d10) p2Var.g).a(tr0Var) == null && ur0Var2.f) {
                                ((d10) p2Var.g).b(tr0Var, ur0Var2);
                            }
                        }
                        return ur0Var2;
                    }
                    a = ic0.a(null, xpVar, i);
                    ur0Var2 = new ur0(a);
                    if (ur0Var2 != null) {
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Could not load font", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ur0 b(no0 no0Var, xp xpVar, int i, int i2) {
        int i3 = this.a.e;
        return a(new tr0(no0Var, (i3 == 0 || i3 == Integer.MAX_VALUE) ? xpVar : new xp(t30.g(xpVar.e + i3, 1, 1000)), i, i2, null));
    }
}
