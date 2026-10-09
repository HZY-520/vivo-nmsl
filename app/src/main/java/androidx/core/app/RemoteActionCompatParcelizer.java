package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.jt0;
import defpackage.kt0;
import defpackage.lt0;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(jt0 jt0Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        lt0 lt0Var = remoteActionCompat.a;
        boolean z = true;
        if (jt0Var.e(1)) {
            lt0Var = jt0Var.g();
        }
        remoteActionCompat.a = (IconCompat) lt0Var;
        CharSequence charSequence = remoteActionCompat.b;
        if (jt0Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((kt0) jt0Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (jt0Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((kt0) jt0Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) jt0Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (jt0Var.e(5)) {
            z2 = ((kt0) jt0Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!jt0Var.e(6)) {
            z = z3;
        } else if (((kt0) jt0Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, jt0 jt0Var) {
        jt0Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        jt0Var.h(1);
        jt0Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        jt0Var.h(2);
        Parcel parcel = ((kt0) jt0Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        jt0Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        jt0Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        jt0Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        jt0Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
