package defpackage;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class z5 extends go0 implements tq {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5(Object obj, Object obj2, Object obj3, Object obj4, ng ngVar, int i) {
        super(2, ngVar);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        int i = this.e;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                return new z5(this.g, (y5) this.h, (p40) this.i, (p40) obj2, ngVar, 0);
            case 1:
                return new z5((he) this.g, (ScrollCaptureSession) this.h, (Rect) this.i, (Consumer) obj2, ngVar, 1);
            case 2:
                z5 z5Var = new z5((ao) this.h, (cn0) this.i, (Float) obj2, ngVar);
                z5Var.g = obj;
                return z5Var;
            case 3:
                return new z5((ym0) this.g, (ao) this.h, (cn0) this.i, (Float) obj2, ngVar, 3);
            case 4:
                z5 z5Var2 = new z5((xq0) obj2, ngVar);
                z5Var2.g = obj;
                return z5Var2;
            default:
                return new z5((ve0) this.g, (le0) this.h, (ez) this.i, (qw0) obj2, ngVar, 5);
        }
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        switch (i) {
        }
        return ((z5) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e1 -> B:32:0x00af). Please report as a decompilation issue!!! */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        m9 m9Var;
        ch chVar;
        xq0 xq0Var;
        Object obj2;
        ch chVar2;
        mj0 mj0Var;
        int i = this.e;
        int i2 = 2;
        dh dhVar = dh.e;
        fs0 fs0Var = fs0.a;
        Object obj3 = this.j;
        int i3 = 1;
        wm0 wm0Var = null;
        switch (i) {
            case 0:
                Object obj4 = this.g;
                y5 y5Var = (y5) this.h;
                int i4 = this.f;
                if (i4 == 0) {
                    t30.z(obj);
                    if (!lw.i(obj4, y5Var.e.getValue())) {
                        p40 p40Var = (p40) this.i;
                        int i5 = b6.a;
                        f6 f6Var = (f6) p40Var.getValue();
                        this.f = 1;
                        if (y5.a(y5Var, obj4, f6Var, this) == dhVar) {
                            return dhVar;
                        }
                    }
                    return fs0Var;
                }
                if (i4 != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t30.z(obj);
                int i6 = b6.a;
                pq pqVar = (pq) ((p40) obj3).getValue();
                if (pqVar != null) {
                    pqVar.invoke(y5Var.c.f.getValue());
                }
                return fs0Var;
            case 1:
                int i7 = this.f;
                if (i7 == 0) {
                    t30.z(obj);
                    he heVar = (he) this.g;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.h;
                    Rect rect = (Rect) this.i;
                    bw bwVar = new bw(rect.left, rect.top, rect.right, rect.bottom);
                    this.f = 1;
                    a = heVar.a(scrollCaptureSession, bwVar, this);
                    if (a == dhVar) {
                        return dhVar;
                    }
                } else {
                    if (i7 != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t30.z(obj);
                    a = obj;
                }
                ((Consumer) obj3).accept(m20.n((bw) a));
                return fs0Var;
            case 2:
                cn0 cn0Var = (cn0) this.i;
                int i8 = this.f;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t30.z(obj);
                        return fs0Var;
                    }
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t30.z(obj);
                int ordinal = ((dl0) this.g).ordinal();
                if (ordinal == 0) {
                    ao aoVar = (ao) this.h;
                    this.f = 1;
                    if (aoVar.b(cn0Var, this) == dhVar) {
                        return dhVar;
                    }
                } else if (ordinal != 1) {
                    if (ordinal != 2) {
                        z6.j();
                        return null;
                    }
                    Float f = (Float) obj3;
                    if (f == lw.r) {
                        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                    }
                    cn0Var.i(null, f);
                }
                return fs0Var;
            case 3:
                ao aoVar2 = (ao) this.h;
                cn0 cn0Var2 = (cn0) this.i;
                int i9 = this.f;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            t30.z(obj);
                            this.f = 3;
                            if (aoVar2.b(cn0Var2, this) == dhVar) {
                                return dhVar;
                            }
                            return fs0Var;
                        }
                        if (i9 != 3 && i9 != 4) {
                            z6.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    t30.z(obj);
                    return fs0Var;
                }
                t30.z(obj);
                ym0 ym0Var = (ym0) this.g;
                if (ym0Var == el0.a) {
                    this.f = 1;
                    if (aoVar2.b(cn0Var2, this) == dhVar) {
                        return dhVar;
                    }
                } else if (ym0Var == el0.b) {
                    vn0 g = cn0Var2.g();
                    ko koVar = new ko(2, null);
                    this.f = 2;
                    if (dx0.s(g, koVar, this) == dhVar) {
                        return dhVar;
                    }
                    this.f = 3;
                    if (aoVar2.b(cn0Var2, this) == dhVar) {
                    }
                } else {
                    vn0 g2 = cn0Var2.g();
                    xm0 xm0Var = new xm0(ym0Var, null);
                    int i10 = ho.a;
                    sm smVar = sm.e;
                    m9 m9Var2 = m9.e;
                    ao q = nh.q(nh.q(new p2(6, new za(xm0Var, g2, smVar, -2, m9Var2), new he0(i2, wm0Var, i3))));
                    z5 z5Var = new z5(aoVar2, cn0Var2, (Float) obj3, null);
                    this.f = 4;
                    za zaVar = new za(new go(z5Var, null), q, smVar, -2, m9Var2);
                    tg tgVar = zaVar.e;
                    smVar.g(tgVar);
                    m9 m9Var3 = m9.e;
                    int i11 = 0;
                    m9 m9Var4 = zaVar.g;
                    int i12 = zaVar.f;
                    if (m9Var2 != m9Var3) {
                        m9Var = m9Var2;
                    } else {
                        if (i12 != -3 && i12 != -2 && (i11 = i12 + 0) < 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        m9Var = m9Var4;
                    }
                    int i13 = i11;
                    if (!lw.i(tgVar, tgVar) || i13 != i12 || m9Var != m9Var4) {
                        zaVar = new za(zaVar.i, zaVar.h, tgVar, i13, m9Var);
                    }
                    Object b = zaVar.b(l60.e, this);
                    if (b != dhVar) {
                        b = fs0Var;
                    }
                    if (b != dhVar) {
                        b = fs0Var;
                    }
                    if (b == dhVar) {
                        return dhVar;
                    }
                }
                return fs0Var;
            case 4:
                xq0 xq0Var2 = (xq0) obj3;
                int i14 = this.f;
                try {
                    if (i14 == 0) {
                        t30.z(obj);
                        chVar = (ch) this.g;
                    } else if (i14 == 1) {
                        mj0Var = (mj0) this.i;
                        xq0 xq0Var3 = (xq0) this.h;
                        ch chVar3 = (ch) this.g;
                        t30.z(obj);
                        xq0Var = xq0Var3;
                        chVar2 = chVar3;
                        obj2 = obj;
                        this.g = chVar2;
                        this.h = null;
                        this.i = null;
                        this.f = 2;
                        if (xq0Var.c(mj0Var, (vq0) obj2, this) != dhVar) {
                            return dhVar;
                        }
                        chVar = chVar2;
                    } else {
                        if (i14 != 2) {
                            z6.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        chVar = (ch) this.g;
                        t30.z(obj);
                    }
                    if (!q3.z(chVar.e())) {
                        return fs0Var;
                    }
                    mj0 mj0Var2 = xq0Var2.a;
                    o9 o9Var = xq0Var2.f;
                    this.g = chVar;
                    this.h = xq0Var2;
                    this.i = mj0Var2;
                    this.f = 1;
                    obj2 = o9Var.B(this);
                    if (obj2 == dhVar) {
                        return dhVar;
                    }
                    chVar2 = chVar;
                    mj0Var = mj0Var2;
                    xq0Var = xq0Var2;
                    this.g = chVar2;
                    this.h = null;
                    this.i = null;
                    this.f = 2;
                    if (xq0Var.c(mj0Var, (vq0) obj2, this) != dhVar) {
                    }
                } finally {
                    xq0Var2.g = null;
                }
            default:
                qw0 qw0Var = (qw0) obj3;
                ez ezVar = (ez) this.i;
                le0 le0Var = (le0) this.h;
                int i15 = this.f;
                try {
                    if (i15 == 0) {
                        t30.z(obj);
                        b30 b30Var = (b30) ((ve0) this.g).e;
                        if (b30Var != null) {
                            b30Var.f = t10.a(le0Var.w);
                        }
                        this.f = 1;
                        Object P = q3.P(le0Var.a, new ie0(le0Var, new ke0(le0Var, null), z20.l(getContext()), null, 0), this);
                        if (P != dhVar) {
                            P = fs0Var;
                        }
                        if (P != dhVar) {
                            P = fs0Var;
                        }
                        if (P == dhVar) {
                            return dhVar;
                        }
                    } else {
                        if (i15 != 1) {
                            z6.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        t30.z(obj);
                    }
                    return fs0Var;
                } finally {
                    ezVar.getLifecycle().b(qw0Var);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(xq0 xq0Var, ng ngVar) {
        super(2, ngVar);
        this.e = 4;
        this.j = xq0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(ao aoVar, cn0 cn0Var, Float f, ng ngVar) {
        super(2, ngVar);
        this.e = 2;
        this.h = aoVar;
        this.i = cn0Var;
        this.j = f;
    }
}
