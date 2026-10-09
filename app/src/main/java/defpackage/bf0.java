package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class bf0 {
    public Set a;
    public final t40 b;
    public final l40 c;
    public t40 d;
    public final t40 e;
    public final t40 f;
    public l40 g;
    public k40 h;
    public ArrayList i;

    public bf0() {
        t40 t40Var = new t40(new lr[16]);
        this.b = t40Var;
        int i = hi0.a;
        this.c = new l40();
        this.d = t40Var;
        this.e = new t40(new Object[16]);
        this.f = new t40(new eq[16]);
    }

    public final void a() {
        this.a = null;
        t40 t40Var = this.b;
        t40Var.g();
        this.c.b();
        this.d = t40Var;
        this.e.g();
        this.f.g();
        this.g = null;
        this.h = null;
        this.i = null;
    }

    public final void b() {
        Set set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                cf0 cf0Var = (cf0) it.next();
                it.remove();
                cf0Var.e();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        Set set = this.a;
        if (set == null) {
            return;
        }
        t40 t40Var = this.e;
        if (t40Var.g != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                l40 l40Var = this.g;
                int i = t40Var.g;
                while (true) {
                    i--;
                    if (-1 >= i) {
                        break;
                    }
                    Object obj = t40Var.e[i];
                    if (obj instanceof lr) {
                        cf0 cf0Var = ((lr) obj).a;
                        set.remove(cf0Var);
                        cf0Var.h();
                    }
                    if (obj instanceof iy) {
                        if (l40Var == null || !l40Var.c(obj)) {
                            ((iy) obj).G();
                        } else {
                            y50 y50Var = ((iy) obj).H;
                            d60 d60Var = y50Var.c.z;
                            for (d60 d60Var2 = y50Var.d; !lw.i(d60Var2, d60Var) && d60Var2 != null; d60Var2 = d60Var2.z) {
                                d60Var2.O0();
                            }
                        }
                    }
                }
            } finally {
            }
        }
        t40 t40Var2 = this.b;
        if (t40Var2.g != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.a;
                if (set2 != null) {
                    Object[] objArr = t40Var2.e;
                    int i2 = t40Var2.g;
                    for (int i3 = 0; i3 < i2; i3++) {
                        cf0 cf0Var2 = ((lr) objArr[i3]).a;
                        set2.remove(cf0Var2);
                        cf0Var2.c();
                    }
                }
            } finally {
            }
        }
    }

    public final void d(lr lrVar) {
        l40 l40Var = this.c;
        if (!l40Var.c(lrVar)) {
            this.e.b(lrVar);
            return;
        }
        l40Var.k(lrVar);
        if (!this.d.i(lrVar)) {
            t40 t40Var = this.b;
            if (!t40Var.i(lrVar)) {
                Object[] objArr = t40Var.e;
                int i = t40Var.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (((lr) objArr[i2]).a instanceof ua0) {
                        throw null;
                    }
                }
            }
        }
        Set set = this.a;
        if (set == null) {
            return;
        }
        set.add(lrVar.a);
    }

    public final void e(Set set) {
        a();
        this.a = set;
    }
}
