package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class nj extends vo0 {
    public int g;

    public nj(int i) {
        super(0L, false);
        this.g = i;
    }

    public abstract ng d();

    public Throwable e(Object obj) {
        hd hdVar = obj instanceof hd ? (hd) obj : null;
        if (hdVar != null) {
            return hdVar.a;
        }
        return null;
    }

    public final void g(Throwable th) {
        lw.w(d().getContext(), new gh("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (defpackage.ww) r5.j(defpackage.b2.N);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            ng d = d();
            d.getClass();
            lj ljVar = (lj) d;
            og ogVar = ljVar.i;
            Object obj = ljVar.k;
            tg context = ogVar.getContext();
            Object R = kw.R(context, obj);
            ww wwVar = null;
            cs0 l0 = R != kw.s ? nh.l0(ogVar, context, R) : null;
            try {
                tg context2 = ogVar.getContext();
                Object j = j();
                Throwable e = e(j);
                if (e == null) {
                    int i = this.g;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                }
                if (wwVar != null && !wwVar.a()) {
                    CancellationException l = wwVar.l();
                    c(l);
                    ogVar.resumeWith(t30.h(l));
                } else if (e != null) {
                    ogVar.resumeWith(new qf0(e));
                } else {
                    ogVar.resumeWith(f(j));
                }
                if (l0 != null && !l0.e0()) {
                    return;
                }
                kw.M(context, R);
            } catch (Throwable th) {
                if (l0 == null || l0.e0()) {
                    kw.M(context, R);
                }
                throw th;
            }
        } catch (Throwable th2) {
            g(th2);
        }
    }

    public void c(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
