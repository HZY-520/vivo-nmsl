package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class gi implements ri0 {
    public final /* synthetic */ hi a;

    public gi(hi hiVar) {
        this.a = hiVar;
    }

    @Override // defpackage.ri0
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        hi hiVar = this.a;
        float floatValue = ((Number) hiVar.a.invoke(Float.valueOf(f))).floatValue();
        hiVar.e.setValue(Boolean.valueOf(floatValue > 0.0f));
        hiVar.f.setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
