package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class r6 {
    public static final r6 e;
    public static final r6 f;
    public static final r6 g;
    public static final r6 h;
    public static final r6 i;
    public static final r6 j;
    public static final r6 k;
    public static final /* synthetic */ r6[] l;

    static {
        r6 r6Var = new r6("Paragraph", 0);
        e = r6Var;
        r6 r6Var2 = new r6("Span", 1);
        f = r6Var2;
        r6 r6Var3 = new r6("VerbatimTts", 2);
        g = r6Var3;
        r6 r6Var4 = new r6("Url", 3);
        h = r6Var4;
        r6 r6Var5 = new r6("Link", 4);
        i = r6Var5;
        r6 r6Var6 = new r6("Clickable", 5);
        j = r6Var6;
        r6 r6Var7 = new r6("String", 6);
        k = r6Var7;
        l = new r6[]{r6Var, r6Var2, r6Var3, r6Var4, r6Var5, r6Var6, r6Var7};
    }

    public static r6 valueOf(String str) {
        return (r6) Enum.valueOf(r6.class, str);
    }

    public static r6[] values() {
        return (r6[]) l.clone();
    }
}
