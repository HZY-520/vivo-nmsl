package defpackage;

import android.os.Bundle;
import com.vivo.cnm.lico.MainActivity;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class th0 {
    public final MainActivity a;
    public final kd b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final ic0 c = new ic0(14);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public th0(MainActivity mainActivity, kd kdVar) {
        this.a = mainActivity;
        this.b = kdVar;
    }

    public final void a() {
        MainActivity mainActivity = this.a;
        if (((gz) mainActivity.getLifecycle()).b != yy.f) {
            z6.m("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                z6.m("SavedStateRegistry was already attached.");
                return;
            }
            this.b.b();
            mainActivity.getLifecycle().a(new d20(1, this));
            this.e = true;
        }
    }
}
