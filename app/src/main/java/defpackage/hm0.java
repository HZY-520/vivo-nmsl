package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class hm0 {
    public final w2 a;
    public boolean c;
    public b70 h;
    public gm0 i;
    public final AtomicReference b = new AtomicReference(null);
    public final n d = new n(10, this);
    public final l e = new l(27, this);
    public final t40 f = new t40(new gm0[16]);
    public final Object g = new Object();
    public long j = -1;

    public hm0(w2 w2Var) {
        this.a = w2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        ue.b("Unexpected notification");
                        throw new id();
                    }
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                t40 t40Var = this.f;
                Object[] objArr = t40Var.e;
                int i = t40Var.g;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((gm0) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0215 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0248 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj, pq pqVar, eq eqVar) {
        t40 t40Var;
        Object obj2;
        gm0 gm0Var;
        boolean z;
        gm0 gm0Var2;
        long j;
        long j2;
        gm0 gm0Var3;
        ql0 ar0Var;
        long j3;
        Object obj3;
        g40 g40Var;
        Object obj4;
        int i;
        long j4;
        g40 g40Var2;
        long c = v10.c();
        synchronized (this.g) {
            t40Var = this.f;
            Object[] objArr = t40Var.e;
            int i2 = t40Var.g;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((gm0) obj2).a == pqVar) {
                    break;
                } else {
                    i3++;
                }
            }
            gm0Var = (gm0) obj2;
            z = true;
            if (gm0Var == null) {
                pqVar.getClass();
                lr0.e(1, pqVar);
                gm0Var = new gm0(pqVar);
                t40Var.b(gm0Var);
            }
            gm0Var2 = this.i;
            j = this.j;
        }
        long j5 = t40Var;
        if (j != -1) {
            j5 = t40Var;
            if (j != c) {
                String name = Thread.currentThread().getName();
                StringBuilder sb = new StringBuilder("Detected multithreaded access to SnapshotStateObserver: previousThreadId=");
                sb.append(j);
                sb.append("), currentThread={id=");
                sb.append(c);
                sb.append(", name=");
                sb.append(name);
                sb.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                dd0.a(sb.toString());
                j5 = sb;
            }
        }
        try {
            synchronized (this.g) {
                try {
                    this.i = gm0Var;
                    this.j = c;
                } catch (Throwable th) {
                    th = th;
                    j2 = j5;
                }
            }
            l lVar = this.e;
            Object obj5 = gm0Var.b;
            g40 g40Var3 = gm0Var.c;
            int i4 = gm0Var.d;
            gm0Var.b = obj;
            gm0Var.c = (g40) gm0Var.f.g(obj);
            if (gm0Var.d == -1) {
                gm0Var.d = Long.hashCode(xl0.h().g());
            }
            fr frVar = gm0Var.i;
            t40 a = dm0.a();
            try {
                a.b(frVar);
                if (lVar == null) {
                    eqVar.b();
                    gm0Var3 = gm0Var;
                } else {
                    ql0 ql0Var = (ql0) xl0.b.n();
                    if (ql0Var instanceof ar0) {
                        gm0Var3 = gm0Var;
                        if (((ar0) ql0Var).t == v10.c()) {
                            pq pqVar2 = ((ar0) ql0Var).r;
                            pq pqVar3 = ((ar0) ql0Var).s;
                            try {
                                ((ar0) ql0Var).r = xl0.i(lVar, pqVar2, true);
                                ((ar0) ql0Var).s = pqVar3;
                                eqVar.b();
                                ((ar0) ql0Var).r = pqVar2;
                                ((ar0) ql0Var).s = pqVar3;
                            } catch (Throwable th2) {
                                ((ar0) ql0Var).r = pqVar2;
                                ((ar0) ql0Var).s = pqVar3;
                                throw th2;
                            }
                        }
                    } else {
                        gm0Var3 = gm0Var;
                    }
                    if (ql0Var == null || (ql0Var instanceof o40)) {
                        ar0Var = new ar0(ql0Var instanceof o40 ? (o40) ql0Var : null, lVar, null, true, false);
                    } else {
                        ar0Var = ql0Var.u(lVar);
                    }
                    try {
                        ql0 j6 = ar0Var.j();
                        try {
                            eqVar.b();
                            ql0.q(j6);
                            ar0Var.c();
                        } catch (Throwable th3) {
                            try {
                                ql0.q(j6);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    ar0Var.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    a.j(a.g - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                a.j(a.g - 1);
                gm0 gm0Var4 = gm0Var3;
                Object obj6 = gm0Var4.b;
                obj6.getClass();
                int i5 = gm0Var4.d;
                g40 g40Var4 = gm0Var4.c;
                if (g40Var4 != null) {
                    try {
                        long[] jArr = g40Var4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j7 = jArr[i6];
                                boolean z2 = z;
                                g40 g40Var5 = g40Var4;
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j7 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j7;
                                            g40Var2 = g40Var5;
                                            Object obj7 = g40Var2.b[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = g40Var2.c[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    k40 k40Var = gm0Var4.e;
                                                    u10.C(k40Var, obj7, obj6);
                                                    obj4 = obj6;
                                                    if ((obj7 instanceof aj) && !k40Var.c(obj7)) {
                                                        u10.D(gm0Var4.l, obj7);
                                                        gm0Var4.m.remove(obj7);
                                                    }
                                                } else {
                                                    obj4 = obj6;
                                                }
                                                if (z3) {
                                                    g40Var2.e(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.g) {
                                                    this.i = gm0Var2;
                                                    this.j = j2;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            obj4 = obj6;
                                            i = i8;
                                            j4 = j7;
                                            g40Var2 = g40Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j8 = j3;
                                        g40Var5 = g40Var2;
                                        j7 = j4 >> 8;
                                        j = j8;
                                        obj6 = obj4;
                                    }
                                    obj3 = obj6;
                                    g40Var = g40Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    obj3 = obj6;
                                    g40Var = g40Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                g40Var4 = g40Var;
                                z = z2;
                                j = j3;
                                obj6 = obj3;
                            }
                            gm0Var4.b = obj5;
                            gm0Var4.c = g40Var3;
                            gm0Var4.d = i4;
                            synchronized (this.g) {
                                this.i = gm0Var2;
                                this.j = j3;
                            }
                            return;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.g) {
                        }
                    }
                }
                j3 = j;
                gm0Var4.b = obj5;
                gm0Var4.c = g40Var3;
                gm0Var4.d = i4;
                synchronized (this.g) {
                }
            } catch (Throwable th9) {
                th = th9;
                a.j(a.g - 1);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }
}
