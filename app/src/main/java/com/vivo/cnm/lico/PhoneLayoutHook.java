package com.vivo.cnm.lico;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import com.vivo.cnm.lico.PhoneLayoutHook;
import defpackage.ac;
import defpackage.aw;
import defpackage.bc;
import defpackage.bd;
import defpackage.dp;
import defpackage.fs0;
import defpackage.fx;
import defpackage.gf;
import defpackage.gm;
import defpackage.gx;
import defpackage.j2;
import defpackage.kw;
import defpackage.ln0;
import defpackage.lr0;
import defpackage.lw;
import defpackage.m20;
import defpackage.mb0;
import defpackage.mr;
import defpackage.n;
import defpackage.qf0;
import defpackage.rf0;
import defpackage.t30;
import defpackage.te0;
import defpackage.tq;
import defpackage.u3;
import defpackage.ub0;
import defpackage.ur;
import defpackage.vb0;
import defpackage.xb0;
import defpackage.y9;
import defpackage.z6;
import defpackage.zv;
import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class PhoneLayoutHook {
    private static final String COORD = "com.android.wm.shell.vivomultitask.VivoMultiTaskCoordinator";
    private static final String EXIT_MENU_TYPE = "wb_phone_exit_workbench";
    private static final String EXIT_VIEW = "com.android.wm.shell.vivomultitask.vivomultitaskui.VivoMultiTaskExitView";
    private static final String LOC = "com.android.wm.shell.vivomultitask.vivomultitaskui.VivoMultiTaskLocationManager";
    private static final String MENU = "com.android.wm.shell.common.split.vivo.ListPopMenuView";
    private static final String MENU_TYPE = "wb_phone_switch_layout";
    private static final String ROOT = "com.android.wm.shell.vivomultitask.";
    private static final String STATE = "com.android.wm.shell.vivomultitask.VivoMultiTaskState";
    private static final String TAG = "Layout";
    private static final String UI = "com.android.wm.shell.vivomultitask.vivomultitaskui.VivoMultiTaskUiModel";
    private static final String UI_MANAGER = "com.android.wm.shell.vivomultitask.VivoMultiTaskUiManager";
    private static final String UTIL = "com.android.wm.shell.vivomultitask.vivomultitaskui.VivoMultiTaskUiUtil";
    private static volatile boolean installed;
    public static final PhoneLayoutHook INSTANCE = new PhoneLayoutHook();
    private static final AtomicInteger hits = new AtomicInteger();
    private static final ConcurrentHashMap.KeySetView<String, Boolean> seen = ConcurrentHashMap.newKeySet();
    private static final ThreadLocal<Frame> scope = new ThreadLocal<>();
    private static final Map<Object, Object> menuItems = Collections.synchronizedMap(new WeakHashMap());
    private static final Map<Object, Object> exitMenuItems = Collections.synchronizedMap(new WeakHashMap());
    private static final Map<Object, Boolean> manualLayouts = Collections.synchronizedMap(new WeakHashMap());
    public static final int $stable = 8;

    /* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
    public static final class Frame {
        private final Context ctx;
        private final int h;
        private final int rotation;
        private final int w;

        public Frame(Context context, int i, int i2, int i3) {
            context.getClass();
            this.ctx = context;
            this.w = i;
            this.h = i2;
            this.rotation = i3;
        }

        public static /* synthetic */ Frame copy$default(Frame frame, Context context, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                context = frame.ctx;
            }
            if ((i4 & 2) != 0) {
                i = frame.w;
            }
            if ((i4 & 4) != 0) {
                i2 = frame.h;
            }
            if ((i4 & 8) != 0) {
                i3 = frame.rotation;
            }
            return frame.copy(context, i, i2, i3);
        }

        public final Context component1() {
            return this.ctx;
        }

        public final int component2() {
            return this.w;
        }

        public final int component3() {
            return this.h;
        }

        public final int component4() {
            return this.rotation;
        }

        public final Frame copy(Context context, int i, int i2, int i3) {
            context.getClass();
            return new Frame(context, i, i2, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Frame)) {
                return false;
            }
            Frame frame = (Frame) obj;
            return lw.i(this.ctx, frame.ctx) && this.w == frame.w && this.h == frame.h && this.rotation == frame.rotation;
        }

        public final Context getCtx() {
            return this.ctx;
        }

        public final int getH() {
            return this.h;
        }

        public final boolean getPortrait() {
            int i = this.rotation;
            return i == 0 || i == 2;
        }

        public final int getRotation() {
            return this.rotation;
        }

        public final int getW() {
            return this.w;
        }

        public int hashCode() {
            return Integer.hashCode(this.rotation) + j2.b(this.h, j2.b(this.w, this.ctx.hashCode() * 31, 31), 31);
        }

        public String toString() {
            return "Frame(ctx=" + this.ctx + ", w=" + this.w + ", h=" + this.h + ", rotation=" + this.rotation + ")";
        }
    }

    private PhoneLayoutHook() {
    }

    private final Field field(Class<?> cls, String str) {
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException(j2.j(cls.getName(), ".", str));
    }

    private final void hideExitButton(Class<?> cls, Object obj) {
        try {
            if (obj == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object obj2 = field(cls, "mBtnExit").get(obj);
            View view = obj2 instanceof View ? (View) obj2 : null;
            if (view != null) {
                view.setVisibility(8);
                view.setAlpha(0.0f);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 install$lambda$20(XposedModule xposedModule, Class cls) {
        xposedModule.getClass();
        cls.getClass();
        if (installed) {
            return fs0.a;
        }
        PhoneLayoutHook phoneLayoutHook = INSTANCE;
        synchronized (phoneLayoutHook) {
            if (!installed) {
                try {
                    final ClassLoader classLoader = cls.getClassLoader();
                    if (classLoader == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Class<?> cls2 = Class.forName(STATE, false, classLoader);
                    Class<?> cls3 = Class.forName(UTIL, false, classLoader);
                    Field field = phoneLayoutHook.field(cls, "mContext");
                    Method method = cls3.getMethod("getVivoMultiTaskBound", null);
                    final Method method2 = cls2.getMethod("getTopActivityBounds", null);
                    final Method method3 = cls2.getMethod("getTaskAspectRatio", null);
                    Method method4 = cls3.getMethod("isPCRemoteControlApp", cls2);
                    Method method5 = cls.getMethod("findClosestRatio", Float.TYPE);
                    te0 te0Var = new te0();
                    Class cls4 = Boolean.TYPE;
                    Class cls5 = Integer.TYPE;
                    Class<List> cls6 = List.class;
                    Iterator it = kw.C(Boolean.FALSE, Boolean.TRUE).iterator();
                    while (it.hasNext()) {
                        final boolean booleanValue = ((Boolean) it.next()).booleanValue();
                        String str = booleanValue ? "TopBottom" : "LeftRight";
                        String str2 = "getMainTaskPointInfo" + str;
                        cls4.getClass();
                        Class<List> cls7 = cls6;
                        String str3 = str;
                        final Field field2 = field;
                        final Method method6 = method;
                        final ClassLoader classLoader2 = classLoader;
                        final Method method7 = method2;
                        tq tqVar = new tq() { // from class: nb0
                            @Override // defpackage.tq
                            public final Object invoke(Object obj, Object obj2) {
                                Object install$lambda$20$lambda$19$lambda$10;
                                install$lambda$20$lambda$19$lambda$10 = PhoneLayoutHook.install$lambda$20$lambda$19$lambda$10(method7, booleanValue, classLoader2, field2, method6, obj, (List) obj2);
                                return install$lambda$20$lambda$19$lambda$10;
                            }
                        };
                        Class cls8 = cls5;
                        Class cls9 = cls4;
                        install$lambda$20$lambda$19$replace(cls, xposedModule, te0Var, str2, new Class[]{cls2, cls4}, tqVar);
                        String str4 = "getPointInfoList" + str3;
                        Class[] clsArr = {cls7, cls9};
                        Class<?> cls10 = cls2;
                        Method method8 = method3;
                        y9 y9Var = new y9(booleanValue, classLoader2, field2, method6, method7, method8, method4, method5);
                        classLoader = classLoader2;
                        Method method9 = method8;
                        Method method10 = method4;
                        Method method11 = method5;
                        install$lambda$20$lambda$19$replace(cls, xposedModule, te0Var, str4, clsArr, y9Var);
                        Iterator it2 = kw.C(Boolean.FALSE, Boolean.TRUE).iterator();
                        while (it2.hasNext()) {
                            final boolean booleanValue2 = ((Boolean) it2.next()).booleanValue();
                            String str5 = "getVivoMultiTask" + (booleanValue2 ? "Width" : "Height") + str3;
                            Class[] clsArr2 = {cls10, cls9};
                            final Method method12 = method9;
                            final Method method13 = method10;
                            final Method method14 = method11;
                            tq tqVar2 = new tq() { // from class: ob0
                                @Override // defpackage.tq
                                public final Object invoke(Object obj, Object obj2) {
                                    Object install$lambda$20$lambda$19$lambda$12;
                                    install$lambda$20$lambda$19$lambda$12 = PhoneLayoutHook.install$lambda$20$lambda$19$lambda$12(booleanValue, booleanValue2, method7, field2, method6, method12, method13, method14, obj, (List) obj2);
                                    return install$lambda$20$lambda$19$lambda$12;
                                }
                            };
                            method9 = method12;
                            method10 = method13;
                            method11 = method14;
                            install$lambda$20$lambda$19$replace(cls, xposedModule, te0Var, str5, clsArr2, tqVar2);
                        }
                        cls8.getClass();
                        final Method method15 = method10;
                        final Method method16 = method11;
                        method3 = method9;
                        method2 = method7;
                        method4 = method15;
                        method5 = method16;
                        install$lambda$20$lambda$19$replace(cls, xposedModule, te0Var, "getTopOffset" + str3, new Class[]{cls7, cls8, cls9}, new tq() { // from class: pb0
                            @Override // defpackage.tq
                            public final Object invoke(Object obj, Object obj2) {
                                Object install$lambda$20$lambda$19$lambda$13;
                                install$lambda$20$lambda$19$lambda$13 = PhoneLayoutHook.install$lambda$20$lambda$19$lambda$13(booleanValue, field2, method6, method7, method3, method15, method16, obj, (List) obj2);
                                return install$lambda$20$lambda$19$lambda$13;
                            }
                        });
                        cls4 = cls9;
                        cls6 = cls7;
                        field = field2;
                        method = method6;
                        cls5 = cls8;
                        cls2 = cls10;
                    }
                    Class cls11 = cls5;
                    final Field field3 = field;
                    Class<?> cls12 = cls2;
                    Class cls13 = cls4;
                    final Method method17 = method;
                    cls13.getClass();
                    install$lambda$20$lambda$19$replace(cls, xposedModule, te0Var, "getMainTaskPointInfo", new Class[]{cls12, cls13, cls13}, new tq() { // from class: qb0
                        @Override // defpackage.tq
                        public final Object invoke(Object obj, Object obj2) {
                            Object install$lambda$20$lambda$19$lambda$14;
                            install$lambda$20$lambda$19$lambda$14 = PhoneLayoutHook.install$lambda$20$lambda$19$lambda$14(method2, classLoader, field3, method17, obj, (List) obj2);
                            return install$lambda$20$lambda$19$lambda$14;
                        }
                    });
                    final Method method18 = method5;
                    final int i = 0;
                    final Method method19 = method4;
                    final Method method20 = method3;
                    install$lambda$20$lambda$19$replace(cls, xposedModule, te0Var, "getPointInfoList", new Class[]{cls6, cls13, cls13}, new tq() { // from class: rb0
                        @Override // defpackage.tq
                        public final Object invoke(Object obj, Object obj2) {
                            Object install$lambda$20$lambda$19$lambda$15;
                            Object install$lambda$20$lambda$19$lambda$16;
                            switch (i) {
                                case 0:
                                    install$lambda$20$lambda$19$lambda$15 = PhoneLayoutHook.install$lambda$20$lambda$19$lambda$15(classLoader, field3, method17, method2, method20, method19, method18, obj, (List) obj2);
                                    return install$lambda$20$lambda$19$lambda$15;
                                default:
                                    install$lambda$20$lambda$19$lambda$16 = PhoneLayoutHook.install$lambda$20$lambda$19$lambda$16(classLoader, field3, method17, method2, method20, method19, method18, obj, (List) obj2);
                                    return install$lambda$20$lambda$19$lambda$16;
                            }
                        }
                    });
                    cls11.getClass();
                    final int i2 = 1;
                    install$lambda$20$lambda$19$replace(cls, xposedModule, te0Var, "getPointInfoLeftRight", new Class[]{ArrayList.class, cls11, cls13}, new tq() { // from class: rb0
                        @Override // defpackage.tq
                        public final Object invoke(Object obj, Object obj2) {
                            Object install$lambda$20$lambda$19$lambda$15;
                            Object install$lambda$20$lambda$19$lambda$16;
                            switch (i2) {
                                case 0:
                                    install$lambda$20$lambda$19$lambda$15 = PhoneLayoutHook.install$lambda$20$lambda$19$lambda$15(classLoader, field3, method17, method2, method20, method19, method18, obj, (List) obj2);
                                    return install$lambda$20$lambda$19$lambda$15;
                                default:
                                    install$lambda$20$lambda$19$lambda$16 = PhoneLayoutHook.install$lambda$20$lambda$19$lambda$16(classLoader, field3, method17, method2, method20, method19, method18, obj, (List) obj2);
                                    return install$lambda$20$lambda$19$lambda$16;
                            }
                        }
                    });
                    Iterator it3 = kw.C("getVerticalNormalItemWidth", "getVerticalNormalItemHeight", "getTopBottomItemNormalWidth", "getTopBottomItemNormalHeight", "getHorizontalNormalItemWidth", "getHorizontalNormalItemHeight", "getHorizontalTopMargin", "getHorizontalRecyclerviewSurfaceHeight", "getHorizontalRecyclerviewHeight", "getVerticalLeftOffset", "getVerticalRecyclerviewWidth", "getVerticalPerspectiveHeight", "getHorizontalPerspectiveWidth").iterator();
                    while (true) {
                        int i3 = 1;
                        if (!it3.hasNext()) {
                            break;
                        }
                        String str6 = (String) it3.next();
                        install$lambda$20$lambda$19$replace(cls, xposedModule, te0Var, str6, new Class[]{cls13}, new gf(str6, field3, method17, i3));
                    }
                    Iterator it4 = kw.C(Boolean.FALSE, Boolean.TRUE).iterator();
                    while (it4.hasNext()) {
                        final boolean booleanValue3 = ((Boolean) it4.next()).booleanValue();
                        install$lambda$20$lambda$19$replace(cls, xposedModule, te0Var, "getPerspectiveRatio" + (booleanValue3 ? "TopBottom" : "LeftRight"), new Class[]{cls11}, new tq() { // from class: sb0
                            @Override // defpackage.tq
                            public final Object invoke(Object obj, Object obj2) {
                                Object install$lambda$20$lambda$19$lambda$18;
                                install$lambda$20$lambda$19$lambda$18 = PhoneLayoutHook.install$lambda$20$lambda$19$lambda$18(booleanValue3, field3, method17, obj, (List) obj2);
                                return install$lambda$20$lambda$19$lambda$18;
                            }
                        });
                    }
                    PhoneLayoutHook phoneLayoutHook2 = INSTANCE;
                    method17.getClass();
                    phoneLayoutHook2.installUiScopes(xposedModule, classLoader, method17);
                    phoneLayoutHook2.installTopBottomStatePositionReapply(xposedModule, classLoader, method17);
                    phoneLayoutHook2.installLayoutStateLock(xposedModule, classLoader);
                    phoneLayoutHook2.installStripSynchronization(xposedModule, classLoader);
                    phoneLayoutHook2.installExitButtonRelocation(xposedModule, classLoader);
                    WorkbenchAppPicker.INSTANCE.install(xposedModule, classLoader);
                    phoneLayoutHook2.installLayoutMenu(xposedModule, classLoader);
                    installed = true;
                    MLog.INSTANCE.i(TAG, "手机完整布局 hook 安装完成 v1.0.28/code29 count=" + te0Var.e + " profile=validated-VOS61 setter=off");
                } catch (Throwable th) {
                    MLog.INSTANCE.e(TAG, "完整布局 hook 安装失败", th);
                }
            }
        }
        return fs0.a;
    }

    private static final Frame install$lambda$20$lambda$19$frame(Field field, Method method, Object obj) {
        Frame frame = scope.get();
        if (frame != null) {
            return frame;
        }
        Object obj2 = field.get(obj);
        obj2.getClass();
        Context context = (Context) obj2;
        Object invoke = method.invoke(null, null);
        invoke.getClass();
        Rect rect = (Rect) invoke;
        if (rect.width() <= 0 || rect.height() <= 0) {
            z6.l("Failed requirement.");
            return null;
        }
        int width = rect.width();
        int height = rect.height();
        PhoneLayoutHook phoneLayoutHook = INSTANCE;
        Configuration configuration = context.getResources().getConfiguration();
        configuration.getClass();
        return new Frame(context, width, height, phoneLayoutHook.rotation(configuration));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$20$lambda$19$lambda$10(Method method, boolean z, ClassLoader classLoader, Field field, Method method2, Object obj, List list) {
        obj.getClass();
        list.getClass();
        Frame install$lambda$20$lambda$19$frame = install$lambda$20$lambda$19$frame(field, method2, obj);
        Object obj2 = list.get(1);
        obj2.getClass();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        Object invoke = method.invoke(list.get(0), null);
        invoke.getClass();
        Rect rect = (Rect) invoke;
        Rect mainTaskRect = PhoneLayout.INSTANCE.mainTaskRect(install$lambda$20$lambda$19$frame.getCtx(), booleanValue, z, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH(), rect);
        if (seen.add("main:" + booleanValue + ":" + z + ":" + (rect.height() > rect.width()))) {
            MLog.INSTANCE.i(TAG, "v1.0.28 主卡 portrait=" + booleanValue + " topBottom=" + z + " app=" + rect + " -> " + mainTaskRect);
        }
        return PhoneLayout.toPointInfo(classLoader, mainTaskRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$20$lambda$19$lambda$11(boolean z, ClassLoader classLoader, Field field, Method method, Method method2, Method method3, Method method4, Method method5, Object obj, List list) {
        obj.getClass();
        list.getClass();
        Object obj2 = list.get(0);
        obj2.getClass();
        List list2 = (List) obj2;
        Object obj3 = list.get(1);
        obj3.getClass();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ArrayList<Object> install$lambda$20$lambda$19$points = install$lambda$20$lambda$19$points(classLoader, field, method, method2, method3, method4, method5, obj, list2, booleanValue, z);
        if (seen.add("list:" + booleanValue + ":" + z + ":" + list2.size())) {
            MLog.INSTANCE.i(TAG, "v1.0.28 窗条 portrait=" + booleanValue + " topBottom=" + z + " states=" + list2.size() + " result=" + install$lambda$20$lambda$19$points);
        }
        return install$lambda$20$lambda$19$points;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$20$lambda$19$lambda$12(boolean z, boolean z2, Method method, Field field, Method method2, Method method3, Method method4, Method method5, Object obj, List list) {
        obj.getClass();
        list.getClass();
        Object obj2 = list.get(0);
        Object obj3 = list.get(1);
        obj3.getClass();
        Point install$lambda$20$lambda$19$size = install$lambda$20$lambda$19$size(method, field, method2, method3, method4, method5, obj, obj2, ((Boolean) obj3).booleanValue(), z);
        return Integer.valueOf(z2 ? install$lambda$20$lambda$19$size.x : install$lambda$20$lambda$19$size.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$20$lambda$19$lambda$13(boolean z, Field field, Method method, Method method2, Method method3, Method method4, Method method5, Object obj, List list) {
        obj.getClass();
        list.getClass();
        Frame install$lambda$20$lambda$19$frame = install$lambda$20$lambda$19$frame(field, method, obj);
        Object obj2 = list.get(0);
        obj2.getClass();
        List list2 = (List) obj2;
        Object obj3 = list.get(2);
        obj3.getClass();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        PhoneLayout phoneLayout = PhoneLayout.INSTANCE;
        Context ctx = install$lambda$20$lambda$19$frame.getCtx();
        List<Point> install$lambda$20$lambda$19$sizes = install$lambda$20$lambda$19$sizes(method2, field, method, method3, method4, method5, obj, list2, booleanValue, z);
        int w = install$lambda$20$lambda$19$frame.getW();
        int h = install$lambda$20$lambda$19$frame.getH();
        Object obj4 = list.get(1);
        obj4.getClass();
        return Integer.valueOf(phoneLayout.childOffset(ctx, install$lambda$20$lambda$19$sizes, booleanValue, z, w, h, ((Integer) obj4).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$20$lambda$19$lambda$14(Method method, ClassLoader classLoader, Field field, Method method2, Object obj, List list) {
        obj.getClass();
        list.getClass();
        Frame install$lambda$20$lambda$19$frame = install$lambda$20$lambda$19$frame(field, method2, obj);
        Object invoke = method.invoke(list.get(0), null);
        invoke.getClass();
        Rect rect = (Rect) invoke;
        Object obj2 = list.get(1);
        obj2.getClass();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        Object obj3 = list.get(2);
        obj3.getClass();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        Rect mainTaskRect = PhoneLayout.INSTANCE.mainTaskRect(install$lambda$20$lambda$19$frame.getCtx(), booleanValue, booleanValue2, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH(), rect);
        if (seen.add("main-generic:" + booleanValue + ":" + booleanValue2 + ":" + rect.width() + "x" + rect.height())) {
            MLog.INSTANCE.i(TAG, "v1.0.28 主卡 generic portrait=" + booleanValue + " topBottom=" + booleanValue2 + " display=" + install$lambda$20$lambda$19$frame.getW() + "x" + install$lambda$20$lambda$19$frame.getH() + " app=" + rect + " -> " + mainTaskRect);
        }
        return PhoneLayout.toPointInfo(classLoader, mainTaskRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$20$lambda$19$lambda$15(ClassLoader classLoader, Field field, Method method, Method method2, Method method3, Method method4, Method method5, Object obj, List list) {
        obj.getClass();
        list.getClass();
        Object obj2 = list.get(0);
        obj2.getClass();
        List list2 = (List) obj2;
        Object obj3 = list.get(1);
        obj3.getClass();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        Object obj4 = list.get(2);
        obj4.getClass();
        return install$lambda$20$lambda$19$points(classLoader, field, method, method2, method3, method4, method5, obj, list2, booleanValue, ((Boolean) obj4).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$20$lambda$19$lambda$16(ClassLoader classLoader, Field field, Method method, Method method2, Method method3, Method method4, Method method5, Object obj, List list) {
        obj.getClass();
        list.getClass();
        Object obj2 = list.get(0);
        obj2.getClass();
        List list2 = (List) obj2;
        Object obj3 = list.get(2);
        obj3.getClass();
        ArrayList<Object> install$lambda$20$lambda$19$points = install$lambda$20$lambda$19$points(classLoader, field, method, method2, method3, method4, method5, obj, list2, ((Boolean) obj3).booleanValue(), false);
        Object obj4 = list.get(1);
        obj4.getClass();
        return ac.b0(((Integer) obj4).intValue(), install$lambda$20$lambda$19$points);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$20$lambda$19$lambda$17(String str, Field field, Method method, Object obj, List list) {
        obj.getClass();
        list.getClass();
        Frame install$lambda$20$lambda$19$frame = install$lambda$20$lambda$19$frame(field, method, obj);
        Object obj2 = list.get(0);
        obj2.getClass();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        switch (str.hashCode()) {
            case -1627966619:
                if (!str.equals("getHorizontalRecyclerviewHeight")) {
                    return null;
                }
                return Integer.valueOf(PhoneLayout.INSTANCE.horizontalRecyclerviewSurfaceHeight(install$lambda$20$lambda$19$frame.getCtx(), booleanValue, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH()));
            case -1329360019:
                if (str.equals("getVerticalNormalItemHeight")) {
                    return Integer.valueOf(PhoneLayout.INSTANCE.verticalNormalItemHeight(install$lambda$20$lambda$19$frame.getCtx(), booleanValue, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH()));
                }
                return null;
            case -1082496714:
                if (str.equals("getVerticalRecyclerviewWidth")) {
                    return Integer.valueOf(PhoneLayout.INSTANCE.verticalRecyclerviewWidth(install$lambda$20$lambda$19$frame.getCtx(), booleanValue, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH()));
                }
                return null;
            case -636802606:
                if (!str.equals("getHorizontalNormalItemWidth")) {
                    return null;
                }
                return Integer.valueOf(PhoneLayout.INSTANCE.topBottomItemNormalWidth(install$lambda$20$lambda$19$frame.getCtx(), booleanValue, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH()));
            case -28915008:
                if (str.equals("getVerticalNormalItemWidth")) {
                    return Integer.valueOf(PhoneLayout.INSTANCE.verticalNormalItemWidth(install$lambda$20$lambda$19$frame.getCtx(), booleanValue, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH()));
                }
                return null;
            case 35659044:
                if (str.equals("getHorizontalPerspectiveWidth")) {
                    return Integer.valueOf(PhoneLayout.INSTANCE.displayWidth(booleanValue, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH()));
                }
                return null;
            case 70504683:
                if (!str.equals("getTopBottomItemNormalHeight")) {
                    return null;
                }
                return Integer.valueOf(PhoneLayout.INSTANCE.topBottomItemNormalHeight(install$lambda$20$lambda$19$frame.getCtx(), booleanValue, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH()));
            case 154789250:
                if (!str.equals("getTopBottomItemNormalWidth")) {
                    return null;
                }
                return Integer.valueOf(PhoneLayout.INSTANCE.topBottomItemNormalWidth(install$lambda$20$lambda$19$frame.getCtx(), booleanValue, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH()));
            case 604895337:
                if (str.equals("getHorizontalTopMargin")) {
                    return Integer.valueOf(PhoneLayout.INSTANCE.horizontalTopMargin(install$lambda$20$lambda$19$frame.getCtx(), booleanValue));
                }
                return null;
            case 736865015:
                if (str.equals("getVerticalPerspectiveHeight")) {
                    return Integer.valueOf(PhoneLayout.INSTANCE.displayHeight(booleanValue, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH()));
                }
                return null;
            case 856453174:
                if (!str.equals("getHorizontalRecyclerviewSurfaceHeight")) {
                    return null;
                }
                return Integer.valueOf(PhoneLayout.INSTANCE.horizontalRecyclerviewSurfaceHeight(install$lambda$20$lambda$19$frame.getCtx(), booleanValue, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH()));
            case 887282054:
                if (str.equals("getVerticalLeftOffset")) {
                    return Integer.valueOf(PhoneLayout.INSTANCE.verticalLeftOffset(install$lambda$20$lambda$19$frame.getCtx(), booleanValue));
                }
                return null;
            case 1300960923:
                if (!str.equals("getHorizontalNormalItemHeight")) {
                    return null;
                }
                return Integer.valueOf(PhoneLayout.INSTANCE.topBottomItemNormalHeight(install$lambda$20$lambda$19$frame.getCtx(), booleanValue, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH()));
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$20$lambda$19$lambda$18(boolean z, Field field, Method method, Object obj, List list) {
        obj.getClass();
        list.getClass();
        Frame install$lambda$20$lambda$19$frame = install$lambda$20$lambda$19$frame(field, method, obj);
        PhoneLayout phoneLayout = PhoneLayout.INSTANCE;
        Point normalChildSize = phoneLayout.normalChildSize(install$lambda$20$lambda$19$frame.getCtx(), install$lambda$20$lambda$19$frame.getPortrait(), z, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH());
        return Float.valueOf(phoneLayout.perspectiveRatio(install$lambda$20$lambda$19$frame.getCtx(), install$lambda$20$lambda$19$frame.getPortrait(), z, z ? normalChildSize.y : normalChildSize.x));
    }

    private static final ArrayList<Object> install$lambda$20$lambda$19$points(ClassLoader classLoader, Field field, Method method, Method method2, Method method3, Method method4, Method method5, Object obj, List<?> list, boolean z, boolean z2) {
        Frame install$lambda$20$lambda$19$frame = install$lambda$20$lambda$19$frame(field, method, obj);
        return PhoneLayout.INSTANCE.childPointInfos(classLoader, install$lambda$20$lambda$19$frame.getCtx(), install$lambda$20$lambda$19$sizes(method2, field, method, method3, method4, method5, obj, list, z, z2), z, z2, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH());
    }

    private static final void install$lambda$20$lambda$19$replace(Class<?> cls, XposedModule xposedModule, te0 te0Var, String str, Class<?>[] clsArr, tq tqVar) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredMethod.setAccessible(true);
            AtomicInteger atomicInteger = new AtomicInteger();
            xposedModule.hook(declaredMethod).setId("wb_phone_" + str).intercept(new ub0(tqVar, declaredMethod, atomicInteger, str));
            te0Var.e = te0Var.e + 1;
        } catch (Throwable th) {
            MLog.INSTANCE.e(TAG, j2.j("挂 ", str, " 失败"), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$20$lambda$19$replace$lambda$9(tq tqVar, Method method, AtomicInteger atomicInteger, String str, XposedInterface.Chain chain) {
        chain.getClass();
        Object obj = null;
        try {
            Object thisObject = chain.getThisObject();
            if (thisObject != null) {
                aw C = t30.C(0, method.getParameterCount());
                ArrayList arrayList = new ArrayList(bc.V(C));
                Iterator it = C.iterator();
                while (((zv) it).g) {
                    arrayList.add(chain.getArg(((zv) it).nextInt()));
                }
                obj = tqVar.invoke(thisObject, arrayList);
            }
        } catch (Throwable th) {
            if (atomicInteger.incrementAndGet() <= 3) {
                MLog.INSTANCE.e(TAG, str + " 回退原生", th);
            }
        }
        if (obj == null) {
            return chain.proceed();
        }
        hits.incrementAndGet();
        return obj;
    }

    private static final Point install$lambda$20$lambda$19$size(Method method, Field field, Method method2, Method method3, Method method4, Method method5, Object obj, Object obj2, boolean z, boolean z2) {
        Object qf0Var;
        float f;
        Object qf0Var2;
        Object qf0Var3;
        Frame install$lambda$20$lambda$19$frame = install$lambda$20$lambda$19$frame(field, method2, obj);
        if (obj2 == null) {
            return PhoneLayout.INSTANCE.normalChildSize(install$lambda$20$lambda$19$frame.getCtx(), z, z2, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH());
        }
        Object invoke = method.invoke(obj2, null);
        invoke.getClass();
        Rect rect = (Rect) invoke;
        if (rect.width() <= 0 || rect.height() <= 0) {
            return PhoneLayout.INSTANCE.normalChildSize(install$lambda$20$lambda$19$frame.getCtx(), z, z2, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH());
        }
        boolean z3 = rect.height() > rect.width();
        try {
            Object invoke2 = method3.invoke(obj2, null);
            invoke2.getClass();
            qf0Var = Float.valueOf(((Number) invoke2).floatValue());
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Object valueOf = Float.valueOf(Float.NaN);
        if (qf0Var instanceof qf0) {
            qf0Var = valueOf;
        }
        float safeTaskRatio = PhoneLayout.INSTANCE.safeTaskRatio(rect, z3, ((Number) qf0Var).floatValue());
        if (!z2 && !z3) {
            try {
                qf0Var2 = Boolean.valueOf(lw.i(method4.invoke(null, obj2), Boolean.TRUE));
            } catch (Throwable th2) {
                qf0Var2 = new qf0(th2);
            }
            Object obj3 = Boolean.FALSE;
            if (qf0Var2 instanceof qf0) {
                qf0Var2 = obj3;
            }
            if (((Boolean) qf0Var2).booleanValue()) {
                try {
                    Object invoke3 = method5.invoke(obj, Float.valueOf(safeTaskRatio));
                    invoke3.getClass();
                    qf0Var3 = Float.valueOf(((Number) invoke3).floatValue());
                } catch (Throwable th3) {
                    qf0Var3 = new qf0(th3);
                }
                Object valueOf2 = Float.valueOf(safeTaskRatio);
                if (qf0Var3 instanceof qf0) {
                    qf0Var3 = valueOf2;
                }
                float floatValue = ((Number) qf0Var3).floatValue();
                if (Math.abs(floatValue) <= Float.MAX_VALUE && floatValue > 0.0f) {
                    f = floatValue;
                    return PhoneLayout.INSTANCE.childSize(install$lambda$20$lambda$19$frame.getCtx(), z, z2, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH(), z3, safeTaskRatio, f);
                }
            }
        }
        f = safeTaskRatio;
        return PhoneLayout.INSTANCE.childSize(install$lambda$20$lambda$19$frame.getCtx(), z, z2, install$lambda$20$lambda$19$frame.getW(), install$lambda$20$lambda$19$frame.getH(), z3, safeTaskRatio, f);
    }

    private static final List<Point> install$lambda$20$lambda$19$sizes(Method method, Field field, Method method2, Method method3, Method method4, Method method5, Object obj, List<?> list, boolean z, boolean z2) {
        if (list.size() <= 4) {
            if (!list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList(bc.V(list));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(install$lambda$20$lambda$19$size(method, field, method2, method3, method4, method5, obj, it2.next(), z, z2));
            }
            return arrayList;
        }
        z6.l("Failed requirement.");
        return null;
    }

    private final void installExitButtonRelocation(XposedModule xposedModule, ClassLoader classLoader) {
        ClassWatch classWatch = ClassWatch.INSTANCE;
        classWatch.watch(xposedModule, classLoader, EXIT_VIEW, new dp(classLoader, 2));
        classWatch.watch(xposedModule, classLoader, UI_MANAGER, new bd(21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 installExitButtonRelocation$lambda$64(ClassLoader classLoader, XposedModule xposedModule, Class cls) {
        Object qf0Var;
        fs0 fs0Var = fs0.a;
        xposedModule.getClass();
        cls.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod("onTouchUp", Class.forName(COORD, false, classLoader), Boolean.TYPE);
            declaredMethod.setAccessible(true);
            xposedModule.hook(declaredMethod).setId("wb_phone_exit_button_touch_hidden").intercept(new mr(4));
            MLog.INSTANCE.i(TAG, "v1.0.28 已屏蔽右上角独立退出按钮");
            qf0Var = fs0Var;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "屏蔽独立退出按钮失败", a);
        }
        return fs0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object installExitButtonRelocation$lambda$64$lambda$62$lambda$61(XposedInterface.Chain chain) {
        chain.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 installExitButtonRelocation$lambda$77(XposedModule xposedModule, Class cls) {
        Method[] declaredMethods;
        int i;
        int i2;
        xposedModule.getClass();
        cls.getClass();
        try {
            declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            i = 0;
        } catch (Throwable th) {
            MLog.INSTANCE.e(TAG, "退出按钮 UiManager Hook 安装失败", th);
        }
        for (Method method : declaredMethods) {
            if (lw.i(method.getName(), "init") && method.getParameterCount() == 3) {
                int i3 = 1;
                method.setAccessible(true);
                xposedModule.hook(method).setId("wb_phone_exit_button_visibility").intercept(new xb0(cls, i));
                for (String str : kw.C("recovery", "setConfiguration")) {
                    Method[] declaredMethods2 = cls.getDeclaredMethods();
                    declaredMethods2.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Method method2 : declaredMethods2) {
                        if (lw.i(method2.getName(), str)) {
                            arrayList.add(method2);
                        }
                    }
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        Method method3 = (Method) obj;
                        method3.setAccessible(true);
                        xposedModule.hook(method3).setId("wb_phone_exit_button_refresh_" + str).intercept(new xb0(cls, i3));
                    }
                }
                for (String str2 : kw.C("hideExitBtnIfNeed", "showExitBtnInAnim")) {
                    Method[] declaredMethods3 = cls.getDeclaredMethods();
                    declaredMethods3.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    for (Method method4 : declaredMethods3) {
                        if (lw.i(method4.getName(), str2)) {
                            arrayList2.add(method4);
                        }
                    }
                    int size2 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        Method method5 = (Method) obj2;
                        method5.setAccessible(true);
                        xposedModule.hook(method5).setId("wb_phone_exit_button_anim_" + str2).intercept(new xb0(cls, 2));
                    }
                }
                Method[] declaredMethods4 = cls.getDeclaredMethods();
                declaredMethods4.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (Method method6 : declaredMethods4) {
                    if (lw.i(method6.getName(), "isExitBtnNeedShow") && method6.getParameterCount() == 0) {
                        arrayList3.add(method6);
                    }
                }
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    Method method7 = (Method) obj3;
                    method7.setAccessible(true);
                    xposedModule.hook(method7).setId("wb_phone_exit_button_need_show").intercept(new mr(6));
                }
                MLog.INSTANCE.i(TAG, "v1.0.28 UiManager 退出按钮生命周期 Hook 已安装");
                return fs0.a;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object installExitButtonRelocation$lambda$77$lambda$70(Class cls, XposedInterface.Chain chain) {
        Object qf0Var;
        Object thisObject;
        chain.getClass();
        Object proceed = chain.proceed();
        PhoneLayoutHook phoneLayoutHook = INSTANCE;
        try {
            thisObject = chain.getThisObject();
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (thisObject == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object obj = phoneLayoutHook.field(cls, "mBtnExit").get(thisObject);
        qf0Var = null;
        View view = obj instanceof View ? (View) obj : null;
        if (view != null) {
            view.setVisibility(8);
            view.setAlpha(0.0f);
            qf0Var = fs0.a;
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "隐藏退出按钮 View 实例失败", a);
        }
        return proceed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object installExitButtonRelocation$lambda$77$lambda$72(Class cls, XposedInterface.Chain chain) {
        chain.getClass();
        Object proceed = chain.proceed();
        INSTANCE.hideExitButton(cls, chain.getThisObject());
        return proceed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object installExitButtonRelocation$lambda$77$lambda$74(Class cls, XposedInterface.Chain chain) {
        chain.getClass();
        Object proceed = chain.proceed();
        INSTANCE.hideExitButton(cls, chain.getThisObject());
        return proceed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object installExitButtonRelocation$lambda$77$lambda$76(XposedInterface.Chain chain) {
        chain.getClass();
        return Boolean.FALSE;
    }

    private final void installLayoutMenu(XposedModule xposedModule, ClassLoader classLoader) {
        ClassWatch classWatch = ClassWatch.INSTANCE;
        classWatch.watch(xposedModule, classLoader, COORD, new bd(19));
        classWatch.watch(xposedModule, classLoader, MENU, new bd(22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 installLayoutMenu$lambda$112(XposedModule xposedModule, Class cls) {
        int i;
        Field field;
        Method declaredMethod;
        Class<?> cls2;
        Method[] declaredMethods;
        int i2;
        Class cls3 = Integer.TYPE;
        xposedModule.getClass();
        cls.getClass();
        try {
            i = 0;
            Class<?> cls4 = Class.forName("com.android.wm.shell.common.split.vivo.ListPopMenuView$PopMenuItem", false, cls.getClassLoader());
            field = INSTANCE.field(cls, "mListMultiTask");
            declaredMethod = cls4.getDeclaredMethod("getType", null);
            declaredMethod.setAccessible(true);
            xposedModule.hook(cls.getDeclaredMethod("setEnableForMultitask", Boolean.TYPE, cls3)).setId("wb_phone_layout_menu_build").intercept(new ub0(field, cls4, cls, declaredMethod));
            cls2 = Class.forName("com.android.wm.shell.common.split.vivo.ListPopMenuView$ListPopmenuAdapter", false, cls.getClassLoader());
            declaredMethods = cls2.getDeclaredMethods();
            declaredMethods.getClass();
        } catch (Throwable th) {
            MLog.INSTANCE.e(TAG, "布局菜单 hook 安装失败", th);
        }
        for (Method method : declaredMethods) {
            if (lw.i(method.getName(), "getView") && method.getParameterCount() == 3) {
                xposedModule.hook(method).setId("wb_phone_layout_menu_label").intercept(new vb0(cls2, declaredMethod, i));
                xposedModule.hook(cls.getDeclaredMethod("onItemClick", AdapterView.class, View.class, cls3, Long.TYPE)).setId("wb_phone_layout_menu_click").intercept(new mb0(cls, field, declaredMethod));
                MLog.INSTANCE.i(TAG, "v1.0.28 已挂工作台切换布局/退出菜单");
                return fs0.a;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object installLayoutMenu$lambda$112$lambda$103(Class cls, Method method, XposedInterface.Chain chain) {
        Object qf0Var;
        Object thisObject;
        chain.getClass();
        Object proceed = chain.proceed();
        PhoneLayoutHook phoneLayoutHook = INSTANCE;
        try {
            thisObject = chain.getThisObject();
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (thisObject == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object invoke = cls.getMethod("getItem", Integer.TYPE).invoke(thisObject, chain.getArg(0));
        if (invoke != null && (proceed instanceof View)) {
            Object invoke2 = method.invoke(invoke, null);
            if (lw.i(invoke2, MENU_TYPE)) {
                Object tag = ((View) proceed).getTag();
                if (tag == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Object obj = phoneLayoutHook.field(tag.getClass(), "textView").get(tag);
                obj.getClass();
                ((TextView) obj).setText("切换布局");
            } else if (lw.i(invoke2, EXIT_MENU_TYPE)) {
                Object tag2 = ((View) proceed).getTag();
                if (tag2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Object obj2 = phoneLayoutHook.field(tag2.getClass(), "textView").get(tag2);
                obj2.getClass();
                ((TextView) obj2).setText("退出工作台");
            }
        }
        qf0Var = fs0.a;
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "布局菜单文字失败", a);
        }
        return proceed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(3:86|87|(16:89|90|91|92|(2:94|(6:96|5|6|(1:8)|9|(5:17|18|19|20|(13:22|(3:54|(12:57|58|59|60|61|62|63|64|(1:66)|67|(2:70|71)(1:69)|55)|81)|24|25|26|27|28|(6:38|(9:40|41|(2:43|(1:45)(2:49|50))(2:51|(1:53))|46|47|48|32|33|(2:35|36)(1:37))|31|32|33|(0)(0))(0)|30|31|32|33|(0)(0))(2:82|83))(2:13|14)))|4|5|6|(0)|9|(1:11)|17|18|19|20|(0)(0)))|3|4|5|6|(0)|9|(0)|17|18|19|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0229, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1 A[Catch: all -> 0x0229, TRY_ENTER, TryCatch #4 {all -> 0x0229, blocks: (B:19:0x0087, B:22:0x00b1, B:27:0x011b, B:32:0x022b, B:48:0x0221, B:54:0x00cd, B:55:0x00d1, B:82:0x022e, B:83:0x0233), top: B:18:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0110 A[LOOP:0: B:55:0x00d1->B:69:0x0110, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022e A[Catch: all -> 0x0229, TryCatch #4 {all -> 0x0229, blocks: (B:19:0x0087, B:22:0x00b1, B:27:0x011b, B:32:0x022b, B:48:0x0221, B:54:0x00cd, B:55:0x00d1, B:82:0x022e, B:83:0x0233), top: B:18:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object installLayoutMenu$lambda$112$lambda$111(Class cls, Field field, Method method, XposedInterface.Chain chain) {
        XposedInterface.Chain chain2;
        Object b0;
        Object obj;
        Object obj2;
        boolean z;
        String str;
        Object qf0Var;
        Throwable a;
        Object invoke;
        boolean z2;
        Object qf0Var2;
        boolean z3;
        Object obj3;
        chain.getClass();
        Object thisObject = chain.getThisObject();
        PhoneLayoutHook phoneLayoutHook = INSTANCE;
        Class<?>[] clsArr = null;
        if (thisObject != null) {
            try {
            } catch (Throwable th) {
                th = th;
                chain2 = chain;
            }
            if (lw.i(phoneLayoutHook.field(cls, "mCurrentType").get(thisObject), "multitask")) {
                Object obj4 = field.get(thisObject);
                obj4.getClass();
                List list = (List) obj4;
                chain2 = chain;
                try {
                    Object arg = chain2.getArg(2);
                    arg.getClass();
                    b0 = ac.b0(((Integer) arg).intValue(), list);
                } catch (Throwable th2) {
                    th = th2;
                    obj2 = new qf0(th);
                    z = obj2 instanceof qf0;
                    Object obj5 = obj2;
                    if (z) {
                    }
                    str = (String) obj5;
                    if (lw.i(str, MENU_TYPE)) {
                    }
                    PhoneLayoutHook phoneLayoutHook2 = INSTANCE;
                    Object obj6 = phoneLayoutHook2.field(cls, "mProxy").get(thisObject);
                    Object obj7 = phoneLayoutHook2.field(obj6.getClass(), "mSplitScreenController").get(obj6);
                    invoke = obj7.getClass().getMethod("getVivoMultiTaskHandler", null).invoke(obj7, null);
                    if (invoke != null) {
                    }
                }
                if (b0 != null) {
                    Object invoke2 = method.invoke(b0, null);
                    if (invoke2 instanceof String) {
                        obj = (String) invoke2;
                        obj2 = obj;
                        z = obj2 instanceof qf0;
                        Object obj52 = obj2;
                        if (z) {
                            obj52 = null;
                        }
                        str = (String) obj52;
                        if ((lw.i(str, MENU_TYPE) && !lw.i(str, EXIT_MENU_TYPE)) || thisObject == null) {
                            return chain2.proceed();
                        }
                        PhoneLayoutHook phoneLayoutHook22 = INSTANCE;
                        Object obj62 = phoneLayoutHook22.field(cls, "mProxy").get(thisObject);
                        Object obj72 = phoneLayoutHook22.field(obj62.getClass(), "mSplitScreenController").get(obj62);
                        invoke = obj72.getClass().getMethod("getVivoMultiTaskHandler", null).invoke(obj72, null);
                        if (invoke != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        Class<?> cls2 = invoke.getClass();
                        List C = kw.C("isInPendingTransition", "isInSwitchLayoutAnimation", "isInPendingAddAnimation");
                        boolean z4 = true;
                        if (!C.isEmpty()) {
                            Iterator it = C.iterator();
                            while (it.hasNext()) {
                                try {
                                    try {
                                        Method declaredMethod = cls2.getDeclaredMethod((String) it.next(), clsArr);
                                        declaredMethod.setAccessible(z4);
                                        z2 = z4;
                                        try {
                                            qf0Var2 = Boolean.valueOf(lw.i(declaredMethod.invoke(invoke, clsArr), Boolean.TRUE));
                                        } catch (Throwable th3) {
                                            th = th3;
                                            qf0Var2 = new qf0(th);
                                            Boolean bool = Boolean.FALSE;
                                            z3 = qf0Var2 instanceof qf0;
                                            obj3 = qf0Var2;
                                            if (z3) {
                                            }
                                            if (!((Boolean) obj3).booleanValue()) {
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        z2 = z4;
                                    }
                                    Boolean bool2 = Boolean.FALSE;
                                    z3 = qf0Var2 instanceof qf0;
                                    obj3 = qf0Var2;
                                    if (z3) {
                                        obj3 = bool2;
                                    }
                                    if (!((Boolean) obj3).booleanValue()) {
                                        break;
                                    }
                                    z4 = z2;
                                    clsArr = null;
                                } catch (Throwable th5) {
                                    th = th5;
                                    clsArr = null;
                                    qf0Var = new qf0(th);
                                    a = rf0.a(qf0Var);
                                    if (a != null) {
                                    }
                                }
                            }
                        }
                        boolean z5 = z4;
                        if (lw.i(cls2.getMethod("isVivoMultiTaskActive", null).invoke(invoke, null), Boolean.TRUE)) {
                            long j = phoneLayoutHook22.field(cls, "mLastClickTime").getLong(thisObject);
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - j >= 500) {
                                phoneLayoutHook22.field(cls, "mLastClickTime").setLong(thisObject, elapsedRealtime);
                                boolean i = lw.i(str, EXIT_MENU_TYPE);
                                Class cls3 = Boolean.TYPE;
                                if (i) {
                                    Object obj8 = phoneLayoutHook22.field(obj72.getClass(), "mVivoMultiTaskController").get(obj72);
                                    if (obj8 == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    Class cls4 = Integer.TYPE;
                                    cls2.getMethod("setExitMultiTaskWay", cls4).invoke(invoke, Integer.valueOf(z5 ? 1 : 0));
                                    cls2.getMethod("hideShowGuideIfNeed", cls3).invoke(invoke, Boolean.FALSE);
                                    obj8.getClass().getMethod("exitFromVivoMultiTask", cls4).invoke(obj8, 3);
                                    MLog.INSTANCE.i(TAG, "v1.0.28 菜单退出工作台：复用 ROM 原生 button transition");
                                } else {
                                    boolean z6 = !phoneLayoutHook22.field(cls2, "isUseTopBottomUI").getBoolean(invoke);
                                    cls2.getMethod("switchLayoutDirectly", cls3).invoke(invoke, Boolean.valueOf(z6));
                                    if (phoneLayoutHook22.field(cls2, "isUseTopBottomUI").getBoolean(invoke) == z6) {
                                        Map<Object, Boolean> map = manualLayouts;
                                        map.getClass();
                                        map.put(invoke, Boolean.valueOf(z6));
                                        MLog.INSTANCE.i(TAG, "v1.0.28 手动切换 topBottom=" + z6 + "（本次工作台会话保持）");
                                    }
                                }
                                clsArr = null;
                                cls.getMethod("hide", null).invoke(thisObject, null);
                                qf0Var = fs0.a;
                                a = rf0.a(qf0Var);
                                if (a != null) {
                                    return clsArr;
                                }
                                MLog.INSTANCE.e(TAG, "工作台菜单操作失败 type=" + str, a);
                                return clsArr;
                            }
                            clsArr = null;
                            qf0Var = fs0.a;
                            a = rf0.a(qf0Var);
                            if (a != null) {
                            }
                        }
                        Object obj9 = phoneLayoutHook22.field(cls, "mContext").get(thisObject);
                        obj9.getClass();
                        Toast.makeText((Context) obj9, "请等待工作台动画完成", 0).show();
                        clsArr = null;
                        qf0Var = fs0.a;
                        a = rf0.a(qf0Var);
                        if (a != null) {
                        }
                    }
                }
                obj = null;
                obj2 = obj;
                z = obj2 instanceof qf0;
                Object obj522 = obj2;
                if (z) {
                }
                str = (String) obj522;
                if (lw.i(str, MENU_TYPE)) {
                }
                PhoneLayoutHook phoneLayoutHook222 = INSTANCE;
                Object obj622 = phoneLayoutHook222.field(cls, "mProxy").get(thisObject);
                Object obj722 = phoneLayoutHook222.field(obj622.getClass(), "mSplitScreenController").get(obj622);
                invoke = obj722.getClass().getMethod("getVivoMultiTaskHandler", null).invoke(obj722, null);
                if (invoke != null) {
                }
            }
        }
        chain2 = chain;
        obj = null;
        obj2 = obj;
        z = obj2 instanceof qf0;
        Object obj5222 = obj2;
        if (z) {
        }
        str = (String) obj5222;
        if (lw.i(str, MENU_TYPE)) {
        }
        PhoneLayoutHook phoneLayoutHook2222 = INSTANCE;
        Object obj6222 = phoneLayoutHook2222.field(cls, "mProxy").get(thisObject);
        Object obj7222 = phoneLayoutHook2222.field(obj6222.getClass(), "mSplitScreenController").get(obj6222);
        invoke = obj7222.getClass().getMethod("getVivoMultiTaskHandler", null).invoke(obj7222, null);
        if (invoke != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object installLayoutMenu$lambda$112$lambda$99(Field field, Class cls, Class cls2, Method method, XposedInterface.Chain chain) {
        Object qf0Var;
        Object thisObject;
        Class<?> cls3;
        Method method2;
        chain.getClass();
        Object proceed = chain.proceed();
        PhoneLayoutHook phoneLayoutHook = INSTANCE;
        try {
            thisObject = chain.getThisObject();
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (thisObject == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object obj = field.get(thisObject);
        obj.getClass();
        Class<?> cls4 = null;
        if ((obj instanceof fx) && !(obj instanceof gx)) {
            lr0.J(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            List list = (List) obj;
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            declaredConstructors.getClass();
            int length = declaredConstructors.length;
            int i = 0;
            while (i < length) {
                Constructor<?> constructor = declaredConstructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                parameterTypes.getClass();
                if (lw.i(parameterTypes.length == 0 ? cls4 : parameterTypes[parameterTypes.length - 1], String.class)) {
                    Class<?>[] parameterTypes2 = constructor.getParameterTypes();
                    parameterTypes2.getClass();
                    int i2 = 0;
                    for (Class<?> cls5 : parameterTypes2) {
                        if (lw.i(cls5, Integer.TYPE)) {
                            i2++;
                        }
                    }
                    if (i2 == 3) {
                        Class<?>[] parameterTypes3 = constructor.getParameterTypes();
                        parameterTypes3.getClass();
                        int i3 = 0;
                        for (Class<?> cls6 : parameterTypes3) {
                            if (lw.i(cls6, cls2)) {
                                i3++;
                            }
                        }
                        if (1 <= i3 && i3 < 3) {
                            constructor.setAccessible(true);
                            Method declaredMethod = cls.getDeclaredMethod("getSymbolID", null);
                            declaredMethod.setAccessible(true);
                            Method declaredMethod2 = cls.getDeclaredMethod("getImageID", null);
                            declaredMethod2.setAccessible(true);
                            Method declaredMethod3 = cls.getDeclaredMethod("getText", null);
                            declaredMethod3.setAccessible(true);
                            if (!list.isEmpty()) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    if (lw.i(method.invoke(it.next(), null), MENU_TYPE)) {
                                        method2 = declaredMethod3;
                                        break;
                                    }
                                }
                            }
                            Map<Object, Object> map = menuItems;
                            Object obj2 = map.get(thisObject);
                            if (obj2 == null) {
                                method2 = declaredMethod3;
                                Object installLayoutMenu$lambda$112$lambda$99$lambda$97$createItem = installLayoutMenu$lambda$112$lambda$99$lambda$97$createItem(phoneLayoutHook, cls2, thisObject, declaredMethod, declaredMethod2, method2, constructor, MENU_TYPE, "mRotateSplit");
                                declaredMethod = declaredMethod;
                                map.put(thisObject, installLayoutMenu$lambda$112$lambda$99$lambda$97$createItem);
                                obj2 = installLayoutMenu$lambda$112$lambda$99$lambda$97$createItem;
                            } else {
                                method2 = declaredMethod3;
                            }
                            list.add(0, obj2);
                            if (!list.isEmpty()) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    if (lw.i(method.invoke(it2.next(), null), EXIT_MENU_TYPE)) {
                                        break;
                                    }
                                }
                            }
                            Map<Object, Object> map2 = exitMenuItems;
                            Object obj3 = map2.get(thisObject);
                            if (obj3 == null) {
                                obj3 = installLayoutMenu$lambda$112$lambda$99$lambda$97$createItem(phoneLayoutHook, cls2, thisObject, declaredMethod, declaredMethod2, method2, constructor, EXIT_MENU_TYPE, "mMultiTaskCloseApp");
                                map2.put(thisObject, obj3);
                            }
                            list.add(obj3);
                            qf0Var = fs0.a;
                            Throwable a = rf0.a(qf0Var);
                            if (a != null) {
                                MLog.INSTANCE.e(TAG, "添加布局/退出菜单失败", a);
                            }
                            return proceed;
                        }
                    }
                    cls3 = null;
                } else {
                    cls3 = cls4;
                }
                i++;
                cls4 = cls3;
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (ClassCastException e) {
            lw.C(e, lr0.class.getName());
            throw e;
        }
    }

    private static final Object installLayoutMenu$lambda$112$lambda$99$lambda$97$createItem(PhoneLayoutHook phoneLayoutHook, Class<?> cls, Object obj, Method method, Method method2, Method method3, Constructor<?> constructor, String str, String str2) {
        int i;
        Object obj2;
        Object obj3 = phoneLayoutHook.field(cls, str2).get(obj);
        Object[] objArr = {method.invoke(obj3, null), method2.invoke(obj3, null), method3.invoke(obj3, null)};
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        int length = parameterTypes.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Class<?> cls2 = parameterTypes[i2];
            if (lw.i(cls2, cls)) {
                i = i3;
                obj2 = obj;
            } else if (lw.i(cls2, Integer.TYPE)) {
                i = i3 + 1;
                obj2 = objArr[i3];
            } else if (lw.i(cls2, Boolean.TYPE)) {
                i = i3;
                obj2 = Boolean.TRUE;
            } else {
                if (!lw.i(cls2, String.class)) {
                    z6.e(cls2, "Unsupported menu constructor ");
                    return null;
                }
                i = i3;
                obj2 = str;
            }
            arrayList.add(obj2);
            i2++;
            i3 = i;
        }
        Object[] array = arrayList.toArray(new Object[0]);
        Object newInstance = constructor.newInstance(Arrays.copyOf(array, array.length));
        newInstance.getClass();
        return newInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 installLayoutMenu$lambda$83(XposedModule xposedModule, Class cls) {
        xposedModule.getClass();
        cls.getClass();
        try {
            for (String str : kw.C("onExitVivoMultiTaskFinished", "reset", "releaseMultiTaskStatesList")) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                declaredMethods.getClass();
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (Method method : declaredMethods) {
                    if (lw.i(method.getName(), str)) {
                        arrayList.add(method);
                    }
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Method method2 = (Method) obj;
                    method2.setAccessible(true);
                    xposedModule.hook(method2).setId("wb_phone_manual_reset_" + str).intercept(new mr(5));
                }
            }
        } catch (Throwable th) {
            MLog.INSTANCE.e(TAG, "手动布局保持 hook 失败", th);
        }
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object installLayoutMenu$lambda$83$lambda$82(XposedInterface.Chain chain) {
        chain.getClass();
        Object thisObject = chain.getThisObject();
        if (thisObject != null) {
            manualLayouts.remove(thisObject);
        }
        return chain.proceed();
    }

    private final void installLayoutStateLock(XposedModule xposedModule, ClassLoader classLoader) {
        ClassWatch.INSTANCE.watch(xposedModule, classLoader, COORD, new dp(classLoader, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 installLayoutStateLock$lambda$47(ClassLoader classLoader, XposedModule xposedModule, final Class cls) {
        XposedInterface.HookHandle qf0Var;
        XposedInterface.HookHandle qf0Var2;
        xposedModule.getClass();
        cls.getClass();
        final PhoneLayoutHook phoneLayoutHook = INSTANCE;
        final int i = 1;
        try {
            final int i2 = 0;
            Method declaredMethod = cls.getDeclaredMethod("updateTaskStates", IBinder.class, Class.forName("android.window.TransitionInfo", false, classLoader), Class.forName("android.view.SurfaceControl$Transaction", false, classLoader));
            declaredMethod.setAccessible(true);
            qf0Var = xposedModule.hook(declaredMethod).setId("fucwb_layout_state_lock").intercept(new XposedInterface.Hooker(phoneLayoutHook) { // from class: wb0
                public final /* synthetic */ PhoneLayoutHook b;

                {
                    this.b = phoneLayoutHook;
                }

                public final Object intercept(XposedInterface.Chain chain) {
                    Object installLayoutStateLock$lambda$47$lambda$41$lambda$40;
                    Object installLayoutStateLock$lambda$47$lambda$45$lambda$44;
                    int i3 = i2;
                    Class cls2 = cls;
                    PhoneLayoutHook phoneLayoutHook2 = this.b;
                    switch (i3) {
                        case 0:
                            installLayoutStateLock$lambda$47$lambda$41$lambda$40 = PhoneLayoutHook.installLayoutStateLock$lambda$47$lambda$41$lambda$40(phoneLayoutHook2, cls2, chain);
                            return installLayoutStateLock$lambda$47$lambda$41$lambda$40;
                        default:
                            installLayoutStateLock$lambda$47$lambda$45$lambda$44 = PhoneLayoutHook.installLayoutStateLock$lambda$47$lambda$45$lambda$44(phoneLayoutHook2, cls2, chain);
                            return installLayoutStateLock$lambda$47$lambda$45$lambda$44;
                    }
                }
            });
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "上下布局状态锁安装失败", a);
        }
        final PhoneLayoutHook phoneLayoutHook2 = INSTANCE;
        try {
            Method declaredMethod2 = cls.getDeclaredMethod("isNeedSwitchLayout", Rect.class);
            declaredMethod2.setAccessible(true);
            qf0Var2 = xposedModule.hook(declaredMethod2).setId("fucwb_layout_auto_switch_lock").intercept(new XposedInterface.Hooker(phoneLayoutHook2) { // from class: wb0
                public final /* synthetic */ PhoneLayoutHook b;

                {
                    this.b = phoneLayoutHook2;
                }

                public final Object intercept(XposedInterface.Chain chain) {
                    Object installLayoutStateLock$lambda$47$lambda$41$lambda$40;
                    Object installLayoutStateLock$lambda$47$lambda$45$lambda$44;
                    int i3 = i;
                    Class cls2 = cls;
                    PhoneLayoutHook phoneLayoutHook22 = this.b;
                    switch (i3) {
                        case 0:
                            installLayoutStateLock$lambda$47$lambda$41$lambda$40 = PhoneLayoutHook.installLayoutStateLock$lambda$47$lambda$41$lambda$40(phoneLayoutHook22, cls2, chain);
                            return installLayoutStateLock$lambda$47$lambda$41$lambda$40;
                        default:
                            installLayoutStateLock$lambda$47$lambda$45$lambda$44 = PhoneLayoutHook.installLayoutStateLock$lambda$47$lambda$45$lambda$44(phoneLayoutHook22, cls2, chain);
                            return installLayoutStateLock$lambda$47$lambda$45$lambda$44;
                    }
                }
            });
        } catch (Throwable th2) {
            qf0Var2 = new qf0(th2);
        }
        Throwable a2 = rf0.a(qf0Var2);
        if (a2 != null) {
            MLog.INSTANCE.e(TAG, "自动布局切换锁安装失败", a2);
        }
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object installLayoutStateLock$lambda$47$lambda$41$lambda$40(PhoneLayoutHook phoneLayoutHook, Class cls, XposedInterface.Chain chain) {
        chain.getClass();
        Object thisObject = chain.getThisObject();
        if (thisObject == null) {
            z6.l("Required value was null.");
            return null;
        }
        Field field = phoneLayoutHook.field(cls, "mIsSupportTopBottomUI");
        boolean z = field.getBoolean(thisObject);
        if (phoneLayoutHook.isLandscapeCoordinator(thisObject, cls) && z) {
            field.setBoolean(thisObject, false);
        }
        try {
            return chain.proceed();
        } finally {
            field.setBoolean(thisObject, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object installLayoutStateLock$lambda$47$lambda$45$lambda$44(PhoneLayoutHook phoneLayoutHook, Class cls, XposedInterface.Chain chain) {
        chain.getClass();
        Object thisObject = chain.getThisObject();
        return (thisObject != null && phoneLayoutHook.isLandscapeCoordinator(thisObject, cls) && phoneLayoutHook.field(cls, "isUseTopBottomUI").getBoolean(thisObject)) ? Boolean.TRUE : (thisObject == null || !manualLayouts.containsKey(thisObject)) ? chain.proceed() : Boolean.FALSE;
    }

    private final void installStripSynchronization(XposedModule xposedModule, ClassLoader classLoader) {
        Iterator it = kw.C(Boolean.FALSE, Boolean.TRUE).iterator();
        while (it.hasNext()) {
            final boolean booleanValue = ((Boolean) it.next()).booleanValue();
            final String str = booleanValue ? "topbottomui.VivoMultiTaskTopBottomRecyclerView" : "leftrightui.VivoMultiTaskLeftRightRecyclerView";
            ClassWatch.INSTANCE.watch(xposedModule, classLoader, "com.android.wm.shell.vivomultitask.vivomultitaskui.".concat(str), new tq() { // from class: tb0
                @Override // defpackage.tq
                public final Object invoke(Object obj, Object obj2) {
                    fs0 installStripSynchronization$lambda$52;
                    installStripSynchronization$lambda$52 = PhoneLayoutHook.installStripSynchronization$lambda$52(str, booleanValue, (XposedModule) obj, (Class) obj2);
                    return installStripSynchronization$lambda$52;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 installStripSynchronization$lambda$52(final String str, final boolean z, XposedModule xposedModule, Class cls) {
        xposedModule.getClass();
        cls.getClass();
        final AtomicInteger atomicInteger = new AtomicInteger();
        for (final String str2 : kw.C("setRecycleViewData", "displayChange")) {
            try {
                Method declaredMethod = lw.i(str2, "displayChange") ? cls.getDeclaredMethod(str2, Integer.TYPE) : cls.getDeclaredMethod(str2, ArrayList.class, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                xposedModule.hook(declaredMethod).setId("wb_phone_strip_sync_" + str2).intercept(new XposedInterface.Hooker() { // from class: zb0
                    public final Object intercept(XposedInterface.Chain chain) {
                        Object installStripSynchronization$lambda$52$lambda$51;
                        installStripSynchronization$lambda$52$lambda$51 = PhoneLayoutHook.installStripSynchronization$lambda$52$lambda$51(str2, z, atomicInteger, str, chain);
                        return installStripSynchronization$lambda$52$lambda$51;
                    }
                }).getClass();
            } catch (Throwable th) {
                MLog.INSTANCE.e(TAG, "挂窗条同步 " + str + "/" + str2 + " 失败", th);
            }
        }
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object installStripSynchronization$lambda$52$lambda$51(String str, boolean z, AtomicInteger atomicInteger, String str2, XposedInterface.Chain chain) {
        Object qf0Var;
        Object thisObject;
        chain.getClass();
        Object proceed = chain.proceed();
        boolean z2 = true;
        if (!lw.i(str, "setRecycleViewData") || lw.i(chain.getArg(1), Boolean.TRUE)) {
            PhoneLayoutHook phoneLayoutHook = INSTANCE;
            try {
                thisObject = chain.getThisObject();
            } catch (Throwable th) {
                qf0Var = new qf0(th);
            }
            if (thisObject == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (atomicInteger.incrementAndGet() > 24) {
                z2 = false;
            }
            phoneLayoutHook.synchronizeStrip(thisObject, z, str, z2);
            qf0Var = fs0.a;
            Throwable a = rf0.a(qf0Var);
            if (a != null) {
                MLog.INSTANCE.e(TAG, "窗条 View 锚点同步失败 " + str2 + "/" + str, a);
            }
        }
        return proceed;
    }

    private final void installTopBottomStatePositionReapply(XposedModule xposedModule, ClassLoader classLoader, Method method) {
        ClassWatch.INSTANCE.watch(xposedModule, classLoader, COORD, new u3(3, classLoader, method));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 installTopBottomStatePositionReapply$lambda$38(ClassLoader classLoader, Method method, XposedModule xposedModule, Class cls) {
        XposedInterface.HookHandle qf0Var;
        xposedModule.getClass();
        cls.getClass();
        PhoneLayoutHook phoneLayoutHook = INSTANCE;
        try {
            Class<?> cls2 = Class.forName(STATE, false, classLoader);
            Class<?> cls3 = Class.forName("com.android.wm.shell.vivomultitask.vivomultitaskui.VivoMultiTaskPointInfo", false, classLoader);
            Method declaredMethod = cls.getDeclaredMethod("computeTaskStatesPositions", null);
            declaredMethod.setAccessible(true);
            qf0Var = xposedModule.hook(declaredMethod).setId("wb_phone_tb_main_state_position").intercept(new ur(phoneLayoutHook, cls, method, cls2, cls3, classLoader));
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "主卡状态位置 Hook 安装失败", a);
        }
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object installTopBottomStatePositionReapply$lambda$38$lambda$36$lambda$35(PhoneLayoutHook phoneLayoutHook, Class cls, Method method, Class cls2, Class cls3, ClassLoader classLoader, XposedInterface.Chain chain) {
        Object qf0Var;
        Object thisObject;
        Object obj;
        boolean z;
        chain.getClass();
        Object proceed = chain.proceed();
        try {
            thisObject = chain.getThisObject();
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (thisObject == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (phoneLayoutHook.field(cls, "isUseTopBottomUI").getBoolean(thisObject)) {
            Object obj2 = phoneLayoutHook.field(cls, "mVivoMultiTaskStatesList").get(thisObject);
            obj2.getClass();
            Iterator it = ((List) obj2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (obj != null && lw.i(cls2.getMethod("isMainTask", null).invoke(obj, null), Boolean.TRUE)) {
                    break;
                }
            }
            if (obj != null) {
                Object obj3 = phoneLayoutHook.field(cls, "mContext").get(thisObject);
                obj3.getClass();
                Context context = (Context) obj3;
                Configuration configuration = context.getResources().getConfiguration();
                Object invoke = method.invoke(null, null);
                invoke.getClass();
                Rect rect = (Rect) invoke;
                configuration.getClass();
                if (phoneLayoutHook.rotation(configuration) != 0 && phoneLayoutHook.rotation(configuration) != 2) {
                    z = false;
                    boolean z2 = z;
                    Object invoke2 = cls2.getMethod("getTopActivityBounds", null).invoke(obj, null);
                    invoke2.getClass();
                    Rect mainTaskRect = PhoneLayout.INSTANCE.mainTaskRect(context, z2, true, rect.width(), rect.height(), (Rect) invoke2);
                    cls2.getMethod("setPointInfo", cls3).invoke(obj, PhoneLayout.toPointInfo(classLoader, mainTaskRect));
                    MLog.INSTANCE.i(TAG, "v1.0.28 主卡状态位置重写 portrait=" + z2 + " target=" + mainTaskRect);
                }
                z = true;
                boolean z22 = z;
                Object invoke22 = cls2.getMethod("getTopActivityBounds", null).invoke(obj, null);
                invoke22.getClass();
                Rect mainTaskRect2 = PhoneLayout.INSTANCE.mainTaskRect(context, z22, true, rect.width(), rect.height(), (Rect) invoke22);
                cls2.getMethod("setPointInfo", cls3).invoke(obj, PhoneLayout.toPointInfo(classLoader, mainTaskRect2));
                MLog.INSTANCE.i(TAG, "v1.0.28 主卡状态位置重写 portrait=" + z22 + " target=" + mainTaskRect2);
            }
        }
        qf0Var = fs0.a;
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "主卡状态位置重写失败", a);
        }
        return proceed;
    }

    private final void installUiScopes(XposedModule xposedModule, ClassLoader classLoader, Method method) {
        ClassWatch classWatch = ClassWatch.INSTANCE;
        classWatch.watch(xposedModule, classLoader, COORD, new bd(20));
        classWatch.watch(xposedModule, classLoader, UI, new n(7, method));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 installUiScopes$lambda$25(XposedModule xposedModule, Class cls) {
        xposedModule.getClass();
        cls.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod("onDisplayConfigurationChanged", Integer.TYPE, Configuration.class);
            declaredMethod.setAccessible(true);
            xposedModule.hook(declaredMethod).setId("wb_phone_coordinator_display_scope").intercept(new xb0(cls, 3)).getClass();
        } catch (Throwable th) {
            MLog.INSTANCE.e(TAG, "协调器显示配置 hook 失败", th);
        }
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public static final Object installUiScopes$lambda$25$lambda$24(Class cls, XposedInterface.Chain chain) {
        Object qf0Var;
        Configuration configuration;
        Object thisObject;
        chain.getClass();
        Frame frame = scope.get();
        PhoneLayoutHook phoneLayoutHook = INSTANCE;
        try {
            Object arg = chain.getArg(1);
            arg.getClass();
            configuration = (Configuration) arg;
            thisObject = chain.getThisObject();
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (thisObject == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object obj = phoneLayoutHook.field(cls, "mContext").get(thisObject);
        obj.getClass();
        Context context = (Context) obj;
        Rect windowBounds = phoneLayoutHook.windowBounds(configuration);
        if (windowBounds.width() <= 0 || windowBounds.height() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        createConfigurationContext.getClass();
        qf0Var = new Frame(createConfigurationContext, windowBounds.width(), windowBounds.height(), phoneLayoutHook.rotation(configuration));
        Throwable a = rf0.a(qf0Var);
        if (a != null && seen.add("coordinator-scope")) {
            MLog.INSTANCE.e(TAG, "协调器配置 scope 回退", a);
        }
        if (qf0Var instanceof qf0) {
            qf0Var = null;
        }
        Frame frame2 = (Frame) qf0Var;
        if (frame2 != null) {
            scope.set(frame2);
        }
        try {
            Object proceed = chain.proceed();
            ThreadLocal<Frame> threadLocal = scope;
            if (frame == null) {
                threadLocal.remove();
            } else {
                threadLocal.set(frame);
            }
            return proceed;
        } catch (Throwable th2) {
            ThreadLocal<Frame> threadLocal2 = scope;
            if (frame == null) {
                threadLocal2.remove();
            } else {
                threadLocal2.set(frame);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fs0 installUiScopes$lambda$30(Method method, XposedModule xposedModule, Class cls) {
        xposedModule.getClass();
        cls.getClass();
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Method method2 : declaredMethods) {
            if (m20.m("onDisplayChange", "initAppWindowUi", "animateMove", "animateMoveForSort").contains(method2.getName())) {
                arrayList.add(method2);
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Method method3 = (Method) obj;
            method3.setAccessible(true);
            xposedModule.hook(method3).setId("wb_phone_scope_" + method3.getName()).intercept(new mb0(method3, cls, method));
        }
        return fs0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(7:5|(1:7)|8|9|10|(1:12)(1:15)|13))|23|24|25|26|(7:28|29|(2:31|32)(2:61|(2:63|(1:65)(2:66|67))(1:68))|33|(1:60)(1:39)|40|(2:58|59)(14:44|(1:46)(1:57)|47|48|(2:50|(1:52))|53|(1:55)|56|(0)|8|9|10|(0)(0)|13))(2:69|70)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0052, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0108, code lost:
    
        r13 = new defpackage.qf0(r12);
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object installUiScopes$lambda$30$lambda$29(Method method, Class cls, Method method2, XposedInterface.Chain chain) {
        Frame frame;
        Configuration configuration;
        int rotation;
        chain.getClass();
        Frame frame2 = scope.get();
        if (frame2 != null) {
            String name = method.getName();
            name.getClass();
            if (name.startsWith("animate")) {
                frame = frame2;
                if (frame != null) {
                    scope.set(frame);
                }
                try {
                    Object proceed = chain.proceed();
                    ThreadLocal<Frame> threadLocal = scope;
                    if (frame2 != null) {
                        threadLocal.remove();
                    } else {
                        threadLocal.set(frame2);
                    }
                    return proceed;
                } catch (Throwable th) {
                    ThreadLocal<Frame> threadLocal2 = scope;
                    if (frame2 == null) {
                        threadLocal2.remove();
                    } else {
                        threadLocal2.set(frame2);
                    }
                    throw th;
                }
            }
        }
        PhoneLayoutHook phoneLayoutHook = INSTANCE;
        Object thisObject = chain.getThisObject();
        if (thisObject == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object obj = phoneLayoutHook.field(cls, "mContext").get(thisObject);
        obj.getClass();
        Context context = (Context) obj;
        String name2 = method.getName();
        if (lw.i(name2, "onDisplayChange")) {
            Object arg = chain.getArg(0);
            arg.getClass();
            configuration = (Configuration) arg;
        } else if (lw.i(name2, "initAppWindowUi")) {
            Object arg2 = chain.getArg(1);
            if (arg2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object obj2 = phoneLayoutHook.field(arg2.getClass(), "configuration").get(arg2);
            obj2.getClass();
            configuration = (Configuration) obj2;
        } else {
            configuration = context.getResources().getConfiguration();
        }
        configuration.getClass();
        Rect windowBounds = phoneLayoutHook.windowBounds(configuration);
        if (!m20.m("onDisplayChange", "initAppWindowUi").contains(method.getName()) || windowBounds.width() <= 0 || windowBounds.height() <= 0) {
            Object invoke = method2.invoke(null, null);
            invoke.getClass();
            windowBounds = (Rect) invoke;
        }
        if (windowBounds.width() <= 0 || windowBounds.height() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        String name3 = method.getName();
        name3.getClass();
        if (name3.startsWith("animate")) {
            Object invoke2 = cls.getMethod("getRotation", null).invoke(thisObject, null);
            invoke2.getClass();
            rotation = ((Integer) invoke2).intValue();
        } else {
            rotation = phoneLayoutHook.rotation(configuration);
        }
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        createConfigurationContext.getClass();
        Object qf0Var = new Frame(createConfigurationContext, windowBounds.width(), windowBounds.height(), rotation);
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            if (seen.add("scope:" + method.getName())) {
                MLog.INSTANCE.e(TAG, "配置 scope 回退 " + method.getName(), a);
            }
        }
        frame = (Frame) (qf0Var instanceof qf0 ? null : qf0Var);
        if (frame != null) {
        }
        Object proceed2 = chain.proceed();
        ThreadLocal<Frame> threadLocal3 = scope;
        if (frame2 != null) {
        }
        return proceed2;
    }

    private final boolean isLandscapeCoordinator(Object obj, Class<?> cls) {
        Object qf0Var;
        try {
            Object obj2 = field(cls, "mContext").get(obj);
            obj2.getClass();
            Configuration configuration = ((Context) obj2).getResources().getConfiguration();
            boolean z = true;
            if (configuration.orientation != 2) {
                Rect windowBounds = windowBounds(configuration);
                if (windowBounds.width() <= windowBounds.height()) {
                    z = false;
                }
            }
            qf0Var = Boolean.valueOf(z);
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Object obj3 = Boolean.FALSE;
        if (qf0Var instanceof qf0) {
            qf0Var = obj3;
        }
        return ((Boolean) qf0Var).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int rotation(Configuration configuration) {
        qf0 qf0Var;
        Integer num;
        int intValue;
        try {
            Object obj = field(Configuration.class, "windowConfiguration").get(configuration);
            Object invoke = obj.getClass().getMethod("getRotation", null).invoke(obj, null);
            invoke.getClass();
            num = (Integer) invoke;
            intValue = num.intValue();
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (intValue < 0 || intValue >= 4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        qf0Var = num;
        Throwable a = rf0.a(qf0Var);
        Object obj2 = qf0Var;
        if (a != null) {
            obj2 = Integer.valueOf(configuration.orientation == 2 ? 1 : 0);
        }
        return ((Number) obj2).intValue();
    }

    private final void synchronizeStrip(final Object obj, final boolean z, String str, boolean z2) {
        final Class<?> cls = obj.getClass();
        Object obj2 = field(cls, "mLayoutManager").get(obj);
        String str2 = z ? "getPaddingLeft" : "getPaddingTop";
        String str3 = z ? "updateLayoutManagerLeftOffset" : "updateLayoutManagerTopOffset";
        Object invoke = obj2.getClass().getMethod(str2, null).invoke(obj2, null);
        cls.getMethod(str3, null).invoke(obj, null);
        Object invoke2 = obj2.getClass().getMethod(str2, null).invoke(obj2, null);
        final View view = (View) obj;
        if (!lw.i(invoke, invoke2)) {
            Class<?> cls2 = obj2.getClass();
            Class cls3 = Integer.TYPE;
            cls2.getMethod("scrollToPositionWithOffset", cls3, cls3).invoke(obj2, 0, 0);
        }
        if (lw.i(cls.getMethod("isComputingLayout", null).invoke(obj, null), Boolean.TRUE)) {
            view.post(new gm(view, cls, obj, 1));
        } else {
            cls.getMethod("invalidateItemDecorations", null).invoke(obj, null);
            view.requestLayout();
        }
        if (z2) {
            MLog.INSTANCE.i(TAG, "v1.0.28 窗条锚点同步 topBottom=" + z + " reason=" + str + " offset=" + invoke + "->" + invoke2);
        }
        if (z2) {
            view.post(new Runnable() { // from class: yb0
                @Override // java.lang.Runnable
                public final void run() {
                    PhoneLayoutHook.synchronizeStrip$lambda$59(view, cls, obj, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void synchronizeStrip$lambda$55(View view, Class cls, Object obj) {
        Object qf0Var;
        try {
            if (view.isAttachedToWindow() && !lw.i(cls.getMethod("isComputingLayout", null).invoke(obj, null), Boolean.TRUE)) {
                cls.getMethod("invalidateItemDecorations", null).invoke(obj, null);
                view.requestLayout();
            }
            qf0Var = fs0.a;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "延后窗条重排失败", a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void synchronizeStrip$lambda$59(View view, Class cls, Object obj, boolean z) {
        Object qf0Var;
        Method method;
        Method method2;
        try {
            if (view.isAttachedToWindow()) {
                Class<?>[] clsArr = null;
                Object invoke = cls.getMethod("getVivoMultiTaskAdapter", null).invoke(obj, null);
                Object invoke2 = invoke.getClass().getMethod("getVivoMultiTaskList", null).invoke(invoke, null);
                invoke2.getClass();
                List list = (List) invoke2;
                Object invoke3 = cls.getMethod("getChildCount", null).invoke(obj, null);
                invoke3.getClass();
                int intValue = ((Integer) invoke3).intValue();
                if (intValue > 5) {
                    intValue = 5;
                }
                char c = 0;
                aw C = t30.C(0, intValue);
                ArrayList arrayList = new ArrayList(bc.V(C));
                Iterator it = C.iterator();
                while (((zv) it).g) {
                    Object invoke4 = cls.getMethod("getChildAt", Integer.TYPE).invoke(obj, Integer.valueOf(((zv) it).nextInt()));
                    invoke4.getClass();
                    View view2 = (View) invoke4;
                    Object invoke5 = cls.getMethod("getChildAdapterPosition", View.class).invoke(obj, view2);
                    invoke5.getClass();
                    int intValue2 = ((Integer) invoke5).intValue();
                    Object b0 = ac.b0(intValue2, list);
                    Object invoke6 = (b0 == null || (method2 = b0.getClass().getMethod("getTaskId", clsArr)) == null) ? clsArr : method2.invoke(b0, clsArr);
                    Object invoke7 = (b0 == null || (method = b0.getClass().getMethod("getPointInfo", clsArr)) == null) ? clsArr : method.invoke(b0, clsArr);
                    int[] iArr = new int[2];
                    view2.getLocationOnScreen(iArr);
                    arrayList.add("index=" + intValue2 + " task=" + invoke6 + " root=(" + iArr[c] + "," + iArr[1] + "," + view2.getWidth() + "," + view2.getHeight() + ") surface=" + invoke7);
                    clsArr = null;
                    c = 0;
                }
                MLog.INSTANCE.i(TAG, "v1.0.28 窗条实测 topBottom=" + z + " " + ac.d0(arrayList, "; ", null, null, null, 62));
            }
            qf0Var = fs0.a;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e(TAG, "窗条实测诊断失败", a);
        }
    }

    private final String sysProp(String str) {
        Object qf0Var;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            invoke.getClass();
            qf0Var = (String) invoke;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (qf0Var instanceof qf0) {
            qf0Var = "";
        }
        return (String) qf0Var;
    }

    private final Rect windowBounds(Configuration configuration) {
        Object obj = field(Configuration.class, "windowConfiguration").get(configuration);
        Object invoke = obj.getClass().getMethod("getBounds", null).invoke(obj, null);
        invoke.getClass();
        return new Rect((Rect) invoke);
    }

    public final void install(XposedModule xposedModule, ClassLoader classLoader) {
        xposedModule.getClass();
        classLoader.getClass();
        String lowerCase = sysProp("ro.vivo.device.type").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        List C = kw.C("fold", "flip", "tablet", "pad");
        if (!C.isEmpty()) {
            Iterator it = C.iterator();
            while (it.hasNext()) {
                if (ln0.D(lowerCase, (String) it.next(), false)) {
                    return;
                }
            }
        }
        ClassWatch.INSTANCE.watch(xposedModule, classLoader, LOC, new bd(23));
    }

    public final String summary() {
        return "phoneLayout=" + installed + " version=1.0.28/code29 geometryHits=" + hits.get();
    }
}
