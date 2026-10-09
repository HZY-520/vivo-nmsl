package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class uz implements Iterator, fx {
    public final CharSequence e;
    public int f;
    public int g;
    public int h;
    public int i;

    public uz(CharSequence charSequence) {
        this.e = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.i < 0) {
            this.f = 2;
            return false;
        }
        CharSequence charSequence = this.e;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.g; i4 < length2; i4++) {
            char charAt = charSequence.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f = 1;
                this.i = i;
                this.h = length;
                return true;
            }
        }
        i = -1;
        this.f = 1;
        this.i = i;
        this.h = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f = 0;
        int i = this.h;
        int i2 = this.g;
        this.g = this.i + i;
        return this.e.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
