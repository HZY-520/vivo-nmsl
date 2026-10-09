package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vq0 {
    public final long a;
    public final long b;
    public final boolean c;

    public vq0(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final vq0 a(vq0 vq0Var) {
        return new vq0(s60.e(this.a, vq0Var.a), Math.max(this.b, vq0Var.b), this.c || vq0Var.c);
    }
}
