package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class sc0 {
    public static final sc0 e;
    public static final sc0 f;
    public static final sc0 g;
    public static final /* synthetic */ sc0[] h;

    static {
        sc0 sc0Var = new sc0("Initial", 0);
        e = sc0Var;
        sc0 sc0Var2 = new sc0("Main", 1);
        f = sc0Var2;
        sc0 sc0Var3 = new sc0("Final", 2);
        g = sc0Var3;
        h = new sc0[]{sc0Var, sc0Var2, sc0Var3};
    }

    public static sc0 valueOf(String str) {
        return (sc0) Enum.valueOf(sc0.class, str);
    }

    public static sc0[] values() {
        return (sc0[]) h.clone();
    }
}
