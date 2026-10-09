package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class vg extends r implements rg {
    public static final ug f = new ug(b2.D, new l0(17, 0));

    public vg() {
        super(b2.D);
    }

    public abstract void h(tg tgVar, Runnable runnable);

    public boolean i(tg tgVar) {
        return !(this instanceof bs0);
    }

    @Override // defpackage.r, defpackage.tg
    public final rg j(sg sgVar) {
        rg rgVar;
        sgVar.getClass();
        if (sgVar instanceof ug) {
            ug ugVar = (ug) sgVar;
            sg sgVar2 = this.e;
            if ((sgVar2 == ugVar || ugVar.f == sgVar2) && (rgVar = (rg) ugVar.e.invoke(this)) != null) {
                return rgVar;
            }
        } else if (b2.D == sgVar) {
            return this;
        }
        return null;
    }

    public vg n(int i) {
        q3.i(i);
        return new lz(this, i);
    }

    @Override // defpackage.r, defpackage.tg
    public final tg q(sg sgVar) {
        sgVar.getClass();
        if (sgVar instanceof ug) {
            ug ugVar = (ug) sgVar;
            sg sgVar2 = this.e;
            if (sgVar2 != ugVar && ugVar.f != sgVar2) {
                return this;
            }
            if (((rg) ugVar.e.invoke(this)) == null) {
                return this;
            }
        } else if (b2.D != sgVar) {
            return this;
        }
        return sm.e;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + nh.y(this);
    }
}
