package defpackage;

import com.vivo.cnm.lico.MainActivity;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class me extends p {
    public final w90 n;
    public boolean o;

    public me(MainActivity mainActivity) {
        super(mainActivity, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        q4 q4Var = new q4(1, this);
        addOnAttachStateChangeListener(q4Var);
        z6 z6Var = new z6(21);
        v10.g(this).a.add(z6Var);
        this.j = new v7(this, q4Var, z6Var, 7);
        this.n = p30.m(null);
    }

    @Override // defpackage.p
    public final void a(se seVar, int i) {
        gr grVar = (gr) seVar;
        grVar.Q(420213850);
        int i2 = (grVar.g(this) ? 4 : 2) | i;
        if (grVar.I(i2 & 1, (i2 & 3) != 2)) {
            tq tqVar = (tq) this.n.getValue();
            if (tqVar == null) {
                grVar.P(-1238823553);
            } else {
                grVar.P(98585282);
                tqVar.invoke(grVar, 0);
            }
            grVar.o(false);
        } else {
            grVar.L();
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new n(i, 3, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return me.class.getName();
    }

    @Override // defpackage.p
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.o;
    }

    public final void setContent(tq tqVar) {
        pe peVar;
        this.o = true;
        this.n.setValue(tqVar);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            if (this.h != null || isAttachedToWindow() || ((peVar = this.i) != null && peVar.a.isAttachedToWindow())) {
                e();
            } else {
                z6.m("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
            }
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
