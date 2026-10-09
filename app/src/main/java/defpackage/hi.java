package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class hi implements fj0 {
    public final l a;
    public final gi b = new gi(this);
    public final a50 c = new a50();
    public final w90 d;
    public final w90 e;
    public final w90 f;

    public hi(l lVar) {
        this.a = lVar;
        Boolean bool = Boolean.FALSE;
        this.d = p30.m(bool);
        this.e = p30.m(bool);
        this.f = p30.m(bool);
    }

    @Override // defpackage.fj0
    public final Object b(v40 v40Var, f fVar, og ogVar) {
        Object j = t10.j(new f(this, v40Var, fVar, null, 4), ogVar);
        return j == dh.e ? j : fs0.a;
    }

    @Override // defpackage.fj0
    public final boolean c() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.fj0
    public final float e(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }
}
