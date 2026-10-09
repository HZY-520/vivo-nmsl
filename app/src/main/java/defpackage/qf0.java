package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class qf0 implements Serializable {
    public final Throwable e;

    public qf0(Throwable th) {
        th.getClass();
        this.e = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qf0) {
            return lw.i(this.e, ((qf0) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.e + ')';
    }
}
