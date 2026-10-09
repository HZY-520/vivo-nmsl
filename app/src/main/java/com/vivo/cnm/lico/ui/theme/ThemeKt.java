package com.vivo.cnm.lico.ui.theme;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.vivo.cnm.lico.ui.theme.ThemeKt;
import defpackage.a6;
import defpackage.aw0;
import defpackage.b6;
import defpackage.bw0;
import defpackage.de0;
import defpackage.e80;
import defpackage.eq;
import defpackage.fs0;
import defpackage.gc;
import defpackage.gr;
import defpackage.i2;
import defpackage.kc;
import defpackage.kr0;
import defpackage.kw;
import defpackage.lr0;
import defpackage.lw;
import defpackage.mc;
import defpackage.nh;
import defpackage.p30;
import defpackage.p40;
import defpackage.p80;
import defpackage.re;
import defpackage.rq0;
import defpackage.s10;
import defpackage.s2;
import defpackage.s3;
import defpackage.se;
import defpackage.t30;
import defpackage.tm0;
import defpackage.tq;
import defpackage.uc;
import defpackage.v10;
import defpackage.va;
import defpackage.vc;
import defpackage.y5;
import defpackage.zm0;
import defpackage.zv0;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ThemeKt {
    private static final kc LightColorScheme = mc.e(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 65535);
    private static final kc DarkColorScheme = mc.c(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 65535);

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FucWBTheme(boolean z, boolean z2, final tq tqVar, se seVar, final int i, final int i2) {
        final boolean z3;
        int i3;
        boolean z4;
        final boolean z5;
        de0 q;
        int i4;
        boolean z6;
        boolean z7;
        int i5;
        int i6;
        kc kcVar;
        final View view;
        boolean z8;
        int i7;
        tqVar.getClass();
        gr grVar = (gr) seVar;
        grVar.Q(-1616546948);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                z3 = z;
                if (grVar.f(z3)) {
                    i7 = 4;
                    i3 = i7 | i;
                }
            } else {
                z3 = z;
            }
            i7 = 2;
            i3 = i7 | i;
        } else {
            z3 = z;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z4 = z2;
            i3 |= grVar.f(z4) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= grVar.g(tqVar) ? 256 : 128;
            }
            if (grVar.I(i3 & 1, (i3 & 147) == 146)) {
                grVar.L();
                z5 = z4;
            } else {
                grVar.N();
                if ((i & 1) == 0 || grVar.v()) {
                    if ((i2 & 1) != 0) {
                        z3 = (((Configuration) grVar.i(s3.a)).uiMode & 48) == 32;
                        i3 &= -15;
                    }
                    if (i8 != 0) {
                        i4 = i3;
                        z6 = true;
                        grVar.p();
                        if (z6 || !TokensKt.getAtLeast31()) {
                            z7 = z6;
                            i5 = i4;
                            i6 = 0;
                            if (z3) {
                                grVar.P(1276557964);
                                grVar.o(false);
                                kcVar = LightColorScheme;
                            } else {
                                grVar.P(1276556939);
                                grVar.o(false);
                                kcVar = DarkColorScheme;
                            }
                        } else {
                            grVar.P(918388203);
                            Context context = (Context) grVar.i(s3.b);
                            if (!z3) {
                                z7 = z6;
                                i5 = i4;
                                if (Build.VERSION.SDK_INT >= 34) {
                                    kcVar = mc.e(lr0.n(context, R.color.system_primary_light), lr0.n(context, R.color.system_on_primary_light), lr0.n(context, R.color.system_primary_container_light), lr0.n(context, R.color.system_on_primary_container_light), lr0.n(context, R.color.system_primary_dark), lr0.n(context, R.color.system_secondary_light), lr0.n(context, R.color.system_on_secondary_light), lr0.n(context, R.color.system_secondary_container_light), lr0.n(context, R.color.system_on_secondary_container_light), lr0.n(context, R.color.system_tertiary_light), lr0.n(context, R.color.system_on_tertiary_light), lr0.n(context, R.color.system_tertiary_container_light), lr0.n(context, R.color.system_on_tertiary_container_light), lr0.n(context, R.color.system_background_light), lr0.n(context, R.color.system_on_background_light), lr0.n(context, R.color.system_surface_light), lr0.n(context, R.color.system_on_surface_light), lr0.n(context, R.color.system_surface_variant_light), lr0.n(context, R.color.system_on_surface_variant_light), lr0.n(context, R.color.system_primary_light), lr0.n(context, R.color.system_surface_dark), lr0.n(context, R.color.system_on_surface_dark), lr0.n(context, R.color.system_outline_light), lr0.n(context, R.color.system_outline_variant_light), 0L, lr0.n(context, R.color.system_surface_bright_light), lr0.n(context, R.color.system_surface_container_light), lr0.n(context, R.color.system_surface_container_high_light), lr0.n(context, R.color.system_surface_container_highest_light), lr0.n(context, R.color.system_surface_container_low_light), lr0.n(context, R.color.system_surface_container_lowest_light), lr0.n(context, R.color.system_surface_dim_light), lr0.n(context, R.color.system_primary_fixed), lr0.n(context, R.color.system_primary_fixed_dim), lr0.n(context, R.color.system_on_primary_fixed), lr0.n(context, R.color.system_on_primary_fixed_variant), lr0.n(context, R.color.system_secondary_fixed), lr0.n(context, R.color.system_secondary_fixed_dim), lr0.n(context, R.color.system_on_secondary_fixed), lr0.n(context, R.color.system_on_secondary_fixed_variant), lr0.n(context, R.color.system_tertiary_fixed), lr0.n(context, R.color.system_tertiary_fixed_dim), lr0.n(context, R.color.system_on_tertiary_fixed), lr0.n(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
                                } else {
                                    rq0 j = lr0.j(context);
                                    long j2 = j.y;
                                    long j3 = j.v;
                                    long j4 = j.w;
                                    long j5 = j.B;
                                    long j6 = j.x;
                                    long j7 = j.F;
                                    long j8 = j.C;
                                    long j9 = j.D;
                                    long j10 = j.I;
                                    long j11 = j.M;
                                    long j12 = j.J;
                                    long j13 = j.K;
                                    long j14 = j.P;
                                    long j15 = j.b;
                                    long j16 = j.r;
                                    long j17 = j.g;
                                    kcVar = mc.e(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j15, j16, j17, j.l, j2, j.o, j.d, j.k, j.i, j.u, j15, j.e, j.f, j17, j.c, j.a, j.h, j4, j6, j5, j.z, j9, j.E, j10, j.G, j13, j.L, j14, j.N, 62914560, 0);
                                }
                            } else if (Build.VERSION.SDK_INT >= 34) {
                                kcVar = mc.c(lr0.n(context, R.color.system_primary_dark), lr0.n(context, R.color.system_on_primary_dark), lr0.n(context, R.color.system_primary_container_dark), lr0.n(context, R.color.system_on_primary_container_dark), lr0.n(context, R.color.system_primary_light), lr0.n(context, R.color.system_secondary_dark), lr0.n(context, R.color.system_on_secondary_dark), lr0.n(context, R.color.system_secondary_container_dark), lr0.n(context, R.color.system_on_secondary_container_dark), lr0.n(context, R.color.system_tertiary_dark), lr0.n(context, R.color.system_on_tertiary_dark), lr0.n(context, R.color.system_tertiary_container_dark), lr0.n(context, R.color.system_on_tertiary_container_dark), lr0.n(context, R.color.system_background_dark), lr0.n(context, R.color.system_on_background_dark), lr0.n(context, R.color.system_surface_dark), lr0.n(context, R.color.system_on_surface_dark), lr0.n(context, R.color.system_surface_variant_dark), lr0.n(context, R.color.system_on_surface_variant_dark), lr0.n(context, R.color.system_primary_dark), lr0.n(context, R.color.system_surface_light), lr0.n(context, R.color.system_on_surface_light), lr0.n(context, R.color.system_outline_dark), lr0.n(context, R.color.system_outline_variant_dark), 0L, lr0.n(context, R.color.system_surface_bright_dark), lr0.n(context, R.color.system_surface_container_dark), lr0.n(context, R.color.system_surface_container_high_dark), lr0.n(context, R.color.system_surface_container_highest_dark), lr0.n(context, R.color.system_surface_container_low_dark), lr0.n(context, R.color.system_surface_container_lowest_dark), lr0.n(context, R.color.system_surface_dim_dark), lr0.n(context, R.color.system_primary_fixed), lr0.n(context, R.color.system_primary_fixed_dim), lr0.n(context, R.color.system_on_primary_fixed), lr0.n(context, R.color.system_on_primary_fixed_variant), lr0.n(context, R.color.system_secondary_fixed), lr0.n(context, R.color.system_secondary_fixed_dim), lr0.n(context, R.color.system_on_secondary_fixed), lr0.n(context, R.color.system_on_secondary_fixed_variant), lr0.n(context, R.color.system_tertiary_fixed), lr0.n(context, R.color.system_tertiary_fixed_dim), lr0.n(context, R.color.system_on_tertiary_fixed), lr0.n(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
                                z7 = z6;
                                i5 = i4;
                            } else {
                                rq0 j18 = lr0.j(context);
                                long j19 = j18.x;
                                long j20 = j18.A;
                                long j21 = j18.z;
                                long j22 = j18.w;
                                z7 = z6;
                                i5 = i4;
                                long j23 = j18.y;
                                long j24 = j18.E;
                                long j25 = j18.H;
                                long j26 = j18.G;
                                long j27 = j18.D;
                                long j28 = j18.L;
                                long j29 = j18.O;
                                long j30 = j18.N;
                                long j31 = j18.K;
                                long j32 = j18.s;
                                long j33 = j18.g;
                                long j34 = j18.l;
                                kcVar = mc.c(j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j32, j33, j34, j18.i, j19, j33, j18.o, j18.j, j34, j18.u, j18.m, j18.q, j18.p, j18.n, j18.r, j18.t, j32, j22, j19, j18.B, j21, j27, j24, j18.I, j26, j31, j28, j18.P, j30, 62914560, 0);
                            }
                            i6 = 0;
                            grVar.o(false);
                        }
                        kc animateColorScheme = animateColorScheme(kcVar, grVar, i6);
                        view = (View) grVar.i(s3.f);
                        if (view.isInEditMode()) {
                            grVar.P(918741386);
                            boolean g = grVar.g(view) | ((((i5 & 14) ^ 6) > 4 && grVar.f(z3)) || (i5 & 6) == 4);
                            Object G = grVar.G();
                            if (g || G == re.a) {
                                G = new eq() { // from class: dq0
                                    @Override // defpackage.eq
                                    public final Object b() {
                                        fs0 FucWBTheme$lambda$1$lambda$0;
                                        FucWBTheme$lambda$1$lambda$0 = ThemeKt.FucWBTheme$lambda$1$lambda$0(view, z3);
                                        return FucWBTheme$lambda$1$lambda$0;
                                    }
                                };
                                grVar.Y(G);
                            }
                            p80 p80Var = grVar.L.b.u;
                            p80Var.O(e80.c);
                            z8 = false;
                            t30.w(p80Var, 0, (eq) G);
                        } else {
                            z8 = false;
                            grVar.P(914807238);
                        }
                        grVar.o(z8);
                        s10.b(animateColorScheme, null, null, tqVar, grVar, (i5 << 3) & 7168);
                        z5 = z7;
                    }
                } else {
                    grVar.L();
                    if ((i2 & 1) != 0) {
                        i3 &= -15;
                    }
                }
                i4 = i3;
                z6 = z4;
                grVar.p();
                if (z6) {
                }
                z7 = z6;
                i5 = i4;
                i6 = 0;
                if (z3) {
                }
                kc animateColorScheme2 = animateColorScheme(kcVar, grVar, i6);
                view = (View) grVar.i(s3.f);
                if (view.isInEditMode()) {
                }
                grVar.o(z8);
                s10.b(animateColorScheme2, null, null, tqVar, grVar, (i5 << 3) & 7168);
                z5 = z7;
            }
            final boolean z9 = z3;
            q = grVar.q();
            if (q == null) {
                q.d = new tq() { // from class: eq0
                    @Override // defpackage.tq
                    public final Object invoke(Object obj, Object obj2) {
                        fs0 FucWBTheme$lambda$2;
                        int intValue = ((Integer) obj2).intValue();
                        FucWBTheme$lambda$2 = ThemeKt.FucWBTheme$lambda$2(z9, z5, tqVar, i, i2, (se) obj, intValue);
                        return FucWBTheme$lambda$2;
                    }
                };
                return;
            }
            return;
        }
        z4 = z2;
        if ((i & 384) == 0) {
        }
        if (grVar.I(i3 & 1, (i3 & 147) == 146)) {
        }
        final boolean z92 = z3;
        q = grVar.q();
        if (q == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 FucWBTheme$lambda$1$lambda$0(View view, boolean z) {
        Window window;
        Context context = view.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        fs0 fs0Var = fs0.a;
        if (activity != null && (window = activity.getWindow()) != null) {
            int i = Build.VERSION.SDK_INT;
            (i >= 35 ? new bw0(window) : i >= 30 ? new aw0(window) : new zv0(window)).v(!z);
        }
        return fs0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 FucWBTheme$lambda$2(boolean z, boolean z2, tq tqVar, int i, int i2, se seVar, int i3) {
        FucWBTheme(z, z2, tqVar, seVar, v10.q(i | 1), i2);
        return fs0.a;
    }

    /* renamed from: animateColor-ek8zF_U, reason: not valid java name */
    private static final long m27animateColorek8zF_U(long j, se seVar, int i) {
        tm0 g0 = nh.g0(4);
        int i2 = (i & 14) | 48;
        gr grVar = (gr) seVar;
        boolean e = grVar.e(gc.e(j));
        Object G = grVar.G();
        int i3 = 0;
        i2 i2Var = re.a;
        if (e || G == i2Var) {
            kr0 kr0Var = new kr0(uc.f, new vc(i3, gc.e(j)));
            grVar.Y(kr0Var);
            G = kr0Var;
        }
        kr0 kr0Var2 = (kr0) G;
        gc gcVar = new gc(j);
        int i4 = (i2 & 14) | 384;
        int i5 = b6.a;
        Object G2 = grVar.G();
        if (G2 == i2Var) {
            G2 = p30.m(null);
            grVar.Y(G2);
        }
        p40 p40Var = (p40) G2;
        Object G3 = grVar.G();
        if (G3 == i2Var) {
            G3 = new y5(gcVar, kr0Var2, null);
            grVar.Y(G3);
        }
        y5 y5Var = (y5) G3;
        Object G4 = grVar.G();
        if (G4 == i2Var) {
            G4 = p30.m(null);
            grVar.Y(G4);
        }
        p40 p40Var2 = (p40) G4;
        p40Var2.setValue(null);
        Object G5 = grVar.G();
        if (G5 == i2Var) {
            G5 = p30.m(g0);
            grVar.Y(G5);
        }
        p40 p40Var3 = (p40) G5;
        p40Var3.setValue(g0);
        Object G6 = grVar.G();
        if (G6 == i2Var) {
            G6 = lw.a(-1, 6, null);
            grVar.Y(G6);
        }
        va vaVar = (va) G6;
        boolean g = ((((i4 & 14) ^ 6) > 4 && grVar.g(gcVar)) || (i4 & 6) == 4) | grVar.g(vaVar);
        Object G7 = grVar.G();
        if (g || G7 == i2Var) {
            G7 = new s2(2, vaVar, gcVar);
            grVar.Y(G7);
        }
        p80 p80Var = grVar.L.b.u;
        p80Var.O(e80.c);
        t30.w(p80Var, 0, (eq) G7);
        boolean g2 = grVar.g(vaVar) | grVar.g(y5Var) | grVar.e(p40Var3) | grVar.e(p40Var2);
        Object G8 = grVar.G();
        if (g2 || G8 == i2Var) {
            a6 a6Var = new a6(vaVar, y5Var, p40Var3, p40Var2, null);
            grVar.Y(a6Var);
            G8 = a6Var;
        }
        kw.d(grVar, (tq) G8, vaVar);
        zm0 zm0Var = (zm0) p40Var.getValue();
        if (zm0Var == null) {
            zm0Var = y5Var.c;
        }
        return ((gc) zm0Var.getValue()).a;
    }

    private static final kc animateColorScheme(kc kcVar, se seVar, int i) {
        return new kc(m27animateColorek8zF_U(kcVar.a, seVar, 0), m27animateColorek8zF_U(kcVar.b, seVar, 0), m27animateColorek8zF_U(kcVar.c, seVar, 0), m27animateColorek8zF_U(kcVar.d, seVar, 0), m27animateColorek8zF_U(kcVar.e, seVar, 0), m27animateColorek8zF_U(kcVar.f, seVar, 0), m27animateColorek8zF_U(kcVar.g, seVar, 0), m27animateColorek8zF_U(kcVar.h, seVar, 0), m27animateColorek8zF_U(kcVar.i, seVar, 0), m27animateColorek8zF_U(kcVar.j, seVar, 0), m27animateColorek8zF_U(kcVar.k, seVar, 0), m27animateColorek8zF_U(kcVar.l, seVar, 0), m27animateColorek8zF_U(kcVar.m, seVar, 0), m27animateColorek8zF_U(kcVar.n, seVar, 0), m27animateColorek8zF_U(kcVar.o, seVar, 0), m27animateColorek8zF_U(kcVar.p, seVar, 0), m27animateColorek8zF_U(kcVar.q, seVar, 0), m27animateColorek8zF_U(kcVar.r, seVar, 0), m27animateColorek8zF_U(kcVar.s, seVar, 0), m27animateColorek8zF_U(kcVar.t, seVar, 0), m27animateColorek8zF_U(kcVar.u, seVar, 0), m27animateColorek8zF_U(kcVar.v, seVar, 0), m27animateColorek8zF_U(kcVar.w, seVar, 0), m27animateColorek8zF_U(kcVar.x, seVar, 0), m27animateColorek8zF_U(kcVar.y, seVar, 0), m27animateColorek8zF_U(kcVar.z, seVar, 0), m27animateColorek8zF_U(kcVar.A, seVar, 0), m27animateColorek8zF_U(kcVar.B, seVar, 0), m27animateColorek8zF_U(kcVar.C, seVar, 0), m27animateColorek8zF_U(kcVar.D, seVar, 0), m27animateColorek8zF_U(kcVar.E, seVar, 0), m27animateColorek8zF_U(kcVar.F, seVar, 0), m27animateColorek8zF_U(kcVar.G, seVar, 0), m27animateColorek8zF_U(kcVar.H, seVar, 0), m27animateColorek8zF_U(kcVar.I, seVar, 0), m27animateColorek8zF_U(kcVar.J, seVar, 0), kcVar.K, kcVar.L, kcVar.M, kcVar.N, kcVar.O, kcVar.P, kcVar.Q, kcVar.R, kcVar.S, kcVar.T, kcVar.U, kcVar.V);
    }
}
