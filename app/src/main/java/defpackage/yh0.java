package defpackage;

import com.vivo.cnm.lico.BuildConfig;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class yh0 implements tq {
    public final /* synthetic */ int e;

    public /* synthetic */ yh0(int i) {
        this.e = i;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        r6 r6Var;
        Object a;
        switch (this.e) {
            case 0:
                wz wzVar = (wz) obj2;
                return kw.e(wzVar.a, di0.a(wzVar.b, di0.i, (gh0) obj));
            case 1:
                return Float.valueOf(((c8) obj2).a);
            case 2:
                gh0 gh0Var = (gh0) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(di0.a((o6) list.get(i), di0.b, gh0Var));
                }
                return arrayList;
            case 3:
                sp0 sp0Var = (sp0) obj2;
                return kw.e(Integer.valueOf((int) (sp0Var.a >> 32)), Integer.valueOf((int) (sp0Var.a & 4294967295L)));
            case 4:
                gh0 gh0Var2 = (gh0) obj;
                rk0 rk0Var = (rk0) obj2;
                return kw.e(di0.a(new gc(rk0Var.a), di0.p, gh0Var2), di0.a(new s60(rk0Var.b), di0.x, gh0Var2), Float.valueOf(rk0Var.c));
            case Gates.MAX_WINDOWS /* 5 */:
                return Integer.valueOf(((yo0) obj2).a);
            case 6:
                return Integer.valueOf(((dp0) obj2).a);
            case 7:
                return Integer.valueOf(((qt) obj2).a);
            case MainActivity.$stable /* 8 */:
                return Integer.valueOf(((vp) obj2).a);
            case 9:
                return Integer.valueOf(((wp) obj2).a);
            case 10:
                bq0 bq0Var = (bq0) obj2;
                return bq0Var != null ? bq0.a(bq0Var.a, bq0.c) : false ? Boolean.FALSE : kw.e(Float.valueOf(bq0.c(bq0Var.a)), di0.a(new cq0(bq0.b(bq0Var.a)), di0.w, (gh0) obj));
            case 11:
                vz vzVar = (vz) obj2;
                return kw.e(vzVar.a, di0.a(vzVar.b, di0.i, (gh0) obj));
            case 12:
                long j = ((cq0) obj2).a;
                if (cq0.a(j, 8589934592L)) {
                    return 0;
                }
                if (cq0.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 13:
                s60 s60Var = (s60) obj2;
                return s60Var != null ? s60.b(s60Var.a, 9205357640488583168L) : false ? Boolean.FALSE : kw.e(Float.valueOf(Float.intBitsToFloat((int) (s60Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (s60Var.a & 4294967295L))));
            case 14:
                gh0 gh0Var3 = (gh0) obj;
                o6 o6Var = (o6) obj2;
                Object obj3 = o6Var.a;
                if (obj3 instanceof q90) {
                    r6Var = r6.e;
                } else if (obj3 instanceof om0) {
                    r6Var = r6.f;
                } else if (obj3 instanceof it0) {
                    r6Var = r6.g;
                } else if (obj3 instanceof ps0) {
                    r6Var = r6.h;
                } else if (obj3 instanceof wz) {
                    r6Var = r6.i;
                } else if (obj3 instanceof vz) {
                    r6Var = r6.j;
                } else {
                    if (!(obj3 instanceof kn0)) {
                        throw new UnsupportedOperationException();
                    }
                    r6Var = r6.k;
                }
                switch (r6Var.ordinal()) {
                    case 0:
                        obj3.getClass();
                        a = di0.a((q90) obj3, di0.g, gh0Var3);
                        break;
                    case 1:
                        obj3.getClass();
                        a = di0.a((om0) obj3, di0.h, gh0Var3);
                        break;
                    case 2:
                        obj3.getClass();
                        a = di0.a((it0) obj3, di0.c, gh0Var3);
                        break;
                    case 3:
                        obj3.getClass();
                        a = di0.a((ps0) obj3, di0.d, gh0Var3);
                        break;
                    case 4:
                        obj3.getClass();
                        a = di0.a((wz) obj3, di0.e, gh0Var3);
                        break;
                    case Gates.MAX_WINDOWS /* 5 */:
                        obj3.getClass();
                        a = di0.a((vz) obj3, di0.f, gh0Var3);
                        break;
                    case 6:
                        obj3.getClass();
                        a = ((kn0) obj3).a;
                        break;
                    default:
                        z6.j();
                        return null;
                }
                return kw.e(r6Var, a, Integer.valueOf(o6Var.b), Integer.valueOf(o6Var.c), o6Var.d);
            case 15:
                gh0 gh0Var4 = (gh0) obj;
                List list2 = ((h00) obj2).e;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(di0.a((g00) list2.get(i2), di0.z, gh0Var4));
                }
                return arrayList2;
            case 16:
                return ((g00) obj2).a.toLanguageTag();
            case BuildConfig.VERSION_CODE /* 17 */:
                gh0 gh0Var5 = (gh0) obj;
                rz rzVar = (rz) obj2;
                return kw.e(di0.a(new oz(rzVar.a), di0.B, gh0Var5), di0.a(new qz(rzVar.b), di0.C, gh0Var5), di0.a(new pz(rzVar.c), di0.D, gh0Var5));
            case 18:
                return Float.valueOf(((oz) obj2).a);
            case 19:
                return Integer.valueOf(((qz) obj2).a);
            case 20:
                return Integer.valueOf(((pz) obj2).a);
            case 21:
                return ((it0) obj2).a;
            case 22:
                gh0 gh0Var6 = (gh0) obj;
                q90 q90Var = (q90) obj2;
                Object a2 = di0.a(new yo0(q90Var.a), di0.q, gh0Var6);
                Object a3 = di0.a(new dp0(q90Var.b), di0.r, gh0Var6);
                Object a4 = di0.a(new bq0(q90Var.c), di0.v, gh0Var6);
                gp0 gp0Var = q90Var.d;
                gp0 gp0Var2 = gp0.c;
                Object a5 = di0.a(gp0Var, di0.l, gh0Var6);
                Object a6 = di0.a(q90Var.e, dx0.u, gh0Var6);
                rz rzVar2 = q90Var.f;
                rz rzVar3 = rz.d;
                return kw.e(a2, a3, a4, a5, a6, di0.a(rzVar2, di0.A, gh0Var6), di0.a(new mz(q90Var.g), dx0.w, gh0Var6), di0.a(new qt(q90Var.h), di0.s, gh0Var6), di0.a(q90Var.i, dx0.x, gh0Var6));
            case 23:
                return ((ps0) obj2).a;
            case 24:
                gh0 gh0Var7 = (gh0) obj;
                om0 om0Var = (om0) obj2;
                gc gcVar = new gc(om0Var.a.b());
                ci0 ci0Var = di0.p;
                Object a7 = di0.a(gcVar, ci0Var, gh0Var7);
                bq0 bq0Var2 = new bq0(om0Var.b);
                ci0 ci0Var2 = di0.v;
                Object a8 = di0.a(bq0Var2, ci0Var2, gh0Var7);
                xp xpVar = om0Var.c;
                xp xpVar2 = xp.f;
                Object a9 = di0.a(xpVar, di0.m, gh0Var7);
                Object a10 = di0.a(om0Var.d, di0.t, gh0Var7);
                Object a11 = di0.a(om0Var.e, di0.u, gh0Var7);
                String str = om0Var.g;
                Object a12 = di0.a(new bq0(om0Var.h), ci0Var2, gh0Var7);
                Object a13 = di0.a(om0Var.i, di0.n, gh0Var7);
                Object a14 = di0.a(om0Var.j, di0.k, gh0Var7);
                h00 h00Var = om0Var.k;
                h00 h00Var2 = h00.g;
                Object a15 = di0.a(h00Var, di0.y, gh0Var7);
                Object a16 = di0.a(new gc(om0Var.l), ci0Var, gh0Var7);
                Object a17 = di0.a(om0Var.m, di0.j, gh0Var7);
                rk0 rk0Var2 = om0Var.n;
                rk0 rk0Var3 = rk0.d;
                return kw.e(a7, a8, a9, a10, a11, -1, str, a12, a13, a14, a15, a16, a17, di0.a(rk0Var2, di0.o, gh0Var7));
            case 25:
                gh0 gh0Var8 = (gh0) obj;
                pp0 pp0Var = (pp0) obj2;
                om0 om0Var2 = pp0Var.a;
                p2 p2Var = di0.h;
                return kw.e(di0.a(om0Var2, p2Var, gh0Var8), di0.a(pp0Var.b, p2Var, gh0Var8), di0.a(pp0Var.c, p2Var, gh0Var8), di0.a(pp0Var.d, p2Var, gh0Var8));
            case 26:
                nc0 nc0Var = (nc0) obj2;
                Boolean valueOf = Boolean.valueOf(nc0Var.a);
                p2 p2Var2 = di0.a;
                return kw.e(valueOf, di0.a(new om(nc0Var.b), dx0.v, (gh0) obj));
            case 27:
                return Integer.valueOf(((om) obj2).a);
            case 28:
                return Integer.valueOf(((mz) obj2).a);
            default:
                rp0 rp0Var = (rp0) obj2;
                return kw.e(di0.a(new qp0(rp0Var.a), dx0.y, (gh0) obj), Boolean.valueOf(rp0Var.b));
        }
    }
}
