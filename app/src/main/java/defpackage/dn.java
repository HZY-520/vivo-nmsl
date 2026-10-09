package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class dn extends w implements cn, Serializable {
    public final Enum[] e;

    public dn(Enum[] enumArr) {
        this.e = enumArr;
    }

    @Override // defpackage.m
    public final int a() {
        return this.e.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    @Override // defpackage.m, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        Enum r2;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.e;
            if (ordinal < enumArr.length) {
                r2 = enumArr[ordinal];
                return r2 != r3;
            }
        }
        r2 = null;
        if (r2 != r3) {
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.e;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        z6.f(j2.i("index: ", i, ", size: ", length));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[RETURN] */
    @Override // defpackage.w, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int indexOf(Object obj) {
        Enum r3;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.e;
            if (ordinal < enumArr.length) {
                r3 = enumArr[ordinal];
                if (r3 != r4) {
                    return ordinal;
                }
                return -1;
            }
        }
        r3 = null;
        if (r3 != r4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[RETURN] */
    @Override // defpackage.w, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int lastIndexOf(Object obj) {
        Enum r3;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.e;
            if (ordinal < enumArr.length) {
                r3 = enumArr[ordinal];
                if (r3 != r4) {
                    return ordinal;
                }
                return -1;
            }
        }
        r3 = null;
        if (r3 != r4) {
        }
    }
}
