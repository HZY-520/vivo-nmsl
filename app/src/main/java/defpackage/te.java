package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class te {
    public final gr a;
    public ta b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final fw d = new fw();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public te(gr grVar, ta taVar) {
        this.a = grVar;
        this.b = taVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            p80 p80Var = this.b.u;
            p80Var.O(k80.c);
            p80Var.c[p80Var.d - p80Var.a[p80Var.b - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        ta taVar = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        taVar.getClass();
        if (size != 0) {
            p80 p80Var2 = taVar.u;
            p80Var2.O(o70.c);
            t30.w(p80Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                p80 p80Var = this.b.u;
                p80Var.O(c80.c);
                int i3 = p80Var.d - p80Var.a[p80Var.b - 1].a;
                int[] iArr = p80Var.c;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                p80 p80Var2 = this.b.u;
                p80Var2.O(z70.c);
                int i6 = p80Var2.d - p80Var2.a[p80Var2.b - 1].a;
                int[] iArr2 = p80Var2.c;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        kl0 kl0Var = this.a.G;
        int i = z ? kl0Var.i : kl0Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            ue.a("Tried to seek backward");
        }
        if (i2 > 0) {
            p80 p80Var = this.b.u;
            p80Var.O(i70.c);
            p80Var.c[p80Var.d - p80Var.a[p80Var.b - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                ue.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
