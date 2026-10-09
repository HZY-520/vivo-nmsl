package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class sl extends View {
    public final /* synthetic */ rl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl(rl rlVar, Context context) {
        super(context);
        this.e = rlVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.e.run();
    }
}
