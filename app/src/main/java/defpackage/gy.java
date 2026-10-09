package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class gy {
    public static final gy e;
    public static final gy f;
    public static final gy g;
    public static final /* synthetic */ gy[] h;

    static {
        gy gyVar = new gy("InMeasureBlock", 0);
        e = gyVar;
        gy gyVar2 = new gy("InLayoutBlock", 1);
        f = gyVar2;
        gy gyVar3 = new gy("NotUsed", 2);
        g = gyVar3;
        h = new gy[]{gyVar, gyVar2, gyVar3};
    }

    public static gy valueOf(String str) {
        return (gy) Enum.valueOf(gy.class, str);
    }

    public static gy[] values() {
        return (gy[]) h.clone();
    }
}
