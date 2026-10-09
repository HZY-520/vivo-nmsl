package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class gm0 {
    public final pq a;
    public Object b;
    public g40 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final k40 e = u10.i();
    public final k40 f = new k40();
    public final l40 g = new l40();
    public final t40 h = new t40(new aj[16]);
    public final fr i = new fr(1, this);
    public final k40 l = u10.i();
    public final HashMap m = new HashMap();

    public gm0(pq pqVar) {
        this.a = pqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (((defpackage.hn0) r14).e(2) == false) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Set set) {
        char c;
        long j;
        boolean z;
        Iterator it;
        gm0 gm0Var;
        int i;
        gm0 gm0Var2;
        boolean z2;
        boolean z3;
        Object[] objArr;
        Iterator it2;
        int i2;
        Object[] objArr2;
        long j2;
        boolean z4;
        int i3;
        int i4;
        int i5;
        Object[] objArr3;
        int i6;
        int i7;
        g40 g40Var;
        long[] jArr;
        Object[] objArr4;
        int i8;
        long[] jArr2;
        Object[] objArr5;
        int i9;
        int i10;
        long j3;
        int i11;
        int i12;
        Object obj;
        Object[] objArr6;
        int i13;
        long j4;
        Object[] objArr7;
        int i14;
        int i15;
        Object obj2;
        Object[] objArr8;
        Object[] objArr9;
        gm0 gm0Var3 = this;
        boolean z5 = set instanceof ii0;
        t40 t40Var = gm0Var3.h;
        k40 k40Var = gm0Var3.l;
        HashMap hashMap = gm0Var3.m;
        k40 k40Var2 = gm0Var3.e;
        l40 l40Var = gm0Var3.g;
        if (z5) {
            l40 l40Var2 = ((ii0) set).e;
            Object[] objArr10 = l40Var2.b;
            long[] jArr3 = l40Var2.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i16 = 0;
                c = 7;
                z = false;
                j = -9187201950435737472L;
                while (true) {
                    long j5 = jArr3[i16];
                    int i17 = 8;
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i18 = 8 - ((~(i16 - length)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j5 & 255) < 128) {
                                Object obj3 = objArr10[(i16 << 3) + i19];
                                if (obj3 instanceof hn0) {
                                    jArr2 = jArr3;
                                } else {
                                    jArr2 = jArr3;
                                }
                                if (gm0Var3.j || !k40Var.c(obj3)) {
                                    objArr5 = objArr10;
                                    i9 = length;
                                    i10 = i16;
                                    j3 = j5;
                                    i11 = i18;
                                    i12 = i19;
                                    obj = obj3;
                                } else {
                                    gm0Var3.j = true;
                                    try {
                                        Object g = k40Var.g(obj3);
                                        if (g == null) {
                                            objArr5 = objArr10;
                                        } else if (g instanceof l40) {
                                            l40 l40Var3 = (l40) g;
                                            Object[] objArr11 = l40Var3.b;
                                            long[] jArr4 = l40Var3.a;
                                            objArr5 = objArr10;
                                            int length2 = jArr4.length - 2;
                                            if (length2 >= 0) {
                                                j3 = j5;
                                                int i20 = 0;
                                                Object[] objArr12 = objArr11;
                                                while (true) {
                                                    long j6 = jArr4[i20];
                                                    i9 = length;
                                                    i10 = i16;
                                                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                                        int i22 = 0;
                                                        while (i22 < i21) {
                                                            if ((j6 & 255) < 128) {
                                                                i13 = i22;
                                                                aj ajVar = (aj) objArr12[(i20 << 3) + i22];
                                                                ajVar.getClass();
                                                                j4 = j6;
                                                                if (lw.i(ajVar.h().f, hashMap.get(ajVar))) {
                                                                    objArr7 = objArr12;
                                                                    i14 = i18;
                                                                    i15 = i19;
                                                                    obj2 = obj3;
                                                                    t40Var.b(ajVar);
                                                                } else {
                                                                    Object g2 = k40Var2.g(ajVar);
                                                                    if (g2 != null) {
                                                                        if (g2 instanceof l40) {
                                                                            l40 l40Var4 = (l40) g2;
                                                                            Object[] objArr13 = l40Var4.b;
                                                                            long[] jArr5 = l40Var4.a;
                                                                            int length3 = jArr5.length - 2;
                                                                            if (length3 >= 0) {
                                                                                objArr7 = objArr12;
                                                                                i14 = i18;
                                                                                int i23 = 0;
                                                                                while (true) {
                                                                                    long j7 = jArr5[i23];
                                                                                    i15 = i19;
                                                                                    obj2 = obj3;
                                                                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                        int i24 = 8 - ((~(i23 - length3)) >>> 31);
                                                                                        int i25 = 0;
                                                                                        while (i25 < i24) {
                                                                                            if ((j7 & 255) < 128) {
                                                                                                objArr9 = objArr13;
                                                                                                l40Var.a(objArr9[(i23 << 3) + i25]);
                                                                                                z = true;
                                                                                            } else {
                                                                                                objArr9 = objArr13;
                                                                                            }
                                                                                            j7 >>= i17;
                                                                                            i25++;
                                                                                            objArr13 = objArr9;
                                                                                        }
                                                                                        objArr8 = objArr13;
                                                                                        if (i24 != i17) {
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        objArr8 = objArr13;
                                                                                    }
                                                                                    if (i23 == length3) {
                                                                                        break;
                                                                                    }
                                                                                    i23++;
                                                                                    i19 = i15;
                                                                                    obj3 = obj2;
                                                                                    objArr13 = objArr8;
                                                                                    i17 = 8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            objArr7 = objArr12;
                                                                            i14 = i18;
                                                                            i15 = i19;
                                                                            obj2 = obj3;
                                                                            l40Var.a(g2);
                                                                            z = true;
                                                                        }
                                                                    }
                                                                }
                                                                i22 = i13 + 1;
                                                                i17 = 8;
                                                                j6 = j4 >> 8;
                                                                i18 = i14;
                                                                objArr12 = objArr7;
                                                                i19 = i15;
                                                                obj3 = obj2;
                                                            } else {
                                                                i13 = i22;
                                                                j4 = j6;
                                                            }
                                                            objArr7 = objArr12;
                                                            i14 = i18;
                                                            i15 = i19;
                                                            obj2 = obj3;
                                                            i22 = i13 + 1;
                                                            i17 = 8;
                                                            j6 = j4 >> 8;
                                                            i18 = i14;
                                                            objArr12 = objArr7;
                                                            i19 = i15;
                                                            obj3 = obj2;
                                                        }
                                                        objArr6 = objArr12;
                                                        i11 = i18;
                                                        i12 = i19;
                                                        obj = obj3;
                                                        if (i21 != i17) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr6 = objArr12;
                                                        i11 = i18;
                                                        i12 = i19;
                                                        obj = obj3;
                                                    }
                                                    if (i20 == length2) {
                                                        break;
                                                    }
                                                    i20++;
                                                    length = i9;
                                                    i16 = i10;
                                                    i18 = i11;
                                                    objArr12 = objArr6;
                                                    i19 = i12;
                                                    obj3 = obj;
                                                    i17 = 8;
                                                }
                                            }
                                        } else {
                                            objArr5 = objArr10;
                                            i9 = length;
                                            i10 = i16;
                                            j3 = j5;
                                            i11 = i18;
                                            i12 = i19;
                                            obj = obj3;
                                            aj ajVar2 = (aj) g;
                                            if (lw.i(ajVar2.h().f, hashMap.get(ajVar2))) {
                                                t40Var.b(ajVar2);
                                            } else {
                                                Object g3 = k40Var2.g(ajVar2);
                                                if (g3 != null) {
                                                    if (g3 instanceof l40) {
                                                        l40 l40Var5 = (l40) g3;
                                                        Object[] objArr14 = l40Var5.b;
                                                        long[] jArr6 = l40Var5.a;
                                                        int length4 = jArr6.length - 2;
                                                        if (length4 >= 0) {
                                                            int i26 = 0;
                                                            while (true) {
                                                                long j8 = jArr6[i26];
                                                                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i27 = 8 - ((~(i26 - length4)) >>> 31);
                                                                    for (int i28 = 0; i28 < i27; i28++) {
                                                                        if ((j8 & 255) < 128) {
                                                                            l40Var.a(objArr14[(i26 << 3) + i28]);
                                                                            z = true;
                                                                        }
                                                                        j8 >>= 8;
                                                                    }
                                                                    if (i27 != 8) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i26 == length4) {
                                                                    break;
                                                                }
                                                                i26++;
                                                            }
                                                        }
                                                    } else {
                                                        l40Var.a(g3);
                                                        z = true;
                                                    }
                                                }
                                            }
                                        }
                                        i9 = length;
                                        i10 = i16;
                                        j3 = j5;
                                        i11 = i18;
                                        i12 = i19;
                                        obj = obj3;
                                    } finally {
                                        gm0Var3.j = false;
                                    }
                                }
                                Object g4 = k40Var2.g(obj);
                                if (g4 != null) {
                                    if (g4 instanceof l40) {
                                        l40 l40Var6 = (l40) g4;
                                        Object[] objArr15 = l40Var6.b;
                                        long[] jArr7 = l40Var6.a;
                                        int length5 = jArr7.length - 2;
                                        if (length5 >= 0) {
                                            int i29 = 0;
                                            while (true) {
                                                long j9 = jArr7[i29];
                                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i30 = 8 - ((~(i29 - length5)) >>> 31);
                                                    long j10 = j9;
                                                    for (int i31 = 0; i31 < i30; i31++) {
                                                        if ((j10 & 255) < 128) {
                                                            l40Var.a(objArr15[(i29 << 3) + i31]);
                                                            z = true;
                                                        }
                                                        j10 >>= 8;
                                                    }
                                                    if (i30 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i29 == length5) {
                                                    break;
                                                }
                                                i29++;
                                            }
                                        }
                                    } else {
                                        l40Var.a(g4);
                                        z = true;
                                    }
                                }
                                j5 = j3 >> 8;
                                i19 = i12 + 1;
                                jArr3 = jArr2;
                                i17 = 8;
                                objArr10 = objArr5;
                                length = i9;
                                i16 = i10;
                                i18 = i11;
                            } else {
                                jArr2 = jArr3;
                            }
                            objArr5 = objArr10;
                            i9 = length;
                            i10 = i16;
                            j3 = j5;
                            i11 = i18;
                            i12 = i19;
                            j5 = j3 >> 8;
                            i19 = i12 + 1;
                            jArr3 = jArr2;
                            i17 = 8;
                            objArr10 = objArr5;
                            length = i9;
                            i16 = i10;
                            i18 = i11;
                        }
                        jArr = jArr3;
                        objArr4 = objArr10;
                        int i32 = length;
                        int i33 = i16;
                        if (i18 != i17) {
                            break;
                        }
                        length = i32;
                        i8 = i33;
                    } else {
                        jArr = jArr3;
                        objArr4 = objArr10;
                        i8 = i16;
                    }
                    if (i8 == length) {
                        break;
                    }
                    i16 = i8 + 1;
                    jArr3 = jArr;
                    objArr10 = objArr4;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                z = false;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            Iterator it3 = set.iterator();
            boolean z6 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof hn0) || ((hn0) next).e(2)) {
                    if (gm0Var3.j || !k40Var.c(next)) {
                        it = it3;
                        gm0Var = gm0Var3;
                        i = 0;
                    } else {
                        gm0Var3.j = true;
                        try {
                            Object g5 = k40Var.g(next);
                            if (g5 != null) {
                                try {
                                    if (g5 instanceof l40) {
                                        l40 l40Var7 = (l40) g5;
                                        Object[] objArr16 = l40Var7.b;
                                        long[] jArr8 = l40Var7.a;
                                        int length6 = jArr8.length - 2;
                                        if (length6 >= 0) {
                                            boolean z7 = z6;
                                            int i34 = 0;
                                            while (true) {
                                                long j11 = jArr8[i34];
                                                long[] jArr9 = jArr8;
                                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i35 = 8 - ((~(i34 - length6)) >>> 31);
                                                    int i36 = 0;
                                                    while (i36 < i35) {
                                                        if ((j11 & 255) < 128) {
                                                            it2 = it3;
                                                            aj ajVar3 = (aj) objArr16[(i34 << 3) + i36];
                                                            ajVar3.getClass();
                                                            i2 = i36;
                                                            objArr2 = objArr16;
                                                            if (lw.i(ajVar3.h().f, hashMap.get(ajVar3))) {
                                                                j2 = j11;
                                                                t40Var.b(ajVar3);
                                                            } else {
                                                                Object g6 = k40Var2.g(ajVar3);
                                                                if (g6 != null) {
                                                                    if (g6 instanceof l40) {
                                                                        l40 l40Var8 = (l40) g6;
                                                                        Object[] objArr17 = l40Var8.b;
                                                                        long[] jArr10 = l40Var8.a;
                                                                        int length7 = jArr10.length - 2;
                                                                        if (length7 >= 0) {
                                                                            boolean z8 = z7;
                                                                            j2 = j11;
                                                                            int i37 = 0;
                                                                            while (true) {
                                                                                long j12 = jArr10[i37];
                                                                                long[] jArr11 = jArr10;
                                                                                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                    int i38 = 8 - ((~(i37 - length7)) >>> 31);
                                                                                    for (int i39 = 0; i39 < i38; i39 = i3 + 1) {
                                                                                        if ((j12 & 255) < 128) {
                                                                                            i3 = i39;
                                                                                            l40Var.a(objArr17[(i37 << 3) + i39]);
                                                                                            z8 = true;
                                                                                        } else {
                                                                                            i3 = i39;
                                                                                        }
                                                                                        j12 >>= 8;
                                                                                    }
                                                                                    if (i38 != 8) {
                                                                                        z4 = z8;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (i37 == length7) {
                                                                                    z7 = z8;
                                                                                    break;
                                                                                }
                                                                                i37++;
                                                                                jArr10 = jArr11;
                                                                            }
                                                                            z4 = z7;
                                                                        }
                                                                    } else {
                                                                        j2 = j11;
                                                                        l40Var.a(g6);
                                                                        z4 = true;
                                                                    }
                                                                    z7 = z4;
                                                                }
                                                                j2 = j11;
                                                                z4 = z7;
                                                                z7 = z4;
                                                            }
                                                        } else {
                                                            it2 = it3;
                                                            i2 = i36;
                                                            objArr2 = objArr16;
                                                            j2 = j11;
                                                        }
                                                        j11 = j2 >> 8;
                                                        i36 = i2 + 1;
                                                        objArr16 = objArr2;
                                                        it3 = it2;
                                                    }
                                                    it = it3;
                                                    objArr = objArr16;
                                                    if (i35 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    it = it3;
                                                    objArr = objArr16;
                                                }
                                                if (i34 == length6) {
                                                    break;
                                                }
                                                i34++;
                                                it3 = it;
                                                jArr8 = jArr9;
                                                objArr16 = objArr;
                                            }
                                            z6 = z7;
                                        }
                                    } else {
                                        it = it3;
                                        aj ajVar4 = (aj) g5;
                                        if (lw.i(ajVar4.h().f, hashMap.get(ajVar4))) {
                                            t40Var.b(ajVar4);
                                        } else {
                                            Object g7 = k40Var2.g(ajVar4);
                                            if (g7 != null) {
                                                if (g7 instanceof l40) {
                                                    l40 l40Var9 = (l40) g7;
                                                    Object[] objArr18 = l40Var9.b;
                                                    long[] jArr12 = l40Var9.a;
                                                    int length8 = jArr12.length - 2;
                                                    if (length8 >= 0) {
                                                        boolean z9 = z6;
                                                        int i40 = 0;
                                                        while (true) {
                                                            long j13 = jArr12[i40];
                                                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i41 = 8 - ((~(i40 - length8)) >>> 31);
                                                                long j14 = j13;
                                                                for (int i42 = 0; i42 < i41; i42++) {
                                                                    if ((j14 & 255) < 128) {
                                                                        l40Var.a(objArr18[(i40 << 3) + i42]);
                                                                        z9 = true;
                                                                    }
                                                                    j14 >>= 8;
                                                                }
                                                                if (i41 != 8) {
                                                                    z3 = z9;
                                                                    break;
                                                                }
                                                            }
                                                            if (i40 == length8) {
                                                                z6 = z9;
                                                                break;
                                                            }
                                                            i40++;
                                                        }
                                                    }
                                                } else {
                                                    l40Var.a(g7);
                                                    z3 = true;
                                                }
                                                z6 = z3;
                                            }
                                            z3 = z6;
                                            z6 = z3;
                                        }
                                    }
                                    i = 0;
                                    gm0Var = this;
                                    gm0Var.j = false;
                                } catch (Throwable th) {
                                    th = th;
                                    z2 = false;
                                    gm0Var2 = this;
                                    gm0Var2.j = z2;
                                    throw th;
                                }
                            }
                            it = it3;
                            i = 0;
                            gm0Var = this;
                            gm0Var.j = false;
                        } catch (Throwable th2) {
                            th = th2;
                            gm0Var2 = gm0Var3;
                            z2 = false;
                        }
                    }
                    boolean z10 = z6;
                    Object g8 = k40Var2.g(next);
                    if (g8 != null) {
                        if (g8 instanceof l40) {
                            l40 l40Var10 = (l40) g8;
                            Object[] objArr19 = l40Var10.b;
                            long[] jArr13 = l40Var10.a;
                            int length9 = jArr13.length - 2;
                            if (length9 >= 0) {
                                int i43 = i;
                                while (true) {
                                    long j15 = jArr13[i43];
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i44 = 8 - ((~(i43 - length9)) >>> 31);
                                        long j16 = j15;
                                        for (int i45 = i; i45 < i44; i45++) {
                                            if ((j16 & 255) < 128) {
                                                l40Var.a(objArr19[(i43 << 3) + i45]);
                                                z10 = true;
                                            }
                                            j16 >>= 8;
                                        }
                                        if (i44 != 8) {
                                            break;
                                        }
                                    }
                                    if (i43 == length9) {
                                        break;
                                    }
                                    i43++;
                                }
                            }
                        } else {
                            l40Var.a(g8);
                            z10 = true;
                        }
                    }
                    z6 = z10;
                } else {
                    it = it3;
                    gm0Var = gm0Var3;
                }
                it3 = it;
                gm0Var3 = gm0Var;
            }
            z = z6;
        }
        gm0 gm0Var4 = gm0Var3;
        int i46 = 0;
        if (!gm0Var4.j && (i4 = t40Var.g) != 0) {
            Object[] objArr20 = t40Var.e;
            int i47 = 0;
            while (i47 < i4) {
                aj ajVar5 = (aj) objArr20[i47];
                int hashCode = Long.hashCode(xl0.h().g());
                Object g9 = k40Var2.g(ajVar5);
                if (g9 != null) {
                    boolean z11 = g9 instanceof l40;
                    k40 k40Var3 = gm0Var4.f;
                    if (z11) {
                        l40 l40Var11 = (l40) g9;
                        Object[] objArr21 = l40Var11.b;
                        long[] jArr14 = l40Var11.a;
                        int length10 = jArr14.length - 2;
                        if (length10 >= 0) {
                            int i48 = i46;
                            while (true) {
                                long j17 = jArr14[i48];
                                objArr3 = objArr20;
                                if ((((~j17) << c) & j17 & j) != j) {
                                    int i49 = 8 - ((~(i48 - length10)) >>> 31);
                                    int i50 = 0;
                                    while (i50 < i49) {
                                        if ((j17 & 255) < 128) {
                                            i6 = i4;
                                            Object obj4 = objArr21[(i48 << 3) + i50];
                                            g40 g40Var2 = (g40) k40Var3.g(obj4);
                                            i7 = i50;
                                            if (g40Var2 == null) {
                                                g40Var = new g40();
                                                k40Var3.l(obj4, g40Var);
                                            } else {
                                                g40Var = g40Var2;
                                            }
                                            gm0Var4.b(ajVar5, hashCode, obj4, g40Var);
                                        } else {
                                            i6 = i4;
                                            i7 = i50;
                                        }
                                        j17 >>= 8;
                                        i50 = i7 + 1;
                                        i4 = i6;
                                    }
                                    i5 = i4;
                                    if (i49 != 8) {
                                        break;
                                    }
                                } else {
                                    i5 = i4;
                                }
                                if (i48 != length10) {
                                    i48++;
                                    objArr20 = objArr3;
                                    i4 = i5;
                                }
                            }
                        } else {
                            i5 = i4;
                            objArr3 = objArr20;
                        }
                    } else {
                        i5 = i4;
                        objArr3 = objArr20;
                        g40 g40Var3 = (g40) k40Var3.g(g9);
                        if (g40Var3 == null) {
                            g40Var3 = new g40();
                            k40Var3.l(g9, g40Var3);
                        }
                        gm0Var4.b(ajVar5, hashCode, g9, g40Var3);
                    }
                } else {
                    i5 = i4;
                    objArr3 = objArr20;
                }
                i47++;
                objArr20 = objArr3;
                i4 = i5;
                i46 = 0;
            }
            t40Var.g();
        }
        return z;
    }

    public final void b(Object obj, int i, Object obj2, g40 g40Var) {
        int i2;
        if (this.k > 0) {
            return;
        }
        int b = g40Var.b(obj);
        if (b < 0) {
            b = ~b;
            i2 = -1;
        } else {
            i2 = g40Var.c[b];
        }
        g40Var.b[b] = obj;
        g40Var.c[b] = i;
        if ((obj instanceof aj) && i2 != i) {
            zi h = ((aj) obj).h();
            this.m.put(obj, h.f);
            g40 g40Var2 = h.e;
            k40 k40Var = this.l;
            u10.D(k40Var, obj);
            Object[] objArr = g40Var2.b;
            long[] jArr = g40Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                gn0 gn0Var = (gn0) objArr[(i3 << 3) + i5];
                                if (gn0Var instanceof hn0) {
                                    ((hn0) gn0Var).f(2);
                                }
                                u10.a(k40Var, gn0Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof hn0) {
                ((hn0) obj).f(2);
            }
            u10.a(this.e, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(a60 a60Var) {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        Object obj;
        long j3;
        Object obj2;
        k40 k40Var = this.f;
        long[] jArr3 = k40Var.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j4 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj3 = k40Var.b[i6];
                        j2 = j5;
                        g40 g40Var = (g40) k40Var.c[i6];
                        Boolean bool = (Boolean) a60Var.invoke(obj3);
                        if (bool.booleanValue()) {
                            Object[] objArr = g40Var.b;
                            int[] iArr = g40Var.c;
                            long[] jArr4 = g40Var.a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        int i10 = 0;
                                        while (i10 < i9) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                Object obj4 = objArr[i11];
                                                int i12 = iArr[i11];
                                                k40 k40Var2 = this.e;
                                                u10.C(k40Var2, obj4, obj3);
                                                obj2 = obj3;
                                                if ((obj4 instanceof aj) && !k40Var2.c(obj4)) {
                                                    u10.D(this.l, obj4);
                                                    this.m.remove(obj4);
                                                }
                                            } else {
                                                j3 = j6;
                                                obj2 = obj3;
                                            }
                                            j6 = j3 >> i7;
                                            i10++;
                                            obj3 = obj2;
                                        }
                                        obj = obj3;
                                        if (i9 != i7) {
                                            break;
                                        }
                                    } else {
                                        obj = obj3;
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    jArr4 = jArr5;
                                    obj3 = obj;
                                    i7 = 8;
                                }
                                if (bool.booleanValue()) {
                                    k40Var.k(i6);
                                }
                                i = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j = j4;
                        if (bool.booleanValue()) {
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j4 = j >> i;
                    c2 = c;
                    j5 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
