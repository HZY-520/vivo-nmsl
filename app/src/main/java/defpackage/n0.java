package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class n0 {
    public o0[] e;
    public int f;
    public int g;
    public vn0 h;

    public final o0 a() {
        o0 o0Var;
        vn0 vn0Var;
        synchronized (this) {
            try {
                o0[] o0VarArr = this.e;
                if (o0VarArr == null) {
                    o0VarArr = e();
                    this.e = o0VarArr;
                } else if (this.f >= o0VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(o0VarArr, o0VarArr.length * 2);
                    this.e = (o0[]) copyOf;
                    o0VarArr = (o0[]) copyOf;
                }
                int i = this.g;
                do {
                    o0Var = o0VarArr[i];
                    if (o0Var == null) {
                        o0Var = c();
                        o0VarArr[i] = o0Var;
                    }
                    i++;
                    if (i >= o0VarArr.length) {
                        i = 0;
                    }
                } while (!o0Var.a(this));
                this.g = i;
                this.f++;
                vn0Var = this.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vn0Var != null) {
            vn0Var.v(1);
        }
        return o0Var;
    }

    public abstract o0 c();

    public abstract o0[] e();

    public final void f(o0 o0Var) {
        vn0 vn0Var;
        int i;
        ng[] b;
        synchronized (this) {
            try {
                int i2 = this.f - 1;
                this.f = i2;
                vn0Var = this.h;
                if (i2 == 0) {
                    this.g = 0;
                }
                o0Var.getClass();
                b = o0Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (ng ngVar : b) {
            if (ngVar != null) {
                ngVar.resumeWith(fs0.a);
            }
        }
        if (vn0Var != null) {
            vn0Var.v(-1);
        }
    }

    public final vn0 g() {
        vn0 vn0Var;
        synchronized (this) {
            vn0Var = this.h;
            if (vn0Var == null) {
                int i = this.f;
                vn0Var = new vn0(1, Integer.MAX_VALUE, m9.f);
                vn0Var.p(Integer.valueOf(i));
                this.h = vn0Var;
            }
        }
        return vn0Var;
    }
}
