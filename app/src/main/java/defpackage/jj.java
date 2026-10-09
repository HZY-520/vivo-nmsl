package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class jj {
    public static final jj e;
    public static final jj f;
    public static final jj g;
    public static final /* synthetic */ jj[] h;

    static {
        jj jjVar = new jj("Vertical", 0);
        e = jjVar;
        jj jjVar2 = new jj("Horizontal", 1);
        f = jjVar2;
        jj jjVar3 = new jj("Both", 2);
        g = jjVar3;
        h = new jj[]{jjVar, jjVar2, jjVar3};
    }

    public static jj valueOf(String str) {
        return (jj) Enum.valueOf(jj.class, str);
    }

    public static jj[] values() {
        return (jj[]) h.clone();
    }
}
