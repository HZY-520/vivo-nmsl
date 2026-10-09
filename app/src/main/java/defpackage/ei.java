package defpackage;

import com.vivo.cnm.lico.Gates;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ei implements cz {
    public final /* synthetic */ int e;
    public final Object f;
    public final Object g;

    public ei(dz dzVar) {
        this.e = 2;
        this.f = dzVar;
        qb qbVar = qb.c;
        Class<?> cls = dzVar.getClass();
        ob obVar = (ob) qbVar.a.get(cls);
        this.g = obVar == null ? qbVar.a(cls, null) : obVar;
    }

    @Override // defpackage.cz
    public final void e(ez ezVar, xy xyVar) {
        int i = this.e;
        Object obj = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                ci ciVar = (ci) obj;
                switch (di.a[xyVar.ordinal()]) {
                    case 1:
                    case 4:
                    case 6:
                        break;
                    case 2:
                        ciVar.b(ezVar);
                        break;
                    case 3:
                        ciVar.c(ezVar);
                        break;
                    case Gates.MAX_WINDOWS /* 5 */:
                        ciVar.a(ezVar);
                        break;
                    case 7:
                        z6.l("ON_ANY must not been send by anybody");
                        break;
                    default:
                        z6.j();
                        break;
                }
                cz czVar = (cz) obj2;
                if (czVar != null) {
                    czVar.e(ezVar, xyVar);
                    break;
                }
                break;
            case 1:
                if (xyVar == xy.ON_START) {
                    ((zy) obj).b(this);
                    ((rh0) obj2).d();
                    break;
                }
                break;
            default:
                dz dzVar = (dz) obj;
                HashMap hashMap = ((ob) obj2).a;
                ob.a((List) hashMap.get(xyVar), ezVar, xyVar, dzVar);
                ob.a((List) hashMap.get(xy.ON_ANY), ezVar, xyVar, dzVar);
                break;
        }
    }

    public /* synthetic */ ei(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
