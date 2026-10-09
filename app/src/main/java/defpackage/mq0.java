package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class mq0 {
    public final y30 a;
    public long b;
    public long c;
    public long d;
    public long e;

    public mq0() {
        y30 y30Var = wv.a;
        this.a = new y30();
        this.b = -1L;
        this.c = 0L;
        this.d = 0L;
    }

    public final boolean a(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (xv.a(j2, this.c)) {
            z = false;
        } else {
            this.c = j2;
            z = true;
        }
        if (!xv.a(j, this.d)) {
            this.d = j;
            z = true;
        }
        if (fArr != null) {
            z = true;
        }
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 == this.e) {
            return z;
        }
        this.e = j3;
        return true;
    }
}
