package defpackage;

import com.vivo.cnm.lico.Gates;
import java.util.Comparator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class zo implements Comparator {
    public static final zo f = new zo(0);
    public static final zo g = new zo(1);
    public static final zo h = new zo(2);
    public static final zo i = new zo(3);
    public static final zo j = new zo(4);
    public final /* synthetic */ int e;

    public /* synthetic */ zo(int i2) {
        this.e = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                yo yoVar = (yo) obj;
                yo yoVar2 = (yo) obj2;
                if (!kw.y(yoVar) || !kw.y(yoVar2)) {
                    if (kw.y(yoVar)) {
                        return -1;
                    }
                    return kw.y(yoVar2) ? 1 : 0;
                }
                iy a0 = nh.a0(yoVar);
                iy a02 = nh.a0(yoVar2);
                if (lw.i(a0, a02)) {
                    return 0;
                }
                iy[] iyVarArr = new iy[16];
                int i2 = 0;
                while (a0 != null) {
                    int i3 = i2 + 1;
                    if (iyVarArr.length < i3) {
                        int length = iyVarArr.length;
                        ?? r4 = new Object[Math.max(i3, length * 2)];
                        System.arraycopy(iyVarArr, 0, r4, 0, length);
                        iyVarArr = r4;
                    }
                    if (i2 != 0) {
                        System.arraycopy(iyVarArr, 0, iyVarArr, 0 + 1, i2 + 0);
                    }
                    iyVarArr[0] = a0;
                    i2++;
                    a0 = a0.n();
                }
                iy[] iyVarArr2 = new iy[16];
                int i4 = 0;
                while (a02 != null) {
                    int i5 = i4 + 1;
                    if (iyVarArr2.length < i5) {
                        int length2 = iyVarArr2.length;
                        ?? r42 = new Object[Math.max(i5, length2 * 2)];
                        System.arraycopy(iyVarArr2, 0, r42, 0, length2);
                        iyVarArr2 = r42;
                    }
                    if (i4 != 0) {
                        System.arraycopy(iyVarArr2, 0, iyVarArr2, 0 + 1, i4 + 0);
                    }
                    iyVarArr2[0] = a02;
                    i4++;
                    a02 = a02.n();
                }
                int min = Math.min(i2 - 1, i4 - 1);
                if (min >= 0) {
                    int i6 = 0;
                    while (lw.i(iyVarArr[i6], iyVarArr2[i6])) {
                        if (i6 != min) {
                            i6++;
                        }
                    }
                    return lw.m(iyVarArr[i6].o(), iyVarArr2[i6].o());
                }
                z6.m("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            case 1:
                oe0 h2 = ((uj0) obj).h();
                oe0 h3 = ((uj0) obj2).h();
                int compare = Float.compare(h2.a, h3.a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(h2.b, h3.b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(h2.d, h3.d);
                return compare3 != 0 ? compare3 : Float.compare(h2.c, h3.c);
            case 2:
                iy iyVar = (iy) obj;
                iy iyVar2 = (iy) obj2;
                int m = lw.m(iyVar2.s, iyVar.s);
                return m != 0 ? m : lw.m(iyVar.hashCode(), iyVar2.hashCode());
            case 3:
                oe0 h4 = ((uj0) obj).h();
                oe0 h5 = ((uj0) obj2).h();
                int compare4 = Float.compare(h5.c, h4.c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(h4.b, h5.b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(h4.d, h5.d);
                return compare6 != 0 ? compare6 : Float.compare(h5.a, h4.a);
            case 4:
                k90 k90Var = (k90) obj;
                k90 k90Var2 = (k90) obj2;
                int compare7 = Float.compare(((oe0) k90Var.e).b, ((oe0) k90Var2.e).b);
                return compare7 != 0 ? compare7 : Float.compare(((oe0) k90Var.e).d, ((oe0) k90Var2.e).d);
            case Gates.MAX_WINDOWS /* 5 */:
                return q3.m(Integer.valueOf(((o6) obj).b), Integer.valueOf(((o6) obj2).b));
            case 6:
                return q3.m(Integer.valueOf(((o6) obj).b), Integer.valueOf(((o6) obj2).b));
            default:
                iy iyVar3 = (iy) obj;
                iy iyVar4 = (iy) obj2;
                int m2 = lw.m(iyVar3.s, iyVar4.s);
                return m2 != 0 ? m2 : lw.m(iyVar3.hashCode(), iyVar4.hashCode());
        }
    }
}
