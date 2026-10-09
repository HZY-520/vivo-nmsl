package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class jr implements eq {
    public final /* synthetic */ kr e;

    public jr(kr krVar) {
        this.e = krVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eq
    public final Object b() {
        ArrayList arrayList = this.e.a;
        k40 k40Var = new k40(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mx mxVar = (mx) arrayList.get(i);
            Object obj = mxVar.b;
            int i2 = mxVar.a;
            Object dxVar = obj != null ? new dx(Integer.valueOf(i2), mxVar.b) : Integer.valueOf(i2);
            int f = k40Var.f(dxVar);
            boolean z = f < 0;
            Object obj2 = z ? null : k40Var.c[f];
            if (obj2 != null) {
                if (obj2 instanceof h40) {
                    h40 h40Var = (h40) obj2;
                    h40Var.a(mxVar);
                    mxVar = h40Var;
                } else {
                    Object[] objArr = o60.a;
                    h40 h40Var2 = new h40(2);
                    h40Var2.a(obj2);
                    h40Var2.a(mxVar);
                    mxVar = h40Var2;
                }
            }
            if (z) {
                int i3 = ~f;
                k40Var.b[i3] = dxVar;
                k40Var.c[i3] = mxVar;
            } else {
                k40Var.c[f] = mxVar;
            }
        }
        return new u30(k40Var);
    }
}
