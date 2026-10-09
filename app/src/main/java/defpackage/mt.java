package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class mt {
    public final tq a;
    public final /* synthetic */ int b;

    public mt(tq tqVar, int i) {
        this.b = i;
        this.a = tqVar;
    }

    public final float a(float f, wx wxVar, wx wxVar2) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat((int) (wxVar2.v(wxVar, (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(((int) (wxVar.B() >> 32)) / 2.0f) << 32)) & 4294967295L));
            default:
                float B = ((int) (wxVar.B() & 4294967295L)) / 2.0f;
                return Float.intBitsToFloat((int) (wxVar2.v(wxVar, (Float.floatToRawIntBits(B) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
        }
    }
}
