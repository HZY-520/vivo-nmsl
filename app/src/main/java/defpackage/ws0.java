package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ws0 extends qs0 {
    public final os b;
    public String c;
    public boolean d;
    public final fl e;
    public eq f;
    public final w90 g;
    public l8 h;
    public final w90 i;
    public long j;
    public float k;
    public float l;
    public final us0 m;

    public ws0(os osVar) {
        this.b = osVar;
        osVar.i = new us0(this, 0);
        this.c = "";
        this.d = true;
        this.e = new fl();
        this.f = new vs0(0);
        this.g = p30.m(null);
        this.i = p30.m(new hl0(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new us0(this, 1);
    }

    @Override // defpackage.qs0
    public final void a(jl jlVar) {
        e(jlVar, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(jl jlVar, float f, l8 l8Var) {
        int i;
        boolean z;
        fl flVar;
        l8 l8Var2;
        s4 s4Var;
        long j;
        s4 g;
        jl jlVar2;
        w90 w90Var;
        l8 l8Var3;
        s4 s4Var2;
        s4 s4Var3;
        int i2;
        int i3;
        os osVar = this.b;
        boolean z2 = osVar.d;
        int i4 = 3;
        w90 w90Var2 = this.g;
        if (z2 && osVar.e != 16) {
            l8 l8Var4 = (l8) w90Var2.getValue();
            int i5 = zs0.a;
            if (!(l8Var4 instanceof l8) ? l8Var4 == null : !((i3 = l8Var4.c) != 5 && i3 != 3)) {
                if (!(l8Var instanceof l8) ? l8Var == null : !((i2 = l8Var.c) != 5 && i2 != 3)) {
                    i = 1;
                    z = this.d;
                    flVar = this.e;
                    if (!z && hl0.a(this.j, jlVar.u())) {
                        s4Var3 = flVar.a;
                        if (s4Var3 != null) {
                            Bitmap.Config config = s4Var3.a.getConfig();
                            config.getClass();
                            if (config == Bitmap.Config.ALPHA_8) {
                                i4 = 1;
                            } else if (config == Bitmap.Config.RGB_565) {
                                i4 = 2;
                            } else if (config != Bitmap.Config.ARGB_4444) {
                                if (config != Bitmap.Config.RGBA_F16) {
                                    if (config == Bitmap.Config.HARDWARE) {
                                        i4 = 4;
                                    }
                                }
                            }
                            if (i == i4) {
                                jlVar2 = jlVar;
                                w90Var = w90Var2;
                                if (l8Var == null) {
                                    l8Var3 = l8Var;
                                } else {
                                    l8Var3 = ((l8) w90Var.getValue()) != null ? (l8) w90Var.getValue() : this.h;
                                }
                                s4Var2 = flVar.a;
                                if (s4Var2 == null) {
                                    cv.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                                }
                                jl.E(jlVar2, s4Var2, flVar.c, 0L, f, l8Var3, 0, 858);
                            }
                        }
                        i4 = 0;
                        if (i == i4) {
                        }
                    }
                    if (i != 1) {
                        long j2 = osVar.e;
                        int i6 = zs0.a;
                        if (gc.c(j2) != 1.0f) {
                            j2 = gc.b(j2, 1.0f);
                        }
                        l8Var2 = new l8(j2, 5);
                    } else {
                        l8Var2 = null;
                    }
                    this.h = l8Var2;
                    float intBitsToFloat = Float.intBitsToFloat((int) (jlVar.u() >> 32));
                    w90 w90Var3 = this.i;
                    this.k = intBitsToFloat / Float.intBitsToFloat((int) (((hl0) w90Var3.getValue()).a >> 32));
                    this.l = Float.intBitsToFloat((int) (jlVar.u() & 4294967295L)) / Float.intBitsToFloat((int) (((hl0) w90Var3.getValue()).a & 4294967295L));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (jlVar.u() & 4294967295L)))) & 4294967295L) | (((int) Math.ceil(Float.intBitsToFloat((int) (jlVar.u() >> 32)))) << 32);
                    xx layoutDirection = jlVar.getLayoutDirection();
                    s4Var = flVar.a;
                    n2 n2Var = flVar.b;
                    if (s4Var != null || n2Var == null) {
                        j = 4294967295L;
                    } else {
                        j = 4294967295L;
                        int i7 = (int) (ceil >> 32);
                        Bitmap bitmap = s4Var.a;
                        if (i7 <= bitmap.getWidth() && ((int) (ceil & 4294967295L)) <= bitmap.getHeight() && flVar.d == i) {
                            g = s4Var;
                            flVar.c = ceil;
                            oa oaVar = flVar.e;
                            na naVar = oaVar.e;
                            long G = t10.G(ceil);
                            si siVar = naVar.a;
                            xx xxVar = naVar.b;
                            ma maVar = naVar.c;
                            long j3 = naVar.d;
                            jlVar2 = jlVar;
                            naVar.a = jlVar2;
                            naVar.b = layoutDirection;
                            naVar.c = n2Var;
                            naVar.d = G;
                            n2Var.i();
                            w90Var = w90Var2;
                            jl.w(oaVar, gc.b, 0L, 62);
                            this.m.invoke(oaVar);
                            n2Var.g();
                            naVar.a = siVar;
                            naVar.b = xxVar;
                            naVar.c = maVar;
                            naVar.d = j3;
                            g.a.prepareToDraw();
                            this.d = false;
                            this.j = jlVar2.u();
                            if (l8Var == null) {
                            }
                            s4Var2 = flVar.a;
                            if (s4Var2 == null) {
                            }
                            jl.E(jlVar2, s4Var2, flVar.c, 0L, f, l8Var3, 0, 858);
                        }
                    }
                    g = lw.g((int) (ceil >> 32), (int) (ceil & j), i);
                    Canvas canvas = o2.a;
                    n2Var = new n2();
                    n2Var.a = new Canvas(g.a);
                    flVar.a = g;
                    flVar.b = n2Var;
                    flVar.d = i;
                    flVar.c = ceil;
                    oa oaVar2 = flVar.e;
                    na naVar2 = oaVar2.e;
                    long G2 = t10.G(ceil);
                    si siVar2 = naVar2.a;
                    xx xxVar2 = naVar2.b;
                    ma maVar2 = naVar2.c;
                    long j32 = naVar2.d;
                    jlVar2 = jlVar;
                    naVar2.a = jlVar2;
                    naVar2.b = layoutDirection;
                    naVar2.c = n2Var;
                    naVar2.d = G2;
                    n2Var.i();
                    w90Var = w90Var2;
                    jl.w(oaVar2, gc.b, 0L, 62);
                    this.m.invoke(oaVar2);
                    n2Var.g();
                    naVar2.a = siVar2;
                    naVar2.b = xxVar2;
                    naVar2.c = maVar2;
                    naVar2.d = j32;
                    g.a.prepareToDraw();
                    this.d = false;
                    this.j = jlVar2.u();
                    if (l8Var == null) {
                    }
                    s4Var2 = flVar.a;
                    if (s4Var2 == null) {
                    }
                    jl.E(jlVar2, s4Var2, flVar.c, 0L, f, l8Var3, 0, 858);
                }
            }
        }
        i = 0;
        z = this.d;
        flVar = this.e;
        if (!z) {
            s4Var3 = flVar.a;
            if (s4Var3 != null) {
            }
            i4 = 0;
            if (i == i4) {
            }
        }
        if (i != 1) {
        }
        this.h = l8Var2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (jlVar.u() >> 32));
        w90 w90Var32 = this.i;
        this.k = intBitsToFloat2 / Float.intBitsToFloat((int) (((hl0) w90Var32.getValue()).a >> 32));
        this.l = Float.intBitsToFloat((int) (jlVar.u() & 4294967295L)) / Float.intBitsToFloat((int) (((hl0) w90Var32.getValue()).a & 4294967295L));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (jlVar.u() & 4294967295L)))) & 4294967295L) | (((int) Math.ceil(Float.intBitsToFloat((int) (jlVar.u() >> 32)))) << 32);
        xx layoutDirection2 = jlVar.getLayoutDirection();
        s4Var = flVar.a;
        n2 n2Var2 = flVar.b;
        if (s4Var != null) {
        }
        j = 4294967295L;
        g = lw.g((int) (ceil2 >> 32), (int) (ceil2 & j), i);
        Canvas canvas2 = o2.a;
        n2Var2 = new n2();
        n2Var2.a = new Canvas(g.a);
        flVar.a = g;
        flVar.b = n2Var2;
        flVar.d = i;
        flVar.c = ceil2;
        oa oaVar22 = flVar.e;
        na naVar22 = oaVar22.e;
        long G22 = t10.G(ceil2);
        si siVar22 = naVar22.a;
        xx xxVar22 = naVar22.b;
        ma maVar22 = naVar22.c;
        long j322 = naVar22.d;
        jlVar2 = jlVar;
        naVar22.a = jlVar2;
        naVar22.b = layoutDirection2;
        naVar22.c = n2Var2;
        naVar22.d = G22;
        n2Var2.i();
        w90Var = w90Var2;
        jl.w(oaVar22, gc.b, 0L, 62);
        this.m.invoke(oaVar22);
        n2Var2.g();
        naVar22.a = siVar22;
        naVar22.b = xxVar22;
        naVar22.c = maVar22;
        naVar22.d = j322;
        g.a.prepareToDraw();
        this.d = false;
        this.j = jlVar2.u();
        if (l8Var == null) {
        }
        s4Var2 = flVar.a;
        if (s4Var2 == null) {
        }
        jl.E(jlVar2, s4Var2, flVar.c, 0L, f, l8Var3, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        w90 w90Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((hl0) w90Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((hl0) w90Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
