package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ij0 implements ri0 {
    public final /* synthetic */ mj0 a;
    public final /* synthetic */ kj0 b;

    public ij0(mj0 mj0Var, kj0 kj0Var) {
        this.a = mj0Var;
        this.b = kj0Var;
    }

    @Override // defpackage.ri0
    public final float a(float f) {
        float abs = Math.abs(f);
        mj0 mj0Var = this.a;
        if (abs != 0.0f && !((Boolean) mj0Var.h.b()).booleanValue()) {
            throw new vn("The fling animation was cancelled", 0);
        }
        return mj0Var.e(mj0Var.h(this.b.a(mj0Var.f(mj0Var.i(f)), 2)));
    }
}
