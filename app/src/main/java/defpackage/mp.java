package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class mp implements Comparator {
    public final /* synthetic */ int e;

    public /* synthetic */ mp(int i) {
        this.e = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 1:
                return lw.m(((rw) obj).b, ((rw) obj2).b);
            case 2:
                aw awVar = (aw) obj;
                aw awVar2 = (aw) obj2;
                return (awVar.f - awVar.e) - (awVar2.f - awVar2.e);
            case 3:
                iy iyVar = (iy) obj;
                iy iyVar2 = (iy) obj2;
                float f = iyVar.I.o.H;
                float f2 = iyVar2.I.o.H;
                return f == f2 ? lw.m(iyVar.o(), iyVar2.o()) : Float.compare(f, f2);
            default:
                return ((Number) dk0.b.invoke(obj, obj2)).intValue();
        }
    }
}
