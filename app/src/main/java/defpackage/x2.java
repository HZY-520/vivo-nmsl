package defpackage;

import android.os.Build;
import android.view.SoundEffectConstants;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class x2 implements tq {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ x2(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                int i2 = ((lo) obj).a;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Integer b = oo.b(i2);
                if (b != null) {
                    int intValue = b.intValue();
                    ((e3) obj3).playSoundEffect(Build.VERSION.SDK_INT >= 31 ? t6.a.a(intValue, booleanValue) : SoundEffectConstants.getContantForFocusDirection(intValue));
                    break;
                }
                break;
            default:
                se seVar = (se) obj;
                int intValue2 = ((Number) obj2).intValue();
                gr grVar = (gr) seVar;
                if (!grVar.I(intValue2 & 1, (intValue2 & 3) != 2)) {
                    grVar.L();
                    break;
                } else {
                    uq uqVar = (uq) obj3;
                    yc a = wc.a(lr0.b, grVar, 0);
                    int hashCode = Long.hashCode(grVar.Q);
                    xa0 k = grVar.k();
                    u20 z = dx0.z(grVar, r20.a);
                    le.c.getClass();
                    grVar.R();
                    if (grVar.P) {
                        grVar.j();
                    } else {
                        grVar.b0();
                    }
                    t30.t(grVar, b2.x, a);
                    t30.t(grVar, b2.w, k);
                    bd bdVar = b2.y;
                    if (grVar.P || !lw.i(grVar.G(), Integer.valueOf(hashCode))) {
                        grVar.Y(Integer.valueOf(hashCode));
                        grVar.b(bdVar, Integer.valueOf(hashCode));
                    }
                    t30.t(grVar, b2.v, z);
                    uqVar.c(ad.a, grVar, 6);
                    grVar.o(true);
                    break;
                }
        }
        return fs0Var;
    }
}
