package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ax extends zw {
    public final cx i;
    public final bx j;
    public final hb k;
    public final Object l;

    public ax(cx cxVar, bx bxVar, hb hbVar, Object obj) {
        this.i = cxVar;
        this.j = bxVar;
        this.k = hbVar;
        this.l = obj;
    }

    @Override // defpackage.zw
    public final boolean m() {
        return false;
    }

    @Override // defpackage.zw
    public final void n(Throwable th) {
        hb hbVar = this.k;
        hb R = cx.R(hbVar);
        cx cxVar = this.i;
        bx bxVar = this.j;
        Object obj = this.l;
        if (R == null || !cxVar.a0(bxVar, R, obj)) {
            bxVar.e.e(new b00(2), 2);
            hb R2 = cx.R(hbVar);
            if (R2 == null || !cxVar.a0(bxVar, R2, obj)) {
                cxVar.u(cxVar.E(bxVar, obj));
            }
        }
    }
}
