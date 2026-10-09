package defpackage;

import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.PhoneLayoutHook;
import com.vivo.cnm.lico.WorkbenchAppPicker;
import io.github.libxposed.api.XposedInterface;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class mr implements XposedInterface.Hooker {
    public final /* synthetic */ int a;

    public /* synthetic */ mr(int i) {
        this.a = i;
    }

    public final Object intercept(XposedInterface.Chain chain) {
        Object installVersionAttributeHook$lambda$1;
        Object hookSettingsDeviceType$lambda$29;
        Object installFeatureFlagHook$lambda$0;
        Object hookReturnTrue$lambda$8;
        Object installExitButtonRelocation$lambda$64$lambda$62$lambda$61;
        Object installLayoutMenu$lambda$83$lambda$82;
        Object installExitButtonRelocation$lambda$77$lambda$76;
        Object install$lambda$7$lambda$6;
        Object install$lambda$11$lambda$10;
        switch (this.a) {
            case 0:
                installVersionAttributeHook$lambda$1 = Gates.installVersionAttributeHook$lambda$1(chain);
                return installVersionAttributeHook$lambda$1;
            case 1:
                hookSettingsDeviceType$lambda$29 = Gates.hookSettingsDeviceType$lambda$29(chain);
                return hookSettingsDeviceType$lambda$29;
            case 2:
                installFeatureFlagHook$lambda$0 = Gates.installFeatureFlagHook$lambda$0(chain);
                return installFeatureFlagHook$lambda$0;
            case 3:
                hookReturnTrue$lambda$8 = Gates.hookReturnTrue$lambda$8(chain);
                return hookReturnTrue$lambda$8;
            case 4:
                installExitButtonRelocation$lambda$64$lambda$62$lambda$61 = PhoneLayoutHook.installExitButtonRelocation$lambda$64$lambda$62$lambda$61(chain);
                return installExitButtonRelocation$lambda$64$lambda$62$lambda$61;
            case Gates.MAX_WINDOWS /* 5 */:
                installLayoutMenu$lambda$83$lambda$82 = PhoneLayoutHook.installLayoutMenu$lambda$83$lambda$82(chain);
                return installLayoutMenu$lambda$83$lambda$82;
            case 6:
                installExitButtonRelocation$lambda$77$lambda$76 = PhoneLayoutHook.installExitButtonRelocation$lambda$77$lambda$76(chain);
                return installExitButtonRelocation$lambda$77$lambda$76;
            case 7:
                install$lambda$7$lambda$6 = WorkbenchAppPicker.install$lambda$7$lambda$6(chain);
                return install$lambda$7$lambda$6;
            default:
                install$lambda$11$lambda$10 = WorkbenchAppPicker.install$lambda$11$lambda$10(chain);
                return install$lambda$11$lambda$10;
        }
    }
}
