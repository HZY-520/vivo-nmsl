package defpackage;

import com.vivo.cnm.lico.Gates;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class xy {
    private static final /* synthetic */ cn $ENTRIES;
    private static final /* synthetic */ xy[] $VALUES;
    public static final vy Companion;
    public static final xy ON_ANY;
    public static final xy ON_CREATE;
    public static final xy ON_DESTROY;
    public static final xy ON_PAUSE;
    public static final xy ON_RESUME;
    public static final xy ON_START;
    public static final xy ON_STOP;

    static {
        xy xyVar = new xy("ON_CREATE", 0);
        ON_CREATE = xyVar;
        xy xyVar2 = new xy("ON_START", 1);
        ON_START = xyVar2;
        xy xyVar3 = new xy("ON_RESUME", 2);
        ON_RESUME = xyVar3;
        xy xyVar4 = new xy("ON_PAUSE", 3);
        ON_PAUSE = xyVar4;
        xy xyVar5 = new xy("ON_STOP", 4);
        ON_STOP = xyVar5;
        xy xyVar6 = new xy("ON_DESTROY", 5);
        ON_DESTROY = xyVar6;
        xy xyVar7 = new xy("ON_ANY", 6);
        ON_ANY = xyVar7;
        xy[] xyVarArr = {xyVar, xyVar2, xyVar3, xyVar4, xyVar5, xyVar6, xyVar7};
        $VALUES = xyVarArr;
        $ENTRIES = new dn(xyVarArr);
        Companion = new vy();
    }

    public static xy valueOf(String str) {
        return (xy) Enum.valueOf(xy.class, str);
    }

    public static xy[] values() {
        return (xy[]) $VALUES.clone();
    }

    public final yy a() {
        switch (wy.a[ordinal()]) {
            case 1:
            case 2:
                return yy.g;
            case 3:
            case 4:
                return yy.h;
            case Gates.MAX_WINDOWS /* 5 */:
                return yy.i;
            case 6:
                return yy.e;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                z6.j();
                return null;
        }
    }
}
