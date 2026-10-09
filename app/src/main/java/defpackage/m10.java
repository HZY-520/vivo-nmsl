package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class m10 implements Map, Serializable, hx {
    public static final m10 r;
    public Object[] e;
    public Object[] f;
    public int[] g;
    public int[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public n10 n;
    public o10 o;
    public n10 p;
    public boolean q;

    static {
        m10 m10Var = new m10(0);
        m10Var.q = true;
        r = m10Var;
    }

    public m10(int i) {
        if (i < 0) {
            z6.l("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.e = objArr;
        this.f = null;
        this.g = iArr;
        this.h = new int[highestOneBit];
        this.i = 2;
        this.j = 0;
        this.k = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int h = h(obj);
            int i = this.i * 2;
            int length = this.h.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.h;
                int i3 = iArr[h];
                if (i3 <= 0) {
                    int i4 = this.j;
                    Object[] objArr = this.e;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.j = i5;
                        objArr[i4] = obj;
                        this.g[i4] = h;
                        iArr[h] = i5;
                        this.m++;
                        this.l++;
                        if (i2 > this.i) {
                            this.i = i2;
                        }
                        return i4;
                    }
                    e(1);
                } else {
                    if (lw.i(this.e[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        i(this.h.length * 2);
                        break;
                    }
                    h = h == 0 ? this.h.length - 1 : h - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.q) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z) {
        int i;
        Object[] objArr = this.f;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.j;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.g;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.e;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.h[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        nh.d0(this.e, i3, i);
        if (objArr != null) {
            nh.d0(objArr, i3, this.j);
        }
        this.j = i3;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.j - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.h[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        nh.d0(this.e, 0, this.j);
        Object[] objArr = this.f;
        if (objArr != null) {
            nh.d0(objArr, 0, this.j);
        }
        this.m = 0;
        this.j = 0;
        this.l++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final boolean d(Collection collection) {
        boolean i;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int f = f(entry.getKey());
                    if (f < 0) {
                        i = false;
                    } else {
                        Object[] objArr = this.f;
                        objArr.getClass();
                        i = lw.i(objArr[f], entry.getValue());
                    }
                    if (!i) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void e(int i) {
        Object[] objArr = this.e;
        int length = objArr.length;
        int i2 = this.j;
        int i3 = length - i2;
        int i4 = i2 - this.m;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            c(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.e = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f;
            this.f = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.g = Arrays.copyOf(this.g, i6);
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.h.length) {
                i(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        n10 n10Var = this.p;
        if (n10Var != null) {
            return n10Var;
        }
        n10 n10Var2 = new n10(this, 0);
        this.p = n10Var2;
        return n10Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.m == map.size() && d(map.entrySet());
    }

    public final int f(Object obj) {
        int h = h(obj);
        int i = this.i;
        while (true) {
            int i2 = this.h[h];
            if (i2 == 0) {
                break;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (lw.i(this.e[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                break;
            }
            h = h == 0 ? this.h.length - 1 : h - 1;
        }
        return -1;
    }

    public final int g(Object obj) {
        int i = this.j;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.g[i] >= 0) {
                Object[] objArr = this.f;
                objArr.getClass();
                if (lw.i(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int f = f(obj);
        if (f < 0) {
            return null;
        }
        Object[] objArr = this.f;
        objArr.getClass();
        return objArr[f];
    }

    public final int h(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.k;
    }

    @Override // java.util.Map
    public final int hashCode() {
        j10 j10Var = new j10(this, 0);
        int i = 0;
        while (j10Var.hasNext()) {
            int i2 = j10Var.e;
            m10 m10Var = (m10) j10Var.h;
            if (i2 >= m10Var.j) {
                throw new NoSuchElementException();
            }
            j10Var.e = i2 + 1;
            j10Var.f = i2;
            Object obj = m10Var.e[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = m10Var.f;
            objArr.getClass();
            Object obj2 = objArr[j10Var.f];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            j10Var.c();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.g[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i) {
        this.l++;
        int i2 = 0;
        if (this.j > this.m) {
            c(false);
        }
        this.h = new int[i];
        this.k = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.j) {
            int i3 = i2 + 1;
            int h = h(this.e[i2]);
            int i4 = this.i;
            while (true) {
                int[] iArr = this.h;
                if (iArr[h] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    z6.m("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                h = h == 0 ? iArr.length - 1 : h - 1;
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.m == 0;
    }

    public final void j(int i) {
        this.e[i] = null;
        Object[] objArr = this.f;
        if (objArr != null) {
            objArr[i] = null;
        }
        int i2 = this.g[i];
        int i3 = this.i * 2;
        int length = this.h.length / 2;
        if (i3 > length) {
            i3 = length;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = i2;
        while (true) {
            i2 = i2 == 0 ? this.h.length - 1 : i2 - 1;
            i5++;
            int i7 = this.i;
            int[] iArr = this.h;
            if (i5 > i7) {
                iArr[i6] = 0;
                break;
            }
            int i8 = iArr[i2];
            if (i8 == 0) {
                iArr[i6] = 0;
                break;
            }
            if (i8 < 0) {
                iArr[i6] = -1;
                i6 = i2;
                i5 = 0;
            } else {
                int i9 = i8 - 1;
                int h = h(this.e[i9]) - i2;
                int[] iArr2 = this.h;
                if ((h & (iArr2.length - 1)) >= i5) {
                    iArr2[i6] = i8;
                    this.g[i9] = i6;
                    i6 = i2;
                    i5 = 0;
                }
                iArr = iArr2;
            }
            i4--;
            if (i4 < 0) {
                iArr[i6] = -1;
                break;
            }
        }
        this.g[i] = -1;
        this.m--;
        this.l++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        n10 n10Var = this.n;
        if (n10Var != null) {
            return n10Var;
        }
        n10 n10Var2 = new n10(this, 1);
        this.n = n10Var2;
        return n10Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int a = a(obj);
        Object[] objArr = this.f;
        if (objArr == null) {
            int length = this.e.length;
            if (length < 0) {
                z6.l("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.f = objArr;
        }
        if (a >= 0) {
            objArr[a] = obj2;
            return null;
        }
        int i = (-a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        b();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        e(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a = a(entry.getKey());
            Object[] objArr = this.f;
            if (objArr == null) {
                int length = this.e.length;
                if (length < 0) {
                    z6.l("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.f = objArr;
                }
            }
            if (a >= 0) {
                objArr[a] = entry.getValue();
            } else {
                int i = (-a) - 1;
                if (!lw.i(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int f = f(obj);
        if (f < 0) {
            return null;
        }
        Object[] objArr = this.f;
        objArr.getClass();
        Object obj2 = objArr[f];
        j(f);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.m * 3) + 2);
        sb.append("{");
        int i = 0;
        j10 j10Var = new j10(this, 0);
        while (j10Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = j10Var.e;
            m10 m10Var = (m10) j10Var.h;
            if (i2 >= m10Var.j) {
                throw new NoSuchElementException();
            }
            j10Var.e = i2 + 1;
            j10Var.f = i2;
            Object obj = m10Var.e[i2];
            if (obj == m10Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = m10Var.f;
            objArr.getClass();
            Object obj2 = objArr[j10Var.f];
            if (obj2 == m10Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            j10Var.c();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        o10 o10Var = this.o;
        if (o10Var != null) {
            return o10Var;
        }
        o10 o10Var2 = new o10(0, this);
        this.o = o10Var2;
        return o10Var2;
    }
}
