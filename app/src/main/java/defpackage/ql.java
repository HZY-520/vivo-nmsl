package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ql {
    public final Context a;
    public final int b;
    public long c = 0;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public ql(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? x3.d(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(q80 q80Var) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        EdgeEffect a = i >= 31 ? x3.a(context) : new bs(context);
        a.setColor(this.b);
        if (!ew.a(this.c, 0L)) {
            long j = this.c;
            if (q80Var == q80.e) {
                a.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return a;
            }
            a.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return a;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(q80.e);
        this.e = a;
        return a;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(q80.f);
        this.f = a;
        return a;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(q80.f);
        this.g = a;
        return a;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(q80.e);
        this.d = a;
        return a;
    }
}
