package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class cn0 extends n0 implements ao, an0, bo {
    public static final /* synthetic */ long j = p7.a.objectFieldOffset(cn0.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int i;

    public cn0(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if (r13.equals(r15) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f7, code lost:
    
        if (r9 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if (r15 != r2) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:15:0x007b, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:24:0x0093, B:26:0x00b4, B:29:0x00c4, B:30:0x00e0, B:36:0x00f0, B:32:0x00e7, B:35:0x00ed, B:45:0x0099, B:48:0x00a0, B:53:0x00fa, B:54:0x00ff, B:58:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:15:0x007b, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:24:0x0093, B:26:0x00b4, B:29:0x00c4, B:30:0x00e0, B:36:0x00f0, B:32:0x00e7, B:35:0x00ed, B:45:0x0099, B:48:0x00a0, B:53:0x00fa, B:54:0x00ff, B:58:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:15:0x007b, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:24:0x0093, B:26:0x00b4, B:29:0x00c4, B:30:0x00e0, B:36:0x00f0, B:32:0x00e7, B:35:0x00ed, B:45:0x0099, B:48:0x00a0, B:53:0x00fa, B:54:0x00ff, B:58:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o0] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [dn0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [dn0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [dn0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [dn0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [n0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c3 -> B:14:0x0079). Please report as a decompilation issue!!! */
    @Override // defpackage.ao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(bo boVar, ng ngVar) {
        bn0 bn0Var;
        ?? r1;
        cn0 cn0Var;
        bo boVar2;
        ww wwVar;
        Object obj;
        Object andSet;
        try {
            if (ngVar instanceof bn0) {
                bn0Var = (bn0) ngVar;
                int i = bn0Var.l;
                if ((i & Integer.MIN_VALUE) != 0) {
                    bn0Var.l = i - Integer.MIN_VALUE;
                    Object obj2 = bn0Var.j;
                    r1 = bn0Var.l;
                    dh dhVar = dh.e;
                    if (r1 != 0) {
                        t30.z(obj2);
                        r1 = (dn0) a();
                    } else if (r1 == 1) {
                        r1 = bn0Var.g;
                        boVar = bn0Var.f;
                        this = bn0Var.e;
                        try {
                            t30.z(obj2);
                            r1 = r1;
                        } catch (Throwable th) {
                            ?? r8 = this;
                            th = th;
                            r8.f(r1);
                            throw th;
                        }
                    } else if (r1 == 2) {
                        obj = bn0Var.i;
                        wwVar = bn0Var.h;
                        dn0 dn0Var = bn0Var.g;
                        boVar2 = bn0Var.f;
                        cn0Var = bn0Var.e;
                        t30.z(obj2);
                        r1 = dn0Var;
                        AtomicReference atomicReference = r1.a;
                        mm mmVar = nh.m;
                        andSet = atomicReference.getAndSet(mmVar);
                        andSet.getClass();
                        if (andSet == nh.n) {
                        }
                        if (cn0Var != null) {
                        }
                    } else {
                        if (r1 != 3) {
                            z6.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = bn0Var.i;
                        wwVar = bn0Var.h;
                        r1 = bn0Var.g;
                        boVar2 = bn0Var.f;
                        cn0Var = bn0Var.e;
                        t30.z(obj2);
                        if (cn0Var != null) {
                            Object objectVolatile = p7.a.getObjectVolatile(cn0Var, j);
                            if (wwVar != null && !wwVar.a()) {
                                throw wwVar.l();
                            }
                            Object obj3 = objectVolatile == dx0.s ? null : objectVolatile;
                            bn0Var.e = cn0Var;
                            bn0Var.f = boVar2;
                            bn0Var.g = r1;
                            bn0Var.h = wwVar;
                            bn0Var.i = objectVolatile;
                            bn0Var.l = 2;
                            if (boVar2.d(obj3, bn0Var) == dhVar) {
                                return dhVar;
                            }
                            obj = objectVolatile;
                            r1 = r1;
                            AtomicReference atomicReference2 = r1.a;
                            mm mmVar2 = nh.m;
                            andSet = atomicReference2.getAndSet(mmVar2);
                            andSet.getClass();
                            if (andSet == nh.n) {
                                bn0Var.e = cn0Var;
                                bn0Var.f = boVar2;
                                bn0Var.g = r1;
                                bn0Var.h = wwVar;
                                bn0Var.i = obj;
                                bn0Var.l = 3;
                                fs0 fs0Var = fs0.a;
                                ja jaVar = new ja(1, lr0.x(bn0Var));
                                jaVar.r();
                                AtomicReference atomicReference3 = r1.a;
                                while (true) {
                                    if (atomicReference3.compareAndSet(mmVar2, jaVar)) {
                                        break;
                                    }
                                    if (atomicReference3.get() != mmVar2) {
                                        jaVar.resumeWith(fs0Var);
                                        break;
                                    }
                                }
                                Object p = jaVar.p();
                                if (p == dhVar) {
                                }
                            }
                            if (cn0Var != null) {
                                throw new ClassCastException();
                            }
                        }
                    }
                    cn0Var = this;
                    boVar2 = boVar;
                    wwVar = (ww) bn0Var.getContext().j(b2.N);
                    obj = null;
                    if (cn0Var != null) {
                    }
                }
            }
            if (r1 != 0) {
            }
            cn0Var = this;
            boVar2 = boVar;
            wwVar = (ww) bn0Var.getContext().j(b2.N);
            obj = null;
            if (cn0Var != null) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        bn0Var = new bn0(this, ngVar);
        Object obj22 = bn0Var.j;
        r1 = bn0Var.l;
        dh dhVar2 = dh.e;
    }

    @Override // defpackage.n0
    public final o0 c() {
        return new dn0();
    }

    @Override // defpackage.bo
    public final Object d(Object obj, ng ngVar) {
        h(obj);
        return fs0.a;
    }

    @Override // defpackage.n0
    public final o0[] e() {
        return new dn0[2];
    }

    @Override // defpackage.an0
    public final Object getValue() {
        mm mmVar = dx0.s;
        Object objectVolatile = p7.a.getObjectVolatile(this, j);
        if (objectVolatile == mmVar) {
            return null;
        }
        return objectVolatile;
    }

    public final void h(Object obj) {
        if (obj == null) {
            obj = dx0.s;
        }
        i(null, obj);
    }

    public final boolean i(Object obj, Object obj2) {
        int i;
        o0[] o0VarArr;
        mm mmVar;
        synchronized (this) {
            Unsafe unsafe = p7.a;
            long j2 = j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (obj != null && !lw.i(objectVolatile, obj)) {
                return false;
            }
            if (lw.i(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j2, obj2);
            int i2 = this.i;
            if ((i2 & 1) != 0) {
                this.i = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.i = i3;
            o0[] o0VarArr2 = this.e;
            while (true) {
                dn0[] dn0VarArr = (dn0[]) o0VarArr2;
                if (dn0VarArr != null) {
                    for (dn0 dn0Var : dn0VarArr) {
                        if (dn0Var != null) {
                            AtomicReference atomicReference = dn0Var.a;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 != null && obj3 != (mmVar = nh.n)) {
                                    mm mmVar2 = nh.m;
                                    if (obj3 != mmVar2) {
                                        while (!atomicReference.compareAndSet(obj3, mmVar2)) {
                                            if (atomicReference.get() != obj3) {
                                                break;
                                            }
                                        }
                                        ((ja) obj3).resumeWith(fs0.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj3, mmVar)) {
                                        if (atomicReference.get() != obj3) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.i;
                    if (i == i3) {
                        this.i = i3 + 1;
                        return true;
                    }
                    o0VarArr = this.e;
                }
                o0VarArr2 = o0VarArr;
                i3 = i;
            }
        }
    }
}
