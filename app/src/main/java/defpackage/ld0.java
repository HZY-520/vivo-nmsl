package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ld0 implements ez {
    public static final ld0 m = new ld0();
    public int e;
    public int f;
    public Handler i;
    public boolean g = true;
    public boolean h = true;
    public final gz j = new gz(this);
    public final o k = new o(5, this);
    public final t3 l = new t3(16, this);

    public final void a() {
        int i = this.f + 1;
        this.f = i;
        if (i == 1) {
            if (this.g) {
                this.j.e(xy.ON_RESUME);
                this.g = false;
            } else {
                Handler handler = this.i;
                handler.getClass();
                handler.removeCallbacks(this.k);
            }
        }
    }

    @Override // defpackage.ez
    public final zy getLifecycle() {
        return this.j;
    }
}
