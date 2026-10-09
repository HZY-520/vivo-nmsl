package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class l8 {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public l8(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            m2.h();
            porterDuffColorFilter = m2.d(lw.F(j), t10.D(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(lw.F(j), t10.F(i));
        }
        this.a = porterDuffColorFilter;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8)) {
            return false;
        }
        l8 l8Var = (l8) obj;
        long j = l8Var.b;
        int i = gc.g;
        return as0.a(this.b, j) && this.c == l8Var.c;
    }

    public final int hashCode() {
        int i = gc.g;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "BlendModeColorFilter(color=" + gc.h(this.b) + ", blendMode=" + t10.H(this.c) + ")";
    }
}
