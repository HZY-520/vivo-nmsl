package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.kt0;
import defpackage.lt0;
import defpackage.s1;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new s1(1);
    public final lt0 e;

    public ParcelImpl(Parcel parcel) {
        this.e = new kt0(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new kt0(parcel).i(this.e);
    }
}
