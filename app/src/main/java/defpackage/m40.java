package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class m40 extends pf0 implements tq {
    public or e;
    public n40 f;
    public long[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ n40 o;
    public final /* synthetic */ or p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m40(n40 n40Var, or orVar, ng ngVar) {
        super(ngVar);
        this.o = n40Var;
        this.p = orVar;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        m40 m40Var = new m40(this.o, this.p, ngVar);
        m40Var.n = obj;
        return m40Var;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        return ((m40) create((mk0) obj, (ng) obj2)).invokeSuspend(fs0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        mk0 mk0Var;
        n40 n40Var;
        long[] jArr;
        int length;
        or orVar;
        int i;
        long j;
        int i2 = this.m;
        if (i2 == 0) {
            t30.z(obj);
            mk0Var = (mk0) this.n;
            n40Var = this.o;
            jArr = n40Var.f.a;
            length = jArr.length - 2;
            if (length >= 0) {
                orVar = this.p;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return fs0.a;
        }
        if (i2 != 1) {
            z6.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.k;
        int i4 = this.j;
        long j2 = this.l;
        int i5 = this.i;
        int i6 = this.h;
        long[] jArr2 = this.g;
        n40 n40Var2 = this.f;
        or orVar2 = this.e;
        mk0 mk0Var2 = (mk0) this.n;
        t30.z(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                n40Var = n40Var2;
                mk0Var = mk0Var2;
                i = i5;
                orVar = orVar2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        mk0Var2 = mk0Var;
                        i3 = 0;
                        n40Var2 = n40Var;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        orVar2 = orVar;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                orVar2.f = i7;
                                Object obj2 = n40Var2.f.b[i7];
                                this.n = mk0Var2;
                                this.e = orVar2;
                                this.f = n40Var2;
                                this.g = jArr2;
                                this.h = i6;
                                this.i = i5;
                                this.l = j2;
                                this.j = i4;
                                this.k = i3;
                                this.m = 1;
                                mk0Var2.c(obj2, this);
                                return dh.e;
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return fs0.a;
        }
    }
}
