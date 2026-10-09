package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class bl0 extends n0 implements ao, bo {
    public final int i;
    public final int j;
    public final m9 k;
    public Object[] l;
    public long m;
    public long n;
    public int o;
    public int p;

    public bl0(int i, int i2, m9 m9Var) {
        this.i = i;
        this.j = i2;
        this.k = m9Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(7:(2:3|(10:5|6|7|(2:9|(1:(1:(7:13|14|15|16|17|(3:18|19|(10:28|(2:33|34)|36|(1:38)|15|16|17|18|19|(0)(1:21))(0))|25)(2:39|40))(5:41|42|17|(3:18|19|(0)(0))|25))(4:43|44|45|46))(1:57)|47|48|16|17|(3:18|19|(0)(0))|25))|47|48|16|17|(3:18|19|(0)(0))|25)|59|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0036, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x002f, B:18:0x0075, B:21:0x007f, B:30:0x0092, B:33:0x0099, B:34:0x009d, B:36:0x009e, B:42:0x0047), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v1, types: [n0] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [bl0] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [bo] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [o0] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [cl0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [cl0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ac -> B:15:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(bl0 bl0Var, bo boVar, ng ngVar) {
        al0 al0Var;
        int i;
        ?? r4;
        bo boVar2;
        ww wwVar;
        ww wwVar2;
        bo boVar3;
        Object s;
        mm mmVar;
        dh dhVar;
        cl0 cl0Var;
        try {
            if (ngVar instanceof al0) {
                al0Var = (al0) ngVar;
                int i2 = al0Var.k;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    al0Var.k = i2 - Integer.MIN_VALUE;
                    Object obj = al0Var.i;
                    i = al0Var.k;
                    if (i != 0) {
                        t30.z(obj);
                        boVar2 = boVar;
                        boVar = (cl0) bl0Var.a();
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                wwVar2 = al0Var.h;
                                cl0 cl0Var2 = al0Var.g;
                                boVar3 = al0Var.f;
                                bl0 bl0Var2 = al0Var.e;
                                t30.z(obj);
                                r4 = bl0Var2;
                                boVar = cl0Var2;
                                do {
                                    s = r4.s(boVar);
                                    mmVar = lw.r;
                                    dhVar = dh.e;
                                    if (s == mmVar) {
                                    }
                                } while (r4.h(boVar, al0Var) != dhVar);
                                return;
                            }
                            if (i != 3) {
                                z6.m("call to 'resume' before 'invoke' with coroutine");
                                return;
                            }
                            wwVar2 = al0Var.h;
                            cl0 cl0Var3 = al0Var.g;
                            boVar3 = al0Var.f;
                            bl0 bl0Var3 = al0Var.e;
                            t30.z(obj);
                            bl0 bl0Var4 = bl0Var3;
                            cl0 cl0Var4 = cl0Var3;
                            boVar2 = boVar3;
                            wwVar = wwVar2;
                            bl0Var = bl0Var4;
                            cl0Var = cl0Var4;
                            r4 = bl0Var;
                            wwVar2 = wwVar;
                            boVar3 = boVar2;
                            boVar = cl0Var;
                            do {
                                s = r4.s(boVar);
                                mmVar = lw.r;
                                dhVar = dh.e;
                                if (s == mmVar) {
                                    if (wwVar2 != null && !wwVar2.a()) {
                                        throw wwVar2.l();
                                    }
                                    al0Var.e = r4;
                                    al0Var.f = boVar3;
                                    al0Var.g = boVar;
                                    al0Var.h = wwVar2;
                                    al0Var.k = 3;
                                    bl0Var4 = r4;
                                    cl0Var4 = boVar;
                                    if (boVar3.d(s, al0Var) == dhVar) {
                                        return;
                                    }
                                    boVar2 = boVar3;
                                    wwVar = wwVar2;
                                    bl0Var = bl0Var4;
                                    cl0Var = cl0Var4;
                                    r4 = bl0Var;
                                    wwVar2 = wwVar;
                                    boVar3 = boVar2;
                                    boVar = cl0Var;
                                    s = r4.s(boVar);
                                    mmVar = lw.r;
                                    dhVar = dh.e;
                                    if (s == mmVar) {
                                        al0Var.e = r4;
                                        al0Var.f = boVar3;
                                        al0Var.g = boVar;
                                        al0Var.h = wwVar2;
                                        al0Var.k = 2;
                                    }
                                }
                            } while (r4.h(boVar, al0Var) != dhVar);
                            return;
                        }
                        boVar = al0Var.g;
                        bo boVar4 = al0Var.f;
                        bl0 bl0Var5 = al0Var.e;
                        try {
                            t30.z(obj);
                            boVar2 = boVar4;
                            bl0Var = bl0Var5;
                            boVar = boVar;
                        } catch (Throwable th) {
                            th = th;
                            r4 = bl0Var5;
                            r4.f(boVar);
                            throw th;
                        }
                    }
                    wwVar = (ww) al0Var.getContext().j(b2.N);
                    cl0Var = boVar;
                    r4 = bl0Var;
                    wwVar2 = wwVar;
                    boVar3 = boVar2;
                    boVar = cl0Var;
                    do {
                        s = r4.s(boVar);
                        mmVar = lw.r;
                        dhVar = dh.e;
                        if (s == mmVar) {
                        }
                    } while (r4.h(boVar, al0Var) != dhVar);
                    return;
                }
            }
            wwVar = (ww) al0Var.getContext().j(b2.N);
            cl0Var = boVar;
            r4 = bl0Var;
            wwVar2 = wwVar;
            boVar3 = boVar2;
            boVar = cl0Var;
            do {
                s = r4.s(boVar);
                mmVar = lw.r;
                dhVar = dh.e;
                if (s == mmVar) {
                }
            } while (r4.h(boVar, al0Var) != dhVar);
            return;
        } catch (Throwable th2) {
            r4 = bl0Var;
            th = th2;
            r4.f(boVar);
            throw th;
        }
        al0Var = new al0(bl0Var, ngVar);
        Object obj2 = al0Var.i;
        i = al0Var.k;
        if (i != 0) {
        }
    }

    @Override // defpackage.ao
    public final Object b(bo boVar, ng ngVar) {
        j(this, boVar, ngVar);
        return dh.e;
    }

    @Override // defpackage.n0
    public final o0 c() {
        cl0 cl0Var = new cl0();
        cl0Var.a = -1L;
        return cl0Var;
    }

    @Override // defpackage.bo
    public final Object d(Object obj, ng ngVar) {
        bl0 bl0Var;
        Throwable th;
        ng[] m;
        zk0 zk0Var;
        if (p(obj)) {
            return fs0.a;
        }
        int i = 1;
        ja jaVar = new ja(1, lr0.x(ngVar));
        jaVar.r();
        ng[] ngVarArr = nh.a;
        synchronized (this) {
            try {
                if (q(obj)) {
                    try {
                        jaVar.resumeWith(fs0.a);
                        m = m(ngVarArr);
                        zk0Var = null;
                        bl0Var = this;
                    } catch (Throwable th2) {
                        th = th2;
                        bl0Var = this;
                        throw th;
                    }
                } else {
                    try {
                        bl0Var = this;
                        try {
                            zk0 zk0Var2 = new zk0(bl0Var, n() + this.o + this.p, obj, jaVar);
                            bl0Var.l(zk0Var2);
                            bl0Var.p++;
                            if (bl0Var.j == 0) {
                                ngVarArr = bl0Var.m(ngVarArr);
                            }
                            m = ngVarArr;
                            zk0Var = zk0Var2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        bl0Var = this;
                        th = th4;
                        throw th;
                    }
                }
                if (zk0Var != null) {
                    jaVar.u(new fa(i, zk0Var));
                }
                for (ng ngVar2 : m) {
                    if (ngVar2 != null) {
                        ngVar2.resumeWith(fs0.a);
                    }
                }
                Object p = jaVar.p();
                dh dhVar = dh.e;
                if (p != dhVar) {
                    p = fs0.a;
                }
                return p == dhVar ? p : fs0.a;
            } catch (Throwable th5) {
                th = th5;
                bl0Var = this;
            }
        }
    }

    @Override // defpackage.n0
    public final o0[] e() {
        return new cl0[2];
    }

    public final Object h(cl0 cl0Var, al0 al0Var) {
        ja jaVar = new ja(1, lr0.x(al0Var));
        jaVar.r();
        synchronized (this) {
            try {
                if (r(cl0Var) < 0) {
                    cl0Var.b = jaVar;
                } else {
                    jaVar.resumeWith(fs0.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object p = jaVar.p();
        return p == dh.e ? p : fs0.a;
    }

    public final void i() {
        if (this.j != 0 || this.p > 1) {
            Object[] objArr = this.l;
            objArr.getClass();
            while (this.p > 0) {
                long n = n();
                int i = this.o;
                int i2 = this.p;
                if (objArr[((int) ((n + (i + i2)) - 1)) & (objArr.length - 1)] != lw.r) {
                    return;
                }
                this.p = i2 - 1;
                lw.D(objArr, n() + this.o + this.p, null);
            }
        }
    }

    public final void k() {
        o0[] o0VarArr;
        Object[] objArr = this.l;
        objArr.getClass();
        lw.D(objArr, n(), null);
        this.o--;
        long n = n() + 1;
        if (this.m < n) {
            this.m = n;
        }
        if (this.n < n) {
            if (this.f != 0 && (o0VarArr = this.e) != null) {
                for (o0 o0Var : o0VarArr) {
                    if (o0Var != null) {
                        cl0 cl0Var = (cl0) o0Var;
                        long j = cl0Var.a;
                        if (j >= 0 && j < n) {
                            cl0Var.a = n;
                        }
                    }
                }
            }
            this.n = n;
        }
    }

    public final void l(Object obj) {
        int i = this.o + this.p;
        Object[] objArr = this.l;
        if (objArr == null) {
            objArr = o(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = o(objArr, i, objArr.length * 2);
        }
        lw.D(objArr, n() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ng[] m(ng[] ngVarArr) {
        o0[] o0VarArr;
        cl0 cl0Var;
        ja jaVar;
        int length = ngVarArr.length;
        if (this.f != 0 && (o0VarArr = this.e) != null) {
            int length2 = o0VarArr.length;
            int i = 0;
            ngVarArr = ngVarArr;
            while (i < length2) {
                o0 o0Var = o0VarArr[i];
                if (o0Var != null && (jaVar = (cl0Var = (cl0) o0Var).b) != null && r(cl0Var) >= 0) {
                    int length3 = ngVarArr.length;
                    ngVarArr = ngVarArr;
                    if (length >= length3) {
                        ngVarArr = Arrays.copyOf(ngVarArr, Math.max(2, ngVarArr.length * 2));
                    }
                    ngVarArr[length] = jaVar;
                    cl0Var.b = null;
                    length++;
                }
                i++;
                ngVarArr = ngVarArr;
            }
        }
        return ngVarArr;
    }

    public final long n() {
        return Math.min(this.n, this.m);
    }

    public final Object[] o(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            z6.m("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.l = objArr2;
        if (objArr != null) {
            long n = n();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + n;
                lw.D(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean p(Object obj) {
        int i;
        boolean z;
        ng[] ngVarArr = nh.a;
        synchronized (this) {
            if (q(obj)) {
                ngVarArr = m(ngVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (ng ngVar : ngVarArr) {
            if (ngVar != null) {
                ngVar.resumeWith(fs0.a);
            }
        }
        return z;
    }

    public final boolean q(Object obj) {
        int i = this.f;
        int i2 = this.i;
        if (i != 0) {
            int i3 = this.o;
            int i4 = this.j;
            if (i3 >= i4 && this.n <= this.m) {
                int ordinal = this.k.ordinal();
                if (ordinal == 0) {
                    return false;
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        z6.j();
                        return false;
                    }
                }
            }
            l(obj);
            int i5 = this.o + 1;
            this.o = i5;
            if (i5 > i4) {
                k();
            }
            long n = n() + this.o;
            long j = this.m;
            if (((int) (n - j)) > i2) {
                t(1 + j, this.n, n() + this.o, n() + this.o + this.p);
            }
        } else if (i2 != 0) {
            l(obj);
            int i6 = this.o + 1;
            this.o = i6;
            if (i6 > i2) {
                k();
            }
            this.n = n() + this.o;
            return true;
        }
        return true;
    }

    public final long r(cl0 cl0Var) {
        long j = cl0Var.a;
        if (j >= n() + this.o && (this.j > 0 || j > n() || this.p == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object s(cl0 cl0Var) {
        Object obj;
        ng[] ngVarArr = nh.a;
        synchronized (this) {
            try {
                long r = r(cl0Var);
                if (r < 0) {
                    obj = lw.r;
                } else {
                    long j = cl0Var.a;
                    Object[] objArr = this.l;
                    objArr.getClass();
                    Object obj2 = objArr[((int) r) & (objArr.length - 1)];
                    if (obj2 instanceof zk0) {
                        obj2 = ((zk0) obj2).g;
                    }
                    cl0Var.a = r + 1;
                    Object obj3 = obj2;
                    ngVarArr = u(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (ng ngVar : ngVarArr) {
            if (ngVar != null) {
                ngVar.resumeWith(fs0.a);
            }
        }
        return obj;
    }

    public final void t(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long n = n(); n < min; n++) {
            Object[] objArr = this.l;
            objArr.getClass();
            lw.D(objArr, n, null);
        }
        this.m = j;
        this.n = j2;
        this.o = (int) (j3 - min);
        this.p = (int) (j4 - j3);
    }

    public final ng[] u(long j) {
        long j2;
        long j3;
        long j4;
        ng[] ngVarArr;
        ng[] ngVarArr2;
        o0[] o0VarArr;
        mm mmVar = lw.r;
        ng[] ngVarArr3 = nh.a;
        if (j <= this.n) {
            long n = n();
            long j5 = this.o + n;
            int i = this.j;
            if (i == 0 && this.p > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.f != 0 && (o0VarArr = this.e) != null) {
                for (o0 o0Var : o0VarArr) {
                    if (o0Var != null) {
                        long j6 = ((cl0) o0Var).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.n) {
                long n2 = n() + this.o;
                int i3 = this.f;
                int i4 = this.p;
                if (i3 > 0) {
                    j2 = 1;
                    i4 = Math.min(i4, i - ((int) (n2 - j5)));
                } else {
                    j2 = 1;
                }
                long j7 = this.p + n2;
                if (i4 > 0) {
                    Object[] objArr = this.l;
                    objArr.getClass();
                    j3 = n;
                    ng[] ngVarArr4 = new ng[i4];
                    long j8 = n2;
                    while (true) {
                        if (n2 >= j7) {
                            ngVarArr2 = ngVarArr4;
                            j4 = j5;
                            break;
                        }
                        ngVarArr2 = ngVarArr4;
                        Object obj = objArr[((int) n2) & (objArr.length - 1)];
                        if (obj != mmVar) {
                            obj.getClass();
                            zk0 zk0Var = (zk0) obj;
                            j4 = j5;
                            int i5 = i2 + 1;
                            ngVarArr2[i2] = zk0Var.h;
                            lw.D(objArr, n2, mmVar);
                            lw.D(objArr, j8, zk0Var.g);
                            j8 += j2;
                            if (i5 >= i4) {
                                break;
                            }
                            i2 = i5;
                        } else {
                            j4 = j5;
                        }
                        n2 += j2;
                        ngVarArr4 = ngVarArr2;
                        j5 = j4;
                    }
                    n2 = j8;
                    ngVarArr = ngVarArr2;
                } else {
                    j3 = n;
                    j4 = j5;
                    ngVarArr = ngVarArr3;
                }
                int i6 = (int) (n2 - j3);
                long j9 = this.f == 0 ? n2 : j4;
                long max = Math.max(this.m, n2 - Math.min(this.i, i6));
                if (i == 0 && max < j7) {
                    Object[] objArr2 = this.l;
                    objArr2.getClass();
                    if (lw.i(objArr2[((int) max) & (objArr2.length - 1)], mmVar)) {
                        n2 += j2;
                        max += j2;
                    }
                }
                t(max, j9, n2, j7);
                i();
                return ngVarArr.length == 0 ? ngVarArr : m(ngVarArr);
            }
        }
        return ngVarArr3;
    }
}
