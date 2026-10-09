package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ml0 implements Iterable, fx {
    public final ll0 e;
    public final int f;
    public final int g;

    public ml0(ll0 ll0Var, int i, int i2) {
        this.e = ll0Var;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ml0)) {
            return false;
        }
        ml0 ml0Var = (ml0) obj;
        return ml0Var.f == this.f && ml0Var.g == this.g && ml0Var.e == this.e;
    }

    public final int hashCode() {
        return (this.e.hashCode() * 31) + this.f;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ll0 ll0Var = this.e;
        if (ll0Var.l != this.g) {
            nl0.e();
        }
        int i = this.f;
        ll0Var.e(i);
        return new qs(ll0Var, i + 1, ll0Var.e[(i * 5) + 3] + i);
    }
}
