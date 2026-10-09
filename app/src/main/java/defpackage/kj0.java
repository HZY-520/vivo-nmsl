package defpackage;

import android.widget.EdgeEffect;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class kj0 {
    public final /* synthetic */ mj0 a;

    public kj0(mj0 mj0Var) {
        this.a = mj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0247 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j, int i) {
        long j2;
        float intBitsToFloat;
        int i2;
        float h;
        float intBitsToFloat2;
        long floatToRawIntBits;
        long d;
        boolean z;
        boolean z2;
        float f;
        float f2;
        boolean z3;
        int i3;
        boolean z4;
        mj0 mj0Var = this.a;
        mj0Var.j = i;
        i4 i4Var = mj0Var.b;
        if (i4Var == null || !mj0Var.b()) {
            return mj0Var.d(mj0Var.k, j, i);
        }
        int i4 = mj0Var.j;
        mj0 mj0Var2 = (mj0) mj0Var.m.f;
        ql qlVar = i4Var.c;
        if (hl0.c(i4Var.g)) {
            return new s60(mj0Var2.d(mj0Var2.k, j, mj0Var2.j)).a;
        }
        if (!i4Var.f) {
            if (ql.g(qlVar.f)) {
                i4Var.g(0L);
            }
            if (ql.g(qlVar.g)) {
                i4Var.h(0L);
            }
            if (ql.g(qlVar.d)) {
                i4Var.i(0L);
            }
            if (ql.g(qlVar.e)) {
                i4Var.f(0L);
            }
            i4Var.f = true;
        }
        int i5 = u4.a;
        float f3 = i4 == 2 ? 4.0f : 1.0f;
        long f4 = s60.f(j, f3);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!ql.g(qlVar.d) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (ql.g(qlVar.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    float f5 = i4Var.f(f4);
                    if (!ql.g(qlVar.e)) {
                        qlVar.b().finish();
                    }
                    intBitsToFloat = f5 == Float.intBitsToFloat((int) (f4 & 4294967295L)) ? Float.intBitsToFloat(i6) : f5 / f3;
                }
            } else {
                float i7 = i4Var.i(f4);
                j2 = 4294967295L;
                if (!ql.g(qlVar.d)) {
                    qlVar.e().finish();
                }
                intBitsToFloat = i7 == Float.intBitsToFloat((int) (f4 & 4294967295L)) ? Float.intBitsToFloat(i6) : i7 / f3;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                if (ql.g(qlVar.f) && Float.intBitsToFloat(i2) < 0.0f) {
                    h = i4Var.g(f4);
                    if (!ql.g(qlVar.f)) {
                        qlVar.c().finish();
                    }
                    if (h == Float.intBitsToFloat((int) (f4 >> 32))) {
                        intBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                    intBitsToFloat2 = h / f3;
                } else if (ql.g(qlVar.g) && Float.intBitsToFloat(i2) > 0.0f) {
                    h = i4Var.h(f4);
                    if (!ql.g(qlVar.g)) {
                        qlVar.d().finish();
                    }
                    if (h == Float.intBitsToFloat((int) (f4 >> 32))) {
                        intBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                    intBitsToFloat2 = h / f3;
                }
                floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
                if (!s60.b(floatToRawIntBits, 0L)) {
                    i4Var.d();
                }
                d = s60.d(j, floatToRawIntBits);
                long j3 = new s60(mj0Var2.d(mj0Var2.k, d, mj0Var2.j)).a;
                long d2 = s60.d(d, j3);
                if ((Float.intBitsToFloat((int) (d >> 32)) == 0.0f || Float.intBitsToFloat((int) (d & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (ql.g(qlVar.f) || ql.g(qlVar.d) || ql.g(qlVar.g) || ql.g(qlVar.e)))) {
                    i4Var.a();
                }
                if (i4 == 1) {
                    int i8 = (int) (d2 >> 32);
                    if (Float.intBitsToFloat(i8) > 0.5f) {
                        i4Var.g(d2);
                    } else {
                        if (Float.intBitsToFloat(i8) >= -0.5f) {
                            f = 0.5f;
                            f2 = -0.5f;
                            z3 = false;
                            i3 = (int) (d2 & j2);
                            if (Float.intBitsToFloat(i3) <= f) {
                                i4Var.i(d2);
                            } else if (Float.intBitsToFloat(i3) < f2) {
                                i4Var.f(d2);
                            } else {
                                z4 = false;
                                if (!z3 || z4) {
                                    z = true;
                                    if (!s60.b(d, 0L)) {
                                        if (!ql.f(qlVar.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                                            z2 = false;
                                        } else {
                                            EdgeEffect c = qlVar.c();
                                            float intBitsToFloat3 = Float.intBitsToFloat(i2);
                                            if (c instanceof bs) {
                                                bs bsVar = (bs) c;
                                                float f6 = bsVar.b + intBitsToFloat3;
                                                bsVar.b = f6;
                                                if (Math.abs(f6) > bsVar.a) {
                                                    bsVar.onRelease();
                                                }
                                            } else {
                                                c.onRelease();
                                            }
                                            z2 = ql.f(qlVar.f);
                                        }
                                        if (ql.f(qlVar.g) && Float.intBitsToFloat(i2) > 0.0f) {
                                            EdgeEffect d3 = qlVar.d();
                                            float intBitsToFloat4 = Float.intBitsToFloat(i2);
                                            if (d3 instanceof bs) {
                                                bs bsVar2 = (bs) d3;
                                                float f7 = bsVar2.b + intBitsToFloat4;
                                                bsVar2.b = f7;
                                                if (Math.abs(f7) > bsVar2.a) {
                                                    bsVar2.onRelease();
                                                }
                                            } else {
                                                d3.onRelease();
                                            }
                                            z2 = z2 || ql.f(qlVar.g);
                                        }
                                        if (ql.f(qlVar.d) && Float.intBitsToFloat(i6) < 0.0f) {
                                            EdgeEffect e = qlVar.e();
                                            float intBitsToFloat5 = Float.intBitsToFloat(i6);
                                            if (e instanceof bs) {
                                                bs bsVar3 = (bs) e;
                                                float f8 = bsVar3.b + intBitsToFloat5;
                                                bsVar3.b = f8;
                                                if (Math.abs(f8) > bsVar3.a) {
                                                    bsVar3.onRelease();
                                                }
                                            } else {
                                                e.onRelease();
                                            }
                                            z2 = z2 || ql.f(qlVar.d);
                                        }
                                        if (ql.f(qlVar.e) && Float.intBitsToFloat(i6) > 0.0f) {
                                            EdgeEffect b = qlVar.b();
                                            float intBitsToFloat6 = Float.intBitsToFloat(i6);
                                            if (b instanceof bs) {
                                                bs bsVar4 = (bs) b;
                                                float f9 = bsVar4.b + intBitsToFloat6;
                                                bsVar4.b = f9;
                                                if (Math.abs(f9) > bsVar4.a) {
                                                    bsVar4.onRelease();
                                                }
                                            } else {
                                                b.onRelease();
                                            }
                                            z2 = z2 || ql.f(qlVar.e);
                                        }
                                        z = z2 || z;
                                    }
                                    if (z) {
                                        i4Var.d();
                                    }
                                    return s60.e(floatToRawIntBits, j3);
                                }
                            }
                            z4 = true;
                            if (!z3) {
                            }
                            z = true;
                            if (!s60.b(d, 0L)) {
                            }
                            if (z) {
                            }
                            return s60.e(floatToRawIntBits, j3);
                        }
                        i4Var.h(d2);
                    }
                    f = 0.5f;
                    f2 = -0.5f;
                    z3 = true;
                    i3 = (int) (d2 & j2);
                    if (Float.intBitsToFloat(i3) <= f) {
                    }
                    z4 = true;
                    if (!z3) {
                    }
                    z = true;
                    if (!s60.b(d, 0L)) {
                    }
                    if (z) {
                    }
                    return s60.e(floatToRawIntBits, j3);
                }
                z = false;
                if (!s60.b(d, 0L)) {
                }
                if (z) {
                }
                return s60.e(floatToRawIntBits, j3);
            }
            intBitsToFloat2 = 0.0f;
            floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
            if (!s60.b(floatToRawIntBits, 0L)) {
            }
            d = s60.d(j, floatToRawIntBits);
            long j32 = new s60(mj0Var2.d(mj0Var2.k, d, mj0Var2.j)).a;
            long d22 = s60.d(d, j32);
            if (Float.intBitsToFloat((int) (d >> 32)) == 0.0f) {
            }
            i4Var.a();
            if (i4 == 1) {
            }
            z = false;
            if (!s60.b(d, 0L)) {
            }
            if (z) {
            }
            return s60.e(floatToRawIntBits, j32);
        }
        j2 = 4294967295L;
        intBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
        }
        intBitsToFloat2 = 0.0f;
        floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
        if (!s60.b(floatToRawIntBits, 0L)) {
        }
        d = s60.d(j, floatToRawIntBits);
        long j322 = new s60(mj0Var2.d(mj0Var2.k, d, mj0Var2.j)).a;
        long d222 = s60.d(d, j322);
        if (Float.intBitsToFloat((int) (d >> 32)) == 0.0f) {
        }
        i4Var.a();
        if (i4 == 1) {
        }
        z = false;
        if (!s60.b(d, 0L)) {
        }
        if (z) {
        }
        return s60.e(floatToRawIntBits, j322);
    }
}
