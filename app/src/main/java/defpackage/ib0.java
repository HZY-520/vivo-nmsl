package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ib0 extends b0 {
    public final Object[] e;
    public final Object[] f;
    public final int g;
    public final int h;

    public ib0(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.e = objArr;
        this.f = objArr2;
        this.g = i;
        this.h = i2;
        if (!(a() > 32)) {
            dd0.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] i(Object[] objArr, int i, int i2, Object obj, t3 t3Var) {
        int t = u10.t(i2, i);
        if (i == 0) {
            Object[] copyOf = t == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            o7.R(objArr, copyOf, t + 1, t, 31);
            t3Var.f = objArr[31];
            copyOf[t] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[t];
        obj2.getClass();
        copyOf2[t] = i((Object[]) obj2, i3, i2, obj, t3Var);
        while (true) {
            t++;
            if (t >= 32 || copyOf2[t] == null) {
                break;
            }
            Object obj3 = objArr[t];
            obj3.getClass();
            copyOf2[t] = i((Object[]) obj3, i3, 0, t3Var.f, t3Var);
        }
        return copyOf2;
    }

    public static Object[] k(Object[] objArr, int i, int i2, t3 t3Var) {
        Object[] k;
        int t = u10.t(i2, i);
        if (i == 5) {
            t3Var.f = objArr[t];
            k = null;
        } else {
            Object obj = objArr[t];
            obj.getClass();
            k = k((Object[]) obj, i - 5, i2, t3Var);
        }
        if (k == null && t == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[t] = k;
        return copyOf;
    }

    public static Object[] q(Object[] objArr, int i, int i2, Object obj) {
        int t = u10.t(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[t] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[t];
        obj2.getClass();
        copyOf[t] = q((Object[]) obj2, i - 5, i2, obj);
        return copyOf;
    }

    @Override // defpackage.m
    public final int a() {
        return this.g;
    }

    @Override // defpackage.b0
    public final b0 b(int i, Object obj) {
        int i2 = this.g;
        kw.h(i, i2);
        if (i == i2) {
            return c(obj);
        }
        int p = p();
        Object[] objArr = this.e;
        if (i >= p) {
            return j(objArr, i - p, obj);
        }
        t3 t3Var = new t3(13, (Object) null);
        return j(i(objArr, this.h, i, obj, t3Var), 0, t3Var.f);
    }

    @Override // defpackage.b0
    public final b0 c(Object obj) {
        int p = p();
        int i = this.g;
        int i2 = i - p;
        Object[] objArr = this.e;
        Object[] objArr2 = this.f;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new ib0(objArr, copyOf, i + 1, this.h);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return l(objArr, objArr2, objArr3);
    }

    @Override // defpackage.b0
    public final jb0 e() {
        return new jb0(this, this.e, this.f, this.h);
    }

    @Override // defpackage.b0
    public final b0 f(a0 a0Var) {
        jb0 jb0Var = new jb0(this, this.e, this.f, this.h);
        jb0Var.y(a0Var);
        return jb0Var.c();
    }

    @Override // defpackage.b0
    public final b0 g(int i) {
        kw.g(i, a());
        int p = p();
        int i2 = this.h;
        Object[] objArr = this.e;
        if (i >= p) {
            return o(objArr, p, i2, i - p);
        }
        return o(n(objArr, i2, i, new t3(13, this.f[0])), p, i2, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        kw.g(i, a());
        if (p() <= i) {
            objArr = this.f;
        } else {
            Object[] objArr2 = this.e;
            for (int i2 = this.h; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[u10.t(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.b0
    public final b0 h(int i, Object obj) {
        int i2 = this.g;
        kw.g(i, i2);
        int p = p();
        Object[] objArr = this.e;
        Object[] objArr2 = this.f;
        int i3 = this.h;
        if (p > i) {
            return new ib0(q(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        copyOf[i & 31] = obj;
        return new ib0(objArr, copyOf, i2, i3);
    }

    public final ib0 j(Object[] objArr, int i, Object obj) {
        int p = p();
        int i2 = this.g;
        int i3 = i2 - p;
        Object[] objArr2 = this.f;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            o7.R(objArr2, copyOf, i + 1, i, i3);
            copyOf[i] = obj;
            return new ib0(objArr, copyOf, i2 + 1, this.h);
        }
        Object obj2 = objArr2[31];
        o7.R(objArr2, copyOf, i + 1, i, i3 - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return l(objArr, copyOf, objArr3);
    }

    public final ib0 l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.g;
        int i2 = i >> 5;
        int i3 = this.h;
        if (i2 <= (1 << i3)) {
            return new ib0(m(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new ib0(m(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    @Override // defpackage.w, java.util.List
    public final ListIterator listIterator(int i) {
        kw.h(i, this.g);
        return new kb0(this.e, this.f, i, this.g, (this.h / 5) + 1);
    }

    public final Object[] m(int i, Object[] objArr, Object[] objArr2) {
        int t = u10.t(a() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[t] = objArr2;
            return copyOf;
        }
        copyOf[t] = m(i - 5, (Object[]) copyOf[t], objArr2);
        return copyOf;
    }

    public final Object[] n(Object[] objArr, int i, int i2, t3 t3Var) {
        int t = u10.t(i2, i);
        if (i == 0) {
            Object[] copyOf = t == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            o7.R(objArr, copyOf, t, t + 1, 32);
            copyOf[31] = t3Var.f;
            t3Var.f = objArr[t];
            return copyOf;
        }
        int t2 = objArr[31] == null ? u10.t(p() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = t + 1;
        if (i4 <= t2) {
            while (true) {
                Object obj = copyOf2[t2];
                obj.getClass();
                copyOf2[t2] = n((Object[]) obj, i3, 0, t3Var);
                if (t2 == i4) {
                    break;
                }
                t2--;
            }
        }
        Object obj2 = copyOf2[t];
        obj2.getClass();
        copyOf2[t] = n((Object[]) obj2, i3, i2, t3Var);
        return copyOf2;
    }

    public final b0 o(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.g - i;
        Object obj = null;
        if (i4 != 1) {
            Object[] objArr2 = this.f;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                o7.R(objArr2, copyOf, i3, i3 + 1, i4);
            }
            copyOf[i5] = null;
            return new ib0(objArr, copyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new pl0(objArr);
        }
        t3 t3Var = new t3(13, obj);
        Object[] k = k(objArr, i2, i - 1, t3Var);
        k.getClass();
        Object obj2 = t3Var.f;
        obj2.getClass();
        Object[] objArr3 = (Object[]) obj2;
        if (k[1] != null) {
            return new ib0(k, objArr3, i, i2);
        }
        Object obj3 = k[0];
        obj3.getClass();
        return new ib0((Object[]) obj3, objArr3, i, i2 - 5);
    }

    public final int p() {
        return (this.g - 1) & (-32);
    }
}
