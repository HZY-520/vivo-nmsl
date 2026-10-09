package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class l9 extends x {
    public final /* synthetic */ int g = 1;
    public final Object h;

    public l9(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.h = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.e;
                this.e = i2 + 1;
                return ((Object[]) obj)[i2];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.e++;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.e - 1;
                this.e = i2;
                return ((Object[]) obj)[i2];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.e--;
                return obj;
        }
    }

    public l9(int i, Object obj) {
        super(i, 1);
        this.h = obj;
    }
}
