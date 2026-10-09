package defpackage;

import android.view.View;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class d extends go0 implements tq {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, ng ngVar, int i) {
        super(2, ngVar);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new d((b40) this.g, (ot) obj2, ngVar, 0);
            case 1:
                return new d((b40) this.g, (pt) obj2, ngVar, 1);
            case 2:
                return new d((a9) this.g, (v7) obj2, ngVar, 2);
            case 3:
                return new d((b40) this.g, (fm0) obj2, ngVar, 3);
            case 4:
                d dVar = new d((za) obj2, ngVar, 4);
                dVar.g = obj;
                return dVar;
            case Gates.MAX_WINDOWS /* 5 */:
                d dVar2 = new d((za) obj2, ngVar, 5);
                dVar2.g = obj;
                return dVar2;
            case 6:
                return new d((he) this.g, (Runnable) obj2, ngVar, 6);
            case 7:
                return new d((an0) this.g, (b30) obj2, ngVar, 7);
            case MainActivity.$stable /* 8 */:
                d dVar3 = new d((o30) obj2, ngVar, 8);
                dVar3.g = obj;
                return dVar3;
            case 9:
                return new d((k60) this.g, (tq) obj2, ngVar, 9);
            case 10:
                d dVar4 = new d((o9) obj2, ngVar, 10);
                dVar4.g = obj;
                return dVar4;
            case 11:
                d dVar5 = new d((g5) obj2, ngVar, 11);
                dVar5.g = obj;
                return dVar5;
            case 12:
                return new d((qk) this.g, (ej0) obj2, ngVar, 12);
            case 13:
                return new d((r4) this.g, (f6) obj2, ngVar, 13);
            case 14:
                d dVar6 = new d((bo) obj2, ngVar, 14);
                dVar6.g = obj;
                return dVar6;
            default:
                return new d((le0) this.g, (View) obj2, ngVar, 15);
        }
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        fs0 fs0Var = fs0.a;
        switch (i) {
            case 0:
                return ((d) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 1:
                return ((d) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 2:
                return ((d) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 3:
                return ((d) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 4:
                return ((d) create((md0) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case Gates.MAX_WINDOWS /* 5 */:
                return ((d) create((bo) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 6:
                return ((d) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 7:
                ((d) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
                return dh.e;
            case MainActivity.$stable /* 8 */:
                return ((d) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 9:
                return ((d) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 10:
                return ((d) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 11:
                return ((d) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 12:
                return ((d) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 13:
                return ((d) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
            case 14:
                return ((d) create(obj, (ng) obj2)).invokeSuspend(fs0Var);
            default:
                return ((d) create((ch) obj, (ng) obj2)).invokeSuspend(fs0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01df, code lost:
    
        if (r1.d(r2, r3, r4, r5, r14) != r10) goto L104;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x01df -> B:96:0x01ac). Please report as a decompilation issue!!! */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ch chVar;
        Object obj2;
        Object B;
        int i = this.e;
        ww wwVar = null;
        int i2 = 0;
        int i3 = 2;
        fs0 fs0Var = fs0.a;
        Object obj3 = this.h;
        dh dhVar = dh.e;
        int i4 = 1;
        wm0 wm0Var = null;
        switch (i) {
            case 0:
                int i5 = this.f;
                if (i5 == 0) {
                    t30.z(obj);
                    this.f = 1;
                    return ((b40) this.g).a((ot) obj3, this) == dhVar ? dhVar : fs0Var;
                }
                if (i5 == 1) {
                    t30.z(obj);
                    return fs0Var;
                }
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i6 = this.f;
                if (i6 == 0) {
                    t30.z(obj);
                    this.f = 1;
                    return ((b40) this.g).a((pt) obj3, this) == dhVar ? dhVar : fs0Var;
                }
                if (i6 == 1) {
                    t30.z(obj);
                    return fs0Var;
                }
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                int i7 = this.f;
                if (i7 == 0) {
                    t30.z(obj);
                    this.f = 1;
                    return lr0.f((a9) this.g, (v7) obj3, this) == dhVar ? dhVar : fs0Var;
                }
                if (i7 == 1) {
                    t30.z(obj);
                    return fs0Var;
                }
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
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
                bl0 bl0Var = ((b40) this.g).a;
                v9 v9Var = new v9(i2, (fm0) obj3);
                this.f = 1;
                bl0.j(bl0Var, v9Var, this);
                return dhVar;
            case 4:
                int i9 = this.f;
                if (i9 != 0) {
                    if (i9 == 1) {
                        t30.z(obj);
                        return fs0Var;
                    }
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t30.z(obj);
                md0 md0Var = (md0) this.g;
                this.f = 1;
                Object a = ((za) obj3).a(new kk0(md0Var), this);
                if (a != dhVar) {
                    a = fs0Var;
                }
                return a == dhVar ? dhVar : fs0Var;
            case Gates.MAX_WINDOWS /* 5 */:
                int i10 = this.f;
                if (i10 == 0) {
                    t30.z(obj);
                    bo boVar = (bo) this.g;
                    this.f = 1;
                    return ((za) obj3).a(boVar, this) == dhVar ? dhVar : fs0Var;
                }
                if (i10 == 1) {
                    t30.z(obj);
                    return fs0Var;
                }
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                he heVar = (he) this.g;
                int i11 = this.f;
                if (i11 == 0) {
                    t30.z(obj);
                    af0 af0Var = heVar.f;
                    this.f = 1;
                    Object a2 = af0Var.a(0.0f - af0Var.c, this);
                    if (a2 != dhVar) {
                        a2 = fs0Var;
                    }
                    if (a2 == dhVar) {
                        return dhVar;
                    }
                } else {
                    if (i11 != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t30.z(obj);
                }
                heVar.c.a.setValue(Boolean.FALSE);
                ((Runnable) obj3).run();
                return fs0Var;
            case 7:
                int i12 = this.f;
                if (i12 == 0) {
                    t30.z(obj);
                    an0 an0Var = (an0) this.g;
                    v9 v9Var2 = new v9(i4, (b30) obj3);
                    this.f = 1;
                    if (an0Var.b(v9Var2, this) == dhVar) {
                        return dhVar;
                    }
                } else {
                    if (i12 != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t30.z(obj);
                }
                throw new id();
            case MainActivity.$stable /* 8 */:
                o30 o30Var = (o30) obj3;
                int i13 = this.f;
                try {
                    if (i13 == 0) {
                        t30.z(obj);
                        chVar = (ch) this.g;
                    } else if (i13 == 1) {
                        chVar = (ch) this.g;
                        t30.z(obj);
                        obj2 = obj;
                        j30 j30Var = (j30) obj2;
                        float o = o30Var.c.o(6.0f);
                        float o2 = o30Var.c.o(1.0f);
                        mj0 mj0Var = o30Var.a;
                        this.g = chVar;
                        this.f = 2;
                        break;
                    } else {
                        if (i13 != 2) {
                            z6.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        chVar = (ch) this.g;
                        t30.z(obj);
                    }
                    if (!q3.z(chVar.e())) {
                        return fs0Var;
                    }
                    o9 o9Var = o30Var.g;
                    this.g = chVar;
                    this.f = 1;
                    obj2 = o9Var.B(this);
                    if (obj2 == dhVar) {
                        return dhVar;
                    }
                    j30 j30Var2 = (j30) obj2;
                    float o3 = o30Var.c.o(6.0f);
                    float o22 = o30Var.c.o(1.0f);
                    mj0 mj0Var2 = o30Var.a;
                    this.g = chVar;
                    this.f = 2;
                } finally {
                    o30Var.h = null;
                }
            case 9:
                int i14 = this.f;
                if (i14 == 0) {
                    t30.z(obj);
                    this.f = 1;
                    return ((k60) this.g).a.g(v40.f, (tq) obj3, this) == dhVar ? dhVar : fs0Var;
                }
                if (i14 == 1) {
                    t30.z(obj);
                    return fs0Var;
                }
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                int i15 = this.f;
                try {
                    if (i15 == 0) {
                        t30.z(obj);
                        wwVar = q3.A((ch) this.g, null, new qh(i3, wm0Var), 3);
                        this.g = wwVar;
                        this.f = 1;
                        B = ((o9) obj3).B(this);
                        if (B == dhVar) {
                            return dhVar;
                        }
                    } else {
                        if (i15 != 1) {
                            z6.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        wwVar = (ww) this.g;
                        t30.z(obj);
                        B = obj;
                    }
                    wwVar.b(null);
                    return B;
                } catch (Throwable th) {
                    wwVar.b(null);
                    throw th;
                }
            case 11:
                int i16 = this.f;
                if (i16 != 0) {
                    if (i16 == 1) {
                        t30.z(obj);
                        return fs0Var;
                    }
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t30.z(obj);
                ch chVar2 = (ch) this.g;
                g5 g5Var = (g5) obj3;
                bl0 bl0Var2 = g5Var.s.a;
                yj yjVar = new yj(g5Var, chVar2);
                this.f = 1;
                bl0.j(bl0Var2, yjVar, this);
                return dhVar;
            case 12:
                int i17 = this.f;
                if (i17 != 0) {
                    if (i17 == 1) {
                        t30.z(obj);
                        return fs0Var;
                    }
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t30.z(obj);
                qk qkVar = (qk) this.g;
                float f = qkVar.b ? -1.0f : 1.0f;
                mj0 mj0Var3 = ((ej0) obj3).V;
                long j = qkVar.a;
                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
                long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat2);
                this.f = 1;
                return mj0Var3.c((floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), false, this) == dhVar ? dhVar : fs0Var;
            case 13:
                int i18 = this.f;
                if (i18 == 0) {
                    t30.z(obj);
                    this.f = 1;
                    return y5.a((y5) ((r4) this.g).c, new Float(0.0f), (f6) obj3, this) == dhVar ? dhVar : fs0Var;
                }
                if (i18 == 1) {
                    t30.z(obj);
                    return fs0Var;
                }
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                int i19 = this.f;
                if (i19 == 0) {
                    t30.z(obj);
                    Object obj4 = this.g;
                    this.f = 1;
                    return ((bo) obj3).d(obj4, this) == dhVar ? dhVar : fs0Var;
                }
                if (i19 == 1) {
                    t30.z(obj);
                    return fs0Var;
                }
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                le0 le0Var = (le0) this.g;
                View view = (View) obj3;
                int i20 = this.f;
                try {
                    if (i20 == 0) {
                        t30.z(obj);
                        this.f = 1;
                        Object s = dx0.s(le0Var.u, new he0(i3, wm0Var, i2), this);
                        if (s != dhVar) {
                            s = fs0Var;
                        }
                        if (s == dhVar) {
                            return dhVar;
                        }
                    } else {
                        if (i20 != 1) {
                            z6.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        t30.z(obj);
                    }
                    if (tw0.a(view) != le0Var) {
                        return fs0Var;
                    }
                    view.setTag(2131034155, null);
                    return fs0Var;
                } finally {
                    if (tw0.a(view) == le0Var) {
                        view.setTag(2131034155, null);
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, ng ngVar, int i) {
        super(2, ngVar);
        this.e = i;
        this.h = obj;
    }
}
