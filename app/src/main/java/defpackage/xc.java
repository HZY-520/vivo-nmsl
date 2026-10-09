package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class xc implements pq {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ xc(aj ajVar, cw cwVar, g40 g40Var, int i) {
        this.g = ajVar;
        this.h = cwVar;
        this.i = g40Var;
        this.f = i;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        int i = this.e;
        int i2 = 0;
        fs0 fs0Var = fs0.a;
        Object obj2 = this.i;
        int i3 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ec0[] ec0VarArr = (ec0[]) obj4;
                w00 w00Var = (w00) obj3;
                int[] iArr = (int[]) obj2;
                dc0 dc0Var = (dc0) obj;
                int length = ec0VarArr.length;
                int i4 = 0;
                while (i2 < length) {
                    ec0 ec0Var = ec0VarArr[i2];
                    int i5 = i4 + 1;
                    ec0Var.getClass();
                    ec0Var.e();
                    float f = (i3 - ec0Var.e) / 2.0f;
                    float f2 = -1.0f;
                    if (w00Var.getLayoutDirection() != xx.e) {
                        f2 = (-1.0f) * (-1.0f);
                    }
                    dc0.e(dc0Var, ec0Var, Math.round((1.0f + f2) * f), iArr[i4]);
                    i2++;
                    i4 = i5;
                }
                return fs0Var;
            case 1:
                cw cwVar = (cw) obj3;
                g40 g40Var = (g40) obj2;
                if (obj == ((aj) obj4)) {
                    z6.m("A derived state calculation cannot read itself");
                    return null;
                }
                if (!(obj instanceof gn0)) {
                    return fs0Var;
                }
                int i6 = cwVar.a - i3;
                int c = g40Var.c(obj);
                g40Var.f(Math.min(i6, c >= 0 ? g40Var.c[c] : Integer.MAX_VALUE), obj);
                return fs0Var;
            default:
                ec0[] ec0VarArr2 = (ec0[]) obj4;
                ug0 ug0Var = (ug0) obj3;
                int[] iArr2 = (int[]) obj2;
                dc0 dc0Var2 = (dc0) obj;
                int length2 = ec0VarArr2.length;
                int i7 = 0;
                while (i2 < length2) {
                    ec0 ec0Var2 = ec0VarArr2[i2];
                    ec0Var2.getClass();
                    ec0Var2.e();
                    dc0.e(dc0Var2, ec0Var2, iArr2[i7], Math.round((ug0Var.b.a + 1.0f) * ((i3 - ec0Var2.f) / 2.0f)));
                    i2++;
                    i7++;
                }
                return fs0Var;
        }
    }

    public /* synthetic */ xc(ec0[] ec0VarArr, yc ycVar, int i, w00 w00Var, int[] iArr) {
        this.g = ec0VarArr;
        this.f = i;
        this.h = w00Var;
        this.i = iArr;
    }

    public /* synthetic */ xc(ec0[] ec0VarArr, ug0 ug0Var, int i, int[] iArr) {
        this.g = ec0VarArr;
        this.h = ug0Var;
        this.f = i;
        this.i = iArr;
    }
}
