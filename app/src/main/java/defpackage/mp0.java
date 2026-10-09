package defpackage;

import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class mp0 {
    public final p6 a;
    public final zp0 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final si g;
    public final xx h;
    public final gp i;
    public final long j;

    public mp0(p6 p6Var, zp0 zp0Var, List list, int i, boolean z, int i2, si siVar, xx xxVar, gp gpVar, long j) {
        this.a = p6Var;
        this.b = zp0Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = siVar;
        this.h = xxVar;
        this.i = gpVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp0)) {
            return false;
        }
        mp0 mp0Var = (mp0) obj;
        return lw.i(this.a, mp0Var.a) && lw.i(this.b, mp0Var.b) && this.c.equals(mp0Var.c) && this.d == mp0Var.d && this.e == mp0Var.e && this.f == mp0Var.f && lw.i(this.g, mp0Var.g) && this.h == mp0Var.h && lw.i(this.i, mp0Var.i) && wf.b(this.j, mp0Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + j2.b(this.f, j2.e(this.e, (((this.c.hashCode() + j2.d(this.b, this.a.hashCode() * 31, 31)) * 31) + this.d) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        int i = this.f;
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid") + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + wf.k(this.j) + ")";
    }
}
