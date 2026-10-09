package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class e50 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public e50(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e50.class == obj.getClass()) {
            e50 e50Var = (e50) obj;
            return this.c == e50Var.c && this.d == e50Var.d && this.b == e50Var.b && this.a == e50Var.a && this.e == e50Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + j2.b(this.a, j2.a(this.b, j2.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
