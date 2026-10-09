package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ov extends uu0 implements Runnable, x60, View.OnAttachStateChangeListener {
    public boolean g;
    public int h;
    public yv0 i;
    public final k40 j;
    public final t90 k;
    public final h40 l;
    public final fm0 m;

    public ov() {
        super(1);
        k40 k40Var = new k40(9);
        ew0.a.getClass();
        k40Var.l(dw0.b, new uw0("caption bar"));
        k40Var.l(dw0.c, new uw0("display cutout"));
        k40Var.l(dw0.d, new uw0("ime"));
        k40Var.l(dw0.e, new uw0("mandatory system gestures"));
        k40Var.l(dw0.f, new uw0("navigation bars"));
        k40Var.l(dw0.g, new uw0("status bars"));
        k40Var.l(dw0.h, new uw0("system gestures"));
        k40Var.l(dw0.i, new uw0("tappable element"));
        k40Var.l(dw0.j, new uw0("waterfall"));
        this.j = k40Var;
        this.k = new t90(0);
        this.l = new h40(4);
        this.m = new fm0();
    }

    @Override // defpackage.x60
    public final yv0 a(View view, yv0 yv0Var) {
        if (this.g) {
            this.i = yv0Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return yv0Var;
            }
        } else if (this.h == 0) {
            f(yv0Var);
        }
        return yv0Var;
    }

    @Override // defpackage.uu0
    public final void b(dv0 dv0Var) {
        boolean z = false;
        this.g = false;
        int d = dv0Var.a.d();
        this.h &= ~d;
        this.i = null;
        ew0 ew0Var = (ew0) gw0.a.b(d);
        if (ew0Var != null) {
            Object g = this.j.g(ew0Var);
            g.getClass();
            uw0 uw0Var = (uw0) g;
            uw0Var.c.g(0.0f);
            uw0Var.e.g(1.0f);
            uw0Var.d.g(0L);
            uw0Var.c.g(0.0f);
            uw0Var.b.setValue(Boolean.FALSE);
            uw0Var.j = -1L;
            uw0Var.k = -1L;
            t90 t90Var = this.k;
            t90Var.h(t90Var.g() + 1);
            synchronized (xl0.c) {
                l40 l40Var = xl0.j.h;
                if (l40Var != null) {
                    if (l40Var.h()) {
                        z = true;
                    }
                }
            }
            if (z) {
                xl0.c();
            }
        }
    }

    @Override // defpackage.uu0
    public final void c(dv0 dv0Var) {
        this.g = true;
    }

    @Override // defpackage.uu0
    public final yv0 d(yv0 yv0Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dv0 dv0Var = (dv0) list.get(i);
            ew0 ew0Var = (ew0) gw0.a.b(dv0Var.a.d());
            if (ew0Var != null) {
                Object g = this.j.g(ew0Var);
                g.getClass();
                uw0 uw0Var = (uw0) g;
                if (((Boolean) uw0Var.b.getValue()).booleanValue()) {
                    cv0 cv0Var = dv0Var.a;
                    uw0Var.c.g(cv0Var.c());
                    uw0Var.e.g(cv0Var.a());
                    uw0Var.d.g(cv0Var.b());
                }
            }
        }
        f(yv0Var);
        return yv0Var;
    }

    @Override // defpackage.uu0
    public final p2 e(dv0 dv0Var, p2 p2Var) {
        yv0 yv0Var = this.i;
        boolean z = false;
        this.g = false;
        this.i = null;
        if (dv0Var.a.b() > 0 && yv0Var != null) {
            int d = dv0Var.a.d();
            this.h |= d;
            ew0 ew0Var = (ew0) gw0.a.b(d);
            if (ew0Var != null) {
                Object g = this.j.g(ew0Var);
                g.getClass();
                uw0 uw0Var = (uw0) g;
                nv h = yv0Var.a.h(d);
                long j = (h.a << 48) | (h.b << 32) | (h.c << 16) | h.d;
                long j2 = uw0Var.h;
                if (!v10.d(j, j2)) {
                    uw0Var.j = j2;
                    uw0Var.k = j;
                    uw0Var.b.setValue(Boolean.TRUE);
                    cv0 cv0Var = dv0Var.a;
                    uw0Var.c.g(cv0Var.c());
                    uw0Var.e.g(cv0Var.a());
                    uw0Var.d.g(cv0Var.b());
                    t90 t90Var = this.k;
                    t90Var.h(t90Var.g() + 1);
                    synchronized (xl0.c) {
                        l40 l40Var = xl0.j.h;
                        if (l40Var != null) {
                            if (l40Var.h()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        xl0.c();
                        return p2Var;
                    }
                }
            }
        }
        return p2Var;
    }

    public final void f(yv0 yv0Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j2;
        int i;
        y30 y30Var = gw0.a;
        int[] iArr3 = y30Var.b;
        Object[] objArr3 = y30Var.c;
        long[] jArr3 = y30Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            ew0 ew0Var = (ew0) objArr3[i6];
                            nv h = yv0Var.a.h(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (h.a << 48) | (h.b << 32) | (h.c << 16) | h.d;
                            Object g = this.j.g(ew0Var);
                            g.getClass();
                            uw0 uw0Var = (uw0) g;
                            j2 = j3;
                            if (!v10.d(j4, uw0Var.h)) {
                                uw0Var.h = j4;
                                z2 = true;
                                if (!v10.d(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                nv i8 = yv0Var.a.i(i7);
                                objArr2 = objArr3;
                                long j5 = (i8.b << 32) | (i8.a << 48) | (i8.c << 16) | i8.d;
                                if (!v10.d(uw0Var.i, j5)) {
                                    uw0Var.i = j5;
                                    z2 = true;
                                    if (!v10.d(j5, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            uw0Var.a.setValue(Boolean.valueOf(yv0Var.a.s(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        qj g2 = yv0Var.a.g();
        if (g2 == null) {
            j = 0;
        } else {
            nv a = g2.a();
            j = (a.a << c3) | (a.b << c2) | (a.c << c) | a.d;
        }
        k40 k40Var = this.j;
        ew0.a.getClass();
        Object g3 = k40Var.g(dw0.j);
        g3.getClass();
        uw0 uw0Var2 = (uw0) g3;
        uw0Var2.a.setValue(Boolean.valueOf(!v10.d(j, 0L)));
        if (!v10.d(uw0Var2.h, j)) {
            uw0Var2.h = j;
            uw0Var2.i = j;
            z2 = z;
            if (!v10.d(j, 0L)) {
                z3 = z2;
            }
        }
        if (g2 == null) {
            h40 h40Var = this.l;
            if (h40Var.b > 0) {
                h40Var.d();
                this.m.clear();
                z2 = z;
            }
        } else {
            List<Rect> boundingRects = g2.a.getBoundingRects();
            int size = boundingRects.size();
            h40 h40Var2 = this.l;
            if (size < h40Var2.b) {
                h40Var2.m(boundingRects.size(), this.l.b);
                this.m.d(boundingRects.size(), this.m.size());
                z2 = z;
            } else {
                int size2 = boundingRects.size() - this.l.b;
                int i9 = 0;
                while (i9 < size2) {
                    h40 h40Var3 = this.l;
                    h40Var3.a(p30.m(boundingRects.get(h40Var3.b)));
                    this.m.add(new jv(j2.g("display cutout rect ", this.l.b)));
                    i9++;
                    z2 = z;
                }
            }
            int size3 = boundingRects.size();
            for (int i10 = 0; i10 < size3; i10++) {
                Rect rect = boundingRects.get(i10);
                p40 p40Var = (p40) this.l.g(i10);
                if (!lw.i(p40Var.getValue(), rect)) {
                    p40Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!boundingRects.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.k.g() != 0) && z2) {
            t90 t90Var = this.k;
            t90Var.h(t90Var.g() + 1);
            synchronized (xl0.c) {
                l40 l40Var = xl0.j.h;
                if (l40Var != null) {
                    boolean z5 = z;
                    z4 = l40Var.h() == z5 ? z5 : false;
                }
            }
            if (z4) {
                xl0.c();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = ut0.a;
        qt0.b(view, this);
        dv0.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = ut0.a;
        qt0.b(view, null);
        dv0.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.g) {
            this.h = 0;
            this.g = false;
            yv0 yv0Var = this.i;
            if (yv0Var != null) {
                f(yv0Var);
                this.i = null;
            }
        }
    }
}
