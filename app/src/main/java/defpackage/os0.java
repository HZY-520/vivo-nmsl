package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class os0 {
    public static final h6 f = new h6(0.0f);
    public final et0 a;
    public long b = Long.MIN_VALUE;
    public h6 c = f;
    public boolean d;
    public float e;

    public os0(f6 f6Var) {
        this.a = f6Var.a(lw.s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        if (r13 != 0.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        if (defpackage.z20.l(r3.getContext()).c(r8, r3) == r12) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r14v7, types: [pq] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a4 -> B:23:0x00a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v5 v5Var, v7 v7Var, og ogVar) {
        ns0 ns0Var;
        int i;
        h6 h6Var;
        final float f2;
        ns0 ns0Var2;
        final v5 v5Var2;
        eq eqVar;
        try {
            if (ogVar instanceof ns0) {
                ns0Var = (ns0) ogVar;
                int i2 = ns0Var.j;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ns0Var.j = i2 - Integer.MIN_VALUE;
                    Object obj = ns0Var.h;
                    i = ns0Var.j;
                    h6Var = f;
                    dh dhVar = dh.e;
                    if (i != 0) {
                        t30.z(obj);
                        if (this.d) {
                            fv.c("animateToZero called while previous animation is running");
                        }
                        a30 a30Var = (a30) ns0Var.getContext().j(b2.P);
                        float r = a30Var != null ? a30Var.r() : 1.0f;
                        this.d = true;
                        f2 = r;
                        ns0Var2 = ns0Var;
                        v5Var2 = v5Var;
                        eqVar = v7Var;
                        if (Math.abs(this.e) >= 0.01f) {
                            pq pqVar = new pq() { // from class: ms0
                                @Override // defpackage.pq
                                public final Object invoke(Object obj2) {
                                    long round;
                                    long longValue = ((Long) obj2).longValue();
                                    os0 os0Var = os0.this;
                                    long j = os0Var.b;
                                    if (j == Long.MIN_VALUE) {
                                        os0Var.b = longValue;
                                        j = longValue;
                                    }
                                    float f3 = os0Var.e;
                                    h6 h6Var2 = new h6(f3);
                                    float f4 = f2;
                                    h6 h6Var3 = os0.f;
                                    if (f4 == 0.0f) {
                                        round = os0Var.a.i(new h6(f3), h6Var3, os0Var.c);
                                    } else {
                                        double d = (longValue - j) / f4;
                                        if (Double.isNaN(d)) {
                                            z6.l("Cannot round NaN value.");
                                            return null;
                                        }
                                        round = Math.round(d);
                                    }
                                    long j2 = round;
                                    float f5 = ((h6) os0Var.a.g(j2, h6Var2, h6Var3, os0Var.c)).a;
                                    os0Var.c = (h6) os0Var.a.e(j2, h6Var2, h6Var3, os0Var.c);
                                    os0Var.b = longValue;
                                    float f6 = os0Var.e - f5;
                                    os0Var.e = f5;
                                    v5Var2.invoke(Float.valueOf(f6));
                                    return fs0.a;
                                }
                            };
                            ns0Var2.e = v5Var2;
                            ns0Var2.f = eqVar;
                            ns0Var2.g = f2;
                            ns0Var2.j = 1;
                            if (z20.l(ns0Var2.getContext()).c(pqVar, ns0Var2) == dhVar) {
                                return dhVar;
                            }
                            eqVar.b();
                        } else {
                            if (Math.abs(this.e) == 0.0f) {
                                this.b = Long.MIN_VALUE;
                                this.c = h6Var;
                                this.d = false;
                                return fs0.a;
                            }
                            c cVar = new c(10, this, v5Var2);
                            ns0Var2.e = eqVar;
                            ns0Var2.f = null;
                            ns0Var2.j = 2;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                z6.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            eqVar = (eq) ns0Var.e;
                            t30.z(obj);
                            eqVar.b();
                            this.b = Long.MIN_VALUE;
                            this.c = h6Var;
                            this.d = false;
                            return fs0.a;
                        }
                        float f3 = ns0Var.g;
                        eq eqVar2 = ns0Var.f;
                        ?? r14 = (pq) ns0Var.e;
                        t30.z(obj);
                        ns0Var2 = ns0Var;
                        eqVar = eqVar2;
                        f2 = f3;
                        v5Var2 = r14;
                        eqVar.b();
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            this.b = Long.MIN_VALUE;
            this.c = h6Var;
            this.d = false;
            throw th;
        }
        ns0Var = new ns0(this, ogVar);
        Object obj2 = ns0Var.h;
        i = ns0Var.j;
        h6Var = f;
        dh dhVar2 = dh.e;
    }
}
