package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class u30 {
    public final k40 a;

    public static final Object a(k40 k40Var) {
        Object g = k40Var.g(null);
        if (g == null) {
            return null;
        }
        if (!(g instanceof h40)) {
            k40Var.j(null);
            return g;
        }
        h40 h40Var = (h40) g;
        if (h40Var.i()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = h40Var.b - 1;
        Object g2 = h40Var.g(i);
        h40Var.l(i);
        g2.getClass();
        if (h40Var.i()) {
            k40Var.j(null);
        }
        if (h40Var.b == 1) {
            k40Var.l(null, h40Var.f());
        }
        return g2;
    }

    public static final h40 b(k40 k40Var) {
        if (k40Var.i()) {
            h40 h40Var = o60.b;
            h40Var.getClass();
            return h40Var;
        }
        h40 h40Var2 = new h40();
        Object[] objArr = k40Var.c;
        long[] jArr = k40Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof h40) {
                                h40Var2.b((h40) obj);
                            } else {
                                obj.getClass();
                                h40Var2.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return h40Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u30) {
            return this.a.equals(((u30) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
