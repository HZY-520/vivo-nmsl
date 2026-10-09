package defpackage;

import com.vivo.cnm.lico.PhoneLayoutHook;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class mb0 implements XposedInterface.Hooker {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Class b;
    public final /* synthetic */ Method c;
    public final /* synthetic */ AccessibleObject d;

    public /* synthetic */ mb0(Class cls, Field field, Method method) {
        this.b = cls;
        this.d = field;
        this.c = method;
    }

    public final Object intercept(XposedInterface.Chain chain) {
        Object installUiScopes$lambda$30$lambda$29;
        Object installLayoutMenu$lambda$112$lambda$111;
        int i = this.a;
        Method method = this.c;
        AccessibleObject accessibleObject = this.d;
        Class cls = this.b;
        switch (i) {
            case 0:
                installUiScopes$lambda$30$lambda$29 = PhoneLayoutHook.installUiScopes$lambda$30$lambda$29(method, cls, (Method) accessibleObject, chain);
                return installUiScopes$lambda$30$lambda$29;
            default:
                installLayoutMenu$lambda$112$lambda$111 = PhoneLayoutHook.installLayoutMenu$lambda$112$lambda$111(cls, (Field) accessibleObject, method, chain);
                return installLayoutMenu$lambda$112$lambda$111;
        }
    }

    public /* synthetic */ mb0(Method method, Class cls, Method method2) {
        this.c = method;
        this.b = cls;
        this.d = method2;
    }
}
