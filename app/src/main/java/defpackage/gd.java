package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class gd implements ng {
    public static final gd f = new gd(0);
    public static final gd g = new gd(1);
    public final /* synthetic */ int e;

    public /* synthetic */ gd(int i) {
        this.e = i;
    }

    @Override // defpackage.ng
    public final tg getContext() {
        switch (this.e) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return sm.e;
        }
    }

    @Override // defpackage.ng
    public final void resumeWith(Object obj) {
        switch (this.e) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.e) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void b(Object obj) {
    }
}
