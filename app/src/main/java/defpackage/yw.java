package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class yw extends cx {
    public final boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(ww wwVar) {
        super(true);
        boolean z = true;
        M(wwVar);
        Unsafe unsafe = p7.a;
        long j = cx.e;
        gb gbVar = (gb) unsafe.getObjectVolatile(this, j);
        hb hbVar = gbVar instanceof hb ? (hb) gbVar : null;
        if (hbVar != null) {
            cx l = hbVar.l();
            while (!l.G()) {
                gb gbVar2 = (gb) p7.a.getObjectVolatile(l, j);
                hb hbVar2 = gbVar2 instanceof hb ? (hb) gbVar2 : null;
                if (hbVar2 != null) {
                    l = hbVar2.l();
                }
            }
            this.g = z;
        }
        z = false;
        this.g = z;
    }

    @Override // defpackage.cx
    public final boolean G() {
        return this.g;
    }

    @Override // defpackage.cx
    public final boolean H() {
        return true;
    }
}
