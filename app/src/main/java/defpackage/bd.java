package defpackage;

import com.vivo.cnm.lico.BuildConfig;
import com.vivo.cnm.lico.DesktopEntry;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.GestureEnterFallback;
import com.vivo.cnm.lico.MainActivity;
import com.vivo.cnm.lico.PhoneLayoutHook;
import io.github.libxposed.api.XposedModule;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class bd implements tq {
    public final /* synthetic */ int e;

    public /* synthetic */ bd(int i) {
        this.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [t20] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [t20] */
    /* JADX WARN: Type inference failed for: r1v10, types: [t40] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [t40] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        cd cdVar;
        fs0 install$lambda$5;
        fs0 watchManagerConstant$lambda$4;
        fs0 watchStaticFlags$lambda$2;
        fs0 watchStaticFlags$lambda$3;
        fs0 install$lambda$13;
        fs0 installLayoutMenu$lambda$83;
        fs0 installUiScopes$lambda$25;
        fs0 installExitButtonRelocation$lambda$77;
        fs0 installLayoutMenu$lambda$112;
        fs0 install$lambda$20;
        int i = this.e;
        fs0 fs0Var = fs0.a;
        switch (i) {
            case 0:
                String str = (String) obj;
                rg rgVar = (rg) obj2;
                str.getClass();
                rgVar.getClass();
                if (str.length() == 0) {
                    return rgVar.toString();
                }
                return str + ", " + rgVar;
            case 1:
                StringBuilder sb = (StringBuilder) obj;
                s20 s20Var = (s20) obj2;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                sb.append(s20Var);
                return sb;
            case 2:
                se seVar = (se) obj;
                int intValue = ((Integer) obj2).intValue();
                gr grVar = (gr) seVar;
                if (!grVar.I(intValue & 1, (intValue & 3) != 2)) {
                    grVar.L();
                }
                return fs0Var;
            case 3:
                se seVar2 = (se) obj;
                int intValue2 = ((Integer) obj2).intValue();
                gr grVar2 = (gr) seVar2;
                if (!grVar2.I(intValue2 & 1, (intValue2 & 3) != 2)) {
                    grVar2.L();
                }
                return fs0Var;
            case 4:
                se seVar3 = (se) obj;
                int intValue3 = ((Integer) obj2).intValue();
                gr grVar3 = (gr) seVar3;
                if (!grVar3.I(intValue3 & 1, (intValue3 & 3) != 2)) {
                    grVar3.L();
                }
                return fs0Var;
            case Gates.MAX_WINDOWS /* 5 */:
                ((iy) ((le) obj)).U((u20) obj2);
                return fs0Var;
            case 6:
                ff ffVar = (ff) obj2;
                iy iyVar = (iy) ((le) obj);
                iyVar.D = ffVar;
                y50 y50Var = iyVar.H;
                ll llVar = kf.h;
                xa0 xa0Var = (xa0) ffVar;
                xa0Var.getClass();
                iyVar.R((si) kw.F(xa0Var, llVar));
                xa0 xa0Var2 = (xa0) ffVar;
                xx xxVar = (xx) kw.F(xa0Var2, kf.n);
                if (iyVar.B != xxVar) {
                    iyVar.B = xxVar;
                    iyVar.y();
                    iy n = iyVar.n();
                    if (n != null) {
                        n.w();
                    } else {
                        e3 e3Var = iyVar.r;
                        if (e3Var != null) {
                            e3Var.invalidate();
                        }
                    }
                    iyVar.x();
                    for (t20 t20Var = y50Var.f; t20Var != null; t20Var = t20Var.j) {
                        t20Var.Y();
                    }
                }
                iyVar.V((wt0) kw.F(xa0Var2, kf.t));
                t20 t20Var2 = y50Var.f;
                if ((t20Var2.h & 32768) != 0) {
                    while (t20Var2 != null) {
                        if ((t20Var2.g & 32768) != 0) {
                            oi oiVar = t20Var2;
                            ?? r1 = 0;
                            while (oiVar != 0) {
                                if (oiVar instanceof df) {
                                    t20 t20Var3 = ((t20) ((df) oiVar)).e;
                                    if (t20Var3.r) {
                                        e60.c(t20Var3);
                                    } else {
                                        t20Var3.n = true;
                                    }
                                } else if ((oiVar.g & 32768) != 0 && (oiVar instanceof oi)) {
                                    t20 t20Var4 = oiVar.t;
                                    int i2 = 0;
                                    oiVar = oiVar;
                                    r1 = r1;
                                    while (t20Var4 != null) {
                                        if ((t20Var4.g & 32768) != 0) {
                                            i2++;
                                            r1 = r1;
                                            if (i2 == 1) {
                                                oiVar = t20Var4;
                                            } else {
                                                if (r1 == 0) {
                                                    r1 = new t40(new t20[16]);
                                                }
                                                if (oiVar != 0) {
                                                    r1.b(oiVar);
                                                    oiVar = 0;
                                                }
                                                r1.b(t20Var4);
                                            }
                                        }
                                        t20Var4 = t20Var4.j;
                                        oiVar = oiVar;
                                        r1 = r1;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                oiVar = nh.N(r1);
                            }
                        }
                        if ((t20Var2.h & 32768) != 0) {
                            t20Var2 = t20Var2.j;
                        }
                    }
                }
                return fs0Var;
            case 7:
                b20 b20Var = (b20) obj2;
                iy iyVar2 = (iy) ((le) obj);
                if (!lw.i(iyVar2.z, b20Var)) {
                    iyVar2.z = b20Var;
                    iyVar2.y();
                }
                return fs0Var;
            case MainActivity.$stable /* 8 */:
                ((Integer) obj2).getClass();
                ((iy) ((le) obj)).getClass();
                return fs0Var;
            case 9:
                tg tgVar = (tg) obj;
                rg rgVar2 = (rg) obj2;
                tgVar.getClass();
                rgVar2.getClass();
                tg q = tgVar.q(rgVar2.getKey());
                sm smVar = sm.e;
                if (q == smVar) {
                    return rgVar2;
                }
                b2 b2Var = b2.D;
                vg vgVar = (vg) q.j(b2Var);
                if (vgVar == null) {
                    cdVar = new cd(rgVar2, q);
                } else {
                    tg q2 = q.q(b2Var);
                    if (q2 == smVar) {
                        return new cd(vgVar, rgVar2);
                    }
                    cdVar = new cd(vgVar, new cd(rgVar2, q2));
                }
                return cdVar;
            case 10:
                return ((tg) obj).g((rg) obj2);
            case 11:
                return ((tg) obj).g((rg) obj2);
            case 12:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 13:
                install$lambda$5 = DesktopEntry.install$lambda$5((XposedModule) obj, (Class) obj2);
                return install$lambda$5;
            case 14:
                return Boolean.valueOf(lw.i(obj, obj2));
            case 15:
                watchManagerConstant$lambda$4 = Gates.watchManagerConstant$lambda$4((XposedModule) obj, (Class) obj2);
                return watchManagerConstant$lambda$4;
            case 16:
                watchStaticFlags$lambda$2 = Gates.watchStaticFlags$lambda$2((XposedModule) obj, (Class) obj2);
                return watchStaticFlags$lambda$2;
            case BuildConfig.VERSION_CODE /* 17 */:
                watchStaticFlags$lambda$3 = Gates.watchStaticFlags$lambda$3((XposedModule) obj, (Class) obj2);
                return watchStaticFlags$lambda$3;
            case 18:
                install$lambda$13 = GestureEnterFallback.install$lambda$13((XposedModule) obj, (Class) obj2);
                return install$lambda$13;
            case 19:
                installLayoutMenu$lambda$83 = PhoneLayoutHook.installLayoutMenu$lambda$83((XposedModule) obj, (Class) obj2);
                return installLayoutMenu$lambda$83;
            case 20:
                installUiScopes$lambda$25 = PhoneLayoutHook.installUiScopes$lambda$25((XposedModule) obj, (Class) obj2);
                return installUiScopes$lambda$25;
            case 21:
                installExitButtonRelocation$lambda$77 = PhoneLayoutHook.installExitButtonRelocation$lambda$77((XposedModule) obj, (Class) obj2);
                return installExitButtonRelocation$lambda$77;
            case 22:
                installLayoutMenu$lambda$112 = PhoneLayoutHook.installLayoutMenu$lambda$112((XposedModule) obj, (Class) obj2);
                return installLayoutMenu$lambda$112;
            case 23:
                install$lambda$20 = PhoneLayoutHook.install$lambda$20((XposedModule) obj, (Class) obj2);
                return install$lambda$20;
            case 24:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 25:
                p6 p6Var = (p6) obj2;
                return kw.e(p6Var.f, di0.a(p6Var.e, di0.a, (gh0) obj));
            case 26:
                return Integer.valueOf(((bp0) obj2).a);
            case 27:
                fp0 fp0Var = (fp0) obj2;
                return kw.e(Float.valueOf(fp0Var.a), Float.valueOf(fp0Var.b));
            case 28:
                gh0 gh0Var = (gh0) obj;
                gp0 gp0Var = (gp0) obj2;
                bq0 bq0Var = new bq0(gp0Var.a);
                ci0 ci0Var = di0.v;
                return kw.e(di0.a(bq0Var, ci0Var, gh0Var), di0.a(new bq0(gp0Var.b), ci0Var, gh0Var));
            default:
                return Integer.valueOf(((xp) obj2).e);
        }
    }
}
