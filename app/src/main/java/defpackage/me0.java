package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class me0 implements qh0 {
    public final LinkedHashSet a = new LinkedHashSet();

    public me0(rh0 rh0Var) {
        rh0Var.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.qh0
    public final Bundle a() {
        Bundle h = nh.h((k90[]) Arrays.copyOf(new k90[0], 0));
        List j0 = ac.j0(this.a);
        h.putStringArrayList("classes_to_restore", j0 instanceof ArrayList ? (ArrayList) j0 : new ArrayList<>(j0));
        return h;
    }
}
