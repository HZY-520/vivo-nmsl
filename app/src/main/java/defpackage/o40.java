package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class o40 extends ql0 {
    public static final int[] n = new int[0];
    public final pq e;
    public final pq f;
    public int g;
    public l40 h;
    public ArrayList i;
    public vl0 j;
    public int[] k;
    public int l;
    public boolean m;

    public o40(long j, vl0 vl0Var, pq pqVar, pq pqVar2) {
        super(j, vl0Var);
        this.e = pqVar;
        this.f = pqVar2;
        this.j = vl0.i;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (xl0.c) {
            this.j = this.j.e(j);
        }
    }

    public void B(l40 l40Var) {
        this.h = l40Var;
    }

    public o40 C(pq pqVar, pq pqVar2) {
        m50 m50Var;
        if (this.c) {
            dd0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            dd0.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = xl0.c;
        synchronized (obj) {
            long j = xl0.e;
            xl0.e = j + 1;
            xl0.d = xl0.d.e(j);
            vl0 d = d();
            r(d.e(j));
            m50Var = new m50(j, xl0.a(d, g() + 1, j), xl0.i(pqVar, e(), true), xl0.j(pqVar2, i()), this);
        }
        if (this.m || this.c) {
            return m50Var;
        }
        long g = g();
        synchronized (obj) {
            long j2 = xl0.e;
            xl0.e = j2 + 1;
            s(j2);
            xl0.d = xl0.d.e(g());
        }
        r(xl0.a(d(), g + 1, g()));
        return m50Var;
    }

    @Override // defpackage.ql0
    public final void b() {
        xl0.d = xl0.d.b(g()).a(this.j);
    }

    @Override // defpackage.ql0
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (xl0.c) {
            o();
        }
        l();
    }

    @Override // defpackage.ql0
    public boolean f() {
        return false;
    }

    @Override // defpackage.ql0
    public int h() {
        return this.g;
    }

    @Override // defpackage.ql0
    public pq i() {
        return this.f;
    }

    @Override // defpackage.ql0
    public void k() {
        this.l++;
    }

    @Override // defpackage.ql0
    public void l() {
        if (this.l <= 0) {
            dd0.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        l40 x = x();
        if (x != null) {
            if (this.m) {
                dd0.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long g = g();
            Object[] objArr = x.b;
            long[] jArr = x.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (in0 a = ((gn0) objArr[(i2 << 3) + i4]).a(); a != null; a = a.b) {
                                    long j2 = a.a;
                                    if (j2 == g || ac.Y(this.j, Long.valueOf(j2))) {
                                        zh0 zh0Var = xl0.a;
                                        a.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.ql0
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.ql0
    public void n(gn0 gn0Var) {
        l40 x = x();
        if (x == null) {
            int i = hi0.a;
            x = new l40();
            B(x);
        }
        x.a(gn0Var);
    }

    @Override // defpackage.ql0
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            xl0.t(this.k[i]);
        }
        o();
    }

    @Override // defpackage.ql0
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.ql0
    public ql0 u(pq pqVar) {
        n50 n50Var;
        if (this.c) {
            dd0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            dd0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g = g();
        A(g());
        Object obj = xl0.c;
        synchronized (obj) {
            long j = xl0.e;
            xl0.e = j + 1;
            xl0.d = xl0.d.e(j);
            n50Var = new n50(j, xl0.a(d(), g + 1, j), xl0.i(pqVar, e(), true), this);
        }
        if (this.m || this.c) {
            return n50Var;
        }
        long g2 = g();
        synchronized (obj) {
            long j2 = xl0.e;
            xl0.e = j2 + 1;
            s(j2);
            xl0.d = xl0.d.e(g());
        }
        r(xl0.a(d(), g2 + 1, g()));
        return n50Var;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long g = g();
        synchronized (xl0.c) {
            long j = xl0.e;
            xl0.e = j + 1;
            s(j);
            xl0.d = xl0.d.e(g());
        }
        r(xl0.a(d(), g + 1, g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[LOOP:1: B:31:0x00a9->B:32:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m20 w() {
        HashMap hashMap;
        List list;
        l40 l40Var;
        long j;
        long j2;
        ArrayList arrayList;
        int size;
        int i;
        l40 x = x();
        if (x != null) {
            long j3 = xl0.j.b;
            hashMap = xl0.m(j3, this, xl0.d.b(j3));
        } else {
            hashMap = null;
        }
        um umVar = um.e;
        synchronized (xl0.c) {
            try {
                xl0.v(this);
                if (x != null && x.d != 0) {
                    zr zrVar = xl0.j;
                    m20 z = z(xl0.e, x, hashMap, xl0.d.b(zrVar.b));
                    if (!z.equals(tl0.c)) {
                        return z;
                    }
                    b();
                    l40Var = zrVar.h;
                    xl0.u(zrVar, xl0.a);
                    B(null);
                    zrVar.h = null;
                    list = xl0.h;
                    this.m = true;
                    if (l40Var != null) {
                        ii0 ii0Var = new ii0(l40Var);
                        if (!l40Var.g()) {
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((tq) list.get(i2)).invoke(ii0Var, this);
                            }
                        }
                    }
                    if (x != null && x.h()) {
                        ii0 ii0Var2 = new ii0(x);
                        size = list.size();
                        for (i = 0; i < size; i++) {
                            ((tq) list.get(i)).invoke(ii0Var2, this);
                        }
                    }
                    synchronized (xl0.c) {
                        try {
                            p();
                            xl0.d();
                            if (l40Var != null) {
                                Object[] objArr = l40Var.b;
                                long[] jArr = l40Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    j = 128;
                                    while (true) {
                                        long j4 = jArr[i3];
                                        j2 = 255;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j4 & 255) < 128) {
                                                    xl0.p((gn0) objArr[(i3 << 3) + i5]);
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i4 != 8) {
                                                break;
                                            }
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (x != null) {
                                        Object[] objArr2 = x.b;
                                        long[] jArr2 = x.a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i6 = 0;
                                            while (true) {
                                                long j5 = jArr2[i6];
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                                    for (int i8 = 0; i8 < i7; i8++) {
                                                        if ((j5 & j2) < j) {
                                                            xl0.p((gn0) objArr2[(i6 << 3) + i8]);
                                                        }
                                                        j5 >>= 8;
                                                    }
                                                    if (i7 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i6 == length2) {
                                                    break;
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    arrayList = this.i;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i9 = 0; i9 < size3; i9++) {
                                            xl0.p((gn0) arrayList.get(i9));
                                        }
                                    }
                                    this.i = null;
                                }
                            }
                            j = 128;
                            j2 = 255;
                            if (x != null) {
                            }
                            arrayList = this.i;
                            if (arrayList != null) {
                            }
                            this.i = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return tl0.c;
                }
                b();
                zr zrVar2 = xl0.j;
                l40 l40Var2 = zrVar2.h;
                xl0.u(zrVar2, xl0.a);
                if (l40Var2 == null || !l40Var2.h()) {
                    list = umVar;
                    l40Var = null;
                } else {
                    list = xl0.h;
                    l40Var = l40Var2;
                }
                this.m = true;
                if (l40Var != null) {
                }
                if (x != null) {
                    ii0 ii0Var22 = new ii0(x);
                    size = list.size();
                    while (i < size) {
                    }
                }
                synchronized (xl0.c) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public l40 x() {
        return this.h;
    }

    @Override // defpackage.ql0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public pq e() {
        return this.e;
    }

    public final m20 z(long j, l40 l40Var, HashMap hashMap, vl0 vl0Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        vl0 vl0Var2;
        Object[] objArr;
        long[] jArr;
        vl0 vl0Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        in0 b;
        vl0 d = d().e(g()).d(this.j);
        Object[] objArr3 = l40Var.b;
        long[] jArr3 = l40Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            gn0 gn0Var = (gn0) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            in0 a = gn0Var.a();
                            i = i4;
                            ArrayList arrayList5 = arrayList3;
                            in0 r = xl0.r(a, j, vl0Var);
                            if (r == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                in0 r2 = xl0.r(a, g(), d);
                                if (r2 != null && r2.a != 1 && !r.equals(r2)) {
                                    vl0Var3 = d;
                                    in0 r3 = xl0.r(a, g(), d());
                                    if (r3 == null) {
                                        xl0.q();
                                        throw null;
                                    }
                                    if (hashMap == null || (b = (in0) hashMap.get(r)) == null) {
                                        b = gn0Var.b(r2, r, r3);
                                    }
                                    if (b == null) {
                                        return new sl0(this);
                                    }
                                    if (!b.equals(r3)) {
                                        if (b.equals(r)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new k90(gn0Var, r.b(g())));
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(gn0Var);
                                            arrayList3 = arrayList6;
                                        } else {
                                            arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList3.add(!b.equals(r2) ? new k90(gn0Var, b) : new k90(gn0Var, r2.b(g())));
                                            arrayList2 = arrayList4;
                                        }
                                    }
                                    arrayList3 = arrayList5;
                                    arrayList2 = arrayList4;
                                }
                            }
                            vl0Var3 = d;
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            vl0Var3 = d;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        d = vl0Var3;
                    }
                    vl0Var2 = d;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    vl0Var2 = d;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                d = vl0Var2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                k90 k90Var = (k90) arrayList3.get(i5);
                gn0 gn0Var2 = (gn0) k90Var.e;
                in0 in0Var = (in0) k90Var.f;
                in0Var.a = j;
                synchronized (xl0.c) {
                    in0Var.b = gn0Var2.a();
                    gn0Var2.c(in0Var);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                l40Var.k((gn0) arrayList2.get(i6));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = ac.g0(arrayList7, arrayList2);
            }
            this.i = arrayList2;
        }
        return tl0.c;
    }
}
