package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class l2 extends t7 implements qo {
    public final p2 e;
    public final xj0 f;
    public final e3 g;
    public final qe0 h;
    public final String i;
    public final AutofillId j;
    public final z30 k;
    public boolean l;

    public l2(p2 p2Var, xj0 xj0Var, e3 e3Var, qe0 qe0Var, String str) {
        this.e = p2Var;
        this.f = xj0Var;
        this.g = e3Var;
        this.h = qe0Var;
        this.i = str;
        new Rect();
        e3Var.setImportantForAutofill(1);
        AutofillId autofillId = e3Var.getAutofillId();
        if (autofillId == null) {
            throw j2.f("Required value was null.");
        }
        this.j = autofillId;
        this.k = new z30();
    }

    @Override // defpackage.qo
    public final void d(yo yoVar, yo yoVar2) {
        iy a0;
        qj0 q;
        iy a02;
        qj0 q2;
        e3 e3Var = this.g;
        p2 p2Var = this.e;
        if (yoVar != null && (a02 = nh.a0(yoVar)) != null && (q2 = a02.q()) != null && lw.y(q2)) {
            p2Var.k().notifyViewExited(e3Var, a02.f);
        }
        if (yoVar2 == null || (a0 = nh.a0(yoVar2)) == null || (q = a0.q()) == null || !lw.y(q)) {
            return;
        }
        int i = a0.f;
        qe0 qe0Var = this.h;
        iy iyVar = (iy) qe0Var.a.b(i);
        if (iyVar == null || iyVar.k == -4) {
            return;
        }
        t4 t4Var = qe0Var.c;
        int d = qe0Var.d(iyVar);
        long[] jArr = (long[]) t4Var.b;
        long j = jArr[d];
        long j2 = jArr[d + 1];
        p2Var.k().notifyViewEntered(e3Var, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
    }
}
