package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ys0 extends at0 implements Iterable, fx {
    public final String e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final List m;
    public final ArrayList n;

    public ys0(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.e = str;
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        this.j = f5;
        this.k = f6;
        this.l = f7;
        this.m = list;
        this.n = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ys0)) {
            return false;
        }
        ys0 ys0Var = (ys0) obj;
        return lw.i(this.e, ys0Var.e) && this.f == ys0Var.f && this.g == ys0Var.g && this.h == ys0Var.h && this.i == ys0Var.i && this.j == ys0Var.j && this.k == ys0Var.k && this.l == ys0Var.l && lw.i(this.m, ys0Var.m) && this.n.equals(ys0Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + ((this.m.hashCode() + j2.a(this.l, j2.a(this.k, j2.a(this.j, j2.a(this.i, j2.a(this.h, j2.a(this.g, j2.a(this.f, this.e.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new cb0(this);
    }
}
