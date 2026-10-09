package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class zr extends o40 {
    @Override // defpackage.o40
    public final o40 C(pq pqVar, pq pqVar2) {
        return (o40) ((ql0) xl0.b(new wr(new n5(2, pqVar, pqVar2), 1)));
    }

    @Override // defpackage.o40, defpackage.ql0
    public final void c() {
        synchronized (xl0.c) {
            o();
        }
    }

    @Override // defpackage.o40, defpackage.ql0
    public final void k() {
        t30.B();
        throw null;
    }

    @Override // defpackage.o40, defpackage.ql0
    public final void l() {
        t30.B();
        throw null;
    }

    @Override // defpackage.o40, defpackage.ql0
    public final void m() {
        xl0.c();
    }

    @Override // defpackage.o40, defpackage.ql0
    public final ql0 u(pq pqVar) {
        int i = 1;
        return (ae0) ((ql0) xl0.b(new wr(new i9(i, pqVar), i)));
    }

    @Override // defpackage.o40
    public final m20 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
