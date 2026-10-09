package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class xo {
    public static final xo e;
    public static final xo f;
    public static final xo g;
    public static final /* synthetic */ xo[] h;

    static {
        xo xoVar = new xo("Active", 0);
        e = xoVar;
        xo xoVar2 = new xo("ActiveParent", 1);
        f = xoVar2;
        xo xoVar3 = new xo("Captured", 2);
        xo xoVar4 = new xo("Inactive", 3);
        g = xoVar4;
        h = new xo[]{xoVar, xoVar2, xoVar3, xoVar4};
    }

    public static xo valueOf(String str) {
        return (xo) Enum.valueOf(xo.class, str);
    }

    public static xo[] values() {
        return (xo[]) h.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                z6.j();
                return false;
            }
        }
        return true;
    }
}
