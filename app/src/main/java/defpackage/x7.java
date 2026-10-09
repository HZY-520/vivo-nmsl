package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import java.io.Serializable;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class x7 {
    public final Object a;
    public Serializable b;
    public final Serializable c;
    public Object d;
    public Object e;

    public x7(Layout layout) {
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int H = ln0.H(((Layout) this.a).getText(), '\n', i, 4);
            i = H < 0 ? ((Layout) this.a).getText().length() : H + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) this.a).getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[((ArrayList) this.b).size()];
        ((ArrayList) this.b).size();
    }

    public ka a(w7 w7Var, eq eqVar) {
        int i;
        int i2;
        int i3;
        te0 te0Var = new te0();
        te0Var.e = -1;
        synchronized (this.a) {
            Throwable th = (Throwable) this.b;
            if (th != null) {
                w7Var.b(th);
                return b2.t;
            }
            q7 q7Var = (q7) this.c;
            do {
                i = q7Var.get();
                i2 = i + 1;
            } while (!q7Var.compareAndSet(i, i2));
            int i4 = 0;
            boolean z = (134217727 & i2) == 1;
            te0Var.e = (i2 >>> 27) & 15;
            ((h40) this.d).a(w7Var);
            if (z) {
                try {
                    eqVar.b();
                } catch (Throwable th2) {
                    synchronized (this.a) {
                        try {
                            if (((Throwable) this.b) == null) {
                                this.b = th2;
                                h40 h40Var = (h40) this.d;
                                Object[] objArr = h40Var.a;
                                int i5 = h40Var.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((w7) objArr[i6]).b(th2);
                                }
                                ((h40) this.d).d();
                                q7 q7Var2 = (q7) this.c;
                                do {
                                    i3 = q7Var2.get();
                                } while (!q7Var2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new p2(new v7(w7Var, this, te0Var, i4));
        }
    }

    public void b(pq pqVar) {
        int i;
        synchronized (this.a) {
            try {
                h40 h40Var = (h40) this.d;
                this.d = (h40) this.e;
                this.e = h40Var;
                q7 q7Var = (q7) this.c;
                do {
                    i = q7Var.get();
                } while (!q7Var.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = h40Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    pqVar.invoke(h40Var.g(i3));
                }
                h40Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float c(int i, boolean z) {
        Layout layout = (Layout) this.a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float d(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        Bidi bidi;
        boolean z4;
        int i6;
        int i7;
        ArrayList arrayList = (ArrayList) this.b;
        Layout layout = (Layout) this.a;
        if (!z2) {
            return c(i, z);
        }
        int u = dx0.u(layout, i, z2);
        int lineStart = layout.getLineStart(u);
        int lineEnd = layout.getLineEnd(u);
        if (i != lineStart && i != lineEnd) {
            return c(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return c(i, z);
        }
        Integer valueOf = Integer.valueOf(i);
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        if (size < 0) {
            z6.l(j2.h("fromIndex (0) is greater than toIndex (", size, ")."));
            return 0.0f;
        }
        if (size > size2) {
            z6.g("toIndex (", size, ") is greater than size (", size2, ").");
            return 0.0f;
        }
        int i8 = size - 1;
        int i9 = 0;
        while (true) {
            if (i9 > i8) {
                i2 = -(i9 + 1);
                break;
            }
            i2 = (i9 + i8) >>> 1;
            int m = q3.m((Comparable) arrayList.get(i2), valueOf);
            if (m >= 0) {
                if (m <= 0) {
                    break;
                }
                i8 = i2 - 1;
            } else {
                i9 = i2 + 1;
            }
        }
        int i10 = i2 < 0 ? -(i2 + 1) : i2 + 1;
        if (z2 && i10 > 0) {
            int i11 = i10 - 1;
            if (i == ((Number) arrayList.get(i11)).intValue()) {
                i10 = i11;
            }
        }
        boolean z5 = layout.getParagraphDirection(layout.getLineForOffset(i10 == 0 ? 0 : ((Number) arrayList.get(i10 + (-1))).intValue())) == -1;
        int e = e(lineEnd, lineStart);
        int intValue = i10 == 0 ? 0 : ((Number) arrayList.get(i10 - 1)).intValue();
        int i12 = lineStart - intValue;
        int i13 = e - intValue;
        ArrayList arrayList2 = (ArrayList) this.c;
        boolean[] zArr = (boolean[]) this.d;
        if (zArr[i10]) {
            bidi = (Bidi) arrayList2.get(i10);
            i4 = u;
            i3 = e;
            i5 = -1;
        } else {
            int intValue2 = i10 == 0 ? 0 : ((Number) arrayList.get(i10 - 1)).intValue();
            int intValue3 = ((Number) arrayList.get(i10)).intValue();
            int i14 = intValue3 - intValue2;
            char[] cArr = (char[]) this.e;
            i3 = e;
            if (cArr == null || cArr.length < i14) {
                cArr = new char[i14];
            }
            i4 = u;
            TextUtils.getChars(layout.getText(), intValue2, intValue3, cArr, 0);
            if (Bidi.requiresBidi(cArr, 0, i14)) {
                i5 = -1;
                Bidi bidi2 = new Bidi(cArr, 0, null, 0, i14, layout.getParagraphDirection(layout.getLineForOffset(i10 == 0 ? 0 : ((Number) arrayList.get(i10 + (-1))).intValue())) == -1 ? 1 : 0);
                z3 = true;
                if (bidi2.getRunCount() != 1) {
                    bidi = bidi2;
                    arrayList2.set(i10, bidi);
                    zArr[i10] = z3;
                    if (bidi != null) {
                        char[] cArr2 = (char[]) this.e;
                        cArr = cArr == cArr2 ? null : cArr2;
                    }
                    this.e = cArr;
                }
            } else {
                i5 = -1;
                z3 = true;
            }
            bidi = null;
            arrayList2.set(i10, bidi);
            zArr[i10] = z3;
            if (bidi != null) {
            }
            this.e = cArr;
        }
        Bidi createLineBidi = bidi != null ? bidi.createLineBidi(i12, i13) : null;
        if (createLineBidi == null) {
            z4 = true;
        } else {
            if (createLineBidi.getRunCount() != 1) {
                int runCount = createLineBidi.getRunCount();
                yx[] yxVarArr = new yx[runCount];
                for (int i15 = 0; i15 < runCount; i15++) {
                    yxVarArr[i15] = new yx(createLineBidi.getRunLevel(i15) % 2 == 1, createLineBidi.getRunStart(i15) + lineStart, createLineBidi.getRunLimit(i15) + lineStart);
                }
                int runCount2 = createLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i16 = 0; i16 < runCount2; i16++) {
                    bArr[i16] = (byte) createLineBidi.getRunLevel(i16);
                }
                boolean z6 = false;
                Bidi.reorderVisually(bArr, 0, yxVarArr, 0, runCount);
                if (i != lineStart) {
                    int i17 = i4;
                    int e2 = i > i3 ? e(i, lineStart) : i;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= runCount) {
                            i6 = i5;
                            break;
                        }
                        if (yxVarArr[i18].b == e2) {
                            i6 = i18;
                            break;
                        }
                        i18++;
                    }
                    yx yxVar = yxVarArr[i6];
                    if (z || z5 == yxVar.c) {
                        z6 = z5;
                    } else if (!z5) {
                        z6 = true;
                    }
                    return (i6 == 0 && z6) ? layout.getLineLeft(i17) : (i6 != runCount + (-1) || z6) ? z6 ? layout.getPrimaryHorizontal(yxVarArr[i6 - 1].b) : layout.getPrimaryHorizontal(yxVarArr[i6 + 1].b) : layout.getLineRight(i17);
                }
                int i19 = 0;
                while (true) {
                    if (i19 >= runCount) {
                        i7 = i5;
                        break;
                    }
                    if (yxVarArr[i19].a == i) {
                        i7 = i19;
                        break;
                    }
                    i19++;
                }
                yx yxVar2 = yxVarArr[i7];
                if (!z && z5 != yxVar2.c) {
                    z6 = z5;
                } else if (!z5) {
                    z6 = true;
                }
                if (i7 == 0 && z6) {
                    return layout.getLineLeft(i4);
                }
                return (i7 != runCount + (-1) || z6) ? z6 ? layout.getPrimaryHorizontal(yxVarArr[i7 - 1].a) : layout.getPrimaryHorizontal(yxVarArr[i7 + 1].a) : layout.getLineRight(i4);
            }
            z4 = true;
        }
        int i20 = i4;
        boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
        if (z || z5 == isRtlCharAt) {
            z5 = !z5 ? z4 : false;
        }
        return i == lineStart ? z5 : !z5 ? z4 : false ? layout.getLineLeft(i20) : layout.getLineRight(i20);
    }

    public int e(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.a).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((lw.m(charAt, 8192) < 0 || lw.m(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void f(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.a).put(str, obj);
        cn0 cn0Var = (cn0) ((LinkedHashMap) this.c).get(str);
        if (cn0Var != null) {
            cn0Var.h(obj);
        }
        cn0 cn0Var2 = (cn0) ((LinkedHashMap) this.d).get(str);
        if (cn0Var2 != null) {
            cn0Var2.h(obj);
        }
    }

    public x7() {
        this.a = new Object();
        this.c = new q7(0);
        this.d = new h40();
        this.e = new h40();
    }

    public x7(Map map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new od(2, this);
    }
}
