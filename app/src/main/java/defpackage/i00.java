package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class i00 {
    public final j00 a;

    static {
        new LocaleList(new Locale[0]);
    }

    public i00(j00 j00Var) {
        this.a = j00Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i00) {
            return this.a.equals(((i00) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
