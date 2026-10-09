package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/classes.dex */
public abstract class nk0 extends ok0 {
    public static List s(lk0 lk0Var) {
        Iterator it = lk0Var.iterator();
        if (!it.hasNext()) {
            return um.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return kw.B(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
