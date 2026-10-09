package defpackage;

import android.window.OnBackInvokedDispatcher;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class md implements cz {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ md(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.cz
    public final void e(ez ezVar, xy xyVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        int i = this.e;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                lo0 lo0Var = ((d70) obj2).b;
                xd xdVar = (xd) obj;
                if (xyVar == xy.ON_CREATE) {
                    onBackInvokedDispatcher = xdVar.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    ((c70) lo0Var.getValue()).c.a(new y60(onBackInvokedDispatcher, 0), 1);
                    ((c70) lo0Var.getValue()).c.a(new y60(onBackInvokedDispatcher, 1000000), 0);
                    break;
                }
                break;
            default:
                f20 f20Var = (f20) obj2;
                yy yyVar = (yy) obj;
                f20Var.getClass();
                ld ldVar = f20Var.a;
                CopyOnWriteArrayList copyOnWriteArrayList = f20Var.b;
                xy.Companion.getClass();
                int ordinal = yyVar.ordinal();
                if (xyVar != (ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : xy.ON_RESUME : xy.ON_START : xy.ON_CREATE)) {
                    xy xyVar2 = xy.ON_DESTROY;
                    if (xyVar != xyVar2) {
                        int ordinal2 = yyVar.ordinal();
                        if (ordinal2 != 2) {
                            xyVar2 = ordinal2 != 3 ? ordinal2 != 4 ? null : xy.ON_PAUSE : xy.ON_STOP;
                        }
                        if (xyVar == xyVar2) {
                            copyOnWriteArrayList.remove((Object) null);
                            ldVar.run();
                            break;
                        }
                    } else {
                        f20Var.a();
                        break;
                    }
                } else {
                    copyOnWriteArrayList.add(null);
                    ldVar.run();
                    break;
                }
                break;
        }
    }
}
