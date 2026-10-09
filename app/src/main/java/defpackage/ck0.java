package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ck0 implements Comparator {
    public final /* synthetic */ int e;
    public final /* synthetic */ Comparator f;

    public /* synthetic */ ck0(Comparator comparator, int i) {
        this.e = i;
        this.f = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.e;
        Comparator comparator = this.f;
        switch (i) {
            case 0:
                int compare = comparator.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                iy iyVar = ((uj0) obj).c;
                iy iyVar2 = ((uj0) obj2).c;
                return iyVar.r() == iyVar2.r() ? lw.m(iyVar.o(), iyVar2.o()) : Float.compare(iyVar.r(), iyVar2.r());
            default:
                int compare2 = ((ck0) comparator).compare(obj, obj2);
                return compare2 != 0 ? compare2 : q3.m(Integer.valueOf(((uj0) obj).f), Integer.valueOf(((uj0) obj2).f));
        }
    }
}
