package defpackage;

import android.os.Build;
import com.vivo.cnm.lico.DesktopEntry;
import com.vivo.cnm.lico.Gates;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ int e;

    public /* synthetic */ y2(int i) {
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                h40 h40Var = e3.O0;
                synchronized (h40Var) {
                    try {
                        int i = Build.VERSION.SDK_INT;
                        Object[] objArr = h40Var.a;
                        int i2 = h40Var.b;
                        int i3 = 0;
                        if (i < 30) {
                            while (i3 < i2) {
                                e3 e3Var = (e3) objArr[i3];
                                boolean showLayoutBounds = e3Var.getShowLayoutBounds();
                                Class cls = e3.L0;
                                e3Var.setShowLayoutBounds(dx0.t());
                                if (showLayoutBounds != e3Var.getShowLayoutBounds()) {
                                    e3Var.post(new v2(e3Var, 2));
                                }
                                i3++;
                            }
                        } else {
                            while (i3 < i2) {
                                e3 e3Var2 = (e3) objArr[i3];
                                e3Var2.post(new v2(e3Var2, 3));
                                i3++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                DesktopEntry.install$lambda$9();
                return;
            default:
                Gates.scheduleSettingsEnsure$lambda$13();
                return;
        }
    }
}
