package defpackage;

import com.vivo.cnm.lico.MainActivity;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class ld implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ MainActivity f;

    public /* synthetic */ ld(MainActivity mainActivity, int i) {
        this.e = i;
        this.f = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        MainActivity mainActivity = this.f;
        switch (i) {
            case 0:
                xd.e(mainActivity);
                break;
            default:
                mainActivity.invalidateMenu();
                break;
        }
    }
}
