package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class k10 implements Map.Entry, fx {
    public final m10 e;
    public final int f;
    public final int g;

    public k10(m10 m10Var, int i) {
        this.e = m10Var;
        this.f = i;
        this.g = m10Var.l;
    }

    public final void a() {
        if (this.e.l != this.g) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return lw.i(entry.getKey(), getKey()) && lw.i(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.e.e[this.f];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.e.f;
        objArr.getClass();
        return objArr[this.f];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        m10 m10Var = this.e;
        m10Var.b();
        Object[] objArr = m10Var.f;
        if (objArr == null) {
            int length = m10Var.e.length;
            if (length < 0) {
                z6.l("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            m10Var.f = objArr;
        }
        int i = this.f;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
