package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class aj extends hn0 implements zm0 {
    public final eq f;
    public zi g = new zi(xl0.h().g());

    public aj(eq eqVar) {
        this.f = eqVar;
    }

    @Override // defpackage.gn0
    public final in0 a() {
        return this.g;
    }

    @Override // defpackage.gn0
    public final void c(in0 in0Var) {
        this.g = (zi) in0Var;
    }

    public final zi g(zi ziVar, ql0 ql0Var, boolean z, eq eqVar) {
        t40 a;
        ql0 h;
        in0 k;
        zi ziVar2;
        cw cwVar;
        int i;
        if (ziVar.c(this, ql0Var)) {
            if (z) {
                a = dm0.a();
                Object[] objArr = a.e;
                int i2 = a.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((fr) objArr[i3]).b();
                }
                try {
                    g40 g40Var = ziVar.e;
                    v6 v6Var = dm0.a;
                    cw cwVar2 = (cw) v6Var.n();
                    if (cwVar2 == null) {
                        cwVar2 = new cw();
                        v6Var.y(cwVar2);
                    }
                    int i4 = cwVar2.a;
                    Object[] objArr2 = g40Var.b;
                    int[] iArr = g40Var.c;
                    long[] jArr = g40Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        gn0 gn0Var = (gn0) objArr2[i9];
                                        i = i6;
                                        cwVar2.a = i4 + iArr[i9];
                                        pq e = ql0Var.e();
                                        if (e != null) {
                                            e.invoke(gn0Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    cwVar2.a = i4;
                    Object[] objArr3 = a.e;
                    int i10 = a.g;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((fr) objArr3[i11]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return ziVar;
        }
        g40 g40Var2 = new g40();
        v6 v6Var2 = dm0.a;
        cw cwVar3 = (cw) v6Var2.n();
        if (cwVar3 == null) {
            cwVar3 = new cw();
            v6Var2.y(cwVar3);
        }
        int i12 = cwVar3.a;
        a = dm0.a();
        Object[] objArr4 = a.e;
        int i13 = a.g;
        for (int i14 = 0; i14 < i13; i14++) {
            ((fr) objArr4[i14]).b();
        }
        try {
            cwVar3.a = i12 + 1;
            Object k2 = j20.k(new xc(this, cwVar3, g40Var2, i12), eqVar);
            cwVar3.a = i12;
            Object[] objArr5 = a.e;
            int i15 = a.g;
            for (int i16 = 0; i16 < i15; i16++) {
                ((fr) objArr5[i16]).a();
            }
            Object obj = xl0.c;
            synchronized (obj) {
                h = xl0.h();
                zi ziVar3 = this.g;
                synchronized (obj) {
                    k = xl0.k(ziVar3, this);
                    k.a(ziVar3);
                    k.a = h.g();
                }
                cwVar = (cw) dm0.a.n();
                if (cwVar != null || cwVar.a != 0) {
                    return ziVar2;
                }
                xl0.h().m();
                synchronized (obj) {
                    ql0 h2 = xl0.h();
                    ziVar2.c = h2.g();
                    ziVar2.d = h2.h();
                }
                return ziVar2;
            }
            ziVar2 = (zi) k;
            ziVar2.e = g40Var2;
            ziVar2.g = ziVar2.d(this, h);
            ziVar2.f = k2;
            cwVar = (cw) dm0.a.n();
            if (cwVar != null) {
            }
            return ziVar2;
        } finally {
            Object[] objArr6 = a.e;
            int i17 = a.g;
            for (int i18 = 0; i18 < i17; i18++) {
                ((fr) objArr6[i18]).a();
            }
        }
    }

    @Override // defpackage.zm0
    public final Object getValue() {
        pq e = xl0.h().e();
        if (e != null) {
            e.invoke(this);
        }
        ql0 h = xl0.h();
        return g((zi) xl0.g(this.g, h), h, true, this.f).f;
    }

    public final zi h() {
        ql0 h = xl0.h();
        return g((zi) xl0.g(this.g, h), h, false, this.f);
    }

    public final String toString() {
        zi ziVar = (zi) xl0.f(this.g);
        return "DerivedState(value=" + (ziVar.c(this, xl0.h()) ? String.valueOf(ziVar.f) : "<Not calculated>") + ")@" + hashCode();
    }
}
