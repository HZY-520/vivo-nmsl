package defpackage;

import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ct0 extends at0 {
    public final String e;
    public final List f;
    public final int g;
    public final dx0 h;
    public final float i;
    public final dx0 j;
    public final float k;
    public final float l;
    public final int m;
    public final int n;
    public final float o;
    public final float p;
    public final float q;
    public final float r;

    public ct0(String str, List list, int i, dx0 dx0Var, float f, dx0 dx0Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.e = str;
        this.f = list;
        this.g = i;
        this.h = dx0Var;
        this.i = f;
        this.j = dx0Var2;
        this.k = f2;
        this.l = f3;
        this.m = i2;
        this.n = i3;
        this.o = f4;
        this.p = f5;
        this.q = f6;
        this.r = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ct0.class != obj.getClass()) {
            return false;
        }
        ct0 ct0Var = (ct0) obj;
        return this.e.equals(ct0Var.e) && lw.i(this.h, ct0Var.h) && this.i == ct0Var.i && lw.i(this.j, ct0Var.j) && this.k == ct0Var.k && this.l == ct0Var.l && this.m == ct0Var.m && this.n == ct0Var.n && this.o == ct0Var.o && this.p == ct0Var.p && this.q == ct0Var.q && this.r == ct0Var.r && this.g == ct0Var.g && lw.i(this.f, ct0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + (this.e.hashCode() * 31)) * 31;
        dx0 dx0Var = this.h;
        int a = j2.a(this.i, (hashCode + (dx0Var != null ? dx0Var.hashCode() : 0)) * 31, 31);
        dx0 dx0Var2 = this.j;
        return Integer.hashCode(this.g) + j2.a(this.r, j2.a(this.q, j2.a(this.p, j2.a(this.o, j2.b(this.n, j2.b(this.m, j2.a(this.l, j2.a(this.k, (a + (dx0Var2 != null ? dx0Var2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
