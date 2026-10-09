package defpackage;

import android.app.Application;
import android.os.Bundle;
import com.vivo.cnm.lico.MainActivity;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vh0 implements fu0 {
    public final Application a;
    public final eu0 b;
    public final Bundle c;
    public final zy d;
    public final rh0 e;

    public vh0(Application application, MainActivity mainActivity, Bundle bundle) {
        eu0 eu0Var;
        this.e = mainActivity.getSavedStateRegistry();
        this.d = mainActivity.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            eu0Var = eu0.c;
            if (eu0Var == null) {
                eu0Var = new eu0(application);
                eu0.c = eu0Var;
            }
        } else {
            eu0Var = new eu0(null);
        }
        this.b = eu0Var;
    }

    @Override // defpackage.fu0
    public final cu0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        z6.l("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.fu0
    public final cu0 b(Class cls, v30 v30Var) {
        ic0 ic0Var = t10.n;
        LinkedHashMap linkedHashMap = v30Var.a;
        String str = (String) linkedHashMap.get(ic0Var);
        if (str == null) {
            z6.m("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(lr0.o) == null || linkedHashMap.get(lr0.p) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            z6.m("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(eu0.d);
        boolean isAssignableFrom = s5.class.isAssignableFrom(cls);
        Constructor a = (!isAssignableFrom || application == null) ? wh0.a(cls, wh0.b) : wh0.a(cls, wh0.a);
        return a == null ? this.b.b(cls, v30Var) : (!isAssignableFrom || application == null) ? wh0.b(cls, a, lr0.i(v30Var)) : wh0.b(cls, a, application, lr0.i(v30Var));
    }

    @Override // defpackage.fu0
    public final cu0 c(lb lbVar, v30 v30Var) {
        Class cls = lbVar.a;
        cls.getClass();
        return b(cls, v30Var);
    }

    public final cu0 d(Class cls, String str) {
        AutoCloseable autoCloseable;
        Application application;
        zy zyVar = this.d;
        if (zyVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = s5.class.isAssignableFrom(cls);
        Constructor a = (!isAssignableFrom || this.a == null) ? wh0.a(cls, wh0.b) : wh0.a(cls, wh0.a);
        if (a == null) {
            if (this.a != null) {
                return this.b.a(cls);
            }
            gu0 gu0Var = gu0.a;
            if (gu0Var == null) {
                gu0Var = new gu0();
                gu0.a = gu0Var;
            }
            return gu0Var.a(cls);
        }
        rh0 rh0Var = this.e;
        rh0Var.getClass();
        kh0 g = z20.g(rh0Var.a(str), this.c);
        lh0 lh0Var = new lh0(str, g);
        lh0Var.d(rh0Var, zyVar);
        yy yyVar = ((gz) zyVar).b;
        if (yyVar == yy.f || yyVar.compareTo(yy.h) >= 0) {
            rh0Var.d();
        } else {
            zyVar.a(new ei(1, zyVar, rh0Var));
        }
        cu0 b = (!isAssignableFrom || (application = this.a) == null) ? wh0.b(cls, a, g) : wh0.b(cls, a, application, g);
        b.getClass();
        du0 du0Var = b.a;
        if (du0Var.d) {
            du0.a(lh0Var);
            return b;
        }
        synchronized (du0Var.a) {
            autoCloseable = (AutoCloseable) du0Var.b.put("androidx.lifecycle.savedstate.vm.tag", lh0Var);
        }
        du0.a(autoCloseable);
        return b;
    }
}
