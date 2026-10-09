package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import com.vivo.cnm.lico.ui.HomeScreenKt;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class et implements uq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ br g;

    public /* synthetic */ et(Object obj, br brVar, int i) {
        this.e = i;
        this.f = obj;
        this.g = brVar;
    }

    @Override // defpackage.uq
    public final Object c(Object obj, Object obj2, Object obj3) {
        fs0 ShortcutCard$lambda$21;
        Typeface typeface;
        int i = this.e;
        br brVar = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ShortcutCard$lambda$21 = HomeScreenKt.ShortcutCard$lambda$21((vs) obj4, (eq) brVar, (zc) obj, (se) obj2, ((Integer) obj3).intValue());
                return ShortcutCard$lambda$21;
            default:
                Spannable spannable = (Spannable) obj4;
                a5 a5Var = (a5) brVar;
                om0 om0Var = (om0) obj;
                int intValue = ((Integer) obj2).intValue();
                int intValue2 = ((Integer) obj3).intValue();
                no0 no0Var = om0Var.f;
                xp xpVar = om0Var.c;
                if (xpVar == null) {
                    xpVar = xp.g;
                }
                vp vpVar = om0Var.d;
                int i2 = vpVar != null ? vpVar.a : 0;
                wp wpVar = om0Var.e;
                int i3 = wpVar != null ? wpVar.a : 65535;
                b5 b5Var = a5Var.e;
                ur0 b = ((hp) b5Var.i).b(no0Var, xpVar, i2, i3);
                if (b instanceof ur0) {
                    Object obj5 = b.e;
                    obj5.getClass();
                    typeface = (Typeface) obj5;
                } else {
                    v6 v6Var = new v6(b, b5Var.n);
                    b5Var.n = v6Var;
                    Object obj6 = v6Var.c;
                    obj6.getClass();
                    typeface = (Typeface) obj6;
                }
                spannable.setSpan(new jp(1, typeface), intValue, intValue2, 33);
                return fs0.a;
        }
    }
}
