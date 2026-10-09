package defpackage;

import com.vivo.cnm.lico.WorkbenchAppPicker;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class ze implements eq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ze(af afVar, Object obj) {
        this.e = 0;
        this.f = obj;
    }

    @Override // defpackage.eq
    public final Object b() {
        fs0 install$lambda$11$lambda$10$lambda$9;
        fs0 closeFor$lambda$12;
        switch (this.e) {
            case 0:
                throw null;
            case 1:
                install$lambda$11$lambda$10$lambda$9 = WorkbenchAppPicker.install$lambda$11$lambda$10$lambda$9(this.f);
                return install$lambda$11$lambda$10$lambda$9;
            default:
                closeFor$lambda$12 = WorkbenchAppPicker.closeFor$lambda$12(this.f);
                return closeFor$lambda$12;
        }
    }

    public /* synthetic */ ze(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }
}
