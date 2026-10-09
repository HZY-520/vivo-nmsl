package defpackage;

import android.graphics.Path;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class y90 extends qs0 {
    public dx0 b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public dx0 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public tn0 q;
    public final c5 r;
    public c5 s;
    public c5 t;
    public final oy u;

    public y90() {
        int i = zs0.a;
        this.d = um.e;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        c5 a = e5.a();
        this.r = a;
        this.s = a;
        this.u = lr0.B(new hf(19));
    }

    @Override // defpackage.qs0
    public final void a(jl jlVar) {
        jl jlVar2;
        tn0 tn0Var;
        if (this.n) {
            p30.o(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        dx0 dx0Var = this.b;
        if (dx0Var != null) {
            jlVar2 = jlVar;
            jl.Z(jlVar2, this.s, dx0Var, this.c, null, 56);
        } else {
            jlVar2 = jlVar;
        }
        dx0 dx0Var2 = this.g;
        if (dx0Var2 != null) {
            tn0 tn0Var2 = this.q;
            if (this.o || tn0Var2 == null) {
                tn0 tn0Var3 = new tn0(this.f, this.j, this.h, this.i, 16);
                this.q = tn0Var3;
                this.o = false;
                tn0Var = tn0Var3;
            } else {
                tn0Var = tn0Var2;
            }
            jl.Z(jlVar2, this.s, dx0Var2, this.e, tn0Var, 48);
        }
    }

    public final void e() {
        float f = this.k;
        c5 c5Var = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = c5Var;
            return;
        }
        c5 c5Var2 = this.s;
        if (c5Var2 != c5Var) {
            Path.FillType fillType = c5Var2.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.s.a.rewind();
            Path path = this.s.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        } else {
            this.s = e5.a();
        }
        oy oyVar = this.u;
        ((d5) oyVar.getValue()).a.setPath(c5Var.a, false);
        float length = ((d5) oyVar.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((d5) oyVar.getValue()).a(f4, f5, this.s);
            return;
        }
        c5 c5Var3 = this.t;
        if (c5Var3 == null) {
            c5Var3 = e5.a();
            this.t = c5Var3;
        }
        c5Var3.c();
        ((d5) oyVar.getValue()).a(f4, length, c5Var3);
        c5.a(this.s, c5Var3);
        c5Var3.c();
        ((d5) oyVar.getValue()).a(0.0f, f5, c5Var3);
        c5.a(this.s, c5Var3);
    }

    public final String toString() {
        return this.r.toString();
    }
}
