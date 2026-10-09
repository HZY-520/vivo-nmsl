package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class b70 {
    public final /* synthetic */ Object a;

    public /* synthetic */ b70(Object obj) {
        this.a = obj;
    }

    public void a() {
        tq tqVar = (tq) this.a;
        synchronized (xl0.c) {
            List list = xl0.h;
            list.getClass();
            ArrayList arrayList = new ArrayList(bc.V(list));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && lw.i(obj, tqVar)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            xl0.h = arrayList;
        }
    }
}
