package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class ue {
    public static final h70 a = new h70("provider");
    public static final h70 b = new h70("provider");
    public static final h70 c = new h70("compositionLocalMap");
    public static final h70 d = new h70("providers");
    public static final h70 e = new h70("reference");

    public static final void a(String str) {
        throw new ee(j2.j("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void b(String str) {
        throw new ee(j2.j("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0150, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(ol0 ol0Var, bf0 bf0Var) {
        n nVar;
        int i;
        int i2;
        n nVar2;
        int i3;
        int i4 = ol0Var.t;
        int i5 = 5;
        n nVar3 = new n(i5, bf0Var);
        int B = ol0Var.B(ol0Var.b, i4);
        int n = ol0Var.n();
        int s = ol0Var.s(i4) + i4;
        int i6 = i4;
        z30 z30Var = null;
        x30 x30Var = null;
        loop0: while (i6 < s) {
            int f = ol0Var.f(ol0Var.b, ol0Var.p(i6));
            int i7 = i6 + 1;
            int f2 = ol0Var.f(ol0Var.b, ol0Var.p(i7));
            while (f < f2) {
                int i8 = i5;
                Object obj = ol0Var.c[ol0Var.g(f)];
                if (obj instanceof lr) {
                    lr lrVar = (lr) obj;
                    if (!(lrVar instanceof lr)) {
                        lrVar = null;
                    }
                    if (lrVar == null) {
                        b("Inconsistent composition");
                        throw new id();
                    }
                    int i9 = lrVar.b;
                    if (i9 >= 0) {
                        int s2 = ol0Var.s(i6) + i6;
                        int i10 = i7;
                        int i11 = 0;
                        while (i10 < s2 && i11 < i9) {
                            int p = ol0Var.p(i10);
                            int i12 = B;
                            int[] iArr = ol0Var.b;
                            int i13 = p * 5;
                            i10 = iArr[i13 + 3] + i10;
                            if (i10 < s2 && (iArr[i13 + 1] & 536870912) == 0) {
                                i11++;
                            }
                            B = i12;
                        }
                        i3 = B;
                        if (z30Var == null) {
                            int[] iArr2 = dw.a;
                            z30Var = new z30();
                        }
                        if (x30Var == null) {
                            x30Var = new x30();
                        }
                        z30Var.a(i10);
                        x30Var.a(i10);
                        x30Var.a(f);
                        f++;
                        i5 = i8;
                        B = i3;
                    }
                }
                i3 = B;
                nVar3.invoke(Integer.valueOf(f), obj);
                f++;
                i5 = i8;
                B = i3;
            }
            int i14 = i5;
            int i15 = B;
            B = i7 < n ? ol0Var.B(ol0Var.b, i7) : -1;
            if (B != i6) {
                int i16 = i15;
                while (true) {
                    if (x30Var == null || z30Var == null || !z30Var.e(i6)) {
                        nVar = nVar3;
                        i = n;
                    } else {
                        int i17 = x30Var.b;
                        int i18 = i17 / 2;
                        int i19 = 0;
                        int i20 = 0;
                        while (i19 < i18) {
                            int i21 = i19 * 2;
                            int i22 = n;
                            int b2 = x30Var.b(i21);
                            if (b2 == i6) {
                                int b3 = x30Var.b(i21 + 1);
                                nVar3.invoke(Integer.valueOf(b3), ol0Var.c[ol0Var.g(b3)]);
                                nVar2 = nVar3;
                            } else if (i21 != i20) {
                                nVar2 = nVar3;
                                int i23 = i20 + 1;
                                x30Var.d(i20, b2);
                                i20 += 2;
                                x30Var.d(i23, x30Var.b(i21 + 1));
                            } else {
                                nVar2 = nVar3;
                                i20 += 2;
                            }
                            i19++;
                            n = i22;
                            nVar3 = nVar2;
                        }
                        nVar = nVar3;
                        i = n;
                        if (i20 != i17) {
                            if (i20 < 0 || i20 > (i2 = x30Var.b) || i17 < 0 || i17 > i2) {
                                break loop0;
                            }
                            if (i17 < i20) {
                                z6.l("The end index must be < start index");
                                return;
                            } else if (i17 != i20) {
                                if (i17 < i2) {
                                    int[] iArr3 = x30Var.a;
                                    o7.P(iArr3, iArr3, i20, i17, i2);
                                }
                                x30Var.b -= i17 - i20;
                            }
                        }
                    }
                    if (i6 != i4 && i16 != B) {
                        i6 = i16;
                        n = i;
                        i16 = ol0Var.B(ol0Var.b, i16);
                        nVar3 = nVar;
                    }
                }
            } else {
                nVar = nVar3;
                i = n;
            }
            i6 = i7;
            i5 = i14;
            n = i;
            nVar3 = nVar;
        }
        ol0Var.E();
    }
}
