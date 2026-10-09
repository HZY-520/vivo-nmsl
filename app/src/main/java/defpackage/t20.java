package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class t20 implements ni {
    public mg f;
    public int g;
    public t20 i;
    public t20 j;
    public r60 k;
    public d60 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public s2 q;
    public boolean r;
    public t20 e = this;
    public int h = -1;

    public final ch c0() {
        mg mgVar = this.f;
        if (mgVar != null) {
            return mgVar;
        }
        mg a = t10.a(nh.b0(this).getCoroutineContext().g(new yw((ww) nh.b0(this).getCoroutineContext().j(b2.N))));
        this.f = a;
        return a;
    }

    public boolean d0() {
        return !(this instanceof z7);
    }

    public void e0() {
        if (this.r) {
            cv.b("node attached multiple times");
        }
        if (this.l == null) {
            cv.b("attach invoked on a node without a coordinator");
        }
        this.r = true;
        this.o = true;
    }

    public void f0() {
        if (!this.r) {
            cv.b("Cannot detach a node that is not attached");
        }
        if (this.o) {
            cv.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.p) {
            cv.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.r = false;
        mg mgVar = this.f;
        if (mgVar != null) {
            t10.d(mgVar, new x20("The Modifier.Node was detached", 1));
            this.f = null;
        }
    }

    public void j0() {
        if (!this.r) {
            cv.b("reset() called on an unattached node");
        }
        i0();
    }

    public void k0() {
        if (!this.r) {
            cv.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.o) {
            cv.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.o = false;
        g0();
        this.p = true;
    }

    public void l0() {
        if (!this.r) {
            cv.b("node detached multiple times");
        }
        if (this.l == null) {
            cv.b("detach invoked on a node without a coordinator");
        }
        if (!this.p) {
            cv.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.p = false;
        s2 s2Var = this.q;
        if (s2Var != null) {
            s2Var.b();
        }
        h0();
    }

    public void m0(t20 t20Var) {
        this.e = t20Var;
    }

    public void n0(d60 d60Var) {
        this.l = d60Var;
    }

    public void g0() {
    }

    public void h0() {
    }

    public void i0() {
    }
}
