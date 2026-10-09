package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class b10 {
    public static final b10 e;
    public static final b10 f;
    public static final b10 g;
    public static final /* synthetic */ b10[] h;

    static {
        b10 b10Var = new b10("IsPlacedInLookahead", 0);
        e = b10Var;
        b10 b10Var2 = new b10("IsPlacedInApproach", 1);
        f = b10Var2;
        b10 b10Var3 = new b10("IsNotPlaced", 2);
        g = b10Var3;
        h = new b10[]{b10Var, b10Var2, b10Var3};
    }

    public static b10 valueOf(String str) {
        return (b10) Enum.valueOf(b10.class, str);
    }

    public static b10[] values() {
        return (b10[]) h.clone();
    }
}
