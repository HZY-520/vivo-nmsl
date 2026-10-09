package com.vivo.cnm.lico;

import android.content.Context;
import defpackage.ch;
import defpackage.dh;
import defpackage.fs0;
import defpackage.go0;
import defpackage.mh;
import defpackage.ng;
import defpackage.p40;
import defpackage.t30;
import defpackage.tq;
import defpackage.z6;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
@mh(c = "com.vivo.cnm.lico.MainActivityKt$HomeRoute$1$1", f = "MainActivity.kt", l = {60}, m = "invokeSuspend")
/* loaded from: /tmp/classes.dex */
public final class MainActivityKt$HomeRoute$1$1 extends go0 implements tq {
    final /* synthetic */ Context $context;
    final /* synthetic */ p40 $status$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityKt$HomeRoute$1$1(Context context, p40 p40Var, ng ngVar) {
        super(2, ngVar);
        this.$context = context;
        this.$status$delegate = p40Var;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        return new MainActivityKt$HomeRoute$1$1(this.$context, this.$status$delegate, ngVar);
    }

    @Override // defpackage.tq
    public final Object invoke(ch chVar, ng ngVar) {
        return ((MainActivityKt$HomeRoute$1$1) create(chVar, ngVar)).invokeSuspend(fs0.a);
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        p40 p40Var;
        int i = this.label;
        if (i == 0) {
            t30.z(obj);
            p40 p40Var2 = this.$status$delegate;
            StatusProbe statusProbe = StatusProbe.INSTANCE;
            Context context = this.$context;
            this.L$0 = p40Var2;
            this.label = 1;
            Object probe$default = StatusProbe.probe$default(statusProbe, context, 0L, this, 2, null);
            dh dhVar = dh.e;
            if (probe$default == dhVar) {
                return dhVar;
            }
            obj = probe$default;
            p40Var = p40Var2;
        } else {
            if (i != 1) {
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p40Var = (p40) this.L$0;
            t30.z(obj);
        }
        p40Var.setValue((ModuleStatus) obj);
        return fs0.a;
    }
}
