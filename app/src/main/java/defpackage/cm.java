package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class cm implements Runnable {
    public final ArrayList e;
    public final int f;

    public cm(List list, int i, Throwable th) {
        m20.d(list, "initCallbacks cannot be null");
        this.e = new ArrayList(list);
        this.f = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        if (this.f != 1) {
            while (i < size) {
                ((ai) arrayList.get(i)).b.f = lw.m;
                i++;
            }
            return;
        }
        while (i < size) {
            ai aiVar = (ai) arrayList.get(i);
            aiVar.a.setValue(Boolean.TRUE);
            aiVar.b.f = new cu(true);
            i++;
        }
    }
}
