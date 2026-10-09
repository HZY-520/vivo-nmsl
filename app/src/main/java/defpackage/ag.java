package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ag {
    public static final ag e;
    public static final ag f;
    public static final /* synthetic */ ag[] g;

    static {
        ag agVar = new ag("VIEW_APPEAR", 0);
        e = agVar;
        ag agVar2 = new ag("VIEW_DISAPPEAR", 1);
        f = agVar2;
        g = new ag[]{agVar, agVar2};
    }

    public static ag valueOf(String str) {
        return (ag) Enum.valueOf(ag.class, str);
    }

    public static ag[] values() {
        return (ag[]) g.clone();
    }
}
