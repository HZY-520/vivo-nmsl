package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class fr0 {
    public static final fr0 e = new fr0(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final i2 c;
    public Object[] d;

    public fr0(int i, int i2, Object[] objArr, i2 i2Var) {
        this.a = i;
        this.b = i2;
        this.c = i2Var;
        this.d = objArr;
    }

    public static fr0 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, i2 i2Var) {
        if (i3 > 30) {
            return new fr0(0, 0, new Object[]{obj, obj2, obj3, obj4}, i2Var);
        }
        int m = t30.m(i, i3);
        int m2 = t30.m(i2, i3);
        if (m != m2) {
            return new fr0((1 << m) | (1 << m2), 0, m < m2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, i2Var);
        }
        return new fr0(0, 1 << m, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, i2Var)}, i2Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, i2 i2Var) {
        Object obj3 = this.d[i];
        fr0 j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, i2Var);
        int t = t(i2);
        int i5 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        o7.T(objArr, objArr2, 0, i, 6);
        o7.R(objArr, objArr2, i, i + 2, i5);
        objArr2[t - 1] = j;
        o7.R(objArr, objArr2, t, i5, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        yv y = t30.y(t30.C(0, this.d.length));
        int i = y.e;
        int i2 = y.f;
        int i3 = y.g;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!lw.i(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int m = 1 << t30.m(i, i2);
        if (h(m)) {
            return lw.i(obj, this.d[f(m)]);
        }
        if (!i(m)) {
            return false;
        }
        fr0 s = s(t(m));
        return i2 == 30 ? s.c(obj) : s.d(i, i2 + 5, obj);
    }

    public final boolean e(fr0 fr0Var) {
        if (this == fr0Var) {
            return true;
        }
        if (this.b == fr0Var.b && this.a == fr0Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == fr0Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int m = 1 << t30.m(i, i2);
        if (h(m)) {
            int f = f(m);
            if (lw.i(obj, this.d[f])) {
                return x(f);
            }
            return null;
        }
        if (!i(m)) {
            return null;
        }
        fr0 s = s(t(m));
        if (i2 != 30) {
            return s.g(i, i2 + 5, obj);
        }
        yv y = t30.y(t30.C(0, s.d.length));
        int i3 = y.e;
        int i4 = y.f;
        int i5 = y.g;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!lw.i(obj, s.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return s.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final fr0 k(int i, wa0 wa0Var) {
        wa0Var.e(wa0Var.i - 1);
        wa0Var.g = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != wa0Var.e) {
            return new fr0(0, 0, t30.q(i, objArr), wa0Var.e);
        }
        this.d = t30.q(i, objArr);
        return this;
    }

    public final fr0 l(int i, Object obj, Object obj2, int i2, wa0 wa0Var) {
        wa0 wa0Var2;
        fr0 l;
        int m = 1 << t30.m(i, i2);
        boolean h = h(m);
        i2 i2Var = this.c;
        if (h) {
            int f = f(m);
            if (!lw.i(obj, this.d[f])) {
                wa0Var.e(wa0Var.i + 1);
                i2 i2Var2 = wa0Var.e;
                if (i2Var != i2Var2) {
                    return new fr0(this.a ^ m, this.b | m, a(f, m, i, obj, obj2, i2, i2Var2), i2Var2);
                }
                this.d = a(f, m, i, obj, obj2, i2, i2Var2);
                this.a ^= m;
                this.b |= m;
                return this;
            }
            wa0Var.g = x(f);
            if (x(f) == obj2) {
                return this;
            }
            if (i2Var == wa0Var.e) {
                this.d[f + 1] = obj2;
                return this;
            }
            wa0Var.h++;
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[f + 1] = obj2;
            return new fr0(this.a, this.b, copyOf, wa0Var.e);
        }
        if (!i(m)) {
            wa0Var.e(wa0Var.i + 1);
            i2 i2Var3 = wa0Var.e;
            int f2 = f(m);
            Object[] objArr2 = this.d;
            if (i2Var != i2Var3) {
                return new fr0(this.a | m, this.b, t30.n(objArr2, f2, obj, obj2), i2Var3);
            }
            this.d = t30.n(objArr2, f2, obj, obj2);
            this.a |= m;
            return this;
        }
        int t = t(m);
        fr0 s = s(t);
        if (i2 == 30) {
            yv y = t30.y(t30.C(0, s.d.length));
            int i3 = y.e;
            int i4 = y.f;
            int i5 = y.g;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!lw.i(obj, s.d[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                wa0Var.g = s.x(i3);
                if (s.c == wa0Var.e) {
                    s.d[i3 + 1] = obj2;
                    l = s;
                } else {
                    wa0Var.h++;
                    Object[] objArr3 = s.d;
                    Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    copyOf2[i3 + 1] = obj2;
                    l = new fr0(0, 0, copyOf2, wa0Var.e);
                }
                wa0Var2 = wa0Var;
            }
            wa0Var.e(wa0Var.i + 1);
            l = new fr0(0, 0, t30.n(s.d, 0, obj, obj2), wa0Var.e);
            wa0Var2 = wa0Var;
        } else {
            wa0Var2 = wa0Var;
            l = s.l(i, obj, obj2, i2 + 5, wa0Var2);
        }
        return s == l ? this : r(t, l, wa0Var2.e);
    }

    public final fr0 m(fr0 fr0Var, int i, ri riVar, wa0 wa0Var) {
        Object[] objArr;
        fr0 j;
        if (this == fr0Var) {
            riVar.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            i2 i2Var = wa0Var.e;
            int i3 = fr0Var.b;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + fr0Var.d.length);
            int length = this.d.length;
            yv y = t30.y(t30.C(0, fr0Var.d.length));
            int i4 = y.e;
            int i5 = y.f;
            int i6 = y.g;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(fr0Var.d[i4])) {
                        riVar.a++;
                    } else {
                        Object[] objArr3 = fr0Var.d;
                        copyOf[length] = objArr3[i4];
                        copyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                return length == fr0Var.d.length ? fr0Var : length == copyOf.length ? new fr0(0, 0, copyOf, i2Var) : new fr0(0, 0, Arrays.copyOf(copyOf, length), i2Var);
            }
        } else {
            int i7 = this.b | fr0Var.b;
            int i8 = this.a;
            int i9 = fr0Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i11);
                if (lw.i(this.d[f(lowestOneBit)], fr0Var.d[fr0Var.f(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                dd0.b("Check failed.");
            }
            fr0 fr0Var2 = (lw.i(this.c, wa0Var.e) && this.a == i12 && this.b == i7) ? this : new fr0(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = fr0Var2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(lowestOneBit2)) {
                    j = s(t(lowestOneBit2));
                    if (fr0Var.i(lowestOneBit2)) {
                        j = j.m(fr0Var.s(fr0Var.t(lowestOneBit2)), i + 5, riVar, wa0Var);
                        objArr = objArr4;
                    } else if (fr0Var.h(lowestOneBit2)) {
                        int f = fr0Var.f(lowestOneBit2);
                        Object obj = fr0Var.d[f];
                        Object x = fr0Var.x(f);
                        int i15 = wa0Var.i;
                        objArr = objArr4;
                        j = j.l(obj != null ? obj.hashCode() : i2, obj, x, i + 5, wa0Var);
                        if (wa0Var.i == i15) {
                            riVar.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (fr0Var.i(lowestOneBit2)) {
                        fr0 s = fr0Var.s(fr0Var.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f2 = f(lowestOneBit2);
                            Object obj2 = this.d[f2];
                            int i16 = i + 5;
                            if (s.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                riVar.a++;
                            } else {
                                j = s.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f2), i16, wa0Var);
                            }
                        }
                        j = s;
                    } else {
                        int f3 = f(lowestOneBit2);
                        Object obj3 = this.d[f3];
                        Object x2 = x(f3);
                        int f4 = fr0Var.f(lowestOneBit2);
                        Object obj4 = fr0Var.d[f4];
                        j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x2, obj4 != null ? obj4.hashCode() : 0, obj4, fr0Var.x(f4), i + 5, wa0Var.e);
                    }
                }
                objArr[length2] = j;
                i14++;
                i13 ^= lowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (fr0Var.h(lowestOneBit3)) {
                    int f5 = fr0Var.f(lowestOneBit3);
                    Object[] objArr5 = fr0Var2.d;
                    objArr5[i18] = fr0Var.d[f5];
                    objArr5[i18 + 1] = fr0Var.x(f5);
                    if (h(lowestOneBit3)) {
                        riVar.a++;
                    }
                } else {
                    int f6 = f(lowestOneBit3);
                    Object[] objArr6 = fr0Var2.d;
                    objArr6[i18] = this.d[f6];
                    objArr6[i18 + 1] = x(f6);
                }
                i17++;
                i12 ^= lowestOneBit3;
            }
            if (!e(fr0Var2)) {
                return fr0Var.e(fr0Var2) ? fr0Var : fr0Var2;
            }
        }
        return this;
    }

    public final fr0 n(int i, Object obj, int i2, wa0 wa0Var) {
        fr0 n;
        int m = 1 << t30.m(i, i2);
        if (h(m)) {
            int f = f(m);
            if (lw.i(obj, this.d[f])) {
                return p(f, m, wa0Var);
            }
        } else if (i(m)) {
            int t = t(m);
            fr0 s = s(t);
            if (i2 == 30) {
                yv y = t30.y(t30.C(0, s.d.length));
                int i3 = y.e;
                int i4 = y.f;
                int i5 = y.g;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!lw.i(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    n = s.k(i3, wa0Var);
                }
                n = s;
                break;
            }
            n = s.n(i, obj, i2 + 5, wa0Var);
            return q(s, n, t, m, wa0Var.e);
        }
        return this;
    }

    public final fr0 o(int i, Object obj, Object obj2, int i2, wa0 wa0Var) {
        wa0 wa0Var2;
        fr0 o;
        int m = 1 << t30.m(i, i2);
        if (h(m)) {
            int f = f(m);
            return (lw.i(obj, this.d[f]) && lw.i(obj2, x(f))) ? p(f, m, wa0Var) : this;
        }
        if (!i(m)) {
            return this;
        }
        int t = t(m);
        fr0 s = s(t);
        if (i2 == 30) {
            yv y = t30.y(t30.C(0, s.d.length));
            int i3 = y.e;
            int i4 = y.f;
            int i5 = y.g;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!lw.i(obj, s.d[i3]) || !lw.i(obj2, s.x(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        o = s.k(i3, wa0Var);
                        break;
                    }
                }
            }
            o = s;
            wa0Var2 = wa0Var;
        } else {
            wa0Var2 = wa0Var;
            o = s.o(i, obj, obj2, i2 + 5, wa0Var2);
        }
        return q(s, o, t, m, wa0Var2.e);
    }

    public final fr0 p(int i, int i2, wa0 wa0Var) {
        wa0Var.e(wa0Var.i - 1);
        wa0Var.g = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != wa0Var.e) {
            return new fr0(i2 ^ this.a, this.b, t30.q(i, objArr), wa0Var.e);
        }
        this.d = t30.q(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final fr0 q(fr0 fr0Var, fr0 fr0Var2, int i, int i2, i2 i2Var) {
        i2 i2Var2 = this.c;
        if (fr0Var2 != null) {
            return (i2Var2 == i2Var || fr0Var != fr0Var2) ? r(i, fr0Var2, i2Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (i2Var2 != i2Var) {
            return new fr0(this.a, this.b ^ i2, t30.r(i, objArr), i2Var);
        }
        this.d = t30.r(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final fr0 r(int i, fr0 fr0Var, i2 i2Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && fr0Var.d.length == 2 && fr0Var.b == 0) {
            fr0Var.a = this.b;
            return fr0Var;
        }
        if (this.c == i2Var) {
            objArr[i] = fr0Var;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = fr0Var;
        return new fr0(this.a, this.b, copyOf, i2Var);
    }

    public final fr0 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (fr0) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        r13.f = w(r11, r4, (defpackage.fr0) r13.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
    
        if (r13 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jd u(int i, int i2, Object obj, Object obj2) {
        jd u;
        int i3 = 1;
        int m = 1 << t30.m(i, i2);
        int i4 = 0;
        if (h(m)) {
            int f = f(m);
            if (!lw.i(obj, this.d[f])) {
                return new jd(i3, new fr0(this.a ^ m, this.b | m, a(f, m, i, obj, obj2, i2, null), null));
            }
            if (x(f) != obj2) {
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj2;
                return new jd(i4, new fr0(this.a, this.b, copyOf, null));
            }
        } else {
            if (!i(m)) {
                return new jd(i3, new fr0(this.a | m, this.b, t30.n(this.d, f(m), obj, obj2), null));
            }
            int t = t(m);
            fr0 s = s(t);
            if (i2 == 30) {
                yv y = t30.y(t30.C(0, s.d.length));
                int i5 = y.e;
                int i6 = y.f;
                int i7 = y.g;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (!lw.i(obj, s.d[i5])) {
                        if (i5 != i6) {
                            i5 += i7;
                        }
                    }
                    if (obj2 == s.x(i5)) {
                        u = null;
                    } else {
                        Object[] objArr2 = s.d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i5 + 1] = obj2;
                        u = new jd(i4, new fr0(0, 0, copyOf2, null));
                    }
                }
                u = new jd(i3, new fr0(0, 0, t30.n(s.d, 0, obj, obj2), null));
                break;
            }
            u = s.u(i, i2 + 5, obj, obj2);
        }
        return null;
    }

    public final fr0 v(int i, int i2, Object obj) {
        fr0 v;
        int m = 1 << t30.m(i, i2);
        if (h(m)) {
            int f = f(m);
            if (!lw.i(obj, this.d[f])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new fr0(this.a ^ m, this.b, t30.q(f, objArr), null);
            }
        } else {
            if (!i(m)) {
                return this;
            }
            int t = t(m);
            fr0 s = s(t);
            if (i2 == 30) {
                yv y = t30.y(t30.C(0, s.d.length));
                int i3 = y.e;
                int i4 = y.f;
                int i5 = y.g;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!lw.i(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = s.d;
                    v = objArr2.length == 2 ? null : new fr0(0, 0, t30.q(i3, objArr2), null);
                }
                v = s;
                break;
            }
            v = s.v(i, i2 + 5, obj);
            if (v != null) {
                return s != v ? w(t, m, v) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new fr0(this.a, this.b ^ m, t30.r(t, objArr3), null);
            }
        }
        return null;
    }

    public final fr0 w(int i, int i2, fr0 fr0Var) {
        Object[] objArr = fr0Var.d;
        if (objArr.length != 2 || fr0Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = fr0Var;
            return new fr0(this.a, this.b, copyOf, null);
        }
        if (this.d.length == 1) {
            fr0Var.a = this.b;
            return fr0Var;
        }
        int f = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        o7.R(copyOf2, copyOf2, i + 2, i + 1, objArr3.length);
        o7.R(copyOf2, copyOf2, f + 2, f, i);
        copyOf2[f] = obj;
        copyOf2[f + 1] = obj2;
        return new fr0(this.a ^ i2, this.b ^ i2, copyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
