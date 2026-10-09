package com.vivo.cnm.lico;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.vivo.cnm.lico.ui.theme.ThemeKt;
import defpackage.a40;
import defpackage.bo0;
import defpackage.f10;
import defpackage.fs0;
import defpackage.gr;
import defpackage.kc;
import defpackage.kw;
import defpackage.mc;
import defpackage.mo0;
import defpackage.rl;
import defpackage.se;
import defpackage.sl;
import defpackage.t10;
import defpackage.t90;
import defpackage.tl;
import defpackage.ul;
import defpackage.vl;
import defpackage.wl;
import defpackage.xd;
import defpackage.xl;
import defpackage.yl;
import defpackage.zh0;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class MainActivity extends xd {
    public static final int $stable = 8;
    private final a40 resumeTick = new t90(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 onCreate$lambda$2(MainActivity mainActivity, se seVar, int i) {
        int i2 = 0;
        gr grVar = (gr) seVar;
        if (grVar.I(i & 1, (i & 3) != 2)) {
            ThemeKt.FucWBTheme(false, false, kw.J(-1246269248, new f10(mainActivity, i2), grVar), grVar, 384, 3);
        } else {
            grVar.L();
        }
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 onCreate$lambda$2$lambda$1(MainActivity mainActivity, se seVar, int i) {
        int i2 = 2;
        gr grVar = (gr) seVar;
        if (grVar.I(i & 1, (i & 3) != 2)) {
            bo0.a(t10.m, null, ((kc) grVar.i(mc.a)).n, 0L, 0.0f, kw.J(-818395557, new f10(mainActivity, i2), grVar), grVar, 12582918, 122);
        } else {
            grVar.L();
        }
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 onCreate$lambda$2$lambda$1$lambda$0(MainActivity mainActivity, se seVar, int i) {
        gr grVar = (gr) seVar;
        if (grVar.I(i & 1, (i & 3) != 2)) {
            MainActivityKt.HomeRoute(((t90) mainActivity.resumeTick).g(), grVar, 0);
        } else {
            grVar.L();
        }
        return fs0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        r1.run();
        r8 = getWindow();
        r8.getClass();
        r2.a(r8);
        r9 = new defpackage.be(368691367, true, new defpackage.f10(r8, r0));
        r8 = defpackage.yd.a;
        r8 = ((android.view.ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c9, code lost:
    
        if ((r8 instanceof defpackage.me) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cb, code lost:
    
        r8 = (defpackage.me) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
    
        if (r8 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d1, code lost:
    
        r8.setParentCompositionContext(null);
        r8.setContent(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        r8 = new defpackage.me(r8);
        r8.setParentCompositionContext(null);
        r8.setContent(r9);
        r9 = getWindow().getDecorView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
    
        if (defpackage.u10.p(r9) != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f1, code lost:
    
        r9.setTag(2131034216, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fb, code lost:
    
        if (defpackage.j20.d(r9) != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fd, code lost:
    
        r9.setTag(2131034220, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0107, code lost:
    
        if (defpackage.v10.e(r9) != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0109, code lost:
    
        r9.setTag(2131034219, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010f, code lost:
    
        setContentView(r8, defpackage.yd.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0114, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        r8 = null;
     */
    @Override // defpackage.xd, defpackage.wd, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 27;
        mo0 mo0Var = new mo0(0, 0, new zh0(i));
        mo0 mo0Var2 = new mo0(tl.a, tl.b, new zh0(i));
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        vl vlVar = tl.c;
        if (vlVar == null) {
            int i2 = Build.VERSION.SDK_INT;
            vlVar = i2 >= 35 ? new yl() : i2 >= 30 ? new xl() : i2 >= 29 ? new wl() : new vl();
            tl.c = vlVar;
        }
        vl vlVar2 = vlVar;
        rl rlVar = new rl(vlVar2, mo0Var, mo0Var2, this, decorView);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= viewGroup.getChildCount()) {
                sl slVar = new sl(rlVar, viewGroup.getContext());
                slVar.setTag(vlVar2);
                slVar.setVisibility(8);
                slVar.setWillNotDraw(true);
                viewGroup.addView(slVar);
                break;
            }
            int i5 = i3 + 1;
            View childAt = viewGroup.getChildAt(i3);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof ul) {
                break;
            } else {
                i3 = i5;
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        t90 t90Var = (t90) this.resumeTick;
        t90Var.h(t90Var.g() + 1);
    }
}
