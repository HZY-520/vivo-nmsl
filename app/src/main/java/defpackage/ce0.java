package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class ce0 implements pq {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ce0(int i, int i2, Object obj, Object obj2) {
        this.e = i2;
        this.g = obj;
        this.f = i;
        this.h = obj2;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        we weVar;
        we weVar2;
        int i;
        boolean z;
        int i2 = this.e;
        int i3 = 0;
        Object obj2 = this.h;
        int i4 = this.f;
        Object obj3 = this.g;
        fs0 fs0Var = fs0.a;
        switch (i2) {
            case 0:
                de0 de0Var = (de0) obj3;
                g40 g40Var = (g40) obj2;
                we weVar3 = (we) obj;
                if (de0Var.e == i4 && lw.i(g40Var, de0Var.f) && (weVar3 instanceof cf)) {
                    long[] jArr = g40Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = i3;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        Object obj4 = g40Var.b[i9];
                                        boolean z2 = g40Var.c[i9] != i4;
                                        if (z2) {
                                            i = i6;
                                            cf cfVar = (cf) weVar3;
                                            weVar2 = weVar3;
                                            k40 k40Var = cfVar.k;
                                            u10.C(k40Var, obj4, de0Var);
                                            z = z2;
                                            if (obj4 instanceof aj) {
                                                aj ajVar = (aj) obj4;
                                                if (!k40Var.c(ajVar)) {
                                                    u10.D(cfVar.n, ajVar);
                                                }
                                                k40 k40Var2 = de0Var.g;
                                                if (k40Var2 != null) {
                                                    k40Var2.j(obj4);
                                                }
                                            }
                                        } else {
                                            weVar2 = weVar3;
                                            z = z2;
                                            i = i6;
                                        }
                                        if (z) {
                                            g40Var.e(i9);
                                        }
                                    } else {
                                        weVar2 = weVar3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    weVar3 = weVar2;
                                }
                                weVar = weVar3;
                                if (i7 != i6) {
                                    break;
                                }
                            } else {
                                weVar = weVar3;
                            }
                            if (i5 == length) {
                                break;
                            } else {
                                i5++;
                                weVar3 = weVar;
                                i3 = 0;
                            }
                        }
                    }
                }
                break;
            default:
                pi0 pi0Var = (pi0) obj3;
                ec0 ec0Var = (ec0) obj2;
                dc0 dc0Var = (dc0) obj;
                int g = pi0Var.s.a.g();
                if (g < 0) {
                    g = 0;
                }
                if (g <= i4) {
                    i4 = g;
                }
                int i10 = -i4;
                boolean z3 = pi0Var.t;
                int i11 = z3 ? 0 : i10;
                if (!z3) {
                    i10 = 0;
                }
                dc0Var.e = true;
                dc0.i(dc0Var, ec0Var, i11, i10);
                dc0Var.e = false;
                break;
        }
        return fs0Var;
    }
}
