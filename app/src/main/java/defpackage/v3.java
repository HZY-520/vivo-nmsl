package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class v3 {
    public static final v3 e;
    public static final v3 f;
    public static final /* synthetic */ v3[] g;

    static {
        v3 v3Var = new v3("SHOW_ORIGINAL", 0);
        e = v3Var;
        v3 v3Var2 = new v3("SHOW_TRANSLATED", 1);
        f = v3Var2;
        g = new v3[]{v3Var, v3Var2};
    }

    public static v3 valueOf(String str) {
        return (v3) Enum.valueOf(v3.class, str);
    }

    public static v3[] values() {
        return (v3[]) g.clone();
    }
}
