package defpackage;

import com.vivo.cnm.lico.GestureEnterFallback;
import com.vivo.cnm.lico.PhoneLayoutHook;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class ur implements XposedInterface.Hooker {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Class b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ AccessibleObject d;
    public final /* synthetic */ AnnotatedElement e;
    public final /* synthetic */ AnnotatedElement f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ur(PhoneLayoutHook phoneLayoutHook, Class cls, Method method, Class cls2, Class cls3, ClassLoader classLoader) {
        this.c = phoneLayoutHook;
        this.b = cls;
        this.d = method;
        this.e = cls2;
        this.f = cls3;
        this.g = classLoader;
    }

    public final Object intercept(XposedInterface.Chain chain) {
        Object install$lambda$13$lambda$12;
        Object installTopBottomStatePositionReapply$lambda$38$lambda$36$lambda$35;
        int i = this.a;
        Object obj = this.g;
        AnnotatedElement annotatedElement = this.f;
        AnnotatedElement annotatedElement2 = this.e;
        AccessibleObject accessibleObject = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                install$lambda$13$lambda$12 = GestureEnterFallback.install$lambda$13$lambda$12(this.b, (Field) obj2, (Field) accessibleObject, (Field) annotatedElement2, (Field) annotatedElement, (Field) obj, chain);
                return install$lambda$13$lambda$12;
            default:
                installTopBottomStatePositionReapply$lambda$38$lambda$36$lambda$35 = PhoneLayoutHook.installTopBottomStatePositionReapply$lambda$38$lambda$36$lambda$35((PhoneLayoutHook) obj2, this.b, (Method) accessibleObject, (Class) annotatedElement2, (Class) annotatedElement, (ClassLoader) obj, chain);
                return installTopBottomStatePositionReapply$lambda$38$lambda$36$lambda$35;
        }
    }

    public /* synthetic */ ur(Class cls, Field field, Field field2, Field field3, Field field4, Field field5) {
        this.b = cls;
        this.c = field;
        this.d = field2;
        this.e = field3;
        this.f = field4;
        this.g = field5;
    }
}
