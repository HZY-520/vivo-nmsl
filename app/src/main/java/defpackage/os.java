package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class os extends qs0 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = gc.f;
    public List f;
    public boolean g;
    public c5 h;
    public pq i;
    public final l j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public os() {
        int i = zs0.a;
        this.f = um.e;
        this.g = true;
        this.j = new l(15, this);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.qs0
    public final void a(jl jlVar) {
        if (this.s) {
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = u10.j();
                this.b = fArr;
            } else {
                u10.E(fArr);
            }
            u10.H(fArr, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArr.length >= 16) {
                double d = f * 0.017453292519943295d;
                float sin = (float) Math.sin(d);
                float cos = (float) Math.cos(d);
                float f2 = fArr[0];
                float f3 = fArr[4];
                float f4 = (sin * f3) + (cos * f2);
                float f5 = -sin;
                float f6 = (f3 * cos) + (f2 * f5);
                float f7 = fArr[1];
                float f8 = fArr[5];
                float f9 = (sin * f8) + (cos * f7);
                float f10 = (f8 * cos) + (f7 * f5);
                float f11 = fArr[2];
                float f12 = fArr[6];
                float f13 = (sin * f12) + (cos * f11);
                float f14 = (f12 * cos) + (f11 * f5);
                float f15 = fArr[3];
                float f16 = fArr[7];
                fArr[0] = f4;
                fArr[1] = f9;
                fArr[2] = f13;
                fArr[3] = (sin * f16) + (cos * f15);
                fArr[4] = f6;
                fArr[5] = f10;
                fArr[6] = f14;
                fArr[7] = (cos * f16) + (f5 * f15);
            }
            float f17 = this.o;
            float f18 = this.p;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f17;
                fArr[1] = fArr[1] * f17;
                fArr[2] = fArr[2] * f17;
                fArr[3] = fArr[3] * f17;
                fArr[4] = fArr[4] * f18;
                fArr[5] = fArr[5] * f18;
                fArr[6] = fArr[6] * f18;
                fArr[7] = fArr[7] * f18;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            u10.H(fArr, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                c5 c5Var = this.h;
                if (c5Var == null) {
                    c5Var = e5.a();
                    this.h = c5Var;
                }
                p30.o(this.f, c5Var);
            }
            this.g = false;
        }
        v6 t = jlVar.t();
        long s = t.s();
        t.o().i();
        try {
            v6 v6Var = (v6) ((t3) t.a).f;
            float[] fArr2 = this.b;
            if (fArr2 != null) {
                v6Var.o().m(fArr2);
            }
            c5 c5Var2 = this.h;
            if (!this.f.isEmpty() && c5Var2 != null) {
                v6Var.o().o(c5Var2);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((qs0) arrayList.get(i)).a(jlVar);
            }
        } finally {
            t.o().g();
            t.C(s);
        }
    }

    @Override // defpackage.qs0
    public final pq b() {
        return this.i;
    }

    @Override // defpackage.qs0
    public final void d(l lVar) {
        this.i = lVar;
    }

    public final void e(int i, qs0 qs0Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, qs0Var);
        } else {
            arrayList.add(qs0Var);
        }
        g(qs0Var);
        qs0Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = zs0.a;
            if (gc.g(j2) == gc.g(j) && gc.f(j2) == gc.f(j) && gc.d(j2) == gc.d(j)) {
                return;
            }
            this.d = false;
            this.e = gc.f;
        }
    }

    public final void g(qs0 qs0Var) {
        if (!(qs0Var instanceof y90)) {
            if (qs0Var instanceof os) {
                os osVar = (os) qs0Var;
                if (osVar.d && this.d) {
                    f(osVar.e);
                    return;
                } else {
                    this.d = false;
                    this.e = gc.f;
                    return;
                }
            }
            return;
        }
        y90 y90Var = (y90) qs0Var;
        dx0 dx0Var = y90Var.b;
        if (this.d && dx0Var != null) {
            if (dx0Var instanceof jm0) {
                f(((jm0) dx0Var).G);
            } else {
                this.d = false;
                this.e = gc.f;
            }
        }
        dx0 dx0Var2 = y90Var.g;
        if (this.d && dx0Var2 != null) {
            if (dx0Var2 instanceof jm0) {
                f(((jm0) dx0Var2).G);
            } else {
                this.d = false;
                this.e = gc.f;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qs0 qs0Var = (qs0) arrayList.get(i);
            sb.append("\t");
            sb.append(qs0Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
