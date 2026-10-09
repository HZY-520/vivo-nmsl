package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class u90 extends hn0 implements Parcelable, bm0, zm0, p40 {
    public static final Parcelable.Creator<u90> CREATOR = new s1(4);
    public am0 f;

    public u90(long j) {
        ql0 h = xl0.h();
        am0 am0Var = new am0(h.g(), j);
        if (!(h instanceof zr)) {
            am0Var.b = new am0(1L, j);
        }
        this.f = am0Var;
    }

    @Override // defpackage.gn0
    public final in0 a() {
        return this.f;
    }

    @Override // defpackage.gn0
    public final in0 b(in0 in0Var, in0 in0Var2, in0 in0Var3) {
        if (((am0) in0Var2).c == ((am0) in0Var3).c) {
            return in0Var2;
        }
        return null;
    }

    @Override // defpackage.gn0
    public final void c(in0 in0Var) {
        this.f = (am0) in0Var;
    }

    @Override // defpackage.bm0
    public final b2 d() {
        return b2.W;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void g(long j) {
        ql0 h;
        am0 am0Var = (am0) xl0.f(this.f);
        if (am0Var.c != j) {
            am0 am0Var2 = this.f;
            synchronized (xl0.c) {
                h = xl0.h();
                ((am0) xl0.n(am0Var2, this, h, am0Var)).c = j;
            }
            xl0.l(h, this);
        }
    }

    @Override // defpackage.zm0
    public final Object getValue() {
        return Long.valueOf(((am0) xl0.s(this.f, this)).c);
    }

    @Override // defpackage.p40
    public final void setValue(Object obj) {
        g(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((am0) xl0.f(this.f)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(((am0) xl0.s(this.f, this)).c);
    }
}
