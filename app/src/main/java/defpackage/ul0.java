package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ul0 extends pf0 implements tq {
    public long[] e;
    public int f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ vl0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul0(vl0 vl0Var, ng ngVar) {
        super(ngVar);
        this.j = vl0Var;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        ul0 ul0Var = new ul0(this.j, ngVar);
        ul0Var.i = obj;
        return ul0Var;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        return ((ul0) create((mk0) obj, (ng) obj2)).invokeSuspend(fs0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00bc -> B:7:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:20:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        mk0 mk0Var;
        long[] jArr;
        int length;
        int i;
        mk0 mk0Var2;
        int i2;
        mk0 mk0Var3;
        int i3;
        vl0 vl0Var = this.j;
        long j = vl0Var.e;
        long j2 = vl0Var.g;
        long j3 = vl0Var.f;
        int i4 = this.h;
        dh dhVar = dh.e;
        if (i4 == 0) {
            t30.z(obj);
            mk0Var = (mk0) this.i;
            jArr = vl0Var.h;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                mk0Var2 = mk0Var;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return fs0.a;
        }
        if (i4 == 1) {
            length = this.g;
            int i5 = this.f;
            jArr = this.e;
            mk0Var = (mk0) this.i;
            t30.z(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = this.f;
                mk0Var3 = (mk0) this.i;
                t30.z(obj);
                i3 = i6 + 1;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        Long l = new Long(j2 + i3 + 64);
                        this.i = mk0Var3;
                        this.e = null;
                        this.f = i3;
                        this.h = 3;
                        mk0Var3.c(l, this);
                        return dhVar;
                    }
                    i6 = i3;
                    i3 = i6 + 1;
                    if (i3 < 64) {
                    }
                }
                return fs0.a;
            }
            i2 = this.f;
            mk0Var2 = (mk0) this.i;
            t30.z(obj);
            i2++;
            if (i2 >= 64) {
                mk0Var = mk0Var2;
                if (j != 0) {
                    mk0Var3 = mk0Var;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return fs0.a;
            }
            if ((j3 & (1 << i2)) != 0) {
                Long l2 = new Long(j2 + i2);
                this.i = mk0Var2;
                this.e = null;
                this.f = i2;
                this.h = 2;
                mk0Var2.c(l2, this);
                return dhVar;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.i = mk0Var;
            this.e = jArr;
            this.f = i;
            this.g = length;
            this.h = 1;
            mk0Var.c(l3, this);
            return dhVar;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return fs0.a;
    }
}
