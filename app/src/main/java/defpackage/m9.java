package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class m9 {
    public static final m9 e;
    public static final m9 f;
    public static final m9 g;
    public static final /* synthetic */ m9[] h;

    static {
        m9 m9Var = new m9("SUSPEND", 0);
        e = m9Var;
        m9 m9Var2 = new m9("DROP_OLDEST", 1);
        f = m9Var2;
        m9 m9Var3 = new m9("DROP_LATEST", 2);
        g = m9Var3;
        h = new m9[]{m9Var, m9Var2, m9Var3};
    }

    public static m9 valueOf(String str) {
        return (m9) Enum.valueOf(m9.class, str);
    }

    public static m9[] values() {
        return (m9[]) h.clone();
    }
}
