package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class m3 implements ViewTranslationCallback {
    public static final m3 a = new m3();

    public final boolean onClearTranslation(View view) {
        eq eqVar;
        view.getClass();
        z3 contentCaptureManager$ui = ((e3) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.i = v3.e;
        vv g = contentCaptureManager$ui.g();
        Object[] objArr = g.c;
        long[] jArr = g.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        k40 k40Var = ((wj0) objArr[(i << 3) + i3]).a.d.e;
                        Object g2 = k40Var.g(yj0.C);
                        if (g2 == null) {
                            g2 = null;
                        }
                        if (g2 != null) {
                            Object g3 = k40Var.g(pj0.m);
                            p0 p0Var = (p0) (g3 != null ? g3 : null);
                            if (p0Var != null && (eqVar = (eq) p0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        pq pqVar;
        view.getClass();
        z3 contentCaptureManager$ui = ((e3) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.i = v3.e;
        vv g = contentCaptureManager$ui.g();
        Object[] objArr = g.c;
        long[] jArr = g.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        k40 k40Var = ((wj0) objArr[(i << 3) + i3]).a.d.e;
                        Object g2 = k40Var.g(yj0.C);
                        if (g2 == null) {
                            g2 = null;
                        }
                        if (lw.i(g2, Boolean.TRUE)) {
                            Object g3 = k40Var.g(pj0.l);
                            p0 p0Var = (p0) (g3 != null ? g3 : null);
                            if (p0Var != null && (pqVar = (pq) p0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        pq pqVar;
        view.getClass();
        z3 contentCaptureManager$ui = ((e3) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.i = v3.f;
        vv g = contentCaptureManager$ui.g();
        Object[] objArr = g.c;
        long[] jArr = g.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        k40 k40Var = ((wj0) objArr[(i << 3) + i3]).a.d.e;
                        Object g2 = k40Var.g(yj0.C);
                        if (g2 == null) {
                            g2 = null;
                        }
                        if (lw.i(g2, Boolean.FALSE)) {
                            Object g3 = k40Var.g(pj0.l);
                            p0 p0Var = (p0) (g3 != null ? g3 : null);
                            if (p0Var != null && (pqVar = (pq) p0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
