package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class k7 implements Iterator, Map.Entry {
    public int e;
    public int f = -1;
    public boolean g;
    public final /* synthetic */ m7 h;

    public k7(m7 m7Var) {
        this.h = m7Var;
        this.e = m7Var.g - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.g) {
            z6.m("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f;
            m7 m7Var = this.h;
            if (lw.i(key, m7Var.e(i)) && lw.i(entry.getValue(), m7Var.h(this.f))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.g) {
            return this.h.e(this.f);
        }
        z6.m("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.g) {
            return this.h.h(this.f);
        }
        z6.m("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.g) {
            z6.m("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.f;
        m7 m7Var = this.h;
        Object e = m7Var.e(i);
        Object h = m7Var.h(this.f);
        return (e == null ? 0 : e.hashCode()) ^ (h != null ? h.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f++;
        this.g = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new IllegalStateException();
        }
        this.h.f(this.f);
        this.f--;
        this.e--;
        this.g = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.g) {
            return this.h.g(this.f, obj);
        }
        z6.m("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
