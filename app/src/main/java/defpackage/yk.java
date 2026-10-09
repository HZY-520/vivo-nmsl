package defpackage;

import com.vivo.cnm.lico.Gates;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class yk extends go0 implements tq {
    public final /* synthetic */ int e = 1;
    public ve0 f;
    public ve0 g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ ej0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(ve0 ve0Var, ej0 ej0Var, ng ngVar) {
        super(2, ngVar);
        this.g = ve0Var;
        this.j = ej0Var;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        int i = this.e;
        ej0 ej0Var = this.j;
        switch (i) {
            case 0:
                yk ykVar = new yk(this.g, ej0Var, ngVar);
                ykVar.i = obj;
                return ykVar;
            default:
                yk ykVar2 = new yk(ej0Var, ngVar);
                ykVar2.i = obj;
                return ykVar2;
        }
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        switch (i) {
            case 0:
                return ((yk) create((pq) obj, (ng) obj2)).invokeSuspend(fs0Var);
            default:
                return ((yk) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:24|25|(1:27)|(0)|29|30|31|(2:37|(2:39|(0)))(2:33|(1:35))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e8, code lost:
    
        r0 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8 A[Catch: CancellationException -> 0x00e8, TryCatch #2 {CancellationException -> 0x00e8, blocks: (B:31:0x00d2, B:33:0x00d8, B:37:0x00ea, B:39:0x00ee), top: B:30:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea A[Catch: CancellationException -> 0x00e8, TryCatch #2 {CancellationException -> 0x00e8, blocks: (B:31:0x00d2, B:33:0x00d8, B:37:0x00ea, B:39:0x00ee), top: B:30:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009a -> B:10:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00e5 -> B:10:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ec -> B:10:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f9 -> B:10:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0107 -> B:9:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0153 -> B:65:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0157 -> B:66:0x0159). Please report as a decompilation issue!!! */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pq pqVar;
        Object obj2;
        ch chVar;
        ve0 ve0Var;
        ve0 ve0Var2;
        ve0 ve0Var3;
        ch chVar2;
        ch chVar3;
        Object obj3;
        Object g;
        rk rkVar;
        Object obj4;
        ww wwVar;
        int i = this.e;
        dh dhVar = dh.e;
        ej0 ej0Var = this.j;
        fs0 fs0Var = fs0.a;
        switch (i) {
            case 0:
                ve0 ve0Var4 = this.g;
                int i2 = this.h;
                if (i2 == 0) {
                    t30.z(obj);
                    pqVar = (pq) this.i;
                    obj2 = ve0Var4.e;
                    if (obj2 instanceof qk) {
                    }
                } else if (i2 != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ve0 ve0Var5 = this.f;
                    pqVar = (pq) this.i;
                    t30.z(obj);
                    rk rkVar2 = (rk) obj;
                    ve0Var5.e = rkVar2;
                    obj2 = ve0Var4.e;
                    if (!(obj2 instanceof qk) || (obj2 instanceof nk)) {
                        break;
                    } else {
                        ok okVar = obj2 instanceof ok ? (ok) obj2 : null;
                        if (okVar != null) {
                            pqVar.invoke(okVar);
                        }
                        o9 o9Var = ej0Var.y;
                        if (o9Var != null) {
                            this.i = pqVar;
                            this.f = ve0Var4;
                            this.h = 1;
                            obj = o9Var.B(this);
                            if (obj != dhVar) {
                                ve0Var5 = ve0Var4;
                                rk rkVar22 = (rk) obj;
                                ve0Var5.e = rkVar22;
                                obj2 = ve0Var4.e;
                                if (obj2 instanceof qk) {
                                }
                            }
                        } else {
                            ve0Var5 = ve0Var4;
                            rkVar22 = null;
                            ve0Var5.e = rkVar22;
                            obj2 = ve0Var4.e;
                            if (obj2 instanceof qk) {
                            }
                        }
                    }
                }
                break;
            default:
                switch (this.h) {
                    case 0:
                        t30.z(obj);
                        chVar = (ch) this.i;
                        wwVar = (ww) chVar.e().j(b2.N);
                        if (!(wwVar == null ? wwVar.a() : true)) {
                            ve0Var = new ve0();
                            o9 o9Var2 = ej0Var.y;
                            if (o9Var2 != null) {
                                this.i = chVar;
                                this.f = ve0Var;
                                this.g = ve0Var;
                                this.h = 1;
                                obj = o9Var2.B(this);
                                if (obj != dhVar) {
                                    ve0Var2 = ve0Var;
                                    rkVar = (rk) obj;
                                    ve0Var.e = rkVar;
                                    obj4 = ve0Var2.e;
                                    if (obj4 instanceof pk) {
                                        this.i = chVar;
                                        this.f = ve0Var2;
                                        this.g = null;
                                        this.h = 2;
                                        if (ej0Var.x0((pk) obj4, this) != dhVar) {
                                            ve0Var3 = ve0Var2;
                                            chVar2 = chVar;
                                            yk ykVar = new yk(ve0Var3, ej0Var, null);
                                            this.i = chVar2;
                                            this.f = ve0Var3;
                                            this.h = 3;
                                            mj0 mj0Var = ej0Var.V;
                                            g = mj0Var.g(v40.f, new f(ykVar, mj0Var, null, 8), this);
                                            if (g != dhVar) {
                                                g = fs0Var;
                                            }
                                            if (g == dhVar) {
                                            }
                                            chVar = chVar2;
                                            obj3 = ve0Var3.e;
                                            if (obj3 instanceof qk) {
                                                this.i = chVar;
                                                this.f = null;
                                                this.h = 4;
                                                if (ej0Var.y0((qk) obj3, this) == dhVar) {
                                                    break;
                                                }
                                            } else if (obj3 instanceof nk) {
                                                this.i = chVar;
                                                this.f = null;
                                                this.h = 5;
                                                if (ej0Var.w0(this) == dhVar) {
                                                }
                                            }
                                        }
                                    }
                                    wwVar = (ww) chVar.e().j(b2.N);
                                    if (!(wwVar == null ? wwVar.a() : true)) {
                                        break;
                                    }
                                }
                            } else {
                                ve0Var2 = ve0Var;
                                rkVar = null;
                                ve0Var.e = rkVar;
                                obj4 = ve0Var2.e;
                                if (obj4 instanceof pk) {
                                }
                                wwVar = (ww) chVar.e().j(b2.N);
                                if (!(wwVar == null ? wwVar.a() : true)) {
                                }
                            }
                        }
                        break;
                    case 1:
                        ve0Var = this.g;
                        ve0Var2 = this.f;
                        chVar = (ch) this.i;
                        t30.z(obj);
                        rkVar = (rk) obj;
                        ve0Var.e = rkVar;
                        obj4 = ve0Var2.e;
                        if (obj4 instanceof pk) {
                        }
                        wwVar = (ww) chVar.e().j(b2.N);
                        if (!(wwVar == null ? wwVar.a() : true)) {
                        }
                        break;
                    case 2:
                        ve0Var3 = this.f;
                        chVar2 = (ch) this.i;
                        t30.z(obj);
                        yk ykVar2 = new yk(ve0Var3, ej0Var, null);
                        this.i = chVar2;
                        this.f = ve0Var3;
                        this.h = 3;
                        mj0 mj0Var2 = ej0Var.V;
                        g = mj0Var2.g(v40.f, new f(ykVar2, mj0Var2, null, 8), this);
                        if (g != dhVar) {
                        }
                        if (g == dhVar) {
                        }
                        chVar = chVar2;
                        obj3 = ve0Var3.e;
                        if (obj3 instanceof qk) {
                        }
                        wwVar = (ww) chVar.e().j(b2.N);
                        if (!(wwVar == null ? wwVar.a() : true)) {
                        }
                        break;
                    case 3:
                        ve0Var3 = this.f;
                        chVar2 = (ch) this.i;
                        try {
                            t30.z(obj);
                        } catch (CancellationException unused) {
                            chVar3 = chVar2;
                            this.i = chVar3;
                            this.f = null;
                            this.h = 6;
                            if (ej0Var.w0(this) == dhVar) {
                            }
                            chVar = chVar3;
                            wwVar = (ww) chVar.e().j(b2.N);
                            if (!(wwVar == null ? wwVar.a() : true)) {
                            }
                        }
                        chVar = chVar2;
                        obj3 = ve0Var3.e;
                        if (obj3 instanceof qk) {
                        }
                        wwVar = (ww) chVar.e().j(b2.N);
                        if (!(wwVar == null ? wwVar.a() : true)) {
                        }
                        break;
                    case 4:
                        chVar3 = (ch) this.i;
                        try {
                            t30.z(obj);
                        } catch (CancellationException unused2) {
                            this.i = chVar3;
                            this.f = null;
                            this.h = 6;
                            if (ej0Var.w0(this) == dhVar) {
                                return dhVar;
                            }
                            chVar = chVar3;
                            wwVar = (ww) chVar.e().j(b2.N);
                            if (!(wwVar == null ? wwVar.a() : true)) {
                            }
                        }
                        chVar = chVar3;
                        wwVar = (ww) chVar.e().j(b2.N);
                        if (!(wwVar == null ? wwVar.a() : true)) {
                        }
                        break;
                    case Gates.MAX_WINDOWS /* 5 */:
                        chVar3 = (ch) this.i;
                        t30.z(obj);
                        chVar = chVar3;
                        wwVar = (ww) chVar.e().j(b2.N);
                        if (!(wwVar == null ? wwVar.a() : true)) {
                        }
                        break;
                    case 6:
                        chVar3 = (ch) this.i;
                        t30.z(obj);
                        chVar = chVar3;
                        wwVar = (ww) chVar.e().j(b2.N);
                        if (!(wwVar == null ? wwVar.a() : true)) {
                        }
                        break;
                    default:
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
        }
        return fs0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(ej0 ej0Var, ng ngVar) {
        super(2, ngVar);
        this.j = ej0Var;
    }
}
