package defpackage;

import android.os.Trace;
import com.vivo.cnm.lico.BuildConfig;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;
import com.vivo.cnm.lico.WorkbenchAppPicker;
import io.github.libxposed.api.XposedModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class ei0 implements tq {
    public final /* synthetic */ int e;

    public /* synthetic */ ei0(int i) {
        this.e = i;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        fs0 install$lambda$11;
        int i = this.e;
        fs0 fs0Var = fs0.a;
        switch (i) {
            case 0:
                return Integer.valueOf(((qp0) obj2).a);
            case 1:
                return Integer.valueOf(((ti0) obj2).a.g());
            case 2:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = um.e;
                }
                return ac.g0(collection, list);
            case 3:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 4:
                Float f = (Float) obj;
                ((Float) obj2).getClass();
                return f;
            case Gates.MAX_WINDOWS /* 5 */:
                return (jg0) obj;
            case 6:
                return (String) obj;
            case 7:
                return (fs0) obj;
            case MainActivity.$stable /* 8 */:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case 9:
                return (tk0) obj;
            case 10:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 11:
                return (kg) obj;
            case 12:
                return (a4) obj;
            case 13:
                return (l4) obj;
            case 14:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).getClass();
                return bool;
            case 15:
                if (obj != null || obj2 != null) {
                    z6.c();
                }
                return null;
            case 16:
                return obj == null ? obj2 : obj;
            case BuildConfig.VERSION_CODE /* 17 */:
                uj0 uj0Var = (uj0) obj2;
                Object valueOf = Float.valueOf(0.0f);
                qj0 qj0Var = ((uj0) obj).d;
                ak0 ak0Var = yj0.u;
                Object g = qj0Var.e.g(ak0Var);
                if (g == null) {
                    g = valueOf;
                }
                float floatValue = ((Number) g).floatValue();
                Object g2 = uj0Var.d.e.g(ak0Var);
                if (g2 != null) {
                    valueOf = g2;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf).floatValue()));
            case 18:
                rg rgVar = (rg) obj2;
                if (!(rgVar instanceof fq0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? rgVar : Integer.valueOf(intValue + 1);
            case 19:
                fq0 fq0Var = (fq0) obj;
                rg rgVar2 = (rg) obj2;
                if (fq0Var != null) {
                    return fq0Var;
                }
                if (rgVar2 instanceof fq0) {
                    return (fq0) rgVar2;
                }
                return null;
            case 20:
                jq0 jq0Var = (jq0) obj;
                rg rgVar3 = (rg) obj2;
                if (rgVar3 instanceof fq0) {
                    tg tgVar = jq0Var.a;
                    Trace.beginSection("Compose:LaunchedEffect");
                    Object[] objArr = jq0Var.b;
                    int i2 = jq0Var.d;
                    objArr[i2] = fs0Var;
                    fq0[] fq0VarArr = jq0Var.c;
                    jq0Var.d = i2 + 1;
                    fq0VarArr[i2] = (fq0) rgVar3;
                }
                return jq0Var;
            case 21:
                b2.z.invoke(obj);
                return fs0Var;
            default:
                install$lambda$11 = WorkbenchAppPicker.install$lambda$11((XposedModule) obj, (Class) obj2);
                return install$lambda$11;
        }
    }
}
