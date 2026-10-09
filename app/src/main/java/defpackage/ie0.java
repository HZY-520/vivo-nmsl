package defpackage;

import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ie0 extends go0 implements tq {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ie0(Object obj, Object obj2, Object obj3, ng ngVar, int i) {
        super(2, ngVar);
        this.e = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        int i = this.e;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        switch (i) {
            case 0:
                ie0 ie0Var = new ie0((le0) obj4, (ke0) obj3, (p5) obj2, ngVar, 0);
                ie0Var.g = obj;
                return ie0Var;
            default:
                ie0 ie0Var2 = new ie0((xq0) obj4, (mj0) obj3, (ve0) obj2, ngVar, 1);
                ie0Var2.g = obj;
                return ie0Var2;
        }
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        switch (i) {
            case 0:
                return ((ie0) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            default:
                return ((ie0) create((kj0) obj, (ng) obj2)).invokeSuspend(fs0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b7  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [b70] */
    /* JADX WARN: Type inference failed for: r2v17, types: [b70, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, ww] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007f -> B:7:0x0081). Please report as a decompilation issue!!! */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        cn0 cn0Var;
        hb0 hb0Var;
        hb0 hb0Var2;
        le0 le0Var;
        List h;
        cf cfVar;
        ww wwVar;
        b70 b70Var;
        kj0 kj0Var;
        ?? r2 = 1;
        int i = 1;
        ng ngVar = null;
        switch (this.e) {
            case 0:
                dh dhVar = dh.e;
                ?? r3 = this.f;
                try {
                    if (r3 == 0) {
                        t30.z(obj);
                        r3 = q3.w(((ch) this.g).e());
                        le0 le0Var2 = (le0) this.i;
                        cn0 cn0Var2 = le0.y;
                        synchronized (le0Var2.c) {
                            Throwable th = le0Var2.e;
                            if (th != null) {
                                throw th;
                            }
                            if (((ge0) le0Var2.u.getValue()).compareTo(ge0.f) <= 0) {
                                throw new IllegalStateException("Recomposer shut down");
                            }
                            if (le0Var2.d != null) {
                                throw new IllegalStateException("Recomposer already running");
                            }
                            le0Var2.d = r3;
                            if (le0Var2.c() != null) {
                                ue.a("called outside of runRecomposeAndApplyChanges");
                            }
                        }
                        n nVar = new n(8, (le0) this.i);
                        xl0.b(xl0.a);
                        synchronized (xl0.c) {
                            xl0.h = ac.h0(xl0.h, nVar);
                        }
                        r2 = new b70(nVar);
                        ic0 ic0Var = ((le0) this.i).x;
                        do {
                            cn0Var = le0.y;
                            hb0Var = (hb0) cn0Var.getValue();
                            b2 b2Var = b2.I;
                            ya0 ya0Var = hb0Var.g;
                            if (ya0Var.containsKey(ic0Var)) {
                                hb0Var2 = hb0Var;
                            } else if (hb0Var.isEmpty()) {
                                hb0Var2 = new hb0(ic0Var, ic0Var, ya0Var.a(ic0Var, new yz(b2Var, b2Var)));
                            } else {
                                Object obj2 = hb0Var.f;
                                Object obj3 = ya0Var.get(obj2);
                                obj3.getClass();
                                hb0Var2 = new hb0(hb0Var.e, ic0Var, ya0Var.a(obj2, new yz(((yz) obj3).a, ic0Var)).a(ic0Var, new yz(obj2, b2Var)));
                            }
                            if (hb0Var != hb0Var2) {
                            }
                            le0Var = (le0) this.i;
                            synchronized (le0Var.c) {
                                h = le0Var.h();
                            }
                            int size = h.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                for (Object obj4 : ((cf) h.get(i2)).j.g) {
                                    de0 de0Var = obj4 instanceof de0 ? (de0) obj4 : null;
                                    if (de0Var != null && (cfVar = de0Var.a) != null) {
                                        cfVar.n(de0Var, null);
                                    }
                                }
                            }
                            f fVar = new f((ke0) this.j, (p5) this.k, null, 7);
                            this.g = r3;
                            this.h = r2;
                            this.f = 1;
                            b70Var = r2;
                            wwVar = r3;
                            if (t10.j(fVar, this) == dhVar) {
                                return dhVar;
                            }
                        } while (!cn0Var.i(hb0Var, hb0Var2));
                        le0Var = (le0) this.i;
                        synchronized (le0Var.c) {
                        }
                    } else {
                        if (r3 != 1) {
                            z6.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b70 b70Var2 = (b70) this.h;
                        ww wwVar2 = (ww) this.g;
                        t30.z(obj);
                        b70Var = b70Var2;
                        wwVar = wwVar2;
                    }
                    b70Var.a();
                    le0 le0Var3 = (le0) this.i;
                    synchronized (le0Var3.c) {
                        try {
                            if (le0Var3.d == wwVar) {
                                le0Var3.d = null;
                            }
                            if (le0Var3.c() != null) {
                                ue.a("called outside of runRecomposeAndApplyChanges");
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    cn0 cn0Var3 = le0.y;
                    j20.o(((le0) this.i).x);
                    return fs0.a;
                } catch (Throwable th3) {
                    r2.a();
                    le0 le0Var4 = (le0) this.i;
                    synchronized (le0Var4.c) {
                        try {
                            if (le0Var4.d == r3) {
                                le0Var4.d = null;
                            }
                            if (le0Var4.c() != null) {
                                ue.a("called outside of runRecomposeAndApplyChanges");
                            }
                            cn0 cn0Var4 = le0.y;
                            j20.o(((le0) this.i).x);
                            throw th3;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            default:
                mj0 mj0Var = (mj0) this.j;
                ve0 ve0Var = (ve0) this.k;
                xq0 xq0Var = (xq0) this.i;
                dh dhVar2 = dh.e;
                int i3 = this.f;
                if (i3 == 0) {
                    t30.z(obj);
                    kj0 kj0Var2 = (kj0) this.g;
                    float j = mj0Var.j(mj0Var.f(((vq0) ve0Var.e).a));
                    mj0 mj0Var2 = xq0Var.a;
                    mj0Var2.h(mj0Var2.f(kj0Var2.a(mj0Var2.i(mj0Var2.e(j)), 1)));
                    kj0Var = kj0Var2;
                    if (!((vq0) ve0Var.e).c) {
                    }
                } else {
                    if (i3 != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ve0 ve0Var2 = (ve0) this.h;
                    kj0 kj0Var3 = (kj0) this.g;
                    t30.z(obj);
                    kj0 kj0Var4 = kj0Var3;
                    ve0 ve0Var3 = ve0Var2;
                    Object j2 = obj;
                    ve0Var3.e = j2;
                    vq0 vq0Var = (vq0) ve0Var.e;
                    p2 p2Var = xq0Var.e;
                    long j3 = vq0Var.b;
                    long j4 = vq0Var.a;
                    ((ht0) p2Var.f).a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
                    ((ht0) p2Var.g).a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
                    vq0 e = xq0.e(xq0Var.f);
                    if (e != null) {
                        p2 p2Var2 = xq0Var.e;
                        long j5 = e.b;
                        long j6 = e.a;
                        ((ht0) p2Var2.f).a(j5, Float.intBitsToFloat((int) (j6 >> 32)));
                        ((ht0) p2Var2.g).a(j5, Float.intBitsToFloat((int) (j6 & 4294967295L)));
                        ve0Var.e = ((vq0) ve0Var.e).a(e);
                    }
                    float j7 = mj0Var.j(mj0Var.f(((vq0) ve0Var.e).a));
                    mj0 mj0Var3 = xq0Var.a;
                    long i4 = mj0Var3.i(mj0Var3.e(j7));
                    i = 1;
                    mj0Var3.h(mj0Var3.f(kj0Var4.a(i4, 1)));
                    kj0Var = kj0Var4;
                    ngVar = null;
                    if (!((vq0) ve0Var.e).c) {
                        o9 o9Var = xq0Var.f;
                        this.g = kj0Var;
                        this.h = ve0Var;
                        this.f = i;
                        j2 = t10.j(new d(o9Var, ngVar, 10), this);
                        if (j2 == dhVar2) {
                            return dhVar2;
                        }
                        kj0Var4 = kj0Var;
                        ve0Var3 = ve0Var;
                        ve0Var3.e = j2;
                        vq0 vq0Var2 = (vq0) ve0Var.e;
                        p2 p2Var3 = xq0Var.e;
                        long j32 = vq0Var2.b;
                        long j42 = vq0Var2.a;
                        ((ht0) p2Var3.f).a(j32, Float.intBitsToFloat((int) (j42 >> 32)));
                        ((ht0) p2Var3.g).a(j32, Float.intBitsToFloat((int) (j42 & 4294967295L)));
                        vq0 e2 = xq0.e(xq0Var.f);
                        if (e2 != null) {
                        }
                        float j72 = mj0Var.j(mj0Var.f(((vq0) ve0Var.e).a));
                        mj0 mj0Var32 = xq0Var.a;
                        long i42 = mj0Var32.i(mj0Var32.e(j72));
                        i = 1;
                        mj0Var32.h(mj0Var32.f(kj0Var4.a(i42, 1)));
                        kj0Var = kj0Var4;
                        ngVar = null;
                        if (!((vq0) ve0Var.e).c) {
                            return fs0.a;
                        }
                    }
                }
        }
    }
}
