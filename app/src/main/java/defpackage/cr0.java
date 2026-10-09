package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class cr0 {
    public static final cr0 e;
    public static final cr0 f;
    public static final cr0 g;
    public static final /* synthetic */ cr0[] h;

    static {
        cr0 cr0Var = new cr0("ContinueTraversal", 0);
        e = cr0Var;
        cr0 cr0Var2 = new cr0("SkipSubtreeAndContinueTraversal", 1);
        f = cr0Var2;
        cr0 cr0Var3 = new cr0("CancelTraversal", 2);
        g = cr0Var3;
        h = new cr0[]{cr0Var, cr0Var2, cr0Var3};
    }

    public static cr0 valueOf(String str) {
        return (cr0) Enum.valueOf(cr0.class, str);
    }

    public static cr0[] values() {
        return (cr0[]) h.clone();
    }
}
