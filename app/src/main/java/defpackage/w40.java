package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class w40 {
    public static final w40 e;
    public static final /* synthetic */ w40[] f;

    static {
        w40 w40Var = new w40("Default", 0);
        e = w40Var;
        f = new w40[]{w40Var, new w40("UserInput", 1), new w40("PreventUserInput", 2)};
    }

    public static w40 valueOf(String str) {
        return (w40) Enum.valueOf(w40.class, str);
    }

    public static w40[] values() {
        return (w40[]) f.clone();
    }
}
