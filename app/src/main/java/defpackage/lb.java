package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class lb implements kb {
    public static final Map b;
    public final Class a;

    static {
        Map map;
        List C = kw.C(eq.class, pq.class, tq.class, uq.class, vq.class, wq.class, xq.class, yq.class, zq.class, ar.class, fq.class, gq.class, hq.class, iq.class, jq.class, kq.class, lq.class, mq.class, nq.class, oq.class, qq.class, rq.class, sq.class);
        ArrayList arrayList = new ArrayList(bc.V(C));
        int i = 0;
        int i2 = 0;
        for (Object obj : C) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new k90((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        int size = arrayList.size();
        if (size == 0) {
            map = vm.e;
        } else if (size != 1) {
            map = new LinkedHashMap(lr0.D(arrayList.size()));
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                k90 k90Var = (k90) obj2;
                map.put(k90Var.e, k90Var.f);
            }
        } else {
            k90 k90Var2 = (k90) arrayList.get(0);
            k90Var2.getClass();
            map = Collections.singletonMap(k90Var2.e, k90Var2.f);
            map.getClass();
        }
        b = map;
    }

    public lb(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    public final String a() {
        String k;
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String k2 = dx0.k(cls.getName());
            return k2 == null ? cls.getCanonicalName() : k2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (k = dx0.k(componentType.getName())) != null) {
            str = k.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final String b() {
        String E;
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String E2 = dx0.E(cls.getName());
                return E2 == null ? cls.getSimpleName() : E2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (E = dx0.E(componentType.getName())) != null) {
                str = E.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return ln0.K(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int H = ln0.H(simpleName, '$', 0, 6);
            return H == -1 ? simpleName : simpleName.substring(H + 1, simpleName.length());
        }
        return ln0.K(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lb) && kw.u(this).equals(kw.u((lb) obj));
    }

    public final int hashCode() {
        return kw.u(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
