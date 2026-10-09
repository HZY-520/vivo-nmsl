package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class cb0 implements Iterator, fx {
    public final /* synthetic */ int e = 0;
    public final Iterator f;

    public cb0(wa0 wa0Var) {
        gr0[] gr0VarArr = new gr0[8];
        for (int i = 0; i < 8; i++) {
            gr0VarArr[i] = new ir0(this);
        }
        this.f = new ab0(wa0Var, gr0VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                return ((ab0) this.f).g;
            default:
                return this.f.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                return (Map.Entry) ((ab0) this.f).next();
            default:
                return (at0) this.f.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                ((ab0) this.f).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public cb0(ys0 ys0Var) {
        this.f = ys0Var.n.iterator();
    }
}
