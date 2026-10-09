package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class gq0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static en a() {
        ThreadLocal threadLocal = a;
        en enVar = (en) threadLocal.get();
        if (enVar != null) {
            return enVar;
        }
        n8 n8Var = new n8(Thread.currentThread());
        threadLocal.set(n8Var);
        return n8Var;
    }
}
