package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class jz extends cu0 {
    public final y30 b;

    public jz() {
        y30 y30Var = wv.a;
        this.b = new y30();
    }

    @Override // defpackage.cu0
    public final void b() {
        y30 y30Var = this.b;
        int[] iArr = y30Var.b;
        Object[] objArr = y30Var.c;
        long[] jArr = y30Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        h40 h40Var = (h40) objArr[i4];
                        Object[] objArr2 = h40Var.a;
                        int i6 = h40Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            iz izVar = (iz) objArr2[i7];
                            ka kaVar = izVar.d;
                            if (kaVar != null) {
                                kaVar.cancel();
                            }
                            izVar.d = null;
                            i10 i10Var = (i10) izVar.a.f;
                            i10Var.f = true;
                            i10Var.e = false;
                            i10Var.a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
