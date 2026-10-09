package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class w0 extends u0 {
    public static w0 e;
    public static final mf0 f = mf0.f;
    public static final mf0 g = mf0.e;
    public np0 c;
    public uj0 d;

    @Override // defpackage.u0
    public final int[] a(int i) {
        int i2;
        if (c().length() > 0 && i < c().length()) {
            try {
                uj0 uj0Var = this.d;
                if (uj0Var == null) {
                    lw.E("node");
                    throw null;
                }
                oe0 g2 = uj0Var.g();
                int round = Math.round(g2.d - g2.b);
                if (i <= 0) {
                    i = 0;
                }
                np0 np0Var = this.c;
                if (np0Var == null) {
                    lw.E("layoutResult");
                    throw null;
                }
                int a = np0Var.a(i);
                np0 np0Var2 = this.c;
                if (np0Var2 == null) {
                    lw.E("layoutResult");
                    throw null;
                }
                float d = np0Var2.d(a) + round;
                np0 np0Var3 = this.c;
                if (np0Var3 == null) {
                    lw.E("layoutResult");
                    throw null;
                }
                float d2 = np0Var3.d(np0Var3.b.b - 1);
                np0 np0Var4 = this.c;
                if (d < d2) {
                    if (np0Var4 == null) {
                        lw.E("layoutResult");
                        throw null;
                    }
                    i2 = np0Var4.b(d);
                } else {
                    if (np0Var4 == null) {
                        lw.E("layoutResult");
                        throw null;
                    }
                    i2 = np0Var4.b.b;
                }
                return b(i, e(i2 - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.u0
    public final int[] d(int i) {
        int i2;
        if (c().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            uj0 uj0Var = this.d;
            if (uj0Var == null) {
                lw.E("node");
                throw null;
            }
            oe0 g2 = uj0Var.g();
            int round = Math.round(g2.d - g2.b);
            int length = c().length();
            if (length <= i) {
                i = length;
            }
            np0 np0Var = this.c;
            if (np0Var == null) {
                lw.E("layoutResult");
                throw null;
            }
            int a = np0Var.a(i);
            np0 np0Var2 = this.c;
            if (np0Var2 == null) {
                lw.E("layoutResult");
                throw null;
            }
            float d = np0Var2.d(a) - round;
            if (d > 0.0f) {
                np0 np0Var3 = this.c;
                if (np0Var3 == null) {
                    lw.E("layoutResult");
                    throw null;
                }
                i2 = np0Var3.b(d);
            } else {
                i2 = 0;
            }
            if (i == c().length() && i2 < a) {
                i2++;
            }
            return b(e(i2, f), i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i, mf0 mf0Var) {
        np0 np0Var = this.c;
        if (np0Var == null) {
            lw.E("layoutResult");
            throw null;
        }
        int c = np0Var.c(i);
        np0 np0Var2 = this.c;
        if (np0Var2 == null) {
            lw.E("layoutResult");
            throw null;
        }
        mf0 e2 = np0Var2.e(c);
        np0 np0Var3 = this.c;
        if (mf0Var != e2) {
            if (np0Var3 != null) {
                return np0Var3.c(i);
            }
            lw.E("layoutResult");
            throw null;
        }
        if (np0Var3 == null) {
            lw.E("layoutResult");
            throw null;
        }
        q5 q5Var = np0Var3.b;
        q5Var.d(i);
        ArrayList arrayList = (ArrayList) q5Var.e;
        x4 x4Var = ((m90) arrayList.get(t30.j(i, arrayList))).a;
        return (x4Var.d.d(i - r4.d) + r4.b) - 1;
    }
}
