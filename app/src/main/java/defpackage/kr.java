package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class kr {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final y30 e;
    public final lo0 f;

    public kr(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            dd0.a("Invalid start index");
        }
        this.d = new ArrayList();
        y30 y30Var = new y30();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            mx mxVar = (mx) this.a.get(i3);
            int i4 = mxVar.c;
            int i5 = mxVar.d;
            y30Var.h(i4, new ps(i3, i2, i5));
            i2 += i5;
        }
        this.e = y30Var;
        this.f = new lo0(new jr(this));
    }

    public final boolean a(int i, int i2) {
        ps psVar;
        int i3;
        int i4;
        y30 y30Var = this.e;
        ps psVar2 = (ps) y30Var.b(i);
        if (psVar2 == null) {
            return false;
        }
        int i5 = psVar2.b;
        int i6 = i2 - psVar2.c;
        psVar2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = y30Var.c;
        long[] jArr = y30Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (psVar = (ps) objArr[(i7 << 3) + i9]).b) >= i5 && psVar != psVar2 && (i4 = i3 + i6) >= 0) {
                        psVar.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
