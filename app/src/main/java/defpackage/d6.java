package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class d6 {
    public static final d6 e;
    public static final d6 f;
    public static final /* synthetic */ d6[] g;

    static {
        d6 d6Var = new d6("BoundReached", 0);
        e = d6Var;
        d6 d6Var2 = new d6("Finished", 1);
        f = d6Var2;
        g = new d6[]{d6Var, d6Var2};
    }

    public static d6 valueOf(String str) {
        return (d6) Enum.valueOf(d6.class, str);
    }

    public static d6[] values() {
        return (d6[]) g.clone();
    }
}
