package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class e extends dr implements pq {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.m = i3;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        Object[] objArr;
        Object[] objArr2;
        int i;
        int i2 = this.m;
        fs0 fs0Var = fs0.a;
        Object obj2 = this.f;
        switch (i2) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                tb tbVar = (tb) obj2;
                d40 d40Var = tbVar.G;
                if (!booleanValue) {
                    ng ngVar = null;
                    if (tbVar.u != null) {
                        Object[] objArr3 = d40Var.c;
                        long[] jArr = d40Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8;
                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                    int i7 = 0;
                                    while (i7 < i6) {
                                        if ((255 & j) < 128) {
                                            i = i5;
                                            objArr2 = objArr3;
                                            q3.A(tbVar.c0(), null, new j(tbVar, (hd0) objArr3[(i4 << 3) + i7], ngVar, i3), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i = i5;
                                        }
                                        j >>= i;
                                        i7++;
                                        i5 = i;
                                        objArr3 = objArr2;
                                    }
                                    objArr = objArr3;
                                    if (i6 != i5) {
                                    }
                                } else {
                                    objArr = objArr3;
                                }
                                if (i4 != length) {
                                    i4++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                        hd0 hd0Var = tbVar.I;
                        if (hd0Var != null) {
                            q3.A(tbVar.c0(), null, new j(tbVar, hd0Var, ngVar, 1), 3);
                        }
                    }
                    d40Var.a();
                    tbVar.I = null;
                    break;
                } else {
                    tbVar.v0();
                    break;
                }
            default:
                ((zw) obj2).n((Throwable) obj);
                break;
        }
        return fs0Var;
    }
}
