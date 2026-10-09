package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class da implements ex, Serializable {
    public transient ex e;
    public final Object f;
    public final Class g;
    public final String h;
    public final String i;
    public final boolean j;

    public da(Object obj, Class cls, String str, String str2, boolean z) {
        this.f = obj;
        this.g = cls;
        this.h = str;
        this.i = str2;
        this.j = z;
    }

    public abstract ex a();

    public final kb d() {
        boolean z = this.j;
        Class cls = this.g;
        if (!z) {
            return we0.a(cls);
        }
        we0.a.getClass();
        return new b90(cls);
    }
}
