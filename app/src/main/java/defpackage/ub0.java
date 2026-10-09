package defpackage;

import com.vivo.cnm.lico.PhoneLayoutHook;
import io.github.libxposed.api.XposedInterface;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class ub0 implements XposedInterface.Hooker {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ ub0(tq tqVar, Method method, AtomicInteger atomicInteger, String str) {
        this.c = tqVar;
        this.b = method;
        this.d = atomicInteger;
        this.e = str;
    }

    public final Object intercept(XposedInterface.Chain chain) {
        Object installLayoutMenu$lambda$112$lambda$99;
        Object install$lambda$20$lambda$19$replace$lambda$9;
        int i = this.a;
        Serializable serializable = this.e;
        Serializable serializable2 = this.d;
        Method method = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                installLayoutMenu$lambda$112$lambda$99 = PhoneLayoutHook.installLayoutMenu$lambda$112$lambda$99((Field) obj, (Class) serializable2, (Class) serializable, method, chain);
                return installLayoutMenu$lambda$112$lambda$99;
            default:
                install$lambda$20$lambda$19$replace$lambda$9 = PhoneLayoutHook.install$lambda$20$lambda$19$replace$lambda$9((tq) obj, method, (AtomicInteger) serializable2, (String) serializable, chain);
                return install$lambda$20$lambda$19$replace$lambda$9;
        }
    }

    public /* synthetic */ ub0(Field field, Class cls, Class cls2, Method method) {
        this.c = field;
        this.d = cls;
        this.e = cls2;
        this.b = method;
    }
}
