package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class mv0 extends uv0 {
    public static boolean m;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public nv[] d;
    public nv e;
    public yv0 f;
    public nv g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public mv0(yv0 yv0Var, WindowInsets windowInsets) {
        super(yv0Var);
        this.e = null;
        this.k = new Rect[10][];
        this.l = new Rect[10][];
        this.c = windowInsets;
    }

    private sj A(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.r()) {
            return sj.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        og0 q2 = t10.q(display, 0);
        og0 q3 = t10.q(display, 1);
        og0 q4 = t10.q(display, 2);
        og0 q5 = t10.q(display, 3);
        return sj.a(point.x, point.y, false, q2 != null ? q2.b : 0, q3 != null ? q3.b : 0, q4 != null ? q4.b : 0, q5 != null ? q5.b : 0);
    }

    private static List<Rect> B(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[p30.h(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] C(nv nvVar) {
        ArrayList arrayList = new ArrayList();
        int i = nvVar.a;
        int i2 = nvVar.d;
        int i3 = nvVar.c;
        int i4 = nvVar.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, nvVar.a, this.i));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.j, i4));
        }
        if (i3 != 0) {
            int i5 = this.j;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.i));
        }
        if (i2 != 0) {
            int i6 = this.i;
            arrayList.add(new Rect(0, i6 - i2, this.j, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private nv D(int i, boolean z) {
        nv nvVar = nv.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                nvVar = nv.a(nvVar, E(i2, z));
            }
        }
        return nvVar;
    }

    private nv F() {
        yv0 yv0Var = this.f;
        return yv0Var != null ? yv0Var.a.k() : nv.e;
    }

    private nv G(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!m) {
            I();
        }
        Method method = n;
        if (method != null && o != null && p != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) p.get(q.get(invoke));
                if (rect != null) {
                    return nv.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void I() {
        try {
            n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            o = cls;
            p = cls.getDeclaredField("mVisibleInsets");
            q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            p.setAccessible(true);
            q.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        m = true;
    }

    public static boolean K(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    public nv E(int i, boolean z) {
        nv k;
        int i2;
        nv nvVar = nv.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    nv[] nvVarArr = this.d;
                    k = nvVarArr != null ? nvVarArr[p30.h(8)] : null;
                    if (k != null) {
                        return k;
                    }
                    nv m2 = m();
                    nv F = F();
                    int i3 = m2.d;
                    if (i3 > F.d) {
                        return nv.b(0, 0, 0, i3);
                    }
                    nv nvVar2 = this.g;
                    if (nvVar2 != null && !nvVar2.equals(nvVar) && (i2 = this.g.d) > F.d) {
                        return nv.b(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return l();
                    }
                    if (i == 32) {
                        return j();
                    }
                    if (i == 64) {
                        return n();
                    }
                    if (i == 128) {
                        yv0 yv0Var = this.f;
                        qj g = yv0Var != null ? yv0Var.a.g() : g();
                        if (g != null) {
                            DisplayCutout displayCutout = g.a;
                            return nv.b(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                        }
                    }
                }
            } else {
                if (z) {
                    nv F2 = F();
                    nv k2 = k();
                    return nv.b(Math.max(F2.a, k2.a), 0, Math.max(F2.c, k2.c), Math.max(F2.d, k2.d));
                }
                if ((this.h & 2) == 0) {
                    nv m3 = m();
                    yv0 yv0Var2 = this.f;
                    k = yv0Var2 != null ? yv0Var2.a.k() : null;
                    int i4 = m3.d;
                    if (k != null) {
                        i4 = Math.min(i4, k.d);
                    }
                    return nv.b(m3.a, 0, m3.c, i4);
                }
            }
        } else {
            if (z) {
                return nv.b(0, Math.max(F().b, m().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return nv.b(0, m().b, 0, 0);
            }
        }
        return nvVar;
    }

    public boolean H(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !E(i, false).equals(nv.e);
    }

    public void J(nv nvVar) {
        this.g = nvVar;
    }

    @Override // defpackage.uv0
    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        nv G = G(view);
        if (G == null) {
            G = nv.e;
        }
        J(G);
    }

    @Override // defpackage.uv0
    public List<Rect> e(int i) {
        return B(this.k, i);
    }

    @Override // defpackage.uv0
    public List<Rect> f(int i) {
        return B(this.l, i);
    }

    @Override // defpackage.uv0
    public nv h(int i) {
        return D(i, false);
    }

    @Override // defpackage.uv0
    public nv i(int i) {
        return D(i, true);
    }

    @Override // defpackage.uv0
    public final nv m() {
        nv nvVar = this.e;
        if (nvVar != null) {
            return nvVar;
        }
        WindowInsets windowInsets = this.c;
        nv b = nv.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.e = b;
        return b;
    }

    @Override // defpackage.uv0
    public void o(View view) {
        A(view);
    }

    @Override // defpackage.uv0
    public void p() {
        for (int i = 1; i <= 512; i <<= 1) {
            int h = p30.h(i);
            this.k[h] = C(h(i));
            if (i != 8) {
                this.l[h] = C(i(i));
            }
        }
    }

    @Override // defpackage.uv0
    public boolean r() {
        return this.c.isRound();
    }

    @Override // defpackage.uv0
    public boolean s(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !H(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.uv0
    public void u(nv[] nvVarArr) {
        this.d = nvVarArr;
    }

    @Override // defpackage.uv0
    public void v(yv0 yv0Var) {
        this.f = yv0Var;
    }

    @Override // defpackage.uv0
    public void x(int i) {
        this.h = i;
    }

    @Override // defpackage.uv0
    public void y(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.uv0
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.uv0
    public void t(sj sjVar) {
    }
}
