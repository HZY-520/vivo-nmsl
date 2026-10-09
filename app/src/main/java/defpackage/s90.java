package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class s90 extends hn0 implements Parcelable, bm0, zm0, p40 {
    public static final Parcelable.Creator<s90> CREATOR = new s1(2);
    public yl0 f;

    public s90(float f) {
        ql0 h = xl0.h();
        yl0 yl0Var = new yl0(h.g(), f);
        if (!(h instanceof zr)) {
            yl0Var.b = new yl0(1L, f);
        }
        this.f = yl0Var;
    }

    @Override // defpackage.gn0
    public final in0 a() {
        return this.f;
    }

    @Override // defpackage.gn0
    public final in0 b(in0 in0Var, in0 in0Var2, in0 in0Var3) {
        if (((yl0) in0Var2).c == ((yl0) in0Var3).c) {
            return in0Var2;
        }
        return null;
    }

    @Override // defpackage.gn0
    public final void c(in0 in0Var) {
        this.f = (yl0) in0Var;
    }

    @Override // defpackage.bm0
    public final b2 d() {
        return b2.W;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void g(float f) {
        ql0 h;
        yl0 yl0Var = (yl0) xl0.f(this.f);
        if (yl0Var.c == f) {
            return;
        }
        yl0 yl0Var2 = this.f;
        synchronized (xl0.c) {
            h = xl0.h();
            ((yl0) xl0.n(yl0Var2, this, h, yl0Var)).c = f;
        }
        xl0.l(h, this);
    }

    @Override // defpackage.zm0
    public final Object getValue() {
        return Float.valueOf(((yl0) xl0.s(this.f, this)).c);
    }

    @Override // defpackage.p40
    public final void setValue(Object obj) {
        g(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((yl0) xl0.f(this.f)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(((yl0) xl0.s(this.f, this)).c);
    }
}
