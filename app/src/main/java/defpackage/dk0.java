package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class dk0 {
    public static final Comparator[] a;
    public static final ei0 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        int i2 = 0;
        while (i2 < 2) {
            comparatorArr[i2] = new ck0(new ck0(i2 == 0 ? zo.i : zo.g, i), 1);
            i2++;
        }
        a = comparatorArr;
        b = new ei0(17);
    }

    public static final void a(uj0 uj0Var, ArrayList arrayList, l lVar, l lVar2, y30 y30Var) {
        List i;
        List i2;
        qj0 qj0Var = uj0Var.d;
        Object g = qj0Var.e.g(yj0.n);
        if (g == null) {
            g = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g).booleanValue();
        if ((booleanValue || ((Boolean) lVar2.invoke(uj0Var)).booleanValue()) && ((Boolean) lVar.invoke(uj0Var)).booleanValue()) {
            arrayList.add(uj0Var);
        }
        if (booleanValue) {
            int i3 = uj0Var.f;
            i2 = uj0Var.i((r3 & 1) != 0 ? !uj0Var.b : false, (r3 & 2) == 0);
            y30Var.h(i3, b(uj0Var, lVar, lVar2, i2));
        } else {
            i = uj0Var.i((r3 & 1) != 0 ? !uj0Var.b : false, (r3 & 2) == 0);
            int size = i.size();
            for (int i4 = 0; i4 < size; i4++) {
                a((uj0) i.get(i4), arrayList, lVar, lVar2, y30Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef A[LOOP:1: B:11:0x0046->B:29:0x00ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4 A[EDGE_INSN: B:30:0x00f4->B:37:0x00f4 BREAK  A[LOOP:1: B:11:0x0046->B:29:0x00ef], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList b(uj0 uj0Var, l lVar, l lVar2, List list) {
        y30 y30Var = wv.a;
        y30 y30Var2 = new y30();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((uj0) list.get(i), arrayList, lVar, lVar2, y30Var2);
        }
        int i2 = 1;
        char c = uj0Var.c.B == xx.f ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i3 = 0;
            while (true) {
                uj0 uj0Var2 = (uj0) arrayList.get(i3);
                if (i3 != 0) {
                    float f = uj0Var2.h().b;
                    float f2 = uj0Var2.h().d;
                    int i4 = f >= f2 ? i2 : 0;
                    int size3 = arrayList2.size() - i2;
                    if (size3 >= 0) {
                        int i5 = 0;
                        while (true) {
                            oe0 oe0Var = (oe0) ((k90) arrayList2.get(i5)).e;
                            float f3 = oe0Var.b;
                            float f4 = oe0Var.d;
                            boolean z = f3 >= f4;
                            if (i4 == 0 && !z && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i5, new k90(new oe0(Math.max(oe0Var.a, 0.0f), Math.max(oe0Var.b, f), Math.min(oe0Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((k90) arrayList2.get(i5)).f));
                                ((List) ((k90) arrayList2.get(i5)).f).add(uj0Var2);
                                break;
                            }
                            if (i5 == size3) {
                                break;
                            }
                            i5++;
                        }
                        if (i3 != size2) {
                            break;
                        }
                        i3++;
                        i2 = 1;
                    }
                }
                arrayList2.add(new k90(uj0Var2.h(), new ArrayList(new f7(new uj0[]{uj0Var2}, true))));
                if (i3 != size2) {
                }
            }
        }
        ec.W(arrayList2, zo.j);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i6 = 0; i6 < size4; i6++) {
            k90 k90Var = (k90) arrayList2.get(i6);
            ec.W((List) k90Var.f, comparator);
            arrayList3.addAll((Collection) k90Var.f);
        }
        ec.W(arrayList3, new mp(4));
        int i7 = 0;
        while (i7 <= arrayList3.size() - 1) {
            List list2 = (List) y30Var2.b(((uj0) arrayList3.get(i7)).f);
            if (list2 != null) {
                if (((Boolean) lVar2.invoke(arrayList3.get(i7))).booleanValue()) {
                    i7++;
                } else {
                    arrayList3.remove(i7);
                }
                arrayList3.addAll(i7, list2);
                i7 += list2.size();
            } else {
                i7++;
            }
        }
        return arrayList3;
    }
}
