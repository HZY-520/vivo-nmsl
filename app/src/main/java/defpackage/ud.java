package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.vivo.cnm.lico.MainActivity;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ud implements td, ViewTreeObserver.OnDrawListener, Runnable {
    public final long e = SystemClock.uptimeMillis() + 10000;
    public Runnable f;
    public boolean g;
    public final /* synthetic */ MainActivity h;

    public ud(MainActivity mainActivity) {
        this.h = mainActivity;
    }

    public final void a(View view) {
        if (this.g) {
            return;
        }
        this.g = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.f = runnable;
        View decorView = this.h.getWindow().getDecorView();
        decorView.getClass();
        if (!this.g) {
            decorView.postOnAnimation(new o(3, this));
        } else if (lw.i(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.e) {
                this.g = false;
                this.h.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f = null;
        dq fullyDrawnReporter = this.h.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.a) {
            z = fullyDrawnReporter.b;
        }
        if (z) {
            this.g = false;
            this.h.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
