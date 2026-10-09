package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class e3 extends ViewGroup implements lg0, ci, r80, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, qo {
    public static Class L0;
    public static Method M0;
    public static Method N0;
    public static final h40 O0 = new h40();
    public static y2 P0;
    public static Method Q0;
    public static Method R0;
    public final k3 A;
    public boolean A0;
    public z3 B;
    public tq B0;
    public final r4 C;
    public final yu C0;
    public final u7 D;
    public final t2 D0;
    public final h40 E;
    public final t2 E0;
    public h40 F;
    public boolean F0;
    public boolean G;
    public boolean G0;
    public final e30 H;
    public boolean H0;
    public final r4 I;
    public final mi0 I0;
    public final w90 J;
    public View J0;
    public final aj K;
    public final i2 K0;
    public final k2 L;
    public final l2 M;
    public boolean N;
    public final a90 O;
    public boolean P;
    public t5 Q;
    public wf R;
    public boolean S;
    public final y10 T;
    public long U;
    public final int[] V;
    public final float[] W;
    public final Matrix a0;
    public final float[] b0;
    public final float[] c0;
    public long d0;
    public final w90 e;
    public boolean e0;
    public long f;
    public long f0;
    public final boolean g;
    public pq g0;
    public nu h;
    public ip0 h0;
    public hz i;
    public hp0 i0;
    public iz j;
    public final AtomicReference j0;
    public uj k;
    public i2 k0;
    public tf0 l;
    public final p40 l0;
    public final g7 m;
    public final w90 m0;
    public final v2 n;
    public mv n0;
    public final w90 o;
    public final v20 o0;
    public final View p;
    public i2 p0;
    public final uo q;
    public MotionEvent q0;
    public tg r;
    public long r0;
    public final e4 s;
    public final p2 s0;
    public final w90 t;
    public final h40 t0;
    public final aj u;
    public float u0;
    public final ov v;
    public float v0;
    public final iy w;
    public float w0;
    public final y30 x;
    public float x0;
    public final qe0 y;
    public final c3 y0;
    public final xj0 z;
    public final v2 z0;

    public e3(Context context, pe peVar) {
        super(context);
        this.e = p30.m(peVar);
        this.f = 9205357640488583168L;
        int i = 1;
        this.g = true;
        this.l = b2.K;
        this.m = new g7();
        int i2 = 0;
        this.n = new v2(this, i2);
        this.o = new w90(lw.f(context), b2.U);
        this.q = new uo(this, this);
        this.r = ((le0) peVar.c()).w;
        this.s = new e4();
        this.t = p30.m(Boolean.FALSE);
        t2 t2Var = new t2(this, i);
        v6 v6Var = dm0.a;
        this.u = new aj(t2Var);
        this.v = new ov();
        int i3 = 3;
        iy iyVar = new iy(3);
        b20 b20Var = iyVar.z;
        mg0 mg0Var = mg0.b;
        if (!lw.i(b20Var, mg0Var)) {
            iyVar.z = mg0Var;
            iyVar.y();
        }
        iyVar.R(getDensity());
        iyVar.V(getViewConfiguration());
        iyVar.U(new d3(this).c(((uo) getFocusOwner()).e).c(m33getDragAndDropManager().c));
        this.w = iyVar;
        y30 y30Var = wv.a;
        this.x = new y30();
        this.y = new qe0(getLayoutNodes(), this);
        this.z = new xj0(getRoot(), new wm(), getLayoutNodes());
        k3 k3Var = new k3(this);
        this.A = k3Var;
        this.B = new z3(this, new b3(0, this, q3.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0));
        r4 r4Var = new r4();
        r4Var.b = this;
        r4Var.c = new Object();
        p4 p4Var = new p4();
        r4Var.e = p4Var;
        if (isAttachedToWindow()) {
            Context context2 = getContext();
            if (!r4Var.a) {
                context2.getApplicationContext().registerComponentCallbacks(p4Var);
                r4Var.a = true;
            }
        }
        addOnAttachStateChangeListener(new q4(i2, r4Var));
        this.C = r4Var;
        this.D = new u7();
        this.E = new h40();
        this.H = new e30();
        iy root = getRoot();
        r4 r4Var2 = new r4();
        r4Var2.b = root;
        r4Var2.c = new ys(root.H.c);
        r4Var2.d = new t3(15);
        r4Var2.e = new bt();
        this.I = r4Var2;
        this.J = p30.m(new Configuration(context.getResources().getConfiguration()));
        this.K = new aj(new t2(this, 2));
        this.L = new k2(this, getAutofillTree());
        this.M = new l2(new p2(context, 14), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.O = new a90(new w2(this, i2));
        this.T = new y10(getRoot());
        this.U = 9223372034707292159L;
        this.V = new int[]{0, 0};
        this.W = u10.j();
        this.a0 = new Matrix();
        this.b0 = u10.j();
        this.c0 = u10.j();
        this.d0 = -1L;
        this.f0 = 9187343241974906880L;
        this.j0 = new AtomicReference(null);
        this.l0 = peVar.p;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = oo.a;
        xx xxVar = xx.e;
        xx xxVar2 = layoutDirection != 0 ? layoutDirection != 1 ? null : xx.f : xxVar;
        this.m0 = p30.m(xxVar2 != null ? xxVar2 : xxVar);
        this.o0 = new v20();
        this.s0 = new p2(20);
        this.t0 = new h40();
        this.u0 = Float.NaN;
        this.v0 = Float.NaN;
        this.w0 = Float.NaN;
        this.x0 = Float.NaN;
        this.y0 = new c3(this);
        this.z0 = new v2(this, i);
        this.B0 = new x2(i2, this);
        this.C0 = new yu(context, new w2(this, i));
        this.D0 = new t2(this, i3);
        this.E0 = new t2(this, 4);
        addOnAttachStateChangeListener(this.B);
        setWillNotDraw(false);
        setFocusable(true);
        p3.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        int i4 = ut0.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        setAccessibilityDelegate(k3Var.f);
        setOnDragListener(m33getDragAndDropManager());
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            l3.a.a(this);
        }
        if (m()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(2131034172, Boolean.TRUE);
            this.p = view;
            addView(view, -1);
        }
        this.I0 = i5 >= 31 ? new mi0() : null;
        this.K0 = new i2(this);
    }

    public static void f(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof e3) {
                ((e3) childAt).s();
            } else if (childAt instanceof ViewGroup) {
                f((ViewGroup) childAt);
            }
        }
    }

    public static long g(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    private final pa getCanvasHolder() {
        return getComposeViewContext().u;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    private final ip0 getLegacyTextInputServiceAndroid() {
        ip0 ip0Var = this.h0;
        if (ip0Var != null) {
            return ip0Var;
        }
        ip0 ip0Var2 = new ip0(getView(), this);
        this.h0 = ip0Var2;
        return ip0Var2;
    }

    private final pe get_composeViewContext() {
        return (pe) this.e.getValue();
    }

    public static final boolean h(e3 e3Var, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public static void k(iy iyVar) {
        iyVar.x();
        t40 t = iyVar.t();
        Object[] objArr = t.e;
        int i = t.g;
        for (int i2 = 0; i2 < i; i2++) {
            k((iy) objArr[i2]);
        }
    }

    public static boolean m() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean n(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !f30.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.t.setValue(Boolean.valueOf(z));
    }

    private void setDensity(si siVar) {
        this.o.setValue(siVar);
    }

    private void setLayoutDirection(xx xxVar) {
        this.m0.setValue(xxVar);
    }

    private final void set_composeViewContext(pe peVar) {
        this.e.setValue(peVar);
    }

    public final void A() {
        int i = Build.VERSION.SDK_INT;
        float[] fArr = this.b0;
        int[] iArr = this.V;
        if (i >= 29) {
            ba.a.a(this, fArr, this.a0, iArr);
        } else {
            u10.E(fArr);
            lw.H(this, fArr, this.W, iArr);
        }
        dx0.x(fArr, this.c0);
    }

    public final boolean B() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void C(iy iyVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (iyVar != null) {
            while (iyVar != null && iyVar.l() == gy.e) {
                if (!this.S) {
                    iy n = iyVar.n();
                    if (n == null) {
                        break;
                    }
                    long j = n.H.c.h;
                    if (wf.f(j) && wf.e(j)) {
                        break;
                    }
                }
                iyVar = iyVar.n();
            }
            if (iyVar == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long D(long j) {
        y();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f0 & 4294967295L));
        return u10.y(this.c0, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public final int E(MotionEvent motionEvent) {
        Object obj;
        if (this.F0) {
            this.F0 = false;
            t3 t3Var = getComposeViewContext().t;
            su0.e.setValue(new ad0(motionEvent.getMetaState()));
        }
        e30 e30Var = this.H;
        p2 c = e30Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        r4 r4Var = this.I;
        if (c == null) {
            if (!r4Var.a) {
                s00 s00Var = (s00) ((t3) r4Var.d).f;
                int i = s00Var.h;
                Object[] objArr = s00Var.g;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                s00Var.h = 0;
                s00Var.e = false;
                ((ys) r4Var.c).c();
            }
            return 0;
        }
        ArrayList arrayList = (ArrayList) c.f;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i3 = size - 1;
                obj = arrayList.get(size);
                if (((xc0) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i3 < 0) {
                    break;
                }
                size = i3;
            }
        }
        obj = null;
        xc0 xc0Var = (xc0) obj;
        if (xc0Var != null) {
            this.f = xc0Var.d;
        }
        int d = r4Var.d(c, this, o(motionEvent));
        c.g = null;
        if ((actionMasked != 0 && actionMasked != 5) || (d & 1) != 0) {
            return d;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        e30Var.c.delete(pointerId);
        e30Var.b.delete(pointerId);
        return d;
    }

    public final void F(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i2 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((i2 < 0 || i2 > i5) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            float f = pointerCoords.x;
            long q = q((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (q >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (q & 4294967295L));
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        p2 c = this.H.c(obtain, this);
        c.getClass();
        this.I.d(c, this, true);
        obtain.recycle();
    }

    public final void G(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (lw.i(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        setDensity(lw.f(getContext()));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        boolean z;
        View view;
        float[] fArr;
        int i;
        int[] iArr = this.V;
        getLocationOnScreen(iArr);
        long j = this.U;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 != i4 || i3 != iArr[1] || this.d0 < 0) {
            this.U = (4294967295L & iArr[1]) | (i4 << 32);
            if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
                t40 t = getRoot().t();
                Object[] objArr = t.e;
                int i5 = t.g;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((iy) objArr[i6]).I.o.Y();
                }
                z = true;
                y();
                view = this.J0;
                if (view == null) {
                    view = getRootView();
                    this.J0 = view;
                }
                qe0 rectManager = getRectManager();
                long j2 = this.U;
                long N = kw.N(this.f0);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.b0;
                if (fArr.length >= 16) {
                    i = 0;
                } else {
                    i = ((((((((((fArr[0] == 1.0f ? 1 : 0) & (fArr[1] == 0.0f ? 1 : 0)) & (fArr[2] == 0.0f ? 1 : 0)) & (fArr[4] == 0.0f ? 1 : 0)) & (fArr[5] == 1.0f ? 1 : 0)) & (fArr[6] == 0.0f ? 1 : 0)) & (fArr[8] == 0.0f ? 1 : 0)) & (fArr[9] == 0.0f ? 1 : 0)) & (fArr[10] == 1.0f ? 1 : 0)) << 1) | ((fArr[15] == 1.0f ? 1 : 0) & (fArr[12] == 0.0f ? 1 : 0) & (fArr[13] == 0.0f ? 1 : 0) & (fArr[14] == 0.0f ? 1 : 0));
                }
                mq0 mq0Var = rectManager.d;
                if ((i & 2) != 0) {
                    fArr = null;
                }
                rectManager.g = !mq0Var.a(j2, N, fArr, width, height) || rectManager.g;
                this.T.a(z);
                getRectManager().a();
            }
        }
        z = false;
        y();
        view = this.J0;
        if (view == null) {
        }
        qe0 rectManager2 = getRectManager();
        long j22 = this.U;
        long N2 = kw.N(this.f0);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.b0;
        if (fArr.length >= 16) {
        }
        mq0 mq0Var2 = rectManager2.d;
        if ((i & 2) != 0) {
        }
        rectManager2.g = !mq0Var2.a(j22, N2, fArr, width2, height2) || rectManager2.g;
        this.T.a(z);
        getRectManager().a();
    }

    public final void I(float f) {
        if (m()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.u0) || f > this.u0) {
                    this.u0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.v0) || f < this.v0) {
                    this.v0 = f;
                }
            }
        }
    }

    @Override // defpackage.ci
    public final void a(ez ezVar) {
        iz izVar = this.j;
        if (izVar != null) {
            i10 i10Var = (i10) izVar.a.f;
            if (i10Var.e && !i10Var.g) {
                ka kaVar = izVar.d;
                if (kaVar != null) {
                    kaVar.cancel();
                }
                izVar.d = null;
                return;
            }
            if (i10Var.f) {
                return;
            }
            if (!i10Var.g) {
                ed0.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!i10Var.h.i()) {
                ed0.a("Attempted to start retaining exited values with pending exited values");
            }
            i10Var.g = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        yo yoVar = ((uo) getFocusOwner()).c;
        if (!yoVar.r) {
            return;
        }
        if (!yoVar.e.r) {
            cv.b("visitSubtreeIf called on an unattached node");
        }
        t40 t40Var = new t40(new t20[16]);
        t20 t20Var = yoVar.e;
        t20 t20Var2 = t20Var.j;
        if (t20Var2 == null) {
            nh.e(t40Var, t20Var);
        } else {
            t40Var.b(t20Var2);
        }
        while (true) {
            int i3 = t40Var.g;
            if (i3 == 0) {
                return;
            }
            t20 t20Var3 = (t20) t40Var.j(i3 - 1);
            if ((t20Var3.h & 1024) != 0) {
                for (t20 t20Var4 = t20Var3; t20Var4 != null && t20Var4.r; t20Var4 = t20Var4.j) {
                    if ((t20Var4.g & 1024) != 0) {
                        t20 t20Var5 = t20Var4;
                        t40 t40Var2 = null;
                        while (t20Var5 != null) {
                            int i4 = 0;
                            if (t20Var5 instanceof yo) {
                                yo yoVar2 = (yo) t20Var5;
                                if (yoVar2.r && yoVar2.q0().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    yo yoVar3 = ((uo) getFocusOwner()).c;
                                    if (yoVar3.r) {
                                        if (!yoVar3.e.r) {
                                            cv.b("visitSubtreeIf called on an unattached node");
                                        }
                                        t40 t40Var3 = new t40(new t20[16]);
                                        t20 t20Var6 = yoVar3.e;
                                        t20 t20Var7 = t20Var6.j;
                                        if (t20Var7 == null) {
                                            nh.e(t40Var3, t20Var6);
                                        } else {
                                            t40Var3.b(t20Var7);
                                        }
                                        while (true) {
                                            int i5 = t40Var3.g;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            t20 t20Var8 = (t20) t40Var3.j(i5 - 1);
                                            if ((t20Var8.h & 1024) != 0) {
                                                for (t20 t20Var9 = t20Var8; t20Var9 != null && t20Var9.r; t20Var9 = t20Var9.j) {
                                                    if ((t20Var9.g & 1024) != 0) {
                                                        t20 t20Var10 = t20Var9;
                                                        t40 t40Var4 = null;
                                                        while (t20Var10 != null) {
                                                            if (t20Var10 instanceof yo) {
                                                                yo yoVar4 = (yo) t20Var10;
                                                                if (yoVar4.r) {
                                                                    vo q0 = yoVar4.q0();
                                                                    if (yoVar4.r && q0.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((t20Var10.g & 1024) != 0 && (t20Var10 instanceof oi)) {
                                                                int i6 = 0;
                                                                for (t20 t20Var11 = ((oi) t20Var10).t; t20Var11 != null; t20Var11 = t20Var11.j) {
                                                                    if ((t20Var11.g & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            t20Var10 = t20Var11;
                                                                        } else {
                                                                            if (t40Var4 == null) {
                                                                                t40Var4 = new t40(new t20[16]);
                                                                            }
                                                                            if (t20Var10 != null) {
                                                                                t40Var4.b(t20Var10);
                                                                                t20Var10 = null;
                                                                            }
                                                                            t40Var4.b(t20Var11);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            t20Var10 = nh.N(t40Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            nh.e(t40Var3, t20Var8);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((t20Var5.g & 1024) != 0 && (t20Var5 instanceof oi)) {
                                for (t20 t20Var12 = ((oi) t20Var5).t; t20Var12 != null; t20Var12 = t20Var12.j) {
                                    if ((t20Var12.g & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            t20Var5 = t20Var12;
                                        } else {
                                            if (t40Var2 == null) {
                                                t40Var2 = new t40(new t20[16]);
                                            }
                                            if (t20Var5 != null) {
                                                t40Var2.b(t20Var5);
                                                t20Var5 = null;
                                            }
                                            t40Var2.b(t20Var12);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            t20Var5 = nh.N(t40Var2);
                        }
                    }
                }
            }
            nh.e(t40Var, t20Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        qj0 q;
        pq pqVar;
        pq pqVar2;
        l2 m32getAutofillManager = m32getAutofillManager();
        if (m32getAutofillManager != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                iy iyVar = (iy) m32getAutofillManager.f.c.b(keyAt);
                if (iyVar != null && (q = iyVar.q()) != null) {
                    k40 k40Var = q.e;
                    Object g = k40Var.g(pj0.f);
                    if (g == null) {
                        g = null;
                    }
                    p0 p0Var = (p0) g;
                    if (p0Var != null && (pqVar2 = (pq) p0Var.b) != null) {
                    }
                    Object g2 = k40Var.g(pj0.g);
                    p0 p0Var2 = (p0) (g2 != null ? g2 : null);
                    if (p0Var2 != null && (pqVar = (pq) p0Var2.b) != null) {
                    }
                }
            }
        }
        k2 m31getAutofill = m31getAutofill();
        if (m31getAutofill != null) {
            u7 u7Var = m31getAutofill.b;
            if (u7Var.a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int keyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(keyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (u7Var.a.get(Integer.valueOf(keyAt2)) != null) {
                        z6.c();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new gh("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new gh("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new gh("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // defpackage.ci
    public final void c(ez ezVar) {
        ka kaVar;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(dx0.t());
        }
        iz izVar = this.j;
        if (izVar != null) {
            hz hzVar = this.i;
            hzVar.getClass();
            i10 i10Var = (i10) izVar.a.f;
            if (!i10Var.e || i10Var.g) {
                return;
            }
            try {
                f5 f5Var = new f5(7, izVar);
                v6 v6Var = ((le0) ((ax0) hzVar).a).b;
                x7 x7Var = (x7) v6Var.b;
                u50 u50Var = new u50();
                u50Var.a = f5Var;
                kaVar = x7Var.a(u50Var, (s2) v6Var.c);
            } catch (CancellationException unused) {
                if (!i10Var.f) {
                    if (i10Var.g) {
                        ed0.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    i10Var.a();
                    i10Var.g = true;
                }
                kaVar = null;
            }
            ka kaVar2 = izVar.d;
            if (kaVar2 != null) {
                kaVar2.cancel();
            }
            izVar.d = kaVar;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.A.e(false, i, this.f);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.A.e(true, i, this.f);
    }

    @Override // defpackage.qo
    public final void d(yo yoVar, yo yoVar2) {
        y50 y50Var;
        boolean z;
        y50 y50Var2;
        boolean z2;
        if (yoVar != null) {
            yo yoVar3 = yoVar;
            if (!yoVar3.e.r) {
                cv.b("visitAncestors called on an unattached node");
            }
            t20 t20Var = yoVar3.e;
            iy a0 = nh.a0(yoVar);
            l40 l40Var = null;
            ArrayList arrayList = null;
            while (a0 != null) {
                if ((a0.H.f.h & 2097152) != 0) {
                    while (t20Var != null) {
                        if ((t20Var.g & 2097152) != 0) {
                            t20 t20Var2 = t20Var;
                            t40 t40Var = null;
                            while (t20Var2 != null) {
                                if (t20Var2 instanceof wu) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(t20Var2);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (t20Var2.g & 2097152) != 0 && (t20Var2 instanceof oi)) {
                                    int i = 0;
                                    for (t20 t20Var3 = ((oi) t20Var2).t; t20Var3 != null; t20Var3 = t20Var3.j) {
                                        if ((t20Var3.g & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                t20Var2 = t20Var3;
                                            } else {
                                                if (t40Var == null) {
                                                    t40Var = new t40(new t20[16]);
                                                }
                                                if (t20Var2 != null) {
                                                    t40Var.b(t20Var2);
                                                    t20Var2 = null;
                                                }
                                                t40Var.b(t20Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                t20Var2 = nh.N(t40Var);
                            }
                        }
                        t20Var = t20Var.i;
                    }
                }
                a0 = a0.n();
                t20Var = (a0 == null || (y50Var2 = a0.H) == null) ? null : y50Var2.e;
            }
            if (arrayList == null) {
                return;
            }
            if (yoVar2 != null) {
                if (!yoVar2.e.r) {
                    cv.b("visitAncestors called on an unattached node");
                }
                t20 t20Var4 = yoVar2.e;
                iy a02 = nh.a0(yoVar2);
                l40 l40Var2 = null;
                while (a02 != null) {
                    if ((a02.H.f.h & 2097152) != 0) {
                        while (t20Var4 != null) {
                            if ((t20Var4.g & 2097152) != 0) {
                                t20 t20Var5 = t20Var4;
                                t40 t40Var2 = null;
                                while (t20Var5 != null) {
                                    if (t20Var5 instanceof wu) {
                                        if (l40Var2 == null) {
                                            int i2 = hi0.a;
                                            l40Var2 = new l40();
                                        }
                                        l40Var2.a(t20Var5);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (t20Var5.g & 2097152) != 0 && (t20Var5 instanceof oi)) {
                                        int i3 = 0;
                                        for (t20 t20Var6 = ((oi) t20Var5).t; t20Var6 != null; t20Var6 = t20Var6.j) {
                                            if ((t20Var6.g & 2097152) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    t20Var5 = t20Var6;
                                                } else {
                                                    if (t40Var2 == null) {
                                                        t40Var2 = new t40(new t20[16]);
                                                    }
                                                    if (t20Var5 != null) {
                                                        t40Var2.b(t20Var5);
                                                        t20Var5 = null;
                                                    }
                                                    t40Var2.b(t20Var6);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    t20Var5 = nh.N(t40Var2);
                                }
                            }
                            t20Var4 = t20Var4.i;
                        }
                    }
                    a02 = a02.n();
                    t20Var4 = (a02 == null || (y50Var = a02.H) == null) ? null : y50Var.e;
                }
                l40Var = l40Var2;
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                wu wuVar = (wu) arrayList.get(i4);
                if (!(l40Var != null ? l40Var.c(wuVar) : false)) {
                    wuVar.q();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        h40 h40Var = this.E;
        if (!isAttachedToWindow()) {
            k(getRoot());
        }
        r(true);
        xl0.h().m();
        this.G = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            pa canvasHolder = getCanvasHolder();
            n2 n2Var = canvasHolder.a;
            Canvas canvas2 = n2Var.a;
            n2Var.a = canvas;
            getRoot().g(n2Var, null);
            canvasHolder.a.a = canvas2;
            if (h40Var.j()) {
                int i = h40Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((hs) ((y80) h40Var.g(i2))).g();
                }
            }
            int i3 = zt0.e;
            h40Var.d();
            this.G = false;
            Trace.endSection();
            h40 h40Var2 = this.F;
            if (h40Var2 != null) {
                h40Var.b(h40Var2);
                h40Var2.d();
            }
            if (m()) {
                if (Float.compare(this.u0, this.w0) != 0) {
                    float f = this.u0;
                    this.w0 = f;
                    u6.a(this, f);
                }
                View view = this.p;
                if (view != null) {
                    if (Float.compare(this.v0, this.x0) != 0) {
                        float f2 = this.v0;
                        this.x0 = f2;
                        u6.a(view, f2);
                    }
                    if (!Float.isNaN(this.v0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.u0 = Float.NaN;
                this.v0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:657:0x0444, code lost:
    
        if ((r2 / r3) >= 5.0f) goto L254;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [t20] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17, types: [ro0] */
    /* JADX WARN: Type inference failed for: r0v32, types: [t20] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v40, types: [ro0] */
    /* JADX WARN: Type inference failed for: r2v45, types: [t20] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v50, types: [ro0] */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v81, types: [ro0] */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [ni, wu] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43, types: [t20] */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v85 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v28, types: [t40] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [t40] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [ni, wu] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49, types: [t20] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object, t20] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [t20] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v65, types: [t40] */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69, types: [t40] */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r5v94 */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r5v96 */
    /* JADX WARN: Type inference failed for: r5v97 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [t40] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [t40] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.Object, t20] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38, types: [t20] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25, types: [t40] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28, types: [t40] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Throwable th;
        int i;
        String str;
        int i2;
        t4 t4Var;
        String str2;
        long j;
        nu nuVar;
        Object obj;
        long j2;
        long j3;
        int i3;
        char c;
        int i4;
        long j4;
        t20 t20Var;
        y50 y50Var;
        boolean z;
        oi oiVar;
        y50 y50Var2;
        Object N;
        t20 t20Var2;
        boolean z2;
        int size;
        int size2;
        y50 y50Var3;
        boolean z3;
        oi oiVar2;
        y50 y50Var4;
        Object N2;
        boolean z4;
        a3 a3Var;
        int size3;
        y50 y50Var5;
        boolean z5;
        t20 t20Var3;
        y50 y50Var6;
        if (this.A0) {
            v2 v2Var = this.z0;
            removeCallbacks(v2Var);
            if (motionEvent.getActionMasked() == 8) {
                this.A0 = false;
            } else {
                v2Var.run();
            }
        }
        if (n(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        String str3 = "visitAncestors called on an unattached node";
        int i5 = -1;
        int i6 = 1;
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (j(motionEvent) & 4) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            getContext();
            viewConfiguration.getScaledVerticalScrollFactor();
            getContext();
            viewConfiguration.getScaledHorizontalScrollFactor();
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            uo uoVar = (uo) getFocusOwner();
            if (uoVar.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            yo m = kw.m(uoVar.c);
            if (m != null) {
                if (!m.e.r) {
                    cv.b("visitAncestors called on an unattached node");
                }
                t20 t20Var4 = m.e;
                iy a0 = nh.a0(m);
                loop0: while (true) {
                    if (a0 == null) {
                        t20Var3 = null;
                        break;
                    }
                    if ((a0.H.f.h & 16384) != 0) {
                        while (t20Var4 != null) {
                            if ((t20Var4.g & 16384) != 0) {
                                t20Var3 = t20Var4;
                                t40 t40Var = null;
                                while (t20Var3 != null) {
                                    if (t20Var3 instanceof a3) {
                                        break loop0;
                                    }
                                    if ((t20Var3.g & 16384) != 0 && (t20Var3 instanceof oi)) {
                                        int i7 = 0;
                                        for (t20 t20Var5 = ((oi) t20Var3).t; t20Var5 != null; t20Var5 = t20Var5.j) {
                                            if ((t20Var5.g & 16384) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    t20Var3 = t20Var5;
                                                } else {
                                                    if (t40Var == null) {
                                                        t40Var = new t40(new t20[16]);
                                                    }
                                                    if (t20Var3 != null) {
                                                        t40Var.b(t20Var3);
                                                        t20Var3 = null;
                                                    }
                                                    t40Var.b(t20Var5);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    t20Var3 = nh.N(t40Var);
                                }
                            }
                            t20Var4 = t20Var4.i;
                        }
                    }
                    a0 = a0.n();
                    t20Var4 = (a0 == null || (y50Var6 = a0.H) == null) ? null : y50Var6.e;
                }
                a3Var = (a3) t20Var3;
            } else {
                a3Var = null;
            }
            if (a3Var != null) {
                if (!a3Var.e.r) {
                    cv.b("visitAncestors called on an unattached node");
                }
                t20 t20Var6 = a3Var.e.i;
                iy a02 = nh.a0(a3Var);
                ArrayList arrayList = null;
                while (a02 != null) {
                    if ((a02.H.f.h & 16384) != 0) {
                        while (t20Var6 != null) {
                            if ((t20Var6.g & 16384) != 0) {
                                t20 t20Var7 = t20Var6;
                                t40 t40Var2 = null;
                                while (t20Var7 != null) {
                                    if (t20Var7 instanceof a3) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(t20Var7);
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z5 && (t20Var7.g & 16384) != 0 && (t20Var7 instanceof oi)) {
                                        int i8 = 0;
                                        for (t20 t20Var8 = ((oi) t20Var7).t; t20Var8 != null; t20Var8 = t20Var8.j) {
                                            if ((t20Var8.g & 16384) != 0) {
                                                i8++;
                                                if (i8 == 1) {
                                                    t20Var7 = t20Var8;
                                                } else {
                                                    if (t40Var2 == null) {
                                                        t40Var2 = new t40(new t20[16]);
                                                    }
                                                    if (t20Var7 != null) {
                                                        t40Var2.b(t20Var7);
                                                        t20Var7 = null;
                                                    }
                                                    t40Var2.b(t20Var8);
                                                }
                                            }
                                        }
                                        if (i8 == 1) {
                                        }
                                    }
                                    t20Var7 = nh.N(t40Var2);
                                }
                            }
                            t20Var6 = t20Var6.i;
                        }
                    }
                    a02 = a02.n();
                    t20Var6 = (a02 == null || (y50Var5 = a02.H) == null) ? null : y50Var5.e;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i9 = size3 - 1;
                        ((a3) arrayList.get(size3)).getClass();
                        if (i9 < 0) {
                            break;
                        }
                        size3 = i9;
                    }
                }
                t20 t20Var9 = a3Var.e;
                t40 t40Var3 = null;
                while (t20Var9 != null) {
                    if (!(t20Var9 instanceof a3) && (t20Var9.g & 16384) != 0 && (t20Var9 instanceof oi)) {
                        int i10 = 0;
                        for (t20 t20Var10 = ((oi) t20Var9).t; t20Var10 != null; t20Var10 = t20Var10.j) {
                            if ((t20Var10.g & 16384) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    t20Var9 = t20Var10;
                                } else {
                                    if (t40Var3 == null) {
                                        t40Var3 = new t40(new t20[16]);
                                    }
                                    if (t20Var9 != null) {
                                        t40Var3.b(t20Var9);
                                        t20Var9 = null;
                                    }
                                    t40Var3.b(t20Var10);
                                }
                            }
                        }
                        if (i10 == 1) {
                        }
                    }
                    t20Var9 = nh.N(t40Var3);
                }
                if (!super.dispatchGenericMotionEvent(motionEvent)) {
                    t20 t20Var11 = a3Var.e;
                    t40 t40Var4 = null;
                    while (t20Var11 != null) {
                        if (!(t20Var11 instanceof a3) && (t20Var11.g & 16384) != 0 && (t20Var11 instanceof oi)) {
                            int i11 = 0;
                            for (t20 t20Var12 = ((oi) t20Var11).t; t20Var12 != null; t20Var12 = t20Var12.j) {
                                if ((t20Var12.g & 16384) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        t20Var11 = t20Var12;
                                    } else {
                                        if (t40Var4 == null) {
                                            t40Var4 = new t40(new t20[16]);
                                        }
                                        if (t20Var11 != null) {
                                            t40Var4.b(t20Var11);
                                            t20Var11 = null;
                                        }
                                        t40Var4.b(t20Var12);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        t20Var11 = nh.N(t40Var4);
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        for (int i12 = 0; i12 < size4; i12++) {
                            ((a3) arrayList.get(i12)).getClass();
                        }
                    }
                }
            }
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        nu nuVar2 = this.h;
        e30 e30Var = this.H;
        s00 s00Var = e30Var.e;
        SparseLongArray sparseLongArray = e30Var.b;
        int actionMasked = motionEvent.getActionMasked();
        e30Var.b(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            e30Var.c.clear();
            str = "visitAncestors called on an unattached node";
            i = 16;
            t4Var = null;
            th = null;
        } else {
            e30Var.a(motionEvent);
            if (actionMasked != 1) {
                if (actionMasked == 6) {
                    i5 = motionEvent.getActionIndex();
                }
                th = null;
            } else {
                th = null;
                i5 = 0;
            }
            boolean z6 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
            i = 16;
            int pointerCount = motionEvent.getPointerCount();
            ArrayList arrayList2 = new ArrayList(pointerCount);
            int i13 = 0;
            while (i13 < pointerCount) {
                int pointerId = motionEvent.getPointerId(i13);
                int i14 = i6;
                int indexOfKey = sparseLongArray.indexOfKey(pointerId);
                if (indexOfKey >= 0) {
                    str2 = str3;
                    j = sparseLongArray.valueAt(indexOfKey);
                    nuVar = nuVar2;
                } else {
                    str2 = str3;
                    j = e30Var.a;
                    nuVar = nuVar2;
                    e30Var.a = j + 1;
                    sparseLongArray.put(pointerId, j);
                }
                e30 e30Var2 = e30Var;
                long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getX(i13)) << 32) | (Float.floatToRawIntBits(motionEvent.getY(i13)) & 4294967295L);
                ?? r33 = i13 != i5 ? i14 : 0;
                int k = lw.k(s00Var.f, s00Var.h, j);
                if (k < 0 || (obj = s00Var.g[k]) == kw.h) {
                    obj = th;
                }
                d30 d30Var = (d30) obj;
                if (i13 == i5) {
                    s00Var.c(j);
                    j2 = j;
                    j3 = 2147483647L;
                    c = ' ';
                    i3 = 65535;
                } else {
                    if (z6) {
                        j3 = 2147483647L;
                        i3 = 65535;
                        j2 = j;
                        s00Var.b(j2, new d30(1 | ((motionEvent.getEventTime() & 2147483647L) << i14) | (((((short) Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) << 16)) << 32)));
                    } else {
                        j2 = j;
                        j3 = 2147483647L;
                        i3 = 65535;
                    }
                    c = ' ';
                }
                long eventTime = motionEvent.getEventTime();
                long j5 = j3;
                float pressure = motionEvent.getPressure(i13);
                int i15 = i3;
                int i16 = i5;
                long eventTime2 = d30Var != null ? (d30Var.a >> i14) & j5 : motionEvent.getEventTime();
                if (d30Var != null) {
                    float f = (short) (((int) (d30Var.a >>> c)) >>> 16);
                    i4 = i16;
                    j4 = (Float.floatToRawIntBits((short) (r5 & i15)) & 4294967295L) | (Float.floatToRawIntBits(f) << c);
                } else {
                    i4 = i16;
                    j4 = floatToRawIntBits;
                }
                arrayList2.add(new ou(j2, eventTime, floatToRawIntBits, r33, pressure, eventTime2, j4, d30Var != null ? (d30Var.a & 1) != 0 ? i14 : 0 : 0));
                i13++;
                e30Var = e30Var2;
                i6 = i14;
                str3 = str2;
                nuVar2 = nuVar;
                i5 = i4;
            }
            nu nuVar3 = nuVar2;
            str = str3;
            int i17 = i6;
            e30Var.e(motionEvent);
            if (nuVar3 != null) {
                i2 = nuVar3.a;
            } else {
                if (!motionEvent.isFromSource(2097152)) {
                    z6.l("MotionEvent must be a touch navigation source");
                    return false;
                }
                InputDevice device = motionEvent.getDevice();
                if (device != null) {
                    InputDevice.MotionRange motionRange = device.getMotionRange(0);
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(i17);
                    if (motionRange == null || motionRange2 != null) {
                        if (motionRange2 == null || motionRange != null) {
                            if (motionRange != null && motionRange2 != null) {
                                float range = motionRange.getRange();
                                float range2 = motionRange2.getRange();
                                if (range <= range2 || (range2 != 0.0f && range / range2 < 5.0f)) {
                                    if (range2 > range) {
                                        if (range != 0.0f) {
                                        }
                                    }
                                }
                            }
                        }
                        i2 = 2;
                    }
                    i2 = 1;
                }
                i2 = 0;
            }
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 2 || actionMasked != 5) {
            }
            t4Var = new t4();
            t4Var.b = arrayList2;
            t4Var.a = i2;
            t4Var.c = motionEvent;
            if (arrayList2.isEmpty()) {
                z6.l("changes cannot be empty");
                throw th;
            }
        }
        yu yuVar = this.C0;
        if (t4Var == null) {
            yo f2 = ((uo) getFocusOwner()).f();
            if (f2 != null) {
                if (!f2.e.r) {
                    cv.b(str);
                }
                ?? r2 = f2.e;
                iy a03 = nh.a0(f2);
                loop26: while (true) {
                    if (a03 == null) {
                        oiVar = th;
                        break;
                    }
                    int i18 = 2097152;
                    if ((a03.H.f.h & 2097152) != 0) {
                        for (t20 t20Var13 = r2; t20Var13 != null; t20Var13 = t20Var13.i) {
                            if ((t20Var13.g & i18) != 0) {
                                oiVar = t20Var13;
                                Throwable th2 = th;
                                while (oiVar != 0) {
                                    if (oiVar instanceof wu) {
                                        break loop26;
                                    }
                                    ?? r4 = th2;
                                    if ((oiVar.g & i18) != 0) {
                                        r4 = th2;
                                        if (oiVar instanceof oi) {
                                            t20 t20Var14 = oiVar.t;
                                            int i19 = 0;
                                            N = oiVar;
                                            r4 = th2;
                                            while (t20Var14 != null) {
                                                if ((t20Var14.g & i18) != 0) {
                                                    i19++;
                                                    r4 = r4;
                                                    if (i19 == 1) {
                                                        N = t20Var14;
                                                    } else {
                                                        if (r4 == 0) {
                                                            r4 = new t40(new t20[16]);
                                                        }
                                                        if (N != null) {
                                                            r4.b(N);
                                                            N = th;
                                                        }
                                                        r4.b(t20Var14);
                                                    }
                                                }
                                                t20Var14 = t20Var14.j;
                                                i18 = 2097152;
                                                N = N;
                                                r4 = r4;
                                            }
                                            r4 = r4;
                                            if (i19 == 1) {
                                                i18 = 2097152;
                                                oiVar = N;
                                                th2 = r4;
                                            }
                                        }
                                    }
                                    N = nh.N(r4);
                                    i18 = 2097152;
                                    oiVar = N;
                                    th2 = r4;
                                }
                            }
                            i18 = 2097152;
                        }
                    }
                    a03 = a03.n();
                    r2 = (a03 == null || (y50Var2 = a03.H) == null) ? th : y50Var2.e;
                }
                t20Var = (wu) oiVar;
            } else {
                t20Var = th;
            }
            if (t20Var != 0) {
                t20 t20Var15 = t20Var;
                if (!t20Var15.e.r) {
                    cv.b(str);
                }
                ?? r0 = t20Var15.e.i;
                iy a04 = nh.a0(t20Var);
                ?? r42 = th;
                while (a04 != null) {
                    int i20 = 2097152;
                    t20 t20Var16 = r0;
                    r42 = r42;
                    if ((a04.H.f.h & 2097152) != 0) {
                        while (t20Var16 != null) {
                            if ((t20Var16.g & i20) != 0) {
                                oi oiVar3 = t20Var16;
                                ?? r6 = th;
                                while (oiVar3 != 0) {
                                    ArrayList arrayList3 = r42;
                                    if (oiVar3 instanceof wu) {
                                        if (r42 == 0) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(oiVar3);
                                        z = false;
                                        r42 = arrayList3;
                                    } else {
                                        z = true;
                                        r42 = r42;
                                    }
                                    if (z) {
                                        if ((oiVar3.g & 2097152) != 0 && (oiVar3 instanceof oi)) {
                                            t20 t20Var17 = oiVar3.t;
                                            int i21 = 0;
                                            oiVar3 = oiVar3;
                                            r6 = r6;
                                            while (t20Var17 != null) {
                                                oiVar3 = oiVar3;
                                                if ((t20Var17.g & 2097152) != 0) {
                                                    i21++;
                                                    if (i21 == 1) {
                                                        oiVar3 = t20Var17;
                                                    } else {
                                                        r6 = r6 == 0 ? new t40(new t20[16]) : r6;
                                                        if (oiVar3 != 0) {
                                                            r6.b(oiVar3);
                                                            oiVar3 = th;
                                                        }
                                                        r6.b(t20Var17);
                                                        t20Var17 = t20Var17.j;
                                                        oiVar3 = oiVar3;
                                                        r6 = r6;
                                                    }
                                                }
                                                t20Var17 = t20Var17.j;
                                                oiVar3 = oiVar3;
                                                r6 = r6;
                                            }
                                            if (i21 == 1) {
                                            }
                                        }
                                    }
                                    oiVar3 = nh.N(r6);
                                }
                            }
                            i20 = 2097152;
                            t20Var16 = t20Var16.i;
                            r42 = r42;
                        }
                    }
                    a04 = a04.n();
                    r0 = (a04 == null || (y50Var = a04.H) == null) ? th : y50Var.e;
                }
                t20Var.q();
                if (r42 != 0) {
                    int size5 = r42.size();
                    for (int i22 = 0; i22 < size5; i22++) {
                        ((wu) r42.get(i22)).q();
                    }
                }
            }
            yuVar.b = 0;
            yuVar.c = true;
            return true;
        }
        uo uoVar2 = (uo) getFocusOwner();
        if (uoVar2.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        } else {
            yo f3 = uoVar2.f();
            if (f3 != null) {
                if (!f3.e.r) {
                    cv.b(str);
                }
                t20 t20Var18 = f3.e;
                iy a05 = nh.a0(f3);
                t20 t20Var19 = t20Var18;
                loop14: while (true) {
                    if (a05 == null) {
                        oiVar2 = th;
                        break;
                    }
                    int i23 = 2097152;
                    if ((a05.H.f.h & 2097152) != 0) {
                        for (t20 t20Var20 = t20Var19; t20Var20 != null; t20Var20 = t20Var20.i) {
                            if ((t20Var20.g & i23) != 0) {
                                oiVar2 = t20Var20;
                                Throwable th3 = th;
                                while (oiVar2 != 0) {
                                    if (oiVar2 instanceof wu) {
                                        break loop14;
                                    }
                                    ?? r5 = th3;
                                    if ((oiVar2.g & i23) != 0) {
                                        r5 = th3;
                                        if (oiVar2 instanceof oi) {
                                            t20 t20Var21 = oiVar2.t;
                                            int i24 = 0;
                                            N2 = oiVar2;
                                            r5 = th3;
                                            while (t20Var21 != null) {
                                                if ((t20Var21.g & i23) != 0) {
                                                    i24++;
                                                    r5 = r5;
                                                    if (i24 == 1) {
                                                        N2 = t20Var21;
                                                    } else {
                                                        if (r5 == 0) {
                                                            r5 = new t40(new t20[i]);
                                                        }
                                                        if (N2 != null) {
                                                            r5.b(N2);
                                                            N2 = th;
                                                        }
                                                        r5.b(t20Var21);
                                                    }
                                                }
                                                t20Var21 = t20Var21.j;
                                                i = 16;
                                                i23 = 2097152;
                                                N2 = N2;
                                                r5 = r5;
                                            }
                                            r5 = r5;
                                            if (i24 == 1) {
                                                i = 16;
                                                i23 = 2097152;
                                                oiVar2 = N2;
                                                th3 = r5;
                                            }
                                        }
                                    }
                                    N2 = nh.N(r5);
                                    i = 16;
                                    i23 = 2097152;
                                    oiVar2 = N2;
                                    th3 = r5;
                                }
                            }
                            i = 16;
                            i23 = 2097152;
                        }
                    }
                    a05 = a05.n();
                    i = 16;
                    t20Var19 = (a05 == null || (y50Var4 = a05.H) == null) ? th : y50Var4.e;
                }
                t20Var2 = (wu) oiVar2;
            } else {
                t20Var2 = th;
            }
            if (t20Var2 != 0) {
                t20 t20Var22 = t20Var2;
                if (!t20Var22.e.r) {
                    cv.b(str);
                }
                ?? r02 = t20Var22.e.i;
                iy a06 = nh.a0(t20Var2);
                ?? r52 = th;
                while (a06 != null) {
                    int i25 = 2097152;
                    t20 t20Var23 = r02;
                    r52 = r52;
                    if ((a06.H.f.h & 2097152) != 0) {
                        while (t20Var23 != null) {
                            if ((t20Var23.g & i25) != 0) {
                                oi oiVar4 = t20Var23;
                                ?? r7 = th;
                                while (oiVar4 != 0) {
                                    ArrayList arrayList4 = r52;
                                    if (oiVar4 instanceof wu) {
                                        if (r52 == 0) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(oiVar4);
                                        z3 = false;
                                        r52 = arrayList4;
                                    } else {
                                        z3 = true;
                                        r52 = r52;
                                    }
                                    if (z3) {
                                        int i26 = 2097152;
                                        if ((oiVar4.g & 2097152) != 0 && (oiVar4 instanceof oi)) {
                                            t20 t20Var24 = oiVar4.t;
                                            int i27 = 0;
                                            oiVar4 = oiVar4;
                                            r7 = r7;
                                            while (t20Var24 != null) {
                                                if ((t20Var24.g & i26) != 0) {
                                                    i27++;
                                                    r7 = r7;
                                                    if (i27 == 1) {
                                                        oiVar4 = t20Var24;
                                                    } else {
                                                        if (r7 == 0) {
                                                            r7 = new t40(new t20[16]);
                                                        }
                                                        if (oiVar4 != 0) {
                                                            r7.b(oiVar4);
                                                            oiVar4 = th;
                                                        }
                                                        r7.b(t20Var24);
                                                    }
                                                }
                                                t20Var24 = t20Var24.j;
                                                i26 = 2097152;
                                                oiVar4 = oiVar4;
                                                r7 = r7;
                                            }
                                            if (i27 == 1) {
                                            }
                                        }
                                    }
                                    oiVar4 = nh.N(r7);
                                }
                            }
                            i25 = 2097152;
                            t20Var23 = t20Var23.i;
                            r52 = r52;
                        }
                    }
                    a06 = a06.n();
                    r02 = (a06 == null || (y50Var3 = a06.H) == null) ? th : y50Var3.e;
                }
                sc0 sc0Var = sc0.e;
                if (r52 != 0 && r52.size() - 1 >= 0) {
                    while (true) {
                        int i28 = size2 - 1;
                        ((wu) r52.get(size2)).v(t4Var, sc0Var);
                        if (i28 < 0) {
                            break;
                        }
                        size2 = i28;
                    }
                }
                t20Var2.v(t4Var, sc0Var);
                sc0 sc0Var2 = sc0.f;
                t20Var2.v(t4Var, sc0Var2);
                if (r52 != 0) {
                    int size6 = r52.size();
                    for (int i29 = 0; i29 < size6; i29++) {
                        ((wu) r52.get(i29)).v(t4Var, sc0Var2);
                    }
                }
                sc0 sc0Var3 = sc0.g;
                if (r52 != 0 && r52.size() - 1 >= 0) {
                    while (true) {
                        int i30 = size - 1;
                        ((wu) r52.get(size)).v(t4Var, sc0Var3);
                        if (i30 < 0) {
                            break;
                        }
                        size = i30;
                    }
                }
                t20Var2.v(t4Var, sc0Var3);
            }
            ArrayList arrayList5 = (ArrayList) t4Var.b;
            int size7 = arrayList5.size();
            for (int i31 = 0; i31 < size7; i31++) {
                if (((ou) arrayList5.get(i31)).i) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        yuVar.getClass();
        MotionEvent motionEvent2 = (MotionEvent) t4Var.c;
        int action = motionEvent2.getAction();
        if (action != 0) {
            z4 = true;
            if ((action == 1 || action == 2) && z2) {
                yuVar.b = 0;
                yuVar.c = true;
            }
        } else {
            z4 = true;
            yuVar.b = t4Var.a;
            yuVar.c = false;
        }
        yuVar.d.onTouchEvent(motionEvent2);
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0160, code lost:
    
        if (p(r25) == false) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4 = this.A0;
        v2 v2Var = this.z0;
        if (z4) {
            removeCallbacks(v2Var);
            v2Var.run();
        }
        if (!n(motionEvent) && isAttachedToWindow()) {
            k3 k3Var = this.A;
            e3 e3Var = k3Var.h;
            AccessibilityManager accessibilityManager = k3Var.k;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    e3Var.r(true);
                    bt btVar = new bt();
                    z = true;
                    long floatToRawIntBits = (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
                    y50 y50Var = e3Var.getRoot().H;
                    d60 d60Var = y50Var.d;
                    a60 a60Var = d60.Y;
                    y50Var.d.G0(d60.d0, d60Var.x0(floatToRawIntBits), btVar, 1, true);
                    h40 h40Var = btVar.e;
                    int i2 = h40Var.b;
                    while (true) {
                        i2--;
                        if (-1 >= i2) {
                            i = Integer.MIN_VALUE;
                            break;
                        }
                        Object g = h40Var.g(i2);
                        g.getClass();
                        iy a0 = nh.a0((t20) g);
                        if (e3Var.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(a0) != null) {
                            z6.c();
                            return false;
                        }
                        if (a0.H.c(8)) {
                            i = k3Var.s(a0.f);
                            uj0 a = t30.a(a0, false);
                            if (nh.C(a) && !u10.u(a)) {
                                break;
                            }
                        }
                    }
                    boolean dispatchGenericMotionEvent = e3Var.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i3 = k3Var.i;
                    if (i3 != i) {
                        k3Var.i = i;
                        k3.w(k3Var, i, 128, null, 12);
                        k3.w(k3Var, i3, 256, null, 12);
                    }
                    z2 = i == Integer.MIN_VALUE ? dispatchGenericMotionEvent : true;
                } else {
                    if (action != 10) {
                        z2 = false;
                    } else {
                        int i4 = k3Var.i;
                        if (i4 != Integer.MIN_VALUE) {
                            if (i4 != Integer.MIN_VALUE) {
                                k3Var.i = Integer.MIN_VALUE;
                                k3.w(k3Var, Integer.MIN_VALUE, 128, null, 12);
                                k3.w(k3Var, i4, 256, null, 12);
                            }
                            z2 = true;
                            z = true;
                        } else {
                            z2 = e3Var.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                        }
                    }
                    z = true;
                }
            } else {
                z = true;
                z2 = false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 7) {
                z3 = z;
            } else {
                if (actionMasked == 10 && o(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.q0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.q0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.A0 = z;
                        postDelayed(v2Var, 8L);
                        return z2;
                    }
                    return z2;
                }
                z3 = z;
                if ((j(motionEvent) & z3) != 0 || z2) {
                    return z3;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (!isFocused()) {
            return ((uo) getFocusOwner()).d(keyEvent, new s2(i, this, keyEvent));
        }
        t3 t3Var = getComposeViewContext().t;
        su0.e.setValue(new ad0(keyEvent.getMetaState()));
        return ((uo) getFocusOwner()).d(keyEvent, new hf(5)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        y50 y50Var;
        if (isFocused()) {
            uo uoVar = (uo) getFocusOwner();
            if (uoVar.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                yo m = kw.m(uoVar.c);
                if (m != null) {
                    if (!m.e.r) {
                        cv.b("visitAncestors called on an unattached node");
                    }
                    t20 t20Var = m.e;
                    iy a0 = nh.a0(m);
                    while (a0 != null) {
                        if ((a0.H.f.h & 131072) != 0) {
                            while (t20Var != null) {
                                if ((t20Var.g & 131072) != 0) {
                                    t20 t20Var2 = t20Var;
                                    t40 t40Var = null;
                                    while (t20Var2 != null) {
                                        if ((t20Var2.g & 131072) != 0 && (t20Var2 instanceof oi)) {
                                            int i = 0;
                                            for (t20 t20Var3 = ((oi) t20Var2).t; t20Var3 != null; t20Var3 = t20Var3.j) {
                                                if ((t20Var3.g & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        t20Var2 = t20Var3;
                                                    } else {
                                                        if (t40Var == null) {
                                                            t40Var = new t40(new t20[16]);
                                                        }
                                                        if (t20Var2 != null) {
                                                            t40Var.b(t20Var2);
                                                            t20Var2 = null;
                                                        }
                                                        t40Var.b(t20Var3);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        t20Var2 = nh.N(t40Var);
                                    }
                                }
                                t20Var = t20Var.i;
                            }
                        }
                        a0 = a0.n();
                        t20Var = (a0 == null || (y50Var = a0.H) == null) ? null : y50Var.e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        this.H0 = true;
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            this.H0 = false;
            x(viewStructure);
        } catch (Throwable th) {
            this.H0 = false;
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object r7Var;
        yo f;
        if (this.A0) {
            v2 v2Var = this.z0;
            removeCallbacks(v2Var);
            MotionEvent motionEvent2 = this.q0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.A0 = false;
            } else {
                v2Var.run();
            }
        }
        if (!n(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || p(motionEvent))) {
            int j = j(motionEvent);
            int i = 1;
            if ((j & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (r7Var = view.getTag(2131034158)) == null) {
                    r7Var = new r7(i);
                }
                if (r7Var.equals(new r7(i)) && (f = ((uo) getFocusOwner()).f()) != null) {
                    d60 Z = nh.Z(f);
                    oe0 A = q3.s(Z).A(Z, true);
                    long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L);
                    float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                    if (!((intBitsToFloat < A.c) & (intBitsToFloat >= A.a) & (intBitsToFloat2 >= A.b) & (intBitsToFloat2 < A.d))) {
                        ((uo) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((j & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return dx0.r(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        oe0 a;
        if (view == null || this.T.c) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (findNextFocus != null && !findNextFocus.equals(this)) {
            for (ViewParent parent = findNextFocus.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
        }
        findNextFocus = null;
        if (view == this) {
            yo m = kw.m(((uo) getFocusOwner()).c);
            a = m != null ? kw.p(m) : null;
            if (a == null) {
                a = oo.a(view, this);
            }
        } else {
            a = oo.a(view, this);
        }
        lo c = oo.c(i);
        int i2 = c != null ? c.a : 6;
        ve0 ve0Var = new ve0();
        if (((uo) getFocusOwner()).e(i2, a, new r2(ve0Var, 0)) == null) {
            return view;
        }
        Object obj = ve0Var.e;
        if (obj != null) {
            if (findNextFocus == null || i2 == 1 || i2 == 2 || u10.v(kw.p((yo) obj), oo.a(findNextFocus, this), a, i2)) {
                return this;
            }
        } else if (findNextFocus == null) {
            return super.focusSearch(view, i);
        }
        return findNextFocus;
    }

    public y0 getAccessibilityManager() {
        return getComposeViewContext().k;
    }

    public final t5 getAndroidViewsHandler$ui() {
        if (this.Q == null) {
            t5 t5Var = new t5(getContext());
            this.Q = t5Var;
            addView(t5Var, -1);
            requestLayout();
        }
        t5 t5Var2 = this.Q;
        t5Var2.getClass();
        return t5Var2;
    }

    public u7 getAutofillTree() {
        return this.D;
    }

    public vb getClipboard() {
        return getComposeViewContext().n;
    }

    public wb getClipboardManager() {
        return getComposeViewContext().m;
    }

    public final pe getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.G0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.J.getValue();
    }

    public final z3 getContentCaptureManager$ui() {
        return this.B;
    }

    public tg getCoroutineContext() {
        return this.r;
    }

    public si getDensity() {
        return (si) this.o.getValue();
    }

    public oe0 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            yo m = kw.m(((uo) getFocusOwner()).c);
            if (m != null) {
                return kw.p(m);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return oo.a(findFocus, this);
        }
        return null;
    }

    public ro getFocusOwner() {
        return this.q;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        oe0 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (lw.i(((uo) getFocusOwner()).e(6, null, new l0(1, (byte) 0)), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public gp getFontFamilyResolver() {
        return (gp) this.l0.getValue();
    }

    public fp getFontLoader() {
        return getComposeViewContext().o;
    }

    public final hz getFrameEndScheduler$ui() {
        return this.i;
    }

    public ds getGraphicsContext() {
        return this.C;
    }

    public vs getHapticFeedBack() {
        return getComposeViewContext().q;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.T.b.u() || !this.m.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public mv getInputModeManager() {
        mv mvVar = this.n0;
        if (mvVar == null) {
            mvVar = new mv(isInTouchMode() ? 1 : 2);
            this.n0 = mvVar;
        }
        return mvVar;
    }

    public final ov getInsetsListener() {
        return this.v;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.d0;
    }

    @Override // android.view.View, android.view.ViewParent
    public xx getLayoutDirection() {
        return (xx) this.m0.getValue();
    }

    public h00 getLocaleList() {
        return (h00) this.K.getValue();
    }

    public long getMeasureIteration() {
        if (this.T.c) {
            return 1L;
        }
        cv.a("measureIteration should be only used during the measure/layout pass");
        return 1L;
    }

    public v20 getModifierLocalManager() {
        return this.o0;
    }

    /* renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public e3 m36getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public dc0 getPlacementScope() {
        a60 a60Var = fc0.a;
        return new x00(1, this);
    }

    public final tq getPlayNavigationSoundEffect$ui() {
        return this.B0;
    }

    public uc0 getPointerIconService() {
        return this.K0;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final nu m29getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.h;
    }

    public qe0 getRectManager() {
        return this.y;
    }

    public tf0 getRetainedValuesStore() {
        return this.l;
    }

    public iy getRoot() {
        return this.w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final uj getSavedStateRegistry() {
        uj ujVar = this.k;
        if (ujVar != null) {
            return ujVar;
        }
        pe composeViewContext = getComposeViewContext();
        composeViewContext.g();
        uh0 uh0Var = composeViewContext.e;
        uh0Var.getClass();
        ViewParent parent = getParent();
        parent.getClass();
        View view = (View) parent;
        Object tag = view.getTag(2131034163);
        LinkedHashMap linkedHashMap = null;
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = String.valueOf(view.getId());
        }
        String str2 = "SaveableStateRegistry:" + str;
        rh0 savedStateRegistry = uh0Var.getSavedStateRegistry();
        Bundle a = savedStateRegistry.a(str2);
        if (a != null) {
            linkedHashMap = new LinkedHashMap();
            for (String str3 : a.keySet()) {
                ArrayList parcelableArrayList = a.getParcelableArrayList(str3);
                parcelableArrayList.getClass();
                linkedHashMap.put(str3, parcelableArrayList);
            }
        }
        boolean z = false;
        z = false;
        l0 l0Var = new l0(18, z ? (byte) 1 : (byte) 0);
        ll llVar = jh0.a;
        ih0 ih0Var = new ih0(linkedHashMap, l0Var);
        if (savedStateRegistry.b(str2) == null) {
            try {
                savedStateRegistry.c(str2, new od(1, ih0Var));
                z = true;
            } catch (IllegalArgumentException unused) {
            }
        }
        uj ujVar2 = new uj(ih0Var, new vj(z, savedStateRegistry, str2));
        this.k = ujVar2;
        return ujVar2;
    }

    public final boolean getScrollCaptureInProgress() {
        mi0 mi0Var;
        if (Build.VERSION.SDK_INT >= 31 && (mi0Var = this.I0) != null && ((Boolean) mi0Var.a.getValue()).booleanValue()) {
            return true;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof e3) {
                return ((e3) parent).getScrollCaptureInProgress();
            }
        }
        return false;
    }

    public xj0 getSemanticsOwner() {
        return this.z;
    }

    public ky getSharedDrawScope() {
        return getComposeViewContext().s;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? s6.a.a(this) : this.P;
    }

    public a90 getSnapshotObserver() {
        return this.O;
    }

    public im0 getSoftwareKeyboardController() {
        i2 i2Var = this.k0;
        if (i2Var != null) {
            return i2Var;
        }
        getTextInputService();
        i2 i2Var2 = new i2(16);
        this.k0 = i2Var2;
        return i2Var2;
    }

    public hp0 getTextInputService() {
        hp0 hp0Var = this.i0;
        if (hp0Var != null) {
            return hp0Var;
        }
        getLegacyTextInputServiceAndroid();
        hp0 hp0Var2 = new hp0();
        new AtomicReference(null);
        this.i0 = hp0Var2;
        return hp0Var2;
    }

    public aq0 getTextToolbar() {
        i2 i2Var = this.p0;
        if (i2Var != null) {
            return i2Var;
        }
        i2 i2Var2 = new i2(5);
        this.p0 = i2Var2;
        return i2Var2;
    }

    public final kg0 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public wt0 getViewConfiguration() {
        return getComposeViewContext().r;
    }

    public ru0 getWindowInfo() {
        return getComposeViewContext().t;
    }

    public final void i(iy iyVar, boolean z) {
        this.T.e(iyVar, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b2 A[Catch: all -> 0x01cd, TryCatch #3 {all -> 0x01cd, blocks: (B:97:0x019e, B:103:0x01aa, B:105:0x01b2, B:106:0x01bc, B:110:0x01b5), top: B:96:0x019e }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b5 A[Catch: all -> 0x01cd, TryCatch #3 {all -> 0x01cd, blocks: (B:97:0x019e, B:103:0x01aa, B:105:0x01b2, B:106:0x01bc, B:110:0x01b5), top: B:96:0x019e }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:121:0x0034, B:123:0x003e, B:128:0x004e, B:131:0x007d, B:133:0x0081, B:135:0x0090, B:137:0x0096, B:13:0x00a1, B:21:0x00b4, B:23:0x00ba, B:88:0x018e, B:89:0x019a, B:138:0x0056, B:144:0x0062, B:147:0x006a), top: B:120:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:26:0x00ca, B:33:0x00db, B:37:0x00e8, B:38:0x00eb, B:40:0x00ef, B:42:0x00f5, B:44:0x00f9, B:45:0x00ff, B:48:0x0107, B:51:0x010f, B:52:0x011b, B:54:0x0121, B:56:0x0127, B:58:0x012d, B:59:0x0133, B:61:0x0137, B:62:0x013b, B:67:0x014e, B:69:0x0152, B:70:0x0159, B:76:0x016a, B:77:0x0174, B:79:0x017c, B:80:0x017f, B:86:0x0186), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:26:0x00ca, B:33:0x00db, B:37:0x00e8, B:38:0x00eb, B:40:0x00ef, B:42:0x00f5, B:44:0x00f9, B:45:0x00ff, B:48:0x0107, B:51:0x010f, B:52:0x011b, B:54:0x0121, B:56:0x0127, B:58:0x012d, B:59:0x0133, B:61:0x0137, B:62:0x013b, B:67:0x014e, B:69:0x0152, B:70:0x0159, B:76:0x016a, B:77:0x0174, B:79:0x017c, B:80:0x017f, B:86:0x0186), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:26:0x00ca, B:33:0x00db, B:37:0x00e8, B:38:0x00eb, B:40:0x00ef, B:42:0x00f5, B:44:0x00f9, B:45:0x00ff, B:48:0x0107, B:51:0x010f, B:52:0x011b, B:54:0x0121, B:56:0x0127, B:58:0x012d, B:59:0x0133, B:61:0x0137, B:62:0x013b, B:67:0x014e, B:69:0x0152, B:70:0x0159, B:76:0x016a, B:77:0x0174, B:79:0x017c, B:80:0x017f, B:86:0x0186), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:26:0x00ca, B:33:0x00db, B:37:0x00e8, B:38:0x00eb, B:40:0x00ef, B:42:0x00f5, B:44:0x00f9, B:45:0x00ff, B:48:0x0107, B:51:0x010f, B:52:0x011b, B:54:0x0121, B:56:0x0127, B:58:0x012d, B:59:0x0133, B:61:0x0137, B:62:0x013b, B:67:0x014e, B:69:0x0152, B:70:0x0159, B:76:0x016a, B:77:0x0174, B:79:0x017c, B:80:0x017f, B:86:0x0186), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:26:0x00ca, B:33:0x00db, B:37:0x00e8, B:38:0x00eb, B:40:0x00ef, B:42:0x00f5, B:44:0x00f9, B:45:0x00ff, B:48:0x0107, B:51:0x010f, B:52:0x011b, B:54:0x0121, B:56:0x0127, B:58:0x012d, B:59:0x0133, B:61:0x0137, B:62:0x013b, B:67:0x014e, B:69:0x0152, B:70:0x0159, B:76:0x016a, B:77:0x0174, B:79:0x017c, B:80:0x017f, B:86:0x0186), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016a A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:26:0x00ca, B:33:0x00db, B:37:0x00e8, B:38:0x00eb, B:40:0x00ef, B:42:0x00f5, B:44:0x00f9, B:45:0x00ff, B:48:0x0107, B:51:0x010f, B:52:0x011b, B:54:0x0121, B:56:0x0127, B:58:0x012d, B:59:0x0133, B:61:0x0137, B:62:0x013b, B:67:0x014e, B:69:0x0152, B:70:0x0159, B:76:0x016a, B:77:0x0174, B:79:0x017c, B:80:0x017f, B:86:0x0186), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017c A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:26:0x00ca, B:33:0x00db, B:37:0x00e8, B:38:0x00eb, B:40:0x00ef, B:42:0x00f5, B:44:0x00f9, B:45:0x00ff, B:48:0x0107, B:51:0x010f, B:52:0x011b, B:54:0x0121, B:56:0x0127, B:58:0x012d, B:59:0x0133, B:61:0x0137, B:62:0x013b, B:67:0x014e, B:69:0x0152, B:70:0x0159, B:76:0x016a, B:77:0x0174, B:79:0x017c, B:80:0x017f, B:86:0x0186), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017f A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:26:0x00ca, B:33:0x00db, B:37:0x00e8, B:38:0x00eb, B:40:0x00ef, B:42:0x00f5, B:44:0x00f9, B:45:0x00ff, B:48:0x0107, B:51:0x010f, B:52:0x011b, B:54:0x0121, B:56:0x0127, B:58:0x012d, B:59:0x0133, B:61:0x0137, B:62:0x013b, B:67:0x014e, B:69:0x0152, B:70:0x0159, B:76:0x016a, B:77:0x0174, B:79:0x017c, B:80:0x017f, B:86:0x0186), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018e A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:121:0x0034, B:123:0x003e, B:128:0x004e, B:131:0x007d, B:133:0x0081, B:135:0x0090, B:137:0x0096, B:13:0x00a1, B:21:0x00b4, B:23:0x00ba, B:88:0x018e, B:89:0x019a, B:138:0x0056, B:144:0x0062, B:147:0x006a), top: B:120:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        boolean z;
        r4 r4Var;
        boolean z2;
        int actionMasked2;
        MotionEvent motionEvent3;
        e3 e3Var;
        boolean z3;
        MotionEvent motionEvent4;
        int E;
        ys ysVar;
        e3 e3Var2;
        int pointerId;
        int action;
        boolean z4;
        ys ysVar2;
        e3 e3Var3 = this;
        e3Var3.removeCallbacks(e3Var3.y0);
        try {
            z(motionEvent);
            e3Var3.e0 = true;
            e3Var3.r(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                actionMasked = motionEvent.getActionMasked();
                motionEvent2 = e3Var3.q0;
                z = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                r4Var = e3Var3.I;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (motionEvent2 != null) {
                try {
                    if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                        z2 = false;
                        if (z2) {
                            if (motionEvent2.getButtonState() != 0 || (actionMasked2 = motionEvent2.getActionMasked()) == 0 || actionMasked2 == 2 || actionMasked2 == 6) {
                                motionEvent3 = motionEvent2;
                                if (!r4Var.a) {
                                    s00 s00Var = (s00) ((t3) r4Var.d).f;
                                    int i = s00Var.h;
                                    Object[] objArr = s00Var.g;
                                    for (int i2 = 0; i2 < i; i2++) {
                                        objArr[i2] = null;
                                    }
                                    s00Var.h = 0;
                                    s00Var.e = false;
                                    ((ys) r4Var.c).c();
                                }
                            } else if (motionEvent2.getActionMasked() != 10 && z) {
                                e3Var3.F(motionEvent2, 10, motionEvent2.getEventTime(), true);
                                motionEvent3 = motionEvent2;
                            }
                            boolean z5 = motionEvent.getToolType(0) != 3;
                            if (z && z5 && actionMasked != 3 && actionMasked != 9 && o(motionEvent)) {
                                e3Var = this;
                                e3Var.F(motionEvent, 9, motionEvent.getEventTime(), true);
                            } else {
                                e3Var = this;
                            }
                            z3 = (actionMasked == 8 || (motionEvent.getButtonState() == 0) || motionEvent3 == null || motionEvent3.isFromSource(4098)) ? false : true;
                            if (motionEvent3 != null) {
                                motionEvent3.recycle();
                            }
                            motionEvent4 = e3Var.q0;
                            if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                                MotionEvent motionEvent5 = e3Var.q0;
                                pointerId = motionEvent5 == null ? motionEvent5.getPointerId(0) : -1;
                                action = motionEvent.getAction();
                                e30 e30Var = e3Var.H;
                                if (action == 9 || motionEvent.getHistorySize() != 0) {
                                    if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                        MotionEvent motionEvent6 = e3Var.q0;
                                        float x = motionEvent6 == null ? motionEvent6.getX() : Float.NaN;
                                        MotionEvent motionEvent7 = e3Var.q0;
                                        z4 = x == motionEvent.getX() || (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) != motionEvent.getY();
                                        MotionEvent motionEvent8 = e3Var.q0;
                                        boolean z6 = (motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime();
                                        if (!z4 || z6) {
                                            if (pointerId >= 0) {
                                                e30Var.c.delete(pointerId);
                                                e30Var.b.delete(pointerId);
                                            }
                                            ysVar2 = (ys) r4Var.c;
                                            if (ysVar2.d) {
                                                ysVar2.g.a.g();
                                            } else {
                                                ysVar2.d = true;
                                            }
                                        }
                                    }
                                } else if (pointerId >= 0) {
                                    e30Var.c.delete(pointerId);
                                    e30Var.b.delete(pointerId);
                                }
                            }
                            e3Var.q0 = MotionEvent.obtainNoHistory(motionEvent);
                            if (z3) {
                                e3Var.F(motionEvent, 10, motionEvent.getEventTime(), true);
                            }
                            E = E(motionEvent);
                            Trace.endSection();
                            if ((E & 4) == 0 && z3) {
                                ysVar = (ys) r4Var.c;
                                if (ysVar.d) {
                                    ysVar.g.a.g();
                                } else {
                                    ysVar.d = true;
                                }
                                e3Var2 = this;
                                e3Var2.F(motionEvent, 9, motionEvent.getEventTime(), true);
                            } else {
                                e3Var2 = this;
                            }
                            e3Var2.e0 = false;
                            return E;
                        }
                    }
                    z2 = true;
                    if (z2) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    Trace.endSection();
                    throw th;
                }
            }
            Trace.endSection();
            if ((E & 4) == 0) {
                ysVar = (ys) r4Var.c;
                if (ysVar.d) {
                }
                e3Var2 = this;
                e3Var2.F(motionEvent, 9, motionEvent.getEventTime(), true);
                e3Var2.e0 = false;
                return E;
            }
            e3Var2 = this;
            e3Var2.e0 = false;
            return E;
        } catch (Throwable th4) {
            th = th4;
            e3Var3 = this;
            e3Var3.e0 = false;
            throw th;
        }
        motionEvent3 = motionEvent2;
        if (motionEvent.getToolType(0) != 3) {
        }
        if (z) {
        }
        e3Var = this;
        if (actionMasked == 8) {
        }
        if (motionEvent3 != null) {
        }
        motionEvent4 = e3Var.q0;
        if (motionEvent4 != null) {
            MotionEvent motionEvent52 = e3Var.q0;
            if (motionEvent52 == null) {
            }
            action = motionEvent.getAction();
            e30 e30Var2 = e3Var.H;
            if (action == 9) {
            }
            if (motionEvent.getAction() == 0) {
                MotionEvent motionEvent62 = e3Var.q0;
                if (motionEvent62 == null) {
                }
                MotionEvent motionEvent72 = e3Var.q0;
                if (motionEvent72 != null) {
                }
                if (x == motionEvent.getX()) {
                }
                MotionEvent motionEvent82 = e3Var.q0;
                if ((motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime()) {
                }
                if (!z4) {
                }
                if (pointerId >= 0) {
                }
                ysVar2 = (ys) r4Var.c;
                if (ysVar2.d) {
                }
            }
        }
        e3Var.q0 = MotionEvent.obtainNoHistory(motionEvent);
        if (z3) {
        }
        E = E(motionEvent);
    }

    public final void l(iy iyVar) {
        this.T.p(iyVar, false);
        t40 t = iyVar.t();
        Object[] objArr = t.e;
        int i = t.g;
        for (int i2 = 0; i2 < i; i2++) {
            l((iy) objArr[i2]);
        }
    }

    public final boolean o(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        tf0 tf0Var;
        Object obj;
        super.onAttachedToWindow();
        if (!getRoot().B()) {
            getRoot().b(this);
        }
        setAttached(true);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(dx0.t());
        }
        this.v.onViewAttachedToWindow(this);
        if (!this.G0) {
            getComposeViewContext().e();
        }
        int i = 0;
        this.G0 = false;
        l(getRoot());
        k(getRoot());
        hm0 hm0Var = getSnapshotObserver().a;
        n nVar = hm0Var.d;
        xl0.b(xl0.a);
        synchronized (xl0.c) {
            xl0.h = ac.h0(xl0.h, nVar);
        }
        hm0Var.h = new b70(nVar);
        e3 m36getOutOfFrameExecutor = m36getOutOfFrameExecutor();
        if (m36getOutOfFrameExecutor == null) {
            z6.m("Expected the view to be attached to window.");
            return;
        }
        t2 t2Var = new t2(this, i);
        g7 g7Var = m36getOutOfFrameExecutor.m;
        boolean isEmpty = g7Var.isEmpty();
        g7Var.addLast(t2Var);
        if (isEmpty) {
            Handler handler = m36getOutOfFrameExecutor.getHandler();
            if (handler == null) {
                z6.l("schedule is called when outOfFrameExecutor is not available (view is detached)");
                return;
            }
            handler.postAtFrontOfQueue(m36getOutOfFrameExecutor.n);
        }
        getComposeViewContext().d();
        pe composeViewContext = getComposeViewContext();
        composeViewContext.g();
        iu0 iu0Var = composeViewContext.f;
        hz hzVar = this.i;
        if (iu0Var == null || hzVar == null) {
            tf0Var = null;
        } else {
            hu0 viewModelStore = iu0Var.getViewModelStore();
            gu0 gu0Var = new gu0();
            hh hhVar = hh.b;
            viewModelStore.getClass();
            hhVar.getClass();
            l20 l20Var = new l20(viewModelStore, gu0Var, hhVar);
            lb a = we0.a(jz.class);
            String a2 = a.a();
            if (a2 == null) {
                z6.l("Local and anonymous classes can not be ViewModels");
                return;
            }
            jz jzVar = (jz) l20Var.l(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(a2));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            y30 y30Var = jzVar.b;
            Object b = y30Var.b(id);
            if (b == null) {
                b = new h40(1);
                y30Var.h(id, b);
            }
            h40 h40Var = (h40) b;
            Object[] objArr = h40Var.a;
            int i2 = h40Var.b;
            while (true) {
                if (i >= i2) {
                    obj = null;
                    break;
                }
                obj = objArr[i];
                if (!((iz) obj).c) {
                    break;
                } else {
                    i++;
                }
            }
            iz izVar = (iz) obj;
            if (izVar == null) {
                izVar = new iz();
                h40Var.a(izVar);
            }
            izVar.c = true;
            this.j = izVar;
            tf0Var = izVar.b;
        }
        if (tf0Var == null) {
            tf0Var = b2.K;
        }
        this.l = tf0Var;
        pq pqVar = this.g0;
        if (pqVar != null) {
            pqVar.invoke(getComposeViewContext());
            this.g0 = null;
        }
        zy lifecycle = getComposeViewContext().d().getLifecycle();
        lifecycle.a(this);
        lifecycle.a(this.B);
        getInputModeManager().a.setValue(new kv(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            o3.a.b(this);
        }
        l2 m32getAutofillManager = m32getAutofillManager();
        if (m32getAutofillManager != null) {
            ((uo) getFocusOwner()).g.a(m32getAutofillManager);
            getSemanticsOwner().d.a(m32getAutofillManager);
        }
        ((uo) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.j0.get() == null) {
            getLegacyTextInputServiceAndroid().getClass();
            return false;
        }
        z6.c();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        G(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.j0.get() == null) {
            getLegacyTextInputServiceAndroid().getClass();
            return null;
        }
        z6.c();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        z3 z3Var = this.B;
        z3Var.getClass();
        x3.e(z3Var, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.v.onViewDetachedFromWindow(this);
        View view = this.p;
        if (m() && view != null) {
            removeView(view);
        }
        if (Build.VERSION.SDK_INT > 28) {
            h40 h40Var = O0;
            synchronized (h40Var) {
                h40Var.k(this);
            }
        }
        getComposeViewContext().b();
        a90 snapshotObserver = getSnapshotObserver();
        b70 b70Var = snapshotObserver.a.h;
        if (b70Var != null) {
            b70Var.a();
        }
        hm0 hm0Var = snapshotObserver.a;
        synchronized (hm0Var.g) {
            t40 t40Var = hm0Var.f;
            Object[] objArr = t40Var.e;
            int i = t40Var.g;
            for (int i2 = 0; i2 < i; i2++) {
                gm0 gm0Var = (gm0) objArr[i2];
                gm0Var.e.a();
                gm0Var.f.a();
                gm0Var.l.a();
                gm0Var.m.clear();
            }
        }
        zy lifecycle = getComposeViewContext().d().getLifecycle();
        lifecycle.b(this.B);
        lifecycle.b(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        iz izVar = this.j;
        if (izVar != null) {
            izVar.c = false;
        }
        this.j = null;
        if (Build.VERSION.SDK_INT >= 31) {
            o3.a.a(this);
        }
        l2 m32getAutofillManager = m32getAutofillManager();
        if (m32getAutofillManager != null) {
            getSemanticsOwner().d.k(m32getAutofillManager);
            ((uo) getFocusOwner()).g.k(m32getAutofillManager);
        }
        qe0 rectManager = getRectManager();
        rectManager.g = rectManager.d.a(0L, 0L, null, 0, 0);
        getRectManager().a();
        qe0 rectManager2 = getRectManager();
        u2 u2Var = rectManager2.i;
        if (u2Var != null) {
            rectManager2.b.removeCallbacks(u2Var);
            rectManager2.i = null;
        }
        ((uo) getFocusOwner()).g.k(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        uo uoVar = (uo) getFocusOwner();
        nh.O(uoVar.c, true);
        if (uoVar.f() != null) {
            yo f = uoVar.f();
            uoVar.h(null);
            if (f != null) {
                f.p0(xo.e, xo.g);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.d0 = 0L;
        H();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        G(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.d0 = 0L;
            this.T.j(this.D0);
            this.R = null;
            H();
            if (this.Q != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        y10 y10Var = this.T;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!getRoot().B()) {
                getRoot().b(this);
            }
            if (!isAttachedToWindow()) {
                l(getRoot());
            }
            long g = g(i);
            long g2 = g(i2);
            long s = lw.s((int) (g >>> 32), (int) (g & 4294967295L), (int) (g2 >>> 32), (int) (4294967295L & g2));
            wf wfVar = this.R;
            if (wfVar == null) {
                this.R = new wf(s);
                this.S = false;
            } else if (!wf.b(wfVar.a, s)) {
                this.S = true;
            }
            y10Var.q(s);
            y10Var.k();
            setMeasuredDimension(getRoot().I.o.e, getRoot().I.o.f);
            if (this.Q != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().I.o.e, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().I.o.f, 1073741824));
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure == null || this.H0) {
            return;
        }
        x(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        int toolType = motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.g) {
            int[] iArr = oo.a;
            xx xxVar = xx.e;
            xx xxVar2 = i != 0 ? i != 1 ? null : xx.f : xxVar;
            if (xxVar2 != null) {
                xxVar = xxVar2;
            }
            setLayoutDirection(xxVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        mi0 mi0Var;
        if (Build.VERSION.SDK_INT < 31 || (mi0Var = this.I0) == null) {
            return;
        }
        mi0Var.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        H();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        getInputModeManager().a.setValue(new kv(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        z3 z3Var = this.B;
        z3Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (lw.i(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            x3.b(z3Var, longSparseArray);
        } else {
            z3Var.e.post(new w3(0, z3Var, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean t;
        this.F0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (t = dx0.t())) {
            return;
        }
        setShowLayoutBounds(t);
        k(getRoot());
    }

    public final boolean p(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.q0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final long q(long j) {
        y();
        long y = u10.y(this.b0, j);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.f0 >> 32)) + Float.intBitsToFloat((int) (y >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f0 & 4294967295L)) + Float.intBitsToFloat((int) (y & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public final void r(boolean z) {
        y10 y10Var = this.T;
        if (y10Var.b.u() || ((t40) y10Var.e.f).g != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (y10Var.j(z ? this.D0 : this.E0)) {
                    requestLayout();
                }
                y10Var.a(false);
                getRectManager().a();
            } finally {
                Trace.endSection();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2 = 1;
        if (!isFocused()) {
            lo c = oo.c(i);
            int i3 = c != null ? c.a : 7;
            Boolean e = ((uo) getFocusOwner()).e(i3, rect != null ? new oe0(rect.left, rect.top, rect.right, rect.bottom) : null, new q2(i3, 0));
            Boolean bool = Boolean.TRUE;
            if (!lw.i(e, bool)) {
                if (!lw.i(((uo) getFocusOwner()).e(i3, null, new q2(i3, i2)), bool)) {
                    if (hasFocus() && (i3 == 1 || i3 == 2)) {
                        return ((uo) getFocusOwner()).g(i3);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void s() {
        h40 h40Var;
        Object[] objArr;
        if (this.N) {
            hm0 hm0Var = getSnapshotObserver().a;
            a60 a60Var = new a60(12);
            synchronized (hm0Var.g) {
                try {
                    t40 t40Var = hm0Var.f;
                    int i = t40Var.g;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = t40Var.e;
                        if (i2 >= i) {
                            break;
                        }
                        gm0 gm0Var = (gm0) objArr[i2];
                        gm0Var.c(a60Var);
                        if (!(gm0Var.f.e != 0)) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = t40Var.e;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    t40Var.g = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.N = false;
        }
        t5 t5Var = this.Q;
        if (t5Var != null) {
            f(t5Var);
        }
        l2 m32getAutofillManager = m32getAutofillManager();
        if (m32getAutofillManager != null) {
            z30 z30Var = m32getAutofillManager.k;
            if (z30Var.d == 0 && m32getAutofillManager.l) {
                m32getAutofillManager.e.k().commit();
                m32getAutofillManager.l = false;
            }
            if (z30Var.d != 0) {
                m32getAutofillManager.l = true;
            }
        }
        while (this.t0.j() && this.t0.g(0) != null) {
            int i5 = this.t0.b;
            int i6 = 0;
            while (true) {
                h40Var = this.t0;
                if (i6 < i5) {
                    eq eqVar = (eq) h40Var.g(i6);
                    this.t0.o(i6, null);
                    if (eqVar != null) {
                        eqVar.b();
                    }
                    i6++;
                }
            }
            h40Var.m(0, i5);
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.A.l = j;
    }

    public final void setComposeViewContext(pe peVar) {
        if (getCoroutineContext() != ((le0) peVar.c()).w && !((q40) getRoot().i()).isEmpty()) {
            cv.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        ql0 ql0Var = (ql0) xl0.b.n();
        pq e = ql0Var != null ? ql0Var.e() : null;
        ql0 h = j20.h(ql0Var);
        try {
            pe peVar2 = get_composeViewContext();
            if (peVar != peVar2) {
                if (isAttachedToWindow()) {
                    peVar2.b();
                    peVar.e();
                }
                set_composeViewContext(peVar);
                setCoroutineContext(((le0) peVar.c()).w);
            }
        } finally {
            j20.p(ql0Var, h, e);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.G0 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.J.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(z3 z3Var) {
        this.B = z3Var;
    }

    public void setCoroutineContext(tg tgVar) {
        this.r = tgVar;
    }

    public final void setFrameEndScheduler$ui(hz hzVar) {
        this.i = hzVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.d0 = j;
    }

    public final void setOnReadyForComposition(pq pqVar) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.G0) {
            pqVar.invoke(getComposeViewContext());
        } else {
            this.g0 = pqVar;
        }
    }

    public final void setPlayNavigationSoundEffect$ui(tq tqVar) {
        this.B0 = tqVar;
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m30setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(nu nuVar) {
        this.h = nuVar;
    }

    public void setShowLayoutBounds(boolean z) {
        this.P = z;
    }

    public void setUncaughtExceptionHandler(kg0 kg0Var) {
        this.T.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(iy iyVar) {
        k3 k3Var = this.A;
        k3Var.B = true;
        if (k3Var.n()) {
            k3Var.o(iyVar);
        }
        z3 z3Var = this.B;
        z3Var.j = true;
        if (z3Var.h()) {
            z3Var.k.p(fs0.a);
        }
    }

    public final void u(iy iyVar, boolean z, boolean z2) {
        iy n;
        iy n2;
        y10 y10Var = this.T;
        if (!z) {
            if (y10Var.p(iyVar, z2)) {
                C(iyVar);
                return;
            }
            return;
        }
        v6 v6Var = y10Var.b;
        iy iyVar2 = iyVar.l;
        ly lyVar = iyVar.I;
        if (iyVar2 == null) {
            cv.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int ordinal = lyVar.c.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    z6.j();
                    return;
                }
                if (!lyVar.d || z2) {
                    lyVar.d = true;
                    lyVar.o.x = true;
                    if (iyVar.P) {
                        return;
                    }
                    if ((lw.i(iyVar.D(), Boolean.TRUE) || y10.g(iyVar)) && ((n = iyVar.n()) == null || !n.I.d)) {
                        v6Var.j(iyVar, qw.e);
                    } else if ((iyVar.C() || y10.h(iyVar)) && ((n2 = iyVar.n()) == null || !n2.k())) {
                        v6Var.j(iyVar, qw.g);
                    }
                    if (y10Var.d) {
                        return;
                    }
                    C(iyVar);
                    return;
                }
                return;
            }
        }
        y10Var.g.b(new x10(iyVar, true, z2));
    }

    public final void v(iy iyVar, boolean z, boolean z2) {
        ly lyVar = iyVar.I;
        qw qwVar = qw.h;
        y10 y10Var = this.T;
        if (!z) {
            y10Var.getClass();
            int ordinal = lyVar.c.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                z6.j();
                return;
            }
            iy n = iyVar.n();
            boolean z3 = n == null || n.C();
            if (!z2) {
                if (iyVar.k()) {
                    return;
                }
                if (iyVar.j() && iyVar.C() == z3 && iyVar.C() == lyVar.o.w) {
                    return;
                }
            }
            a20 a20Var = lyVar.o;
            a20Var.y = true;
            a20Var.z = true;
            if (!iyVar.P && a20Var.w && z3) {
                if ((n == null || !n.j()) && (n == null || !n.k())) {
                    y10Var.b.j(iyVar, qwVar);
                }
                if (y10Var.d) {
                    return;
                }
                C(null);
                return;
            }
            return;
        }
        v6 v6Var = y10Var.b;
        int ordinal2 = lyVar.c.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    z6.j();
                    return;
                }
            }
        }
        if ((lyVar.d || lyVar.e) && !z2) {
            return;
        }
        lyVar.e = true;
        lyVar.f = true;
        a20 a20Var2 = lyVar.o;
        a20Var2.y = true;
        a20Var2.z = true;
        if (iyVar.P) {
            return;
        }
        iy n2 = iyVar.n();
        if (lw.i(iyVar.D(), Boolean.TRUE) && ((n2 == null || !n2.I.d) && (n2 == null || !n2.I.e))) {
            v6Var.j(iyVar, qw.f);
        } else if (iyVar.C() && ((n2 == null || !n2.j()) && (n2 == null || !n2.k()))) {
            v6Var.j(iyVar, qwVar);
        }
        if (y10Var.d) {
            return;
        }
        C(null);
    }

    public final void w() {
        k3 k3Var = this.A;
        k3Var.B = true;
        Handler handler = k3Var.h.getHandler();
        if (k3Var.n() && !k3Var.M && handler != null) {
            k3Var.M = true;
            handler.post(k3Var.O);
        }
        z3 z3Var = this.B;
        z3Var.j = true;
        Handler handler2 = z3Var.e.getHandler();
        if (!z3Var.h() || z3Var.p || handler2 == null) {
            return;
        }
        z3Var.p = true;
        handler2.post(z3Var.q);
    }

    public final void x(ViewStructure viewStructure) {
        l2 m32getAutofillManager = m32getAutofillManager();
        if (m32getAutofillManager != null) {
            iy iyVar = m32getAutofillManager.f.a;
            AutofillId autofillId = m32getAutofillManager.j;
            String str = m32getAutofillManager.i;
            qe0 qe0Var = m32getAutofillManager.h;
            j20.l(viewStructure, iyVar, autofillId, str, qe0Var);
            Object[] objArr = o60.a;
            h40 h40Var = new h40(2);
            h40Var.a(iyVar);
            h40Var.a(viewStructure);
            while (h40Var.j()) {
                Object l = h40Var.l(h40Var.b - 1);
                l.getClass();
                ViewStructure viewStructure2 = (ViewStructure) l;
                Object l2 = h40Var.l(h40Var.b - 1);
                l2.getClass();
                q40 q40Var = (q40) ((iy) l2).i();
                int i = q40Var.e.g;
                for (int i2 = 0; i2 < i; i2++) {
                    iy iyVar2 = (iy) q40Var.get(i2);
                    if (!iyVar2.P && iyVar2.B() && iyVar2.C()) {
                        qj0 q = iyVar2.q();
                        if (q != null) {
                            k40 k40Var = q.e;
                            if (k40Var.b(pj0.f) || k40Var.b(pj0.g) || k40Var.b(yj0.r) || k40Var.b(yj0.s) || (Build.VERSION.SDK_INT >= 34 && k40Var.b(kw.r))) {
                                ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                j20.l(newChild, iyVar2, autofillId, str, qe0Var);
                                h40Var.a(iyVar2);
                                h40Var.a(newChild);
                            }
                        }
                        h40Var.a(iyVar2);
                        h40Var.a(viewStructure2);
                    }
                }
            }
        }
        k2 m31getAutofill = m31getAutofill();
        if (m31getAutofill != null) {
            u7 u7Var = m31getAutofill.b;
            LinkedHashMap linkedHashMap = u7Var.a;
            LinkedHashMap linkedHashMap2 = u7Var.a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int intValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    z6.c();
                    return;
                }
                ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                newChild2.setAutofillId(m31getAutofill.c, intValue);
                newChild2.setId(intValue, m31getAutofill.a.getContext().getPackageName(), null, null);
                newChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    public final void y() {
        if (this.e0) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.d0) {
            this.d0 = currentAnimationTimeMillis;
            A();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.V;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = f2 - iArr[1];
            this.f0 = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        }
    }

    public final void z(MotionEvent motionEvent) {
        this.d0 = AnimationUtils.currentAnimationTimeMillis();
        A();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long y2 = u10.y(this.b0, (Float.floatToRawIntBits(y) & 4294967295L) | (Float.floatToRawIntBits(x) << 32));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (y2 >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (y2 & 4294967295L));
        this.f0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    /* renamed from: getAutofill, reason: merged with bridge method [inline-methods] */
    public k2 m31getAutofill() {
        return this.L;
    }

    /* renamed from: getAutofillManager, reason: merged with bridge method [inline-methods] */
    public l2 m32getAutofillManager() {
        return this.M;
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public e4 m33getDragAndDropManager() {
        return this.s;
    }

    public y30 getLayoutNodes() {
        return this.x;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @xi
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m28getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    @xi
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public lg0 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(kg0 kg0Var) {
    }
}
