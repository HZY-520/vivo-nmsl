package defpackage;

import com.vivo.cnm.lico.PhoneLayoutHook;
import com.vivo.cnm.lico.WorkbenchAppPicker;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class vb0 implements XposedInterface.Hooker {
    public final /* synthetic */ int a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vb0(Class cls, Object obj, int i) {
        this.a = i;
        this.b = cls;
        this.c = obj;
    }

    public final Object intercept(XposedInterface.Chain chain) {
        Object installLayoutMenu$lambda$112$lambda$103;
        Object install$lambda$7$lambda$4;
        int i = this.a;
        Object obj = this.c;
        Class cls = this.b;
        switch (i) {
            case 0:
                installLayoutMenu$lambda$112$lambda$103 = PhoneLayoutHook.installLayoutMenu$lambda$112$lambda$103(cls, (Method) obj, chain);
                return installLayoutMenu$lambda$112$lambda$103;
            default:
                install$lambda$7$lambda$4 = WorkbenchAppPicker.install$lambda$7$lambda$4(cls, (ClassLoader) obj, chain);
                return install$lambda$7$lambda$4;
        }
    }
}
