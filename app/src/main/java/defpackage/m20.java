package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.os.ParcelFileDescriptor;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class m20 {
    public static final long a = Long.MIN_VALUE;
    public static wt b;

    public static final long a(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final int b(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final Rect e(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final float f(dc0 dc0Var, boolean z, mt[] mtVarArr, float f) {
        float f2 = Float.NaN;
        for (mt mtVar : mtVarArr) {
            float a2 = dc0Var.a(mtVar);
            if (!Float.isNaN(f2)) {
                int i = z != (a2 > f2) ? i + 1 : 0;
            }
            f2 = a2;
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static MappedByteBuffer g(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(t20 t20Var, eq eqVar) {
        r60 r60Var = t20Var.k;
        if (r60Var == null) {
            r60Var = new r60((q60) t20Var);
            t20Var.k = r60Var;
        }
        a90 snapshotObserver = nh.b0(t20Var).getSnapshotObserver();
        snapshotObserver.a.b(r60Var, r60.f, eqVar);
    }

    public static final float i(long j, float f, si siVar) {
        float c;
        long b2 = bq0.b(j);
        if (cq0.a(b2, 4294967296L)) {
            if (siVar.g() <= 1.05d) {
                return siVar.N(j);
            }
            c = bq0.c(j) / bq0.c(siVar.S(f));
        } else {
            if (!cq0.a(b2, 8589934592L)) {
                return Float.NaN;
            }
            c = bq0.c(j);
        }
        return c * f;
    }

    public static final void j(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(lw.F(j)), i, i2, 33);
        }
    }

    public static final void k(Spannable spannable, long j, si siVar, int i, int i2) {
        long b2 = bq0.b(j);
        if (cq0.a(b2, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(t10.B(siVar.N(j)), false), i, i2, 33);
        } else if (cq0.a(b2, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(bq0.c(j)), i, i2, 33);
        }
    }

    public static final void l(Spannable spannable, h00 h00Var, int i, int i2) {
        if (h00Var != null) {
            ArrayList arrayList = new ArrayList(bc.V(h00Var));
            Iterator it = h00Var.e.iterator();
            while (it.hasNext()) {
                arrayList.add(((g00) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static Set m(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return ym.e;
        }
        if (length == 1) {
            Set singleton = Collections.singleton(objArr[0]);
            singleton.getClass();
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(lr0.D(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static final Rect n(bw bwVar) {
        return new Rect(bwVar.a, bwVar.b, bwVar.c, bwVar.d);
    }

    public abstract void c();
}
