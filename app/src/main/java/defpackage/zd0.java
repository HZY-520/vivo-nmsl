package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class zd0 {
    public final ArrayList a = new ArrayList();

    public zd0(Object obj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i, ir irVar, Object obj) {
        ArrayList arrayList = irVar.a;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj2 = arrayList.get(i2);
                if (!(obj2 instanceof er)) {
                    if (!(obj2 instanceof ir)) {
                        z6.e(obj2, "Unexpected child source info ");
                        break;
                    }
                    if (a(i, (ir) obj2, obj)) {
                        b(0, irVar, obj2);
                        return true;
                    }
                } else if (obj2 == obj) {
                    b(0, irVar, obj2);
                    return true;
                }
                i2++;
            }
        } else {
            b(i, irVar, null);
            return true;
        }
    }

    public final void b(int i, ir irVar, Object obj) {
        this.a.add(new ke(i, null, null));
    }

    public final void c(int i, Object obj, ir irVar, Object obj2) {
        if (lw.i(obj, re.a)) {
            b(i, irVar, null);
        }
    }
}
