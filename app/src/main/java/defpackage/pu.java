package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class pu {
    public static final pu e;
    public static final pu f;
    public static final pu g;
    public static final /* synthetic */ pu[] h;

    static {
        pu puVar = new pu("Yes", 0);
        e = puVar;
        pu puVar2 = new pu("No", 1);
        f = puVar2;
        pu puVar3 = new pu("NotInitialized", 2);
        g = puVar3;
        h = new pu[]{puVar, puVar2, puVar3};
    }

    public static pu valueOf(String str) {
        return (pu) Enum.valueOf(pu.class, str);
    }

    public static pu[] values() {
        return (pu[]) h.clone();
    }
}
