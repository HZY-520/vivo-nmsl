package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class dh0 implements Map.Entry {
    public final dz e;
    public final fz f;
    public dh0 g;
    public dh0 h;

    public dh0(dz dzVar, fz fzVar) {
        this.e = dzVar;
        this.f = fzVar;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dh0) {
            dh0 dh0Var = (dh0) obj;
            return this.e.equals(dh0Var.e) && this.f == dh0Var.f;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f.hashCode() ^ this.e.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.e + "=" + this.f;
    }
}
