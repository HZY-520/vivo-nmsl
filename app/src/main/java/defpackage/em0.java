package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class em0 implements Parcelable.ClassLoaderCreator {
    public static fm0 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = em0.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new fm0();
        }
        jb0 e = pl0.f.e();
        for (int i = 0; i < readInt; i++) {
            e.add(parcel.readValue(classLoader));
        }
        return new fm0(e.c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new fm0[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
