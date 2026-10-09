package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class af0 {
    public final int a;
    public final ge b;
    public float c;

    public af0(int i, ge geVar) {
        this.a = i;
        this.b = geVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(float f, og ogVar) {
        ze0 ze0Var;
        int i;
        if (ogVar instanceof ze0) {
            ze0Var = (ze0) ogVar;
            int i2 = ze0Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ze0Var.g = i2 - Integer.MIN_VALUE;
                Object obj = ze0Var.e;
                i = ze0Var.g;
                if (i != 0) {
                    t30.z(obj);
                    Float f2 = new Float(f);
                    ze0Var.g = 1;
                    obj = this.b.invoke(f2, ze0Var);
                    dh dhVar = dh.e;
                    if (obj == dhVar) {
                        return dhVar;
                    }
                } else {
                    if (i != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t30.z(obj);
                }
                this.c += ((Number) obj).floatValue();
                return fs0.a;
            }
        }
        ze0Var = new ze0(this, ogVar);
        Object obj2 = ze0Var.e;
        i = ze0Var.g;
        if (i != 0) {
        }
        this.c += ((Number) obj2).floatValue();
        return fs0.a;
    }
}
