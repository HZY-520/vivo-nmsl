package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class kp0 {
    public static final ll a = new ll(new hf(27), 0);

    public static final void a(zp0 zp0Var, tq tqVar, se seVar, int i) {
        gr grVar = (gr) seVar;
        grVar.Q(15327438);
        int i2 = 4;
        int i3 = (grVar.e(zp0Var) ? 4 : 2) | i | (grVar.g(tqVar) ? 32 : 16);
        if (grVar.I(i3 & 1, (i3 & 19) != 18)) {
            ll llVar = a;
            nh.b(llVar.a(((zp0) grVar.i(llVar)).c(zp0Var)), tqVar, grVar, (i3 & 112) | 8);
        } else {
            grVar.L();
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new u3(zp0Var, tqVar, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, u20 u20Var, long j, final long j2, xp xpVar, long j3, long j4, int i, boolean z, int i2, int i3, zp0 zp0Var, se seVar, final int i4, final int i5) {
        String str2;
        int i6;
        long j5;
        xp xpVar2;
        int i7;
        final xp xpVar3;
        final long j6;
        final u20 u20Var2;
        final long j7;
        final long j8;
        final int i8;
        final boolean z2;
        final int i9;
        final int i10;
        final zp0 zp0Var2;
        de0 q;
        long j9;
        zp0 zp0Var3;
        int i11;
        boolean z3;
        int i12;
        int i13;
        xp xpVar4;
        long j10;
        u20 u20Var3;
        long j11;
        long b;
        gr grVar = (gr) seVar;
        grVar.Q(1809465675);
        if ((i4 & 6) == 0) {
            str2 = str;
            i6 = (grVar.e(str2) ? 4 : 2) | i4;
        } else {
            str2 = str;
            i6 = i4;
        }
        int i14 = i6 | 48;
        int i15 = i5 & 4;
        if (i15 != 0) {
            i14 = i6 | 432;
            j5 = j;
        } else {
            j5 = j;
            if ((i4 & 384) == 0) {
                i14 |= grVar.d(j5) ? 256 : 128;
            }
        }
        int i16 = i14 | 3072;
        if ((i4 & 24576) == 0) {
            i16 |= grVar.d(j2) ? 16384 : 8192;
        }
        int i17 = 196608 | i16;
        int i18 = i5 & 64;
        if (i18 != 0) {
            i17 = 1769472 | i16;
        } else if ((1572864 & i4) == 0) {
            xpVar2 = xpVar;
            i17 |= grVar.e(xpVar2) ? 1048576 : 524288;
            i7 = i17 | 918552576;
            if (grVar.I(i7 & 1, (306783379 & i7) == 306783378)) {
                grVar.L();
                xpVar3 = xpVar2;
                j6 = j5;
                u20Var2 = u20Var;
                j7 = j3;
                j8 = j4;
                i8 = i;
                z2 = z;
                i9 = i2;
                i10 = i3;
                zp0Var2 = zp0Var;
            } else {
                grVar.N();
                if ((i4 & 1) == 0 || grVar.v()) {
                    long j12 = i15 != 0 ? gc.f : j5;
                    if (i18 != 0) {
                        xpVar2 = null;
                    }
                    long j13 = bq0.c;
                    j9 = j12;
                    zp0Var3 = (zp0) grVar.i(a);
                    i11 = 1;
                    z3 = true;
                    i12 = 1;
                    i13 = Integer.MAX_VALUE;
                    xpVar4 = xpVar2;
                    j10 = j13;
                    u20Var3 = r20.a;
                    j11 = j10;
                } else {
                    grVar.L();
                    j11 = j3;
                    j10 = j4;
                    i11 = i;
                    z3 = z;
                    i13 = i2;
                    i12 = i3;
                    xpVar4 = xpVar2;
                    j9 = j5;
                    u20Var3 = u20Var;
                    zp0Var3 = zp0Var;
                }
                grVar.p();
                grVar.P(-565217106);
                if (j9 != 16) {
                    b = j9;
                } else {
                    grVar.P(-565216333);
                    b = zp0Var3.b();
                    if (b == 16) {
                        b = ((gc) grVar.i(dg.a)).a;
                    }
                    grVar.o(false);
                }
                grVar.o(false);
                u20 u20Var4 = u20Var3;
                int i19 = i11;
                boolean z4 = z3;
                int i20 = i13;
                int i21 = i12;
                q3.a(str2, u20Var4, zp0.d(zp0Var3, b, j2, xpVar4, j11, 0, j10, 16609104), i19, z4, i20, i21, grVar, ((i7 << 18) & 1879048192) | (i7 & 126) | 14380032);
                u20Var2 = u20Var4;
                long j14 = j10;
                i10 = i21;
                xpVar3 = xpVar4;
                j8 = j14;
                i9 = i20;
                zp0Var2 = zp0Var3;
                j7 = j11;
                i8 = i19;
                z2 = z4;
                j6 = j9;
            }
            q = grVar.q();
            if (q == null) {
                q.d = new tq() { // from class: jp0
                    @Override // defpackage.tq
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int q2 = v10.q(i4 | 1);
                        kp0.b(str, u20Var2, j6, j2, xpVar3, j7, j8, i8, z2, i9, i10, zp0Var2, (se) obj, q2, i5);
                        return fs0.a;
                    }
                };
                return;
            }
            return;
        }
        xpVar2 = xpVar;
        i7 = i17 | 918552576;
        if (grVar.I(i7 & 1, (306783379 & i7) == 306783378)) {
        }
        q = grVar.q();
        if (q == null) {
        }
    }
}
