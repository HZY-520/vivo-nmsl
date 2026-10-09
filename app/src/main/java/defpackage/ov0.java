package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class ov0 extends nv0 {
    public ov0(yv0 yv0Var, WindowInsets windowInsets) {
        super(yv0Var, windowInsets);
    }

    @Override // defpackage.uv0
    public yv0 a() {
        return yv0.b(this.c.consumeDisplayCutout(), null);
    }

    @Override // defpackage.uv0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov0)) {
            return false;
        }
        ov0 ov0Var = (ov0) obj;
        return Objects.equals(this.c, ov0Var.c) && Objects.equals(this.g, ov0Var.g) && mv0.K(this.h, ov0Var.h);
    }

    @Override // defpackage.uv0
    public qj g() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new qj(displayCutout);
    }

    @Override // defpackage.uv0
    public int hashCode() {
        return this.c.hashCode();
    }
}
