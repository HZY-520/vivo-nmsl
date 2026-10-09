package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class b8 implements ng, eh, Serializable {
    private final ng completion;

    public b8(ng ngVar) {
        this.completion = ngVar;
    }

    public ng create(ng ngVar) {
        ngVar.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.eh
    public eh getCallerFrame() {
        ng ngVar = this.completion;
        if (ngVar instanceof eh) {
            return (eh) ngVar;
        }
        return null;
    }

    public final ng getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        mh mhVar = (mh) getClass().getAnnotation(mh.class);
        String str2 = null;
        if (mhVar == null) {
            return null;
        }
        int v = mhVar.v();
        if (v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? mhVar.l()[i] : -1;
        v6 v6Var = lw.n;
        v6 v6Var2 = lw.o;
        if (v6Var2 == null) {
            try {
                v6 v6Var3 = new v6(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                lw.o = v6Var3;
                v6Var2 = v6Var3;
            } catch (Exception unused2) {
                lw.o = v6Var;
                v6Var2 = v6Var;
            }
        }
        if (v6Var2 != v6Var && (method = (Method) v6Var2.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) v6Var2.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) v6Var2.c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = mhVar.c();
        } else {
            str = str2 + '/' + mhVar.c();
        }
        return new StackTraceElement(str, mhVar.m(), mhVar.f(), i2);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ng
    public final void resumeWith(Object obj) {
        while (true) {
            b8 b8Var = this;
            ng ngVar = b8Var.completion;
            ngVar.getClass();
            try {
                obj = b8Var.invokeSuspend(obj);
                if (obj == dh.e) {
                    return;
                }
            } catch (Throwable th) {
                obj = new qf0(th);
            }
            b8Var.releaseIntercepted();
            if (!(ngVar instanceof b8)) {
                ngVar.resumeWith(obj);
                return;
            }
            this = ngVar;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public ng create(Object obj, ng ngVar) {
        ngVar.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
