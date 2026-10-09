package defpackage;

import com.vivo.cnm.lico.FoldStateForcer;
import com.vivo.cnm.lico.PhoneLayoutHook;
import com.vivo.cnm.lico.WorkbenchAppPicker;
import io.github.libxposed.api.XposedModule;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class dp implements tq {
    public final /* synthetic */ int e;
    public final /* synthetic */ ClassLoader f;

    public /* synthetic */ dp(ClassLoader classLoader, int i) {
        this.e = i;
        this.f = classLoader;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        fs0 install$lambda$18;
        fs0 installLayoutStateLock$lambda$47;
        fs0 installExitButtonRelocation$lambda$64;
        fs0 install$lambda$7;
        int i = this.e;
        ClassLoader classLoader = this.f;
        XposedModule xposedModule = (XposedModule) obj;
        Class cls = (Class) obj2;
        switch (i) {
            case 0:
                install$lambda$18 = FoldStateForcer.install$lambda$18(classLoader, xposedModule, cls);
                return install$lambda$18;
            case 1:
                installLayoutStateLock$lambda$47 = PhoneLayoutHook.installLayoutStateLock$lambda$47(classLoader, xposedModule, cls);
                return installLayoutStateLock$lambda$47;
            case 2:
                installExitButtonRelocation$lambda$64 = PhoneLayoutHook.installExitButtonRelocation$lambda$64(classLoader, xposedModule, cls);
                return installExitButtonRelocation$lambda$64;
            default:
                install$lambda$7 = WorkbenchAppPicker.install$lambda$7(classLoader, xposedModule, cls);
                return install$lambda$7;
        }
    }
}
