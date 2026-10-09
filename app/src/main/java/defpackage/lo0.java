package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class lo0 implements oy, Serializable {
    public eq e;
    public volatile Object f = b2.Y;
    public final Object g = this;

    public lo0(eq eqVar) {
        this.e = eqVar;
    }

    @Override // defpackage.oy
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f;
        b2 b2Var = b2.Y;
        if (obj2 != b2Var) {
            return obj2;
        }
        synchronized (this.g) {
            obj = this.f;
            if (obj == b2Var) {
                eq eqVar = this.e;
                eqVar.getClass();
                obj = eqVar.b();
                this.f = obj;
                this.e = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f != b2.Y ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
