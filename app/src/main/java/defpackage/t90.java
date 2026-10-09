package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class t90 extends hn0 implements Parcelable, a40, bm0 {
    public static final Parcelable.Creator<t90> CREATOR = new s1(3);
    public zl0 f;

    public t90(int i) {
        ql0 h = xl0.h();
        zl0 zl0Var = new zl0(h.g(), i);
        if (!(h instanceof zr)) {
            zl0Var.b = new zl0(1L, i);
        }
        this.f = zl0Var;
    }

    @Override // defpackage.gn0
    public final in0 a() {
        return this.f;
    }

    @Override // defpackage.gn0
    public final in0 b(in0 in0Var, in0 in0Var2, in0 in0Var3) {
        if (((zl0) in0Var2).c == ((zl0) in0Var3).c) {
            return in0Var2;
        }
        return null;
    }

    @Override // defpackage.gn0
    public final void c(in0 in0Var) {
        this.f = (zl0) in0Var;
    }

    @Override // defpackage.bm0
    public final b2 d() {
        return b2.W;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((zl0) xl0.s(this.f, this)).c;
    }

    public final void h(int i) {
        ql0 h;
        zl0 zl0Var = (zl0) xl0.f(this.f);
        if (zl0Var.c != i) {
            zl0 zl0Var2 = this.f;
            synchronized (xl0.c) {
                h = xl0.h();
                ((zl0) xl0.n(zl0Var2, this, h, zl0Var)).c = i;
            }
            xl0.l(h, this);
        }
    }

    public final String toString() {
        return j2.i("MutableIntState(value=", ((zl0) xl0.f(this.f)).c, ")@", hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(g());
    }
}
