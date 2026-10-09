package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class xp implements Comparable {
    public static final xp f;
    public static final xp g;
    public static final xp h;
    public static final xp i;
    public static final xp j;
    public final int e;

    static {
        xp xpVar = new xp(100);
        xp xpVar2 = new xp(200);
        xp xpVar3 = new xp(300);
        xp xpVar4 = new xp(400);
        xp xpVar5 = new xp(500);
        xp xpVar6 = new xp(600);
        f = xpVar6;
        xp xpVar7 = new xp(700);
        xp xpVar8 = new xp(800);
        xp xpVar9 = new xp(900);
        g = xpVar4;
        h = xpVar5;
        i = xpVar6;
        j = xpVar7;
        kw.C(xpVar, xpVar2, xpVar3, xpVar4, xpVar5, xpVar6, xpVar7, xpVar8, xpVar9);
    }

    public xp(int i2) {
        this.e = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        dv.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return lw.m(this.e, ((xp) obj).e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xp) {
            return this.e == ((xp) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        return j2.h("FontWeight(weight=", this.e, ")");
    }
}
