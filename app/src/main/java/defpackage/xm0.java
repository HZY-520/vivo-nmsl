package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class xm0 extends go0 implements uq {
    public int e;
    public /* synthetic */ bo f;
    public /* synthetic */ int g;
    public final /* synthetic */ ym0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm0(ym0 ym0Var, ng ngVar) {
        super(3, ngVar);
        this.h = ym0Var;
    }

    @Override // defpackage.uq
    public final Object c(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        xm0 xm0Var = new xm0(this.h, (ng) obj3);
        xm0Var.f = (bo) obj;
        xm0Var.g = intValue;
        return xm0Var.invokeSuspend(fs0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        if (r0.d(defpackage.dl0.g, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (defpackage.q3.p(Long.MAX_VALUE, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r0.d(defpackage.dl0.f, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r0.d(defpackage.dl0.e, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (defpackage.q3.p(0, r8) == r7) goto L32;
     */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        bo boVar;
        int i = this.e;
        dh dhVar = dh.e;
        if (i == 0) {
            t30.z(obj);
            boVar = this.f;
            if (this.g > 0) {
                this.e = 1;
            } else {
                this.f = boVar;
                this.e = 2;
            }
            return dhVar;
        }
        if (i != 1) {
            if (i == 2) {
                boVar = this.f;
                t30.z(obj);
                this.f = boVar;
                this.e = 3;
            } else if (i == 3) {
                boVar = this.f;
                t30.z(obj);
                this.f = boVar;
                this.e = 4;
            } else if (i == 4) {
                boVar = this.f;
                t30.z(obj);
                this.f = null;
                this.e = 5;
            } else if (i != 5) {
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        t30.z(obj);
        return fs0.a;
    }
}
