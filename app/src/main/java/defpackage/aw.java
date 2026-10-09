package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class aw extends yv {
    public static final aw h = new aw(1, 0, 1);

    @Override // defpackage.yv
    public final boolean equals(Object obj) {
        if (!(obj instanceof aw)) {
            return false;
        }
        if (isEmpty() && ((aw) obj).isEmpty()) {
            return true;
        }
        aw awVar = (aw) obj;
        return this.e == awVar.e && this.f == awVar.f;
    }

    @Override // defpackage.yv
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.e * 31) + this.f;
    }

    @Override // defpackage.yv
    public final boolean isEmpty() {
        return this.e > this.f;
    }

    @Override // defpackage.yv
    public final String toString() {
        return this.e + ".." + this.f;
    }
}
