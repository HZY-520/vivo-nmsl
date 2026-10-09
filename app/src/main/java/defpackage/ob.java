package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ob {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public ob(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            xy xyVar = (xy) entry.getValue();
            List list = (List) this.a.get(xyVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(xyVar, list);
            }
            list.add((pb) entry.getKey());
        }
    }

    public static void a(List list, ez ezVar, xy xyVar, dz dzVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                pb pbVar = (pb) list.get(size);
                Method method = pbVar.b;
                try {
                    int i = pbVar.a;
                    if (i == 0) {
                        method.invoke(dzVar, null);
                    } else if (i == 1) {
                        method.invoke(dzVar, ezVar);
                    } else if (i == 2) {
                        method.invoke(dzVar, ezVar, xyVar);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
