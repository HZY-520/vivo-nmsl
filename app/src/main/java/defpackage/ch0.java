package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ch0 extends fh0 implements Iterator {
    public dh0 e;
    public dh0 f;
    public final /* synthetic */ int g;

    public ch0(dh0 dh0Var, dh0 dh0Var2, int i) {
        this.g = i;
        this.e = dh0Var2;
        this.f = dh0Var;
    }

    @Override // defpackage.fh0
    public final void a(dh0 dh0Var) {
        dh0 dh0Var2;
        dh0 dh0Var3 = this.e;
        dh0 dh0Var4 = null;
        if (dh0Var3 == dh0Var && dh0Var == this.f) {
            this.f = null;
            this.e = null;
            dh0Var3 = null;
        }
        dh0 dh0Var5 = dh0Var3;
        if (dh0Var3 == dh0Var) {
            switch (this.g) {
                case 0:
                    dh0Var2 = dh0Var3.h;
                    break;
                default:
                    dh0Var2 = dh0Var3.g;
                    break;
            }
            dh0Var5 = dh0Var2;
            this.e = dh0Var5;
        }
        dh0 dh0Var6 = this.f;
        if (dh0Var6 == dh0Var) {
            if (dh0Var6 != dh0Var5 && dh0Var5 != null) {
                dh0Var4 = b(dh0Var6);
            }
            this.f = dh0Var4;
        }
    }

    public final dh0 b(dh0 dh0Var) {
        switch (this.g) {
            case 0:
                return dh0Var.g;
            default:
                return dh0Var.h;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        dh0 dh0Var = this.f;
        dh0 dh0Var2 = this.e;
        this.f = (dh0Var == dh0Var2 || dh0Var2 == null) ? null : b(dh0Var);
        return dh0Var;
    }
}
