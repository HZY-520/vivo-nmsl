package defpackage;

import com.vivo.cnm.lico.PhoneLayoutHook;
import io.github.libxposed.api.XposedInterface;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class xb0 implements XposedInterface.Hooker {
    public final /* synthetic */ int a;
    public final /* synthetic */ Class b;

    public /* synthetic */ xb0(Class cls, int i) {
        this.a = i;
        this.b = cls;
    }

    public final Object intercept(XposedInterface.Chain chain) {
        Object installExitButtonRelocation$lambda$77$lambda$70;
        Object installExitButtonRelocation$lambda$77$lambda$72;
        Object installExitButtonRelocation$lambda$77$lambda$74;
        Object installUiScopes$lambda$25$lambda$24;
        int i = this.a;
        Class cls = this.b;
        switch (i) {
            case 0:
                installExitButtonRelocation$lambda$77$lambda$70 = PhoneLayoutHook.installExitButtonRelocation$lambda$77$lambda$70(cls, chain);
                return installExitButtonRelocation$lambda$77$lambda$70;
            case 1:
                installExitButtonRelocation$lambda$77$lambda$72 = PhoneLayoutHook.installExitButtonRelocation$lambda$77$lambda$72(cls, chain);
                return installExitButtonRelocation$lambda$77$lambda$72;
            case 2:
                installExitButtonRelocation$lambda$77$lambda$74 = PhoneLayoutHook.installExitButtonRelocation$lambda$77$lambda$74(cls, chain);
                return installExitButtonRelocation$lambda$77$lambda$74;
            default:
                installUiScopes$lambda$25$lambda$24 = PhoneLayoutHook.installUiScopes$lambda$25$lambda$24(cls, chain);
                return installUiScopes$lambda$25$lambda$24;
        }
    }
}
