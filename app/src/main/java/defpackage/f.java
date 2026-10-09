package defpackage;

import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class f extends go0 implements tq {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, ng ngVar, int i) {
        super(2, ngVar);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                return new f((b40) this.g, (gd0) this.h, (tj) obj2, ngVar, 0);
            case 1:
                return new f((a9) this.g, (d60) this.h, (s2) obj2, ngVar, 1);
            case 2:
                f fVar = new f((bo) this.h, (za) obj2, ngVar, 2);
                fVar.g = obj;
                return fVar;
            case 3:
                f fVar2 = new f((hi) this.h, (f) obj2, ngVar, 3);
                fVar2.g = obj;
                return fVar2;
            case 4:
                return new f((hi) this.g, (v40) this.h, (f) obj2, ngVar, 4);
            case Gates.MAX_WINDOWS /* 5 */:
                return new f((b40) this.g, (gw) this.h, (tj) obj2, ngVar, 5);
            case 6:
                return new f((o9) obj2, ngVar);
            case 7:
                f fVar3 = new f((ke0) this.h, (p5) obj2, ngVar, 7);
                fVar3.g = obj;
                return fVar3;
            case MainActivity.$stable /* 8 */:
                f fVar4 = new f((yk) this.h, (mj0) obj2, ngVar, 8);
                fVar4.g = obj;
                return fVar4;
            default:
                f fVar5 = new f((mj0) this.h, (tq) obj2, ngVar, 9);
                fVar5.g = obj;
                return fVar5;
        }
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        switch (i) {
            case 0:
                return ((f) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 1:
                return ((f) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 2:
                return ((f) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 3:
                return ((f) create((ri0) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 4:
                return ((f) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case Gates.MAX_WINDOWS /* 5 */:
                return ((f) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 6:
                return ((f) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 7:
                return ((f) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case MainActivity.$stable /* 8 */:
                return ((f) create((kj0) obj, (ng) obj2)).invokeSuspend(fs0Var);
            default:
                return ((f) create((ri0) obj, (ng) obj2)).invokeSuspend(fs0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0316, code lost:
    
        if (r13 == r5) goto L171;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:42:0x00a9, B:43:0x00d2, B:45:0x00da, B:46:0x00e7, B:53:0x00f7, B:55:0x00c4, B:59:0x00fa, B:64:0x0100, B:65:0x0101, B:72:0x00be, B:48:0x00e8, B:50:0x00ee), top: B:38:0x009d, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0102  */
    /* JADX WARN: Type inference failed for: r5v13, types: [va] */
    /* JADX WARN: Type inference failed for: r5v4, types: [md0, q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00ce -> B:37:0x00d2). Please report as a decompilation issue!!! */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        o9 o9Var;
        n9 n9Var;
        boolean z;
        int i = 1;
        boolean z2 = false;
        boolean z3 = false;
        switch (this.e) {
            case 0:
                dh dhVar = dh.e;
                int i2 = this.f;
                if (i2 == 0) {
                    t30.z(obj);
                    b40 b40Var = (b40) this.g;
                    gd0 gd0Var = (gd0) this.h;
                    this.f = 1;
                    if (b40Var.a(gd0Var, this) == dhVar) {
                        return dhVar;
                    }
                } else {
                    if (i2 != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t30.z(obj);
                }
                tj tjVar = (tj) this.i;
                if (tjVar != null) {
                    tjVar.b();
                }
                return fs0.a;
            case 1:
                fs0 fs0Var = fs0.a;
                a9 a9Var = (a9) this.g;
                dh dhVar2 = dh.e;
                int i3 = this.f;
                if (i3 == 0) {
                    t30.z(obj);
                    hg hgVar = a9Var.s;
                    y8 y8Var = new y8(a9Var, (d60) this.h, (s2) this.i);
                    this.f = 1;
                    hgVar.getClass();
                    oe0 oe0Var = (oe0) y8Var.b();
                    if (oe0Var != null && !hg.q0(hgVar, oe0Var, 0L, 0L, 3)) {
                        ja jaVar = new ja(1, lr0.x(this));
                        jaVar.r();
                        eg egVar = new eg(y8Var, jaVar);
                        t3 t3Var = hgVar.w;
                        t40 t40Var = (t40) t3Var.f;
                        oe0 oe0Var2 = (oe0) y8Var.b();
                        if (oe0Var2 == null) {
                            jaVar.resumeWith(fs0Var);
                        } else {
                            jaVar.t(new c(i, t3Var, egVar));
                            aw C = t30.C(0, t40Var.g);
                            int i4 = C.e;
                            int i5 = C.f;
                            if (i4 <= i5) {
                                while (true) {
                                    oe0 oe0Var3 = (oe0) ((eg) t40Var.e[i5]).a.b();
                                    if (oe0Var3 != null) {
                                        oe0 c = oe0Var2.c(oe0Var3);
                                        if (c.equals(oe0Var2)) {
                                            t40Var.a(i5 + 1, egVar);
                                        } else if (!c.equals(oe0Var3)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i6 = t40Var.g - 1;
                                            if (i6 <= i5) {
                                                while (true) {
                                                    ((eg) t40Var.e[i5]).b.i(cancellationException);
                                                    if (i6 != i5) {
                                                        i6++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i5 != i4) {
                                        i5--;
                                    }
                                }
                                if (!hgVar.z) {
                                    hgVar.r0(0L);
                                }
                            }
                            t40Var.a(0, egVar);
                            if (!hgVar.z) {
                            }
                        }
                        obj2 = jaVar.p();
                        break;
                    }
                    obj2 = fs0Var;
                    if (obj2 == dhVar2) {
                        return dhVar2;
                    }
                } else {
                    if (i3 != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t30.z(obj);
                }
                return fs0Var;
            case 2:
                fs0 fs0Var2 = fs0.a;
                dh dhVar3 = dh.e;
                int i7 = this.f;
                if (i7 == 0) {
                    t30.z(obj);
                    ch chVar = (ch) this.g;
                    bo boVar = (bo) this.h;
                    za zaVar = (za) this.i;
                    tg tgVar = zaVar.e;
                    int i8 = zaVar.f;
                    if (i8 == -3) {
                        i8 = -2;
                    }
                    m9 m9Var = zaVar.g;
                    fh fhVar = fh.g;
                    d dVar = new d(zaVar, z2 ? 1 : 0, 4);
                    o9 a = lw.a(i8, 4, m9Var);
                    tg r = nh.r(chVar.e(), tgVar, true);
                    fi fiVar = pj.a;
                    if (r != fiVar && r.j(b2.D) == null) {
                        r = r.g(fiVar);
                    }
                    ?? md0Var = new md0(r, a);
                    md0Var.d0(fhVar, md0Var, dVar);
                    this.f = 1;
                    Object k = lr0.k(boVar, md0Var, true, this);
                    if (k != dhVar3) {
                        k = fs0Var2;
                    }
                    if (k == dhVar3) {
                        return dhVar3;
                    }
                } else {
                    if (i7 != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t30.z(obj);
                }
                return fs0Var2;
            case 3:
                w90 w90Var = ((hi) this.h).d;
                dh dhVar4 = dh.e;
                int i9 = this.f;
                try {
                    if (i9 == 0) {
                        t30.z(obj);
                        ri0 ri0Var = (ri0) this.g;
                        w90Var.setValue(Boolean.TRUE);
                        f fVar = (f) this.i;
                        this.f = 1;
                        if (fVar.invoke(ri0Var, this) == dhVar4) {
                            return dhVar4;
                        }
                    } else {
                        if (i9 != 1) {
                            z6.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        t30.z(obj);
                    }
                    w90Var.setValue(Boolean.FALSE);
                    return fs0.a;
                } catch (Throwable th) {
                    w90Var.setValue(Boolean.FALSE);
                    throw th;
                }
            case 4:
                dh dhVar5 = dh.e;
                int i10 = this.f;
                if (i10 == 0) {
                    t30.z(obj);
                    hi hiVar = (hi) this.g;
                    a50 a50Var = hiVar.c;
                    gi giVar = hiVar.b;
                    v40 v40Var = (v40) this.h;
                    f fVar2 = new f(hiVar, (f) this.i, z3 ? 1 : 0, 3);
                    this.f = 1;
                    a50Var.getClass();
                    if (t10.j(new z40(v40Var, a50Var, fVar2, giVar, null), this) == dhVar5) {
                        return dhVar5;
                    }
                } else {
                    if (i10 != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t30.z(obj);
                }
                return fs0.a;
            case Gates.MAX_WINDOWS /* 5 */:
                dh dhVar6 = dh.e;
                int i11 = this.f;
                if (i11 == 0) {
                    t30.z(obj);
                    b40 b40Var2 = (b40) this.g;
                    gw gwVar = (gw) this.h;
                    this.f = 1;
                    if (b40Var2.a(gwVar, this) == dhVar6) {
                        return dhVar6;
                    }
                } else {
                    if (i11 != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t30.z(obj);
                }
                tj tjVar2 = (tj) this.i;
                if (tjVar2 != null) {
                    tjVar2.b();
                }
                return fs0.a;
            case 6:
                dh dhVar7 = dh.e;
                int i12 = this.f;
                try {
                    if (i12 == 0) {
                        t30.z(obj);
                        o9Var = (o9) this.i;
                        n9Var = new n9(o9Var);
                        this.g = o9Var;
                        this.h = n9Var;
                        this.f = 1;
                        obj = n9Var.a(this);
                        o9Var = o9Var;
                        if (obj == dhVar7) {
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i12 != 1) {
                            z6.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        n9Var = (n9) this.h;
                        ?? r5 = (va) this.g;
                        t30.z(obj);
                        o9Var = r5;
                        if (((Boolean) obj).booleanValue()) {
                            as.b.set(false);
                            synchronized (xl0.c) {
                                l40 l40Var = xl0.j.h;
                                z = l40Var != null && l40Var.h();
                            }
                            if (z) {
                                xl0.c();
                            }
                            this.g = o9Var;
                            this.h = n9Var;
                            this.f = 1;
                            obj = n9Var.a(this);
                            o9Var = o9Var;
                            if (obj == dhVar7) {
                                return dhVar7;
                            }
                            if (((Boolean) obj).booleanValue()) {
                                o9Var.b(null);
                                return fs0.a;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CancellationException cancellationException2 = th2 instanceof CancellationException ? th2 : null;
                        if (cancellationException2 == null) {
                            cancellationException2 = new CancellationException("Channel was consumed, consumer had failed");
                            cancellationException2.initCause(th2);
                        }
                        o9Var.b(cancellationException2);
                        throw th3;
                    }
                }
                break;
            case 7:
                dh dhVar8 = dh.e;
                int i13 = this.f;
                if (i13 != 0) {
                    if (i13 == 1) {
                        t30.z(obj);
                        return fs0.a;
                    }
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t30.z(obj);
                ch chVar2 = (ch) this.g;
                ke0 ke0Var = (ke0) this.h;
                p5 p5Var = (p5) this.i;
                this.f = 1;
                ke0Var.c(chVar2, p5Var, this);
                return dhVar8;
            case MainActivity.$stable /* 8 */:
                dh dhVar9 = dh.e;
                int i14 = this.f;
                if (i14 == 0) {
                    t30.z(obj);
                    kj0 kj0Var = (kj0) this.g;
                    yk ykVar = (yk) this.h;
                    c cVar = new c(8, kj0Var, (mj0) this.i);
                    this.f = 1;
                    if (ykVar.invoke(cVar, this) == dhVar9) {
                        return dhVar9;
                    }
                } else {
                    if (i14 != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t30.z(obj);
                }
                return fs0.a;
            default:
                dh dhVar10 = dh.e;
                int i15 = this.f;
                if (i15 == 0) {
                    t30.z(obj);
                    ri0 ri0Var2 = (ri0) this.g;
                    mj0 mj0Var = (mj0) this.h;
                    mj0Var.k = ri0Var2;
                    tq tqVar = (tq) this.i;
                    kj0 kj0Var2 = mj0Var.l;
                    this.f = 1;
                    if (tqVar.invoke(kj0Var2, this) == dhVar10) {
                        return dhVar10;
                    }
                } else {
                    if (i15 != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t30.z(obj);
                }
                return fs0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, ng ngVar, int i) {
        super(2, ngVar);
        this.e = i;
        this.h = obj;
        this.i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o9 o9Var, ng ngVar) {
        super(2, ngVar);
        this.e = 6;
        this.i = o9Var;
    }
}
