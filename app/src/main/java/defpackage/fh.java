package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class fh {
    public static final fh e;
    public static final fh f;
    public static final fh g;
    public static final fh h;
    public static final /* synthetic */ fh[] i;

    static {
        fh fhVar = new fh("DEFAULT", 0);
        e = fhVar;
        fh fhVar2 = new fh("LAZY", 1);
        f = fhVar2;
        fh fhVar3 = new fh("ATOMIC", 2);
        g = fhVar3;
        fh fhVar4 = new fh("UNDISPATCHED", 3);
        h = fhVar4;
        i = new fh[]{fhVar, fhVar2, fhVar3, fhVar4};
    }

    public static fh valueOf(String str) {
        return (fh) Enum.valueOf(fh.class, str);
    }

    public static fh[] values() {
        return (fh[]) i.clone();
    }
}
