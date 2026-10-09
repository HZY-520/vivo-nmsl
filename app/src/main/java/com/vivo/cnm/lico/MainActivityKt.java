package com.vivo.cnm.lico;

import android.content.Context;
import com.vivo.cnm.lico.MainActivityKt;
import com.vivo.cnm.lico.ui.HomeScreenKt;
import defpackage.de0;
import defpackage.eq;
import defpackage.fs0;
import defpackage.gr;
import defpackage.ht;
import defpackage.kw;
import defpackage.p30;
import defpackage.p40;
import defpackage.re;
import defpackage.s3;
import defpackage.se;
import defpackage.tq;
import defpackage.v10;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class MainActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void HomeRoute(final int i, se seVar, final int i2) {
        int i3;
        gr grVar = (gr) seVar;
        grVar.Q(-1250652948);
        if ((i2 & 6) == 0) {
            i3 = (grVar.c(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 1;
        if (grVar.I(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) grVar.i(s3.b);
            Object G = grVar.G();
            Object obj = re.a;
            if (G == obj) {
                G = p30.m(new ModuleStatus(false, 0, 3, null));
                grVar.Y(G);
            }
            p40 p40Var = (p40) G;
            Integer valueOf = Integer.valueOf(i);
            boolean g = grVar.g(context);
            Object G2 = grVar.G();
            if (g || G2 == obj) {
                G2 = new MainActivityKt$HomeRoute$1$1(context, p40Var, null);
                grVar.Y(G2);
            }
            kw.d(grVar, (tq) G2, valueOf);
            ModuleStatus HomeRoute$lambda$1 = HomeRoute$lambda$1(p40Var);
            boolean g2 = grVar.g(context);
            Object G3 = grVar.G();
            if (g2 || G3 == obj) {
                G3 = new ht(context, i4);
                grVar.Y(G3);
            }
            HomeScreenKt.HomeScreen(HomeRoute$lambda$1, (eq) G3, null, grVar, 0, 4);
        } else {
            grVar.L();
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new tq() { // from class: g10
                @Override // defpackage.tq
                public final Object invoke(Object obj2, Object obj3) {
                    fs0 HomeRoute$lambda$6;
                    int intValue = ((Integer) obj3).intValue();
                    HomeRoute$lambda$6 = MainActivityKt.HomeRoute$lambda$6(i, i2, (se) obj2, intValue);
                    return HomeRoute$lambda$6;
                }
            };
        }
    }

    private static final ModuleStatus HomeRoute$lambda$1(p40 p40Var) {
        return (ModuleStatus) p40Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 HomeRoute$lambda$5$lambda$4(Context context) {
        ShortcutHelper.INSTANCE.create(context);
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 HomeRoute$lambda$6(int i, int i2, se seVar, int i3) {
        HomeRoute(i, seVar, v10.q(i2 | 1));
        return fs0.a;
    }
}
