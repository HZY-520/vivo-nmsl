package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class eg0 extends ViewGroup {
    public final int e;
    public final ArrayList f;
    public final ArrayList g;
    public final p2 h;
    public int i;

    public eg0(Context context) {
        super(context);
        this.e = 5;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.g = arrayList2;
        this.h = new p2(16);
        setClipChildren(false);
        fg0 fg0Var = new fg0(context);
        addView(fg0Var);
        arrayList.add(fg0Var);
        arrayList2.add(fg0Var);
        this.i = 1;
        setTag(2131034172, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
