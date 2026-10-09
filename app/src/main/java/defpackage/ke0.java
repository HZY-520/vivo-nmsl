package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ke0 extends go0 implements uq {
    public List e;
    public List f;
    public List g;
    public l40 h;
    public l40 i;
    public l40 j;
    public Set k;
    public l40 l;
    public int m;
    public /* synthetic */ p5 n;
    public final /* synthetic */ le0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke0(le0 le0Var, ng ngVar) {
        super(3, ngVar);
        this.o = le0Var;
    }

    public static final void e(le0 le0Var, List list, List list2, List list3, l40 l40Var, l40 l40Var2, l40 l40Var3, l40 l40Var4) {
        char c;
        long j;
        long j2;
        synchronized (le0Var.c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    cf cfVar = (cf) list3.get(i);
                    cfVar.a();
                    le0Var.o(cfVar);
                }
                list3.clear();
                Object[] objArr = l40Var.b;
                long[] jArr = l40Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    cf cfVar2 = (cf) objArr[(i2 << 3) + i4];
                                    cfVar2.a();
                                    le0Var.o(cfVar2);
                                }
                                j3 >>= 8;
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
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                l40Var.b();
                Object[] objArr2 = l40Var2.b;
                long[] jArr2 = l40Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((cf) objArr2[(i5 << 3) + i7]).g();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                l40Var2.b();
                l40Var3.b();
                Object[] objArr3 = l40Var4.b;
                long[] jArr3 = l40Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    cf cfVar3 = (cf) objArr3[(i8 << 3) + i10];
                                    cfVar3.a();
                                    le0Var.o(cfVar3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                l40Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void f(List list, le0 le0Var) {
        list.clear();
        synchronized (le0Var.c) {
            try {
                ArrayList arrayList = le0Var.k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((r30) arrayList.get(i));
                }
                le0Var.k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.uq
    public final Object c(Object obj, Object obj2, Object obj3) {
        ke0 ke0Var = new ke0(this.o, (ng) obj3);
        ke0Var.n = (p5) obj2;
        ke0Var.invokeSuspend(fs0.a);
        return dh.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0126 -> B:6:0x012e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x01de -> B:22:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        p5 p5Var;
        l40 l40Var;
        l40 l40Var2;
        List list;
        Set set;
        final List list2;
        l40 l40Var3;
        List list3;
        l40 l40Var4;
        final List list4;
        final l40 l40Var5;
        final List list5;
        final l40 l40Var6;
        le0 le0Var;
        le0 le0Var2;
        Object obj2;
        ja jaVar;
        dh dhVar;
        p5 p5Var2;
        h40 h40Var;
        dh dhVar2 = dh.e;
        int i = this.m;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            t30.z(obj);
            p5Var = this.n;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i4 = hi0.a;
            l40Var = new l40();
            l40 l40Var7 = new l40();
            l40 l40Var8 = new l40();
            ii0 ii0Var = new ii0(l40Var8);
            l40Var2 = new l40();
            list = arrayList;
            set = ii0Var;
            list2 = arrayList2;
            l40Var3 = l40Var8;
            list3 = arrayList3;
            l40Var4 = l40Var7;
            le0Var2 = this.o;
            cn0 cn0Var = le0.y;
            synchronized (le0Var2.c) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l40 l40Var9 = this.l;
                set = this.k;
                l40Var3 = this.j;
                l40Var4 = this.i;
                l40Var = this.h;
                list3 = this.g;
                list2 = this.f;
                list = this.e;
                p5 p5Var3 = this.n;
                t30.z(obj);
                l40Var2 = l40Var9;
                p5Var = p5Var3;
                le0 le0Var3 = this.o;
                cn0 cn0Var2 = le0.y;
                synchronized (le0Var3.c) {
                    try {
                        k40 k40Var = le0Var3.l;
                        if (k40Var.e != 0) {
                            h40 b = u30.b(k40Var);
                            le0Var3.l.a();
                            p2 p2Var = le0Var3.m;
                            ((k40) p2Var.f).a();
                            ((k40) p2Var.g).a();
                            le0Var3.o.a();
                            h40Var = new h40(b.b);
                            Object[] objArr = b.a;
                            dhVar = dhVar2;
                            int i5 = 0;
                            for (int i6 = b.b; i5 < i6; i6 = i6) {
                                int i7 = i5;
                                r30 r30Var = (r30) objArr[i5];
                                h40Var.a(new k90(r30Var, le0Var3.n.g(r30Var)));
                                i5 = i7 + 1;
                                p5Var = p5Var;
                            }
                            p5Var2 = p5Var;
                            le0Var3.n.a();
                        } else {
                            dhVar = dhVar2;
                            p5Var2 = p5Var;
                            h40Var = o60.b;
                            h40Var.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = h40Var.a;
                int i8 = h40Var.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    k90 k90Var = (k90) objArr2[i9];
                }
                v6 v6Var = this.o.b;
                ((q7) v6Var.a).set(0);
                ((x7) v6Var.b).b(new l0(29, (byte) 0));
                dhVar2 = dhVar;
                p5Var = p5Var2;
                i2 = 2;
                i3 = 1;
                le0Var2 = this.o;
                cn0 cn0Var3 = le0.y;
                synchronized (le0Var2.c) {
                }
                le0 le0Var4 = this.o;
                this.n = p5Var;
                this.e = list;
                this.f = list2;
                this.g = list3;
                this.h = l40Var;
                this.i = l40Var4;
                this.j = l40Var3;
                this.k = set;
                this.l = l40Var2;
                this.m = i3;
                if (le0Var4.g()) {
                    obj2 = fs0.a;
                } else {
                    ja jaVar2 = new ja(i3, lr0.x(this));
                    jaVar2.r();
                    synchronized (le0Var4.c) {
                        if (le0Var4.g()) {
                            jaVar = jaVar2;
                        } else {
                            le0Var4.r = jaVar2;
                            jaVar = null;
                        }
                    }
                    if (jaVar != null) {
                        jaVar.resumeWith(fs0.a);
                    }
                    obj2 = jaVar2.p();
                    if (obj2 != dh.e) {
                        obj2 = fs0.a;
                    }
                }
                if (obj2 != dhVar2) {
                    List list6 = list;
                    l40Var5 = l40Var;
                    l40Var6 = l40Var2;
                    list4 = list3;
                    list5 = list6;
                    final Set set2 = set;
                    final l40 l40Var10 = l40Var4;
                    final l40 l40Var11 = l40Var3;
                    le0Var = this.o;
                    cn0 cn0Var4 = le0.y;
                    if (le0Var.n()) {
                        List list7 = list4;
                        l40Var2 = l40Var6;
                        l40Var = l40Var5;
                        list = list5;
                        list3 = list7;
                        l40Var3 = l40Var11;
                        l40Var4 = l40Var10;
                        set = set2;
                        le0Var2 = this.o;
                        cn0 cn0Var32 = le0.y;
                        synchronized (le0Var2.c) {
                        }
                    } else {
                        final le0 le0Var5 = this.o;
                        pq pqVar = new pq() { // from class: je0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.pq
                            public final Object invoke(Object obj3) {
                                boolean d;
                                fs0 fs0Var;
                                Object[] objArr3;
                                boolean z;
                                fs0 fs0Var2 = fs0.a;
                                le0 le0Var6 = le0.this;
                                l40 l40Var12 = l40Var11;
                                l40 l40Var13 = l40Var6;
                                List list8 = list5;
                                List list9 = list2;
                                l40 l40Var14 = l40Var5;
                                List list10 = list4;
                                l40 l40Var15 = l40Var10;
                                Set set3 = set2;
                                final long longValue = ((Long) obj3).longValue();
                                cn0 cn0Var5 = le0.y;
                                synchronized (le0Var6.c) {
                                    d = le0Var6.d();
                                }
                                boolean z2 = 0;
                                if (d) {
                                    Trace.beginSection("Recomposer:animation");
                                    try {
                                        ((x7) le0Var6.a.g).b(new pq() { // from class: g9
                                            @Override // defpackage.pq
                                            public final Object invoke(Object obj4) {
                                                ja jaVar3;
                                                Object qf0Var;
                                                long j = longValue;
                                                h9 h9Var = (h9) obj4;
                                                pq pqVar2 = h9Var.b;
                                                if (pqVar2 != null && (jaVar3 = h9Var.a) != null) {
                                                    try {
                                                        qf0Var = pqVar2.invoke(Long.valueOf(j));
                                                    } catch (Throwable th2) {
                                                        qf0Var = new qf0(th2);
                                                    }
                                                    jaVar3.resumeWith(qf0Var);
                                                }
                                                return fs0.a;
                                            }
                                        });
                                        synchronized (xl0.c) {
                                            l40 l40Var16 = xl0.j.h;
                                            if (l40Var16 != null) {
                                                z = l40Var16.h();
                                            }
                                        }
                                        if (z) {
                                            xl0.c();
                                        }
                                    } finally {
                                    }
                                }
                                Trace.beginSection("Recomposer:recompose");
                                try {
                                    le0Var6.n();
                                    synchronized (le0Var6.c) {
                                        try {
                                            t40 t40Var = le0Var6.i;
                                            Object[] objArr4 = t40Var.e;
                                            int i10 = t40Var.g;
                                            for (int i11 = 0; i11 < i10; i11++) {
                                                list8.add((cf) objArr4[i11]);
                                            }
                                            le0Var6.i.g();
                                        } finally {
                                        }
                                    }
                                    l40Var12.b();
                                    l40Var13.b();
                                    while (true) {
                                        if (list8.isEmpty() && list9.isEmpty()) {
                                            break;
                                        }
                                        fs0Var = fs0Var2;
                                        try {
                                            int size = list8.size();
                                            for (int i12 = 0; i12 < size; i12++) {
                                                cf cfVar = (cf) list8.get(i12);
                                                cf l = le0Var6.l(cfVar, l40Var12);
                                                if (l != null) {
                                                    list10.add(l);
                                                }
                                                l40Var13.a(cfVar);
                                            }
                                            list8.clear();
                                            if (l40Var12.h() || le0Var6.i.g != 0) {
                                                synchronized (le0Var6.c) {
                                                    try {
                                                        List h = le0Var6.h();
                                                        int size2 = h.size();
                                                        for (int i13 = 0; i13 < size2; i13++) {
                                                            cf cfVar2 = (cf) h.get(i13);
                                                            if (!l40Var13.c(cfVar2) && cfVar2.q(set3)) {
                                                                list8.add(cfVar2);
                                                            }
                                                        }
                                                        t40 t40Var2 = le0Var6.i;
                                                        int i14 = t40Var2.g;
                                                        int i15 = 0;
                                                        int i16 = 0;
                                                        while (true) {
                                                            objArr3 = t40Var2.e;
                                                            if (i15 >= i14) {
                                                                break;
                                                            }
                                                            cf cfVar3 = (cf) objArr3[i15];
                                                            if (!l40Var13.c(cfVar3) && !list8.contains(cfVar3)) {
                                                                list8.add(cfVar3);
                                                                i16++;
                                                            } else if (i16 > 0) {
                                                                Object[] objArr5 = t40Var2.e;
                                                                objArr5[i15 - i16] = objArr5[i15];
                                                            }
                                                            i15++;
                                                        }
                                                        int i17 = i14 - i16;
                                                        Arrays.fill(objArr3, i17, i14, (Object) null);
                                                        t40Var2.g = i17;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (list8.isEmpty()) {
                                                try {
                                                    ke0.f(list9, le0Var6);
                                                    while (!list9.isEmpty()) {
                                                        List k = le0Var6.k(list9, l40Var12);
                                                        l40Var14.getClass();
                                                        Iterator it = k.iterator();
                                                        while (it.hasNext()) {
                                                            l40Var14.j(it.next());
                                                        }
                                                        ke0.f(list9, le0Var6);
                                                    }
                                                } catch (Throwable th2) {
                                                    le0Var6.m(th2, null);
                                                    ke0.e(le0Var6, list8, list9, list10, l40Var14, l40Var15, l40Var12, l40Var13);
                                                    return fs0Var;
                                                }
                                            }
                                            fs0Var2 = fs0Var;
                                            z2 = 0;
                                        } catch (Throwable th3) {
                                            try {
                                                le0Var6.m(th3, null);
                                                ke0.e(le0Var6, list8, list9, list10, l40Var14, l40Var15, l40Var12, l40Var13);
                                                list8.clear();
                                                return fs0Var;
                                            } catch (Throwable th4) {
                                                list8.clear();
                                                throw th4;
                                            }
                                        }
                                    }
                                    ql0 h2 = xl0.h();
                                    ql0 ar0Var = h2 instanceof o40 ? new ar0((o40) h2, null, null, true, false) : new br0(h2, null, true, z2);
                                    try {
                                        ql0 j = ar0Var.j();
                                        try {
                                            if (!list10.isEmpty()) {
                                                try {
                                                    int size3 = list10.size();
                                                    for (int i18 = z2; i18 < size3; i18++) {
                                                        l40Var15.a((cf) list10.get(i18));
                                                    }
                                                    int size4 = list10.size();
                                                    for (int i19 = z2; i19 < size4; i19++) {
                                                        ((cf) list10.get(i19)).d();
                                                    }
                                                } catch (Throwable th5) {
                                                    try {
                                                        le0Var6.m(th5, null);
                                                        ke0.e(le0Var6, list8, list9, list10, l40Var14, l40Var15, l40Var12, l40Var13);
                                                        Trace.endSection();
                                                        return fs0Var2;
                                                    } finally {
                                                        list10.clear();
                                                    }
                                                }
                                            }
                                            if (l40Var14.h()) {
                                                try {
                                                    l40Var15.i(l40Var14);
                                                    Object[] objArr6 = l40Var14.b;
                                                    long[] jArr = l40Var14.a;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        int i20 = 0;
                                                        while (true) {
                                                            long j2 = jArr[i20];
                                                            Object[] objArr7 = objArr6;
                                                            fs0Var = fs0Var2;
                                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i21 = 8 - ((~(i20 - length)) >>> 31);
                                                                for (int i22 = 0; i22 < i21; i22++) {
                                                                    if ((j2 & 255) < 128) {
                                                                        try {
                                                                            ((cf) objArr7[(i20 << 3) + i22]).f();
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            try {
                                                                                le0Var6.m(th, null);
                                                                                ke0.e(le0Var6, list8, list9, list10, l40Var14, l40Var15, l40Var12, l40Var13);
                                                                                return fs0Var;
                                                                            } finally {
                                                                                l40Var14.b();
                                                                            }
                                                                        }
                                                                    }
                                                                    j2 >>= 8;
                                                                }
                                                                if (i21 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i20 == length) {
                                                                break;
                                                            }
                                                            i20++;
                                                            fs0Var2 = fs0Var;
                                                            objArr6 = objArr7;
                                                        }
                                                    } else {
                                                        fs0Var = fs0Var2;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    fs0Var = fs0Var2;
                                                }
                                            } else {
                                                fs0Var = fs0Var2;
                                            }
                                            if (l40Var15.h()) {
                                                try {
                                                    Object[] objArr8 = l40Var15.b;
                                                    long[] jArr2 = l40Var15.a;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        int i23 = 0;
                                                        while (true) {
                                                            long j3 = jArr2[i23];
                                                            Object[] objArr9 = objArr8;
                                                            long[] jArr3 = jArr2;
                                                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                                                for (int i25 = 0; i25 < i24; i25++) {
                                                                    if ((j3 & 255) < 128) {
                                                                        ((cf) objArr9[(i23 << 3) + i25]).g();
                                                                    }
                                                                    j3 >>= 8;
                                                                }
                                                                if (i24 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i23 == length2) {
                                                                break;
                                                            }
                                                            i23++;
                                                            objArr8 = objArr9;
                                                            jArr2 = jArr3;
                                                        }
                                                    }
                                                } catch (Throwable th8) {
                                                    try {
                                                        le0Var6.m(th8, null);
                                                        ke0.e(le0Var6, list8, list9, list10, l40Var14, l40Var15, l40Var12, l40Var13);
                                                        ql0.q(j);
                                                        return fs0Var;
                                                    } finally {
                                                        l40Var15.b();
                                                    }
                                                }
                                            }
                                            ar0Var.c();
                                            synchronized (le0Var6.c) {
                                                if (le0Var6.c() != null) {
                                                    ue.a("unexpected to get continuation here");
                                                }
                                            }
                                            xl0.h().m();
                                            l40Var13.b();
                                            l40Var12.b();
                                            le0Var6.q = null;
                                            return fs0Var;
                                        } finally {
                                            ql0.q(j);
                                        }
                                    } finally {
                                        ar0Var.c();
                                    }
                                } finally {
                                }
                            }
                        };
                        this.n = p5Var;
                        this.e = list5;
                        this.f = list2;
                        this.g = list4;
                        this.h = l40Var5;
                        this.i = l40Var10;
                        this.j = l40Var11;
                        this.k = set2;
                        this.l = l40Var6;
                        this.m = i2;
                        if (p5Var.c(pqVar, this) != dhVar2) {
                            List list8 = list4;
                            l40Var2 = l40Var6;
                            l40Var = l40Var5;
                            list = list5;
                            list3 = list8;
                            l40Var3 = l40Var11;
                            l40Var4 = l40Var10;
                            set = set2;
                            le0 le0Var32 = this.o;
                            cn0 cn0Var22 = le0.y;
                            synchronized (le0Var32.c) {
                            }
                        }
                    }
                }
                return dhVar2;
            }
            l40 l40Var12 = this.l;
            set = this.k;
            l40Var3 = this.j;
            l40Var4 = this.i;
            l40 l40Var13 = this.h;
            List list9 = this.g;
            list2 = this.f;
            List list10 = this.e;
            p5 p5Var4 = this.n;
            t30.z(obj);
            l40Var6 = l40Var12;
            p5Var = p5Var4;
            list4 = list9;
            list5 = list10;
            l40Var5 = l40Var13;
            final Set set22 = set;
            final l40 l40Var102 = l40Var4;
            final l40 l40Var112 = l40Var3;
            le0Var = this.o;
            cn0 cn0Var42 = le0.y;
            if (le0Var.n()) {
            }
        }
    }
}
