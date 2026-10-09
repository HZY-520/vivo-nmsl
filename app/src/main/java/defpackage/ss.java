package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ss implements Runnable {
    public final /* synthetic */ int e = 0;
    public Runnable f;
    public final /* synthetic */ vg g;

    public ss(ja jaVar, ts tsVar) {
        this.f = jaVar;
        this.g = tsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        vg vgVar = this.g;
        switch (i) {
            case 0:
                ((ja) this.f).B((ts) vgVar);
                break;
            default:
                lz lzVar = (lz) vgVar;
                vg vgVar2 = lzVar.h;
                int i2 = 0;
                while (true) {
                    try {
                        this.f.run();
                    } catch (Throwable th) {
                        lw.w(sm.e, th);
                    }
                    Runnable p = lzVar.p();
                    if (p != null) {
                        this.f = p;
                        i2++;
                        if (i2 >= 16 && vgVar2.i(lzVar)) {
                            vgVar2.h(lzVar, this);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                break;
        }
    }

    public ss(lz lzVar, Runnable runnable) {
        this.g = lzVar;
        this.f = runnable;
    }
}
