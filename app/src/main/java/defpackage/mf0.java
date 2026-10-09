package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class mf0 {
    public static final mf0 e;
    public static final mf0 f;
    public static final /* synthetic */ mf0[] g;

    static {
        mf0 mf0Var = new mf0("Ltr", 0);
        e = mf0Var;
        mf0 mf0Var2 = new mf0("Rtl", 1);
        f = mf0Var2;
        g = new mf0[]{mf0Var, mf0Var2};
    }

    public static mf0 valueOf(String str) {
        return (mf0) Enum.valueOf(mf0.class, str);
    }

    public static mf0[] values() {
        return (mf0[]) g.clone();
    }
}
