package defpackage;

import android.content.res.Resources;
import com.vivo.cnm.lico.BuildConfig;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class zh0 implements pq {
    public final /* synthetic */ int e;

    public /* synthetic */ zh0(int i) {
        this.e = i;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        o6 o6Var;
        rp0 rp0Var;
        int i;
        int i2;
        long j;
        int i3 = this.e;
        fs0 fs0Var = fs0.a;
        switch (i3) {
            case 0:
                obj.getClass();
                break;
            case 1:
                Boolean bool = Boolean.FALSE;
                if (lw.i(obj, bool)) {
                    break;
                } else {
                    obj.getClass();
                    List list = (List) obj;
                    Object obj2 = list.get(0);
                    Float f = obj2 != null ? (Float) obj2 : null;
                    f.getClass();
                    float floatValue = f.floatValue();
                    Object obj3 = list.get(1);
                    ci0 ci0Var = di0.w;
                    lw.i(obj3, bool);
                    cq0 cq0Var = obj3 != null ? (cq0) ci0Var.f.invoke(obj3) : null;
                    cq0Var.getClass();
                    break;
                }
            case 2:
                if (lw.i(obj, 0)) {
                    break;
                } else if (lw.i(obj, 1)) {
                    break;
                } else {
                    break;
                }
            case 3:
                if (lw.i(obj, Boolean.FALSE)) {
                    break;
                } else {
                    obj.getClass();
                    List list2 = (List) obj;
                    Object obj4 = list2.get(0);
                    Float f2 = obj4 != null ? (Float) obj4 : null;
                    f2.getClass();
                    float floatValue2 = f2.floatValue();
                    Object obj5 = list2.get(1);
                    (obj5 != null ? (Float) obj5 : null).getClass();
                    break;
                }
            case 4:
                obj.getClass();
                List list3 = (List) obj;
                ArrayList arrayList = new ArrayList(list3.size());
                int size = list3.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj6 = list3.get(i4);
                    g00 g00Var = (lw.i(obj6, Boolean.FALSE) || obj6 == null) ? null : (g00) ((pq) di0.z.g).invoke(obj6);
                    g00Var.getClass();
                    arrayList.add(g00Var);
                }
                break;
            case Gates.MAX_WINDOWS /* 5 */:
                obj.getClass();
                String str = (String) obj;
                Locale forLanguageTag = Locale.forLanguageTag(str);
                if (lw.i(forLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                break;
            case 6:
                obj.getClass();
                List list4 = (List) obj;
                Object obj7 = list4.get(0);
                String str2 = obj7 != null ? (String) obj7 : null;
                str2.getClass();
                Object obj8 = list4.get(1);
                break;
            case 7:
                obj.getClass();
                List list5 = (List) obj;
                Object obj9 = list5.get(0);
                float f3 = oz.b;
                ci0 ci0Var2 = di0.B;
                Boolean bool2 = Boolean.FALSE;
                lw.i(obj9, bool2);
                oz ozVar = obj9 != null ? (oz) ci0Var2.f.invoke(obj9) : null;
                ozVar.getClass();
                float f4 = ozVar.a;
                Object obj10 = list5.get(1);
                ci0 ci0Var3 = di0.C;
                lw.i(obj10, bool2);
                qz qzVar = obj10 != null ? (qz) ci0Var3.f.invoke(obj10) : null;
                qzVar.getClass();
                int i5 = qzVar.a;
                Object obj11 = list5.get(2);
                ci0 ci0Var4 = di0.D;
                lw.i(obj11, bool2);
                pz pzVar = obj11 != null ? (pz) ci0Var4.f.invoke(obj11) : null;
                pzVar.getClass();
                break;
            case MainActivity.$stable /* 8 */:
                obj.getClass();
                float floatValue3 = ((Float) obj).floatValue();
                oz.a(floatValue3);
                break;
            case 9:
                obj.getClass();
                break;
            case 10:
                obj.getClass();
                List list6 = (List) obj;
                Object obj12 = list6.get(0);
                r6 r6Var = obj12 != null ? (r6) obj12 : null;
                r6Var.getClass();
                Object obj13 = list6.get(2);
                Integer num = obj13 != null ? (Integer) obj13 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj14 = list6.get(3);
                Integer num2 = obj14 != null ? (Integer) obj14 : null;
                num2.getClass();
                int intValue2 = num2.intValue();
                Object obj15 = list6.get(4);
                String str3 = obj15 != null ? (String) obj15 : null;
                str3.getClass();
                switch (r6Var.ordinal()) {
                    case 0:
                        Object obj16 = list6.get(1);
                        q90 q90Var = (lw.i(obj16, Boolean.FALSE) || obj16 == null) ? null : (q90) ((pq) di0.g.g).invoke(obj16);
                        q90Var.getClass();
                        o6Var = new o6(q90Var, intValue, intValue2, str3);
                        break;
                    case 1:
                        Object obj17 = list6.get(1);
                        om0 om0Var = (lw.i(obj17, Boolean.FALSE) || obj17 == null) ? null : (om0) ((pq) di0.h.g).invoke(obj17);
                        om0Var.getClass();
                        o6Var = new o6(om0Var, intValue, intValue2, str3);
                        break;
                    case 2:
                        Object obj18 = list6.get(1);
                        it0 it0Var = (lw.i(obj18, Boolean.FALSE) || obj18 == null) ? null : (it0) ((pq) di0.c.g).invoke(obj18);
                        it0Var.getClass();
                        o6Var = new o6(it0Var, intValue, intValue2, str3);
                        break;
                    case 3:
                        Object obj19 = list6.get(1);
                        ps0 ps0Var = (lw.i(obj19, Boolean.FALSE) || obj19 == null) ? null : (ps0) ((pq) di0.d.g).invoke(obj19);
                        ps0Var.getClass();
                        o6Var = new o6(ps0Var, intValue, intValue2, str3);
                        break;
                    case 4:
                        Object obj20 = list6.get(1);
                        wz wzVar = (lw.i(obj20, Boolean.FALSE) || obj20 == null) ? null : (wz) ((pq) di0.e.g).invoke(obj20);
                        wzVar.getClass();
                        o6Var = new o6(wzVar, intValue, intValue2, str3);
                        break;
                    case Gates.MAX_WINDOWS /* 5 */:
                        Object obj21 = list6.get(1);
                        vz vzVar = (lw.i(obj21, Boolean.FALSE) || obj21 == null) ? null : (vz) ((pq) di0.f.g).invoke(obj21);
                        vzVar.getClass();
                        o6Var = new o6(vzVar, intValue, intValue2, str3);
                        break;
                    case 6:
                        Object obj22 = list6.get(1);
                        String str4 = obj22 != null ? (String) obj22 : null;
                        str4.getClass();
                        o6Var = new o6(new kn0(str4), intValue, intValue2, str3);
                        break;
                    default:
                        z6.j();
                        break;
                }
                break;
            case 11:
                obj.getClass();
                break;
            case 12:
                String str5 = obj != null ? (String) obj : null;
                str5.getClass();
                break;
            case 13:
                String str6 = obj != null ? (String) obj : null;
                str6.getClass();
                break;
            case 14:
                obj.getClass();
                List list7 = (List) obj;
                Object obj23 = list7.get(0);
                ci0 ci0Var5 = di0.q;
                Boolean bool3 = Boolean.FALSE;
                lw.i(obj23, bool3);
                yo0 yo0Var = obj23 != null ? (yo0) ci0Var5.f.invoke(obj23) : null;
                yo0Var.getClass();
                int i6 = yo0Var.a;
                Object obj24 = list7.get(1);
                ci0 ci0Var6 = di0.r;
                lw.i(obj24, bool3);
                dp0 dp0Var = obj24 != null ? (dp0) ci0Var6.f.invoke(obj24) : null;
                dp0Var.getClass();
                int i7 = dp0Var.a;
                Object obj25 = list7.get(2);
                cq0[] cq0VarArr = bq0.b;
                ci0 ci0Var7 = di0.v;
                lw.i(obj25, bool3);
                bq0 bq0Var = obj25 != null ? (bq0) ci0Var7.f.invoke(obj25) : null;
                bq0Var.getClass();
                long j2 = bq0Var.a;
                Object obj26 = list7.get(3);
                gp0 gp0Var = gp0.c;
                gp0 gp0Var2 = (lw.i(obj26, bool3) || obj26 == null) ? null : (gp0) ((pq) di0.l.g).invoke(obj26);
                Object obj27 = list7.get(4);
                nc0 nc0Var = (lw.i(obj27, bool3) || obj27 == null) ? null : (nc0) ((pq) dx0.u.g).invoke(obj27);
                Object obj28 = list7.get(5);
                rz rzVar = rz.d;
                rz rzVar2 = (lw.i(obj28, bool3) || obj28 == null) ? null : (rz) ((pq) di0.A.g).invoke(obj28);
                Object obj29 = list7.get(6);
                mz mzVar = (lw.i(obj29, bool3) || obj29 == null) ? null : (mz) ((pq) dx0.w.g).invoke(obj29);
                mzVar.getClass();
                int i8 = mzVar.a;
                Object obj30 = list7.get(7);
                ci0 ci0Var8 = di0.s;
                lw.i(obj30, bool3);
                qt qtVar = obj30 != null ? (qt) ci0Var8.f.invoke(obj30) : null;
                qtVar.getClass();
                int i9 = qtVar.a;
                Object obj31 = list7.get(8);
                p2 p2Var = dx0.x;
                if (lw.i(obj31, bool3) || obj31 == null) {
                    i = i8;
                    i2 = i9;
                    j = j2;
                    rp0Var = null;
                } else {
                    rp0Var = (rp0) ((pq) p2Var.g).invoke(obj31);
                    i = i8;
                    i2 = i9;
                    j = j2;
                }
                break;
            case 15:
                obj.getClass();
                List list8 = (List) obj;
                Object obj32 = list8.get(0);
                int i10 = gc.g;
                Boolean bool4 = Boolean.FALSE;
                lw.i(obj32, bool4);
                gc gcVar = obj32 != null ? lw.i(obj32, Boolean.FALSE) ? new gc(gc.f) : new gc(lw.c(((Integer) obj32).intValue())) : null;
                gcVar.getClass();
                long j3 = gcVar.a;
                Object obj33 = list8.get(1);
                cq0[] cq0VarArr2 = bq0.b;
                pq pqVar = di0.v.f;
                lw.i(obj33, bool4);
                bq0 bq0Var2 = obj33 != null ? (bq0) pqVar.invoke(obj33) : null;
                bq0Var2.getClass();
                long j4 = bq0Var2.a;
                Object obj34 = list8.get(2);
                xp xpVar = xp.f;
                xp xpVar2 = (lw.i(obj34, bool4) || obj34 == null) ? null : (xp) ((pq) di0.m.g).invoke(obj34);
                Object obj35 = list8.get(3);
                vp vpVar = (lw.i(obj35, bool4) || obj35 == null) ? null : (vp) ((pq) di0.t.g).invoke(obj35);
                Object obj36 = list8.get(4);
                wp wpVar = (lw.i(obj36, bool4) || obj36 == null) ? null : (wp) ((pq) di0.u.g).invoke(obj36);
                Object obj37 = list8.get(6);
                String str7 = obj37 != null ? (String) obj37 : null;
                Object obj38 = list8.get(7);
                lw.i(obj38, bool4);
                bq0 bq0Var3 = obj38 != null ? (bq0) pqVar.invoke(obj38) : null;
                bq0Var3.getClass();
                long j5 = bq0Var3.a;
                Object obj39 = list8.get(8);
                c8 c8Var = (lw.i(obj39, bool4) || obj39 == null) ? null : (c8) ((pq) di0.n.g).invoke(obj39);
                Object obj40 = list8.get(9);
                fp0 fp0Var = (lw.i(obj40, bool4) || obj40 == null) ? null : (fp0) ((pq) di0.k.g).invoke(obj40);
                Object obj41 = list8.get(10);
                h00 h00Var = h00.g;
                h00 h00Var2 = (lw.i(obj41, bool4) || obj41 == null) ? null : (h00) ((pq) di0.y.g).invoke(obj41);
                Object obj42 = list8.get(11);
                lw.i(obj42, bool4);
                gc gcVar2 = obj42 != null ? lw.i(obj42, Boolean.FALSE) ? new gc(gc.f) : new gc(lw.c(((Integer) obj42).intValue())) : null;
                gcVar2.getClass();
                long j6 = gcVar2.a;
                Object obj43 = list8.get(12);
                bp0 bp0Var = (lw.i(obj43, bool4) || obj43 == null) ? null : (bp0) ((pq) di0.j.g).invoke(obj43);
                Object obj44 = list8.get(13);
                rk0 rk0Var = rk0.d;
                break;
            case 16:
                obj.getClass();
                List list9 = (List) obj;
                Object obj45 = list9.get(0);
                Boolean bool5 = obj45 != null ? (Boolean) obj45 : null;
                bool5.getClass();
                boolean booleanValue = bool5.booleanValue();
                Object obj46 = list9.get(1);
                om omVar = (lw.i(obj46, Boolean.FALSE) || obj46 == null) ? null : (om) ((pq) dx0.v.g).invoke(obj46);
                omVar.getClass();
                break;
            case BuildConfig.VERSION_CODE /* 17 */:
                obj.getClass();
                break;
            case 18:
                obj.getClass();
                break;
            case 19:
                obj.getClass();
                List list10 = (List) obj;
                Object obj47 = list10.get(0);
                qp0 qp0Var = (lw.i(obj47, Boolean.FALSE) || obj47 == null) ? null : (qp0) ((pq) dx0.y.g).invoke(obj47);
                qp0Var.getClass();
                int i11 = qp0Var.a;
                Object obj48 = list10.get(1);
                Boolean bool6 = obj48 != null ? (Boolean) obj48 : null;
                bool6.getClass();
                break;
            case 20:
                obj.getClass();
                break;
            case 21:
                break;
            case 22:
                bw bwVar = ((ni0) obj).c;
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                jx[] jxVarArr = zj0.a;
                ak0 ak0Var = yj0.m;
                jx jxVar = zj0.a[5];
                Boolean bool7 = Boolean.TRUE;
                ak0Var.getClass();
                ((bk0) obj).a(ak0Var, bool7);
                break;
            case 27:
                Resources resources = (Resources) obj;
                resources.getClass();
                break;
            case 28:
                break;
            default:
                break;
        }
        return fs0Var;
    }
}
