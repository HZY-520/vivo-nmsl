package defpackage;

import com.vivo.cnm.lico.ModuleStatus;
import com.vivo.cnm.lico.ui.HomeScreenKt;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class ft implements tq {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ft(int i, int i2, Object obj) {
        this.e = i2;
        this.g = obj;
        this.f = i;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        fs0 ShortcutCard$lambda$22;
        fs0 StatusCard$lambda$11;
        switch (this.e) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ShortcutCard$lambda$22 = HomeScreenKt.ShortcutCard$lambda$22((eq) this.g, this.f, (se) obj, intValue);
                return ShortcutCard$lambda$22;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                StatusCard$lambda$11 = HomeScreenKt.StatusCard$lambda$11((ModuleStatus) this.g, this.f, (se) obj, intValue2);
                return StatusCard$lambda$11;
        }
    }
}
