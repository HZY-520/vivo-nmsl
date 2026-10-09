package com.vivo.cnm.lico;

import defpackage.mh;
import defpackage.ng;
import defpackage.og;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
@mh(c = "com.vivo.cnm.lico.StatusProbe", f = "StatusProbe.kt", l = {38}, m = "probe")
/* loaded from: /tmp/classes.dex */
public final class StatusProbe$probe$1 extends og {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StatusProbe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusProbe$probe$1(StatusProbe statusProbe, ng ngVar) {
        super(ngVar);
        this.this$0 = statusProbe;
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.probe(null, 0L, this);
    }
}
