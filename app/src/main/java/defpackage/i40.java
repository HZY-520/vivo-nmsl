package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class i40 extends ud0 implements jx, pq {
    public i40(String str, String str2) {
        super(ca.e, zj0.class, str, str2);
    }

    @Override // defpackage.da
    public final ex a() {
        we0.a.getClass();
        return this;
    }

    public final void f() {
        if (this.k) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        ex e = e();
        if (e == this) {
            throw new gh("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((i40) ((jx) e)).f();
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        f();
        throw null;
    }
}
