package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class wt {
    public static int k;
    public static final i2 l = new i2(23);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final ys0 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public wt(String str, float f, float f2, float f3, float f4, ys0 ys0Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = ys0Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt)) {
            return false;
        }
        wt wtVar = (wt) obj;
        if (!lw.i(this.a, wtVar.a) || !ck.b(this.b, wtVar.b) || !ck.b(this.c, wtVar.c) || this.d != wtVar.d || this.e != wtVar.e || !this.f.equals(wtVar.f)) {
            return false;
        }
        long j = wtVar.g;
        int i = gc.g;
        return as0.a(this.g, j) && this.h == wtVar.h && this.i == wtVar.i;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + j2.a(this.e, j2.a(this.d, j2.a(this.c, j2.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = gc.g;
        return Boolean.hashCode(this.i) + j2.b(this.h, j2.c(hashCode, 31, this.g), 31);
    }
}
