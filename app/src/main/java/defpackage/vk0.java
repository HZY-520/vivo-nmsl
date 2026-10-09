package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vk0 {
    public static final vk0 e;
    public static final /* synthetic */ vk0[] f;

    /* JADX INFO: Fake field, exist only in values array */
    vk0 EF0;

    static {
        vk0 vk0Var = new vk0("CornerExtraExtraLarge", 0);
        vk0 vk0Var2 = new vk0("CornerExtraLarge", 1);
        vk0 vk0Var3 = new vk0("CornerExtraLargeIncreased", 2);
        vk0 vk0Var4 = new vk0("CornerExtraLargeTop", 3);
        vk0 vk0Var5 = new vk0("CornerExtraSmall", 4);
        vk0 vk0Var6 = new vk0("CornerExtraSmallTop", 5);
        vk0 vk0Var7 = new vk0("CornerFull", 6);
        vk0 vk0Var8 = new vk0("CornerLarge", 7);
        vk0 vk0Var9 = new vk0("CornerLargeEnd", 8);
        vk0 vk0Var10 = new vk0("CornerLargeIncreased", 9);
        vk0 vk0Var11 = new vk0("CornerLargeStart", 10);
        vk0 vk0Var12 = new vk0("CornerLargeTop", 11);
        vk0 vk0Var13 = new vk0("CornerMedium", 12);
        e = vk0Var13;
        f = new vk0[]{vk0Var, vk0Var2, vk0Var3, vk0Var4, vk0Var5, vk0Var6, vk0Var7, vk0Var8, vk0Var9, vk0Var10, vk0Var11, vk0Var12, vk0Var13, new vk0("CornerNone", 13), new vk0("CornerSmall", 14)};
    }

    public static vk0 valueOf(String str) {
        return (vk0) Enum.valueOf(vk0.class, str);
    }

    public static vk0[] values() {
        return (vk0[]) f.clone();
    }
}
