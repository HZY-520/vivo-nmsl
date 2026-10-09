package com.vivo.cnm.lico;

import com.vivo.cnm.lico.ClassWatch;
import defpackage.ac;
import defpackage.fs0;
import defpackage.l0;
import defpackage.mb;
import defpackage.pq;
import defpackage.qf0;
import defpackage.rf0;
import defpackage.tq;
import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ClassWatch {
    private static final String TAG = "ClassWatch";
    private static volatile boolean hookInstalled;
    public static final ClassWatch INSTANCE = new ClassWatch();
    private static final ConcurrentHashMap<String, List<tq>> actions = new ConcurrentHashMap<>();
    private static final Set<tq> firedActions = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final int $stable = 8;

    private ClassWatch() {
    }

    private final void fire(XposedModule xposedModule, String str, Class<?> cls) {
        List<tq> list = actions.get(str);
        if (list != null) {
            for (tq tqVar : list) {
                if (firedActions.add(tqVar)) {
                    INSTANCE.run(xposedModule, str, cls, tqVar);
                }
            }
        }
    }

    private final void installHook(XposedModule xposedModule) {
        if (hookInstalled) {
            return;
        }
        hookInstalled = true;
        try {
            xposedModule.hook(Class.forName("java.lang.ClassLoader").getDeclaredMethod("loadClass", String.class, Boolean.TYPE)).setId("classwatch_loadClass").intercept(new mb(0, xposedModule));
            MLog.INSTANCE.i(TAG, "ClassLoader.loadClass 观察器已挂（目标 " + actions.size() + " 个）");
        } catch (Throwable th) {
            MLog.INSTANCE.e(TAG, "挂 ClassLoader.loadClass 失败", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object installHook$lambda$4(XposedModule xposedModule, XposedInterface.Chain chain) {
        chain.getClass();
        List args = chain.getArgs();
        args.getClass();
        Object b0 = ac.b0(0, args);
        String str = b0 instanceof String ? (String) b0 : null;
        Object proceed = chain.proceed();
        if (str != null && actions.containsKey(str)) {
            Class<?> cls = proceed instanceof Class ? (Class) proceed : null;
            if (cls != null) {
                INSTANCE.fire(xposedModule, str, cls);
            }
        }
        return proceed;
    }

    private final void run(XposedModule xposedModule, String str, Class<?> cls, tq tqVar) {
        Object qf0Var;
        try {
            MLog mLog = MLog.INSTANCE;
            ClassLoader classLoader = cls.getClassLoader();
            mLog.i(TAG, str + " 已加载（loader=" + (classLoader != null ? classLoader.getClass().getSimpleName() : null) + "），执行动作");
            tqVar.invoke(xposedModule, cls);
            qf0Var = fs0.a;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, str + " 处理失败", a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List watch$lambda$0(String str) {
        str.getClass();
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List watch$lambda$1(pq pqVar, Object obj) {
        return (List) pqVar.invoke(obj);
    }

    public final void watch(XposedModule xposedModule, ClassLoader classLoader, String str, tq tqVar) {
        Object qf0Var;
        xposedModule.getClass();
        classLoader.getClass();
        str.getClass();
        tqVar.getClass();
        ConcurrentHashMap<String, List<tq>> concurrentHashMap = actions;
        final l0 l0Var = new l0(13, (byte) 0);
        concurrentHashMap.computeIfAbsent(str, new Function() { // from class: nb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List watch$lambda$1;
                watch$lambda$1 = ClassWatch.watch$lambda$1(l0.this, obj);
                return watch$lambda$1;
            }
        }).add(tqVar);
        try {
            qf0Var = Class.forName(str, false, classLoader);
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (qf0Var instanceof qf0) {
            qf0Var = null;
        }
        Class<?> cls = (Class) qf0Var;
        if (cls == null) {
            MLog.INSTANCE.i(TAG, str.concat(" 默认加载器不可见，挂 loadClass 观察器"));
            installHook(xposedModule);
        } else if (firedActions.add(tqVar)) {
            run(xposedModule, str, cls, tqVar);
        }
    }
}
