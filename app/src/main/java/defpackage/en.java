package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class en extends vg {
    public static final /* synthetic */ int j = 0;
    public long g;
    public boolean h;
    public g7 i;

    public final void p(boolean z) {
        long j2 = this.g - (z ? 4294967296L : 1L);
        this.g = j2;
        if (j2 <= 0 && this.h) {
            shutdown();
        }
    }

    public abstract void shutdown();

    public final void u(nj njVar) {
        g7 g7Var = this.i;
        if (g7Var == null) {
            g7Var = new g7();
            this.i = g7Var;
        }
        g7Var.addLast(njVar);
    }

    public final void v(boolean z) {
        this.g = (z ? 4294967296L : 1L) + this.g;
        if (z) {
            return;
        }
        this.h = true;
    }

    public abstract long w();

    public final boolean x() {
        g7 g7Var = this.i;
        if (g7Var == null) {
            return false;
        }
        nj njVar = (nj) (g7Var.isEmpty() ? null : g7Var.removeFirst());
        if (njVar == null) {
            return false;
        }
        njVar.run();
        return true;
    }
}
