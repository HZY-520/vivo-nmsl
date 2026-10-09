package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ol0 {
    public final ll0 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public y30 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final fw p;
    public final fw q;
    public final fw r;
    public y30 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public x30 x;

    public ol0(ll0 ll0Var) {
        this.a = ll0Var;
        int[] iArr = ll0Var.e;
        this.b = iArr;
        Object[] objArr = ll0Var.g;
        this.c = objArr;
        this.d = ll0Var.m;
        this.e = ll0Var.n;
        this.f = ll0Var.o;
        int i = ll0Var.f;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = ll0Var.h;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new fw();
        this.q = new fw();
        this.r = new fw();
        this.u = i;
        this.v = -1;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final Object A(int i) {
        int p = p(i);
        int[] iArr = this.b;
        if ((iArr[(p * 5) + 1] & 1073741824) != 0) {
            return this.c[g(f(iArr, p))];
        }
        return null;
    }

    public final int B(int[] iArr, int i) {
        int i2 = iArr[(p(i) * 5) + 2];
        return i2 > -2 ? i2 : (n() + i2) - (-2);
    }

    public final Object C(Object obj) {
        if (this.n > 0) {
            v(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[g(i)];
        if (this.i > this.j) {
            ue.a("Writing to an invalid slot");
        }
        this.c[g(this.i - 1)] = obj;
        return obj2;
    }

    public final void D() {
        int i;
        x30 x30Var = this.x;
        if (x30Var != null) {
            while (x30Var.b != 0) {
                int v = z20.v(x30Var);
                int p = p(v);
                int i2 = v + 1;
                int s = s(v) + v;
                while (true) {
                    if (i2 >= s) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(p(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += s(i2);
                    }
                }
                int[] iArr = this.b;
                int i3 = (p * 5) + 1;
                int i4 = iArr[i3];
                if (((67108864 & i4) != 0 ? 1 : 0) != i) {
                    iArr[i3] = (i << 26) | ((-67108865) & i4);
                    int B = B(iArr, v);
                    if (B >= 0) {
                        z20.b(x30Var, B);
                    }
                }
            }
        }
    }

    public final boolean E() {
        if (this.n != 0) {
            ue.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int f = f(this.b, p(i));
        int I = I();
        L(this.v);
        x30 x30Var = this.x;
        if (x30Var != null) {
            while (true) {
                int i3 = x30Var.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    throw new NoSuchElementException("IntList is empty.");
                }
                if (x30Var.a[0] < i) {
                    break;
                }
                z20.v(x30Var);
            }
        }
        boolean F = F(i, this.t - i);
        G(f, this.i - f, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= I;
        return F;
    }

    public final boolean F(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            y(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i3 = i + i2;
                int b = nl0.b(this.d, i3, m() - this.h);
                if (b >= this.d.size()) {
                    b--;
                }
                int i4 = b + 1;
                int i5 = 0;
                while (b >= 0) {
                    er erVar = (er) this.d.get(b);
                    int c = c(erVar);
                    if (c < i) {
                        break;
                    }
                    if (c < i3) {
                        erVar.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = b + 1;
                        }
                        i4 = b;
                    }
                    b--;
                }
                r0 = i4 < i5;
                if (r0) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(p(i8) * 5) + 1] & 67108864) != 0) {
                Q(i8);
            }
        }
        return r0;
    }

    public final void G(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            z(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object H(int i, int i2, Object obj) {
        int K = K(this.b, p(i));
        int f = f(this.b, p(i + 1));
        int i3 = K + i2;
        if (i3 < K || i3 >= f) {
            ue.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int g = g(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[g];
        objArr[g] = obj;
        return obj2;
    }

    public final int I() {
        int p = p(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = p * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = f(iArr, p(i3));
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void J() {
        int i = this.u;
        this.t = i;
        this.i = f(this.b, p(i));
    }

    public final int K(int[] iArr, int i) {
        if (i >= m()) {
            return this.c.length - this.l;
        }
        int d = nl0.d(iArr, i);
        return d < 0 ? (this.c.length - this.l) + d + 1 : d;
    }

    public final ir L(int i) {
        er O;
        HashMap hashMap = this.e;
        if (hashMap == null || (O = O(i)) == null) {
            return null;
        }
        return (ir) hashMap.get(O);
    }

    public final void M() {
        if (this.n != 0) {
            ue.a("Key must be supplied when inserting");
        }
        i2 i2Var = re.a;
        N(0, i2Var, false, i2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(int i, Object obj, boolean z, Object obj2) {
        int i2;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.c(this.o);
        i2 i2Var = re.a;
        if (objArr == true) {
            int i4 = this.t;
            int f = f(this.b, p(i4));
            u(1);
            this.i = f;
            this.j = f;
            int p = p(i4);
            int i5 = obj != i2Var ? 1 : 0;
            int i6 = (z || obj2 == i2Var) ? 0 : 1;
            int h = h(f, this.k, this.l, this.c.length);
            if (h >= 0 && this.m < i4) {
                h = -(((this.c.length - this.l) - h) + 1);
            }
            int[] iArr = this.b;
            int i7 = this.v;
            int i8 = p * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = h;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                v(i9, i4);
                Object[] objArr2 = this.c;
                int i10 = this.i;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.i = i10;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0) {
                L(i3);
            }
        } else {
            this.p.c(i3);
            this.q.c((m() - this.h) - this.u);
            int i11 = this.t;
            int p2 = p(i11);
            if (!obj2.equals(i2Var)) {
                if (z) {
                    R(this.t, obj2);
                } else {
                    P(obj2);
                }
            }
            this.i = K(this.b, p2);
            this.j = f(this.b, p(this.t + 1));
            int[] iArr2 = this.b;
            int i12 = p2 * 5;
            this.o = iArr2[i12 + 1] & 67108863;
            this.v = i11;
            this.t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.u = i2;
    }

    public final er O(int i) {
        ArrayList arrayList;
        int c;
        if (i < 0 || i >= n() || (c = nl0.c((arrayList = this.d), i, n())) < 0) {
            return null;
        }
        return (er) arrayList.get(c);
    }

    public final void P(Object obj) {
        int p = p(this.t);
        int i = (p * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            ue.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[g(Integer.bitCount(iArr[i] >> 29) + f(iArr, p))] = obj;
    }

    public final void Q(int i) {
        if (i >= 0) {
            x30 x30Var = this.x;
            if (x30Var == null) {
                x30Var = new x30();
                this.x = x30Var;
            }
            z20.b(x30Var, i);
        }
    }

    public final void R(int i, Object obj) {
        int p = p(i);
        int[] iArr = this.b;
        if (p >= iArr.length || (iArr[(p * 5) + 1] & 1073741824) == 0) {
            ue.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[g(f(this.b, p))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            ue.a("Cannot seek backwards");
        }
        if (this.n > 0) {
            dd0.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        int i3 = this.v;
        if (i2 < i3 || i2 > this.u) {
            ue.a("Cannot seek outside the current group (" + i3 + "-" + this.u + ")");
        }
        this.t = i2;
        int f = f(this.b, p(i2));
        this.i = f;
        this.j = f;
    }

    public final er b(int i) {
        ArrayList arrayList = this.d;
        int c = nl0.c(arrayList, i, n());
        if (c >= 0) {
            return (er) arrayList.get(c);
        }
        if (i > this.g) {
            i = -(n() - i);
        }
        er erVar = new er(i);
        arrayList.add(-(c + 1), erVar);
        return erVar;
    }

    public final int c(er erVar) {
        int i = erVar.a;
        return i < 0 ? n() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.c((m() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            y(n());
            z(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            D();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap hashMap = this.e;
        y30 y30Var = this.f;
        ll0 ll0Var = this.a;
        if (!ll0Var.k) {
            dd0.a("Unexpected writer close()");
        }
        ll0Var.k = false;
        ll0Var.e = iArr;
        ll0Var.f = i2;
        ll0Var.g = objArr;
        ll0Var.h = i3;
        ll0Var.m = arrayList;
        ll0Var.n = hashMap;
        ll0Var.o = y30Var;
    }

    public final int f(int[] iArr, int i) {
        if (i >= m()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int g(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void i() {
        h40 h40Var;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int p = p(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = p * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        fw fwVar = this.r;
        if (z) {
            y30 y30Var = this.s;
            if (y30Var != null && (h40Var = (h40) y30Var.b(i3)) != null) {
                Object[] objArr = h40Var.a;
                int i8 = h40Var.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    C(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            nl0.f(iArr, p, i4);
            int b = fwVar.b();
            if (z2) {
                i4 = 1;
            }
            this.o = b + i4;
            int B = B(this.b, i3);
            this.v = B;
            int n = B < 0 ? n() : p(B + 1);
            int f = n >= 0 ? f(this.b, n) : 0;
            this.i = f;
            this.j = f;
            return;
        }
        if (i != i2) {
            ue.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        nl0.f(iArr2, p, i4);
        int b2 = this.p.b();
        this.u = (m() - this.h) - this.q.b();
        this.v = b2;
        int B2 = B(this.b, i3);
        int b3 = fwVar.b();
        this.o = b3;
        if (B2 == b2) {
            this.o = b3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (B2 != 0 && B2 != b2 && (i14 != 0 || i13 != 0)) {
                int p2 = p(B2);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (p2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    nl0.f(iArr4, p2, (iArr4[(p2 * 5) + 1] & 67108863) + i14);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(p2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                B2 = B(iArr5, B2);
            }
        }
        this.o += i14;
    }

    public final void j() {
        if (this.n <= 0) {
            dd0.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                ue.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (m() - this.h) - this.q.b();
        }
    }

    public final void k(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            ue.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                ue.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            M();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((n() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(p(i3) * 5) + 2] = i;
            int i4 = this.b[(p(i3) * 5) + 3] + i3;
            l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final int m() {
        return this.b.length / 5;
    }

    public final int n() {
        return m() - this.h;
    }

    public final Object o(int i) {
        int p = p(i);
        int[] iArr = this.b;
        int i2 = (p * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return re.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + f(iArr, p)];
    }

    public final int p(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final int q(int i) {
        return this.b[p(i) * 5];
    }

    public final Object r(int i) {
        int p = p(i);
        int[] iArr = this.b;
        int i2 = p * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int s(int i) {
        return this.b[(p(i) * 5) + 3];
    }

    public final boolean t(int i, int i2) {
        int m;
        int s;
        if (i2 == this.v) {
            m = this.u;
        } else {
            fw fwVar = this.p;
            if (i2 > fwVar.a(0)) {
                s = s(i2);
            } else {
                int[] iArr = fwVar.a;
                int min = Math.min(iArr.length, fwVar.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    s = s(i2);
                } else {
                    m = (m() - this.h) - this.q.a[i3];
                }
            }
            m = s + i2;
        }
        return i > i2 && i < m;
    }

    public final String toString() {
        int i = this.t;
        int i2 = this.u;
        int n = n();
        int i3 = this.g;
        return "SlotWriter(current = " + i + " end=" + i2 + " size = " + n + " gap=" + i3 + "-" + (this.h + i3) + ")";
    }

    public final void u(int i) {
        if (i > 0) {
            int i2 = this.t;
            y(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                o7.P(iArr, iArr2, 0, 0, i3 * 5);
                o7.P(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.b = iArr2;
                i4 = i6;
                iArr = iArr2;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int h = h(i5 > 0 ? f(iArr, p(i2 + i)) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.b[(i9 * 5) + 4] = h;
            }
            int i10 = this.m;
            if (i10 >= i3) {
                this.m = i10 + i;
            }
        }
    }

    public final void v(int i, int i2) {
        if (i > 0) {
            z(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean w(int i) {
        return (this.b[(p(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void x(ll0 ll0Var, int i) {
        if (this.n <= 0) {
            ue.a("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.f == 0) {
            int[] iArr = ll0Var.e;
            int i2 = iArr[(i * 5) + 3];
            int i3 = ll0Var.f;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap hashMap = this.e;
                y30 y30Var = this.f;
                Object[] objArr2 = ll0Var.g;
                int i4 = ll0Var.h;
                HashMap hashMap2 = ll0Var.n;
                y30 y30Var2 = ll0Var.o;
                this.b = iArr;
                this.c = objArr2;
                this.d = ll0Var.m;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = hashMap2;
                this.f = y30Var2;
                ll0Var.e = iArr2;
                ll0Var.f = 0;
                ll0Var.g = objArr;
                ll0Var.h = 0;
                ll0Var.m = arrayList;
                ll0Var.n = hashMap;
                ll0Var.o = y30Var;
                return;
            }
        }
        ol0 c = ll0Var.c();
        try {
            u10.A(c, i, this, true, true, false);
            c.e(true);
        } catch (Throwable th) {
            c.e(false);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r2 = r8.b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        defpackage.o7.P(r2, r2, r4 + r3, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        defpackage.o7.P(r2, r2, r5, r5 + r4, r3 + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i) {
        er erVar;
        int i2;
        er erVar2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int m = m() - this.h;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int b = nl0.b(arrayList, i6, m); b < this.d.size() && (i3 = (erVar2 = (er) this.d.get(b)).a) < 0 && (i4 = i3 + m) < i; b++) {
                        erVar2.a = i4;
                    }
                } else {
                    for (int b2 = nl0.b(arrayList, i, m); b2 < this.d.size() && (i2 = (erVar = (er) this.d.get(b2)).a) >= 0; b2++) {
                        erVar.a = -(m - i2);
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int m2 = m();
            if (i6 >= m2) {
                ue.a("Check failed");
            }
            while (i6 < m2) {
                int i7 = (i6 * 5) + 2;
                int i8 = this.b[i7];
                int n = i8 > -2 ? i8 : (n() + i8) - (-2);
                if (n >= i) {
                    n = -((n() - n) - (-2));
                }
                if (n != i8) {
                    this.b[i7] = n;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void z(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, n());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int p = p(min);
                int p2 = p(i5);
                int i7 = this.g;
                while (p < p2) {
                    int i8 = (p * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        ue.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    p++;
                    if (p == i7) {
                        p += this.h;
                    }
                }
            } else {
                int p3 = p(i5);
                int p4 = p(min);
                while (p3 < p4) {
                    int i10 = (p3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        ue.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    p3++;
                    if (p3 == this.g) {
                        p3 += this.h;
                    }
                }
            }
            this.m = min;
        }
        this.k = i;
    }
}
