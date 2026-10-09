package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ev0 extends lv0 {
    public static Field f;
    public static boolean g;
    public static Constructor h;
    public static boolean i;
    public WindowInsets e;

    public ev0() {
        this.e = i();
    }

    private static WindowInsets i() {
        if (!g) {
            try {
                f = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            g = true;
        }
        Field field = f;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!i) {
            try {
                h = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            i = true;
        }
        Constructor constructor = h;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // defpackage.lv0
    public yv0 b() {
        a();
        yv0 b = yv0.b(this.e, null);
        nv[] nvVarArr = this.b;
        uv0 uv0Var = b.a;
        uv0Var.u(nvVarArr);
        uv0Var.w(null);
        uv0Var.t(null);
        uv0Var.y(this.c);
        uv0Var.z(this.d);
        return b;
    }

    @Override // defpackage.lv0
    public void g(nv nvVar) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(nvVar.a, nvVar.b, nvVar.c, nvVar.d);
        }
    }

    public ev0(yv0 yv0Var) {
        super(yv0Var);
        this.e = yv0Var.a();
    }
}
