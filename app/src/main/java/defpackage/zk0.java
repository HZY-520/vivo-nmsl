package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class zk0 implements tj {
    public final bl0 e;
    public final long f;
    public final Object g;
    public final ja h;

    public zk0(bl0 bl0Var, long j, Object obj, ja jaVar) {
        this.e = bl0Var;
        this.f = j;
        this.g = obj;
        this.h = jaVar;
    }

    @Override // defpackage.tj
    public final void b() {
        bl0 bl0Var = this.e;
        synchronized (bl0Var) {
            if (this.f < bl0Var.n()) {
                return;
            }
            Object[] objArr = bl0Var.l;
            objArr.getClass();
            long j = this.f;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            lw.D(objArr, j, lw.r);
            bl0Var.i();
        }
    }
}
