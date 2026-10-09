package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class bj0 implements o50 {
    public final mj0 e;
    public boolean f;

    public bj0(mj0 mj0Var, boolean z) {
        this.e = mj0Var;
        this.f = z;
    }

    @Override // defpackage.o50
    public final long A(int i, long j, long j2) {
        if (!this.f) {
            return 0L;
        }
        mj0 mj0Var = this.e;
        if (mj0Var.a.c()) {
            return 0L;
        }
        return mj0Var.i(mj0Var.e(mj0Var.a.e(mj0Var.e(mj0Var.h(j2)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // defpackage.o50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b0(long j, long j2, og ogVar) {
        aj0 aj0Var;
        int i;
        long j3;
        if (ogVar instanceof aj0) {
            aj0Var = (aj0) ogVar;
            int i2 = aj0Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aj0Var.h = i2 - Integer.MIN_VALUE;
                Object obj = aj0Var.f;
                i = aj0Var.h;
                if (i != 0) {
                    t30.z(obj);
                    j3 = 0;
                    if (this.f) {
                        mj0 mj0Var = this.e;
                        if (!mj0Var.i) {
                            aj0Var.e = j2;
                            aj0Var.h = 1;
                            obj = mj0Var.a(j2, aj0Var);
                            dh dhVar = dh.e;
                            if (obj == dhVar) {
                                return dhVar;
                            }
                        }
                        j3 = ft0.d(j2, j3);
                    }
                    return new ft0(j3);
                }
                if (i != 1) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = aj0Var.e;
                t30.z(obj);
                j3 = ((ft0) obj).a;
                j3 = ft0.d(j2, j3);
                return new ft0(j3);
            }
        }
        aj0Var = new aj0(this, ogVar);
        Object obj2 = aj0Var.f;
        i = aj0Var.h;
        if (i != 0) {
        }
        j3 = ((ft0) obj2).a;
        j3 = ft0.d(j2, j3);
        return new ft0(j3);
    }
}
