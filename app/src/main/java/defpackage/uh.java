package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class uh {
    public static final mi a;

    static {
        String str;
        mi miVar;
        int i = qo0.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            fi fiVar = pj.a;
            ts tsVar = h10.a;
            ts tsVar2 = tsVar.j;
            miVar = tsVar;
            if (tsVar == null) {
                miVar = th.o;
            }
        } else {
            miVar = th.o;
        }
        a = miVar;
    }
}
