package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class js0 implements oy, Serializable {
    public eq e;
    public Object f;

    @Override // defpackage.oy
    public final Object getValue() {
        Object obj = this.f;
        if (obj != b2.Y) {
            return obj;
        }
        eq eqVar = this.e;
        eqVar.getClass();
        Object b = eqVar.b();
        this.f = b;
        this.e = null;
        return b;
    }

    public final String toString() {
        return this.f != b2.Y ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
