package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class wa0 extends AbstractMap implements Map, hx {
    public i2 e = new i2(26);
    public fr0 f;
    public Object g;
    public int h;
    public int i;
    public xa0 j;

    public wa0(xa0 xa0Var) {
        this.f = xa0Var.e;
        this.i = xa0Var.f;
        this.j = xa0Var;
    }

    public final xa0 a() {
        fr0 fr0Var = this.f;
        xa0 xa0Var = this.j;
        if (fr0Var != xa0Var.e) {
            this.e = new i2(26);
            xa0Var = new xa0(this.f, this.i);
        }
        this.j = xa0Var;
        return xa0Var;
    }

    public final boolean b(Object obj) {
        return this.f.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object c(Object obj) {
        return this.f.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f = fr0.e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof vd0) {
            return b((vd0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof rs0) {
            return super.containsValue((rs0) obj);
        }
        return false;
    }

    public final Object d(Object obj) {
        this.g = null;
        fr0 n = this.f.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            n = fr0.e;
        }
        this.f = n;
        return this.g;
    }

    public final void e(int i) {
        this.i = i;
        this.h++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new bb0(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof vd0) {
            return (rs0) c((vd0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof vd0) ? obj2 : (rs0) super.getOrDefault((vd0) obj, (rs0) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new bb0(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.g = null;
        this.f = this.f.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [ya0] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        xa0 xa0Var = null;
        xa0 xa0Var2 = map instanceof ya0 ? (ya0) map : null;
        if (xa0Var2 == null) {
            wa0 wa0Var = map instanceof wa0 ? (wa0) map : null;
            if (wa0Var != null) {
                xa0Var = wa0Var.a();
            }
        } else {
            xa0Var = xa0Var2;
        }
        if (xa0Var == null) {
            super.putAll(map);
            return;
        }
        ri riVar = new ri();
        riVar.a = 0;
        int i = this.i;
        fr0 fr0Var = this.f;
        fr0 fr0Var2 = xa0Var.e;
        fr0Var2.getClass();
        this.f = fr0Var.m(fr0Var2, 0, riVar, this);
        int i2 = (xa0Var.f + i) - riVar.a;
        if (i != i2) {
            e(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.i;
        fr0 o = this.f.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o == null) {
            o = fr0.e;
        }
        this.f = o;
        return i != this.i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new o10(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof vd0) {
            return (rs0) d((vd0) obj);
        }
        return null;
    }
}
