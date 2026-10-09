package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class hn0 implements gn0 {
    public final q7 e = new q7(0);

    public final boolean e(int i) {
        return (this.e.get() & i) != 0;
    }

    public final void f(int i) {
        q7 q7Var;
        int i2;
        do {
            q7Var = this.e;
            i2 = q7Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!q7Var.compareAndSet(i2, i2 | i));
    }
}
