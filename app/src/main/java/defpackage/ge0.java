package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ge0 {
    public static final ge0 e;
    public static final ge0 f;
    public static final ge0 g;
    public static final ge0 h;
    public static final ge0 i;
    public static final ge0 j;
    public static final /* synthetic */ ge0[] k;

    static {
        ge0 ge0Var = new ge0("ShutDown", 0);
        e = ge0Var;
        ge0 ge0Var2 = new ge0("ShuttingDown", 1);
        f = ge0Var2;
        ge0 ge0Var3 = new ge0("Inactive", 2);
        g = ge0Var3;
        ge0 ge0Var4 = new ge0("InactivePendingWork", 3);
        h = ge0Var4;
        ge0 ge0Var5 = new ge0("Idle", 4);
        i = ge0Var5;
        ge0 ge0Var6 = new ge0("PendingWork", 5);
        j = ge0Var6;
        k = new ge0[]{ge0Var, ge0Var2, ge0Var3, ge0Var4, ge0Var5, ge0Var6};
    }

    public static ge0 valueOf(String str) {
        return (ge0) Enum.valueOf(ge0.class, str);
    }

    public static ge0[] values() {
        return (ge0[]) k.clone();
    }
}
