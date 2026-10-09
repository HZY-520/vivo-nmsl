package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class yy {
    public static final yy e;
    public static final yy f;
    public static final yy g;
    public static final yy h;
    public static final yy i;
    public static final /* synthetic */ yy[] j;

    static {
        yy yyVar = new yy("DESTROYED", 0);
        e = yyVar;
        yy yyVar2 = new yy("INITIALIZED", 1);
        f = yyVar2;
        yy yyVar3 = new yy("CREATED", 2);
        g = yyVar3;
        yy yyVar4 = new yy("STARTED", 3);
        h = yyVar4;
        yy yyVar5 = new yy("RESUMED", 4);
        i = yyVar5;
        j = new yy[]{yyVar, yyVar2, yyVar3, yyVar4, yyVar5};
    }

    public static yy valueOf(String str) {
        return (yy) Enum.valueOf(yy.class, str);
    }

    public static yy[] values() {
        return (yy[]) j.clone();
    }
}
