package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ho0 extends y20 {
    public final Object a;
    public final Object b;
    public final PointerInputEventHandler c;

    public ho0(Object obj, m20 m20Var, PointerInputEventHandler pointerInputEventHandler, int i) {
        m20Var = (i & 2) != 0 ? null : m20Var;
        this.a = obj;
        this.b = m20Var;
        this.c = pointerInputEventHandler;
    }

    @Override // defpackage.y20
    public final t20 d() {
        return new ko0(this.a, this.b, this.c);
    }

    @Override // defpackage.y20
    public final void e(t20 t20Var) {
        ko0 ko0Var = (ko0) t20Var;
        Object obj = ko0Var.s;
        Object obj2 = this.a;
        boolean z = !lw.i(obj, obj2);
        ko0Var.s = obj2;
        Object obj3 = ko0Var.t;
        Object obj4 = this.b;
        if (!lw.i(obj3, obj4)) {
            z = true;
        }
        ko0Var.t = obj4;
        Class<?> cls = ko0Var.u.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.c;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            ko0Var.p0();
        }
        ko0Var.u = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho0)) {
            return false;
        }
        ho0 ho0Var = (ho0) obj;
        return this.a.equals(ho0Var.a) && lw.i(this.b, ho0Var.b) && this.c == ho0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return this.c.hashCode() + ((hashCode + (obj != null ? obj.hashCode() : 0)) * 961);
    }
}
