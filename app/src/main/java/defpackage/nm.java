package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class nm {
    public int a = 1;
    public final k20 b;
    public k20 c;
    public k20 d;
    public int e;
    public int f;

    public nm(k20 k20Var) {
        this.b = k20Var;
        this.c = k20Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        h20 b = this.c.b.b();
        int a = b.a(6);
        return !(a == 0 || ((ByteBuffer) b.h).get(a + b.e) == 0) || this.e == 65039;
    }
}
