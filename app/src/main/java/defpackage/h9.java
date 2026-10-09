package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class h9 extends w7 {
    public ja a;
    public pq b;

    @Override // defpackage.w7
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // defpackage.w7
    public final void b(Throwable th) {
        ja jaVar = this.a;
        if (jaVar != null) {
            jaVar.resumeWith(t30.h(th));
        }
    }
}
