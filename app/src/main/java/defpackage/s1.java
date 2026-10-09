package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class s1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new t1(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                return new ParcelImpl(parcel);
            case 2:
                return new s90(parcel.readFloat());
            case 3:
                return new t90(parcel.readInt());
            default:
                return new u90(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new t1[i];
            case 1:
                return new ParcelImpl[i];
            case 2:
                return new s90[i];
            case 3:
                return new t90[i];
            default:
                return new u90[i];
        }
    }
}
