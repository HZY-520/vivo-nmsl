package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class pm implements fu {
    public final boolean e;

    public pm(boolean z) {
        this.e = z;
    }

    @Override // defpackage.fu
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.fu
    public final f60 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.e ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
