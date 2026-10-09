package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class es {
    public boolean A;
    public RectF B;
    public final gs a;
    public Outline f;
    public float j;
    public v10 k;
    public c5 l;
    public c5 m;
    public boolean n;
    public oa o;
    public v4 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;
    public si b = nh.h;
    public xx c = xx.e;
    public pq d = uc.g;
    public final vc e = new vc(1, this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final r4 r = new r4();

    static {
        lw.i(Build.FINGERPRINT, "robolectric");
    }

    public es(gs gsVar) {
        this.a = gsVar;
        gsVar.t(false);
        this.t = 0L;
        this.u = 0L;
        this.z = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.A;
            Outline outline2 = null;
            gs gsVar = this.a;
            if (z || gsVar.G() > 0.0f) {
                c5 c5Var = this.l;
                if (c5Var != null) {
                    RectF rectF = this.B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.B = rectF;
                    }
                    boolean z2 = c5Var instanceof c5;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    Path path = c5Var.a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(path);
                        }
                        outline.offset(this.v, this.w);
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = c5Var;
                    if (outline != null) {
                        outline.setAlpha(gsVar.a());
                        outline2 = outline;
                    }
                    gsVar.m(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.n && this.A) {
                        gsVar.t(false);
                        gsVar.q();
                    } else {
                        gsVar.t(this.A);
                    }
                } else {
                    gsVar.t(this.A);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long G = t10.G(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        G = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (G >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (G & 4294967295L)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(gsVar.a());
                    gsVar.m(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i4)) << 32));
                }
            } else {
                gsVar.t(false);
                gsVar.m(null, 0L);
            }
        }
        this.g = false;
    }

    public final void b() {
        if (this.s && this.q == 0) {
            r4 r4Var = this.r;
            es esVar = (es) r4Var.b;
            if (esVar != null) {
                esVar.q--;
                esVar.b();
                r4Var.b = null;
            }
            l40 l40Var = (l40) r4Var.d;
            if (l40Var != null) {
                Object[] objArr = l40Var.b;
                long[] jArr = l40Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r11.q--;
                                    ((es) objArr[(i << 3) + i3]).b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                l40Var.b();
            }
            this.a.q();
        }
    }

    public final void c(jl jlVar) {
        r4 r4Var = this.r;
        r4Var.c = (es) r4Var.b;
        l40 l40Var = (l40) r4Var.d;
        if (l40Var != null && l40Var.h()) {
            l40 l40Var2 = (l40) r4Var.e;
            if (l40Var2 == null) {
                int i = hi0.a;
                l40Var2 = new l40();
                r4Var.e = l40Var2;
            }
            l40Var2.i(l40Var);
            l40Var.b();
        }
        r4Var.a = true;
        this.d.invoke(jlVar);
        r4Var.a = false;
        es esVar = (es) r4Var.c;
        if (esVar != null) {
            esVar.q--;
            esVar.b();
        }
        l40 l40Var3 = (l40) r4Var.e;
        if (l40Var3 == null || !l40Var3.h()) {
            return;
        }
        Object[] objArr = l40Var3.b;
        long[] jArr = l40Var3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            r9.q--;
                            ((es) objArr[(i2 << 3) + i4]).b();
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        l40Var3.b();
    }

    public final v10 d() {
        v10 t80Var;
        v10 v10Var = this.k;
        c5 c5Var = this.l;
        if (v10Var != null) {
            return v10Var;
        }
        if (c5Var != null) {
            s80 s80Var = new s80(c5Var);
            this.k = s80Var;
            return s80Var;
        }
        long G = t10.G(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            G = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (G >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (G & 4294967295L)) + intBitsToFloat2;
        if (this.j > 0.0f) {
            t80Var = new u80(v10.b(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            t80Var = new t80(new oe0(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.k = t80Var;
        return t80Var;
    }

    public final void e(float f, long j, long j2) {
        float f2 = this.v;
        float f3 = this.w;
        long e = s60.e(j, (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (s60.b(this.h, e) && hl0.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = e;
        this.i = j2;
        this.j = f;
        a();
    }
}
