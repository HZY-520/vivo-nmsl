package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class nl0 {
    public static final ll0 a(ll0 ll0Var) {
        if (!(ll0Var instanceof ll0)) {
            ll0Var = null;
        }
        if (ll0Var != null) {
            return ll0Var;
        }
        ue.b("Inconsistent composition");
        throw new id();
    }

    public static final int b(ArrayList arrayList, int i, int i2) {
        int c = c(arrayList, i, i2);
        return c >= 0 ? c : -(c + 1);
    }

    public static final int c(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((er) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int m = lw.m(i5, i);
            if (m < 0) {
                i3 = i4 + 1;
            } else {
                if (m <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int d(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void e() {
        throw new ConcurrentModificationException();
    }

    public static final void f(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }
}
