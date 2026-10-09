package defpackage;

import java.text.BreakIterator;
import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class v0 extends u0 {
    public static v0 e;
    public static v0 f;
    public static v0 g;
    public static final mf0 h = mf0.f;
    public static final mf0 i = mf0.e;
    public final /* synthetic */ int c;
    public Object d;

    public /* synthetic */ v0(int i2) {
        this.c = i2;
    }

    @Override // defpackage.u0
    public final int[] a(int i2) {
        int i3;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        lw.E("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            lw.E("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i2);
                        if (following == -1) {
                            return null;
                        }
                        return b(i2, following);
                    }
                    if (breakIterator2 == null) {
                        lw.E("impl");
                        throw null;
                    }
                    i2 = breakIterator2.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!h(i2) && (!h(i2) || (i2 != 0 && h(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        lw.E("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    lw.E("impl");
                    throw null;
                }
                int following2 = breakIterator4.following(i2);
                if (following2 == -1 || !g(following2)) {
                    return null;
                }
                return b(i2, following2);
            default:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                np0 np0Var = (np0) this.d;
                mf0 mf0Var = h;
                if (i2 < 0) {
                    if (np0Var == null) {
                        lw.E("layoutResult");
                        throw null;
                    }
                    i3 = np0Var.a(0);
                } else {
                    if (np0Var == null) {
                        lw.E("layoutResult");
                        throw null;
                    }
                    int a = np0Var.a(i2);
                    i3 = e(a, mf0Var) == i2 ? a : a + 1;
                }
                np0 np0Var2 = (np0) this.d;
                if (np0Var2 == null) {
                    lw.E("layoutResult");
                    throw null;
                }
                if (i3 >= np0Var2.b.b) {
                    return null;
                }
                return b(e(i3, mf0Var), e(i3, i) + 1);
        }
    }

    @Override // defpackage.u0
    public final int[] d(int i2) {
        int i3;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        lw.E("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            lw.E("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i2);
                        if (preceding == -1) {
                            return null;
                        }
                        return b(preceding, i2);
                    }
                    if (breakIterator2 == null) {
                        lw.E("impl");
                        throw null;
                    }
                    i2 = breakIterator2.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !h(i2 - 1) && !g(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        lw.E("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    lw.E("impl");
                    throw null;
                }
                int preceding2 = breakIterator4.preceding(i2);
                if (preceding2 == -1 || !h(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !h(preceding2 - 1)) {
                    return b(preceding2, i2);
                }
                return null;
            default:
                if (c().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = c().length();
                np0 np0Var = (np0) this.d;
                mf0 mf0Var = i;
                if (i2 > length3) {
                    if (np0Var == null) {
                        lw.E("layoutResult");
                        throw null;
                    }
                    i3 = np0Var.a(c().length());
                } else {
                    if (np0Var == null) {
                        lw.E("layoutResult");
                        throw null;
                    }
                    int a = np0Var.a(i2);
                    i3 = e(a, mf0Var) + 1 == i2 ? a : a - 1;
                }
                if (i3 < 0) {
                    return null;
                }
                return b(e(i3, h), e(i3, mf0Var) + 1);
        }
    }

    public int e(int i2, mf0 mf0Var) {
        np0 np0Var = (np0) this.d;
        if (np0Var == null) {
            lw.E("layoutResult");
            throw null;
        }
        int c = np0Var.c(i2);
        np0 np0Var2 = (np0) this.d;
        if (np0Var2 == null) {
            lw.E("layoutResult");
            throw null;
        }
        mf0 e2 = np0Var2.e(c);
        np0 np0Var3 = (np0) this.d;
        if (mf0Var != e2) {
            if (np0Var3 != null) {
                return np0Var3.c(i2);
            }
            lw.E("layoutResult");
            throw null;
        }
        if (np0Var3 == null) {
            lw.E("layoutResult");
            throw null;
        }
        q5 q5Var = np0Var3.b;
        q5Var.d(i2);
        ArrayList arrayList = (ArrayList) q5Var.e;
        x4 x4Var = ((m90) arrayList.get(t30.j(i2, arrayList))).a;
        return (x4Var.d.d(i2 - r4.d) + r4.b) - 1;
    }

    public void f(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    lw.E("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    lw.E("impl");
                    throw null;
                }
        }
    }

    public boolean g(int i2) {
        if (i2 <= 0 || !h(i2 - 1)) {
            return false;
        }
        return i2 == c().length() || !h(i2);
    }

    public boolean h(int i2) {
        if (i2 < 0 || i2 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i2));
    }
}
