package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class u00 implements si {
    public boolean e;
    public long f = 9223372034707292159L;
    public long g = 0;
    public final /* synthetic */ w00 h;

    public u00(w00 w00Var) {
        this.h = w00Var;
    }

    public final void a(mt mtVar, float f) {
        w00 w00Var = this.h;
        xg0 xg0Var = w00Var.u;
        if (xg0Var == null) {
            xg0Var = new xg0();
            w00Var.u = xg0Var;
        }
        int Y = o7.Y(xg0Var.b, mtVar);
        if (Y >= 0) {
            float[] fArr = xg0Var.c;
            if (fArr[Y] != f) {
                fArr[Y] = f;
                xg0Var.d[Y] = 1;
                return;
            } else {
                byte[] bArr = xg0Var.d;
                if (bArr[Y] == 2) {
                    bArr[Y] = 0;
                    return;
                }
                return;
            }
        }
        int i = xg0Var.a;
        mt[] mtVarArr = xg0Var.b;
        if (i == mtVarArr.length) {
            int i2 = i * 2;
            xg0Var.b = (mt[]) Arrays.copyOf(mtVarArr, i2);
            xg0Var.c = Arrays.copyOf(xg0Var.c, i2);
            xg0Var.d = Arrays.copyOf(xg0Var.d, i2);
        }
        xg0Var.b[i] = mtVar;
        xg0Var.d[i] = 3;
        xg0Var.c[i] = f;
        xg0Var.a++;
    }

    @Override // defpackage.si
    public final float g() {
        return this.h.g();
    }

    @Override // defpackage.si
    public final float k() {
        return this.h.k();
    }
}
