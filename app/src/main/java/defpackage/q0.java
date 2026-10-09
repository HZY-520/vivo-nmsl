package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class q0 extends ClickableSpan {
    public final int e;
    public final i1 f;
    public final int g;

    public q0(int i, i1 i1Var, int i2) {
        this.e = i;
        this.f = i1Var;
        this.g = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.e);
        this.f.a.performAction(this.g, bundle);
    }
}
