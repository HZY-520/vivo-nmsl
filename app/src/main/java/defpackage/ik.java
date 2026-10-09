package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ik {
    public static final ik e;
    public static final ik f;
    public static final ik g;
    public static final /* synthetic */ ik[] h;

    static {
        ik ikVar = new ik("Yes", 0);
        e = ikVar;
        ik ikVar2 = new ik("No", 1);
        f = ikVar2;
        ik ikVar3 = new ik("NotInitialized", 2);
        g = ikVar3;
        h = new ik[]{ikVar, ikVar2, ikVar3};
    }

    public static ik valueOf(String str) {
        return (ik) Enum.valueOf(ik.class, str);
    }

    public static ik[] values() {
        return (ik[]) h.clone();
    }
}
