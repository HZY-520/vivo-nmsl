package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class i4 {
    public final si a;
    public long b = 9205357640488583168L;
    public final ql c;
    public final w90 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final oi i;

    public i4(Context context, si siVar, long j, f90 f90Var) {
        this.a = siVar;
        ql qlVar = new ql(context, lw.F(j));
        this.c = qlVar;
        this.d = new w90(fs0.a, b2.R);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        h4 h4Var = new h4(this);
        rc0 rc0Var = io0.a;
        ko0 ko0Var = new ko0(null, null, h4Var);
        this.i = Build.VERSION.SDK_INT >= 31 ? new cs(ko0Var, this, qlVar) : new cs(ko0Var, this, qlVar, f90Var);
    }

    public final void a() {
        boolean z;
        ql qlVar = this.c;
        EdgeEffect edgeEffect = qlVar.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = qlVar.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = qlVar.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = qlVar.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0137, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, lj0 lj0Var, og ogVar) {
        f4 f4Var;
        int i;
        long d;
        long d2;
        if (ogVar instanceof f4) {
            f4Var = (f4) ogVar;
            int i2 = f4Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f4Var.h = i2 - Integer.MIN_VALUE;
                Object obj = f4Var.f;
                i = f4Var.h;
                fs0 fs0Var = fs0.a;
                ql qlVar = this.c;
                if (i != 0) {
                    t30.z(obj);
                    boolean c = hl0.c(this.g);
                    dh dhVar = dh.e;
                    if (c) {
                        f4Var.h = 1;
                        lj0Var.getClass();
                        lj0 lj0Var2 = new lj0(lj0Var.h, f4Var);
                        lj0Var2.g = j;
                        if (lj0Var2.invokeSuspend(fs0Var) != dhVar) {
                            return fs0Var;
                        }
                    } else {
                        boolean g = ql.g(qlVar.f);
                        si siVar = this.a;
                        long a = m20.a((!g || ft0.b(j) >= 0.0f) ? (!ql.g(qlVar.g) || ft0.b(j) <= 0.0f) ? 0.0f : -dx0.c(qlVar.d(), -ft0.b(j), Float.intBitsToFloat((int) (this.g >> 32)), siVar) : dx0.c(qlVar.c(), ft0.b(j), Float.intBitsToFloat((int) (this.g >> 32)), siVar), (!ql.g(qlVar.d) || ft0.c(j) >= 0.0f) ? (!ql.g(qlVar.e) || ft0.c(j) <= 0.0f) ? 0.0f : -dx0.c(qlVar.b(), -ft0.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), siVar) : dx0.c(qlVar.e(), ft0.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), siVar));
                        if (a != 0) {
                            d();
                        }
                        d = ft0.d(j, a);
                        f4Var.e = d;
                        f4Var.h = 2;
                        lj0Var.getClass();
                        lj0 lj0Var3 = new lj0(lj0Var.h, f4Var);
                        lj0Var3.g = d;
                        obj = lj0Var3.invokeSuspend(fs0Var);
                    }
                    return dhVar;
                }
                if (i == 1) {
                    t30.z(obj);
                    return fs0Var;
                }
                if (i != 2) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d = f4Var.e;
                t30.z(obj);
                d2 = ft0.d(d, ((ft0) obj).a);
                this.f = false;
                if (ft0.b(d2) <= 0.0f) {
                    EdgeEffect c2 = qlVar.c();
                    int B = t10.B(ft0.b(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        c2.onAbsorb(B);
                    } else if (c2.isFinished()) {
                        c2.onAbsorb(B);
                    }
                } else if (ft0.b(d2) < 0.0f) {
                    EdgeEffect d3 = qlVar.d();
                    int i3 = -t10.B(ft0.b(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        d3.onAbsorb(i3);
                    } else if (d3.isFinished()) {
                        d3.onAbsorb(i3);
                    }
                }
                if (ft0.c(d2) <= 0.0f) {
                    EdgeEffect e = qlVar.e();
                    int B2 = t10.B(ft0.c(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e.onAbsorb(B2);
                    } else if (e.isFinished()) {
                        e.onAbsorb(B2);
                    }
                } else if (ft0.c(d2) < 0.0f) {
                    EdgeEffect b = qlVar.b();
                    int i4 = -t10.B(ft0.c(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        b.onAbsorb(i4);
                    } else if (b.isFinished()) {
                        b.onAbsorb(i4);
                    }
                }
                a();
                return fs0Var;
            }
        }
        f4Var = new f4(this, ogVar);
        Object obj2 = f4Var.f;
        i = f4Var.h;
        fs0 fs0Var2 = fs0.a;
        ql qlVar2 = this.c;
        if (i != 0) {
        }
        d2 = ft0.d(d, ((ft0) obj2).a);
        this.f = false;
        if (ft0.b(d2) <= 0.0f) {
        }
        if (ft0.c(d2) <= 0.0f) {
        }
        a();
        return fs0Var2;
    }

    public final long c() {
        long j = this.b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = t30.k(this.g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(fs0.a);
        }
    }

    public final boolean e() {
        ql qlVar = this.c;
        EdgeEffect edgeEffect = qlVar.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? x3.d(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = qlVar.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? x3.d(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = qlVar.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? x3.d(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = qlVar.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? x3.d(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final float f(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect b = this.c.b();
        float f = -intBitsToFloat2;
        float f2 = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = x3.f(b, f, f2);
        } else {
            b.onPull(f, f2);
        }
        return (i2 >= 31 ? x3.d(b) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect c = this.c.c();
        float f = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = x3.f(c, intBitsToFloat2, f);
        } else {
            c.onPull(intBitsToFloat2, f);
        }
        return (i2 >= 31 ? x3.d(c) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect d = this.c.d();
        float f = -intBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = x3.f(d, f, intBitsToFloat);
        } else {
            d.onPull(f, intBitsToFloat);
        }
        return (i2 >= 31 ? x3.d(d) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect e = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = x3.f(e, intBitsToFloat2, intBitsToFloat);
        } else {
            e.onPull(intBitsToFloat2, intBitsToFloat);
        }
        return (i2 >= 31 ? x3.d(e) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void j(long j) {
        boolean a = hl0.a(this.g, 0L);
        boolean a2 = hl0.a(j, this.g);
        this.g = j;
        if (!a2) {
            long B = (t10.B(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (t10.B(Float.intBitsToFloat((int) (j >> 32))) << 32);
            ql qlVar = this.c;
            qlVar.c = B;
            EdgeEffect edgeEffect = qlVar.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (B >> 32), (int) (B & 4294967295L));
            }
            EdgeEffect edgeEffect2 = qlVar.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (B >> 32), (int) (B & 4294967295L));
            }
            EdgeEffect edgeEffect3 = qlVar.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (B & 4294967295L), (int) (B >> 32));
            }
            EdgeEffect edgeEffect4 = qlVar.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (B & 4294967295L), (int) (B >> 32));
            }
            EdgeEffect edgeEffect5 = qlVar.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (B >> 32), (int) (B & 4294967295L));
            }
            EdgeEffect edgeEffect6 = qlVar.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (B >> 32), (int) (B & 4294967295L));
            }
            EdgeEffect edgeEffect7 = qlVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (B & 4294967295L), (int) (B >> 32));
            }
            EdgeEffect edgeEffect8 = qlVar.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & B), (int) (B >> 32));
            }
        }
        if (a || a2) {
            return;
        }
        a();
    }
}
