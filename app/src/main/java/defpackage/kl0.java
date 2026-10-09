package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class kl0 {
    public final ll0 a;
    public final int[] b;
    public final int c;
    public Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public final fw j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public kl0(ll0 ll0Var) {
        this.a = ll0Var;
        this.b = ll0Var.e;
        int i = ll0Var.f;
        this.c = i;
        this.d = ll0Var.g;
        this.e = ll0Var.h;
        this.h = i;
        this.i = -1;
        this.j = new fw();
    }

    public final er a(int i) {
        ArrayList arrayList = this.a.m;
        int c = nl0.c(arrayList, i, this.c);
        if (c >= 0) {
            return (er) arrayList.get(c);
        }
        er erVar = new er(i);
        arrayList.add(-(c + 1), erVar);
        return erVar;
    }

    public final Object b(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.d[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return re.a;
    }

    public final void c() {
        this.f = true;
        if (this.a.i <= 0) {
            ue.a("Unexpected reader close()");
        }
        r0.i--;
        this.d = new Object[0];
    }

    public final void d() {
        if (this.k == 0) {
            if (this.g != this.h) {
                ue.a("endGroup() not called at the end of a group");
            }
            int i = (this.i * 5) + 2;
            int[] iArr = this.b;
            int i2 = iArr[i];
            this.i = i2;
            int i3 = this.c;
            this.h = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int b = this.j.b();
            if (b < 0) {
                this.l = 0;
                this.m = 0;
            } else {
                this.l = b;
                this.m = i2 >= i3 + (-1) ? this.e : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final Object e() {
        int i = this.g;
        if (i < this.h) {
            return b(this.b, i);
        }
        return 0;
    }

    public final int f() {
        int i = this.g;
        if (i >= this.h) {
            return 0;
        }
        return this.b[i * 5];
    }

    public final Object g(int i, int i2) {
        int[] iArr = this.b;
        int d = nl0.d(iArr, i);
        int i3 = i + 1;
        int i4 = d + i2;
        return i4 < (i3 < this.c ? iArr[(i3 * 5) + 4] : this.e) ? this.d[i4] : re.a;
    }

    public final int h(int i) {
        return this.b[i * 5];
    }

    public final boolean i(int i) {
        return (this.b[(i * 5) + 1] & 536870912) != 0;
    }

    public final boolean j(int i) {
        return (this.b[(i * 5) + 1] & 1073741824) != 0;
    }

    public final Object k() {
        int i;
        if (this.k > 0 || (i = this.l) >= this.m) {
            this.n = false;
            return re.a;
        }
        this.n = true;
        Object[] objArr = this.d;
        this.l = i + 1;
        return objArr[i];
    }

    public final Object l(int i) {
        int i2 = i * 5;
        int[] iArr = this.b;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.d[iArr[i2 + 4]] : re.a;
        }
        return null;
    }

    public final int m(int i) {
        return this.b[(i * 5) + 1] & 67108863;
    }

    public final Object n(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.d[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int o(int i) {
        return this.b[(i * 5) + 2];
    }

    public final void p(int i) {
        if (this.k != 0) {
            ue.a("Cannot reposition while in an empty region");
        }
        this.g = i;
        int[] iArr = this.b;
        int i2 = this.c;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.i) {
            this.i = i3;
            if (i3 < 0) {
                this.h = i2;
            } else {
                this.h = iArr[(i3 * 5) + 3] + i3;
            }
            this.l = 0;
            this.m = 0;
        }
    }

    public final int q() {
        if (this.k != 0) {
            ue.a("Cannot skip while in an empty region");
        }
        int i = this.g;
        int i2 = i * 5;
        int[] iArr = this.b;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.g = iArr[i2 + 3] + i;
        return i4;
    }

    public final void r() {
        if (!(this.k == 0)) {
            ue.a("Cannot skip the enclosing group while in an empty region");
        }
        this.g = this.h;
        this.l = 0;
        this.m = 0;
    }

    public final void s() {
        if (this.k <= 0) {
            int i = this.i;
            int i2 = this.g;
            int i3 = i2 * 5;
            int[] iArr = this.b;
            if (iArr[i3 + 2] != i) {
                dd0.a("Invalid slot table detected");
            }
            int i4 = this.l;
            int i5 = this.m;
            fw fwVar = this.j;
            if (i4 == 0 && i5 == 0) {
                fwVar.c(-1);
            } else {
                fwVar.c(i4);
            }
            this.i = i2;
            this.h = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.g = i6;
            this.l = nl0.d(iArr, i2);
            this.m = i2 >= this.c + (-1) ? this.e : iArr[(i6 * 5) + 4];
        }
    }

    public final String toString() {
        return "SlotReader(current=" + this.g + ", key=" + f() + ", parent=" + this.i + ", end=" + this.h + ")";
    }
}
