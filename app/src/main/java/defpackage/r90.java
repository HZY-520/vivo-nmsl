package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class r90 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        cq0[] cq0VarArr = bq0.b;
        a = bq0.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0033, code lost:
    
        if (defpackage.bq0.a(r3, r17.c) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final q90 a(q90 q90Var, int i, int i2, long j, gp0 gp0Var, nc0 nc0Var, rz rzVar, int i3, int i4, rp0 rp0Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        gp0 gp0Var2 = gp0Var;
        nc0 nc0Var2 = nc0Var;
        rz rzVar2 = rzVar;
        int i7 = i3;
        int i8 = i4;
        rp0 rp0Var2 = rp0Var;
        if (i5 == 0 || i5 == q90Var.a) {
            cq0[] cq0VarArr = bq0.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
            }
            if ((gp0Var2 == null || gp0Var2.equals(q90Var.d)) && ((i6 == 0 || i6 == q90Var.b) && ((nc0Var2 == null || nc0Var2.equals(q90Var.e)) && ((rzVar2 == null || rzVar2.equals(q90Var.f)) && ((i7 == 0 || i7 == q90Var.g) && ((i8 == 0 || i8 == q90Var.h) && (rp0Var2 == null || rp0Var2.equals(q90Var.i)))))))) {
                return q90Var;
            }
        } else {
            j2 = 0;
        }
        cq0[] cq0VarArr2 = bq0.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = q90Var.c;
        }
        if (gp0Var2 == null) {
            gp0Var2 = q90Var.d;
        }
        if (i5 == 0) {
            i5 = q90Var.a;
        }
        if (i6 == 0) {
            i6 = q90Var.b;
        }
        nc0 nc0Var3 = q90Var.e;
        if (nc0Var3 != null && nc0Var2 == null) {
            nc0Var2 = nc0Var3;
        }
        if (rzVar2 == null) {
            rzVar2 = q90Var.f;
        }
        if (i7 == 0) {
            i7 = q90Var.g;
        }
        if (i8 == 0) {
            i8 = q90Var.h;
        }
        if (rp0Var2 == null) {
            rp0Var2 = q90Var.i;
        }
        return new q90(i5, i6, j3, gp0Var2, nc0Var2, rzVar2, i7, i8, rp0Var2);
    }
}
