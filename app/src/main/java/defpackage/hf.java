package defpackage;

import android.graphics.PathMeasure;
import com.vivo.cnm.lico.BuildConfig;
import com.vivo.cnm.lico.DesktopEntry;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class hf implements eq {
    public final /* synthetic */ int e;

    public /* synthetic */ hf(int i) {
        this.e = i;
    }

    @Override // defpackage.eq
    public final Object b() {
        fs0 install$lambda$9$lambda$8;
        switch (this.e) {
            case 0:
                return null;
            case 1:
                kf.b("LocalTextToolbar");
                throw null;
            case 2:
                kf.b("LocalUriHandler");
                throw null;
            case 3:
                ue.b("Unexpected call to default provider");
                throw new id();
            case 4:
                install$lambda$9$lambda$8 = DesktopEntry.install$lambda$9$lambda$8();
                return install$lambda$9$lambda$8;
            case Gates.MAX_WINDOWS /* 5 */:
                return Boolean.FALSE;
            case 6:
            case 7:
                return null;
            case MainActivity.$stable /* 8 */:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 9:
                ll llVar = ju.a;
                return sh.a;
            case 10:
                return null;
            case 11:
                return new ck(48.0f);
            case 12:
                return new iy(3);
            case 13:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 14:
                ll llVar2 = e00.a;
                return b2.K;
            case 15:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 16:
                return h30.a;
            case BuildConfig.VERSION_CODE /* 17 */:
                mg a = t10.a(sm.e);
                t10.d(a, null);
                return a;
            case 18:
                return new v80();
            case 19:
                return new d5(new PathMeasure());
            case 20:
                return null;
            case 21:
                return new dg0();
            case 22:
                return null;
            case 23:
                return new ti0(0);
            case 24:
                return null;
            case 25:
                return new xk0();
            case 26:
                return new ck(0.0f);
            case 27:
                return zr0.a;
            case 28:
                return li.a;
            default:
                return new wr0();
        }
    }

    public /* synthetic */ hf(gr grVar, int i) {
        this.e = i;
    }
}
