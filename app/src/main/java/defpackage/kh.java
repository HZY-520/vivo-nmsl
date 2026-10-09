package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class kh {
    public static final kh e;
    public static final kh f;
    public static final kh g;
    public static final /* synthetic */ kh[] h;

    static {
        kh khVar = new kh("None", 0);
        e = khVar;
        kh khVar2 = new kh("Cancelled", 1);
        f = khVar2;
        kh khVar3 = new kh("Redirected", 2);
        g = khVar3;
        h = new kh[]{khVar, khVar2, khVar3, new kh("RedirectCancelled", 3)};
    }

    public static kh valueOf(String str) {
        return (kh) Enum.valueOf(kh.class, str);
    }

    public static kh[] values() {
        return (kh[]) h.clone();
    }
}
