package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class j4 {
    public final Context a;
    public final si b;
    public final long c;
    public final f90 d;

    public j4(Context context, si siVar, long j, f90 f90Var) {
        this.a = context;
        this.b = siVar;
        this.c = j;
        this.d = f90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j4.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        j4 j4Var = (j4) obj;
        if (!lw.i(this.a, j4Var.a) || !lw.i(this.b, j4Var.b)) {
            return false;
        }
        long j = j4Var.c;
        int i = gc.g;
        return as0.a(this.c, j) && this.d.equals(j4Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = gc.g;
        return this.d.hashCode() + j2.c(hashCode, 31, this.c);
    }
}
