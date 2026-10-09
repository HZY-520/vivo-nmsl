package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class p10 implements Map.Entry, fx {
    public final /* synthetic */ int e;
    public final Object f;
    public final Object g;

    public /* synthetic */ p10(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.e) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && lw.i(entry.getKey(), this.f) && lw.i(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.e) {
        }
        return this.f;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.e) {
        }
        return this.g;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.e) {
            case 0:
                Object obj = this.f;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return hashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.e) {
            case 0:
                return this.f + "=" + getValue();
            default:
                return super.toString();
        }
    }
}
