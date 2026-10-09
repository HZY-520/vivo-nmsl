package com.vivo.cnm.lico;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import defpackage.ch;
import defpackage.dh;
import defpackage.fs0;
import defpackage.go0;
import defpackage.ha;
import defpackage.ja;
import defpackage.lr0;
import defpackage.m60;
import defpackage.mh;
import defpackage.ng;
import defpackage.pq;
import defpackage.qf0;
import defpackage.rf0;
import defpackage.t30;
import defpackage.tq;
import defpackage.z6;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
@mh(c = "com.vivo.cnm.lico.StatusProbe$probe$reply$1", f = "StatusProbe.kt", l = {76}, m = "invokeSuspend")
/* loaded from: /tmp/classes.dex */
public final class StatusProbe$probe$reply$1 extends go0 implements tq {
    final /* synthetic */ Context $context;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusProbe$probe$reply$1(Context context, ng ngVar) {
        super(2, ngVar);
        this.$context = context;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        StatusProbe$probe$reply$1 statusProbe$probe$reply$1 = new StatusProbe$probe$reply$1(this.$context, ngVar);
        statusProbe$probe$reply$1.L$0 = obj;
        return statusProbe$probe$reply$1;
    }

    @Override // defpackage.tq
    public final Object invoke(ch chVar, ng ngVar) {
        return ((StatusProbe$probe$reply$1) create(chVar, ngVar)).invokeSuspend(fs0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.BroadcastReceiver, com.vivo.cnm.lico.StatusProbe$probe$reply$1$1$receiver$1] */
    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        Object qf0Var;
        final ch chVar = (ch) this.L$0;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t30.z(obj);
            return obj;
        }
        t30.z(obj);
        final Context context = this.$context;
        this.L$0 = chVar;
        this.L$1 = context;
        this.I$0 = 0;
        this.label = 1;
        final ja jaVar = new ja(1, lr0.x(this));
        jaVar.r();
        final ?? r4 = new BroadcastReceiver() { // from class: com.vivo.cnm.lico.StatusProbe$probe$reply$1$1$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                ModuleStatus status;
                Bundle bundleExtra = intent != null ? intent.getBundleExtra(StatusProbe.EXTRA_STATUS) : null;
                try {
                    context.unregisterReceiver(this);
                } catch (Throwable unused) {
                }
                if (ha.this.a()) {
                    ha haVar = ha.this;
                    status = StatusProbe.INSTANCE.toStatus(bundleExtra);
                    haVar.resumeWith(status);
                }
            }
        };
        try {
            IntentFilter intentFilter = new IntentFilter(StatusProbe.ACTION_STATUS);
            qf0Var = Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(r4, intentFilter, null, null, 2) : context.registerReceiver(r4, intentFilter, null, null, 0);
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (rf0.a(qf0Var) == null) {
            jaVar.t(new pq() { // from class: com.vivo.cnm.lico.StatusProbe$probe$reply$1$1$3
                @Override // defpackage.pq
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Throwable) obj2);
                    return fs0.a;
                }

                public final void invoke(Throwable th2) {
                    try {
                        context.unregisterReceiver(r4);
                    } catch (Throwable unused) {
                    }
                }
            });
            try {
                context.sendBroadcast(new Intent(StatusProbe.ACTION_PING).setPackage(EntryActivity.SYSTEMUI));
            } catch (Throwable unused) {
            }
        } else if (jaVar.q() instanceof m60) {
            jaVar.resumeWith(new ModuleStatus(false, 0, 3, null));
        }
        Object p = jaVar.p();
        dh dhVar = dh.e;
        return p == dhVar ? dhVar : p;
    }
}
