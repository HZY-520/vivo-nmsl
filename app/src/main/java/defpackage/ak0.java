package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ak0 {
    public final String a;
    public final tq b;
    public final boolean c;

    public /* synthetic */ ak0(String str) {
        this(str, new ei0(16));
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public ak0(String str, tq tqVar) {
        this.a = str;
        this.b = tqVar;
    }

    public ak0(String str, int i) {
        this(str);
        this.c = true;
    }

    public ak0(String str, boolean z, tq tqVar) {
        this(str, tqVar);
        this.c = z;
    }
}
