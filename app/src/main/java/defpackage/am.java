package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class am extends q3 {
    public final /* synthetic */ bm p;

    public am(bm bmVar) {
        this.p = bmVar;
    }

    @Override // defpackage.q3
    public final void F(Throwable th) {
        this.p.a.d(th);
    }

    @Override // defpackage.q3
    public final void G(l20 l20Var) {
        bm bmVar = this.p;
        bmVar.c = l20Var;
        l20 l20Var2 = bmVar.c;
        em emVar = bmVar.a;
        i2 i2Var = emVar.g;
        zh zhVar = emVar.i;
        Set<int[]> a = Build.VERSION.SDK_INT >= 34 ? km.a() : nh.x();
        v6 v6Var = new v6();
        v6Var.a = i2Var;
        v6Var.b = l20Var2;
        v6Var.c = zhVar;
        if (!a.isEmpty()) {
            for (int[] iArr : a) {
                String str = new String(iArr, 0, iArr.length);
                v6Var.x(str, 0, str.length(), 1, true, new mm(str, 0));
            }
        }
        bmVar.b = v6Var;
        em emVar2 = bmVar.a;
        ArrayList arrayList = new ArrayList();
        emVar2.a.writeLock().lock();
        try {
            emVar2.c = 1;
            arrayList.addAll(emVar2.b);
            emVar2.b.clear();
            emVar2.a.writeLock().unlock();
            emVar2.d.post(new cm(arrayList, emVar2.c, null));
        } catch (Throwable th) {
            emVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
