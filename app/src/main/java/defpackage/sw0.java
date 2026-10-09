package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class sw0 extends ContentObserver {
    public final /* synthetic */ o9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw0(o9 o9Var, Handler handler) {
        super(handler);
        this.a = o9Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.p(fs0.a);
    }
}
