package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class mn implements Iterable {
    public dh0 e;
    public dh0 f;
    public final WeakHashMap g = new WeakHashMap();
    public int h = 0;
    public final HashMap i = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.ch0) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mn)) {
            return false;
        }
        mn mnVar = (mn) obj;
        if (this.h != mnVar.h) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = mnVar.iterator();
        while (true) {
            ch0 ch0Var = (ch0) it;
            if (!ch0Var.hasNext()) {
                break;
            }
            ch0 ch0Var2 = (ch0) it2;
            if (!ch0Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) ch0Var.next();
            Object next = ch0Var2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            ch0 ch0Var = (ch0) it;
            if (!ch0Var.hasNext()) {
                return i;
            }
            i += ((Map.Entry) ch0Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ch0 ch0Var = new ch0(this.e, this.f, 0);
        this.g.put(ch0Var, Boolean.FALSE);
        return ch0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            ch0 ch0Var = (ch0) it;
            if (!ch0Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) ch0Var.next()).toString());
            if (ch0Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
