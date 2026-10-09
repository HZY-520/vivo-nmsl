package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class pi0 extends t20 implements ay, sj0 {
    public ti0 s;
    public boolean t;

    @Override // defpackage.ay
    public final v00 J(w00 w00Var, w10 w10Var, long j) {
        boolean z = this.t;
        q80 q80Var = q80.e;
        if ((z ? q80Var : q80.f) == q80Var) {
            if (wf.g(j) == Integer.MAX_VALUE) {
                fv.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (wf.h(j) == Integer.MAX_VALUE) {
            fv.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
        ec0 b = w10Var.b(wf.a(j, 0, this.t ? wf.h(j) : Integer.MAX_VALUE, 0, this.t ? Integer.MAX_VALUE : wf.g(j), 5));
        int i = b.e;
        int h = wf.h(j);
        if (i > h) {
            i = h;
        }
        int i2 = b.f;
        int g = wf.g(j);
        if (i2 > g) {
            i2 = g;
        }
        int i3 = b.f - i2;
        int i4 = b.e - i;
        if (!this.t) {
            i3 = i4;
        }
        ti0 ti0Var = this.s;
        t90 t90Var = ti0Var.f;
        t90 t90Var2 = ti0Var.a;
        t90Var.h(i3);
        ql0 ql0Var = (ql0) xl0.b.n();
        pq e = ql0Var != null ? ql0Var.e() : null;
        ql0 h2 = j20.h(ql0Var);
        try {
            if (t90Var2.g() > i3) {
                t90Var2.h(i3);
            }
            j20.p(ql0Var, h2, e);
            this.s.b.h(this.t ? i2 : i);
            this.s.c.h(this.t ? b.f : b.e);
            this.s.d.setValue(Boolean.FALSE);
            return w00Var.l0(i, i2, vm.e, new ce0(i3, 1, this, b));
        } catch (Throwable th) {
            j20.p(ql0Var, h2, e);
            throw th;
        }
    }

    @Override // defpackage.sj0
    public final void O(bk0 bk0Var) {
        jx[] jxVarArr = zj0.a;
        ak0 ak0Var = yj0.n;
        jx[] jxVarArr2 = zj0.a;
        jx jxVar = jxVarArr2[6];
        Boolean bool = Boolean.TRUE;
        ak0Var.getClass();
        bk0Var.a(ak0Var, bool);
        ki0 ki0Var = new ki0(new oi0(this, 0), new oi0(this, 1));
        if (this.t) {
            ak0 ak0Var2 = yj0.w;
            jx jxVar2 = jxVarArr2[13];
            ak0Var2.getClass();
            bk0Var.a(ak0Var2, ki0Var);
            return;
        }
        ak0 ak0Var3 = yj0.v;
        jx jxVar3 = jxVarArr2[12];
        ak0Var3.getClass();
        bk0Var.a(ak0Var3, ki0Var);
    }
}
