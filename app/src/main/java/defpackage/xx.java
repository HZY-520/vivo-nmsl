package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class xx {
    public static final xx e;
    public static final xx f;
    public static final /* synthetic */ xx[] g;

    static {
        xx xxVar = new xx("Ltr", 0);
        e = xxVar;
        xx xxVar2 = new xx("Rtl", 1);
        f = xxVar2;
        g = new xx[]{xxVar, xxVar2};
    }

    public static xx valueOf(String str) {
        return (xx) Enum.valueOf(xx.class, str);
    }

    public static xx[] values() {
        return (xx[]) g.clone();
    }
}
