package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ko0 extends t20 implements zc0, si, yc0 {
    public rc0 A;
    public Object s;
    public Object t;
    public PointerInputEventHandler u;
    public wm0 v;
    public rc0 w = io0.a;
    public final t40 x;
    public final t40 y;
    public final t40 z;

    public ko0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.s = obj;
        this.t = obj2;
        this.u = pointerInputEventHandler;
        t40 t40Var = new t40(new jo0[16]);
        this.x = t40Var;
        this.y = t40Var;
        this.z = new t40(new jo0[16]);
    }

    @Override // defpackage.yc0
    public final void L() {
        p0();
    }

    @Override // defpackage.yc0
    public final void P() {
        rc0 rc0Var = this.A;
        if (rc0Var == null) {
            return;
        }
        List list = rc0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((vc0) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    vc0 vc0Var = (vc0) list.get(i2);
                    long j = vc0Var.a;
                    long j2 = vc0Var.c;
                    long j3 = vc0Var.b;
                    float f = vc0Var.e;
                    boolean z = vc0Var.d;
                    arrayList.add(new vc0(j, j3, j2, false, f, j3, j2, z, z, vc0Var.i, 0L, 1.0f, 0L));
                }
                rc0 rc0Var2 = new rc0(arrayList, null);
                this.w = rc0Var2;
                o0(rc0Var2, sc0.e);
                o0(rc0Var2, sc0.f);
                o0(rc0Var2, sc0.g);
                this.A = null;
                return;
            }
        }
    }

    @Override // defpackage.ni, defpackage.yc0
    public final void a() {
        p0();
    }

    @Override // defpackage.si
    public final float g() {
        return nh.a0(this).A.g();
    }

    @Override // defpackage.t20
    public final void h0() {
        p0();
    }

    @Override // defpackage.si
    public final float k() {
        return nh.a0(this).A.k();
    }

    public final void o0(rc0 rc0Var, sc0 sc0Var) {
        ja jaVar;
        ja jaVar2;
        synchronized (this.y) {
            t40 t40Var = this.z;
            t40Var.c(t40Var.g, this.x);
        }
        try {
            int ordinal = sc0Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    t40 t40Var2 = this.z;
                    int i = t40Var2.g - 1;
                    Object[] objArr = t40Var2.e;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            jo0 jo0Var = (jo0) objArr[i];
                            if (sc0Var == jo0Var.h && (jaVar2 = jo0Var.g) != null) {
                                jo0Var.g = null;
                                jaVar2.resumeWith(rc0Var);
                            }
                            i--;
                        }
                    }
                    this.z.g();
                }
                if (ordinal != 2) {
                    throw new id();
                }
            }
            t40 t40Var3 = this.z;
            Object[] objArr2 = t40Var3.e;
            int i2 = t40Var3.g;
            for (int i3 = 0; i3 < i2; i3++) {
                jo0 jo0Var2 = (jo0) objArr2[i3];
                if (sc0Var == jo0Var2.h && (jaVar = jo0Var2.g) != null) {
                    jo0Var2.g = null;
                    jaVar.resumeWith(rc0Var);
                }
            }
            this.z.g();
        } catch (Throwable th) {
            this.z.g();
            throw th;
        }
    }

    public final void p0() {
        wm0 wm0Var = this.v;
        if (wm0Var != null) {
            wm0Var.y(new x20("Pointer input was reset", 1));
            this.v = null;
        }
    }

    @Override // defpackage.yc0
    public final void x(rc0 rc0Var, sc0 sc0Var, long j) {
        if (sc0Var == sc0.e) {
            this.w = rc0Var;
        }
        ng ngVar = null;
        if (this.v == null) {
            this.v = q3.A(c0(), null, new qh(this, ngVar, 4), 1);
        }
        o0(rc0Var, sc0Var);
        List list = rc0Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                rc0Var = null;
                break;
            } else if (!t30.d((vc0) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.A = rc0Var;
    }
}
