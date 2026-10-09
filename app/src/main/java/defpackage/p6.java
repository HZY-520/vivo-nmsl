package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class p6 implements CharSequence {
    public final List e;
    public final String f;
    public final ArrayList g;
    public final ArrayList h;

    static {
        p2 p2Var = di0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        r8.a(r1.c);
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p6(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.e = list;
        this.f = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                o6 o6Var = (o6) list.get(i);
                Object obj = o6Var.a;
                if (obj instanceof om0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(o6Var);
                } else if (obj instanceof q90) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(o6Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.g = arrayList;
        this.h = arrayList2;
        List i0 = arrayList2 != null ? ac.i0(arrayList2, new zo(5)) : null;
        if (i0 == null || i0.isEmpty()) {
            return;
        }
        int i2 = ((o6) ac.Z(i0)).c;
        int i3 = uv.a;
        int i4 = 1;
        x30 x30Var = new x30(1);
        x30Var.a(i2);
        int size2 = i0.size();
        while (i4 < size2) {
            o6 o6Var2 = (o6) i0.get(i4);
            while (true) {
                int i5 = x30Var.b;
                if (i5 == 0) {
                    break;
                }
                if (i5 == 0) {
                    throw new NoSuchElementException("IntList is empty.");
                }
                int i6 = x30Var.a[i5 - 1];
                if (o6Var2.b >= i6) {
                    x30Var.c(i5 - 1);
                } else {
                    int i7 = o6Var2.c;
                    if (i7 > i6) {
                        dv.a("Paragraph overlap not allowed, end " + i7 + " should be less than or equal to " + i6);
                    }
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        return lw.i(this.f, p6Var.f) && lw.i(this.e, p6Var.e);
    }

    public final int hashCode() {
        int hashCode = this.f.hashCode() * 31;
        List list = this.e;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i > i2) {
            dv.a("start (" + i + ") should be less or equal to end (" + i2 + ")");
        }
        String str = this.f;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i2);
        int i3 = q6.a;
        if (i > i2) {
            dv.a("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        List list = this.e;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                o6 o6Var = (o6) list.get(i4);
                int i5 = o6Var.b;
                int i6 = o6Var.c;
                if (q6.a(i, i2, i5, i6)) {
                    arrayList2.add(new o6(o6Var.a, Math.max(i, o6Var.b) - i, Math.min(i2, i6) - i, o6Var.d));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new p6(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f;
    }

    public /* synthetic */ p6(String str) {
        this(str, um.e);
    }

    public p6(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
