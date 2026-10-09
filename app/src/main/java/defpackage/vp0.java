package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vp0 extends y20 {
    public final String a;
    public final zp0 b;
    public final gp c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;

    public vp0(String str, zp0 zp0Var, gp gpVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = zp0Var;
        this.c = gpVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.y20
    public final t20 d() {
        yp0 yp0Var = new yp0();
        yp0Var.s = this.a;
        yp0Var.t = this.b;
        yp0Var.u = this.c;
        yp0Var.v = this.d;
        yp0Var.w = this.e;
        yp0Var.x = this.f;
        yp0Var.y = this.g;
        return yp0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r5.a.a(r3.a) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.y20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(t20 t20Var) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        zp0 zp0Var;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        gp gpVar;
        gp gpVar2;
        int i5;
        int i6;
        yp0 yp0Var = (yp0) t20Var;
        yp0Var.getClass();
        zp0 zp0Var2 = yp0Var.t;
        boolean z5 = false;
        boolean z6 = true;
        zp0 zp0Var3 = this.b;
        if (zp0Var3 == zp0Var2) {
            zp0Var3.getClass();
        } else if (!zp0Var3.a.b(zp0Var2.a)) {
            z = true;
            str = yp0Var.s;
            str2 = this.a;
            if (lw.i(str, str2)) {
                yp0Var.s = str2;
                yp0Var.C = null;
                z2 = true;
            } else {
                z2 = false;
            }
            zp0Var = yp0Var.t;
            if (zp0Var == zp0Var3) {
                if (lw.i(zp0Var.b, zp0Var3.b)) {
                }
                boolean z7 = !z5;
                yp0Var.t = zp0Var3;
                i = yp0Var.y;
                i2 = this.g;
                if (i != i2) {
                    yp0Var.y = i2;
                    z7 = true;
                }
                i3 = yp0Var.x;
                i4 = this.f;
                if (i3 != i4) {
                    yp0Var.x = i4;
                    z7 = true;
                }
                z3 = yp0Var.w;
                z4 = this.e;
                if (z3 != z4) {
                    yp0Var.w = z4;
                    z7 = true;
                }
                gpVar = yp0Var.u;
                gpVar2 = this.c;
                if (!lw.i(gpVar, gpVar2)) {
                    yp0Var.u = gpVar2;
                    z7 = true;
                }
                i5 = yp0Var.v;
                i6 = this.d;
                if (i5 == i6) {
                    z6 = z7;
                } else {
                    yp0Var.v = i6;
                }
                if (!z2 || z6) {
                    p90 o0 = yp0Var.o0();
                    String str3 = yp0Var.s;
                    zp0 zp0Var4 = yp0Var.t;
                    gp gpVar3 = yp0Var.u;
                    int i7 = yp0Var.v;
                    boolean z8 = yp0Var.w;
                    int i8 = yp0Var.x;
                    int i9 = yp0Var.y;
                    o0.a = str3;
                    o0.b = zp0Var4;
                    o0.c = gpVar3;
                    o0.d = i7;
                    o0.e = z8;
                    o0.f = i8;
                    o0.g = i9;
                    o0.q = (o0.q << 2) | 2;
                    o0.b();
                }
                if (yp0Var.r) {
                    if (z2 || (z && yp0Var.B != null)) {
                        p30.i(yp0Var);
                    }
                    if (z2 || z6) {
                        kw.x(yp0Var);
                        lw.x(yp0Var);
                    }
                    if (z) {
                        lw.x(yp0Var);
                        return;
                    }
                    return;
                }
                return;
            }
            zp0Var.getClass();
            z5 = true;
            boolean z72 = !z5;
            yp0Var.t = zp0Var3;
            i = yp0Var.y;
            i2 = this.g;
            if (i != i2) {
            }
            i3 = yp0Var.x;
            i4 = this.f;
            if (i3 != i4) {
            }
            z3 = yp0Var.w;
            z4 = this.e;
            if (z3 != z4) {
            }
            gpVar = yp0Var.u;
            gpVar2 = this.c;
            if (!lw.i(gpVar, gpVar2)) {
            }
            i5 = yp0Var.v;
            i6 = this.d;
            if (i5 == i6) {
            }
            if (!z2) {
            }
            p90 o02 = yp0Var.o0();
            String str32 = yp0Var.s;
            zp0 zp0Var42 = yp0Var.t;
            gp gpVar32 = yp0Var.u;
            int i72 = yp0Var.v;
            boolean z82 = yp0Var.w;
            int i82 = yp0Var.x;
            int i92 = yp0Var.y;
            o02.a = str32;
            o02.b = zp0Var42;
            o02.c = gpVar32;
            o02.d = i72;
            o02.e = z82;
            o02.f = i82;
            o02.g = i92;
            o02.q = (o02.q << 2) | 2;
            o02.b();
            if (yp0Var.r) {
            }
        }
        z = false;
        str = yp0Var.s;
        str2 = this.a;
        if (lw.i(str, str2)) {
        }
        zp0Var = yp0Var.t;
        if (zp0Var == zp0Var3) {
        }
        z5 = true;
        boolean z722 = !z5;
        yp0Var.t = zp0Var3;
        i = yp0Var.y;
        i2 = this.g;
        if (i != i2) {
        }
        i3 = yp0Var.x;
        i4 = this.f;
        if (i3 != i4) {
        }
        z3 = yp0Var.w;
        z4 = this.e;
        if (z3 != z4) {
        }
        gpVar = yp0Var.u;
        gpVar2 = this.c;
        if (!lw.i(gpVar, gpVar2)) {
        }
        i5 = yp0Var.v;
        i6 = this.d;
        if (i5 == i6) {
        }
        if (!z2) {
        }
        p90 o022 = yp0Var.o0();
        String str322 = yp0Var.s;
        zp0 zp0Var422 = yp0Var.t;
        gp gpVar322 = yp0Var.u;
        int i722 = yp0Var.v;
        boolean z822 = yp0Var.w;
        int i822 = yp0Var.x;
        int i922 = yp0Var.y;
        o022.a = str322;
        o022.b = zp0Var422;
        o022.c = gpVar322;
        o022.d = i722;
        o022.e = z822;
        o022.f = i822;
        o022.g = i922;
        o022.q = (o022.q << 2) | 2;
        o022.b();
        if (yp0Var.r) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp0)) {
            return false;
        }
        vp0 vp0Var = (vp0) obj;
        return lw.i(this.a, vp0Var.a) && lw.i(this.b, vp0Var.b) && lw.i(this.c, vp0Var.c) && this.d == vp0Var.d && this.e == vp0Var.e && this.f == vp0Var.f && this.g == vp0Var.g;
    }

    public final int hashCode() {
        return (((j2.e(this.e, j2.b(this.d, (this.c.hashCode() + j2.d(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31) + this.f) * 31) + this.g) * 31;
    }
}
