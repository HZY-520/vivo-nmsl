package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class up implements sp {
    public final float[] a;
    public final float[] b;

    public up(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            z6.l("Array lengths must match and be nonzero");
            throw null;
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.sp
    public final float a(float f) {
        return lr0.C(f, this.b, this.a);
    }

    @Override // defpackage.sp
    public final float b(float f) {
        return lr0.C(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof up)) {
            return false;
        }
        up upVar = (up) obj;
        return Arrays.equals(this.a, upVar.a) && Arrays.equals(this.b, upVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        arrays.getClass();
        String arrays2 = Arrays.toString(this.b);
        arrays2.getClass();
        return "FontScaleConverter{fromSpValues=" + arrays + ", toDpValues=" + arrays2 + "}";
    }
}
