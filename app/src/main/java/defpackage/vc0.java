package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vc0 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final ArrayList m;
    public final long n;
    public boolean o;
    public boolean p;
    public vc0 q;

    public vc0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.o = z3;
        this.p = z3;
    }

    public final void a() {
        vc0 vc0Var = this.q;
        if (vc0Var == null) {
            this.o = true;
            this.p = true;
        } else if (vc0Var != null) {
            vc0Var.a();
        }
    }

    public final List b() {
        ArrayList arrayList = this.m;
        return arrayList == null ? um.e : arrayList;
    }

    public final boolean c() {
        vc0 vc0Var = this.q;
        return vc0Var != null ? vc0Var.c() : this.o || this.p;
    }

    public final String toString() {
        return "PointerInputChange(id=" + u10.G(this.a) + ", uptimeMillis=" + this.b + ", position=" + s60.g(this.c) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + s60.g(this.g) + ", previousPressed=" + this.h + ", isConsumed=" + c() + ", type=" + bd0.a(this.i) + ", historical=" + b() + ", scrollDelta=" + s60.g(this.j) + ", scaleFactor=" + this.k + ", panOffset=" + s60.g(this.l) + ")";
    }

    public vc0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = arrayList;
        this.n = j8;
    }
}
