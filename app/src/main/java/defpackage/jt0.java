package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class jt0 {
    public final m7 a;
    public final m7 b;
    public final m7 c;

    public jt0(m7 m7Var, m7 m7Var2, m7 m7Var3) {
        this.a = m7Var;
        this.b = m7Var2;
        this.c = m7Var3;
    }

    public abstract kt0 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        m7 m7Var = this.c;
        Class cls2 = (Class) m7Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        m7Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        m7 m7Var = this.a;
        Method method = (Method) m7Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, jt0.class.getClassLoader()).getDeclaredMethod("read", jt0.class);
        m7Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        m7 m7Var = this.b;
        Method method = (Method) m7Var.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, jt0.class);
        m7Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((kt0) this).e.readParcelable(kt0.class.getClassLoader());
    }

    public final lt0 g() {
        String readString = ((kt0) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (lt0) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void h(int i);

    public final void i(lt0 lt0Var) {
        if (lt0Var == null) {
            ((kt0) this).e.writeString(null);
            return;
        }
        try {
            ((kt0) this).e.writeString(b(lt0Var.getClass()).getName());
            kt0 a = a();
            try {
                d(lt0Var.getClass()).invoke(null, lt0Var, a);
                Parcel parcel = a.e;
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(lt0Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
