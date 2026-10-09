package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class np0 {
    public final mp0 a;
    public final q5 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public np0(mp0 mp0Var, q5 q5Var, long j) {
        float lineBaseline;
        this.a = mp0Var;
        this.b = q5Var;
        this.c = j;
        ArrayList arrayList = (ArrayList) q5Var.e;
        float f = 0.0f;
        if (arrayList.isEmpty()) {
            lineBaseline = 0.0f;
        } else {
            lp0 lp0Var = ((m90) arrayList.get(0)).a.d;
            lineBaseline = lp0Var.g + ((lp0Var.f + (-1) != 0 || lp0Var.k == null) ? lp0Var.e.getLineBaseline(0) : lp0Var.f(0) - r1.ascent) + 0.0f;
        }
        this.d = lineBaseline;
        if (!arrayList.isEmpty()) {
            m90 m90Var = (m90) ac.e0(arrayList);
            lp0 lp0Var2 = m90Var.a.d;
            int i = lp0Var2.f - 1;
            f = lp0Var2.g + (lp0Var2.k != null ? lp0Var2.f(i) - r1.ascent : lp0Var2.e.getLineBaseline(i)) + 0.0f + m90Var.f;
        }
        this.e = f;
        this.f = (ArrayList) q5Var.d;
    }

    public final int a(int i) {
        q5 q5Var = this.b;
        ArrayList arrayList = (ArrayList) q5Var.e;
        m90 m90Var = (m90) arrayList.get(i >= ((p6) ((l20) q5Var.c).e).f.length() ? arrayList.size() - 1 : i < 0 ? 0 : t30.i(i, arrayList));
        return m90Var.a.d.e(m90Var.a(i)) + m90Var.d;
    }

    public final int b(float f) {
        int i;
        int i2;
        ArrayList arrayList = (ArrayList) this.b.e;
        int i3 = 0;
        if (f > 0.0f) {
            if (f < ((m90) ac.e0(arrayList)).g) {
                int size = arrayList.size() - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > size) {
                        i = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + size) >>> 1;
                    m90 m90Var = (m90) arrayList.get(i5);
                    char c = m90Var.f > f ? (char) 1 : m90Var.g <= f ? (char) 65535 : (char) 0;
                    if (c >= 0) {
                        if (c <= 0) {
                            i = i5;
                            break;
                        }
                        size = i5 - 1;
                    } else {
                        i4 = i5 + 1;
                    }
                }
            } else {
                i = arrayList.size() - 1;
            }
        } else {
            i = 0;
        }
        m90 m90Var2 = (m90) arrayList.get(i);
        int i6 = m90Var2.c;
        int i7 = m90Var2.d;
        if (i6 - m90Var2.b == 0) {
            return i7;
        }
        x4 x4Var = m90Var2.a;
        float f2 = f - m90Var2.f;
        lp0 lp0Var = x4Var.d;
        int i8 = (int) (f2 - 0.0f);
        int i9 = lp0Var.f;
        if (i9 > 0 && (i3 = lp0Var.e.getLineForVertical(i8 - lp0Var.g)) > i9 - 1) {
            i3 = i2;
        }
        return i3 + i7;
    }

    public final int c(int i) {
        q5 q5Var = this.b;
        q5Var.d(i);
        ArrayList arrayList = (ArrayList) q5Var.e;
        m90 m90Var = (m90) arrayList.get(t30.j(i, arrayList));
        x4 x4Var = m90Var.a;
        return x4Var.d.e.getLineStart(i - m90Var.d) + m90Var.b;
    }

    public final float d(int i) {
        q5 q5Var = this.b;
        q5Var.d(i);
        ArrayList arrayList = (ArrayList) q5Var.e;
        m90 m90Var = (m90) arrayList.get(t30.j(i, arrayList));
        x4 x4Var = m90Var.a;
        return x4Var.d.f(i - m90Var.d) + m90Var.f;
    }

    public final mf0 e(int i) {
        q5 q5Var = this.b;
        p6 p6Var = (p6) ((l20) q5Var.c).e;
        if (i < 0 || i > p6Var.f.length()) {
            dv.a("offset(" + i + ") is out of bounds [0, " + p6Var.f.length() + "]");
        }
        int length = ((p6) ((l20) q5Var.c).e).f.length();
        ArrayList arrayList = (ArrayList) q5Var.e;
        m90 m90Var = (m90) arrayList.get(i == length ? arrayList.size() - 1 : t30.i(i, arrayList));
        x4 x4Var = m90Var.a;
        int a = m90Var.a(i);
        lp0 lp0Var = x4Var.d;
        return lp0Var.e.getParagraphDirection(lp0Var.e(a)) == 1 ? mf0.e : mf0.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof np0) {
            np0 np0Var = (np0) obj;
            if (lw.i(this.a, np0Var.a) && this.b == np0Var.b && ew.a(this.c, np0Var.c) && this.d == np0Var.d && this.e == np0Var.e && this.f.equals(np0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + j2.a(this.e, j2.a(this.d, j2.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ew.b(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
