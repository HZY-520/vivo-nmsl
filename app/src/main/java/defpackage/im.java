package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class im implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = uq0.a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (em.k != null) {
                em.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i2 = uq0.a;
            Trace.endSection();
            throw th;
        }
    }
}
