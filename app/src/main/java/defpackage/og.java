package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class og extends b8 {
    private final tg _context;
    private transient ng intercepted;

    public og(ng ngVar) {
        this(ngVar, ngVar != null ? ngVar.getContext() : null);
    }

    @Override // defpackage.ng
    public tg getContext() {
        tg tgVar = this._context;
        tgVar.getClass();
        return tgVar;
    }

    public final ng intercepted() {
        ng ngVar = this.intercepted;
        if (ngVar != null) {
            return ngVar;
        }
        vg vgVar = (vg) getContext().j(b2.D);
        ng ljVar = vgVar != null ? new lj(vgVar, this) : this;
        this.intercepted = ljVar;
        return ljVar;
    }

    @Override // defpackage.b8
    public void releaseIntercepted() {
        Unsafe unsafe;
        long j;
        ng ngVar = this.intercepted;
        if (ngVar != null && ngVar != this) {
            rg j2 = getContext().j(b2.D);
            j2.getClass();
            lj ljVar = (lj) ngVar;
            do {
                unsafe = p7.a;
                j = lj.l;
            } while (unsafe.getObjectVolatile(ljVar, j) == dx0.d);
            Object objectVolatile = unsafe.getObjectVolatile(ljVar, j);
            ja jaVar = objectVolatile instanceof ja ? (ja) objectVolatile : null;
            if (jaVar != null) {
                jaVar.n();
            }
        }
        this.intercepted = gd.f;
    }

    public og(ng ngVar, tg tgVar) {
        super(ngVar);
        this._context = tgVar;
    }
}
