package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class b30 implements a30 {
    public final Context e;
    public mg f;
    public final s90 g = new s90(1.0f);
    public wm0 h;

    public b30(Context context) {
        this.e = context;
    }

    @Override // defpackage.tg
    public final tg g(tg tgVar) {
        return q3.H(this, tgVar);
    }

    @Override // defpackage.tg
    public final rg j(sg sgVar) {
        return q3.t(this, sgVar);
    }

    @Override // defpackage.tg
    public final Object m(tq tqVar, Object obj) {
        return tqVar.invoke(obj, this);
    }

    @Override // defpackage.tg
    public final tg q(sg sgVar) {
        return q3.C(this, sgVar);
    }

    @Override // defpackage.a30
    public final float r() {
        ng ngVar;
        an0 an0Var;
        if (this.h == null) {
            Context context = this.e;
            k40 k40Var = tw0.a;
            synchronized (k40Var) {
                try {
                    Object g = k40Var.g(context);
                    ngVar = null;
                    if (g == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        o9 a = lw.a(-1, 6, null);
                        t3 t3Var = new t3(19, new rw0(contentResolver, uriFor, new sw0(a, Handler.createAsync(Looper.getMainLooper())), a, context, null));
                        xn0 xn0Var = new xn0(null);
                        fi fiVar = pj.a;
                        g = q3.N(t3Var, new mg(q3.H(xn0Var, h10.a)), new ym0(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        k40Var.l(context, g);
                    }
                    an0Var = (an0) g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.g.g(((Number) an0Var.getValue()).floatValue());
            mg mgVar = this.f;
            if (mgVar == null) {
                z6.m("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.h = q3.A(mgVar, null, new d(an0Var, this, ngVar, 7), 3);
        }
        s90 s90Var = this.g;
        return ((yl0) xl0.s(s90Var.f, s90Var)).c;
    }
}
