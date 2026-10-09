package defpackage;

import android.view.autofill.AutofillId;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class k2 implements s7 {
    public final e3 a;
    public final u7 b;
    public final AutofillId c;

    public k2(e3 e3Var, u7 u7Var) {
        this.a = e3Var;
        this.b = u7Var;
        e3Var.setImportantForAutofill(1);
        AutofillId autofillId = e3Var.getAutofillId();
        if (autofillId == null) {
            throw j2.f("Required value was null.");
        }
        this.c = autofillId;
    }
}
