package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class yv implements Iterable, fx {
    public final int e;
    public final int f;
    public final int g;

    public yv(int i, int i2, int i3) {
        if (i3 == 0) {
            z6.l("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            z6.l("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.e = i;
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                int i5 = i % i3;
                int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                i2 -= i6 < 0 ? i6 + i3 : i6;
            }
        } else {
            if (i3 >= 0) {
                z6.l("Step is zero.");
                throw null;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
        }
        this.f = i2;
        this.g = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof yv)) {
            return false;
        }
        if (isEmpty() && ((yv) obj).isEmpty()) {
            return true;
        }
        yv yvVar = (yv) obj;
        return this.e == yvVar.e && this.f == yvVar.f && this.g == yvVar.g;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.e * 31) + this.f) * 31) + this.g;
    }

    public boolean isEmpty() {
        int i = this.f;
        int i2 = this.g;
        int i3 = this.e;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zv(this.e, this.f, this.g);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f;
        int i2 = this.g;
        int i3 = this.e;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
