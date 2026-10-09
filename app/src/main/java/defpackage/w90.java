package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class w90 extends hn0 implements Parcelable, bm0 {
    public static final Parcelable.Creator<w90> CREATOR = new v90();
    public final b2 f;
    public cm0 g;

    public w90(Object obj, b2 b2Var) {
        this.f = b2Var;
        ql0 h = xl0.h();
        cm0 cm0Var = new cm0(h.g(), obj);
        if (!(h instanceof zr)) {
            cm0Var.b = new cm0(1L, obj);
        }
        this.g = cm0Var;
    }

    @Override // defpackage.gn0
    public final in0 a() {
        return this.g;
    }

    @Override // defpackage.gn0
    public final in0 b(in0 in0Var, in0 in0Var2, in0 in0Var3) {
        if (this.f.g(((cm0) in0Var2).c, ((cm0) in0Var3).c)) {
            return in0Var2;
        }
        return null;
    }

    @Override // defpackage.gn0
    public final void c(in0 in0Var) {
        this.g = (cm0) in0Var;
    }

    @Override // defpackage.bm0
    public final b2 d() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.zm0
    public final Object getValue() {
        return ((cm0) xl0.s(this.g, this)).c;
    }

    @Override // defpackage.p40
    public final void setValue(Object obj) {
        ql0 h;
        cm0 cm0Var = (cm0) xl0.f(this.g);
        if (this.f.g(cm0Var.c, obj)) {
            return;
        }
        cm0 cm0Var2 = this.g;
        synchronized (xl0.c) {
            h = xl0.h();
            ((cm0) xl0.n(cm0Var2, this, h, cm0Var)).c = obj;
        }
        xl0.l(h, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((cm0) xl0.f(this.g)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        b2 b2Var = b2.R;
        b2 b2Var2 = this.f;
        if (b2Var2.equals(b2Var)) {
            i2 = 0;
        } else if (b2Var2.equals(b2.W)) {
            i2 = 1;
        } else {
            if (!b2Var2.equals(b2.U)) {
                z6.m("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
