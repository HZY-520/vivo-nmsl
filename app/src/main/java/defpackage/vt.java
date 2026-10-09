package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vt {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final ut j;
    public boolean k;

    public vt(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? gc.f : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        ut utVar = new ut(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = utVar;
        arrayList.add(utVar);
    }

    public static void a(vt vtVar, ArrayList arrayList, jm0 jm0Var) {
        if (vtVar.k) {
            cv.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((ut) vtVar.i.get(r0.size() - 1)).j.add(new ct0("", arrayList, 0, jm0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final wt b() {
        if (this.k) {
            cv.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                ut utVar = this.j;
                wt wtVar = new wt(this.a, this.b, this.c, this.d, this.e, new ys0(utVar.a, utVar.b, utVar.c, utVar.d, utVar.e, utVar.f, utVar.g, utVar.h, utVar.i, utVar.j), this.f, this.g, this.h);
                this.k = true;
                return wtVar;
            }
            if (this.k) {
                cv.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            ut utVar2 = (ut) arrayList.remove(arrayList.size() - 1);
            ((ut) arrayList.get(arrayList.size() - 1)).j.add(new ys0(utVar2.a, utVar2.b, utVar2.c, utVar2.d, utVar2.e, utVar2.f, utVar2.g, utVar2.h, utVar2.i, utVar2.j));
        }
    }
}
