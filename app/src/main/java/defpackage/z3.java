package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class z3 implements ci, View.OnAttachStateChangeListener {
    public final e3 e;
    public final b3 f;
    public p2 g;
    public final ArrayList h = new ArrayList();
    public v3 i = v3.e;
    public boolean j = true;
    public final o9 k = lw.a(1, 6, null);
    public y30 l;
    public long m;
    public final y30 n;
    public vj0 o;
    public boolean p;
    public final o q;

    public z3(e3 e3Var, b3 b3Var) {
        this.e = e3Var;
        this.f = b3Var;
        new Handler(Looper.getMainLooper());
        y30 y30Var = wv.a;
        y30Var.getClass();
        this.l = y30Var;
        this.n = new y30();
        this.o = new vj0(e3Var.getSemanticsOwner().a(), y30Var);
        this.q = new o(2, this);
    }

    @Override // defpackage.ci
    public final void a(ez ezVar) {
        m(this.e.getSemanticsOwner().a());
        i();
        this.g = null;
    }

    @Override // defpackage.ci
    public final void b(ez ezVar) {
        this.g = (p2) this.f.b();
        l(-1, this.e.getSemanticsOwner().a());
        i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (defpackage.q3.p(100, r0) == r4) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(og ogVar) {
        y3 y3Var;
        int i;
        n9 n9Var;
        n9 n9Var2;
        Object a;
        if (ogVar instanceof y3) {
            y3Var = (y3) ogVar;
            int i2 = y3Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y3Var.h = i2 - Integer.MIN_VALUE;
                Object obj = y3Var.f;
                i = y3Var.h;
                dh dhVar = dh.e;
                if (i != 0) {
                    t30.z(obj);
                    n9Var = new n9(this.k);
                    y3Var.e = n9Var;
                    y3Var.h = 1;
                    a = n9Var.a(y3Var);
                    if (a != dhVar) {
                    }
                    return dhVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n9Var2 = y3Var.e;
                    t30.z(obj);
                    n9Var = n9Var2;
                    y3Var.e = n9Var;
                    y3Var.h = 1;
                    a = n9Var.a(y3Var);
                    if (a != dhVar) {
                        n9Var2 = n9Var;
                        obj = a;
                        if (((Boolean) obj).booleanValue()) {
                            return fs0.a;
                        }
                        n9Var2.c();
                        if (h()) {
                            i();
                        }
                        Handler handler = this.e.getHandler();
                        if (!this.p && handler != null) {
                            this.p = true;
                            handler.post(this.q);
                        }
                        y3Var.e = n9Var2;
                        y3Var.h = 2;
                    }
                    return dhVar;
                }
                n9Var2 = y3Var.e;
                t30.z(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        y3Var = new y3(this, ogVar);
        Object obj2 = y3Var.f;
        i = y3Var.h;
        dh dhVar2 = dh.e;
        if (i != 0) {
        }
    }

    public final void f(vv vvVar) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        vv vvVar2 = vvVar;
        int[] iArr3 = vvVar2.b;
        long[] jArr = vvVar2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        vj0 vj0Var = (vj0) this.n.b(i7);
                        wj0 wj0Var = (wj0) vvVar2.b(i7);
                        uj0 uj0Var = wj0Var != null ? wj0Var.a : null;
                        if (uj0Var == null) {
                            throw j2.f("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = uj0Var.f;
                        k40 k40Var = uj0Var.d.e;
                        if (vj0Var == null) {
                            Object[] objArr = k40Var.b;
                            long[] jArr2 = k40Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                ak0 ak0Var = (ak0) objArr[(i10 << 3) + i12];
                                                ak0 ak0Var2 = yj0.A;
                                                if (lw.i(ak0Var, ak0Var2)) {
                                                    Object g = k40Var.g(ak0Var2);
                                                    if (g == null) {
                                                        g = null;
                                                    }
                                                    List list = (List) g;
                                                    k(String.valueOf(list != null ? (p6) ac.a0(list) : null), i8);
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    i10++;
                                    j5 = j;
                                    i9 = 8;
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = k40Var.b;
                            long[] jArr3 = k40Var.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                ak0 ak0Var3 = (ak0) objArr2[(i13 << 3) + i15];
                                                ak0 ak0Var4 = yj0.A;
                                                if (lw.i(ak0Var3, ak0Var4)) {
                                                    Object g2 = vj0Var.a.e.g(ak0Var4);
                                                    if (g2 == null) {
                                                        g2 = null;
                                                    }
                                                    List list2 = (List) g2;
                                                    p6 p6Var = list2 != null ? (p6) ac.a0(list2) : null;
                                                    Object g3 = k40Var.g(ak0Var4);
                                                    if (g3 == null) {
                                                        g3 = null;
                                                    }
                                                    List list3 = (List) g3;
                                                    p6 p6Var2 = list3 != null ? (p6) ac.a0(list3) : null;
                                                    if (!lw.i(p6Var, p6Var2)) {
                                                        k(String.valueOf(p6Var2), i8);
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                    }
                                    if (i13 == length3) {
                                        break;
                                    }
                                    i13++;
                                    i6 = i;
                                    jArr4 = jArr5;
                                }
                                i2 = 8;
                            }
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    vvVar2 = vvVar;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            vvVar2 = vvVar;
            iArr3 = iArr;
        }
    }

    public final vv g() {
        if (this.j) {
            this.j = false;
            this.l = nh.t(this.e.getSemanticsOwner(), new l0(5, (byte) 0));
            this.m = System.currentTimeMillis();
        }
        return this.l;
    }

    public final boolean h() {
        return this.g != null;
    }

    public final void i() {
        p2 p2Var = this.g;
        if (p2Var == null) {
            return;
        }
        Object obj = p2Var.f;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zf zfVar = (zf) arrayList.get(i);
            int ordinal = zfVar.c.ordinal();
            if (ordinal == 0) {
                t3 t3Var = zfVar.d;
                if (t3Var != null) {
                    ViewStructure viewStructure = (ViewStructure) t3Var.f;
                    if (Build.VERSION.SDK_INT >= 29) {
                        bg.d(m2.f(obj), viewStructure);
                    }
                }
            } else {
                if (ordinal != 1) {
                    z6.j();
                    return;
                }
                AutofillId l = p2Var.l(zfVar.a);
                if (l != null && Build.VERSION.SDK_INT >= 29) {
                    bg.e(m2.f(obj), l);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            bg.g(m2.f(obj), ((View) p2Var.g).getAutofillId(), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void j(uj0 uj0Var, vj0 vj0Var) {
        List i;
        int size;
        List i2;
        int i3 = 0;
        u3 u3Var = new u3(i3, vj0Var, this);
        uj0Var.getClass();
        i = uj0Var.i((r3 & 1) != 0 ? !uj0Var.b : false, (r3 & 2) == 0);
        size = i.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = i.get(i5);
            if (g().a(((uj0) obj).f)) {
                u3Var.invoke(Integer.valueOf(i4), obj);
                i4++;
            }
        }
        i2 = uj0Var.i((r3 & 1) != 0 ? !uj0Var.b : false, (r3 & 2) == 0);
        int size2 = i2.size();
        while (i3 < size2) {
            uj0 uj0Var2 = (uj0) i2.get(i3);
            vv g = g();
            int i6 = uj0Var2.f;
            if (g.a(i6)) {
                y30 y30Var = this.n;
                if (y30Var.a(i6)) {
                    Object b = y30Var.b(i6);
                    if (b == null) {
                        throw j2.f("node not present in pruned tree before this change");
                    }
                    j(uj0Var2, (vj0) b);
                } else {
                    continue;
                }
            }
            i3++;
        }
    }

    public final void k(String str, int i) {
        p2 p2Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (p2Var = this.g) != null) {
            AutofillId l = p2Var.l(i);
            if (l == null) {
                throw j2.f("Invalid content capture ID");
            }
            if (i2 >= 29) {
                bg.f(m2.f(p2Var.f), l, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, uj0 uj0Var) {
        pq pqVar;
        oe0 oe0Var;
        t3 t3Var;
        String p;
        List i2;
        int size;
        pq pqVar2;
        if (h()) {
            k40 k40Var = uj0Var.d.e;
            Object g = k40Var.g(yj0.C);
            if (g == null) {
                g = null;
            }
            Boolean bool = (Boolean) g;
            if (this.i == v3.e && lw.i(bool, Boolean.TRUE)) {
                Object g2 = k40Var.g(pj0.l);
                if (g2 == null) {
                    g2 = null;
                }
                p0 p0Var = (p0) g2;
                if (p0Var != null && (pqVar2 = (pq) p0Var.b) != null) {
                }
            } else if (this.i == v3.f && lw.i(bool, Boolean.FALSE)) {
                Object g3 = k40Var.g(pj0.l);
                if (g3 == null) {
                    g3 = null;
                }
                p0 p0Var2 = (p0) g3;
                if (p0Var2 != null && (pqVar = (pq) p0Var2.b) != null) {
                }
            }
            int i3 = uj0Var.f;
            p2 p2Var = this.g;
            if (p2Var != null) {
                int i4 = Build.VERSION.SDK_INT;
                int i5 = 29;
                if (i4 >= 29) {
                    AutofillId autofillId = this.e.getAutofillId();
                    uj0 l = uj0Var.l();
                    int i6 = uj0Var.f;
                    if (l == null || (autofillId = p2Var.l(l.f)) != null) {
                        t3 t3Var2 = i4 >= 29 ? new t3(i5, bg.c(m2.f(p2Var.f), autofillId, i6)) : null;
                        if (t3Var2 != null) {
                            ViewStructure viewStructure = (ViewStructure) t3Var2.f;
                            qj0 qj0Var = uj0Var.d;
                            ak0 ak0Var = yj0.K;
                            k40 k40Var2 = qj0Var.e;
                            if (!k40Var2.c(ak0Var)) {
                                Bundle extras = viewStructure.getExtras();
                                if (extras != null) {
                                    extras.putLong("android.view.contentcapture.EventTimestamp", this.m);
                                    extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                                }
                                Object g4 = k40Var2.g(yj0.y);
                                if (g4 == null) {
                                    g4 = null;
                                }
                                String str = (String) g4;
                                if (str != null) {
                                    viewStructure.setId(i6, null, null, str);
                                }
                                Object g5 = k40Var2.g(yj0.n);
                                if (g5 == null) {
                                    g5 = null;
                                }
                                if (((Boolean) g5) != null) {
                                    viewStructure.setClassName("android.widget.ViewGroup");
                                }
                                Object g6 = k40Var2.g(yj0.A);
                                if (g6 == null) {
                                    g6 = null;
                                }
                                List list = (List) g6;
                                if (list != null) {
                                    viewStructure.setClassName("android.widget.TextView");
                                    viewStructure.setText(c00.a(list, "\n", null, 62));
                                }
                                Object g7 = k40Var2.g(yj0.E);
                                if (g7 == null) {
                                    g7 = null;
                                }
                                p6 p6Var = (p6) g7;
                                if (p6Var != null) {
                                    viewStructure.setClassName("android.widget.EditText");
                                    viewStructure.setText(p6Var);
                                }
                                Object g8 = k40Var2.g(yj0.a);
                                if (g8 == null) {
                                    g8 = null;
                                }
                                List list2 = (List) g8;
                                if (list2 != null) {
                                    viewStructure.setContentDescription(c00.a(list2, "\n", null, 62));
                                }
                                Object g9 = k40Var2.g(yj0.x);
                                if (g9 == null) {
                                    g9 = null;
                                }
                                jg0 jg0Var = (jg0) g9;
                                if (jg0Var != null && (p = v10.p(jg0Var.a)) != null) {
                                    viewStructure.setClassName(p);
                                }
                                np0 h = v10.h(qj0Var);
                                if (h != null) {
                                    mp0 mp0Var = h.a;
                                    zp0 zp0Var = mp0Var.b;
                                    si siVar = mp0Var.g;
                                    viewStructure.setTextStyle(siVar.g() * siVar.k() * bq0.c(zp0Var.a.b), 0, 0, 0);
                                }
                                d60 d = uj0Var.d();
                                if (d != null) {
                                    d60 d60Var = d.A0().r ? d : null;
                                    if (d60Var != null) {
                                        oe0Var = uj0Var.a(d60Var);
                                        float f = oe0Var.a;
                                        float f2 = oe0Var.b;
                                        viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (oe0Var.c - f), (int) (oe0Var.d - f2));
                                        t3Var = t3Var2;
                                        if (t3Var != null) {
                                            this.h.add(new zf(i3, this.m, ag.e, t3Var));
                                        }
                                        i2 = uj0Var.i((r3 & 1) != 0 ? !uj0Var.b : false, (r3 & 2) == 0);
                                        size = i2.size();
                                        int i7 = 0;
                                        for (int i8 = 0; i8 < size; i8++) {
                                            Object obj = i2.get(i8);
                                            if (g().a(((uj0) obj).f)) {
                                                l(i7, (uj0) obj);
                                                i7++;
                                            }
                                        }
                                    }
                                }
                                oe0Var = oe0.e;
                                float f3 = oe0Var.a;
                                float f22 = oe0Var.b;
                                viewStructure.setDimens((int) f3, (int) f22, 0, 0, (int) (oe0Var.c - f3), (int) (oe0Var.d - f22));
                                t3Var = t3Var2;
                                if (t3Var != null) {
                                }
                                i2 = uj0Var.i((r3 & 1) != 0 ? !uj0Var.b : false, (r3 & 2) == 0);
                                size = i2.size();
                                int i72 = 0;
                                while (i8 < size) {
                                }
                            }
                        }
                    }
                }
            }
            t3Var = null;
            if (t3Var != null) {
            }
            i2 = uj0Var.i((r3 & 1) != 0 ? !uj0Var.b : false, (r3 & 2) == 0);
            size = i2.size();
            int i722 = 0;
            while (i8 < size) {
            }
        }
    }

    public final void m(uj0 uj0Var) {
        List i;
        if (h()) {
            this.h.add(new zf(uj0Var.f, this.m, ag.f, null));
            i = uj0Var.i((r3 & 1) != 0 ? !uj0Var.b : false, (r3 & 2) == 0);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                m((uj0) i.get(i2));
            }
        }
    }

    public final void n() {
        y30 y30Var = this.n;
        y30Var.c();
        vv g = g();
        int[] iArr = g.b;
        Object[] objArr = g.c;
        long[] jArr = g.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            y30Var.h(iArr[i4], new vj0(((wj0) objArr[i4]).a, g()));
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
        this.o = new vj0(this.e.getSemanticsOwner().a(), g());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.e.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.q);
        this.g = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
