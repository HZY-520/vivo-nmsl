package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class d10 {
    public final int a;
    public final t3 b;
    public final i2 c;
    public int d;
    public int e;
    public int f;

    public d10(int i) {
        this.a = i;
        if (i <= 0) {
            z6.l("maxSize <= 0");
            throw null;
        }
        this.b = new t3(12);
        this.c = new i2(24);
    }

    public final Object a(Object obj) {
        synchronized (this.c) {
            Object obj2 = ((LinkedHashMap) this.b.f).get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00aa, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        synchronized (this.c) {
            this.d++;
            put = ((LinkedHashMap) this.b.f).put(obj, obj2);
            if (put != null) {
                this.d--;
            }
        }
        int i = this.a;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (((LinkedHashMap) this.b.f).isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d <= i || ((LinkedHashMap) this.b.f).isEmpty()) {
                        break;
                    }
                    Set entrySet = ((LinkedHashMap) this.b.f).entrySet();
                    entrySet.getClass();
                    Set set = entrySet;
                    Object obj3 = null;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (!list.isEmpty()) {
                            obj3 = list.get(0);
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            obj3 = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj3;
                    if (entry == null) {
                        return put;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    t3 t3Var = this.b;
                    key.getClass();
                    ((LinkedHashMap) t3Var.f).remove(key);
                    int i2 = this.d;
                    value.getClass();
                    this.d = i2 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
