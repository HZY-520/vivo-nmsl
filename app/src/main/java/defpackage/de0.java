package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class de0 {
    public cf a;
    public int b;
    public er c;
    public tq d;
    public int e;
    public g40 f;
    public k40 g;

    public de0(cf cfVar) {
        this.a = cfVar;
    }

    public final boolean a() {
        if (this.a != null) {
            er erVar = this.c;
            if (erVar != null ? erVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final sw b(Object obj) {
        sw n;
        cf cfVar = this.a;
        return (cfVar == null || (n = cfVar.n(this, obj)) == null) ? sw.e : n;
    }

    public final void c() {
        cf cfVar = this.a;
        if (cfVar != null) {
            cfVar.s = true;
            cfVar.v.getClass();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
