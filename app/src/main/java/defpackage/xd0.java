package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class xd0 {
    public final vd0 a;
    public final boolean b;
    public final b2 c;
    public final pq d;
    public final boolean e;
    public final Object f;
    public boolean g = true;

    public xd0(vd0 vd0Var, Object obj, boolean z, b2 b2Var, pq pqVar, boolean z2) {
        this.a = vd0Var;
        this.b = z;
        this.c = b2Var;
        this.d = pqVar;
        this.e = z2;
        this.f = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        ue.b("Unexpected form of a provided value");
        throw new id();
    }
}
