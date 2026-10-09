package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class vd0 {
    public final ry a;

    public vd0(eq eqVar) {
        this.a = new ry(eqVar);
    }

    public abstract xd0 a(Object obj);

    public rs0 b() {
        return this.a;
    }

    public final xd0 c(pq pqVar) {
        return new xd0(this, null, false, null, pqVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        if (r2 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0034, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003e, code lost:
    
        if (r5 == r2) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rs0 d(xd0 xd0Var, rs0 rs0Var) {
        ml mlVar;
        pq pqVar = xd0Var.d;
        Object obj = xd0Var.f;
        boolean z = xd0Var.e;
        ml mlVar2 = null;
        if (rs0Var instanceof ml) {
            if (z) {
                mlVar2 = (ml) rs0Var;
                mlVar2.a.setValue(xd0Var.a());
            }
        } else if (rs0Var instanceof jn0) {
            if ((xd0Var.b || obj != null) && !z) {
                jn0 jn0Var = (jn0) rs0Var;
                boolean i = lw.i(xd0Var.a(), jn0Var.a);
                mlVar = jn0Var;
            }
        } else if (rs0Var instanceof mf) {
            mf mfVar = (mf) rs0Var;
            pq pqVar2 = mfVar.a;
            mlVar = mfVar;
        }
        if (mlVar2 != null) {
            return mlVar2;
        }
        if (!z) {
            return pqVar != null ? new mf(pqVar) : new jn0(xd0Var.a());
        }
        b2 b2Var = xd0Var.c;
        if (b2Var == null) {
            b2Var = b2.W;
        }
        return new ml(new w90(obj, b2Var));
    }
}
