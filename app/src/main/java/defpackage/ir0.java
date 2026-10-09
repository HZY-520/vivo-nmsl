package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ir0 extends gr0 {
    public final cb0 h;

    public ir0(cb0 cb0Var) {
        this.h = cb0Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.g;
        this.g = i + 2;
        Object[] objArr = this.e;
        return new f40(this.h, objArr[i], objArr[i + 1]);
    }
}
