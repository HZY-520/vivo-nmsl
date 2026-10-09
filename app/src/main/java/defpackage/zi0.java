package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class zi0 {
    public static final wi0 a = new wi0();
    public static final kj b = new kj(1);
    public static final xi0 c = new xi0();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(mj0 mj0Var, long j, og ogVar) {
        yi0 yi0Var;
        int i;
        se0 se0Var;
        mj0 mj0Var2;
        if (ogVar instanceof yi0) {
            yi0Var = (yi0) ogVar;
            int i2 = yi0Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yi0Var.h = i2 - Integer.MIN_VALUE;
                Object obj = yi0Var.g;
                i = yi0Var.h;
                if (i != 0) {
                    t30.z(obj);
                    se0Var = new se0();
                    g gVar = new g(mj0Var, j, se0Var, null, 1);
                    yi0Var.e = mj0Var;
                    yi0Var.f = se0Var;
                    yi0Var.h = 1;
                    Object g = mj0Var.g(v40.e, gVar, yi0Var);
                    dh dhVar = dh.e;
                    if (g == dhVar) {
                        return dhVar;
                    }
                    mj0Var2 = mj0Var;
                } else {
                    if (i != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    se0 se0Var2 = yi0Var.f;
                    mj0 mj0Var3 = yi0Var.e;
                    t30.z(obj);
                    se0Var = se0Var2;
                    mj0Var2 = mj0Var3;
                }
                return new s60(mj0Var2.i(se0Var.e));
            }
        }
        yi0Var = new yi0(ogVar);
        Object obj2 = yi0Var.g;
        i = yi0Var.h;
        if (i != 0) {
        }
        return new s60(mj0Var2.i(se0Var.e));
    }
}
