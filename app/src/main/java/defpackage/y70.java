package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class y70 extends m80 {
    public static final y70 c = new y70(1, 0, 2);

    @Override // defpackage.m80
    public final void a(o80 o80Var, x6 x6Var, ol0 ol0Var, bf0 bf0Var, n80 n80Var) {
        int[] iArr;
        er erVar;
        int c2;
        int a = o80Var.a(0);
        if (ol0Var.n != 0) {
            ue.a("Cannot move a group while inserting");
        }
        if (a < 0) {
            ue.a("Parameter offset is out of bounds");
        }
        if (a == 0) {
            return;
        }
        int i = ol0Var.t;
        int i2 = ol0Var.v;
        int i3 = ol0Var.u;
        int i4 = i;
        while (true) {
            iArr = ol0Var.b;
            if (a <= 0) {
                break;
            }
            i4 += iArr[(ol0Var.p(i4) * 5) + 3];
            if (i4 > i3) {
                ue.a("Parameter offset is out of bounds");
            }
            a--;
        }
        int i5 = iArr[(ol0Var.p(i4) * 5) + 3];
        int f = ol0Var.f(ol0Var.b, ol0Var.p(ol0Var.t));
        int f2 = ol0Var.f(ol0Var.b, ol0Var.p(i4));
        int i6 = i4 + i5;
        int f3 = ol0Var.f(ol0Var.b, ol0Var.p(i6));
        int i7 = f3 - f2;
        ol0Var.v(i7, Math.max(ol0Var.t - 1, 0));
        ol0Var.u(i5);
        int[] iArr2 = ol0Var.b;
        int p = ol0Var.p(i6) * 5;
        o7.P(iArr2, iArr2, ol0Var.p(i) * 5, p, (i5 * 5) + p);
        if (i7 > 0) {
            Object[] objArr = ol0Var.c;
            int g = ol0Var.g(f2 + i7);
            System.arraycopy(objArr, g, objArr, f, ol0Var.g(f3 + i7) - g);
        }
        int i8 = f2 + i7;
        int i9 = i8 - f;
        int i10 = ol0Var.k;
        int i11 = ol0Var.l;
        int length = ol0Var.c.length;
        int i12 = ol0Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int p2 = ol0Var.p(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(p2 * 5) + 4] = ol0.h(ol0.h(ol0Var.f(iArr2, p2) - i15, i12 < p2 ? 0 : i10, i11, length), ol0Var.k, ol0Var.l, ol0Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int n = ol0Var.n();
        int b = nl0.b(ol0Var.d, i6, n);
        ArrayList arrayList = new ArrayList();
        if (b >= 0) {
            while (b < ol0Var.d.size() && (c2 = ol0Var.c((erVar = (er) ol0Var.d.get(b)))) >= i6 && c2 < i16) {
                arrayList.add(erVar);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            er erVar2 = (er) arrayList.get(i18);
            int c3 = ol0Var.c(erVar2) + i17;
            if (c3 >= ol0Var.g) {
                erVar2.a = -(n - c3);
            } else {
                erVar2.a = c3;
            }
            ol0Var.d.add(nl0.b(ol0Var.d, c3, n), erVar2);
        }
        if (ol0Var.F(i6, i5)) {
            ue.a("Unexpectedly removed anchors");
        }
        ol0Var.l(i2, ol0Var.u, i);
        if (i7 > 0) {
            ol0Var.G(i8, i7, i6 - 1);
        }
    }
}
