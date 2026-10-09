package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class fd {
    public final Object a;
    public final fa b;
    public final uq c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ fd(Object obj, fa faVar, uq uqVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : faVar, (i & 4) != 0 ? null : uqVar, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static fd a(fd fdVar, fa faVar, Throwable th, int i) {
        Object obj = fdVar.a;
        if ((i & 2) != 0) {
            faVar = fdVar.b;
        }
        fa faVar2 = faVar;
        uq uqVar = fdVar.c;
        Object obj2 = fdVar.d;
        if ((i & 16) != 0) {
            th = fdVar.e;
        }
        return new fd(obj, faVar2, uqVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd)) {
            return false;
        }
        fd fdVar = (fd) obj;
        return lw.i(this.a, fdVar.a) && lw.i(this.b, fdVar.b) && lw.i(this.c, fdVar.c) && lw.i(this.d, fdVar.d) && lw.i(this.e, fdVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        fa faVar = this.b;
        int hashCode2 = (hashCode + (faVar == null ? 0 : faVar.hashCode())) * 31;
        uq uqVar = this.c;
        int hashCode3 = (hashCode2 + (uqVar == null ? 0 : uqVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public fd(Object obj, fa faVar, uq uqVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = faVar;
        this.c = uqVar;
        this.d = obj2;
        this.e = th;
    }
}
