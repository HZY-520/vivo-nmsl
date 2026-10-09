package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class y1 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final ArrayList c;
    public final transient LinkedHashMap d;
    public final LinkedHashMap e;
    public final Bundle f;

    public y1() {
        new LinkedHashMap();
        this.c = new ArrayList();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new Bundle();
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.e.remove(str);
        this.f.putParcelable(str, new t1(intent, i2));
        return true;
    }
}
