package defpackage;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.vivo.cnm.lico.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class xd extends wd implements iu0, ws, uh0 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final qd Companion = new qd();
    private hu0 _viewModelStore;
    private final y1 activityResultRegistry;
    private int contentLayoutId;
    private final lg contextAwareHelper = new lg();
    private final oy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final oy fullyDrawnReporter$delegate;
    private boolean hasPictureInPictureSystemFeature;
    private final f20 menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final oy onBackPressedDispatcher$delegate;
    private final oy onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<yf> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<yf> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<yf> onNewIntentListeners;
    private final CopyOnWriteArrayList<yf> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<yf> onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList<yf> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final td reportFullyDrawnExecutor;
    private final sh0 savedStateRegistryController;

    public xd() {
        final MainActivity mainActivity = (MainActivity) this;
        final int i = 1;
        this.menuHostHelper = new f20(new ld(mainActivity, 1));
        th0 th0Var = new th0(mainActivity, new kd(mainActivity, 6));
        this.savedStateRegistryController = new sh0(th0Var);
        this.reportFullyDrawnExecutor = new ud(mainActivity);
        this.fullyDrawnReporter$delegate = new lo0(new kd(mainActivity, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new vd();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = new lo0(new kd(mainActivity, 3));
        if (getLifecycle() == null) {
            z6.m("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i2 = 0;
        getLifecycle().a(new cz() { // from class: nd
            @Override // defpackage.cz
            public final void e(ez ezVar, xy xyVar) {
                Window window;
                View peekDecorView;
                int i3 = i2;
                MainActivity mainActivity2 = mainActivity;
                switch (i3) {
                    case 0:
                        if (xyVar == xy.ON_STOP && (window = mainActivity2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        xd.a(mainActivity2, ezVar, xyVar);
                        break;
                }
            }
        });
        getLifecycle().a(new cz() { // from class: nd
            @Override // defpackage.cz
            public final void e(ez ezVar, xy xyVar) {
                Window window;
                View peekDecorView;
                int i3 = i;
                MainActivity mainActivity2 = mainActivity;
                switch (i3) {
                    case 0:
                        if (xyVar == xy.ON_STOP && (window = mainActivity2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        xd.a(mainActivity2, ezVar, xyVar);
                        break;
                }
            }
        });
        getLifecycle().a(new ne0(mainActivity, i));
        th0Var.a();
        yy yyVar = ((gz) getLifecycle()).b;
        if (yyVar != yy.f && yyVar != yy.g) {
            z6.l("Failed requirement.");
            throw null;
        }
        if (getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            nh0 nh0Var = new nh0(getSavedStateRegistry(), mainActivity);
            getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", nh0Var);
            getLifecycle().a(new ve(i, nh0Var));
        }
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new od(i2, mainActivity));
        addOnContextAvailableListener(new pd(mainActivity));
        this.defaultViewModelProviderFactory$delegate = new lo0(new kd(mainActivity, 4));
        this.onBackPressedDispatcher$delegate = new lo0(new kd(mainActivity, i2));
    }

    public static final void a(MainActivity mainActivity, ez ezVar, xy xyVar) {
        if (xyVar == xy.ON_DESTROY) {
            ((xd) mainActivity).contextAwareHelper.b = null;
            if (!mainActivity.isChangingConfigurations()) {
                LinkedHashMap linkedHashMap = mainActivity.getViewModelStore().a;
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((cu0) it.next()).a();
                }
                linkedHashMap.clear();
            }
            ud udVar = (ud) ((xd) mainActivity).reportFullyDrawnExecutor;
            MainActivity mainActivity2 = udVar.h;
            mainActivity2.getWindow().getDecorView().removeCallbacks(udVar);
            mainActivity2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(udVar);
        }
    }

    public static final void access$ensureViewModelStore(xd xdVar) {
        if (xdVar._viewModelStore == null) {
            sd sdVar = (sd) xdVar.getLastNonConfigurationInstance();
            if (sdVar != null) {
                xdVar._viewModelStore = sdVar.b;
            }
            if (xdVar._viewModelStore == null) {
                xdVar._viewModelStore = new hu0();
            }
        }
    }

    public static final Bundle b(MainActivity mainActivity) {
        Bundle bundle = new Bundle();
        y1 y1Var = ((xd) mainActivity).activityResultRegistry;
        y1Var.getClass();
        LinkedHashMap linkedHashMap = y1Var.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(y1Var.c));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(y1Var.f));
        return bundle;
    }

    public static final void c(MainActivity mainActivity, xd xdVar) {
        xdVar.getClass();
        Bundle a = mainActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a != null) {
            y1 y1Var = ((xd) mainActivity).activityResultRegistry;
            LinkedHashMap linkedHashMap = y1Var.b;
            LinkedHashMap linkedHashMap2 = y1Var.a;
            Bundle bundle = y1Var.f;
            ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                y1Var.c.addAll(stringArrayList2);
            }
            Bundle bundle2 = a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        lr0.c(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                y1Var.b.put(str3, Integer.valueOf(intValue));
            }
        }
    }

    public static final dq d(MainActivity mainActivity) {
        return new dq(((xd) mainActivity).reportFullyDrawnExecutor, new kd(mainActivity, 1));
    }

    public static final void e(MainActivity mainActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!lw.i(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!lw.i(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        td tdVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ud) tdVar).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(g20 g20Var, ez ezVar) {
        g20Var.getClass();
        ezVar.getClass();
        f20 f20Var = this.menuHostHelper;
        f20Var.b.add(null);
        f20Var.a.run();
        zy lifecycle = ezVar.getLifecycle();
        HashMap hashMap = f20Var.c;
        e20 e20Var = (e20) hashMap.remove(g20Var);
        if (e20Var != null) {
            e20Var.a.b(e20Var.b);
            e20Var.b = null;
        }
        hashMap.put(g20Var, new e20(lifecycle, new d20(0, f20Var)));
    }

    public final void addOnConfigurationChangedListener(yf yfVar) {
        yfVar.getClass();
        this.onConfigurationChangedListeners.add(yfVar);
    }

    public final void addOnContextAvailableListener(e70 e70Var) {
        e70Var.getClass();
        lg lgVar = this.contextAwareHelper;
        lgVar.getClass();
        xd xdVar = lgVar.b;
        if (xdVar != null) {
            c(((pd) e70Var).a, xdVar);
        }
        lgVar.a.add(e70Var);
    }

    public final void addOnMultiWindowModeChangedListener(yf yfVar) {
        yfVar.getClass();
        this.onMultiWindowModeChangedListeners.add(yfVar);
    }

    public final void addOnNewIntentListener(yf yfVar) {
        yfVar.getClass();
        this.onNewIntentListeners.add(yfVar);
    }

    public final void addOnPictureInPictureModeChangedListener(yf yfVar) {
        yfVar.getClass();
        this.onPictureInPictureModeChangedListeners.add(yfVar);
    }

    public final void addOnPictureInPictureUiStateChangedListener(yf yfVar) {
        yfVar.getClass();
        this.onPictureInPictureUiStateChangedListeners.add(yfVar);
    }

    public final void addOnTrimMemoryListener(yf yfVar) {
        yfVar.getClass();
        this.onTrimMemoryListeners.add(yfVar);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final void enterPictureInPictureMode(ac0 ac0Var) {
        throw null;
    }

    public final y1 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // defpackage.ws
    public ih getDefaultViewModelCreationExtras() {
        v30 v30Var = new v30(hh.b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = v30Var.a;
        if (application != null) {
            linkedHashMap.put(eu0.d, getApplication());
        }
        linkedHashMap.put(lr0.o, this);
        linkedHashMap.put(lr0.p, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(lr0.q, extras);
        }
        return v30Var;
    }

    public fu0 getDefaultViewModelProviderFactory() {
        return (fu0) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public dq getFullyDrawnReporter() {
        return (dq) this.fullyDrawnReporter$delegate.getValue();
    }

    @xi
    public Object getLastCustomNonConfigurationInstance() {
        sd sdVar = (sd) getLastNonConfigurationInstance();
        if (sdVar != null) {
            return sdVar.a;
        }
        return null;
    }

    @Override // defpackage.wd, defpackage.ez
    public zy getLifecycle() {
        return super.getLifecycle();
    }

    public f50 getNavigationEventDispatcher() {
        return ((c70) getOnBackPressedDispatcher().b.getValue()).c;
    }

    public final d70 getOnBackPressedDispatcher() {
        return (d70) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // defpackage.uh0
    public final rh0 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // defpackage.iu0
    public hu0 getViewModelStore() {
        if (getApplication() == null) {
            z6.m("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        hu0 hu0Var = this._viewModelStore;
        if (hu0Var == null) {
            sd sdVar = (sd) getLastNonConfigurationInstance();
            if (sdVar != null) {
                this._viewModelStore = sdVar.b;
            }
            hu0Var = this._viewModelStore;
            if (hu0Var == null) {
                hu0Var = new hu0();
                this._viewModelStore = hu0Var;
            }
        }
        hu0Var.getClass();
        return hu0Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(2131034216, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(2131034220, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(2131034219, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(2131034218, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(2131034190, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(2131034217, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @xi
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @xi
    public void onBackPressed() {
        ((ij) this.onBackPressedInput$delegate.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<yf> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // defpackage.wd, android.app.Activity
    public void onCreate(Bundle bundle) {
        th0 th0Var = this.savedStateRegistryController.a;
        MainActivity mainActivity = th0Var.a;
        if (!th0Var.e) {
            th0Var.a();
        }
        if (((gz) mainActivity.getLifecycle()).b.compareTo(yy.h) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + ((gz) mainActivity.getLifecycle()).b).toString());
        }
        if (th0Var.g) {
            z6.m("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = p30.g(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        th0Var.f = bundle2;
        th0Var.g = true;
        lg lgVar = this.contextAwareHelper;
        lgVar.getClass();
        lgVar.b = this;
        Iterator it = lgVar.a.iterator();
        while (it.hasNext()) {
            c(((pd) ((e70) it.next())).a, this);
        }
        super.onCreate(bundle);
        int i = jf0.f;
        hf0.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        f20 f20Var = this.menuHostHelper;
        getMenuInflater();
        Iterator it = f20Var.b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        z6.c();
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = this.menuHostHelper.b.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                z6.c();
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<yf> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new i2(25));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<yf> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.b.iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i, menu);
        } else {
            it.next().getClass();
            z6.c();
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<yf> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new i2(28));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        i2 i2Var;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        int i2 = 29;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            i2Var = new i2(i2);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            i2Var = new i2(i2);
        } else {
            i2Var = new i2(i2);
        }
        Iterator<yf> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(i2Var);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        z6.c();
        return false;
    }

    @Override // android.app.Activity
    @xi
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @xi
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        sd sdVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        hu0 hu0Var = this._viewModelStore;
        if (hu0Var == null && (sdVar = (sd) getLastNonConfigurationInstance()) != null) {
            hu0Var = sdVar.b;
        }
        if (hu0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        sd sdVar2 = new sd();
        sdVar2.a = onRetainCustomNonConfigurationInstance;
        sdVar2.b = hu0Var;
        return sdVar2;
    }

    @Override // defpackage.wd, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof gz) {
            zy lifecycle = getLifecycle();
            lifecycle.getClass();
            gz gzVar = (gz) lifecycle;
            yy yyVar = yy.g;
            gzVar.d("setCurrentState");
            gzVar.f(yyVar);
        }
        super.onSaveInstanceState(bundle);
        sh0 sh0Var = this.savedStateRegistryController;
        sh0Var.getClass();
        th0 th0Var = sh0Var.a;
        Bundle h = nh.h((k90[]) Arrays.copyOf(new k90[0], 0));
        Bundle bundle2 = th0Var.f;
        if (bundle2 != null) {
            h.putAll(bundle2);
        }
        synchronized (th0Var.c) {
            for (Map.Entry entry : th0Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle a = ((qh0) entry.getValue()).a();
                str.getClass();
                h.putBundle(str, a);
            }
        }
        if (h.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", h);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<yf> it = this.onTrimMemoryListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final <I, O> w1 registerForActivityResult(v1 v1Var, u1 u1Var) {
        throw null;
    }

    public void removeMenuProvider(g20 g20Var) {
        g20Var.getClass();
        this.menuHostHelper.a();
    }

    public final void removeOnConfigurationChangedListener(yf yfVar) {
        yfVar.getClass();
        this.onConfigurationChangedListeners.remove(yfVar);
    }

    public final void removeOnContextAvailableListener(e70 e70Var) {
        e70Var.getClass();
        lg lgVar = this.contextAwareHelper;
        lgVar.getClass();
        lgVar.a.remove(e70Var);
    }

    public final void removeOnMultiWindowModeChangedListener(yf yfVar) {
        yfVar.getClass();
        this.onMultiWindowModeChangedListeners.remove(yfVar);
    }

    public final void removeOnNewIntentListener(yf yfVar) {
        yfVar.getClass();
        this.onNewIntentListeners.remove(yfVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(yf yfVar) {
        yfVar.getClass();
        this.onPictureInPictureModeChangedListeners.remove(yfVar);
    }

    public final void removeOnPictureInPictureUiStateChangedListener(yf yfVar) {
        yfVar.getClass();
        this.onPictureInPictureUiStateChangedListeners.remove(yfVar);
    }

    public final void removeOnTrimMemoryListener(yf yfVar) {
        yfVar.getClass();
        this.onTrimMemoryListeners.remove(yfVar);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (z20.o()) {
                z20.e("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            dq fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.a) {
                try {
                    fullyDrawnReporter.b = true;
                    ArrayList arrayList = fullyDrawnReporter.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((eq) obj).b();
                    }
                    fullyDrawnReporter.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        td tdVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ud) tdVar).a(decorView);
        super.setContentView(i);
    }

    public final void setPictureInPictureParams(ac0 ac0Var) {
        throw null;
    }

    @Override // android.app.Activity
    @xi
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @xi
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final <I, O> w1 registerForActivityResult(v1 v1Var, y1 y1Var, u1 u1Var) {
        throw null;
    }

    @Override // android.app.Activity
    @xi
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @xi
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        td tdVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ud) tdVar).a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        td tdVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ud) tdVar).a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @xi
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<yf> it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new i2(25));
        }
    }

    @Override // android.app.Activity
    @xi
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<yf> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new i2(28));
        }
    }

    public void addMenuProvider(g20 g20Var) {
        g20Var.getClass();
        f20 f20Var = this.menuHostHelper;
        f20Var.b.add(null);
        f20Var.a.run();
    }

    public void addMenuProvider(g20 g20Var, ez ezVar, yy yyVar) {
        g20Var.getClass();
        ezVar.getClass();
        yyVar.getClass();
        f20 f20Var = this.menuHostHelper;
        f20Var.getClass();
        zy lifecycle = ezVar.getLifecycle();
        HashMap hashMap = f20Var.c;
        e20 e20Var = (e20) hashMap.remove(g20Var);
        if (e20Var != null) {
            e20Var.a.b(e20Var.b);
            e20Var.b = null;
        }
        hashMap.put(g20Var, new e20(lifecycle, new md(1, f20Var, yyVar)));
    }
}
