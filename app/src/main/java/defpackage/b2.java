package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class b2 implements q8, sg, ti, tf0, ep0, lw0 {
    public static final a4 A;
    public static final a4 B;
    public static final a4 C;
    public static final /* synthetic */ b2 D;
    public static final /* synthetic */ b2 E;
    public static final b2 F;
    public static final b2 G;
    public static final b2 H;
    public static final b2 I;
    public static final oe0 J;
    public static final b2 K;
    public static final /* synthetic */ b2 L;
    public static final /* synthetic */ b2 M;
    public static final /* synthetic */ b2 N;
    public static final /* synthetic */ b2 O;
    public static final /* synthetic */ b2 P;
    public static final b2 Q;
    public static final b2 R;
    public static final b2 S;
    public static final /* synthetic */ b2 T;
    public static final b2 U;
    public static final b2 V;
    public static final b2 W;
    public static final b2 X;
    public static final b2 Y;
    public static final b2 Z;
    public static final mw0 a0;
    public static final j8 f = new j8(-1.0f, -1.0f);
    public static final j8 g = new j8(0.0f, -1.0f);
    public static final j8 h = new j8(1.0f, -1.0f);
    public static final j8 i = new j8(-1.0f, 0.0f);
    public static final j8 j = new j8(0.0f, 0.0f);
    public static final j8 k = new j8(1.0f, 0.0f);
    public static final j8 l = new j8(-1.0f, 1.0f);
    public static final j8 m = new j8(0.0f, 1.0f);
    public static final j8 n = new j8(1.0f, 1.0f);
    public static final i8 o = new i8(-1.0f);
    public static final i8 p = new i8(0.0f);
    public static final h8 q = new h8(-1.0f);
    public static final b2 r;
    public static final b2 s;
    public static final z6 t;
    public static final /* synthetic */ b2 u;
    public static final bd v;
    public static final bd w;
    public static final bd x;
    public static final bd y;
    public static final l0 z;
    public final /* synthetic */ int e;

    static {
        new h8(0.0f);
        r = new b2(1);
        s = new b2(2);
        t = new z6(2);
        u = new b2(4);
        v = new bd(5);
        w = new bd(6);
        x = new bd(7);
        y = new bd(8);
        z = new l0(15, (byte) 0);
        A = new a4(0);
        B = new a4(1);
        C = new a4(2);
        D = new b2(6);
        E = new b2(7);
        F = new b2(8);
        G = new b2(9);
        H = new b2(10);
        I = new b2(11);
        J = new oe0(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
        K = new b2(13);
        L = new b2(14);
        M = new b2(15);
        N = new b2(16);
        O = new b2(17);
        P = new b2(18);
        Q = new b2(19);
        R = new b2(20);
        S = new b2(21);
        T = new b2(22);
        U = new b2(23);
        V = new b2(24);
        W = new b2(25);
        X = new b2(26);
        Y = new b2(27);
        Z = new b2(28);
        a0 = new mw0();
    }

    public /* synthetic */ b2(int i2) {
        this.e = i2;
    }

    @Override // defpackage.ep0
    public float a() {
        return Float.NaN;
    }

    @Override // defpackage.ep0
    public long b() {
        int i2 = gc.g;
        return gc.f;
    }

    @Override // defpackage.q8
    public Rect c(Activity activity) {
        int i2 = this.e;
        p8 p8Var = q8.a;
        DisplayCutout displayCutout = null;
        switch (i2) {
            case 1:
                Rect rect = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        invoke.getClass();
                        rect.set((Rect) invoke);
                    } else {
                        Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        invoke2.getClass();
                        rect.set((Rect) invoke2);
                    }
                } catch (Exception e) {
                    if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    p8Var.getClass();
                    Log.w(p8.b, e);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
                }
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i3 = rect.bottom + dimensionPixelSize;
                    if (i3 == point.y) {
                        rect.bottom = i3;
                    } else {
                        int i4 = rect.right + dimensionPixelSize;
                        if (i4 == point.x) {
                            rect.right = i4;
                        } else if (rect.left == dimensionPixelSize) {
                            rect.left = 0;
                        }
                    }
                }
                if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
                    try {
                        Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        Object newInstance = constructor.newInstance(null);
                        Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay, newInstance);
                        Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(newInstance);
                        if (obj2 instanceof DisplayCutout) {
                            displayCutout = (DisplayCutout) obj2;
                        }
                    } catch (Exception e2) {
                        if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                            throw e2;
                        }
                        p8Var.getClass();
                        Log.w(p8.b, e2);
                    }
                    if (displayCutout != null) {
                        if (rect.left == displayCutout.getSafeInsetLeft()) {
                            rect.left = 0;
                        }
                        if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                            rect.right = displayCutout.getSafeInsetRight() + rect.right;
                        }
                        if (rect.top == displayCutout.getSafeInsetTop()) {
                            rect.top = 0;
                        }
                        if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                            rect.bottom = displayCutout.getSafeInsetBottom() + rect.bottom;
                        }
                    }
                }
                return rect;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField3 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField3.setAccessible(true);
                    Object obj3 = declaredField3.get(configuration2);
                    Object invoke3 = obj3.getClass().getDeclaredMethod("getBounds", null).invoke(obj3, null);
                    invoke3.getClass();
                    return new Rect((Rect) invoke3);
                } catch (Exception e3) {
                    if (!(e3 instanceof NoSuchFieldException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException)) {
                        throw e3;
                    }
                    p8Var.getClass();
                    Log.w(p8.b, e3);
                    return r.c(activity);
                }
        }
    }

    @Override // defpackage.ti
    public float d(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.ep0
    public dx0 e() {
        return null;
    }

    @Override // defpackage.lw0
    public hw0 f(Context context, ti tiVar) {
        Context context2 = context;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                context2 = context;
                break;
            }
            if ((context2 instanceof Activity) || (context2 instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context2 = contextWrapper.getBaseContext();
            context2.getClass();
        }
        if (context2 instanceof Activity) {
            Activity activity = (Activity) context2;
            q8.a.getClass();
            int i2 = Build.VERSION.SDK_INT;
            return new hw0(new o8((i2 >= 30 ? r8.e : i2 >= 29 ? s : r).c(activity)), tiVar.d(activity));
        }
        if (!(context2 instanceof InputMethodService) && !(context2 instanceof Application)) {
            z6.l("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new hw0(new Rect(0, 0, point.x, point.y), tiVar.d(context));
    }

    public boolean g(Object obj, Object obj2) {
        switch (this.e) {
            case 20:
                return false;
            case 23:
                return obj == obj2;
            default:
                return lw.i(obj, obj2);
        }
    }

    public String toString() {
        switch (this.e) {
            case 20:
                return "NeverEqualPolicy";
            case 23:
                return "ReferentialEqualityPolicy";
            case 25:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }
}
