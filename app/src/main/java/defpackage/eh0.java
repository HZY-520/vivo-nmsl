package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class eh0 extends fh0 implements Iterator {
    public dh0 e;
    public boolean f = true;
    public final /* synthetic */ mn g;

    public eh0(mn mnVar) {
        this.g = mnVar;
    }

    @Override // defpackage.fh0
    public final void a(dh0 dh0Var) {
        dh0 dh0Var2 = this.e;
        if (dh0Var == dh0Var2) {
            dh0 dh0Var3 = dh0Var2.h;
            this.e = dh0Var3;
            this.f = dh0Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f) {
            return this.g.e != null;
        }
        dh0 dh0Var = this.e;
        return (dh0Var == null || dh0Var.g == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f) {
            this.f = false;
            dh0 dh0Var = this.g.e;
            this.e = dh0Var;
            return dh0Var;
        }
        dh0 dh0Var2 = this.e;
        dh0 dh0Var3 = dh0Var2 != null ? dh0Var2.g : null;
        this.e = dh0Var3;
        return dh0Var3;
    }
}
