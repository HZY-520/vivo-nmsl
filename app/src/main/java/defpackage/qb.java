package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class qb {
    public static final qb c = new qb();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, pb pbVar, xy xyVar, Class cls) {
        xy xyVar2 = (xy) hashMap.get(pbVar);
        if (xyVar2 == null || xyVar == xyVar2) {
            if (xyVar2 == null) {
                hashMap.put(pbVar, xyVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + pbVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + xyVar2 + ", new value " + xyVar);
    }

    public final ob a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            ob obVar = (ob) hashMap2.get(superclass);
            if (obVar == null) {
                obVar = a(superclass, null);
            }
            hashMap.putAll(obVar.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            ob obVar2 = (ob) hashMap2.get(cls2);
            if (obVar2 == null) {
                obVar2 = a(cls2, null);
            }
            for (Map.Entry entry : obVar2.b.entrySet()) {
                b(hashMap, (pb) entry.getKey(), (xy) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            f70 f70Var = (f70) method.getAnnotation(f70.class);
            if (f70Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!ez.class.isAssignableFrom(parameterTypes[0])) {
                        z6.l("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                xy value = f70Var.value();
                if (parameterTypes.length > 1) {
                    if (!xy.class.isAssignableFrom(parameterTypes[1])) {
                        z6.l("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != xy.ON_ANY) {
                        z6.l("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    z6.l("cannot have more than 2 params");
                    return null;
                }
                b(hashMap, new pb(i, method), value, cls);
                z = true;
            }
        }
        ob obVar3 = new ob(hashMap);
        hashMap2.put(cls, obVar3);
        this.b.put(cls, Boolean.valueOf(z));
        return obVar3;
    }
}
