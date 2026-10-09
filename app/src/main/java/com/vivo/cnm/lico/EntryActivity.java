package com.vivo.cnm.lico;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import defpackage.ph;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class EntryActivity extends Activity {
    public static final String ACTION_ENTER_WORKBENCH = "com.vivo.cnm.lico.action.ENTER_WORKBENCH";
    public static final String SYSTEMUI = "com.android.systemui";
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            sendBroadcast(new Intent(ACTION_ENTER_WORKBENCH).setPackage(SYSTEMUI));
        } catch (Throwable unused) {
        }
        finish();
    }

    /* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
    public static final class Companion {
        public /* synthetic */ Companion(ph phVar) {
            this();
        }

        private Companion() {
        }
    }
}
