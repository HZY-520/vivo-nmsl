package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ih0 implements hh0 {
    public final l0 a;
    public final k40 b;
    public k40 c;

    public ih0(LinkedHashMap linkedHashMap, l0 l0Var) {
        k40 k40Var;
        this.a = l0Var;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            k40Var = null;
        } else {
            k40Var = new k40(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                k40Var.l(entry.getKey(), entry.getValue());
            }
        }
        this.b = k40Var;
    }

    @Override // defpackage.hh0
    public final v6 a(String str, eq eqVar) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!t10.z(str.charAt(i))) {
                k40 k40Var = this.c;
                if (k40Var == null) {
                    long[] jArr = gi0.a;
                    k40Var = new k40();
                    this.c = k40Var;
                }
                Object g = k40Var.g(str);
                if (g == null) {
                    g = new ArrayList();
                    k40Var.l(str, g);
                }
                ((List) g).add(eqVar);
                return new v6(k40Var, str, eqVar);
            }
        }
        z6.l("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.hh0
    public final boolean b(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    @Override // defpackage.hh0
    public final Object c(String str) {
        k40 k40Var = this.b;
        List list = k40Var != null ? (List) k40Var.j(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && k40Var != null) {
            List subList = list.subList(1, list.size());
            int f = k40Var.f(str);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = k40Var.c;
            Object obj = objArr[f];
            k40Var.b[f] = str;
            objArr[f] = subList;
        }
        return list.get(0);
    }
}
