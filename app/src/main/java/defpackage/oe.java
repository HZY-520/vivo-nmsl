package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class oe implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ pe e;

    public oe(pe peVar) {
        this.e = peVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.e.f(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        pe peVar = this.e;
        peVar.g.a.clear();
        nf0 nf0Var = peVar.h;
        synchronized (nf0Var) {
            nf0Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        pe peVar = this.e;
        peVar.g.a.clear();
        nf0 nf0Var = peVar.h;
        synchronized (nf0Var) {
            nf0Var.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        ((w90) this.e.t.f).setValue(Boolean.valueOf(z));
    }
}
