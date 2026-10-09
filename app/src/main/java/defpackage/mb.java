package defpackage;

import com.vivo.cnm.lico.ClassWatch;
import com.vivo.cnm.lico.DesktopEntry;
import com.vivo.cnm.lico.LauncherEntryHook;
import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class mb implements XposedInterface.Hooker {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object intercept(XposedInterface.Chain chain) {
        Object installHook$lambda$4;
        Object install$lambda$5$lambda$3$lambda$2;
        Object install$lambda$5$lambda$4;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                installHook$lambda$4 = ClassWatch.installHook$lambda$4((XposedModule) obj, chain);
                return installHook$lambda$4;
            case 1:
                install$lambda$5$lambda$3$lambda$2 = DesktopEntry.install$lambda$5$lambda$3$lambda$2((DesktopEntry) obj, chain);
                return install$lambda$5$lambda$3$lambda$2;
            default:
                install$lambda$5$lambda$4 = LauncherEntryHook.install$lambda$5$lambda$4((LauncherEntryHook) obj, chain);
                return install$lambda$5$lambda$4;
        }
    }
}
