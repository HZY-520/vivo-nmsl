package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class fi extends kn {
    public static final fi h;
    public bh g;

    static {
        int i = xo0.c;
        int i2 = xo0.d;
        long j = xo0.e;
        String str = xo0.a;
        fi fiVar = new fi();
        fiVar.g = new bh(i, i2, j, str);
        h = fiVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.vg
    public final void h(tg tgVar, Runnable runnable) {
        bh.c(this.g, runnable, 6);
    }

    @Override // defpackage.vg
    public final String toString() {
        return "Dispatchers.Default";
    }
}
