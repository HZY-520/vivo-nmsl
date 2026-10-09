package com.vivo.cnm.lico;

import com.vivo.cnm.lico.WorkbenchAppPicker;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ WorkbenchAppPicker.Session f;

    public /* synthetic */ d(WorkbenchAppPicker.Session session, int i) {
        this.e = i;
        this.f = session;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        WorkbenchAppPicker.Session session = this.f;
        switch (i) {
            case 0:
                WorkbenchAppPicker.Session.show$lambda$20$lambda$19$lambda$18(session);
                break;
            case 1:
                WorkbenchAppPicker.Session.show$lambda$9$lambda$8$lambda$7$lambda$6(session);
                break;
            default:
                WorkbenchAppPicker.Session.show$lambda$20(session);
                break;
        }
    }
}
