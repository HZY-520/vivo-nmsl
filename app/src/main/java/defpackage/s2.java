package defpackage;

import android.content.Context;
import com.vivo.cnm.lico.DesktopEntry;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;
import com.vivo.cnm.lico.ui.HomeScreenKt;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class s2 implements eq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s2(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [t20] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [t20] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [t40] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [t40] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.eq
    public final Object b() {
        uj0 uj0Var;
        iy iyVar;
        fs0 enter$lambda$27;
        fs0 ShortcutCard$lambda$21$lambda$20$lambda$19$lambda$18;
        int i = this.e;
        fs0 fs0Var = fs0.a;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                break;
            case 1:
                qi0 qi0Var = (qi0) obj2;
                k3 k3Var = (k3) obj;
                ki0 ki0Var = qi0Var.i;
                ki0 ki0Var2 = qi0Var.j;
                Float f = qi0Var.g;
                Float f2 = qi0Var.h;
                float floatValue = (ki0Var == null || f == null) ? 0.0f : ((Number) ki0Var.a.b()).floatValue() - f.floatValue();
                float floatValue2 = (ki0Var2 == null || f2 == null) ? 0.0f : ((Number) ki0Var2.a.b()).floatValue() - f2.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    int s = k3Var.s(qi0Var.e);
                    wj0 wj0Var = (wj0) k3Var.k().b(k3Var.o);
                    if (wj0Var != null) {
                        try {
                            i1 i1Var = k3Var.q;
                            if (i1Var != null) {
                                i1Var.a.setBoundsInScreen(k3Var.c(wj0Var));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    wj0 wj0Var2 = (wj0) k3Var.k().b(k3Var.p);
                    if (wj0Var2 != null) {
                        try {
                            i1 i1Var2 = k3Var.r;
                            if (i1Var2 != null) {
                                i1Var2.a.setBoundsInScreen(k3Var.c(wj0Var2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    k3Var.h.invalidate();
                    wj0 wj0Var3 = (wj0) k3Var.k().b(s);
                    if (wj0Var3 != null && (uj0Var = wj0Var3.a) != null && (iyVar = uj0Var.c) != null) {
                        if (ki0Var != null) {
                            k3Var.t.h(s, ki0Var);
                        }
                        if (ki0Var2 != null) {
                            k3Var.u.h(s, ki0Var2);
                        }
                        k3Var.o(iyVar);
                    }
                }
                if (ki0Var != null) {
                    qi0Var.g = (Float) ki0Var.a.b();
                }
                if (ki0Var2 != null) {
                    qi0Var.h = (Float) ki0Var2.a.b();
                    break;
                }
                break;
            case 2:
                ((va) obj2).p((gc) obj);
                break;
            case 3:
                z7 z7Var = (z7) obj2;
                ky kyVar = (ky) obj;
                z7Var.y = z7Var.t.a(kyVar.e.u(), kyVar.getLayoutDirection(), kyVar);
                break;
            case 4:
                eq eqVar = (eq) obj2;
                d60 d60Var = (d60) obj;
                if (eqVar != null && (r15 = (oe0) eqVar.b()) != null) {
                    break;
                } else {
                    if (!d60Var.A0().r) {
                        d60Var = null;
                    }
                    if (d60Var != null) {
                        break;
                    }
                }
                break;
            case Gates.MAX_WINDOWS /* 5 */:
                enter$lambda$27 = DesktopEntry.enter$lambda$27((Context) obj2, (ClassLoader) obj);
                break;
            case 6:
                ((ve0) obj2).e = ((yo) obj).q0();
                break;
            case 7:
                ((ve0) obj2).e = q3.o((bp) obj, cc0.a);
                break;
            case MainActivity.$stable /* 8 */:
                ((ys) obj2).d((t20) obj);
                break;
            case 9:
                ShortcutCard$lambda$21$lambda$20$lambda$19$lambda$18 = HomeScreenKt.ShortcutCard$lambda$21$lambda$20$lambda$19$lambda$18((vs) obj2, (eq) obj);
                break;
            case 10:
                ve0 ve0Var = (ve0) obj;
                y50 y50Var = ((iy) obj2).H;
                if ((y50Var.f.h & 8) != 0) {
                    for (t20 t20Var = y50Var.e; t20Var != null; t20Var = t20Var.i) {
                        if ((t20Var.g & 8) != 0) {
                            oi oiVar = t20Var;
                            ?? r6 = 0;
                            while (oiVar != 0) {
                                if (oiVar instanceof sj0) {
                                    sj0 sj0Var = (sj0) oiVar;
                                    if (sj0Var.Q()) {
                                        qj0 qj0Var = new qj0();
                                        ve0Var.e = qj0Var;
                                        qj0Var.h = true;
                                    }
                                    if (sj0Var.R()) {
                                        ((qj0) ve0Var.e).g = true;
                                    }
                                    sj0Var.O((bk0) ve0Var.e);
                                } else if ((oiVar.g & 8) != 0 && (oiVar instanceof oi)) {
                                    t20 t20Var2 = oiVar.t;
                                    int i2 = 0;
                                    oiVar = oiVar;
                                    r6 = r6;
                                    while (t20Var2 != null) {
                                        if ((t20Var2.g & 8) != 0) {
                                            i2++;
                                            r6 = r6;
                                            if (i2 == 1) {
                                                oiVar = t20Var2;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new t40(new t20[16]);
                                                }
                                                if (oiVar != 0) {
                                                    r6.b(oiVar);
                                                    oiVar = 0;
                                                }
                                                r6.b(t20Var2);
                                            }
                                        }
                                        t20Var2 = t20Var2.j;
                                        oiVar = oiVar;
                                        r6 = r6;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                oiVar = nh.N(r6);
                            }
                        }
                    }
                    break;
                }
                break;
            case 11:
                ee0 ee0Var = (ee0) obj;
                if (((q7) ((v6) obj2).a).get() == 0) {
                    ee0Var.b();
                    break;
                }
                break;
            default:
                l40 l40Var = (l40) obj2;
                cf cfVar = (cf) obj;
                Object[] objArr = l40Var.b;
                long[] jArr = l40Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j) < 128) {
                                    cfVar.u(objArr[(i3 << 3) + i5]);
                                }
                                j >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                break;
        }
        return fs0Var;
    }
}
