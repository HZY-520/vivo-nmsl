package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class m80 {
    public final int a;
    public final int b;

    public /* synthetic */ m80(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public abstract void a(o80 o80Var, x6 x6Var, ol0 ol0Var, bf0 bf0Var, n80 n80Var);

    public er b(o80 o80Var) {
        return null;
    }

    public final String toString() {
        String b = we0.a(getClass()).b();
        return b == null ? "" : b;
    }

    public m80(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
