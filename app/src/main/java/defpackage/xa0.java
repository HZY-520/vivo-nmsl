package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class xa0 extends ya0 implements ff {
    public static final xa0 h = new xa0(fr0.e, 0);

    public final xa0 b(vd0 vd0Var, rs0 rs0Var) {
        jd u = this.e.u(vd0Var.hashCode(), 0, vd0Var, rs0Var);
        return u == null ? this : new xa0((fr0) u.f, this.f + u.e);
    }

    @Override // defpackage.ya0, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof vd0) {
            return super.containsKey((vd0) obj);
        }
        return false;
    }

    @Override // defpackage.ya0, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof rs0) {
            return super.containsValue((rs0) obj);
        }
        return false;
    }

    @Override // defpackage.ya0, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof vd0) {
            return (rs0) super.get((vd0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof vd0) ? obj2 : (rs0) super.getOrDefault((vd0) obj, (rs0) obj2);
    }
}
