package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ts extends vg implements mi {
    public final Handler g;
    public final String h;
    public final boolean i;
    public final ts j;

    public ts(Handler handler, String str, boolean z) {
        this.g = handler;
        this.h = str;
        this.i = z;
        this.j = z ? this : new ts(handler, str, true);
    }

    @Override // defpackage.mi
    public final void c(long j, ja jaVar) {
        ss ssVar = new ss(jaVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.g.postDelayed(ssVar, j)) {
            jaVar.t(new c(3, this, ssVar));
        } else {
            p(jaVar.i, ssVar);
        }
    }

    @Override // defpackage.mi
    public final tj e(long j, final Runnable runnable, tg tgVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.g.postDelayed(runnable, j)) {
            return new tj() { // from class: rs
                @Override // defpackage.tj
                public final void b() {
                    ts.this.g.removeCallbacks(runnable);
                }
            };
        }
        p(tgVar, runnable);
        return i60.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ts)) {
            return false;
        }
        ts tsVar = (ts) obj;
        return tsVar.g == this.g && tsVar.i == this.i;
    }

    @Override // defpackage.vg
    public final void h(tg tgVar, Runnable runnable) {
        if (this.g.post(runnable)) {
            return;
        }
        p(tgVar, runnable);
    }

    public final int hashCode() {
        return (this.i ? 1231 : 1237) ^ System.identityHashCode(this.g);
    }

    @Override // defpackage.vg
    public final boolean i(tg tgVar) {
        return (this.i && lw.i(Looper.myLooper(), this.g.getLooper())) ? false : true;
    }

    public final void p(tg tgVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        ww wwVar = (ww) tgVar.j(b2.N);
        if (wwVar != null) {
            wwVar.b(cancellationException);
        }
        fi fiVar = pj.a;
        bi.g.h(tgVar, runnable);
    }

    @Override // defpackage.vg
    public final String toString() {
        ts tsVar;
        String str;
        fi fiVar = pj.a;
        ts tsVar2 = h10.a;
        if (this == tsVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                tsVar = tsVar2.j;
            } catch (UnsupportedOperationException unused) {
                tsVar = null;
            }
            str = this == tsVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.h;
        if (str2 == null) {
            str2 = this.g.toString();
        }
        if (!this.i) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public ts(Handler handler) {
        this(handler, null, false);
    }
}
