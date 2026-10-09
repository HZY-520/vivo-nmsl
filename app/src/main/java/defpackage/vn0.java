package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vn0 extends bl0 implements an0 {
    @Override // defpackage.an0
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.l;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.m + ((int) ((n() + this.o) - this.m))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void v(int i) {
        synchronized (this) {
            Object[] objArr = this.l;
            objArr.getClass();
            p(Integer.valueOf(((Number) objArr[((int) ((this.m + ((int) ((n() + this.o) - this.m))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
