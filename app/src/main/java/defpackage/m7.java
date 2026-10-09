package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class m7 extends fl0 implements Map {
    public h7 h;
    public j7 i;
    public l7 j;

    @Override // java.util.Map
    public final Set entrySet() {
        h7 h7Var = this.h;
        if (h7Var != null) {
            return h7Var;
        }
        h7 h7Var2 = new h7(this);
        this.h = h7Var2;
        return h7Var2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i = this.g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.g;
    }

    @Override // java.util.Map
    public final Set keySet() {
        j7 j7Var = this.i;
        if (j7Var != null) {
            return j7Var;
        }
        j7 j7Var2 = new j7(this);
        this.i = j7Var2;
        return j7Var2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.g;
        int i = this.g;
        int[] iArr = this.e;
        if (iArr.length < size) {
            this.e = Arrays.copyOf(iArr, size);
            this.f = Arrays.copyOf(this.f, size * 2);
        }
        if (this.g != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        l7 l7Var = this.j;
        if (l7Var != null) {
            return l7Var;
        }
        l7 l7Var2 = new l7(this);
        this.j = l7Var2;
        return l7Var2;
    }
}
