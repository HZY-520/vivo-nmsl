package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class tp0 {
    public final long a;
    public final long b;

    public tp0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp0)) {
            return false;
        }
        tp0 tp0Var = (tp0) obj;
        long j = tp0Var.a;
        int i = gc.g;
        return as0.a(this.a, j) && as0.a(this.b, tp0Var.b);
    }

    public final int hashCode() {
        int i = gc.g;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + gc.h(this.a) + ", selectionBackgroundColor=" + gc.h(this.b) + ")";
    }
}
