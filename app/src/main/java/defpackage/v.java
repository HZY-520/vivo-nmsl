package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class v extends w implements RandomAccess {
    public final w e;
    public final int f;
    public final int g;

    public v(w wVar, int i, int i2) {
        this.e = wVar;
        this.f = i;
        q3.j(i, i2, wVar.a());
        this.g = i2 - i;
    }

    @Override // defpackage.m
    public final int a() {
        return this.g;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.g;
        if (i < 0 || i >= i2) {
            z6.f(j2.i("index: ", i, ", size: ", i2));
            return null;
        }
        return this.e.get(this.f + i);
    }

    @Override // defpackage.w, java.util.List
    public final List subList(int i, int i2) {
        q3.j(i, i2, this.g);
        int i3 = this.f;
        return new v(this.e, i + i3, i3 + i2);
    }
}
