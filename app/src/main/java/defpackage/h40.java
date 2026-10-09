package defpackage;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class h40 {
    public Object[] a;
    public int b;

    public h40(int i) {
        this.a = i == 0 ? o60.a : new Object[i];
    }

    public final void a(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            n(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void b(h40 h40Var) {
        h40Var.getClass();
        if (h40Var.i()) {
            return;
        }
        int i = this.b + h40Var.b;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            n(i, objArr);
        }
        o7.R(h40Var.a, this.a, this.b, 0, h40Var.b);
        this.b += h40Var.b;
    }

    public final void c(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            n(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void d() {
        o7.V(this.a, 0, this.b);
        this.b = 0;
    }

    public final boolean e(Object obj) {
        return h(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h40) {
            h40 h40Var = (h40) obj;
            int i = h40Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = h40Var.a;
                aw C = t30.C(0, i2);
                int i3 = C.e;
                int i4 = C.f;
                if (i3 > i4) {
                    return true;
                }
                while (lw.i(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object f() {
        if (i()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return this.a[0];
    }

    public final Object g(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        p(i);
        throw null;
    }

    public final int h(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final boolean i() {
        return this.b == 0;
    }

    public final boolean j() {
        return this.b != 0;
    }

    public final boolean k(Object obj) {
        int h = h(obj);
        if (h < 0) {
            return false;
        }
        l(h);
        return true;
    }

    public final Object l(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            p(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            o7.R(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void m(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.b);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                o7.R(objArr, objArr, i, i2, i3);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            o7.V(this.a, i5, i4);
            this.b = i5;
        }
    }

    public final void n(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        o7.R(objArr, objArr2, 0, 0, length);
        this.a = objArr2;
    }

    public final Object o(int i, Object obj) {
        if (i < 0 || i >= this.b) {
            p(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void p(int i) {
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ h40() {
        this(16);
    }
}
