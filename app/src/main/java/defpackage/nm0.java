package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class nm0 implements Iterable, fx {
    public final ll0 e;
    public final int f;
    public final ye0 g;

    public nm0(ll0 ll0Var, int i, ir irVar, ye0 ye0Var) {
        this.e = ll0Var;
        this.f = i;
        this.g = ye0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nm0)) {
            return false;
        }
        nm0 nm0Var = (nm0) obj;
        return nm0Var.f == this.f && nm0Var.e == this.e && nm0Var.g.equals(this.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.e.hashCode() + (this.f * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new mm0(this.e, this.f, null, this.g);
    }
}
