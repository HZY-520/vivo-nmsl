package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class go0 extends og implements cr {
    private final int arity;

    public go0(int i, ng ngVar) {
        super(ngVar);
        this.arity = i;
    }

    @Override // defpackage.cr
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.b8
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        we0.a.getClass();
        return xe0.a(this);
    }
}
