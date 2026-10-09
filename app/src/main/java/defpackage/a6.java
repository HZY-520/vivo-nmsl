package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class a6 extends go0 implements tq {
    public final /* synthetic */ int e = 1;
    public Object f;
    public int g;
    public Object h;
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(va vaVar, y5 y5Var, p40 p40Var, p40 p40Var2, ng ngVar) {
        super(2, ngVar);
        this.i = vaVar;
        this.j = y5Var;
        this.k = p40Var;
        this.l = p40Var2;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        int i = this.e;
        Object obj2 = this.l;
        Object obj3 = this.k;
        switch (i) {
            case 0:
                a6 a6Var = new a6((va) this.i, (y5) this.j, (p40) obj3, (p40) obj2, ngVar);
                a6Var.f = obj;
                return a6Var;
            default:
                a6 a6Var2 = new a6((b50) obj3, (pq) obj2, ngVar);
                a6Var2.j = obj;
                return a6Var2;
        }
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        ch chVar = (ch) obj;
        ng ngVar = (ng) obj2;
        switch (i) {
        }
        return ((a6) create(chVar, ngVar)).invokeSuspend(fs0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0165  */
    /* JADX WARN: Type inference failed for: r2v0, types: [d50, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x012e -> B:62:0x0131). Please report as a decompilation issue!!! */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ch chVar;
        n9 it;
        Object a;
        d50 d50Var;
        pq pqVar;
        y40 y40Var;
        y40 y40Var2;
        Object invoke;
        d50 d50Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i = this.e;
        ?? r2 = this.l;
        dh dhVar = dh.e;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                va vaVar = (va) this.i;
                int i2 = this.g;
                if (i2 == 0) {
                    t30.z(obj);
                    chVar = (ch) this.f;
                    it = vaVar.iterator();
                    this.f = chVar;
                    this.h = it;
                    this.g = 1;
                    a = it.a(this);
                    if (a == dhVar) {
                    }
                    if (((Boolean) a).booleanValue()) {
                    }
                } else {
                    if (i2 != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (n9) this.h;
                    chVar = (ch) this.f;
                    t30.z(obj);
                    a = obj;
                    if (((Boolean) a).booleanValue()) {
                        Object c = it.c();
                        Object n = vaVar.n();
                        if (n instanceof bb) {
                            n = null;
                        }
                        q3.A(chVar, null, new z5(n == null ? c : n, (y5) this.j, (p40) obj2, (p40) r2, null, 0), 3);
                        this.f = chVar;
                        this.h = it;
                        this.g = 1;
                        a = it.a(this);
                        if (a == dhVar) {
                            return dhVar;
                        }
                        if (((Boolean) a).booleanValue()) {
                            return fs0.a;
                        }
                    }
                }
            default:
                b50 b50Var = (b50) obj2;
                int i3 = this.g;
                int i4 = 2;
                try {
                    try {
                        if (i3 == 0) {
                            t30.z(obj);
                            rg j = ((ch) this.j).e().j(b2.N);
                            j.getClass();
                            y40 y40Var3 = new y40((ww) j);
                            AtomicReference atomicReference3 = b50Var.a;
                            while (true) {
                                y40 y40Var4 = (y40) atomicReference3.get();
                                if (y40Var4 != null) {
                                    w40 w40Var = w40.e;
                                    if (w40Var.compareTo(w40Var) < 0) {
                                        throw new CancellationException("Current mutation had a higher priority");
                                    }
                                }
                                while (!atomicReference3.compareAndSet(y40Var4, y40Var3)) {
                                    if (atomicReference3.get() != y40Var4) {
                                        break;
                                    }
                                }
                                if (y40Var4 != null) {
                                    y40Var4.a.b(new eb("Mutation interrupted", i4));
                                }
                                d50Var = b50Var.b;
                                pqVar = (pq) r2;
                                this.j = y40Var3;
                                this.h = d50Var;
                                this.f = pqVar;
                                this.i = b50Var;
                                this.g = 1;
                                if (d50Var.c(this) == dhVar) {
                                    return dhVar;
                                }
                                y40Var = y40Var3;
                            }
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    z6.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                b50Var = (b50) this.f;
                                d50Var2 = (d50) this.h;
                                y40Var2 = (y40) this.j;
                                try {
                                    t30.z(obj);
                                    invoke = obj;
                                    atomicReference2 = b50Var.a;
                                    while (!atomicReference2.compareAndSet(y40Var2, null) && atomicReference2.get() == y40Var2) {
                                    }
                                    d50Var2.d(null);
                                    return invoke;
                                } catch (Throwable th) {
                                    th = th;
                                    atomicReference = b50Var.a;
                                    while (!atomicReference.compareAndSet(y40Var2, null) && atomicReference.get() == y40Var2) {
                                    }
                                    throw th;
                                }
                            }
                            b50Var = (b50) this.i;
                            pqVar = (pq) this.f;
                            d50Var = (d50) this.h;
                            y40Var = (y40) this.j;
                            t30.z(obj);
                        }
                        this.j = y40Var;
                        this.h = d50Var;
                        this.f = b50Var;
                        this.i = null;
                        this.g = 2;
                        invoke = pqVar.invoke(this);
                        if (invoke == dhVar) {
                            return dhVar;
                        }
                        d50Var2 = d50Var;
                        y40Var2 = y40Var;
                        atomicReference2 = b50Var.a;
                        while (!atomicReference2.compareAndSet(y40Var2, null)) {
                        }
                        d50Var2.d(null);
                        return invoke;
                    } catch (Throwable th2) {
                        th = th2;
                        y40Var2 = y40Var;
                        atomicReference = b50Var.a;
                        while (!atomicReference.compareAndSet(y40Var2, null)) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    r2.d(null);
                    throw th3;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(b50 b50Var, pq pqVar, ng ngVar) {
        super(2, ngVar);
        this.k = b50Var;
        this.l = pqVar;
    }
}
