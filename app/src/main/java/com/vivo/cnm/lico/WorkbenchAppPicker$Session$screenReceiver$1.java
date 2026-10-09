package com.vivo.cnm.lico;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vivo.cnm.lico.WorkbenchAppPicker;
import defpackage.eq;
import defpackage.fs0;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class WorkbenchAppPicker$Session$screenReceiver$1 extends BroadcastReceiver {
    final /* synthetic */ WorkbenchAppPicker.Session this$0;

    public WorkbenchAppPicker$Session$screenReceiver$1(WorkbenchAppPicker.Session session) {
        this.this$0 = session;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 onReceive$lambda$0(WorkbenchAppPicker.Session session) {
        session.close();
        return fs0.a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        WorkbenchAppPicker.generation.incrementAndGet();
        WorkbenchAppPicker workbenchAppPicker = WorkbenchAppPicker.INSTANCE;
        final WorkbenchAppPicker.Session session = this.this$0;
        workbenchAppPicker.onMain(new eq() { // from class: com.vivo.cnm.lico.h
            @Override // defpackage.eq
            public final Object b() {
                fs0 onReceive$lambda$0;
                onReceive$lambda$0 = WorkbenchAppPicker$Session$screenReceiver$1.onReceive$lambda$0(WorkbenchAppPicker.Session.this);
                return onReceive$lambda$0;
            }
        });
    }
}
