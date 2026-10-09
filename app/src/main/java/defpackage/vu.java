package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vu implements cl {
    public final ej0 e;
    public qu f;
    public tu g;
    public su h;
    public ru i;
    public dx0 j;
    public t3 k;
    public sq0 l;
    public final jd m;
    public final jd n;

    public vu(ej0 ej0Var) {
        this.e = ej0Var;
        jd jdVar = new jd();
        jdVar.f = new h40();
        this.m = jdVar;
        jd jdVar2 = new jd();
        jdVar2.f = new c40();
        this.n = jdVar2;
    }

    public static void c(vu vuVar, ou ouVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        ej0 ej0Var = vuVar.e;
        su suVar = vuVar.h;
        if (suVar == null) {
            suVar = new su();
            suVar.G = null;
            suVar.H = Long.MAX_VALUE;
            suVar.I = false;
            vuVar.h = suVar;
        }
        suVar.G = ouVar;
        suVar.H = j;
        sq0 sq0Var = vuVar.l;
        q80 q80Var = ej0Var.u;
        if (sq0Var == null) {
            vuVar.l = new sq0(q80Var);
        } else {
            sq0Var.a = q80Var;
            sq0Var.b = j2;
        }
        suVar.I = false;
        vuVar.j = suVar;
    }

    @Override // defpackage.rr
    public final String X() {
        dx0 dx0Var = this.j;
        return dx0Var instanceof qu ? ((qu) dx0Var).I ? "waiting" : "idle" : ((dx0Var instanceof su) || (dx0Var instanceof ru)) ? "waiting" : dx0Var instanceof tu ? "recognized" : "idle";
    }

    public final void a() {
        qu quVar = this.f;
        pu puVar = pu.g;
        if (quVar == null) {
            quVar = new qu();
            quVar.G = puVar;
            quVar.H = false;
            quVar.I = false;
            this.f = quVar;
        }
        quVar.G = puVar;
        quVar.H = false;
        quVar.I = false;
        this.j = quVar;
    }

    public final void b(ou ouVar, long j, sq0 sq0Var) {
        ru ruVar = this.i;
        if (ruVar == null) {
            ruVar = new ru();
            ruVar.G = null;
            ruVar.H = Long.MAX_VALUE;
            this.i = ruVar;
        }
        ruVar.G = ouVar;
        ruVar.H = j;
        sq0Var.b = 0L;
        this.j = ruVar;
    }

    public final t3 d() {
        t3 t3Var = this.k;
        if (t3Var != null) {
            return t3Var;
        }
        z6.l("Velocity Tracker not initialized.");
        return null;
    }

    @Override // defpackage.cl
    public final q80 e() {
        return this.e.u;
    }

    public final void f(ou ouVar, nu nuVar, long j) {
        long j2;
        float intBitsToFloat;
        long j3 = ouVar.c;
        ej0 ej0Var = this.e;
        q80 q80Var = ej0Var.u;
        q80Var.getClass();
        int i = el.a;
        long j4 = 4294967295L;
        if (Math.abs(Float.intBitsToFloat((int) (q80Var == q80.e ? j & 4294967295L : j >> 32))) > 2.0f) {
            t3 d = d();
            q80 q80Var2 = ej0Var.u;
            jd jdVar = this.m;
            h40 h40Var = (h40) jdVar.f;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            if (q3.g(ouVar)) {
                jdVar.e = 0;
                h40Var.d();
            }
            float f = 0.0f;
            if (q3.h(ouVar) || q3.g(ouVar)) {
                j2 = 4294967295L;
            } else {
                if (h40Var.b == 3) {
                    int i2 = jdVar.e;
                    jdVar.e = i2 + 1;
                    h40Var.o(i2, ouVar);
                } else {
                    h40Var.a(ouVar);
                }
                if (jdVar.e == 3) {
                    jdVar.e = 0;
                }
                Object[] objArr = h40Var.a;
                int i3 = h40Var.b;
                int i4 = 0;
                float f2 = 0.0f;
                while (i4 < i3) {
                    f2 += Float.intBitsToFloat((int) (((ou) objArr[i4]).c >> 32));
                    i4++;
                    j4 = j4;
                }
                j2 = j4;
                int i5 = h40Var.b;
                intBitsToFloat2 = f2 / i5;
                Object[] objArr2 = h40Var.a;
                float f3 = 0.0f;
                for (int i6 = 0; i6 < i5; i6++) {
                    f3 += Float.intBitsToFloat((int) (((ou) objArr2[i6]).c & j2));
                }
                intBitsToFloat3 = f3 / h40Var.b;
            }
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat3) & j2) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
            if (q80Var2 != null) {
                int i7 = nuVar.a;
                if (i7 == 1) {
                    intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                } else if (i7 == 2) {
                    intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & j2));
                }
                floatToRawIntBits = q80Var2 == q80.f ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & j2) : (Float.floatToRawIntBits(intBitsToFloat) & j2) | (Float.floatToRawIntBits(0.0f) << 32);
            }
            ((e10) d.f).a(ouVar.b, floatToRawIntBits);
            jd jdVar2 = this.n;
            c40 c40Var = (c40) jdVar2.f;
            int i8 = c40Var.b;
            if (i8 == 3) {
                int i9 = jdVar2.e;
                jdVar2.e = i9 + 1;
                if (i9 < 0 || i9 >= i8) {
                    z6.f("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = c40Var.a;
                    long j5 = jArr[i9];
                    jArr[i9] = j;
                }
            } else {
                c40Var.a(j);
            }
            if (jdVar2.e == 3) {
                jdVar2.e = 0;
            }
            long[] jArr2 = c40Var.a;
            int i10 = c40Var.b;
            float f4 = 0.0f;
            for (int i11 = 0; i11 < i10; i11++) {
                f4 += Float.intBitsToFloat((int) (jArr2[i11] >> 32));
            }
            int i12 = c40Var.b;
            float f5 = f4 / i12;
            long[] jArr3 = c40Var.a;
            for (int i13 = 0; i13 < i12; i13++) {
                f = Float.intBitsToFloat((int) (jArr3[i13] & j2)) + f;
            }
            ej0Var.v0(new ok((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f / c40Var.b) & j2), true));
        }
    }

    public final void g(ou ouVar, ou ouVar2, nu nuVar, long j) {
        char c;
        long j2;
        float intBitsToFloat;
        if (this.k == null) {
            this.k = new t3(28);
        }
        t3 d = d();
        ej0 ej0Var = this.e;
        q80 q80Var = ej0Var.u;
        jd jdVar = this.m;
        h40 h40Var = (h40) jdVar.f;
        char c2 = ' ';
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ouVar.c >> 32));
        long j3 = 4294967295L;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (ouVar.c & 4294967295L));
        if (q3.g(ouVar)) {
            jdVar.e = 0;
            h40Var.d();
        }
        if (q3.h(ouVar) || q3.g(ouVar)) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            if (h40Var.b == 3) {
                int i = jdVar.e;
                jdVar.e = i + 1;
                h40Var.o(i, ouVar);
            } else {
                h40Var.a(ouVar);
            }
            if (jdVar.e == 3) {
                jdVar.e = 0;
            }
            Object[] objArr = h40Var.a;
            int i2 = h40Var.b;
            int i3 = 0;
            float f = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                f += Float.intBitsToFloat((int) (((ou) objArr[i3]).c >> c3));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j2 = j3;
            int i4 = h40Var.b;
            intBitsToFloat2 = f / i4;
            Object[] objArr2 = h40Var.a;
            float f2 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                f2 += Float.intBitsToFloat((int) (((ou) objArr2[i5]).c & j2));
            }
            intBitsToFloat3 = f2 / h40Var.b;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << c) | (Float.floatToRawIntBits(intBitsToFloat3) & j2);
        if (q80Var != null) {
            int i6 = nuVar.a;
            if (i6 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> c));
            } else if (i6 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & j2));
            }
            floatToRawIntBits = q80Var == q80.f ? (Float.floatToRawIntBits(intBitsToFloat) << c) | (Float.floatToRawIntBits(0.0f) & j2) : (Float.floatToRawIntBits(0.0f) << c) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
        }
        ((e10) d.f).a(ouVar.b, floatToRawIntBits);
        long d2 = s60.d(q3.L(ouVar2, ej0Var.u, nuVar), j);
        ej0Var.v.getClass();
        ej0Var.v0(new pk(d2));
        jd jdVar2 = this.n;
        jdVar2.e = 0;
        ((c40) jdVar2.f).b = 0;
    }
}
