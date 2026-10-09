package defpackage;

import android.view.DragEvent;
import android.view.View;
import com.vivo.cnm.lico.Gates;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class e4 implements View.OnDragListener, fk {
    public final hk a;
    public final n7 b;
    public final d4 c;

    public e4() {
        hk hkVar = new hk();
        hkVar.u = 0L;
        this.a = hkVar;
        this.b = new n7();
        this.c = new d4(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        t3 t3Var = new t3(7, dragEvent);
        int action = dragEvent.getAction();
        cr0 cr0Var = cr0.e;
        n7 n7Var = this.b;
        hk hkVar = this.a;
        switch (action) {
            case 1:
                re0 re0Var = new re0();
                l lVar = new l(t3Var, hkVar, re0Var);
                if (lVar.invoke(hkVar) == cr0Var) {
                    p30.q(hkVar, lVar);
                }
                boolean z = re0Var.e;
                i7 i7Var = new i7(n7Var);
                while (i7Var.hasNext()) {
                    ((hk) i7Var.next()).s0();
                }
                break;
            case 2:
                hkVar.r0(t3Var);
                break;
            case 4:
                l lVar2 = new l(9, t3Var);
                if (lVar2.invoke(hkVar) == cr0Var) {
                    p30.q(hkVar, lVar2);
                }
                n7Var.clear();
                break;
            case Gates.MAX_WINDOWS /* 5 */:
                hkVar.p0();
                break;
            case 6:
                hkVar.q0();
                break;
        }
        return false;
    }
}
