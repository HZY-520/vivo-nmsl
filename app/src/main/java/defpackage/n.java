package defpackage;

import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;
import com.vivo.cnm.lico.PhoneLayoutHook;
import io.github.libxposed.api.XposedModule;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class n implements tq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n(int i, int i2, Object obj) {
        this.e = i2;
        this.f = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
    
        if (r5 == null) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ac  */
    @Override // defpackage.tq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        fs0 installUiScopes$lambda$30;
        Collection g0;
        Object obj3 = null;
        switch (this.e) {
            case 0:
                p pVar = (p) this.f;
                se seVar = (se) obj;
                int intValue = ((Integer) obj2).intValue();
                gr grVar = (gr) seVar;
                if (grVar.I(intValue & 1, (intValue & 3) != 2)) {
                    pVar.a(grVar, 0);
                } else {
                    grVar.L();
                }
                return fs0.a;
            case 1:
                ej0 ej0Var = (ej0) this.f;
                q3.A(ej0Var.c0(), null, new j0(ej0Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 2:
                ((Integer) obj2).getClass();
                t8.a((u20) this.f, (se) obj, v10.q(1));
                return fs0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((me) this.f).a((se) obj, v10.q(1));
                return fs0.a;
            case 4:
                se seVar2 = (se) this.f;
                u20 u20Var = (u20) obj;
                u20 u20Var2 = (s20) obj2;
                if (u20Var2 instanceof qe) {
                    sb sbVar = ((qe) u20Var2).a;
                    lr0.e(3, sbVar);
                    u20Var2 = dx0.y(seVar2, (u20) sbVar.c(r20.a, seVar2, 0));
                }
                return u20Var.c(u20Var2);
            case Gates.MAX_WINDOWS /* 5 */:
                bf0 bf0Var = (bf0) this.f;
                ((Integer) obj).getClass();
                if (obj2 instanceof iy) {
                    iy iyVar = (iy) obj2;
                    l40 l40Var = bf0Var.g;
                    if (l40Var == null) {
                        int i = hi0.a;
                        l40Var = new l40();
                        bf0Var.g = l40Var;
                    }
                    l40Var.j(iyVar);
                    bf0Var.e.b(iyVar);
                }
                if (obj2 instanceof lr) {
                    bf0Var.d((lr) obj2);
                }
                if (obj2 instanceof de0) {
                    ((de0) obj2).c();
                }
                return fs0.a;
            case 6:
                se seVar3 = (se) obj;
                int intValue2 = ((Integer) obj2).intValue();
                gr grVar2 = (gr) seVar3;
                if (grVar2.I(intValue2 & 1, (intValue2 & 3) != 2)) {
                    throw null;
                }
                grVar2.L();
                return fs0.a;
            case 7:
                installUiScopes$lambda$30 = PhoneLayoutHook.installUiScopes$lambda$30((Method) this.f, (XposedModule) obj, (Class) obj2);
                return installUiScopes$lambda$30;
            case MainActivity.$stable /* 8 */:
                le0 le0Var = (le0) this.f;
                Set set = (Set) obj;
                synchronized (le0Var.c) {
                    try {
                        if (((ge0) le0Var.u.getValue()).compareTo(ge0.i) >= 0) {
                            l40 l40Var2 = le0Var.h;
                            if (set instanceof ii0) {
                                l40 l40Var3 = ((ii0) set).e;
                                Object[] objArr = l40Var3.b;
                                long[] jArr = l40Var3.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i2 = 0;
                                    while (true) {
                                        long j = jArr[i2];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                                            for (int i4 = 0; i4 < i3; i4++) {
                                                if ((255 & j) < 128) {
                                                    Object obj4 = objArr[(i2 << 3) + i4];
                                                    if (!(obj4 instanceof hn0) || ((hn0) obj4).e(1)) {
                                                        l40Var2.a(obj4);
                                                    }
                                                }
                                                j >>= 8;
                                            }
                                            if (i3 != 8) {
                                            }
                                        }
                                        if (i2 != length) {
                                            i2++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set) {
                                    if (!(obj5 instanceof hn0) || ((hn0) obj5).e(1)) {
                                        l40Var2.a(obj5);
                                    }
                                }
                            }
                            obj3 = le0Var.c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (obj3 != null) {
                    ((ja) obj3).resumeWith(fs0.a);
                }
                return fs0.a;
            case 9:
                yg0 yg0Var = (yg0) this.f;
                int intValue3 = ((Integer) obj).intValue();
                rg rgVar = (rg) obj2;
                sg key = rgVar.getKey();
                Object j2 = yg0Var.f.j(key);
                if (key != b2.N) {
                    if (rgVar != j2) {
                        intValue3 = Integer.MIN_VALUE;
                    }
                    intValue3++;
                } else {
                    Object obj6 = (ww) j2;
                    Object obj7 = (ww) rgVar;
                    while (obj7 != null) {
                        if (obj7 != obj6 && (obj7 instanceof ji0)) {
                            gb gbVar = (gb) p7.a.getObjectVolatile((ji0) obj7, cx.e);
                            obj7 = gbVar != null ? gbVar.getParent() : null;
                        } else {
                            obj3 = obj7;
                            if (obj3 == obj6) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + obj3 + ", expected child of " + obj6 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (obj3 == obj6) {
                    }
                }
                return Integer.valueOf(intValue3);
            default:
                hm0 hm0Var = (hm0) this.f;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = hm0Var.b;
                while (true) {
                    Object obj8 = atomicReference.get();
                    if (obj8 == null) {
                        g0 = collection;
                    } else if (obj8 instanceof Set) {
                        g0 = kw.C(obj8, collection);
                    } else {
                        if (!(obj8 instanceof List)) {
                            ue.b("Unexpected notification");
                            throw new id();
                        }
                        g0 = ac.g0((Collection) obj8, kw.B(collection));
                    }
                    while (!atomicReference.compareAndSet(obj8, g0)) {
                        if (atomicReference.get() != obj8) {
                            break;
                        }
                    }
                    if (hm0Var.a()) {
                        hm0Var.a.invoke(new f5(16, hm0Var));
                    }
                    return fs0.a;
                    break;
                }
        }
    }

    public /* synthetic */ n(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }
}
