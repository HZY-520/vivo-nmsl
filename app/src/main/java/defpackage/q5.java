package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class q5 {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public int a(long j) {
        int i = this.a + 1;
        long[] jArr = (long[]) this.c;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            o7.Q(jArr, jArr2, 0, 0, jArr.length);
            o7.S((int[]) this.d, iArr, 0, 0, 14);
            this.c = jArr2;
            this.d = iArr;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        int[] iArr2 = (int[]) this.e;
        int length2 = iArr2.length;
        if (this.b >= length2) {
            int i4 = length2 * 2;
            iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            o7.S((int[]) this.e, iArr2, 0, 0, 14);
            this.e = iArr2;
        }
        int[] iArr3 = iArr2;
        int i7 = this.b;
        this.b = iArr2[i7];
        long[] jArr3 = (long[]) this.c;
        jArr3[i3] = j;
        ((int[]) this.d)[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (lw.n(jArr3[i8], j) <= 0) {
                break;
            }
            e(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r7 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jd b(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        jd jdVar;
        Object obj = null;
        int i2 = 0;
        if (v10.i((XmlPullParser) this.c, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 < 28 || i3 > 31) {
                try {
                    jdVar = jd.d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception e) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    jdVar = null;
                }
            } else {
                jdVar = new jd(typedValue.data, obj);
            }
            f(typedArray.getChangingConfigurations());
            return jdVar;
        }
        jdVar = new jd(i2, obj);
        f(typedArray.getChangingConfigurations());
        return jdVar;
    }

    public float c(TypedArray typedArray, String str, int i, float f) {
        if (v10.i((XmlPullParser) this.c, str)) {
            f = typedArray.getFloat(i, f);
        }
        f(typedArray.getChangingConfigurations());
        return f;
    }

    public void d(int i) {
        int i2 = this.b;
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        dv.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
    }

    public void e(int i, int i2) {
        long[] jArr = (long[]) this.c;
        int[] iArr = (int[]) this.d;
        int[] iArr2 = (int[]) this.e;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public void f(int i) {
        this.a = i | this.a;
    }
}
