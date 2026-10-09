package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class t implements Iterator, fx {
    public final /* synthetic */ int e = 0;
    public int f;
    public final Object g;

    public t(Object[] objArr) {
        objArr.getClass();
        this.g = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                if (this.f < ((w) obj).a()) {
                    break;
                }
                break;
            default:
                if (this.f < ((Object[]) obj).length) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f;
                this.f = i2 + 1;
                return ((w) obj).get(i2);
            default:
                try {
                    int i3 = this.f;
                    this.f = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t(w wVar) {
        this.g = wVar;
    }
}
