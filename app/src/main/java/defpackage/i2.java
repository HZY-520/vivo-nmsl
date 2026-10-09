package defpackage;

import com.vivo.cnm.lico.MainActivity;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class i2 implements y0, vb, uc0, fp, aq0, a7, e7, sg, im0, c60 {
    public final /* synthetic */ int e;

    public i2() {
        this.e = 9;
        new d10(16);
        long[] jArr = gi0.a;
        new k40();
    }

    @Override // defpackage.a7, defpackage.e7
    public float a() {
        return 0.0f;
    }

    @Override // defpackage.c60
    public boolean b(t20 t20Var) {
        return false;
    }

    @Override // defpackage.c60
    public int c() {
        return 8;
    }

    @Override // defpackage.c60
    public boolean d(t20 t20Var) {
        return nh.C(t30.a(nh.a0(t20Var), false));
    }

    @Override // defpackage.a7
    public void e(w00 w00Var, int i, int[] iArr, xx xxVar, int[] iArr2) {
        if (xxVar == xx.e) {
            lr0.G(i, iArr, iArr2, false);
        } else {
            lr0.G(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.c60
    public void f(iy iyVar, long j, bt btVar, int i, boolean z) {
        y50 y50Var = iyVar.H;
        d60 d60Var = y50Var.d;
        a60 a60Var = d60.Y;
        y50Var.d.G0(d60.d0, d60Var.x0(j), btVar, 1, z);
    }

    @Override // defpackage.c60
    public boolean g(bt btVar, iy iyVar) {
        return false;
    }

    @Override // defpackage.e7
    public void h(int i, w00 w00Var, int[] iArr, int[] iArr2) {
        lr0.G(i, iArr, iArr2, false);
    }

    @Override // defpackage.c60
    public boolean i(iy iyVar) {
        qj0 q = iyVar.q();
        boolean z = false;
        if (q != null && q.h) {
            z = true;
        }
        return !z;
    }

    public long j(long j, long j2) {
        float i = t10.i(j, j2);
        long floatToRawIntBits = (Float.floatToRawIntBits(i) << 32) | (Float.floatToRawIntBits(i) & 4294967295L);
        int i2 = fi0.a;
        return floatToRawIntBits;
    }

    public String toString() {
        switch (this.e) {
            case MainActivity.$stable /* 8 */:
                return "Arrangement#Center";
            case 9:
            default:
                return super.toString();
            case 10:
                return "Empty";
            case 11:
                return "CompositionErrorContext";
        }
    }

    public /* synthetic */ i2(int i) {
        this.e = i;
    }

    public i2(xe xeVar) {
        this.e = 12;
    }

    public i2(e3 e3Var) {
        this.e = 2;
        tc0.a.getClass();
    }
}
