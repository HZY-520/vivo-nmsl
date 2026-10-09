package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class qq0 {
    public static final qq0 e;
    public static final qq0 f;
    public static final /* synthetic */ qq0[] g;

    static {
        qq0 qq0Var = new qq0("On", 0);
        e = qq0Var;
        qq0 qq0Var2 = new qq0("Off", 1);
        f = qq0Var2;
        g = new qq0[]{qq0Var, qq0Var2, new qq0("Indeterminate", 2)};
    }

    public static qq0 valueOf(String str) {
        return (qq0) Enum.valueOf(qq0.class, str);
    }

    public static qq0[] values() {
        return (qq0[]) g.clone();
    }
}
