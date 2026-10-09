package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class eg {
    public final y8 a;
    public final ja b;

    public eg(y8 y8Var, ja jaVar) {
        this.a = y8Var;
        this.b = jaVar;
    }

    public final String toString() {
        ja jaVar = this.b;
        if (jaVar.i.j(yg.f) != null) {
            z6.c();
            return null;
        }
        int hashCode = hashCode();
        t10.e(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        return "Request@" + num + "(currentBounds()=" + this.a.b() + ", continuation=" + jaVar + ")";
    }
}
