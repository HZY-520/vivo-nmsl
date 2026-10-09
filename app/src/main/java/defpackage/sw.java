package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class sw {
    public static final sw e;
    public static final sw f;
    public static final sw g;
    public static final sw h;
    public static final /* synthetic */ sw[] i;

    static {
        sw swVar = new sw("IGNORED", 0);
        e = swVar;
        sw swVar2 = new sw("SCHEDULED", 1);
        f = swVar2;
        sw swVar3 = new sw("DEFERRED", 2);
        g = swVar3;
        sw swVar4 = new sw("IMMINENT", 3);
        h = swVar4;
        i = new sw[]{swVar, swVar2, swVar3, swVar4};
    }

    public static sw valueOf(String str) {
        return (sw) Enum.valueOf(sw.class, str);
    }

    public static sw[] values() {
        return (sw[]) i.clone();
    }
}
