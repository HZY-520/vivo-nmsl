package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class a0 implements pq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Collection f;

    public /* synthetic */ a0(int i, Collection collection) {
        this.e = i;
        this.f = collection;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        boolean contains;
        int i = this.e;
        Collection<?> collection = this.f;
        switch (i) {
            case 0:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
