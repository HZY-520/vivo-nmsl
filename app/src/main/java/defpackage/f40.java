package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class f40 extends p10 {
    public final cb0 h;
    public Object i;

    public f40(cb0 cb0Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.h = cb0Var;
        this.i = obj2;
    }

    @Override // defpackage.p10, java.util.Map.Entry
    public final Object getValue() {
        return this.i;
    }

    @Override // defpackage.p10, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.i;
        this.i = obj;
        ab0 ab0Var = (ab0) this.h.f;
        wa0 wa0Var = ab0Var.h;
        Object obj3 = this.f;
        if (!wa0Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = ab0Var.g;
        if (!z) {
            wa0Var.put(obj3, obj);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            gr0 gr0Var = ab0Var.e[ab0Var.f];
            Object obj4 = gr0Var.e[gr0Var.g];
            wa0Var.put(obj3, obj);
            ab0Var.c(obj4 != null ? obj4.hashCode() : 0, wa0Var.f, obj4, 0);
        }
        ab0Var.k = wa0Var.h;
        return obj2;
    }
}
