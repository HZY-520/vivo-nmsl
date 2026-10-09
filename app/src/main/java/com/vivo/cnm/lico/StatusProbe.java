package com.vivo.cnm.lico;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import defpackage.dh;
import defpackage.j20;
import defpackage.ng;
import defpackage.t30;
import defpackage.z6;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class StatusProbe {
    public static final int $stable = 0;
    public static final String ACTION_PING = "com.vivo.cnm.lico.action.PING";
    public static final String ACTION_STATUS = "com.vivo.cnm.lico.action.STATUS";
    public static final String EXTRA_STATUS = "status";
    public static final StatusProbe INSTANCE = new StatusProbe();
    private static final String SYSTEMUI = "com.android.systemui";

    private StatusProbe() {
    }

    public static /* synthetic */ Object probe$default(StatusProbe statusProbe, Context context, long j, ng ngVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 1200;
        }
        return statusProbe.probe(context, j, ngVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModuleStatus toStatus(Bundle bundle) {
        return new ModuleStatus(true, bundle != null ? bundle.getInt("pid", -1) : -1);
    }

    public final String deviceSummary() {
        return Build.MODEL + " · Android " + Build.VERSION.RELEASE + " (API " + Build.VERSION.SDK_INT + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object probe(Context context, long j, ng ngVar) {
        StatusProbe$probe$1 statusProbe$probe$1;
        int i;
        if (ngVar instanceof StatusProbe$probe$1) {
            statusProbe$probe$1 = (StatusProbe$probe$1) ngVar;
            int i2 = statusProbe$probe$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                statusProbe$probe$1.label = i2 - Integer.MIN_VALUE;
                Object obj = statusProbe$probe$1.result;
                i = statusProbe$probe$1.label;
                if (i != 0) {
                    t30.z(obj);
                    StatusProbe$probe$reply$1 statusProbe$probe$reply$1 = new StatusProbe$probe$reply$1(context, null);
                    statusProbe$probe$1.L$0 = null;
                    statusProbe$probe$1.J$0 = j;
                    statusProbe$probe$1.label = 1;
                    obj = j20.r(j, statusProbe$probe$reply$1, statusProbe$probe$1);
                    dh dhVar = dh.e;
                    if (obj == dhVar) {
                        return dhVar;
                    }
                } else {
                    if (i != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t30.z(obj);
                }
                ModuleStatus moduleStatus = (ModuleStatus) obj;
                return moduleStatus != null ? new ModuleStatus(false, 0, 3, null) : moduleStatus;
            }
        }
        statusProbe$probe$1 = new StatusProbe$probe$1(this, ngVar);
        Object obj2 = statusProbe$probe$1.result;
        i = statusProbe$probe$1.label;
        if (i != 0) {
        }
        ModuleStatus moduleStatus2 = (ModuleStatus) obj2;
        if (moduleStatus2 != null) {
        }
    }
}
