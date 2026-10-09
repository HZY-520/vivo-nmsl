package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class pg0 implements tk0 {
    public final qg a;
    public final qg b;
    public final qg c;
    public final qg d;

    public pg0(qg qgVar, qg qgVar2, qg qgVar3, qg qgVar4) {
        this.a = qgVar;
        this.b = qgVar2;
        this.c = qgVar3;
        this.d = qgVar4;
    }

    @Override // defpackage.tk0
    public final v10 a(long j, xx xxVar, si siVar) {
        float a = this.a.a(j, siVar);
        float a2 = this.b.a(j, siVar);
        float a3 = this.c.a(j, siVar);
        float a4 = this.d.a(j, siVar);
        float b = hl0.b(j);
        float f = a + a4;
        if (f > b) {
            float f2 = b / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a2 + a3;
        if (f3 > b) {
            float f4 = b / f3;
            a2 *= f4;
            a3 *= f4;
        }
        if (a < 0.0f || a2 < 0.0f || a3 < 0.0f || a4 < 0.0f) {
            fv.a("Corner size in Px can't be negative(topStart = " + a + ", topEnd = " + a2 + ", bottomEnd = " + a3 + ", bottomStart = " + a4 + ")!");
        }
        if (a + a2 + a3 + a4 == 0.0f) {
            return new t80(z20.a(0L, j));
        }
        oe0 a5 = z20.a(0L, j);
        xx xxVar2 = xx.e;
        float f5 = xxVar == xxVar2 ? a : a2;
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
        if (xxVar == xxVar2) {
            a = a2;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(a) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
        float f6 = xxVar == xxVar2 ? a3 : a4;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
        if (xxVar != xxVar2) {
            a4 = a3;
        }
        return new u80(new ng0(a5.a, a5.b, a5.c, a5.d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(a4) << 32) | (Float.floatToRawIntBits(a4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg0)) {
            return false;
        }
        pg0 pg0Var = (pg0) obj;
        return lw.i(this.a, pg0Var.a) && lw.i(this.b, pg0Var.b) && lw.i(this.c, pg0Var.c) && lw.i(this.d, pg0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}
