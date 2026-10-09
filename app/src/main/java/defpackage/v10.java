package defpackage;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class v10 {
    public static final float a = 24.0f;

    public static final e50 a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new e50(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final ng0 b(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new ng0(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final long c() {
        return Thread.currentThread().getId();
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static final uh0 e(View view) {
        while (view != null) {
            Object tag = view.getTag(2131034219);
            uh0 uh0Var = tag instanceof uh0 ? (uh0) tag : null;
            if (uh0Var != null) {
                return uh0Var;
            }
            Object l = t30.l(view);
            view = l instanceof View ? (View) l : null;
        }
        return null;
    }

    public static final cd0 g(View view) {
        cd0 cd0Var = (cd0) view.getTag(2131034189);
        if (cd0Var != null) {
            return cd0Var;
        }
        cd0 cd0Var2 = new cd0();
        view.setTag(2131034189, cd0Var2);
        return cd0Var2;
    }

    public static final np0 h(qj0 qj0Var) {
        pq pqVar;
        ArrayList arrayList = new ArrayList();
        Object g = qj0Var.e.g(pj0.a);
        if (g == null) {
            g = null;
        }
        p0 p0Var = (p0) g;
        if (p0Var == null || (pqVar = (pq) p0Var.b) == null || !((Boolean) pqVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (np0) arrayList.get(0);
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final boolean j(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final boolean k(ng0 ng0Var) {
        long j = ng0Var.e;
        return (j >>> 32) == (4294967295L & j) && j == ng0Var.f && j == ng0Var.g && j == ng0Var.h;
    }

    public static final void l(t5 t5Var, int i) {
        Object obj;
        Iterator<T> it = t5Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((iy) ((Map.Entry) obj).getKey()).f == i) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || entry.getValue() == null) {
            return;
        }
        z6.c();
    }

    public static final long m(String str, long j, long j2, long j3) {
        String str2;
        boolean z;
        int i = qo0.a;
        Long l = null;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        int i2 = 10;
        t10.e(10);
        int length = str2.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str2.charAt(0);
            long j4 = -9223372036854775807L;
            if (lw.m(charAt, 48) < 0) {
                z = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z = false;
                        i3 = 1;
                    } else if (charAt == '-') {
                        j4 = Long.MIN_VALUE;
                        i3 = 1;
                    }
                }
            } else {
                z = false;
            }
            long j5 = 0;
            long j6 = -256204778801521550L;
            while (true) {
                if (i3 < length) {
                    int digit = Character.digit((int) str2.charAt(i3), i2);
                    if (digit < 0) {
                        break;
                    }
                    if (j5 < j6) {
                        if (j6 != -256204778801521550L) {
                            break;
                        }
                        j6 = j4 / 10;
                        if (j5 < j6) {
                            break;
                        }
                    }
                    long j7 = j5 * 10;
                    int i4 = length;
                    long j8 = digit;
                    if (j7 < j4 + j8) {
                        break;
                    }
                    j5 = j7 - j8;
                    i3++;
                    length = i4;
                    i2 = 10;
                } else {
                    l = z ? Long.valueOf(j5) : Long.valueOf(-j5);
                }
            }
        }
        if (l == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = l.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static int n(int i, int i2, String str) {
        return (int) m(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final rv o(nv nvVar) {
        return new rv(nvVar.a, nvVar.b, nvVar.c, nvVar.d);
    }

    public static final String p(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final int q(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final void r(uj0 uj0Var, int i, li0 li0Var) {
        uj0 uj0Var2;
        t40 t40Var = new t40(new uj0[16]);
        List i2 = uj0Var.i(false, false);
        while (true) {
            t40Var.d(t40Var.g, i2);
            while (true) {
                int i3 = t40Var.g;
                if (i3 == 0) {
                    return;
                }
                uj0Var2 = (uj0) t40Var.j(i3 - 1);
                boolean B = nh.B(uj0Var2);
                qj0 qj0Var = uj0Var2.d;
                k40 k40Var = qj0Var.e;
                if (!B && !k40Var.c(yj0.j)) {
                    d60 d = uj0Var2.d();
                    if (d == null) {
                        throw j2.f("Expected semantics node to have a coordinator.");
                    }
                    bw B2 = lw.B(q3.e(d, true));
                    if (B2.a < B2.c && B2.b < B2.d) {
                        Object g = qj0Var.e.g(pj0.e);
                        if (g == null) {
                            g = null;
                        }
                        tq tqVar = (tq) g;
                        Object g2 = k40Var.g(yj0.w);
                        ki0 ki0Var = (ki0) (g2 != null ? g2 : null);
                        if (tqVar != null && ki0Var != null && ((Number) ki0Var.b.b()).floatValue() > 0.0f) {
                            int i4 = 1 + i;
                            li0Var.invoke(new ni0(uj0Var2, i4, B2, d));
                            r(uj0Var2, i4, li0Var);
                        }
                    }
                }
            }
            i2 = uj0Var2.i(false, false);
        }
    }

    public abstract oe0 f();
}
