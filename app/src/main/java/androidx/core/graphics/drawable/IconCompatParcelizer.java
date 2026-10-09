package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.vivo.cnm.lico.Gates;
import defpackage.jt0;
import defpackage.kt0;
import defpackage.z6;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(jt0 jt0Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = -1;
        iconCompat.c = null;
        iconCompat.d = null;
        iconCompat.e = 0;
        iconCompat.f = 0;
        iconCompat.g = null;
        iconCompat.h = IconCompat.k;
        iconCompat.i = null;
        iconCompat.a = !jt0Var.e(1) ? -1 : ((kt0) jt0Var).e.readInt();
        byte[] bArr = iconCompat.c;
        if (jt0Var.e(2)) {
            Parcel parcel = ((kt0) jt0Var).e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = jt0Var.f(iconCompat.d, 3);
        int i = iconCompat.e;
        if (jt0Var.e(4)) {
            i = ((kt0) jt0Var).e.readInt();
        }
        iconCompat.e = i;
        int i2 = iconCompat.f;
        if (jt0Var.e(5)) {
            i2 = ((kt0) jt0Var).e.readInt();
        }
        iconCompat.f = i2;
        iconCompat.g = (ColorStateList) jt0Var.f(iconCompat.g, 6);
        String str = iconCompat.i;
        if (jt0Var.e(7)) {
            str = ((kt0) jt0Var).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (jt0Var.e(8)) {
            str2 = ((kt0) jt0Var).e.readString();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                z6.l("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case Gates.MAX_WINDOWS /* 5 */:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str3;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, jt0 jt0Var) {
        jt0Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case Gates.MAX_WINDOWS /* 5 */:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            jt0Var.h(1);
            ((kt0) jt0Var).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            jt0Var.h(2);
            Parcel parcel = ((kt0) jt0Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            jt0Var.h(3);
            ((kt0) jt0Var).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            jt0Var.h(4);
            ((kt0) jt0Var).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            jt0Var.h(5);
            ((kt0) jt0Var).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            jt0Var.h(6);
            ((kt0) jt0Var).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            jt0Var.h(7);
            ((kt0) jt0Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            jt0Var.h(8);
            ((kt0) jt0Var).e.writeString(str2);
        }
    }
}
