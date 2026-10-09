package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class u0 {
    public String a;
    public final int[] b = new int[2];

    public abstract int[] a(int i);

    public final int[] b(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public final String c() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        lw.E("text");
        throw null;
    }

    public abstract int[] d(int i);
}
