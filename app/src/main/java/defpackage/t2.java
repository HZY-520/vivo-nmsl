package defpackage;

import android.os.Build;
import android.os.LocaleList;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class t2 implements eq {
    public final /* synthetic */ int e;
    public final /* synthetic */ e3 f;

    public /* synthetic */ t2(e3 e3Var, int i) {
        this.e = i;
        this.f = e3Var;
    }

    @Override // defpackage.eq
    public final Object b() {
        int i = this.e;
        int i2 = 0;
        e3 e3Var = this.f;
        switch (i) {
            case 0:
                if (Build.VERSION.SDK_INT > 28 && e3Var.isAttachedToWindow()) {
                    if (e3.P0 == null) {
                        y2 y2Var = new y2(0);
                        e3.P0 = y2Var;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (e3.L0 == null) {
                                e3.L0 = Class.forName("android.os.SystemProperties");
                            }
                            Method method = e3.N0;
                            if (method == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls = e3.L0;
                                method = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                                e3.N0 = method;
                            }
                            if (method != null) {
                                method.invoke(null, y2Var);
                            }
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    h40 h40Var = e3.O0;
                    synchronized (h40Var) {
                        h40Var.a(e3Var);
                    }
                }
                return fs0.a;
            case 1:
                Boolean bool = (Boolean) e3Var.t.getValue();
                bool.getClass();
                return bool;
            case 2:
                LocaleList locales = e3Var.getConfiguration().getLocales();
                i00 i00Var = new i00(new j00(locales));
                if (locales.isEmpty()) {
                    i00Var = new i00(new j00(LocaleList.getDefault()));
                }
                LocaleList localeList = i00Var.a.a;
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                while (i2 < size) {
                    Locale locale = localeList.get(i2);
                    locale.getClass();
                    arrayList.add(new g00(locale));
                    i2++;
                }
                return new h00(arrayList);
            case 3:
                MotionEvent motionEvent = e3Var.q0;
                if (motionEvent != null) {
                    boolean contains = kw.C(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = e3Var.q0;
                    boolean z = motionEvent2 != null && motionEvent2.getButtonState() == 0;
                    if (contains && z) {
                        e3Var.r0 = SystemClock.uptimeMillis();
                        e3Var.post(e3Var.y0);
                    }
                }
                e3Var.E0.b();
                return fs0.a;
            default:
                t5 t5Var = e3Var.Q;
                if (t5Var != null) {
                    int childCount = t5Var.getChildCount();
                    while (i2 < childCount) {
                        t5Var.getChildAt(i2);
                        i2++;
                    }
                }
                return fs0.a;
        }
    }
}
