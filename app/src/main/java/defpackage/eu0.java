package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class eu0 extends gu0 {
    public static eu0 c;
    public static final ic0 d = new ic0(17);
    public final Application b;

    public eu0(Application application) {
        this.b = application;
    }

    @Override // defpackage.gu0, defpackage.fu0
    public final cu0 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.gu0, defpackage.fu0
    public final cu0 b(Class cls, v30 v30Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) v30Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!s5.class.isAssignableFrom(cls)) {
            return lw.r(cls);
        }
        z6.l("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final cu0 d(Class cls, Application application) {
        if (!s5.class.isAssignableFrom(cls)) {
            return lw.r(cls);
        }
        try {
            cu0 cu0Var = (cu0) cls.getConstructor(Application.class).newInstance(application);
            cu0Var.getClass();
            return cu0Var;
        } catch (IllegalAccessException e) {
            z6.i("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            z6.i("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            z6.i("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            z6.i("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
