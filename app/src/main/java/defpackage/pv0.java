package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class pv0 extends ov0 {
    public nv s;
    public nv t;
    public nv u;

    public pv0(yv0 yv0Var, WindowInsets windowInsets) {
        super(yv0Var, windowInsets);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.uv0
    public nv j() {
        Insets mandatorySystemGestureInsets;
        nv nvVar = this.t;
        if (nvVar != null) {
            return nvVar;
        }
        mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
        nv c = nv.c(mandatorySystemGestureInsets);
        this.t = c;
        return c;
    }

    @Override // defpackage.uv0
    public nv l() {
        Insets systemGestureInsets;
        nv nvVar = this.s;
        if (nvVar != null) {
            return nvVar;
        }
        systemGestureInsets = this.c.getSystemGestureInsets();
        nv c = nv.c(systemGestureInsets);
        this.s = c;
        return c;
    }

    @Override // defpackage.uv0
    public nv n() {
        Insets tappableElementInsets;
        nv nvVar = this.u;
        if (nvVar != null) {
            return nvVar;
        }
        tappableElementInsets = this.c.getTappableElementInsets();
        nv c = nv.c(tappableElementInsets);
        this.u = c;
        return c;
    }

    @Override // defpackage.nv0, defpackage.uv0
    public void w(nv nvVar) {
    }
}
