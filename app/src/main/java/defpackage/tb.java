package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class tb extends oi implements yc0, nx, sj0, df, q60, wu, rr {
    public mu A;
    public vr B;
    public String C = "idle";
    public ni D;
    public hd0 E;
    public ot F;
    public final d40 G;
    public long H;
    public hd0 I;
    public b40 J;
    public boolean K;
    public wm0 L;
    public vc0 M;
    public ou N;
    public b40 u;
    public mu v;
    public boolean w;
    public boolean x;
    public eq y;
    public final bp z;

    public tb(b40 b40Var, mu muVar, boolean z, boolean z2, eq eqVar) {
        this.u = b40Var;
        this.v = muVar;
        this.w = z;
        this.x = z2;
        this.y = eqVar;
        this.z = new bp(b40Var, new e(1, this, tb.class, "onFocusChange", "onFocusChange(Z)V", 0, 0));
        int i = q00.a;
        this.G = new d40(6);
        this.H = 0L;
        b40 b40Var2 = this.u;
        this.J = b40Var2;
        this.K = b40Var2 == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        if (((r7 & ((~r7) << 6)) & r14) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cf, code lost:
    
        r16 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(KeyEvent keyEvent) {
        boolean z;
        int i;
        Object obj;
        v0();
        long b = lr0.b(keyEvent.getKeyCode());
        boolean z2 = this.x;
        d40 d40Var = this.G;
        int i2 = 1;
        if (z2 && t10.r(keyEvent) == 2 && t10.y(keyEvent)) {
            if (!d40Var.b(b)) {
                hd0 hd0Var = new hd0(this.H);
                d40Var.f(b, hd0Var);
                if (this.u == null) {
                    return true;
                }
                q3.A(c0(), null, new j(this, hd0Var, null, 2), 3);
                return true;
            }
        } else if (this.x && t10.r(keyEvent) == 1 && t10.y(keyEvent)) {
            d40Var.getClass();
            int hashCode = Long.hashCode(b) * (-862048943);
            int i3 = hashCode ^ (hashCode << 16);
            int i4 = i3 & 127;
            int i5 = d40Var.d;
            int i6 = (i3 >>> 7) & i5;
            int i7 = 0;
            loop0: while (true) {
                long[] jArr = d40Var.a;
                int i8 = i6 >> 3;
                int i9 = (i6 & 7) << 3;
                z = i2;
                long j = (((-i9) >> 63) & (jArr[i8 + i2] << (64 - i9))) | (jArr[i8] >>> i9);
                long j2 = (i4 * 72340172838076673L) ^ j;
                long j3 = -9187201950435737472L;
                long j4 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j4 == 0) {
                        break;
                    }
                    i = (i6 + (Long.numberOfTrailingZeros(j4) >> 3)) & i5;
                    long j5 = j3;
                    if (d40Var.b[i] == b) {
                        break loop0;
                    }
                    j4 &= j4 - 1;
                    j3 = j5;
                }
                i7 += 8;
                i6 = (i6 + i7) & i5;
                i2 = z ? 1 : 0;
            }
            if (i >= 0) {
                d40Var.e--;
                long[] jArr2 = d40Var.a;
                int i10 = d40Var.d;
                int i11 = i >> 3;
                int i12 = (i & 7) << 3;
                long j6 = (jArr2[i11] & (~(255 << i12))) | (254 << i12);
                jArr2[i11] = j6;
                jArr2[(((i - 7) & i10) + (i10 & 7)) >> 3] = j6;
                Object[] objArr = d40Var.c;
                obj = objArr[i];
                objArr[i] = null;
            } else {
                obj = null;
            }
            hd0 hd0Var2 = (hd0) obj;
            if (hd0Var2 != null) {
                if (this.u != null) {
                    q3.A(c0(), null, new j(this, hd0Var2, null, 3), 3);
                }
                w0();
            }
            if (hd0Var2 != null) {
                return z;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.sj0
    public final void O(bk0 bk0Var) {
        b bVar = new b(this, 1);
        jx[] jxVarArr = zj0.a;
        bk0Var.a(pj0.b, new p0(null, bVar));
        if (this.x) {
            this.z.O(bk0Var);
        } else {
            bk0Var.a(yj0.j, fs0.a);
        }
    }

    @Override // defpackage.yc0
    public final void P() {
        ot otVar;
        b40 b40Var = this.u;
        if (b40Var != null && (otVar = this.F) != null) {
            b40Var.b(new pt(otVar));
        }
        this.F = null;
        r0(false);
    }

    @Override // defpackage.sj0
    public final boolean R() {
        return true;
    }

    @Override // defpackage.rr
    public final String X() {
        return this.C;
    }

    @Override // defpackage.t20
    public final boolean d0() {
        return false;
    }

    @Override // defpackage.t20
    public final void g0() {
        z();
        if (!this.K) {
            v0();
        }
        if (this.x) {
            o0(this.z);
        }
    }

    @Override // defpackage.t20
    public final void h0() {
        t0();
        if (this.J == null) {
            this.u = null;
        }
        ni niVar = this.D;
        if (niVar != null) {
            p0(niVar);
        }
        this.D = null;
        vr vrVar = this.B;
        if (vrVar != null) {
            p0(vrVar);
        }
        this.B = null;
    }

    @Override // defpackage.wu
    public final void q() {
        r0(true);
    }

    public final void r0(boolean z) {
        if (z) {
            this.N = null;
        } else {
            this.M = null;
        }
        b40 b40Var = this.u;
        if (b40Var != null) {
            wm0 wm0Var = this.L;
            if (wm0Var == null || !wm0Var.a()) {
                hd0 hd0Var = z ? this.I : this.E;
                if (hd0Var != null) {
                    gd0 gd0Var = new gd0(hd0Var);
                    ww wwVar = (ww) ((mg) c0()).e.j(b2.N);
                    q3.A(c0(), null, new f(b40Var, gd0Var, wwVar != null ? wwVar.o(new c(0, b40Var, gd0Var)) : null, null, 0), 3);
                }
            } else {
                wm0 wm0Var2 = this.L;
                if (wm0Var2 != null) {
                    wm0Var2.b(null);
                }
            }
            if (z) {
                this.I = null;
            } else {
                this.E = null;
            }
        }
        this.C = "idle";
    }

    public final boolean s0() {
        ve0 ve0Var = new ve0();
        p30.p(this, vr.t, new wr(new r2(ve0Var, 1), 0));
        if (ve0Var.e == null) {
            int i = ub.b;
            ViewParent parent = kw.L(this).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                }
            }
            return false;
        }
        return true;
    }

    public final void t0() {
        b40 b40Var = this.u;
        d40 d40Var = this.G;
        if (b40Var != null) {
            hd0 hd0Var = this.E;
            if (hd0Var != null) {
                b40Var.b(new gd0(hd0Var));
            }
            hd0 hd0Var2 = this.I;
            if (hd0Var2 != null) {
                b40Var.b(new gd0(hd0Var2));
            }
            ot otVar = this.F;
            if (otVar != null) {
                b40Var.b(new pt(otVar));
            }
            Object[] objArr = d40Var.c;
            long[] jArr = d40Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                b40Var.b(new gd0((hd0) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.E = null;
        this.I = null;
        this.F = null;
        d40Var.a();
    }

    public final void u0(long j, boolean z) {
        b40 b40Var = this.u;
        if (b40Var != null) {
            wm0 wm0Var = this.L;
            if (wm0Var == null || !wm0Var.a()) {
                hd0 hd0Var = z ? this.I : this.E;
                if (hd0Var != null) {
                    q3.A(c0(), null, new h(hd0Var, b40Var, null), 3);
                }
            } else {
                wm0Var.b(null);
                q3.A(c0(), null, new g(wm0Var, j, b40Var, null, 0), 3);
            }
            if (z) {
                this.I = null;
            } else {
                this.E = null;
            }
        }
    }

    @Override // defpackage.wu
    public final void v(t4 t4Var, sc0 sc0Var) {
        ArrayList arrayList = (ArrayList) t4Var.b;
        v0();
        if (this.x && this.B == null) {
            vr vrVar = new vr(this);
            o0(vrVar);
            this.B = vrVar;
        }
        int i = 0;
        if (sc0Var != sc0.f) {
            if (sc0Var == sc0.g) {
                if (this.N != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        ou ouVar = (ou) arrayList.get(i);
                        if (ouVar.i && ouVar != this.N) {
                            r0(true);
                            break;
                        }
                        i++;
                    }
                }
                if (lw.i(this.C, "recognized")) {
                    this.C = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.N == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (q3.g((ou) arrayList.get(i2))) {
                    ou ouVar2 = (ou) arrayList.get(0);
                    ouVar2.i = true;
                    this.N = ouVar2;
                    if (this.x) {
                        this.C = "waiting";
                        b40 b40Var = this.u;
                        if (b40Var != null) {
                            hd0 hd0Var = new hd0(ouVar2.c);
                            if (s0()) {
                                this.L = q3.A(c0(), null, new i(b40Var, hd0Var, this, null, 0), 3);
                                return;
                            } else {
                                this.I = hd0Var;
                                q3.A(c0(), null, new h(b40Var, hd0Var, null, 1), 3);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ou ouVar3 = (ou) arrayList.get(i3);
            if (ouVar3.i || !ouVar3.h || ouVar3.d) {
                float b = ((wt0) q3.o(this, kf.t)).b();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ou ouVar4 = (ou) arrayList.get(i4);
                    long j = ouVar4.c;
                    ou ouVar5 = this.N;
                    ouVar5.getClass();
                    boolean z = Math.abs(s60.c(s60.d(j, ouVar5.c))) > b;
                    if (ouVar4.i || z) {
                        r0(true);
                        return;
                    }
                }
                return;
            }
        }
        ((ou) arrayList.get(0)).i = true;
        if (this.x) {
            this.C = "recognized";
            ou ouVar6 = this.N;
            ouVar6.getClass();
            u0(ouVar6.c, true);
            w0();
        }
        this.N = null;
    }

    public final void v0() {
        if (this.D != null) {
            return;
        }
        mu muVar = this.w ? this.A : this.v;
        if (muVar != null) {
            b40 b40Var = this.u;
            if (b40Var == null) {
                b40Var = new b40();
                this.u = b40Var;
            }
            this.z.t0(b40Var);
            b40 b40Var2 = this.u;
            b40Var2.getClass();
            ni a = muVar.a(b40Var2);
            o0(a);
            this.D = a;
        }
    }

    public final void w0() {
        lm0 lm0Var = (lm0) q3.o(this, kf.v);
        if (lm0Var != null) {
            lm0Var.a();
        }
        this.y.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r17v0, types: [df, ni, oi, rr, t20, tb] */
    @Override // defpackage.yc0
    public final void x(rc0 rc0Var, sc0 sc0Var, long j) {
        boolean z;
        char c = ' ';
        long j2 = 4294967295L;
        long j3 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.H = (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j3 >> 32)) << 32);
        v0();
        boolean z2 = this.x;
        sc0 sc0Var2 = sc0.f;
        int i = 1;
        boolean z3 = false;
        if (z2) {
            if (this.B == null) {
                vr vrVar = new vr(this);
                o0(vrVar);
                this.B = vrVar;
            }
            if (sc0Var == sc0Var2) {
                int i2 = rc0Var.c;
                if (i2 == 4) {
                    q3.A(c0(), null, new k(this, null, 0), 3);
                } else if (i2 == 5) {
                    q3.A(c0(), null, new k(this, null, 1), 3);
                }
            }
        }
        if (sc0Var != sc0Var2) {
            if (sc0Var == sc0.g) {
                if (this.M != null) {
                    List list = rc0Var.a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        vc0 vc0Var = (vc0) list.get(i3);
                        if (vc0Var.c() && vc0Var != this.M) {
                            r0(false);
                            break;
                        }
                        i3++;
                    }
                }
                if (lw.i(this.C, "recognized")) {
                    this.C = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.M == null) {
            if (to0.b(rc0Var, true)) {
                vc0 vc0Var2 = (vc0) rc0Var.a.get(0);
                vc0Var2.a();
                this.M = vc0Var2;
                if (this.x) {
                    this.C = "waiting";
                    b40 b40Var = this.u;
                    if (b40Var != null) {
                        hd0 hd0Var = new hd0(vc0Var2.c);
                        if (s0()) {
                            this.L = q3.A(c0(), null, new i(b40Var, hd0Var, this, null, 1), 3);
                            return;
                        } else {
                            this.E = hd0Var;
                            q3.A(c0(), null, new h(b40Var, hd0Var, null, 2), 3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        List list2 = rc0Var.a;
        int size2 = list2.size();
        int i4 = 0;
        while (i4 < size2) {
            vc0 vc0Var3 = (vc0) list2.get(i4);
            if (((vc0Var3.c() || !vc0Var3.h || vc0Var3.d) ? 0 : i) == 0) {
                float max = Math.max(0.0f, Float.intBitsToFloat((int) (nh.a0(this).A.K(((wt0) q3.o(this, kf.t)).c()) >> c)) - ((int) (j >> c))) / 2.0f;
                long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (r1 & j2)) - ((int) (j & j2))) / 2.0f) & j2) | (Float.floatToRawIntBits(max) << c);
                int size3 = list2.size();
                int i5 = 0;
                while (i5 < size3) {
                    vc0 vc0Var4 = (vc0) list2.get(i5);
                    if (vc0Var4.c()) {
                        z = z3;
                    } else {
                        ?? r12 = vc0Var4.i == i ? i : z3;
                        long j4 = vc0Var4.c;
                        char c2 = c;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> c2));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 & j2));
                        float f = (float) r12;
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits >> c2)) * f;
                        long j5 = j2;
                        float f2 = ((int) (j >> c2)) + intBitsToFloat3;
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (floatToRawIntBits & j5)) * f;
                        if (((intBitsToFloat > f2) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat2 < (-intBitsToFloat4))) || (intBitsToFloat2 > ((int) (j & j5)) + intBitsToFloat4)) {
                            z = false;
                        } else {
                            i5++;
                            j2 = j5;
                            i = 1;
                            c = ' ';
                            z3 = false;
                        }
                    }
                    r0(z);
                    return;
                }
                return;
            }
            i4++;
            j2 = j2;
            i = 1;
            c = ' ';
        }
        ((vc0) list2.get(0)).a();
        if (this.x) {
            this.C = "recognized";
            vc0 vc0Var5 = this.M;
            vc0Var5.getClass();
            u0(vc0Var5.c, false);
            w0();
        }
        this.M = null;
    }

    @Override // defpackage.q60
    public final void z() {
        if (this.w) {
            m20.h(this, new b(this, 0));
        }
    }
}
