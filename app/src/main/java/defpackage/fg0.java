package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class fg0 extends View {
    public static final int[] j = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] k = new int[0];
    public is0 e;
    public Boolean f;
    public Long g;
    public o h;
    public f5 i;

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.h;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.g;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? j : k;
            is0 is0Var = this.e;
            if (is0Var != null) {
                is0Var.setState(iArr);
            }
        } else {
            o oVar = new o(6, this);
            this.h = oVar;
            postDelayed(oVar, 50L);
        }
        this.g = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(fg0 fg0Var) {
        is0 is0Var = fg0Var.e;
        if (is0Var != null) {
            is0Var.setState(k);
        }
        fg0Var.h = null;
    }

    public final void b(hd0 hd0Var, boolean z, long j2, int i, long j3, f5 f5Var) {
        long j4 = hd0Var.a;
        if (this.e == null || !Boolean.valueOf(z).equals(this.f)) {
            is0 is0Var = new is0(z);
            setBackground(is0Var);
            this.e = is0Var;
            this.f = Boolean.valueOf(z);
        }
        is0 is0Var2 = this.e;
        is0Var2.getClass();
        this.i = f5Var;
        e(i, j2, j3);
        if (z) {
            is0Var2.setHotspot(Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (4294967295L & j4)));
        } else {
            is0Var2.setHotspot(is0Var2.getBounds().centerX(), is0Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.i = null;
        o oVar = this.h;
        if (oVar != null) {
            removeCallbacks(oVar);
            o oVar2 = this.h;
            oVar2.getClass();
            oVar2.run();
        } else {
            is0 is0Var = this.e;
            if (is0Var != null) {
                is0Var.setState(k);
            }
        }
        is0 is0Var2 = this.e;
        if (is0Var2 == null) {
            return;
        }
        is0Var2.setVisible(false, false);
        unscheduleDrawable(is0Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(int i, long j2, long j3) {
        is0 is0Var = this.e;
        if (is0Var == null) {
            return;
        }
        if (is0Var.getRadius() != i) {
            is0Var.setRadius(i);
        }
        long b = gc.b(j3, 0.1f);
        gc gcVar = is0Var.f;
        if (!(gcVar == null ? false : as0.a(gcVar.a, b))) {
            is0Var.f = new gc(b);
            is0Var.setColor(ColorStateList.valueOf(lw.F(b)));
        }
        Rect rect = new Rect(0, 0, t10.B(Float.intBitsToFloat((int) (j2 >> 32))), t10.B(Float.intBitsToFloat((int) (j2 & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        is0Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        f5 f5Var = this.i;
        if (f5Var != null) {
            f5Var.b();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
