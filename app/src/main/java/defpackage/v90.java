package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class v90 implements Parcelable.ClassLoaderCreator {
    public static w90 a(Parcel parcel, ClassLoader classLoader) {
        b2 b2Var;
        if (classLoader == null) {
            classLoader = v90.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            b2Var = b2.R;
        } else if (readInt == 1) {
            b2Var = b2.W;
        } else {
            if (readInt != 2) {
                z6.m(j2.h("Unsupported MutableState policy ", readInt, " was restored"));
                return null;
            }
            b2Var = b2.U;
        }
        return new w90(readValue, b2Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new w90[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
