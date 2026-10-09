package defpackage;

import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class xq0 extends k60 {
    public final o9 f;
    public wm0 g;

    public xq0(mj0 mj0Var, ae aeVar, si siVar) {
        super(mj0Var, aeVar, siVar);
        this.f = lw.a(Integer.MAX_VALUE, 6, null);
    }

    public static vq0 e(o9 o9Var) {
        vq0 vq0Var = null;
        mk0 g = j20.g(new bq(new i30(o9Var, 1), null));
        while (g.hasNext()) {
            vq0 vq0Var2 = (vq0) g.next();
            if (vq0Var != null) {
                vq0Var2 = vq0Var.a(vq0Var2);
            }
            vq0Var = vq0Var2;
        }
        return vq0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00da, code lost:
    
        if (r16.b.invoke(r0, r6) != r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00dc, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        if (b(r0, r6) == r10) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(mj0 mj0Var, vq0 vq0Var, og ogVar) {
        wq0 wq0Var;
        int i;
        if (ogVar instanceof wq0) {
            wq0Var = (wq0) ogVar;
            int i2 = wq0Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wq0Var.g = i2 - Integer.MIN_VALUE;
                wq0 wq0Var2 = wq0Var;
                Object obj = wq0Var2.e;
                i = wq0Var2.g;
                p2 p2Var = this.e;
                Object obj2 = dh.e;
                if (i != 0) {
                    t30.z(obj);
                    ve0 ve0Var = new ve0();
                    ve0Var.e = vq0Var;
                    long j = vq0Var.b;
                    long j2 = vq0Var.a;
                    ((ht0) p2Var.f).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
                    ((ht0) p2Var.g).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
                    vq0 e = e(this.f);
                    if (e != null) {
                        long j3 = e.b;
                        long j4 = e.a;
                        ((ht0) p2Var.f).a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
                        ((ht0) p2Var.g).a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
                        ve0Var.e = ((vq0) ve0Var.e).a(e);
                    }
                    tq ie0Var = new ie0(this, mj0Var, ve0Var, null, 1);
                    wq0Var2.g = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            t30.z(obj);
                            return fs0.a;
                        }
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t30.z(obj);
                }
                ft0 ft0Var = new ft0(m20.a(((ht0) p2Var.f).b(Float.MAX_VALUE), ((ht0) p2Var.g).b(Float.MAX_VALUE)));
                wq0Var2.g = 2;
            }
        }
        wq0Var = new wq0(this, ogVar);
        wq0 wq0Var22 = wq0Var;
        Object obj3 = wq0Var22.e;
        i = wq0Var22.g;
        p2 p2Var2 = this.e;
        Object obj22 = dh.e;
        if (i != 0) {
        }
        ft0 ft0Var2 = new ft0(m20.a(((ht0) p2Var2.f).b(Float.MAX_VALUE), ((ht0) p2Var2.g).b(Float.MAX_VALUE)));
        wq0Var22.g = 2;
    }

    public final boolean d(rc0 rc0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        o9 o9Var;
        mj0 mj0Var;
        vc0 vc0Var = (vc0) ac.a0(rc0Var.a);
        if (vc0Var != null) {
            List b = vc0Var.b();
            int size = b.size();
            int i = 0;
            z3 = false;
            while (true) {
                o9Var = this.f;
                mj0Var = this.a;
                if (i >= size) {
                    break;
                }
                xs xsVar = (xs) b.get(i);
                long j = xsVar.d ^ (-9223372034707292160L);
                if (!(mj0Var.j(mj0Var.f(j)) == 0.0f)) {
                    z3 = !(o9Var.p(new vq0(j, xsVar.a, false)) instanceof bb) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = vc0Var.l ^ (-9223372034707292160L);
            boolean z4 = rc0Var.c == 12;
            if (!(mj0Var.j(mj0Var.f(j2)) == 0.0f) || z4) {
                if (!(o9Var.p(new vq0(j2, vc0Var.b, z4)) instanceof bb) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
