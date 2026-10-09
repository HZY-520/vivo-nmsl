package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class qw {
    public static final qw e;
    public static final qw f;
    public static final qw g;
    public static final qw h;
    public static final /* synthetic */ qw[] i;

    static {
        qw qwVar = new qw("LookaheadMeasurement", 0);
        e = qwVar;
        qw qwVar2 = new qw("LookaheadPlacement", 1);
        f = qwVar2;
        qw qwVar3 = new qw("Measurement", 2);
        g = qwVar3;
        qw qwVar4 = new qw("Placement", 3);
        h = qwVar4;
        i = new qw[]{qwVar, qwVar2, qwVar3, qwVar4};
    }

    public static qw valueOf(String str) {
        return (qw) Enum.valueOf(qw.class, str);
    }

    public static qw[] values() {
        return (qw[]) i.clone();
    }
}
