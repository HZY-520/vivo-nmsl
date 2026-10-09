package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class xc0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public xc0(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc0)) {
            return false;
        }
        xc0 xc0Var = (xc0) obj;
        return u10.l(this.a, xc0Var.a) && this.b == xc0Var.b && s60.b(this.c, xc0Var.c) && s60.b(this.d, xc0Var.d) && this.e == xc0Var.e && Float.compare(this.f, xc0Var.f) == 0 && this.g == xc0Var.g && this.h == xc0Var.h && this.i.equals(xc0Var.i) && s60.b(this.j, xc0Var.j) && Float.compare(this.k, xc0Var.k) == 0 && s60.b(this.l, xc0Var.l) && s60.b(this.m, xc0Var.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + j2.c(j2.a(this.k, j2.c((this.i.hashCode() + j2.e(this.h, j2.b(this.g, j2.a(this.f, j2.e(this.e, j2.c(j2.c(j2.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), 31)) * 31, 31, this.j), 31), 31, this.l);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + u10.G(this.a) + ", uptime=" + this.b + ", positionOnScreen=" + s60.g(this.c) + ", position=" + s60.g(this.d) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + bd0.a(this.g) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + s60.g(this.j) + ", scaleGestureFactor=" + this.k + ", panGestureOffset=" + s60.g(this.l) + ", originalEventPosition=" + s60.g(this.m) + ")";
    }
}
