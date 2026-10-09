package defpackage;

import android.os.Bundle;
import com.vivo.cnm.lico.MainActivity;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ne0 implements cz {
    public final /* synthetic */ int e;
    public final MainActivity f;

    public /* synthetic */ ne0(MainActivity mainActivity, int i) {
        this.e = i;
        this.f = mainActivity;
    }

    @Override // defpackage.cz
    public final void e(ez ezVar, xy xyVar) {
        int i = this.e;
        MainActivity mainActivity = this.f;
        switch (i) {
            case 0:
                if (xyVar != xy.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                ezVar.getLifecycle().b(this);
                Bundle a = mainActivity.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (a == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    z6.m("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, ne0.class.getClassLoader()).asSubclass(ph0.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                hu0 viewModelStore = mainActivity.getViewModelStore();
                                rh0 savedStateRegistry = mainActivity.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    str3.getClass();
                                    cu0 cu0Var = (cu0) linkedHashMap.get(str3);
                                    if (cu0Var != null) {
                                        dx0.f(cu0Var, savedStateRegistry, mainActivity.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e) {
                                z6.i("Failed to instantiate ", str2, e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(j2.j("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            default:
                xd.access$ensureViewModelStore(mainActivity);
                mainActivity.getLifecycle().b(this);
                return;
        }
    }
}
