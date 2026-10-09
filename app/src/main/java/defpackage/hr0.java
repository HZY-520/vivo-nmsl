package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class hr0 extends gr0 {
    public final /* synthetic */ int h;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                int i = this.g;
                this.g = i + 2;
                Object[] objArr = this.e;
                return new p10(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.g;
                this.g = i2 + 2;
                return this.e[i2];
            default:
                int i3 = this.g;
                this.g = i3 + 2;
                return this.e[i3 + 1];
        }
    }
}
