package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class dl0 {
    public static final dl0 e;
    public static final dl0 f;
    public static final dl0 g;
    public static final /* synthetic */ dl0[] h;

    static {
        dl0 dl0Var = new dl0("START", 0);
        e = dl0Var;
        dl0 dl0Var2 = new dl0("STOP", 1);
        f = dl0Var2;
        dl0 dl0Var3 = new dl0("STOP_AND_RESET_REPLAY_CACHE", 2);
        g = dl0Var3;
        h = new dl0[]{dl0Var, dl0Var2, dl0Var3};
    }

    public static dl0 valueOf(String str) {
        return (dl0) Enum.valueOf(dl0.class, str);
    }

    public static dl0[] values() {
        return (dl0[]) h.clone();
    }
}
