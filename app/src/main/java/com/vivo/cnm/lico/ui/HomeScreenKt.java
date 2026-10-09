package com.vivo.cnm.lico.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.vivo.cnm.lico.ModuleStatus;
import com.vivo.cnm.lico.R;
import com.vivo.cnm.lico.StatusProbe;
import com.vivo.cnm.lico.ui.HomeScreenKt;
import com.vivo.cnm.lico.ui.theme.AppShape;
import com.vivo.cnm.lico.ui.theme.AppSpacing;
import com.vivo.cnm.lico.ui.theme.AppText;
import com.vivo.cnm.lico.ui.theme.StatusColors;
import defpackage.b2;
import defpackage.b20;
import defpackage.b7;
import defpackage.ba0;
import defpackage.bd;
import defpackage.ct0;
import defpackage.cv;
import defpackage.de0;
import defpackage.dt;
import defpackage.dx0;
import defpackage.e80;
import defpackage.eq;
import defpackage.et;
import defpackage.fs0;
import defpackage.ft;
import defpackage.ga0;
import defpackage.gc;
import defpackage.gh0;
import defpackage.gr;
import defpackage.h90;
import defpackage.hf;
import defpackage.hh0;
import defpackage.ht;
import defpackage.i2;
import defpackage.ia;
import defpackage.id;
import defpackage.j20;
import defpackage.j8;
import defpackage.j9;
import defpackage.jc0;
import defpackage.jd;
import defpackage.jh0;
import defpackage.jm0;
import defpackage.k8;
import defpackage.kc;
import defpackage.kf;
import defpackage.kp0;
import defpackage.kw;
import defpackage.le;
import defpackage.ll;
import defpackage.ln0;
import defpackage.lr0;
import defpackage.lw;
import defpackage.m20;
import defpackage.mc;
import defpackage.my;
import defpackage.nf0;
import defpackage.nh;
import defpackage.on;
import defpackage.p2;
import defpackage.p80;
import defpackage.pq;
import defpackage.q3;
import defpackage.q5;
import defpackage.qa;
import defpackage.qa0;
import defpackage.qg0;
import defpackage.r20;
import defpackage.rc;
import defpackage.re;
import defpackage.s2;
import defpackage.s3;
import defpackage.s4;
import defpackage.se;
import defpackage.st;
import defpackage.t10;
import defpackage.t3;
import defpackage.t30;
import defpackage.t8;
import defpackage.tg0;
import defpackage.ti0;
import defpackage.tq;
import defpackage.u10;
import defpackage.u20;
import defpackage.ug0;
import defpackage.um;
import defpackage.uq;
import defpackage.ut;
import defpackage.ut0;
import defpackage.v10;
import defpackage.vs;
import defpackage.vt;
import defpackage.wc;
import defpackage.wt;
import defpackage.xa0;
import defpackage.xp;
import defpackage.xt;
import defpackage.y30;
import defpackage.yc;
import defpackage.ys0;
import defpackage.yt;
import defpackage.z1;
import defpackage.z6;
import defpackage.zc;
import defpackage.zd;
import defpackage.zs0;
import defpackage.zt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class HomeScreenKt {

    private static final void GestureGuideCard(se seVar, int i) {
        gr grVar = (gr) seVar;
        grVar.Q(1389758973);
        int i2 = 1;
        if (grVar.I(i & 1, i != 0)) {
            nh.a(t10.l, AppShape.INSTANCE.getCardLarge(), null, null, ComposableSingletons$HomeScreenKt.INSTANCE.m0getLambda$1255339409$app(), grVar, 196614, 28);
        } else {
            grVar.L();
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new dt(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 GestureGuideCard$lambda$12(int i, se seVar, int i2) {
        GestureGuideCard(seVar, v10.q(i | 1));
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GuideStep(final int i, String str, se seVar, final int i2) {
        int i3;
        final String str2 = str;
        gr grVar = (gr) seVar;
        grVar.Q(-2088455454);
        if ((i2 & 6) == 0) {
            i3 = i2 | (grVar.c(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= grVar.e(str2) ? 32 : 16;
        }
        int i4 = i3;
        if (grVar.I(i4 & 1, (i4 & 19) != 18)) {
            ug0 a = tg0.a(lr0.a, b2.o, grVar, 48);
            int hashCode = Long.hashCode(grVar.Q);
            xa0 k = grVar.k();
            u20 z = dx0.z(grVar, r20.a);
            le.c.getClass();
            grVar.R();
            if (grVar.P) {
                grVar.j();
            } else {
                grVar.b0();
            }
            bd bdVar = b2.x;
            t30.t(grVar, bdVar, a);
            bd bdVar2 = b2.w;
            t30.t(grVar, bdVar2, k);
            Integer valueOf = Integer.valueOf(hashCode);
            bd bdVar3 = b2.y;
            t30.t(grVar, bdVar3, valueOf);
            t30.p(grVar);
            bd bdVar4 = b2.v;
            t30.t(grVar, bdVar4, z);
            u20 C = t10.C(20.0f);
            ll llVar = mc.a;
            u20 i5 = dx0.i(C, gc.b(((kc) grVar.i(llVar)).a, 0.15f), qg0.a);
            b20 c = t8.c(b2.j, false);
            int hashCode2 = Long.hashCode(grVar.Q);
            xa0 k2 = grVar.k();
            u20 z2 = dx0.z(grVar, i5);
            grVar.R();
            if (grVar.P) {
                grVar.j();
            } else {
                grVar.b0();
            }
            t30.t(grVar, bdVar, c);
            t30.t(grVar, bdVar2, k2);
            t30.t(grVar, bdVar3, Integer.valueOf(hashCode2));
            t30.p(grVar);
            t30.t(grVar, bdVar4, z2);
            kp0.b(String.valueOf(i), null, ((kc) grVar.i(llVar)).a, u10.s(11), xp.i, 0L, 0L, 0, false, 0, 0, null, grVar, 1597440, 262058);
            grVar.o(true);
            j20.a(t10.C(10.0f), grVar);
            str2 = str;
            kp0.b(str2, null, ((kc) grVar.i(llVar)).s, AppText.INSTANCE.m17getBodyXSAIIZE(), null, 0L, 0L, 0, false, 0, 0, null, grVar, (i4 >> 3) & 14, 262122);
            grVar = grVar;
            grVar.o(true);
        } else {
            grVar.L();
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new tq() { // from class: ct
                @Override // defpackage.tq
                public final Object invoke(Object obj, Object obj2) {
                    fs0 GuideStep$lambda$15;
                    int intValue = ((Integer) obj2).intValue();
                    GuideStep$lambda$15 = HomeScreenKt.GuideStep$lambda$15(i, str2, i2, (se) obj, intValue);
                    return GuideStep$lambda$15;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 GuideStep$lambda$15(int i, String str, int i2, se seVar, int i3) {
        GuideStep(i, str, seVar, v10.q(i2 | 1));
        return fs0.a;
    }

    private static final void Header(se seVar, int i) {
        gr grVar = (gr) seVar;
        grVar.Q(485349395);
        if (grVar.I(i & 1, i != 0)) {
            on onVar = t10.l;
            AppSpacing appSpacing = AppSpacing.INSTANCE;
            u20 H = nh.H(onVar, appSpacing.m10getScreenHorizontalPaddingD9Ej5fM(), 8.0f, appSpacing.m10getScreenHorizontalPaddingD9Ej5fM(), 12.0f);
            yc a = wc.a(lr0.b, grVar, 0);
            int hashCode = Long.hashCode(grVar.Q);
            xa0 k = grVar.k();
            u20 z = dx0.z(grVar, H);
            le.c.getClass();
            grVar.R();
            if (grVar.P) {
                grVar.j();
            } else {
                grVar.b0();
            }
            t30.t(grVar, b2.x, a);
            t30.t(grVar, b2.w, k);
            t30.t(grVar, b2.y, Integer.valueOf(hashCode));
            t30.p(grVar);
            t30.t(grVar, b2.v, z);
            kp0.b("vivoCNM", null, 0L, u10.s(26), xp.j, 0L, 0L, 0, false, 0, 0, null, grVar, 1597446, 262062);
            kp0.b("OriginOS 原子工作台解锁", null, ((kc) grVar.i(mc.a)).s, AppText.INSTANCE.m18getLabelXSAIIZE(), null, 0L, 0L, 0, false, 0, 0, null, grVar, 6, 262122);
            grVar = grVar;
            grVar.o(true);
        } else {
            grVar.L();
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new dt(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 Header$lambda$4(int i, se seVar, int i2) {
        Header(seVar, v10.q(i | 1));
        return fs0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeScreen(final ModuleStatus moduleStatus, final eq eqVar, u20 u20Var, se seVar, final int i, final int i2) {
        int i3;
        u20 u20Var2;
        final u20 u20Var3;
        de0 q;
        eq eqVar2;
        p2 p2Var;
        hh0 hh0Var;
        String str;
        Object[] objArr;
        final Object obj;
        String str2;
        Object obj2;
        Object c;
        moduleStatus.getClass();
        eqVar.getClass();
        gr grVar = (gr) seVar;
        grVar.Q(1802548528);
        if ((i & 6) == 0) {
            i3 = (grVar.e(moduleStatus) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= grVar.g(eqVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            u20Var2 = u20Var;
            i3 |= grVar.e(u20Var2) ? 256 : 128;
            if (grVar.I(i3 & 1, (i3 & 147) == 146)) {
                grVar.L();
                u20Var3 = u20Var2;
            } else {
                r20 r20Var = r20.a;
                if (i4 != 0) {
                    u20Var2 = r20Var;
                }
                u20 D = dx0.D(u20Var2.c(t10.m));
                yc a = wc.a(lr0.b, grVar, 0);
                int hashCode = Long.hashCode(grVar.Q);
                xa0 k = grVar.k();
                u20 z = dx0.z(grVar, D);
                le.c.getClass();
                grVar.R();
                if (grVar.P) {
                    grVar.j();
                } else {
                    grVar.b0();
                }
                bd bdVar = b2.x;
                t30.t(grVar, bdVar, a);
                bd bdVar2 = b2.w;
                t30.t(grVar, bdVar2, k);
                Integer valueOf = Integer.valueOf(hashCode);
                bd bdVar3 = b2.y;
                t30.t(grVar, bdVar3, valueOf);
                t30.p(grVar);
                bd bdVar4 = b2.v;
                t30.t(grVar, bdVar4, z);
                Header(grVar, 0);
                my myVar = new my(1.0f);
                Object[] objArr2 = new Object[0];
                boolean c2 = grVar.c(0);
                Object G = grVar.G();
                i2 i2Var = re.a;
                if (c2 || G == i2Var) {
                    G = new hf(23);
                    grVar.Y(G);
                }
                eq eqVar3 = (eq) G;
                Object[] copyOf = Arrays.copyOf(objArr2, 0);
                int i5 = i3;
                long j = grVar.Q;
                t10.e(36);
                String l = Long.toString(j, 36);
                l.getClass();
                hh0 hh0Var2 = (hh0) grVar.i(jh0.a);
                Object G2 = grVar.G();
                u20 u20Var4 = u20Var2;
                p2 p2Var2 = ti0.k;
                if (G2 == i2Var) {
                    if (hh0Var2 == null || (c = hh0Var2.c(l)) == null) {
                        str2 = l;
                        obj2 = null;
                    } else {
                        str2 = l;
                        obj2 = ((pq) p2Var2.g).invoke(c);
                    }
                    if (obj2 == null) {
                        obj2 = eqVar3.b();
                    }
                    G2 = new gh0(p2Var2, hh0Var2, str2, obj2, copyOf);
                    hh0Var = hh0Var2;
                    str = str2;
                    objArr = copyOf;
                    eqVar2 = eqVar3;
                    p2Var = p2Var2;
                    grVar.Y(G2);
                } else {
                    eqVar2 = eqVar3;
                    p2Var = p2Var2;
                    hh0Var = hh0Var2;
                    str = l;
                    objArr = copyOf;
                }
                final gh0 gh0Var = (gh0) G2;
                Object obj3 = Arrays.equals(objArr, gh0Var.i) ? gh0Var.h : null;
                if (obj3 == null) {
                    obj3 = eqVar2.b();
                }
                Object obj4 = obj3;
                boolean g = grVar.g(gh0Var) | grVar.g(p2Var) | grVar.g(hh0Var) | grVar.e(str) | grVar.g(obj4) | grVar.g(objArr);
                final Object[] objArr3 = objArr;
                Object G3 = grVar.G();
                if (g || G3 == i2Var) {
                    final String str3 = str;
                    final hh0 hh0Var3 = hh0Var;
                    final p2 p2Var3 = p2Var;
                    obj = obj4;
                    G3 = new eq() { // from class: df0
                        @Override // defpackage.eq
                        public final Object b() {
                            boolean z2;
                            gh0 gh0Var2 = gh0.this;
                            hh0 hh0Var4 = gh0Var2.f;
                            hh0 hh0Var5 = hh0Var3;
                            boolean z3 = true;
                            if (hh0Var4 != hh0Var5) {
                                gh0Var2.f = hh0Var5;
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            String str4 = gh0Var2.g;
                            String str5 = str3;
                            if (lw.i(str4, str5)) {
                                z3 = z2;
                            } else {
                                gh0Var2.g = str5;
                            }
                            gh0Var2.e = p2Var3;
                            gh0Var2.h = obj;
                            gh0Var2.i = objArr3;
                            v6 v6Var = gh0Var2.j;
                            if (v6Var != null && z3) {
                                v6Var.D();
                                gh0Var2.j = null;
                                gh0Var2.a();
                            }
                            return fs0.a;
                        }
                    };
                    grVar.Y(G3);
                } else {
                    obj = obj4;
                }
                p80 p80Var = grVar.L.b.u;
                p80Var.O(e80.c);
                t30.w(p80Var, 0, (eq) G3);
                u20 O = q3.O(myVar, (ti0) obj);
                AppSpacing appSpacing = AppSpacing.INSTANCE;
                u20 G4 = nh.G(O, appSpacing.m10getScreenHorizontalPaddingD9Ej5fM(), 2);
                yc a2 = wc.a(new b7(appSpacing.m4getCardSpacingD9Ej5fM(), new z6(0)), grVar, 0);
                int hashCode2 = Long.hashCode(grVar.Q);
                xa0 k2 = grVar.k();
                u20 z2 = dx0.z(grVar, G4);
                grVar.R();
                if (grVar.P) {
                    grVar.j();
                } else {
                    grVar.b0();
                }
                t30.t(grVar, bdVar, a2);
                t30.t(grVar, bdVar2, k2);
                t30.t(grVar, bdVar3, Integer.valueOf(hashCode2));
                t30.p(grVar);
                t30.t(grVar, bdVar4, z2);
                StatusCard(moduleStatus, grVar, i5 & 14);
                GestureGuideCard(grVar, 0);
                ShortcutCard(eqVar, grVar, (i5 >> 3) & 14);
                InfoCard(grVar, 0);
                j20.a(t10.s(r20Var, appSpacing.m9getScreenBottomPaddingD9Ej5fM()), grVar);
                grVar.o(true);
                grVar.o(true);
                u20Var3 = u20Var4;
            }
            q = grVar.q();
            if (q == null) {
                q.d = new tq() { // from class: jt
                    @Override // defpackage.tq
                    public final Object invoke(Object obj5, Object obj6) {
                        fs0 HomeScreen$lambda$2;
                        int intValue = ((Integer) obj6).intValue();
                        HomeScreen$lambda$2 = HomeScreenKt.HomeScreen$lambda$2(ModuleStatus.this, eqVar, u20Var3, i, i2, (se) obj5, intValue);
                        return HomeScreen$lambda$2;
                    }
                };
                return;
            }
            return;
        }
        u20Var2 = u20Var;
        if (grVar.I(i3 & 1, (i3 & 147) == 146)) {
        }
        q = grVar.q();
        if (q == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 HomeScreen$lambda$2(ModuleStatus moduleStatus, eq eqVar, u20 u20Var, int i, int i2, se seVar, int i3) {
        HomeScreen(moduleStatus, eqVar, u20Var, seVar, v10.q(i | 1), i2);
        return fs0.a;
    }

    private static final void InfoCard(se seVar, int i) {
        gr grVar = (gr) seVar;
        grVar.Q(-398384798);
        int i2 = 1;
        if (grVar.I(i & 1, i != 0)) {
            nh.a(t10.l, AppShape.INSTANCE.getCardLarge(), null, null, kw.J(1003533268, new ia(i2, (Context) grVar.i(s3.b)), grVar), grVar, 196614, 28);
        } else {
            grVar.L();
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new dt(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 InfoCard$lambda$29(Context context, zc zcVar, se seVar, int i) {
        zcVar.getClass();
        int i2 = 0;
        gr grVar = (gr) seVar;
        if (grVar.I(i & 1, (i & 17) != 16)) {
            on onVar = t10.l;
            u20 F = nh.F(onVar, AppSpacing.INSTANCE.m3getCardPaddingD9Ej5fM());
            yc a = wc.a(new b7(2.0f, new z6(i2)), grVar, 6);
            int hashCode = Long.hashCode(grVar.Q);
            xa0 k = grVar.k();
            u20 z = dx0.z(grVar, F);
            le.c.getClass();
            grVar.R();
            if (grVar.P) {
                grVar.j();
            } else {
                grVar.b0();
            }
            bd bdVar = b2.x;
            t30.t(grVar, bdVar, a);
            bd bdVar2 = b2.w;
            t30.t(grVar, bdVar2, k);
            Integer valueOf = Integer.valueOf(hashCode);
            bd bdVar3 = b2.y;
            t30.t(grVar, bdVar3, valueOf);
            t30.p(grVar);
            bd bdVar4 = b2.v;
            t30.t(grVar, bdVar4, z);
            InfoRow("设备", StatusProbe.INSTANCE.deviceSummary(), grVar, 6);
            InfoRow("应用版本", "1.0", grVar, 6);
            String str = Build.DISPLAY;
            if (str.length() == 0) {
                str = "—";
            }
            InfoRow("ROM 版本", str, grVar, 6);
            boolean g = grVar.g(context);
            Object G = grVar.G();
            if (g || G == re.a) {
                G = new ht(context, i2);
                grVar.Y(G);
            }
            u20 G2 = nh.G(t10.h(onVar, (eq) G), 0.0f, 1);
            yc a2 = wc.a(lr0.b, grVar, 0);
            int hashCode2 = Long.hashCode(grVar.Q);
            xa0 k2 = grVar.k();
            u20 z2 = dx0.z(grVar, G2);
            grVar.R();
            if (grVar.P) {
                grVar.j();
            } else {
                grVar.b0();
            }
            t30.t(grVar, bdVar, a2);
            t30.t(grVar, bdVar2, k2);
            t30.t(grVar, bdVar3, Integer.valueOf(hashCode2));
            t30.p(grVar);
            t30.t(grVar, bdVar4, z2);
            grVar.o(true);
            grVar.o(true);
        } else {
            grVar.L();
        }
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 InfoCard$lambda$29$lambda$28$lambda$26$lambda$25(zc zcVar, Context context) {
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 InfoCard$lambda$30(int i, se seVar, int i2) {
        InfoCard(seVar, v10.q(i | 1));
        return fs0.a;
    }

    private static final void InfoRow(String str, String str2, se seVar, int i) {
        int i2;
        String str3;
        gr grVar;
        gr grVar2 = (gr) seVar;
        grVar2.Q(-1205998712);
        if ((i & 6) == 0) {
            i2 = i | (grVar2.e(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= grVar2.e(str2) ? 32 : 16;
        }
        int i3 = i2;
        if (grVar2.I(i3 & 1, (i3 & 19) != 18)) {
            u20 I = nh.I(r20.a, 7);
            yc a = wc.a(lr0.b, grVar2, 0);
            int hashCode = Long.hashCode(grVar2.Q);
            xa0 k = grVar2.k();
            u20 z = dx0.z(grVar2, I);
            le.c.getClass();
            grVar2.R();
            if (grVar2.P) {
                grVar2.j();
            } else {
                grVar2.b0();
            }
            t30.t(grVar2, b2.x, a);
            t30.t(grVar2, b2.w, k);
            t30.t(grVar2, b2.y, Integer.valueOf(hashCode));
            t30.p(grVar2);
            t30.t(grVar2, b2.v, z);
            AppText appText = AppText.INSTANCE;
            long m18getLabelXSAIIZE = appText.m18getLabelXSAIIZE();
            ll llVar = mc.a;
            kp0.b(str, null, ((kc) grVar2.i(llVar)).s, m18getLabelXSAIIZE, null, 0L, 0L, 0, false, 0, 0, null, grVar2, i3 & 14, 262122);
            str3 = str2;
            kp0.b(str3, null, ((kc) grVar2.i(llVar)).q, appText.m17getBodyXSAIIZE(), null, 0L, 0L, 0, false, 0, 0, null, grVar2, (i3 >> 3) & 14, 262122);
            grVar = grVar2;
            grVar.o(true);
        } else {
            str3 = str2;
            grVar = grVar2;
            grVar.L();
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new zd(i, 2, str, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 InfoRow$lambda$32(String str, String str2, int i, se seVar, int i2) {
        InfoRow(str, str2, seVar, v10.q(i | 1));
        return fs0.a;
    }

    private static final void ShortcutCard(eq eqVar, se seVar, int i) {
        int i2;
        gr grVar = (gr) seVar;
        grVar.Q(1020659322);
        if ((i & 6) == 0) {
            i2 = (grVar.g(eqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (grVar.I(i2 & 1, (i2 & 3) != 2)) {
            nh.a(t10.l, AppShape.INSTANCE.getCardLarge(), null, null, kw.J(2070379848, new et((vs) grVar.i(kf.l), eqVar, i3), grVar), grVar, 196614, 28);
        } else {
            grVar.L();
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new ft(i, i3, eqVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0587 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02fc  */
    /* JADX WARN: Type inference failed for: r59v1 */
    /* JADX WARN: Type inference failed for: r59v2 */
    /* JADX WARN: Type inference failed for: r59v3 */
    /* JADX WARN: Type inference failed for: r59v4, types: [fs0] */
    /* JADX WARN: Type inference failed for: r59v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final fs0 ShortcutCard$lambda$21(vs vsVar, eq eqVar, zc zcVar, se seVar, int i) {
        TypedValue typedValue;
        Resources.Theme theme;
        int i2;
        h90 k8Var;
        boolean g;
        Object G;
        boolean J;
        long j;
        long j2;
        int i3;
        int i4;
        int i5;
        int eventType;
        int i6;
        TypedArray obtainStyledAttributes;
        int i7;
        TypedArray obtainStyledAttributes2;
        int i8;
        int i9;
        int i10;
        int i11;
        ColorStateList colorStateList;
        zcVar.getClass();
        int i12 = 0;
        gr grVar = (gr) seVar;
        if (grVar.I(i & 1, (i & 17) != 16)) {
            r20 r20Var = r20.a;
            on onVar = t10.l;
            AppSpacing appSpacing = AppSpacing.INSTANCE;
            u20 F = nh.F(onVar, appSpacing.m3getCardPaddingD9Ej5fM());
            yc a = wc.a(new b7(appSpacing.m8getItemSpacingD9Ej5fM(), new z6(i12)), grVar, 0);
            int hashCode = Long.hashCode(grVar.Q);
            xa0 k = grVar.k();
            u20 z = dx0.z(grVar, F);
            le.c.getClass();
            grVar.R();
            if (grVar.P) {
                grVar.j();
            } else {
                grVar.b0();
            }
            bd bdVar = b2.x;
            t30.t(grVar, bdVar, a);
            bd bdVar2 = b2.w;
            t30.t(grVar, bdVar2, k);
            Integer valueOf = Integer.valueOf(hashCode);
            bd bdVar3 = b2.y;
            t30.t(grVar, bdVar3, valueOf);
            t30.p(grVar);
            bd bdVar4 = b2.v;
            t30.t(grVar, bdVar4, z);
            ug0 a2 = tg0.a(lr0.a, b2.p, grVar, 48);
            int hashCode2 = Long.hashCode(grVar.Q);
            xa0 k2 = grVar.k();
            u20 z2 = dx0.z(grVar, r20Var);
            grVar.R();
            if (grVar.P) {
                grVar.j();
            } else {
                grVar.b0();
            }
            t30.t(grVar, bdVar, a2);
            t30.t(grVar, bdVar2, k2);
            t30.t(grVar, bdVar3, Integer.valueOf(hashCode2));
            t30.p(grVar);
            t30.t(grVar, bdVar4, z2);
            int i13 = R.drawable.workbench_shortcut;
            Context context = (Context) grVar.i(s3.b);
            Resources resources = (Resources) grVar.i(s3.c);
            nf0 nf0Var = (nf0) grVar.i(s3.e);
            synchronized (nf0Var) {
                typedValue = (TypedValue) nf0Var.a.b(i13);
                if (typedValue == null) {
                    typedValue = new TypedValue();
                    resources.getValue(i13, typedValue, true);
                    y30 y30Var = nf0Var.a;
                    int d = y30Var.d(i13);
                    Object[] objArr = y30Var.c;
                    Object obj = objArr[d];
                    y30Var.b[d] = i13;
                    objArr[d] = typedValue;
                }
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                if (charSequence instanceof String) {
                    J = ((String) charSequence).endsWith(".xml");
                    theme = 0;
                } else {
                    theme = 0;
                    J = ln0.J(charSequence, charSequence.length() - 4, ".xml", 0, 4, false);
                }
                if (J) {
                    grVar.P(-1771798434);
                    Resources.Theme theme2 = context.getTheme();
                    int i14 = typedValue.changingConfigurations;
                    zt ztVar = (zt) grVar.i(s3.d);
                    yt ytVar = new yt(theme2, i13);
                    WeakReference weakReference = (WeakReference) ztVar.a.get(ytVar);
                    xt xtVar = weakReference != null ? (xt) weakReference.get() : theme;
                    if (xtVar == null) {
                        XmlResourceParser xml = resources.getXml(i13);
                        int next = xml.next();
                        while (next != 2 && next != 1) {
                            next = xml.next();
                        }
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (!lw.i(xml.getName(), "vector")) {
                            z6.l("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                            return theme;
                        }
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        q5 q5Var = new q5();
                        q5Var.c = xml;
                        q5Var.a = 0;
                        z1 z1Var = new z1();
                        z1Var.b = new float[64];
                        q5Var.e = z1Var;
                        int[] iArr = kw.a;
                        TypedArray obtainAttributes = theme2 == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme2.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
                        q5Var.f(obtainAttributes.getChangingConfigurations());
                        boolean z3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null ? obtainAttributes.getBoolean(5, false) : false;
                        q5Var.f(obtainAttributes.getChangingConfigurations());
                        float c = q5Var.c(obtainAttributes, "viewportWidth", 7, 0.0f);
                        float c2 = q5Var.c(obtainAttributes, "viewportHeight", 8, 0.0f);
                        if (c <= 0.0f) {
                            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                        }
                        if (c2 <= 0.0f) {
                            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                        }
                        float dimension = obtainAttributes.getDimension(3, 0.0f);
                        q5Var.f(obtainAttributes.getChangingConfigurations());
                        float dimension2 = obtainAttributes.getDimension(2, 0.0f);
                        q5Var.f(obtainAttributes.getChangingConfigurations());
                        if (obtainAttributes.hasValue(1)) {
                            TypedValue typedValue2 = new TypedValue();
                            obtainAttributes.getValue(1, typedValue2);
                            if (typedValue2.type == 2) {
                                j2 = gc.f;
                                i3 = obtainAttributes.getInt(6, -1);
                                q5Var.f(obtainAttributes.getChangingConfigurations());
                                if (i3 != -1) {
                                    if (i3 == 3) {
                                        i4 = 3;
                                    } else if (i3 != 5) {
                                        if (i3 != 9) {
                                            switch (i3) {
                                                case 14:
                                                    i4 = 13;
                                                    break;
                                                case 15:
                                                    i4 = 14;
                                                    break;
                                                case 16:
                                                    i4 = 12;
                                                    break;
                                            }
                                        } else {
                                            i4 = 9;
                                        }
                                    }
                                    float f = dimension / resources.getDisplayMetrics().density;
                                    float f2 = dimension2 / resources.getDisplayMetrics().density;
                                    obtainAttributes.recycle();
                                    vt vtVar = new vt(null, f, f2, c, c2, j2, i4, z3, 1);
                                    i5 = 0;
                                    while (xml.getEventType() != 1 && (xml.getDepth() >= 1 || xml.getEventType() != 3)) {
                                        List list = um.e;
                                        XmlPullParser xmlPullParser = (XmlPullParser) q5Var.c;
                                        int i15 = i5;
                                        z1 z1Var2 = (z1) q5Var.e;
                                        int i16 = i14;
                                        eventType = xmlPullParser.getEventType();
                                        XmlResourceParser xmlResourceParser = xml;
                                        if (eventType == 2) {
                                            if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                                int i17 = i15 + 1;
                                                for (int i18 = 0; i18 < i17; i18++) {
                                                    ArrayList arrayList = vtVar.i;
                                                    if (vtVar.k) {
                                                        cv.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                    }
                                                    ut utVar = (ut) arrayList.remove(arrayList.size() - 1);
                                                    ((ut) arrayList.get(arrayList.size() - 1)).j.add(new ys0(utVar.a, utVar.b, utVar.c, utVar.d, utVar.e, utVar.f, utVar.g, utVar.h, utVar.i, utVar.j));
                                                }
                                                int[] iArr2 = (int[]) q5Var.d;
                                                if (iArr2 != null && (i11 = q5Var.b) != 0) {
                                                    int i19 = i11 - 1;
                                                    q5Var.b = i19;
                                                    i5 = iArr2[i19];
                                                }
                                                i5 = 0;
                                            }
                                            i5 = i15;
                                        } else {
                                            String name = xmlPullParser.getName();
                                            if (name != null) {
                                                int hashCode3 = name.hashCode();
                                                if (hashCode3 == -1649314686) {
                                                    if (name.equals("clip-path")) {
                                                        int[] iArr3 = kw.d;
                                                        if (theme2 == null) {
                                                            obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr3);
                                                            i6 = 0;
                                                        } else {
                                                            i6 = 0;
                                                            obtainStyledAttributes = theme2.obtainStyledAttributes(asAttributeSet, iArr3, 0, 0);
                                                        }
                                                        q5Var.f(obtainStyledAttributes.getChangingConfigurations());
                                                        String string = obtainStyledAttributes.getString(i6);
                                                        q5Var.f(obtainStyledAttributes.getChangingConfigurations());
                                                        String str = string == null ? "" : string;
                                                        String string2 = obtainStyledAttributes.getString(1);
                                                        q5Var.f(obtainStyledAttributes.getChangingConfigurations());
                                                        if (string2 == null) {
                                                            int i20 = zs0.a;
                                                        } else {
                                                            list = z1.a(z1Var2, string2);
                                                        }
                                                        List list2 = list;
                                                        obtainStyledAttributes.recycle();
                                                        if (vtVar.k) {
                                                            cv.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                        }
                                                        vtVar.i.add(new ut(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                                        i5 = i15 + 1;
                                                    }
                                                    i5 = i15;
                                                } else if (hashCode3 != 3433509) {
                                                    if (hashCode3 == 98629247 && name.equals("group")) {
                                                        int[] iArr4 = kw.b;
                                                        TypedArray obtainAttributes2 = theme2 == null ? resources.obtainAttributes(asAttributeSet, iArr4) : theme2.obtainStyledAttributes(asAttributeSet, iArr4, 0, 0);
                                                        q5Var.f(obtainAttributes2.getChangingConfigurations());
                                                        float c3 = q5Var.c(obtainAttributes2, "rotation", 5, 0.0f);
                                                        float f3 = obtainAttributes2.getFloat(1, 0.0f);
                                                        q5Var.f(obtainAttributes2.getChangingConfigurations());
                                                        float f4 = obtainAttributes2.getFloat(2, 0.0f);
                                                        q5Var.f(obtainAttributes2.getChangingConfigurations());
                                                        float c4 = q5Var.c(obtainAttributes2, "scaleX", 3, 1.0f);
                                                        float c5 = q5Var.c(obtainAttributes2, "scaleY", 4, 1.0f);
                                                        float c6 = q5Var.c(obtainAttributes2, "translateX", 6, 0.0f);
                                                        float c7 = q5Var.c(obtainAttributes2, "translateY", 7, 0.0f);
                                                        String string3 = obtainAttributes2.getString(0);
                                                        q5Var.f(obtainAttributes2.getChangingConfigurations());
                                                        String str2 = string3 == null ? "" : string3;
                                                        obtainAttributes2.recycle();
                                                        int i21 = zs0.a;
                                                        if (vtVar.k) {
                                                            cv.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                        }
                                                        vtVar.i.add(new ut(str2, c3, f3, f4, c4, c5, c6, c7, list, 512));
                                                        int[] iArr5 = (int[]) q5Var.d;
                                                        if (iArr5 == null) {
                                                            iArr5 = new int[4];
                                                            q5Var.d = iArr5;
                                                        } else if (q5Var.b >= iArr5.length) {
                                                            iArr5 = Arrays.copyOf(iArr5, iArr5.length * 2);
                                                            q5Var.d = iArr5;
                                                        }
                                                        int i22 = q5Var.b;
                                                        q5Var.b = i22 + 1;
                                                        iArr5[i22] = i15;
                                                        i5 = 0;
                                                    }
                                                } else if (name.equals("path")) {
                                                    int[] iArr6 = kw.c;
                                                    if (theme2 == null) {
                                                        obtainStyledAttributes2 = resources.obtainAttributes(asAttributeSet, iArr6);
                                                        i7 = 0;
                                                    } else {
                                                        i7 = 0;
                                                        obtainStyledAttributes2 = theme2.obtainStyledAttributes(asAttributeSet, iArr6, 0, 0);
                                                    }
                                                    q5Var.f(obtainStyledAttributes2.getChangingConfigurations());
                                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                                        z6.l("No path data available");
                                                        return theme;
                                                    }
                                                    String string4 = obtainStyledAttributes2.getString(i7);
                                                    q5Var.f(obtainStyledAttributes2.getChangingConfigurations());
                                                    String str3 = string4 == null ? "" : string4;
                                                    String string5 = obtainStyledAttributes2.getString(2);
                                                    q5Var.f(obtainStyledAttributes2.getChangingConfigurations());
                                                    if (string5 == null) {
                                                        int i23 = zs0.a;
                                                    } else {
                                                        list = z1.a(z1Var2, string5);
                                                    }
                                                    List list3 = list;
                                                    jd b = q5Var.b(obtainStyledAttributes2, theme2, "fillColor", 1);
                                                    float c8 = q5Var.c(obtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                                    int i24 = !v10.i((XmlPullParser) q5Var.c, "strokeLineCap") ? -1 : obtainStyledAttributes2.getInt(8, -1);
                                                    q5Var.f(obtainStyledAttributes2.getChangingConfigurations());
                                                    if (i24 != 0) {
                                                        if (i24 == 1) {
                                                            i8 = 1;
                                                        } else if (i24 == 2) {
                                                            i8 = 2;
                                                        }
                                                        i9 = v10.i((XmlPullParser) q5Var.c, "strokeLineJoin") ? -1 : obtainStyledAttributes2.getInt(9, -1);
                                                        q5Var.f(obtainStyledAttributes2.getChangingConfigurations());
                                                        if (i9 != 0) {
                                                            if (i9 == 1) {
                                                                i10 = 1;
                                                            } else if (i9 == 2) {
                                                                i10 = 2;
                                                            }
                                                            float c9 = q5Var.c(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                            jd b2 = q5Var.b(obtainStyledAttributes2, theme2, "strokeColor", 3);
                                                            float c10 = q5Var.c(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                            float c11 = q5Var.c(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                            float c12 = q5Var.c(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                            float c13 = q5Var.c(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                            float c14 = q5Var.c(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                            int i25 = !v10.i((XmlPullParser) q5Var.c, "fillType") ? 0 : obtainStyledAttributes2.getInt(13, 0);
                                                            q5Var.f(obtainStyledAttributes2.getChangingConfigurations());
                                                            obtainStyledAttributes2.recycle();
                                                            Shader shader = (Shader) b.f;
                                                            int i26 = b.e;
                                                            dx0 j9Var = (shader == null && i26 == 0) ? theme : shader != null ? new j9(shader) : new jm0(lw.c(i26));
                                                            Shader shader2 = (Shader) b2.f;
                                                            int i27 = b2.e;
                                                            dx0 j9Var2 = (shader2 == null && i27 == 0) ? theme : shader2 == null ? new j9(shader2) : new jm0(lw.c(i27));
                                                            int i28 = i25 == 0 ? 0 : 1;
                                                            if (vtVar.k) {
                                                                cv.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                            }
                                                            ((ut) vtVar.i.get(r0.size() - 1)).j.add(new ct0(str3, list3, i28, j9Var, c8, j9Var2, c10, c11, i8, i10, c9, c14, c12, c13));
                                                            i5 = i15;
                                                        }
                                                        i10 = 0;
                                                        float c92 = q5Var.c(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                        jd b22 = q5Var.b(obtainStyledAttributes2, theme2, "strokeColor", 3);
                                                        float c102 = q5Var.c(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                        float c112 = q5Var.c(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                        float c122 = q5Var.c(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                        float c132 = q5Var.c(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                        float c142 = q5Var.c(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                        if (!v10.i((XmlPullParser) q5Var.c, "fillType")) {
                                                        }
                                                        q5Var.f(obtainStyledAttributes2.getChangingConfigurations());
                                                        obtainStyledAttributes2.recycle();
                                                        Shader shader3 = (Shader) b.f;
                                                        int i262 = b.e;
                                                        if (shader3 == null) {
                                                            Shader shader22 = (Shader) b22.f;
                                                            int i272 = b22.e;
                                                            if (shader22 == null) {
                                                                if (i25 == 0) {
                                                                }
                                                                if (vtVar.k) {
                                                                }
                                                                ((ut) vtVar.i.get(r0.size() - 1)).j.add(new ct0(str3, list3, i28, j9Var, c8, j9Var2, c102, c112, i8, i10, c92, c142, c122, c132));
                                                                i5 = i15;
                                                            }
                                                            if (i25 == 0) {
                                                            }
                                                            if (vtVar.k) {
                                                            }
                                                            ((ut) vtVar.i.get(r0.size() - 1)).j.add(new ct0(str3, list3, i28, j9Var, c8, j9Var2, c102, c112, i8, i10, c92, c142, c122, c132));
                                                            i5 = i15;
                                                        }
                                                        Shader shader222 = (Shader) b22.f;
                                                        int i2722 = b22.e;
                                                        if (shader222 == null) {
                                                        }
                                                        if (i25 == 0) {
                                                        }
                                                        if (vtVar.k) {
                                                        }
                                                        ((ut) vtVar.i.get(r0.size() - 1)).j.add(new ct0(str3, list3, i28, j9Var, c8, j9Var2, c102, c112, i8, i10, c92, c142, c122, c132));
                                                        i5 = i15;
                                                    }
                                                    i8 = 0;
                                                    if (v10.i((XmlPullParser) q5Var.c, "strokeLineJoin")) {
                                                    }
                                                    q5Var.f(obtainStyledAttributes2.getChangingConfigurations());
                                                    if (i9 != 0) {
                                                    }
                                                    i10 = 0;
                                                    float c922 = q5Var.c(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                    jd b222 = q5Var.b(obtainStyledAttributes2, theme2, "strokeColor", 3);
                                                    float c1022 = q5Var.c(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                    float c1122 = q5Var.c(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                    float c1222 = q5Var.c(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                    float c1322 = q5Var.c(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                    float c1422 = q5Var.c(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                    if (!v10.i((XmlPullParser) q5Var.c, "fillType")) {
                                                    }
                                                    q5Var.f(obtainStyledAttributes2.getChangingConfigurations());
                                                    obtainStyledAttributes2.recycle();
                                                    Shader shader32 = (Shader) b.f;
                                                    int i2622 = b.e;
                                                    if (shader32 == null) {
                                                    }
                                                    Shader shader2222 = (Shader) b222.f;
                                                    int i27222 = b222.e;
                                                    if (shader2222 == null) {
                                                    }
                                                    if (i25 == 0) {
                                                    }
                                                    if (vtVar.k) {
                                                    }
                                                    ((ut) vtVar.i.get(r0.size() - 1)).j.add(new ct0(str3, list3, i28, j9Var, c8, j9Var2, c1022, c1122, i8, i10, c922, c1422, c1222, c1322));
                                                    i5 = i15;
                                                }
                                            }
                                            i5 = i15;
                                        }
                                        xmlResourceParser.next();
                                        i14 = i16;
                                        xml = xmlResourceParser;
                                    }
                                    i2 = 9;
                                    xtVar = new xt(vtVar.b(), i14 | q5Var.a);
                                    ztVar.a.put(ytVar, new WeakReference(xtVar));
                                }
                                i4 = 5;
                                float f5 = dimension / resources.getDisplayMetrics().density;
                                float f22 = dimension2 / resources.getDisplayMetrics().density;
                                obtainAttributes.recycle();
                                vt vtVar2 = new vt(null, f5, f22, c, c2, j2, i4, z3, 1);
                                i5 = 0;
                                while (xml.getEventType() != 1) {
                                    List list4 = um.e;
                                    XmlPullParser xmlPullParser2 = (XmlPullParser) q5Var.c;
                                    int i152 = i5;
                                    z1 z1Var22 = (z1) q5Var.e;
                                    int i162 = i14;
                                    eventType = xmlPullParser2.getEventType();
                                    XmlResourceParser xmlResourceParser2 = xml;
                                    if (eventType == 2) {
                                    }
                                    xmlResourceParser2.next();
                                    i14 = i162;
                                    xml = xmlResourceParser2;
                                }
                                i2 = 9;
                                xtVar = new xt(vtVar2.b(), i14 | q5Var.a);
                                ztVar.a.put(ytVar, new WeakReference(xtVar));
                            } else {
                                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                                    TypedValue typedValue3 = new TypedValue();
                                    obtainAttributes.getValue(1, typedValue3);
                                    int i29 = typedValue3.type;
                                    if (i29 == 2) {
                                        throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                                    }
                                    if (i29 < 28 || i29 > 31) {
                                        Resources resources2 = obtainAttributes.getResources();
                                        int resourceId = obtainAttributes.getResourceId(1, 0);
                                        ThreadLocal threadLocal = rc.a;
                                        try {
                                            colorStateList = rc.a(resources2, resources2.getXml(resourceId), theme2);
                                        } catch (Exception e) {
                                            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                                        }
                                    } else {
                                        colorStateList = ColorStateList.valueOf(typedValue3.data);
                                    }
                                    q5Var.f(obtainAttributes.getChangingConfigurations());
                                    j = colorStateList == null ? lw.c(colorStateList.getDefaultColor()) : gc.f;
                                }
                                colorStateList = theme;
                                q5Var.f(obtainAttributes.getChangingConfigurations());
                                if (colorStateList == null) {
                                }
                            }
                        } else {
                            j = gc.f;
                        }
                        j2 = j;
                        i3 = obtainAttributes.getInt(6, -1);
                        q5Var.f(obtainAttributes.getChangingConfigurations());
                        if (i3 != -1) {
                        }
                        i4 = 5;
                        float f52 = dimension / resources.getDisplayMetrics().density;
                        float f222 = dimension2 / resources.getDisplayMetrics().density;
                        obtainAttributes.recycle();
                        vt vtVar22 = new vt(null, f52, f222, c, c2, j2, i4, z3, 1);
                        i5 = 0;
                        while (xml.getEventType() != 1) {
                        }
                        i2 = 9;
                        xtVar = new xt(vtVar22.b(), i14 | q5Var.a);
                        ztVar.a.put(ytVar, new WeakReference(xtVar));
                    } else {
                        i2 = 9;
                    }
                    k8Var = j20.n(xtVar.a, grVar);
                    grVar.o(false);
                    h90 h90Var = k8Var;
                    AppSpacing appSpacing2 = AppSpacing.INSTANCE;
                    u20 C = t10.C(appSpacing2.m5getIconContainerSizeD9Ej5fM());
                    ll llVar = mc.a;
                    int i30 = i2;
                    t10.b(h90Var, dx0.i(C, ((kc) grVar.i(llVar)).r, qg0.a(10.0f)), null, null, 0.0f, grVar, 56);
                    j20.a(t10.C(appSpacing2.m7getIconTextSpacingD9Ej5fM()), grVar);
                    my myVar = new my(1.0f);
                    yc a3 = wc.a(lr0.b, grVar, 0);
                    int hashCode4 = Long.hashCode(grVar.Q);
                    xa0 k3 = grVar.k();
                    u20 z4 = dx0.z(grVar, myVar);
                    le.c.getClass();
                    grVar.R();
                    if (grVar.P) {
                        grVar.b0();
                    } else {
                        grVar.j();
                    }
                    t30.t(grVar, b2.x, a3);
                    t30.t(grVar, b2.w, k3);
                    t30.t(grVar, b2.y, Integer.valueOf(hashCode4));
                    t30.p(grVar);
                    t30.t(grVar, b2.v, z4);
                    AppText appText = AppText.INSTANCE;
                    kp0.b("桌面快捷方式", null, 0L, appText.m17getBodyXSAIIZE(), xp.i, 0L, 0L, 0, false, 0, 0, null, grVar, 1572870, 262062);
                    kp0.b("在桌面创建「原子工作台」图标，一键进入", null, ((kc) grVar.i(llVar)).s, appText.m18getLabelXSAIIZE(), null, 0L, 0L, 0, false, 0, 0, null, grVar, 6, 262122);
                    grVar.o(true);
                    grVar.o(true);
                    g = grVar.g(vsVar) | grVar.e(eqVar);
                    G = grVar.G();
                    if (!g || G == re.a) {
                        G = new s2(i30, vsVar, eqVar);
                        grVar.Y(G);
                    }
                    kw.b((eq) G, t10.s(t10.l, 46.0f), false, AppShape.INSTANCE.getButtonMedium(), null, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.m1getLambda$414033374$app(), grVar, 805306416);
                    kp0.b("创建后系统会弹一次确认；不想要了在桌面长按图标删除即可", null, ((kc) grVar.i(llVar)).s, appText.m18getLabelXSAIIZE(), null, 0L, 0L, 0, false, 0, 0, null, grVar, 6, 262122);
                    grVar.o(true);
                }
            } else {
                theme = 0;
            }
            i2 = 9;
            grVar.P(-1771643000);
            boolean e2 = grVar.e(context.getTheme()) | grVar.e(charSequence) | grVar.c(i13);
            Object G2 = grVar.G();
            if (e2 || G2 == re.a) {
                try {
                    Drawable drawable = resources.getDrawable(i13, theme);
                    drawable.getClass();
                    G2 = new s4(((BitmapDrawable) drawable).getBitmap());
                    grVar.Y(G2);
                } catch (Exception e3) {
                    throw new id("Error attempting to load resource: " + ((Object) charSequence), e3);
                }
            }
            k8Var = new k8((s4) G2);
            grVar.o(false);
            h90 h90Var2 = k8Var;
            AppSpacing appSpacing22 = AppSpacing.INSTANCE;
            u20 C2 = t10.C(appSpacing22.m5getIconContainerSizeD9Ej5fM());
            ll llVar2 = mc.a;
            int i302 = i2;
            t10.b(h90Var2, dx0.i(C2, ((kc) grVar.i(llVar2)).r, qg0.a(10.0f)), null, null, 0.0f, grVar, 56);
            j20.a(t10.C(appSpacing22.m7getIconTextSpacingD9Ej5fM()), grVar);
            my myVar2 = new my(1.0f);
            yc a32 = wc.a(lr0.b, grVar, 0);
            int hashCode42 = Long.hashCode(grVar.Q);
            xa0 k32 = grVar.k();
            u20 z42 = dx0.z(grVar, myVar2);
            le.c.getClass();
            grVar.R();
            if (grVar.P) {
            }
            t30.t(grVar, b2.x, a32);
            t30.t(grVar, b2.w, k32);
            t30.t(grVar, b2.y, Integer.valueOf(hashCode42));
            t30.p(grVar);
            t30.t(grVar, b2.v, z42);
            AppText appText2 = AppText.INSTANCE;
            kp0.b("桌面快捷方式", null, 0L, appText2.m17getBodyXSAIIZE(), xp.i, 0L, 0L, 0, false, 0, 0, null, grVar, 1572870, 262062);
            kp0.b("在桌面创建「原子工作台」图标，一键进入", null, ((kc) grVar.i(llVar2)).s, appText2.m18getLabelXSAIIZE(), null, 0L, 0L, 0, false, 0, 0, null, grVar, 6, 262122);
            grVar.o(true);
            grVar.o(true);
            g = grVar.g(vsVar) | grVar.e(eqVar);
            G = grVar.G();
            if (!g) {
            }
            G = new s2(i302, vsVar, eqVar);
            grVar.Y(G);
            kw.b((eq) G, t10.s(t10.l, 46.0f), false, AppShape.INSTANCE.getButtonMedium(), null, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.m1getLambda$414033374$app(), grVar, 805306416);
            kp0.b("创建后系统会弹一次确认；不想要了在桌面长按图标删除即可", null, ((kc) grVar.i(llVar2)).s, appText2.m18getLabelXSAIIZE(), null, 0L, 0L, 0, false, 0, 0, null, grVar, 6, 262122);
            grVar.o(true);
        } else {
            grVar.L();
        }
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 ShortcutCard$lambda$21$lambda$20$lambda$19$lambda$18(vs vsVar, eq eqVar) {
        jc0 jc0Var = (jc0) vsVar;
        jc0Var.getClass();
        View view = jc0Var.a;
        int i = ut0.a;
        view.performHapticFeedback(0);
        eqVar.b();
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 ShortcutCard$lambda$22(eq eqVar, int i, se seVar, int i2) {
        ShortcutCard(eqVar, seVar, v10.q(i | 1));
        return fs0.a;
    }

    private static final void StatusCard(ModuleStatus moduleStatus, se seVar, int i) {
        int i2;
        long j;
        long j2;
        final long j3;
        wt wtVar;
        gr grVar = (gr) seVar;
        grVar.Q(-1523254852);
        if ((i & 6) == 0) {
            i2 = (grVar.e(moduleStatus) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (grVar.I(i2 & 1, (i2 & 3) != 2)) {
            boolean injected = moduleStatus.getInjected();
            ll llVar = mc.a;
            boolean z = m2luminance8_81llA(((kc) grVar.i(llVar)).n) < 0.5f;
            if (injected) {
                grVar.P(1339340691);
                grVar.o(false);
                StatusColors statusColors = StatusColors.INSTANCE;
                j = z ? statusColors.m21getActiveDarkBg0d7_KjU() : statusColors.m24getActiveLightBg0d7_KjU();
            } else {
                grVar.P(1339428142);
                j = ((kc) grVar.i(llVar)).r;
                grVar.o(false);
            }
            if (injected) {
                grVar.P(1339513423);
                grVar.o(false);
                StatusColors statusColors2 = StatusColors.INSTANCE;
                j2 = z ? statusColors2.m22getActiveDarkIcon0d7_KjU() : statusColors2.m25getActiveLightIcon0d7_KjU();
            } else {
                grVar.P(1339604780);
                j2 = ((kc) grVar.i(llVar)).s;
                grVar.o(false);
            }
            final long j4 = j2;
            if (injected) {
                grVar.P(1339697935);
                grVar.o(false);
                j3 = z ? StatusColors.INSTANCE.m23getActiveDarkText0d7_KjU() : StatusColors.INSTANCE.m26getActiveLightText0d7_KjU();
            } else {
                grVar.P(1339789075);
                long j5 = ((kc) grVar.i(llVar)).q;
                grVar.o(false);
                j3 = j5;
            }
            if (injected) {
                wtVar = lr0.t;
                if (wtVar == null) {
                    vt vtVar = new vt("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i3 = zs0.a;
                    jm0 jm0Var = new jm0(gc.b);
                    t3 t3Var = new t3(14);
                    ArrayList arrayList = (ArrayList) t3Var.f;
                    t3Var.u(12.0f, 2.0f);
                    arrayList.add(new ba0(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f));
                    t3Var.w(4.48f, 10.0f, 10.0f, 10.0f);
                    t3Var.w(10.0f, -4.48f, 10.0f, -10.0f);
                    arrayList.add(new ga0(17.52f, 2.0f, 12.0f, 2.0f));
                    t3Var.m();
                    t3Var.u(10.0f, 17.0f);
                    t3Var.t(-5.0f, -5.0f);
                    t3Var.t(1.41f, -1.41f);
                    t3Var.s(10.0f, 14.17f);
                    t3Var.t(7.59f, -7.59f);
                    t3Var.s(19.0f, 8.0f);
                    t3Var.t(-9.0f, 9.0f);
                    t3Var.m();
                    vt.a(vtVar, arrayList, jm0Var);
                    wtVar = vtVar.b();
                    lr0.t = wtVar;
                }
            } else {
                wt wtVar2 = m20.b;
                if (wtVar2 != null) {
                    wtVar = wtVar2;
                } else {
                    vt vtVar2 = new vt("Filled.Warning", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i4 = zs0.a;
                    jm0 jm0Var2 = new jm0(gc.b);
                    t3 t3Var2 = new t3(14);
                    ArrayList arrayList2 = (ArrayList) t3Var2.f;
                    t3Var2.u(1.0f, 21.0f);
                    t3Var2.p(22.0f);
                    t3Var2.s(12.0f, 2.0f);
                    t3Var2.s(1.0f, 21.0f);
                    t3Var2.m();
                    t3Var2.u(13.0f, 18.0f);
                    t3Var2.p(-2.0f);
                    arrayList2.add(new qa0(-2.0f));
                    t3Var2.p(2.0f);
                    arrayList2.add(new qa0(2.0f));
                    t3Var2.m();
                    t3Var2.u(13.0f, 14.0f);
                    t3Var2.p(-2.0f);
                    arrayList2.add(new qa0(-4.0f));
                    t3Var2.p(2.0f);
                    arrayList2.add(new qa0(4.0f));
                    t3Var2.m();
                    vt.a(vtVar2, arrayList2, jm0Var2);
                    wt b = vtVar2.b();
                    m20.b = b;
                    wtVar = b;
                }
            }
            final wt wtVar3 = wtVar;
            final String str = injected ? "模块已生效" : "模块未生效";
            final String str2 = injected ? "LSPosed 作用域已包含 SystemUI" : "未检测到 SystemUI 注入：请在 LSPosed 里勾选本模块的 SystemUI 作用域";
            final String str3 = injected ? "手势和桌面快捷方式都可以进原子工作台" : "首次勾选作用域后需软重启 SystemUI 才会生效";
            on onVar = t10.l;
            long b2 = mc.b(j, grVar);
            long j6 = gc.f;
            long b3 = gc.b(b2, 0.38f);
            qa u = q3.u((kc) grVar.i(llVar));
            if (j == 16) {
                j = u.a;
            }
            long j7 = j;
            if (b2 == 16) {
                b2 = u.b;
            }
            long j8 = b2;
            if (j6 == 16) {
                j6 = u.c;
            }
            long j9 = j6;
            if (b3 == 16) {
                b3 = u.d;
            }
            nh.a(onVar, AppShape.INSTANCE.getCardLarge(), new qa(j7, j8, j9, b3), null, kw.J(953310382, new uq() { // from class: gt
                @Override // defpackage.uq
                public final Object c(Object obj, Object obj2, Object obj3) {
                    fs0 StatusCard$lambda$10;
                    int intValue = ((Integer) obj3).intValue();
                    StatusCard$lambda$10 = HomeScreenKt.StatusCard$lambda$10(wt.this, j4, str, j3, str2, str3, (zc) obj, (se) obj2, intValue);
                    return StatusCard$lambda$10;
                }
            }, grVar), grVar, 196614, 24);
        } else {
            grVar.L();
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new ft(i, 1, moduleStatus);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 StatusCard$lambda$10(wt wtVar, long j, String str, long j2, String str2, String str3, zc zcVar, se seVar, int i) {
        zcVar.getClass();
        gr grVar = (gr) seVar;
        if (grVar.I(i & 1, (i & 17) != 16)) {
            u20 s = t10.s(t10.l, 150.0f);
            j8 j8Var = b2.f;
            b20 c = t8.c(j8Var, false);
            int hashCode = Long.hashCode(grVar.Q);
            xa0 k = grVar.k();
            u20 z = dx0.z(grVar, s);
            le.c.getClass();
            grVar.R();
            if (grVar.P) {
                grVar.j();
            } else {
                grVar.b0();
            }
            bd bdVar = b2.x;
            t30.t(grVar, bdVar, c);
            bd bdVar2 = b2.w;
            t30.t(grVar, bdVar2, k);
            Integer valueOf = Integer.valueOf(hashCode);
            bd bdVar3 = b2.y;
            t30.t(grVar, bdVar3, valueOf);
            t30.p(grVar);
            bd bdVar4 = b2.v;
            t30.t(grVar, bdVar4, z);
            on onVar = t10.m;
            u20 E = q3.E(onVar);
            b20 c2 = t8.c(b2.n, false);
            int hashCode2 = Long.hashCode(grVar.Q);
            xa0 k2 = grVar.k();
            u20 z2 = dx0.z(grVar, E);
            grVar.R();
            if (grVar.P) {
                grVar.j();
            } else {
                grVar.b0();
            }
            t30.t(grVar, bdVar, c2);
            t30.t(grVar, bdVar2, k2);
            t30.t(grVar, bdVar3, Integer.valueOf(hashCode2));
            t30.p(grVar);
            t30.t(grVar, bdVar4, z2);
            st.a(wtVar, t10.C(150.0f), gc.b(j, 0.28f), grVar, 432);
            grVar.o(true);
            u20 I = nh.I(onVar, 12);
            b20 c3 = t8.c(j8Var, false);
            int hashCode3 = Long.hashCode(grVar.Q);
            xa0 k3 = grVar.k();
            u20 z3 = dx0.z(grVar, I);
            grVar.R();
            if (grVar.P) {
                grVar.j();
            } else {
                grVar.b0();
            }
            t30.t(grVar, bdVar, c3);
            t30.t(grVar, bdVar2, k3);
            t30.t(grVar, bdVar3, Integer.valueOf(hashCode3));
            t30.p(grVar);
            t30.t(grVar, bdVar4, z3);
            yc a = wc.a(lr0.b, grVar, 0);
            int hashCode4 = Long.hashCode(grVar.Q);
            xa0 k4 = grVar.k();
            r20 r20Var = r20.a;
            u20 z4 = dx0.z(grVar, r20Var);
            grVar.R();
            if (grVar.P) {
                grVar.j();
            } else {
                grVar.b0();
            }
            t30.t(grVar, bdVar, a);
            t30.t(grVar, bdVar2, k4);
            t30.t(grVar, bdVar3, Integer.valueOf(hashCode4));
            t30.p(grVar);
            t30.t(grVar, bdVar4, z4);
            AppText appText = AppText.INSTANCE;
            kp0.b(str, null, j2, appText.m20getTitleXSAIIZE(), xp.i, 0L, 0L, 0, false, 0, 0, null, grVar, 1572864, 262058);
            j20.a(t10.s(r20Var, AppSpacing.INSTANCE.m16getTitleSubtitleSpacingD9Ej5fM()), grVar);
            long m17getBodyXSAIIZE = appText.m17getBodyXSAIIZE();
            xp xpVar = xp.h;
            kp0.b(str2, null, gc.b(j2, 0.85f), m17getBodyXSAIIZE, xpVar, 0L, 0L, 0, false, 0, 0, null, grVar, 1572864, 262058);
            grVar.o(true);
            grVar.o(true);
            u20 I2 = nh.I(onVar, 6);
            b20 c4 = t8.c(b2.l, false);
            int hashCode5 = Long.hashCode(grVar.Q);
            xa0 k5 = grVar.k();
            u20 z5 = dx0.z(grVar, I2);
            grVar.R();
            if (grVar.P) {
                grVar.j();
            } else {
                grVar.b0();
            }
            t30.t(grVar, bdVar, c4);
            t30.t(grVar, bdVar2, k5);
            t30.t(grVar, bdVar3, Integer.valueOf(hashCode5));
            t30.p(grVar);
            t30.t(grVar, bdVar4, z5);
            kp0.b(str3, null, gc.b(j2, 0.9f), appText.m17getBodyXSAIIZE(), xpVar, 0L, 0L, 0, false, 0, 0, null, grVar, 1572864, 262058);
            grVar.o(true);
            grVar.o(true);
        } else {
            grVar.L();
        }
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 StatusCard$lambda$11(ModuleStatus moduleStatus, int i, se seVar, int i2) {
        StatusCard(moduleStatus, seVar, v10.q(i | 1));
        return fs0.a;
    }

    /* renamed from: luminance-8_81llA, reason: not valid java name */
    private static final float m2luminance8_81llA(long j) {
        return (gc.d(j) * 0.114f) + (gc.f(j) * 0.587f) + (gc.g(j) * 0.299f);
    }
}
