package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class zn implements xn {
    public final int a;
    public final nl b;
    public final long c;
    public final long d = 0;

    public zn(int i, nl nlVar) {
        this.a = i;
        this.b = nlVar;
        this.c = i * 1000000;
    }

    @Override // defpackage.xn
    public final float b(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        float a = this.b.a(this.a == 0 ? 1.0f : j2 / j3);
        return (f2 * a) + ((1.0f - a) * f);
    }

    @Override // defpackage.xn
    public final float c(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (b(j4, f, f2, f3) - b(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.xn
    public final long d(float f, float f2, float f3) {
        return this.d + this.c;
    }
}
