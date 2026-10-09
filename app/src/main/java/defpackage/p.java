package defpackage;

import android.os.IBinder;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class p extends ViewGroup {
    public WeakReference e;
    public IBinder f;
    public yw0 g;
    public xe h;
    public pe i;
    public v7 j;
    public boolean k;
    public boolean l;
    public boolean m;

    private final void setParentContext(xe xeVar) {
        if (this.h != xeVar) {
            this.h = xeVar;
            if (xeVar != null) {
                this.e = null;
            }
            yw0 yw0Var = this.g;
            if (yw0Var != null) {
                yw0Var.d();
                this.g = null;
                if (isAttachedToWindow()) {
                    e();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f != iBinder) {
            this.f = iBinder;
            this.e = null;
        }
    }

    public abstract void a(se seVar, int i);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.i == null) {
                e3 e3Var = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof e3) {
                        e3Var = (e3) childAt;
                    }
                }
                if (e3Var != null) {
                    e3Var.setComposeViewContext(h(lr0.m(this), e3Var.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                e();
            }
        }
    }

    public final void c() {
        if (!this.l) {
            throw new UnsupportedOperationException(j2.j("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
        }
    }

    public final void d() {
        View childAt = getChildAt(0);
        e3 e3Var = childAt instanceof e3 ? (e3) childAt : null;
        if (e3Var != null && e3Var.G0) {
            e3Var.getComposeViewContext().b();
            e3Var.G0 = false;
        }
        yw0 yw0Var = this.g;
        if (yw0Var != null) {
            yw0Var.d();
        }
        this.g = null;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        if (this.g == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.l = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    pe peVar = this.i;
                    if (peVar == null) {
                        peVar = f();
                    }
                    this.g = bx0.a(this, peVar, new be(1003123809, true, new n(objArr == true ? 1 : 0, this)));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.l = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pe f() {
        pe composeViewContext;
        pe o;
        iu0 iu0Var;
        iu0 iu0Var2 = null;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            e3 e3Var = childAt instanceof e3 ? (e3) childAt : null;
            if (e3Var != null) {
                composeViewContext = e3Var.getComposeViewContext();
                View m = lr0.m(this);
                o = lr0.o(m);
                if (o == null) {
                    return h(m, o);
                }
                xe g = g();
                ez p = u10.p(m);
                if (p == null) {
                    p = composeViewContext != null ? composeViewContext.d() : null;
                    if (p == null) {
                        z6.m("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                        return null;
                    }
                }
                ez ezVar = p;
                uh0 e = v10.e(m);
                if (e == null) {
                    if (composeViewContext != null) {
                        composeViewContext.g();
                        e = composeViewContext.e;
                        e.getClass();
                    } else {
                        e = null;
                    }
                    if (e == null) {
                        z6.m("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                        return null;
                    }
                }
                uh0 uh0Var = e;
                iu0 d = j20.d(m);
                if (d == null) {
                    if (composeViewContext != null) {
                        composeViewContext.g();
                        iu0Var2 = composeViewContext.f;
                    }
                    iu0Var = iu0Var2;
                } else {
                    iu0Var = d;
                }
                pe peVar = new pe(lr0.o(lr0.m(m)), m, g, ezVar, uh0Var, iu0Var);
                m.setTag(2131034154, new WeakReference(peVar));
                return peVar;
            }
        }
        composeViewContext = null;
        View m2 = lr0.m(this);
        o = lr0.o(m2);
        if (o == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r3 > 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Type inference failed for: r0v0, types: [xe] */
    /* JADX WARN: Type inference failed for: r0v1, types: [xe] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [xe] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [le0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xe g() {
        xe xeVar;
        le0 le0Var = this.h;
        if (le0Var == 0) {
            le0Var = tw0.a(this);
            if (le0Var == 0) {
                Object parent = getParent();
                le0Var = le0Var;
                while (le0Var == 0 && (parent instanceof View)) {
                    View view = (View) parent;
                    xe a = tw0.a(view);
                    parent = t30.l(view);
                    le0Var = a;
                }
            }
            ge0 ge0Var = ge0.f;
            if (le0Var != 0) {
                Object obj = (!(le0Var instanceof le0) || ((ge0) le0Var.u.getValue()).compareTo(ge0Var) > 0) ? le0Var : null;
                if (obj != null) {
                    this.e = new WeakReference(obj);
                }
            } else {
                le0Var = 0;
            }
            if (le0Var == 0) {
                WeakReference weakReference = this.e;
                if (weakReference != null && (xeVar = (xe) weakReference.get()) != null) {
                    boolean z = xeVar instanceof le0;
                    le0Var = xeVar;
                    if (z) {
                        int compareTo = ((ge0) ((le0) xeVar).u.getValue()).compareTo(ge0Var);
                        le0Var = xeVar;
                    }
                    if (le0Var == 0) {
                        le0Var = tw0.b(this);
                        Object obj2 = ((ge0) le0Var.u.getValue()).compareTo(ge0Var) > 0 ? le0Var : null;
                        if (obj2 != null) {
                            this.e = new WeakReference(obj2);
                        }
                    }
                }
                le0Var = 0;
                if (le0Var == 0) {
                }
            }
        }
        return le0Var;
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m37getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(2131034158);
        r7 r7Var = tag instanceof r7 ? (r7) tag : null;
        if (r7Var != null) {
            return r7Var.a;
        }
        return 1;
    }

    public final pe getComposeViewContext$ui() {
        return this.i;
    }

    public final boolean getHasComposition() {
        return this.g != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.k;
    }

    public final pe h(View view, pe peVar) {
        xe g = g();
        ez p = u10.p(view);
        iu0 d = j20.d(view);
        uh0 e = v10.e(view);
        if (g == peVar.c() && p == peVar.d()) {
            peVar.g();
            if (d == peVar.f) {
                peVar.g();
                uh0 uh0Var = peVar.e;
                uh0Var.getClass();
                if (e == uh0Var) {
                    return peVar;
                }
            }
        }
        if (((le0) g).w != ((le0) peVar.c()).w) {
            d();
        }
        if (p == null) {
            p = peVar.d();
        }
        ez ezVar = p;
        if (e == null) {
            peVar.g();
            e = peVar.e;
            e.getClass();
        }
        pe peVar2 = new pe(peVar, view, g, ezVar, e, d);
        view.setTag(2131034154, new WeakReference(peVar2));
        return peVar2;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.m || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k40 k40Var = tw0.a;
        Object l = t30.l(this);
        View view = this;
        while (l instanceof View) {
            View view2 = (View) l;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            l = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new o(0, this));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m38setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(2131034158, new r7(i));
    }

    public final void setComposeViewContext$ui(pe peVar) {
        if (this.i != peVar) {
            if (peVar == null) {
                d();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                e3 e3Var = childAt instanceof e3 ? (e3) childAt : null;
                if (e3Var != null) {
                    if (e3Var.getCoroutineContext() != ((le0) peVar.c()).w) {
                        d();
                    }
                    e3Var.setComposeViewContext(peVar);
                }
            }
            this.i = peVar;
        }
    }

    public final void setParentCompositionContext(xe xeVar) {
        setParentContext(xeVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.k = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((e3) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.m = true;
    }

    public final void setViewCompositionStrategy(vt0 vt0Var) {
        v7 v7Var = this.j;
        if (v7Var != null) {
            v7Var.b();
        }
        ((p30) vt0Var).getClass();
        q4 q4Var = new q4(1, this);
        addOnAttachStateChangeListener(q4Var);
        z6 z6Var = new z6(21);
        v10.g(this).a.add(z6Var);
        this.j = new v7(this, q4Var, z6Var, 7);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
