package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ht0 {
    public final boolean a;
    public final gt0 b;
    public final int c;
    public final lh[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public ht0(boolean z, gt0 gt0Var) {
        int i;
        this.a = z;
        this.b = gt0Var;
        if (z && gt0Var.equals(gt0.e)) {
            z6.m("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = gt0Var.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                z6.j();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new lh[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(long j, float f) {
        int i = (this.e + 1) % 20;
        this.e = i;
        lh[] lhVarArr = this.d;
        lh lhVar = lhVarArr[i];
        if (lhVar != null) {
            lhVar.a = j;
            lhVar.b = f;
        } else {
            lh lhVar2 = new lh();
            lhVar2.a = j;
            lhVar2.b = f;
            lhVarArr[i] = lhVar2;
        }
    }

    public final float b(float f) {
        gt0 gt0Var;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (f <= 0.0f) {
            cv.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.e;
        lh[] lhVarArr = this.d;
        lh lhVar = lhVarArr[i2];
        if (lhVar == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            lh lhVar2 = lhVar;
            while (true) {
                lh lhVar3 = lhVarArr[i2];
                boolean z2 = this.a;
                gt0Var = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (lhVar3 != null) {
                    long j = lhVar.a;
                    f2 = f5;
                    int i4 = i2;
                    long j2 = lhVar3.a;
                    float f6 = j - j2;
                    z = z2;
                    i = 1;
                    float abs = Math.abs(j2 - lhVar2.a);
                    lhVar2 = (gt0Var == gt0.e || z) ? lhVar3 : lhVar;
                    if (f6 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = lhVar3.b;
                    fArr2[i3] = -f6;
                    i2 = (i4 == 0 ? 20 : i4) - 1;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    f5 = f2;
                } else {
                    f2 = f5;
                    z = z2;
                    i = 1;
                    break;
                }
            }
            if (i3 >= this.c) {
                int ordinal = gt0Var.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.h;
                        z20.s(fArr2, fArr, i3, fArr3);
                        f4 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f4 = f2;
                    }
                } else {
                    if (ordinal != i) {
                        z6.j();
                        return f2;
                    }
                    int i5 = i3 - i;
                    float f7 = fArr2[i5];
                    int i6 = i5;
                    float f8 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f9 = fArr2[i7];
                        if (f7 != f9) {
                            float f10 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f7 - f9);
                            f8 += Math.abs(f10) * (f10 - (Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f))));
                            if (i6 == i5) {
                                f8 *= 0.5f;
                            }
                        }
                        i6--;
                        f7 = f9;
                    }
                    f4 = Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f));
                }
                f3 = f4 * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f11 = -f;
            if (f3 < f11) {
                return f11;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public /* synthetic */ ht0() {
        this(false, gt0.e);
    }

    public ht0(int i) {
        this(true, gt0.f);
    }
}
