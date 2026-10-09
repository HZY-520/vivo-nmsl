package defpackage;

import android.os.Bundle;
import com.vivo.cnm.lico.MainActivity;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class nh0 implements qh0 {
    public final rh0 a;
    public boolean b;
    public Bundle c;
    public final lo0 d;

    public nh0(rh0 rh0Var, MainActivity mainActivity) {
        rh0Var.getClass();
        this.a = rh0Var;
        this.d = new lo0(new kd(mainActivity, 5));
    }

    @Override // defpackage.qh0
    public final Bundle a() {
        Bundle h = nh.h((k90[]) Arrays.copyOf(new k90[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            h.putAll(bundle);
        }
        for (Map.Entry entry : ((oh0) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((od) ((kh0) entry.getValue()).a.e).a();
            if (!a.isEmpty()) {
                str.getClass();
                h.putBundle(str, a);
            }
        }
        this.b = false;
        return h;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle a = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle h = nh.h((k90[]) Arrays.copyOf(new k90[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            h.putAll(bundle);
        }
        if (a != null) {
            h.putAll(a);
        }
        this.c = h;
        this.b = true;
    }
}
