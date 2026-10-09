package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class q80 {
    public static final q80 e;
    public static final q80 f;
    public static final /* synthetic */ q80[] g;

    static {
        q80 q80Var = new q80("Vertical", 0);
        e = q80Var;
        q80 q80Var2 = new q80("Horizontal", 1);
        f = q80Var2;
        g = new q80[]{q80Var, q80Var2};
    }

    public static q80 valueOf(String str) {
        return (q80) Enum.valueOf(q80.class, str);
    }

    public static q80[] values() {
        return (q80[]) g.clone();
    }
}
