package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class jy {
    public final g2 a;
    public boolean c;
    public boolean d;
    public g2 e;
    public final /* synthetic */ int g;
    public boolean b = true;
    public final HashMap f = new HashMap();

    public jy(g2 g2Var, int i) {
        this.g = i;
        this.a = g2Var;
    }

    public final void a(c2 c2Var, int i, d60 d60Var) {
        float f = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (this.g) {
                    case 0:
                        y80 y80Var = d60Var.X;
                        if (y80Var != null) {
                            hs hsVar = (hs) y80Var;
                            float[] b = hsVar.b();
                            if (!hsVar.w) {
                                j = u10.y(b, j);
                            }
                        }
                        j = kw.E(j, d60Var.J);
                        break;
                    default:
                        y00 y0 = d60Var.y0();
                        y0.getClass();
                        long j2 = y0.z;
                        j = s60.e((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
                        break;
                }
                d60Var = d60Var.A;
                d60Var.getClass();
                if (d60Var.equals(this.a.i())) {
                    int round = Math.round(c2Var instanceof kt ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j >> 32)));
                    HashMap hashMap = this.f;
                    if (hashMap.containsKey(c2Var)) {
                        Object obj = hashMap.get(c2Var);
                        if (obj == null && !hashMap.containsKey(c2Var)) {
                            throw new NoSuchElementException("Key " + c2Var + " is missing in the map.");
                        }
                        int intValue = ((Number) obj).intValue();
                        kt ktVar = f2.a;
                        round = ((Number) c2Var.a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(c2Var, Integer.valueOf(round));
                    return;
                }
            } while (!b(d60Var).containsKey(c2Var));
            float c = c(d60Var, c2Var);
            long floatToRawIntBits3 = Float.floatToRawIntBits(c);
            long floatToRawIntBits4 = Float.floatToRawIntBits(c);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(d60 d60Var) {
        switch (this.g) {
            case 0:
                return d60Var.e0().a();
            default:
                y00 y0 = d60Var.y0();
                y0.getClass();
                return y0.e0().a();
        }
    }

    public final int c(d60 d60Var, c2 c2Var) {
        switch (this.g) {
            case 0:
                return d60Var.X(c2Var);
            default:
                y00 y0 = d60Var.y0();
                y0.getClass();
                return y0.X(c2Var);
        }
    }

    public final boolean d() {
        return this.c || this.d;
    }

    public final boolean e() {
        h();
        return this.e != null;
    }

    public final void f() {
        this.b = true;
        g2 g2Var = this.a;
        g2 l = g2Var.l();
        if (l == null) {
            return;
        }
        if (this.c) {
            g2Var.J();
        }
        if (this.d) {
            g2Var.requestLayout();
        }
        l.F().f();
    }

    public final void g() {
        HashMap hashMap = this.f;
        hashMap.clear();
        l lVar = new l(2, this);
        g2 g2Var = this.a;
        g2Var.c(lVar);
        hashMap.putAll(b(g2Var.i()));
        this.b = false;
    }

    public final void h() {
        jy F;
        jy F2;
        boolean d = d();
        g2 g2Var = this.a;
        if (!d) {
            g2 l = g2Var.l();
            if (l == null) {
                return;
            }
            g2Var = l.F().e;
            if (g2Var == null || !g2Var.F().d()) {
                g2 g2Var2 = this.e;
                if (g2Var2 == null || g2Var2.F().d()) {
                    return;
                }
                g2 l2 = g2Var2.l();
                if (l2 != null && (F2 = l2.F()) != null) {
                    F2.h();
                }
                g2 l3 = g2Var2.l();
                g2Var = (l3 == null || (F = l3.F()) == null) ? null : F.e;
            }
        }
        this.e = g2Var;
    }
}
