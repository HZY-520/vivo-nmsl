package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class hb0 extends m0 implements Set, Collection, fx {
    public static final hb0 h;
    public final Object e;
    public final Object f;
    public final ya0 g;

    static {
        b2 b2Var = b2.I;
        h = new hb0(b2Var, b2Var, ya0.g);
    }

    public hb0(Object obj, Object obj2, ya0 ya0Var) {
        this.e = obj;
        this.f = obj2;
        this.g = ya0Var;
    }

    @Override // defpackage.m
    public final int a() {
        return this.g.f;
    }

    @Override // defpackage.m, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.g.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new or(this.e, this.g);
    }
}
