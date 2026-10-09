package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class vl0 implements Iterable, fx {
    public static final vl0 i = new vl0(0, 0, 0, null);
    public final long e;
    public final long f;
    public final long g;
    public final long[] h;

    public vl0(long j, long j2, long j3, long[] jArr) {
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = jArr;
    }

    public final vl0 a(vl0 vl0Var) {
        long[] jArr;
        vl0 vl0Var2 = this;
        vl0 vl0Var3 = i;
        if (vl0Var == vl0Var3) {
            return vl0Var2;
        }
        if (vl0Var2 == vl0Var3) {
            return vl0Var3;
        }
        long j = vl0Var.g;
        long j2 = vl0Var.g;
        long[] jArr2 = vl0Var.h;
        long j3 = vl0Var.f;
        long j4 = vl0Var.e;
        long j5 = vl0Var2.g;
        if (j == j5 && jArr2 == (jArr = vl0Var2.h)) {
            return new vl0(vl0Var2.e & (~j4), vl0Var2.f & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                vl0Var2 = vl0Var2.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j3) != 0) {
                    vl0Var2 = vl0Var2.b(i2 + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j4) != 0) {
                    vl0Var2 = vl0Var2.b(i3 + j2 + 64);
                }
            }
        }
        return vl0Var2;
    }

    public final vl0 b(long j) {
        long[] jArr;
        int f;
        long[] jArr2;
        long j2 = j - this.g;
        if (lw.n(j2, 0L) >= 0 && lw.n(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.f;
            if ((j4 & j3) != 0) {
                return new vl0(this.e, j4 & (~j3), this.g, this.h);
            }
        } else if (lw.n(j2, 64L) >= 0 && lw.n(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.e;
            if ((j6 & j5) != 0) {
                return new vl0(j6 & (~j5), this.f, this.g, this.h);
            }
        } else if (lw.n(j2, 0L) < 0 && (jArr = this.h) != null && (f = z20.f(jArr, j)) >= 0) {
            int length = jArr.length;
            int i2 = length - 1;
            if (i2 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i2];
                if (f > 0) {
                    o7.Q(jArr, jArr3, 0, 0, f);
                }
                if (f < i2) {
                    o7.Q(jArr, jArr3, f, f + 1, length);
                }
                jArr2 = jArr3;
            }
            return new vl0(this.e, this.f, this.g, jArr2);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.g;
        return (lw.n(j2, 0L) < 0 || lw.n(j2, 64L) >= 0) ? (lw.n(j2, 64L) < 0 || lw.n(j2, 128L) >= 0) ? lw.n(j2, 0L) <= 0 && (jArr = this.h) != null && z20.f(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.e) != 0 : ((1 << ((int) j2)) & this.f) != 0;
    }

    public final vl0 d(vl0 vl0Var) {
        vl0 vl0Var2;
        long[] jArr;
        vl0 vl0Var3 = this;
        vl0 vl0Var4 = i;
        if (vl0Var == vl0Var4) {
            return vl0Var3;
        }
        if (vl0Var3 == vl0Var4) {
            return vl0Var;
        }
        long j = vl0Var.g;
        long j2 = vl0Var.g;
        long[] jArr2 = vl0Var.h;
        long j3 = vl0Var.f;
        long j4 = vl0Var.e;
        long j5 = vl0Var3.g;
        long j6 = vl0Var3.f;
        long j7 = vl0Var3.e;
        if (j == j5 && jArr2 == (jArr = vl0Var3.h)) {
            return new vl0(j7 | j4, j6 | j3, j5, jArr);
        }
        int i2 = 0;
        long[] jArr3 = vl0Var3.h;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    vl0Var3 = vl0Var3.e(j8);
                }
            }
            if (j3 != 0) {
                for (int i3 = 0; i3 < 64; i3++) {
                    if (((1 << i3) & j3) != 0) {
                        vl0Var3 = vl0Var3.e(i3 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i2 < 64) {
                    if (((1 << i2) & j4) != 0) {
                        vl0Var3 = vl0Var3.e(i2 + j2 + 64);
                    }
                    i2++;
                }
            }
            return vl0Var3;
        }
        if (jArr3 != null) {
            vl0Var2 = vl0Var;
            for (long j9 : jArr3) {
                vl0Var2 = vl0Var2.e(j9);
            }
        } else {
            vl0Var2 = vl0Var;
        }
        long j10 = vl0Var3.g;
        if (j6 != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if (((1 << i4) & j6) != 0) {
                    vl0Var2 = vl0Var2.e(i4 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i2 < 64) {
                if (((1 << i2) & j7) != 0) {
                    vl0Var2 = vl0Var2.e(i2 + j10 + 64);
                }
                i2++;
            }
        }
        return vl0Var2;
    }

    public final vl0 e(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i2;
        long j4;
        long j5 = this.g;
        long j6 = j - j5;
        long j7 = 0;
        int n = lw.n(j6, 0L);
        long j8 = this.f;
        if (n < 0 || lw.n(j6, 64L) >= 0) {
            int n2 = lw.n(j6, 64L);
            long j9 = this.e;
            int i3 = 64;
            if (n2 < 0 || lw.n(j6, 128L) >= 0) {
                int n3 = lw.n(j6, 128L);
                long[] jArr3 = this.h;
                if (n3 < 0) {
                    if (jArr3 == null) {
                        return new vl0(this.e, this.f, this.g, new long[]{j});
                    }
                    int f = z20.f(jArr3, j);
                    if (f < 0) {
                        int i4 = -(f + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        o7.Q(jArr3, jArr4, 0, 0, i4);
                        o7.Q(jArr3, jArr4, i4 + 1, i4, length);
                        jArr4[i4] = j;
                        return new vl0(this.e, this.f, this.g, jArr4);
                    }
                } else if (!c(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (lw.n(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    t3 t3Var = null;
                    while (true) {
                        if (lw.n(j5, j10) >= 0) {
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (t3Var == null) {
                                t3Var = new t3(jArr3);
                            }
                            int i5 = 0;
                            i2 = i3;
                            while (i5 < i2) {
                                if ((j8 & (1 << i5)) != j7) {
                                    j4 = j7;
                                    ((c40) t3Var.f).a(i5 + j5);
                                } else {
                                    j4 = j7;
                                }
                                i5++;
                                j7 = j4;
                            }
                        } else {
                            i2 = i3;
                        }
                        long j12 = j7;
                        if (j11 == j12) {
                            j2 = j10;
                            j3 = j12;
                            break;
                        }
                        j5 += 64;
                        j7 = j12;
                        j8 = j11;
                        i3 = i2;
                        j11 = j7;
                    }
                    if (t3Var != null) {
                        c40 c40Var = (c40) t3Var.f;
                        int i6 = c40Var.b;
                        if (i6 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i6];
                            long[] jArr6 = c40Var.a;
                            for (int i7 = 0; i7 < i6; i7++) {
                                jArr5[i7] = jArr6[i7];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                            return new vl0(j11, j3, j2, jArr).e(j);
                        }
                    }
                    jArr = jArr3;
                    return new vl0(j11, j3, j2, jArr).e(j);
                }
            } else {
                long j13 = 1 << (((int) j6) - 64);
                if ((j9 & j13) == 0) {
                    return new vl0(j9 | j13, this.f, this.g, this.h);
                }
            }
        } else {
            long j14 = 1 << ((int) j6);
            if ((j8 & j14) == 0) {
                return new vl0(this.e, j8 | j14, this.g, this.h);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j20.g(new ul0(this, null));
    }

    public final String toString() {
        String obj = super.toString();
        ArrayList arrayList = new ArrayList(bc.V(this));
        Iterator it = iterator();
        while (true) {
            mk0 mk0Var = (mk0) it;
            if (!mk0Var.hasNext()) {
                break;
            }
            arrayList.add(String.valueOf(((Number) mk0Var.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj2 = arrayList.get(i3);
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj2 != null ? obj2 instanceof CharSequence : true) {
                sb.append((CharSequence) obj2);
            } else if (obj2 instanceof Character) {
                sb.append(((Character) obj2).charValue());
            } else {
                sb.append((CharSequence) obj2.toString());
            }
        }
        sb.append((CharSequence) "");
        return obj + " [" + sb.toString() + "]";
    }
}
