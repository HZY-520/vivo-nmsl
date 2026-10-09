package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class qj0 implements bk0, Iterable, fx {
    public final k40 e;
    public q10 f;
    public boolean g;
    public boolean h;

    public qj0() {
        long[] jArr = gi0.a;
        this.e = new k40();
    }

    @Override // defpackage.bk0
    public final void a(ak0 ak0Var, Object obj) {
        boolean z = obj instanceof p0;
        k40 k40Var = this.e;
        if (z && k40Var.c(ak0Var)) {
            Object g = k40Var.g(ak0Var);
            g.getClass();
            p0 p0Var = (p0) g;
            p0 p0Var2 = (p0) obj;
            String str = p0Var2.a;
            if (str == null) {
                str = p0Var.a;
            }
            br brVar = p0Var2.b;
            if (brVar == null) {
                brVar = p0Var.b;
            }
            k40Var.l(ak0Var, new p0(str, brVar));
        } else {
            k40Var.l(ak0Var, obj);
        }
        ak0Var.getClass();
    }

    public final qj0 b() {
        qj0 qj0Var = new qj0();
        qj0Var.g = this.g;
        qj0Var.h = this.h;
        k40 k40Var = this.e;
        Object[] objArr = k40Var.b;
        Object[] objArr2 = k40Var.c;
        long[] jArr = k40Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            qj0Var.e.l(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return qj0Var;
    }

    public final Object c(ak0 ak0Var) {
        Object g = this.e.g(ak0Var);
        if (g != null) {
            return g;
        }
        throw new IllegalStateException("Key not present: " + ak0Var + " - consider getOrElse or getOrNull");
    }

    public final void d(qj0 qj0Var) {
        k40 k40Var = qj0Var.e;
        Object[] objArr = k40Var.b;
        Object[] objArr2 = k40Var.c;
        long[] jArr = k40Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        ak0 ak0Var = (ak0) obj;
                        k40 k40Var2 = this.e;
                        Object g = k40Var2.g(ak0Var);
                        ak0Var.getClass();
                        Object invoke = ak0Var.b.invoke(g, obj2);
                        if (invoke != null) {
                            k40Var2.l(ak0Var, invoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj0)) {
            return false;
        }
        qj0 qj0Var = (qj0) obj;
        return this.e.equals(qj0Var.e) && this.g == qj0Var.g && this.h == qj0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + j2.e(this.g, this.e.hashCode() * 31, 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        q10 q10Var = this.f;
        if (q10Var == null) {
            q10Var = new q10(this.e);
            this.f = q10Var;
        }
        return ((bn) q10Var.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.g) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.h) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        k40 k40Var = this.e;
        Object[] objArr = k40Var.b;
        Object[] objArr2 = k40Var.c;
        long[] jArr = k40Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((ak0) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return nh.f0(this) + "{ " + ((Object) sb) + " }";
    }
}
