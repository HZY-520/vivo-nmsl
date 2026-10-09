package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ah {
    public static final ah e;
    public static final ah f;
    public static final ah g;
    public static final ah h;
    public static final ah i;
    public static final /* synthetic */ ah[] j;

    static {
        ah ahVar = new ah("CPU_ACQUIRED", 0);
        e = ahVar;
        ah ahVar2 = new ah("BLOCKING", 1);
        f = ahVar2;
        ah ahVar3 = new ah("PARKING", 2);
        g = ahVar3;
        ah ahVar4 = new ah("DORMANT", 3);
        h = ahVar4;
        ah ahVar5 = new ah("TERMINATED", 4);
        i = ahVar5;
        j = new ah[]{ahVar, ahVar2, ahVar3, ahVar4, ahVar5};
    }

    public static ah valueOf(String str) {
        return (ah) Enum.valueOf(ah.class, str);
    }

    public static ah[] values() {
        return (ah[]) j.clone();
    }
}
