package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class v40 {
    public static final v40 e;
    public static final v40 f;
    public static final /* synthetic */ v40[] g;

    static {
        v40 v40Var = new v40("Default", 0);
        e = v40Var;
        v40 v40Var2 = new v40("UserInput", 1);
        f = v40Var2;
        g = new v40[]{v40Var, v40Var2, new v40("PreventUserInput", 2)};
    }

    public static v40 valueOf(String str) {
        return (v40) Enum.valueOf(v40.class, str);
    }

    public static v40[] values() {
        return (v40[]) g.clone();
    }
}
