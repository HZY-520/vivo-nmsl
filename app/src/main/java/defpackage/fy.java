package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class fy {
    public static final fy e;
    public static final fy f;
    public static final fy g;
    public static final fy h;
    public static final fy i;
    public static final /* synthetic */ fy[] j;

    static {
        fy fyVar = new fy("Measuring", 0);
        e = fyVar;
        fy fyVar2 = new fy("LookaheadMeasuring", 1);
        f = fyVar2;
        fy fyVar3 = new fy("LayingOut", 2);
        g = fyVar3;
        fy fyVar4 = new fy("LookaheadLayingOut", 3);
        h = fyVar4;
        fy fyVar5 = new fy("Idle", 4);
        i = fyVar5;
        j = new fy[]{fyVar, fyVar2, fyVar3, fyVar4, fyVar5};
    }

    public static fy valueOf(String str) {
        return (fy) Enum.valueOf(fy.class, str);
    }

    public static fy[] values() {
        return (fy[]) j.clone();
    }
}
