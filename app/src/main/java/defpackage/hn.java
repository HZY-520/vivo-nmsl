package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class hn implements Runnable, Comparable, tj {
    private volatile Object _heap;
    public long e;
    public int f = -1;

    public hn(long j) {
        this.e = j;
    }

    public final int a(long j, in inVar, jn jnVar) {
        synchronized (this) {
            if (this._heap == t10.c) {
                return 2;
            }
            synchronized (inVar) {
                try {
                    hn[] hnVarArr = inVar.a;
                    hn hnVar = hnVarArr != null ? hnVarArr[0] : null;
                    int i = jn.n;
                    if (p7.a.getIntVolatile(jnVar, jn.l) != 0) {
                        return 1;
                    }
                    if (hnVar == null) {
                        inVar.c = j;
                    } else {
                        long j2 = hnVar.e;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = inVar.c;
                        if (j - j3 > 0) {
                            inVar.c = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.e - j < 0) {
                        this.e = j;
                    }
                    inVar.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.tj
    public final void b() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                mm mmVar = t10.c;
                if (obj == mmVar) {
                    return;
                }
                in inVar = obj instanceof in ? (in) obj : null;
                if (inVar != null) {
                    synchronized (inVar) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof iq0 ? (iq0) obj2 : null) != null) {
                            inVar.c(this.f);
                        }
                    }
                }
                this._heap = mmVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.e - ((hn) obj).e;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(in inVar) {
        if (this._heap != t10.c) {
            this._heap = inVar;
        } else {
            z6.l("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.e + ']';
    }
}
