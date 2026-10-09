package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class qj {
    public final DisplayCutout a;

    public qj(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final nv a() {
        return Build.VERSION.SDK_INT >= 30 ? nv.c(e1.c(this.a)) : nv.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qj.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((qj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
