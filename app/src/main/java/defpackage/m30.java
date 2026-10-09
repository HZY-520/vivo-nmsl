package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class m30 extends go0 implements tq {
    public re0 e;
    public re0 f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ se0 j;
    public final /* synthetic */ ve0 k;
    public final /* synthetic */ ve0 l;
    public final /* synthetic */ float m;
    public final /* synthetic */ o30 n;
    public final /* synthetic */ float o;
    public final /* synthetic */ mj0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(se0 se0Var, ve0 ve0Var, ve0 ve0Var2, float f, o30 o30Var, float f2, mj0 mj0Var, ng ngVar) {
        super(2, ngVar);
        this.j = se0Var;
        this.k = ve0Var;
        this.l = ve0Var2;
        this.m = f;
        this.n = o30Var;
        this.o = f2;
        this.p = mj0Var;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        m30 m30Var = new m30(this.j, this.k, this.l, this.m, this.n, this.o, this.p, ngVar);
        m30Var.i = obj;
        return m30Var;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        return ((m30) create((kj0) obj, (ng) obj2)).invokeSuspend(fs0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f0 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x01ae -> B:7:0x01af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x01bf -> B:9:0x0074). Please report as a decompilation issue!!! */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kj0 kj0Var;
        re0 re0Var;
        Object obj2;
        char c;
        se0 se0Var;
        re0 re0Var2;
        ve0 ve0Var;
        int i;
        char c2;
        boolean z;
        m30 m30Var = this;
        int i2 = m30Var.h;
        Object obj3 = null;
        ve0 ve0Var2 = m30Var.l;
        se0 se0Var2 = m30Var.j;
        char c3 = 3;
        char c4 = 2;
        ve0 ve0Var3 = m30Var.k;
        dh dhVar = dh.e;
        if (i2 == 0) {
            t30.z(obj);
            kj0 kj0Var2 = (kj0) m30Var.i;
            re0 re0Var3 = new re0();
            re0Var3.e = true;
            kj0Var = kj0Var2;
            re0Var = re0Var3;
            z = re0Var.e;
            Object obj4 = fs0.a;
            if (!z) {
            }
        } else if (i2 == 1) {
            re0 re0Var4 = m30Var.f;
            re0 re0Var5 = m30Var.e;
            kj0 kj0Var3 = (kj0) m30Var.i;
            t30.z(obj);
            re0Var = re0Var5;
            kj0Var = kj0Var3;
            obj2 = null;
            c2 = 3;
            c = 2;
            re0Var4.e = ((Boolean) obj).booleanValue();
            m30Var = this;
            ve0Var3 = ve0Var3;
            c3 = c2;
            c4 = c;
            obj3 = obj2;
            z = re0Var.e;
            Object obj42 = fs0.a;
            if (!z) {
            }
        } else if (i2 == 2) {
            i = m30Var.g;
            re0 re0Var6 = m30Var.e;
            kj0 kj0Var4 = (kj0) m30Var.i;
            t30.z(obj);
            ve0Var = ve0Var2;
            se0Var = se0Var2;
            kj0Var = kj0Var4;
            obj2 = null;
            c = 2;
            re0Var2 = re0Var6;
            if (re0Var2.e) {
            }
        } else {
            if (i2 != 3) {
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            re0 re0Var7 = m30Var.f;
            re0 re0Var8 = m30Var.e;
            kj0 kj0Var5 = (kj0) m30Var.i;
            t30.z(obj);
            re0Var = re0Var8;
            kj0Var = kj0Var5;
            obj2 = null;
            c2 = 3;
            c = 2;
            ve0 ve0Var4 = ve0Var3;
            re0Var2 = re0Var7;
            Object e = obj;
            re0Var2.e = ((Boolean) e).booleanValue();
            ve0Var3 = ve0Var4;
            c3 = c2;
            c4 = c;
            obj3 = obj2;
            z = re0Var.e;
            Object obj422 = fs0.a;
            if (!z) {
                re0Var.e = false;
                float floatValue = se0Var2.e - ((Number) ((g6) ve0Var3.e).f.getValue()).floatValue();
                boolean z2 = ((j30) ve0Var2.e).c;
                o30 o30Var = m30Var.n;
                if (!z2) {
                    float abs = Math.abs(floatValue);
                    float f = m30Var.m;
                    if (abs >= f) {
                        float signum = Math.signum(floatValue) * f;
                        o30Var.c(kj0Var, signum);
                        g6 g6Var = (g6) ve0Var3.e;
                        g6 g6Var2 = new g6(g6Var.e, Float.valueOf(((Number) g6Var.f.getValue()).floatValue() + signum), new h6(((h6) g6Var.g).a), g6Var.h, g6Var.i, g6Var.j);
                        ve0Var3.e = g6Var2;
                        int B = t10.B(Math.abs(se0Var2.e - ((Number) g6Var2.f.getValue()).floatValue()) / m30Var.o);
                        int i3 = B > 100 ? 100 : B;
                        g6 g6Var3 = (g6) ve0Var3.e;
                        float f2 = se0Var2.e;
                        ve0 ve0Var5 = ve0Var2;
                        se0 se0Var3 = se0Var2;
                        o30 o30Var2 = m30Var.n;
                        l30 l30Var = new l30(o30Var2, ve0Var5, se0Var3, m30Var.p, re0Var);
                        se0Var = se0Var3;
                        re0Var2 = re0Var;
                        ve0Var = ve0Var5;
                        m30Var.i = kj0Var;
                        m30Var.e = re0Var2;
                        m30Var.f = null;
                        m30Var.g = i3;
                        m30Var.h = 2;
                        o30Var2.getClass();
                        se0 se0Var4 = new se0();
                        se0Var4.e = ((Number) g6Var3.f.getValue()).floatValue();
                        c = 2;
                        obj2 = null;
                        Object c5 = u10.c(g6Var3, new uo0(new jr0(i3, ol.b), g6Var3.e, g6Var3.f.getValue(), new Float(f2), g6Var3.g), g6Var3.h, new vh(se0Var4, o30Var2, kj0Var, l30Var), m30Var);
                        if (c5 != dhVar) {
                            c5 = obj422;
                        }
                        if (c5 == dhVar) {
                            obj422 = c5;
                        }
                        if (obj422 != dhVar) {
                            i = i3;
                            if (re0Var2.e) {
                                m30Var.i = kj0Var;
                                m30Var.e = re0Var2;
                                m30Var.f = re0Var2;
                                c2 = 3;
                                m30Var.h = 3;
                                ve0Var2 = ve0Var;
                                ve0 ve0Var6 = ve0Var3;
                                se0Var2 = se0Var;
                                e = o30.e(m30Var.n, ve0Var2, se0Var2, m30Var.p, ve0Var6, 50 - i, m30Var);
                                ve0Var4 = ve0Var6;
                                if (e != dhVar) {
                                    re0Var = re0Var2;
                                    re0Var2.e = ((Boolean) e).booleanValue();
                                    ve0Var3 = ve0Var4;
                                    c3 = c2;
                                    c4 = c;
                                    obj3 = obj2;
                                    z = re0Var.e;
                                    Object obj4222 = fs0.a;
                                    if (!z) {
                                        return obj4222;
                                    }
                                }
                            } else {
                                ve0Var2 = ve0Var;
                                re0Var = re0Var2;
                                se0Var2 = se0Var;
                                c4 = c;
                                obj3 = obj2;
                                c3 = 3;
                                z = re0Var.e;
                                Object obj42222 = fs0.a;
                                if (!z) {
                                }
                            }
                        }
                        return dhVar;
                    }
                }
                obj2 = obj3;
                c2 = c3;
                c = c4;
                ve0 ve0Var7 = ve0Var3;
                re0 re0Var9 = re0Var;
                o30Var.c(kj0Var, floatValue);
                m30Var.i = kj0Var;
                m30Var.e = re0Var9;
                m30Var.f = re0Var9;
                m30Var.h = 1;
                Object e2 = o30.e(m30Var.n, ve0Var2, se0Var2, m30Var.p, ve0Var7, 50L, m30Var);
                if (e2 != dhVar) {
                    re0Var = re0Var9;
                    re0Var9.e = ((Boolean) e2).booleanValue();
                    m30Var = this;
                    ve0Var3 = ve0Var7;
                    c3 = c2;
                    c4 = c;
                    obj3 = obj2;
                    z = re0Var.e;
                    Object obj422222 = fs0.a;
                    if (!z) {
                    }
                }
                return dhVar;
            }
        }
    }
}
