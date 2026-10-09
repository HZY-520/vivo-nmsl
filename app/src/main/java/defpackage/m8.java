package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class m8 extends q {
    public final Thread h;
    public final en i;

    public m8(tg tgVar, Thread thread, en enVar) {
        super(tgVar, true);
        this.h = thread;
        this.i = enVar;
    }

    @Override // defpackage.cx
    public final void u(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.h;
        if (lw.i(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
