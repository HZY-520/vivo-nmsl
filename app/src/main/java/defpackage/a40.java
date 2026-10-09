package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public interface a40 extends p40, zm0 {
    @Override // defpackage.zm0
    default Object getValue() {
        return Integer.valueOf(((t90) this).g());
    }

    @Override // defpackage.p40
    default void setValue(Object obj) {
        ((t90) this).h(((Number) obj).intValue());
    }
}
