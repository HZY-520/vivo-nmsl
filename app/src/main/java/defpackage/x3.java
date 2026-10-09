package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.util.LongSparseArray;
import android.view.DisplayCutout;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class x3 {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = r4.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(z3 z3Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        wj0 wj0Var;
        uj0 uj0Var;
        pq pqVar;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse k = n3.k(longSparseArray.get(keyAt));
            if (k != null && value != null && text != null && (wj0Var = (wj0) z3Var.g().b((int) keyAt)) != null && (uj0Var = wj0Var.a) != null) {
                Object g = uj0Var.d.e.g(pj0.k);
                if (g == null) {
                    g = null;
                }
                p0 p0Var = (p0) g;
                if (p0Var != null && (pqVar = (pq) p0Var.b) != null) {
                }
            }
        }
    }

    public static Path c(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float d(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static void e(z3 z3Var, long[] jArr, Consumer consumer) {
        uj0 uj0Var;
        for (long j : jArr) {
            wj0 wj0Var = (wj0) z3Var.g().b((int) j);
            if (wj0Var != null && (uj0Var = wj0Var.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(z3Var.e.getAutofillId(), uj0Var.f);
                Object g = uj0Var.d.e.g(yj0.A);
                if (g == null) {
                    g = null;
                }
                List list = (List) g;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new p6(c00.a(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static float f(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
