package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class fl0 {
    public int[] e = lw.j;
    public Object[] f = lw.l;
    public int g;

    public fl0(int i) {
    }

    public final int a(Object obj) {
        int i = this.g * 2;
        Object[] objArr = this.f;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i, Object obj) {
        int i2 = this.g;
        if (i2 == 0) {
            return -1;
        }
        int j = lw.j(this.e, i2, i);
        if (j < 0 || lw.i(obj, this.f[j << 1])) {
            return j;
        }
        int i3 = j + 1;
        while (i3 < i2 && this.e[i3] == i) {
            if (lw.i(obj, this.f[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = j - 1; i4 >= 0 && this.e[i4] == i; i4--) {
            if (lw.i(obj, this.f[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        int i = this.g;
        if (i > 0) {
            this.e = lw.j;
            this.f = lw.l;
            i = 0;
            this.g = 0;
        }
        if (i > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i = this.g;
        if (i == 0) {
            return -1;
        }
        int j = lw.j(this.e, i, 0);
        if (j < 0 || this.f[j << 1] == null) {
            return j;
        }
        int i2 = j + 1;
        while (i2 < i && this.e[i2] == 0) {
            if (this.f[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = j - 1; i3 >= 0 && this.e[i3] == 0; i3--) {
            if (this.f[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object e(int i) {
        boolean z = false;
        if (i >= 0 && i < this.g) {
            z = true;
        }
        if (z) {
            return this.f[i << 1];
        }
        z6.l(j2.g("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof fl0) {
                int i = this.g;
                if (i != ((fl0) obj).g) {
                    return false;
                }
                fl0 fl0Var = (fl0) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object e = e(i2);
                    Object h = h(i2);
                    Object obj2 = fl0Var.get(e);
                    if (h == null) {
                        if (obj2 != null || !fl0Var.containsKey(e)) {
                            return false;
                        }
                    } else if (!h.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.g != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.g;
            for (int i4 = 0; i4 < i3; i4++) {
                Object e2 = e(i4);
                Object h2 = h(i4);
                Object obj3 = ((Map) obj).get(e2);
                if (h2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(e2)) {
                        return false;
                    }
                } else if (!h2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.g)) {
            z6.l(j2.g("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        Object[] objArr = this.f;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.e;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                o7.P(iArr, iArr, i, i5, i2);
                Object[] objArr2 = this.f;
                o7.R(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.f;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.e = Arrays.copyOf(iArr, i7);
            this.f = Arrays.copyOf(this.f, i7 << 1);
            if (i2 != this.g) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                o7.P(iArr, this.e, 0, 0, i);
                o7.R(objArr, this.f, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                o7.P(iArr, this.e, i, i8, i2);
                o7.R(objArr, this.f, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.g) {
            throw new ConcurrentModificationException();
        }
        this.g = i4;
        return obj;
    }

    public final Object g(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.g) {
            z = true;
        }
        if (!z) {
            z6.l(j2.g("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            return this.f[(c << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c = c(obj);
        return c >= 0 ? this.f[(c << 1) + 1] : obj2;
    }

    public final Object h(int i) {
        boolean z = false;
        if (i >= 0 && i < this.g) {
            z = true;
        }
        if (z) {
            return this.f[(i << 1) + 1];
        }
        z6.l(j2.g("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final int hashCode() {
        int[] iArr = this.e;
        Object[] objArr = this.f;
        int i = this.g;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        return this.g <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.g;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int b = obj != null ? b(hashCode, obj) : d();
        if (b >= 0) {
            int i2 = (b << 1) + 1;
            Object[] objArr = this.f;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~b;
        int[] iArr = this.e;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.e = Arrays.copyOf(iArr, i4);
            this.f = Arrays.copyOf(this.f, i4 << 1);
            if (i != this.g) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.e;
            int i5 = i3 + 1;
            o7.P(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.f;
            o7.R(objArr2, objArr2, i5 << 1, i3 << 1, this.g << 1);
        }
        int i6 = this.g;
        if (i == i6) {
            int[] iArr3 = this.e;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.f;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.g = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int c = c(obj);
        if (c < 0 || !lw.i(obj2, h(c))) {
            return false;
        }
        f(c);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c = c(obj);
        if (c < 0 || !lw.i(obj2, h(c))) {
            return false;
        }
        g(c, obj3);
        return true;
    }

    public final int size() {
        return this.g;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.g * 28);
        sb.append('{');
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object e = e(i2);
            if (e != sb) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object h = h(i2);
            if (h != sb) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            return f(c);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c = c(obj);
        if (c >= 0) {
            return g(c, obj2);
        }
        return null;
    }
}
