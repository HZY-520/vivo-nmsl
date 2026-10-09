package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class bq extends pf0 implements tq {
    public final /* synthetic */ int e = 1;
    public Object f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ br i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(tg tgVar, tq tqVar, ng ngVar) {
        super(ngVar);
        this.h = tgVar;
        this.i = tqVar;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        int i = this.e;
        br brVar = this.i;
        switch (i) {
            case 0:
                bq bqVar = new bq((tg) this.h, (tq) brVar, ngVar);
                bqVar.f = obj;
                return bqVar;
            default:
                bq bqVar2 = new bq((eq) brVar, ngVar);
                bqVar2.h = obj;
                return bqVar2;
        }
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        switch (i) {
            case 0:
                return ((bq) create((jo0) obj, (ng) obj2)).invokeSuspend(fs0Var);
            default:
                return ((bq) create((mk0) obj, (ng) obj2)).invokeSuspend(fs0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if (r13 != r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
    
        if (r13 == r4) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, jo0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0040 -> B:7:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009a -> B:23:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00af -> B:23:0x006a). Please report as a decompilation issue!!! */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jo0 jo0Var;
        jo0 jo0Var2;
        mk0 mk0Var;
        Object b;
        int i = this.e;
        fs0 fs0Var = fs0.a;
        br brVar = this.i;
        jo0 jo0Var3 = "call to 'resume' before 'invoke' with coroutine";
        dh dhVar = dh.e;
        switch (i) {
            case 0:
                tg tgVar = (tg) this.h;
                int i2 = this.g;
                sc0 sc0Var = sc0.g;
                try {
                } catch (CancellationException e) {
                    e = e;
                    if (!q3.z(tgVar)) {
                        this.f = jo0Var3;
                        this.g = 3;
                        Object g = dx0.g(jo0Var3, sc0Var, this);
                        jo0Var2 = jo0Var3;
                        break;
                    } else {
                        throw e;
                    }
                }
                if (i2 == 0) {
                    t30.z(obj);
                    jo0Var = (jo0) this.f;
                    if (q3.z(tgVar)) {
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            jo0 jo0Var4 = (jo0) this.f;
                            t30.z(obj);
                            jo0Var2 = jo0Var4;
                        } else {
                            if (i2 != 3) {
                                z6.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            jo0 jo0Var5 = (jo0) this.f;
                            t30.z(obj);
                            jo0Var2 = jo0Var5;
                        }
                        jo0Var = jo0Var2;
                        if (q3.z(tgVar)) {
                            return fs0Var;
                        }
                        try {
                        } catch (CancellationException e2) {
                            jo0Var3 = jo0Var;
                            e = e2;
                            if (!q3.z(tgVar)) {
                            }
                        }
                        this.f = jo0Var;
                        this.g = 1;
                        if (((tq) brVar).invoke(jo0Var, this) != dhVar) {
                            jo0Var3 = jo0Var;
                            this.f = jo0Var3;
                            this.g = 2;
                            Object g2 = dx0.g(jo0Var3, sc0Var, this);
                            jo0Var2 = jo0Var3;
                            break;
                        }
                        return dhVar;
                    }
                    jo0 jo0Var6 = (jo0) this.f;
                    t30.z(obj);
                    jo0Var3 = jo0Var6;
                    this.f = jo0Var3;
                    this.g = 2;
                    Object g22 = dx0.g(jo0Var3, sc0Var, this);
                    jo0Var2 = jo0Var3;
                }
            default:
                int i3 = this.g;
                if (i3 == 0) {
                    t30.z(obj);
                    mk0Var = (mk0) this.h;
                    b = ((eq) brVar).b();
                    if (b != null) {
                    }
                } else {
                    if (i3 != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = this.f;
                    mk0Var = (mk0) this.h;
                    t30.z(obj);
                    if (obj2 == null) {
                        return fs0Var;
                    }
                    b = ((eq) brVar).b();
                    if (b != null) {
                        this.h = mk0Var;
                        this.f = b;
                        this.g = 1;
                        mk0Var.c(b, this);
                        return dhVar;
                    }
                    obj2 = null;
                    if (obj2 == null) {
                    }
                    b = ((eq) brVar).b();
                    if (b != null) {
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(eq eqVar, ng ngVar) {
        super(ngVar);
        this.i = eqVar;
    }
}
