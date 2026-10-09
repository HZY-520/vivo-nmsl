package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class dh {
    public static final dh e;
    public static final dh f;
    public static final dh g;
    public static final /* synthetic */ dh[] h;

    static {
        dh dhVar = new dh("COROUTINE_SUSPENDED", 0);
        e = dhVar;
        dh dhVar2 = new dh("UNDECIDED", 1);
        f = dhVar2;
        dh dhVar3 = new dh("RESUMED", 2);
        g = dhVar3;
        h = new dh[]{dhVar, dhVar2, dhVar3};
    }

    public static dh valueOf(String str) {
        return (dh) Enum.valueOf(dh.class, str);
    }

    public static dh[] values() {
        return (dh[]) h.clone();
    }
}
