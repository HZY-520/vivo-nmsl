package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class wi implements si {
    public final float e;
    public final float f;
    public final sp g;

    public wi(float f, float f2, sp spVar) {
        this.e = f;
        this.f = f2;
        this.g = spVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi)) {
            return false;
        }
        wi wiVar = (wi) obj;
        return Float.compare(this.e, wiVar.e) == 0 && Float.compare(this.f, wiVar.f) == 0 && this.g.equals(wiVar.g);
    }

    @Override // defpackage.si
    public final float g() {
        return this.f;
    }

    public final int hashCode() {
        return this.g.hashCode() + j2.a(this.f, Float.hashCode(this.e) * 31, 31);
    }

    @Override // defpackage.si
    public final float k() {
        return this.e;
    }

    @Override // defpackage.si
    public final long m(float f) {
        return u10.B(4294967296L, this.g.a(f));
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.e + ", fontScale=" + this.f + ", converter=" + this.g + ")";
    }

    @Override // defpackage.si
    public final float y(long j) {
        if (cq0.a(bq0.b(j), 4294967296L)) {
            return this.g.b(bq0.c(j));
        }
        z6.m("Only Sp can convert to Px");
        return 0.0f;
    }
}
