package defpackage;

import android.content.Context;
import com.vivo.cnm.lico.BuildConfig;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class a60 implements pq {
    public final /* synthetic */ int e;

    public /* synthetic */ a60(int i) {
        this.e = i;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        int i = this.e;
        om0 om0Var = null;
        r2 = null;
        pp0 pp0Var = null;
        om0Var = null;
        fs0 fs0Var = fs0.a;
        switch (i) {
            case 0:
                d60 d60Var = (d60) obj;
                iy iyVar = d60Var.y;
                try {
                    if (d60Var.p()) {
                        d60Var.Z0(true);
                    }
                    return fs0Var;
                } catch (Throwable th) {
                    iyVar.Q(th);
                    throw null;
                }
            case 1:
                y80 y80Var = ((d60) obj).X;
                if (y80Var != null) {
                    ((hs) y80Var).c();
                }
                return fs0Var;
            case 2:
                ((Long) obj).getClass();
                return fs0Var;
            case 3:
                r60 r60Var = (r60) obj;
                if (r60Var.p()) {
                    r60Var.e.z();
                }
                return fs0Var;
            case 4:
                xa0 xa0Var = (xa0) obj;
                int i2 = u4.a;
                ll llVar = s3.b;
                xa0Var.getClass();
                Context context = (Context) kw.F(xa0Var, llVar);
                si siVar = (si) kw.F(xa0Var, kf.h);
                v80 v80Var = (v80) kw.F(xa0Var, w80.a);
                if (v80Var == null) {
                    return null;
                }
                return new j4(context, siVar, v80Var.a, v80Var.b);
            case Gates.MAX_WINDOWS /* 5 */:
                iy iyVar2 = (iy) obj;
                if (iyVar2.B()) {
                    iy.L(iyVar2, false, 7);
                }
                return fs0Var;
            case 6:
                iy iyVar3 = (iy) obj;
                if (iyVar3.B()) {
                    iy.N(iyVar3, false, 7);
                }
                return fs0Var;
            case 7:
                iy iyVar4 = (iy) obj;
                if (iyVar4.B()) {
                    iyVar4.z();
                }
                return fs0Var;
            case MainActivity.$stable /* 8 */:
                iy iyVar5 = (iy) obj;
                if (iyVar5.B()) {
                    iyVar5.M(false);
                }
                return fs0Var;
            case 9:
                iy iyVar6 = (iy) obj;
                if (iyVar6.B()) {
                    iyVar6.M(false);
                }
                return fs0Var;
            case 10:
                iy iyVar7 = (iy) obj;
                if (iyVar7.B()) {
                    iyVar7.K(false);
                }
                return fs0Var;
            case 11:
                iy iyVar8 = (iy) obj;
                if (iyVar8.B()) {
                    iyVar8.K(false);
                }
                return fs0Var;
            case 12:
                obj.getClass();
                return Boolean.valueOf(!((z80) obj).p());
            case 13:
                return fs0Var;
            case 14:
                return fs0Var;
            case 15:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                pq pqVar = (pq) di0.h.g;
                Boolean bool = Boolean.FALSE;
                om0 om0Var2 = (lw.i(obj2, bool) || obj2 == null) ? null : (om0) pqVar.invoke(obj2);
                Object obj3 = list.get(1);
                om0 om0Var3 = (lw.i(obj3, bool) || obj3 == null) ? null : (om0) pqVar.invoke(obj3);
                Object obj4 = list.get(2);
                om0 om0Var4 = (lw.i(obj4, bool) || obj4 == null) ? null : (om0) pqVar.invoke(obj4);
                Object obj5 = list.get(3);
                if (!lw.i(obj5, bool) && obj5 != null) {
                    om0Var = (om0) pqVar.invoke(obj5);
                }
                return new pp0(om0Var2, om0Var3, om0Var4, om0Var);
            case 16:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (lw.i(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((pq) di0.a.g).invoke(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new p6(list3, str);
            case BuildConfig.VERSION_CODE /* 17 */:
                obj.getClass();
                return new bp0(((Integer) obj).intValue());
            case 18:
                obj.getClass();
                List list4 = (List) obj;
                return new fp0(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 19:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                cq0[] cq0VarArr = bq0.b;
                pq pqVar2 = di0.v.f;
                Boolean bool2 = Boolean.FALSE;
                lw.i(obj8, bool2);
                bq0 bq0Var = obj8 != null ? (bq0) pqVar2.invoke(obj8) : null;
                bq0Var.getClass();
                long j = bq0Var.a;
                Object obj9 = list5.get(1);
                lw.i(obj9, bool2);
                bq0 bq0Var2 = obj9 != null ? (bq0) pqVar2.invoke(obj9) : null;
                bq0Var2.getClass();
                return new gp0(j, bq0Var2.a);
            case 20:
                obj.getClass();
                return new xp(((Integer) obj).intValue());
            case 21:
                obj.getClass();
                return new c8(((Float) obj).floatValue());
            case 22:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new sp0(p30.b(intValue, num2.intValue()));
            case 23:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i3 = gc.g;
                Boolean bool3 = Boolean.FALSE;
                lw.i(obj12, bool3);
                gc gcVar = obj12 != null ? lw.i(obj12, Boolean.FALSE) ? new gc(gc.f) : new gc(lw.c(((Integer) obj12).intValue())) : null;
                gcVar.getClass();
                long j2 = gcVar.a;
                Object obj13 = list7.get(1);
                ci0 ci0Var = di0.x;
                lw.i(obj13, bool3);
                s60 s60Var = obj13 != null ? (s60) ci0Var.f.invoke(obj13) : null;
                s60Var.getClass();
                long j3 = s60Var.a;
                Object obj14 = list7.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                f.getClass();
                return new rk0(f.floatValue(), j2, j3);
            case 24:
                obj.getClass();
                return new yo0(((Integer) obj).intValue());
            case 25:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                str2.getClass();
                Object obj16 = list8.get(1);
                p2 p2Var = di0.i;
                if (!lw.i(obj16, Boolean.FALSE) && obj16 != null) {
                    pp0Var = (pp0) ((pq) p2Var.g).invoke(obj16);
                }
                return new wz(str2, pp0Var);
            case 26:
                obj.getClass();
                return new dp0(((Integer) obj).intValue());
            case 27:
                obj.getClass();
                return new qt(((Integer) obj).intValue());
            case 28:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList = new ArrayList(list9.size());
                int size = list9.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj17 = list9.get(i4);
                    o6 o6Var = (lw.i(obj17, Boolean.FALSE) || obj17 == null) ? null : (o6) ((pq) di0.b.g).invoke(obj17);
                    o6Var.getClass();
                    arrayList.add(o6Var);
                }
                return arrayList;
            default:
                obj.getClass();
                return new vp(((Integer) obj).intValue());
        }
    }
}
