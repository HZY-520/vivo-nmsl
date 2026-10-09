package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class d00 {
    public static final vd0 a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if ((r1 instanceof defpackage.vd0) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r1 = (defpackage.vd0) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r1 = null;
     */
    static {
        Object qf0Var;
        try {
            ClassLoader classLoader = ez.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof xi) {
                    break;
                } else {
                    i++;
                }
            }
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        vd0 vd0Var = (vd0) (qf0Var instanceof qf0 ? null : qf0Var);
        if (vd0Var == null) {
            vd0Var = new ll(new hf(13), 1);
        }
        a = vd0Var;
    }
}
