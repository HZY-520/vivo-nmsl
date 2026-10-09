package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class y50 {
    public final iy a;
    public final x50 b;
    public final iv c;
    public d60 d;
    public final ro0 e;
    public t20 f;
    public h40 g;
    public h40 h;
    public h40 i;
    public w50 j;

    public y50(iy iyVar) {
        this.a = iyVar;
        x50 x50Var = new x50();
        x50Var.h = -1;
        this.b = x50Var;
        iv ivVar = new iv(iyVar);
        this.c = ivVar;
        this.d = ivVar;
        ro0 ro0Var = ivVar.e0;
        this.e = ro0Var;
        this.f = ro0Var;
        this.g = new h40();
    }

    public static t20 a(s20 s20Var, t20 t20Var) {
        t20 t20Var2;
        if (s20Var instanceof y20) {
            t20Var2 = ((y20) s20Var).d();
            t20Var2.g = e60.e(t20Var2);
        } else {
            a8 a8Var = new a8();
            g40 g40Var = e60.a;
            int i = s20Var instanceof hl ? 5 : 1;
            if (s20Var instanceof w6) {
                i |= 8;
            }
            if (s20Var instanceof x8) {
                i |= 524288;
            }
            a8Var.g = i;
            a8Var.s = s20Var;
            new HashSet();
            t20Var2 = a8Var;
        }
        if (t20Var2.r) {
            cv.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        t20Var2.m = true;
        t20 t20Var3 = t20Var.j;
        if (t20Var3 != null) {
            t20Var3.i = t20Var2;
            t20Var2.j = t20Var3;
        }
        t20Var.j = t20Var2;
        t20Var2.i = t20Var;
        return t20Var2;
    }

    public static t20 b(t20 t20Var) {
        boolean z = t20Var.r;
        if (z) {
            g40 g40Var = e60.a;
            if (!z) {
                cv.b("autoInvalidateRemovedNode called on unattached node");
            }
            e60.a(t20Var, -1, 2);
            t20Var.l0();
            t20Var.f0();
        }
        t20 t20Var2 = t20Var.j;
        t20 t20Var3 = t20Var.i;
        if (t20Var2 != null) {
            t20Var2.i = t20Var3;
            t20Var.j = null;
        }
        if (t20Var3 != null) {
            t20Var3.j = t20Var2;
            t20Var.i = null;
        }
        t20Var3.getClass();
        return t20Var3;
    }

    public static void h(s20 s20Var, s20 s20Var2, t20 t20Var) {
        if ((s20Var instanceof y20) && (s20Var2 instanceof y20)) {
            t20Var.getClass();
            ((y20) s20Var2).e(t20Var);
            if (t20Var.r) {
                e60.c(t20Var);
                return;
            } else {
                t20Var.n = true;
                return;
            }
        }
        if (!(t20Var instanceof a8)) {
            cv.b("Unknown Modifier.Node type");
            return;
        }
        a8 a8Var = (a8) t20Var;
        boolean z = a8Var.r;
        if (z) {
            if (!z) {
                cv.b("unInitializeModifier called on unattached node");
            }
            if ((a8Var.g & 8) != 0) {
                nh.b0(a8Var).w();
            }
        }
        a8Var.s = s20Var2;
        g40 g40Var = e60.a;
        int i = s20Var2 instanceof hl ? 5 : 1;
        if (s20Var2 instanceof w6) {
            i |= 8;
        }
        if (s20Var2 instanceof x8) {
            i |= 524288;
        }
        a8Var.g = i;
        if (a8Var.r) {
            a8Var.o0(false);
        }
        if (t20Var.r) {
            e60.c(t20Var);
        } else {
            t20Var.n = true;
        }
    }

    public final boolean c(int i) {
        return (this.f.h & i) != 0;
    }

    public final void d(t20 t20Var, d60 d60Var) {
        for (t20 t20Var2 = t20Var.i; t20Var2 != null; t20Var2 = t20Var2.i) {
            if (t20Var2 == this.b) {
                iy n = this.a.n();
                d60Var.A = n != null ? n.H.c : null;
                this.d = d60Var;
                return;
            } else {
                if ((t20Var2.g & 2) != 0) {
                    return;
                }
                t20Var2.n0(d60Var);
            }
        }
    }

    public final void e() {
        for (t20 t20Var = this.f; t20Var != null; t20Var = t20Var.j) {
            t20Var.k0();
            if (t20Var.m) {
                g40 g40Var = e60.a;
                if (!t20Var.r) {
                    cv.b("autoInvalidateInsertedNode called on unattached node");
                }
                e60.a(t20Var, -1, 1);
            }
            if (t20Var.n) {
                e60.c(t20Var);
            }
            t20Var.m = false;
            t20Var.n = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0192, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0197, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a1, code lost:
    
        if (r14 <= r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a3, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a5, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b1, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b3, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01be, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c2, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c4, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c6, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c8, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ce, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d0, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0265, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ba, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0195, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018e, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x017c, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016f, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x017a, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x026b, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0155, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d1, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014b, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0151, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0153, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0157, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0158, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015a, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015c, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015e, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016c, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0171, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0183, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0189, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018b, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0190, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i, h40 h40Var, h40 h40Var2, t20 t20Var, boolean z) {
        int i2;
        h40 h40Var3;
        h40 h40Var4;
        int i3;
        int[] iArr;
        int[] iArr2;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        w50 w50Var = this.j;
        if (w50Var == null) {
            i2 = i;
            h40Var3 = h40Var;
            h40Var4 = h40Var2;
            w50Var = new w50(this, t20Var, i2, h40Var3, h40Var4, z);
            this.j = w50Var;
        } else {
            i2 = i;
            h40Var3 = h40Var;
            h40Var4 = h40Var2;
            w50Var.a = t20Var;
            w50Var.b = i2;
            w50Var.c = h40Var3;
            w50Var.d = h40Var4;
            w50Var.e = z;
        }
        y50 y50Var = w50Var.f;
        this.j = null;
        int i9 = h40Var3.b - i2;
        int i10 = h40Var4.b - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        fw fwVar = new fw(i11 * 3);
        fw fwVar2 = new fw(i11 * 4);
        int i12 = 0;
        fwVar2.e(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = fwVar2.b;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = fwVar2.a;
            int i15 = i12;
            int i16 = i14 - 1;
            fwVar2.b = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            fwVar2.b = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            fwVar2.b = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            fwVar2.b = i22;
            int i23 = iArr6[i22];
            int i24 = i21 - i23;
            int i25 = i13;
            int i26 = i17 - i19;
            int[] iArr7 = iArr3;
            if (i24 >= 1 && i26 >= 1) {
                int i27 = 1;
                int i28 = ((i24 + i26) + 1) / 2;
                int i29 = i25 / 2;
                int i30 = i29 + 1;
                iArr7[i30] = i23;
                iArr4[i30] = i21;
                int i31 = i15;
                while (i31 < i28) {
                    int i32 = i24 - i26;
                    int i33 = i28;
                    iArr = iArr4;
                    int i34 = -i31;
                    int i35 = (Math.abs(i32) & 1) == i27 ? 1 : i15;
                    int i36 = i34;
                    while (true) {
                        if (i36 > i31) {
                            break;
                        }
                        if (i36 != i34) {
                            if (i36 != i31) {
                                i4 = i36;
                                iArr2 = iArr5;
                            } else {
                                i4 = i36;
                                iArr2 = iArr5;
                            }
                            i5 = iArr7[(i4 - 1) + i29];
                            i6 = i5 + 1;
                            int i37 = ((i6 - i23) + i19) - i4;
                            int i38 = i37 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                            int i39 = i5;
                            i7 = i37;
                            while (i6 < i21 && i7 < i17 && w50Var.a(i6, i7)) {
                                i6++;
                                i7++;
                            }
                            iArr7[i29 + i4] = i6;
                            if (i35 == 0) {
                                int i40 = i7;
                                int i41 = i32 - i4;
                                i8 = i24;
                                if (i41 >= i34 + 1 && i41 <= i31 - 1 && iArr[i29 + i41] <= i6) {
                                    iArr2[i15] = i39;
                                    iArr2[1] = i38;
                                    iArr2[c4] = i6;
                                    iArr2[3] = i40;
                                    iArr2[4] = i15;
                                    c = 1;
                                    break;
                                }
                            } else {
                                i8 = i24;
                            }
                            i36 = i4 + 2;
                            iArr5 = iArr2;
                            i24 = i8;
                        } else {
                            i4 = i36;
                            iArr2 = iArr5;
                        }
                        i5 = iArr7[i4 + 1 + i29];
                        i6 = i5;
                        int i372 = ((i6 - i23) + i19) - i4;
                        int i382 = i372 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                        int i392 = i5;
                        i7 = i372;
                        while (i6 < i21) {
                            i6++;
                            i7++;
                        }
                        iArr7[i29 + i4] = i6;
                        if (i35 == 0) {
                        }
                        i36 = i4 + 2;
                        iArr5 = iArr2;
                        i24 = i8;
                    }
                    if (Math.min(iArr2[c4] - iArr2[i15], iArr2[3] - iArr2[c]) > 0) {
                        int i42 = iArr2[i15];
                        int i43 = iArr2[c];
                        int i44 = iArr2[3] - i43;
                        int i45 = iArr2[c4] - i42;
                        if (i44 != i45) {
                            i45 = Math.min(i45, i44);
                            int i46 = iArr2[4];
                            int i47 = i46 != 0 ? 1 : i15;
                            int i48 = iArr2[3];
                            c2 = 1;
                            int i49 = iArr2[1];
                            int i50 = i48 - i49;
                            int i51 = iArr2[c4];
                            int i52 = iArr2[i15];
                            int i53 = i42 + (((i50 > i51 - i52 ? 1 : i15) | i47) ^ 1);
                            i43 += (((i48 - i49 > i51 - i52 ? 1 : i15) ^ 1) | (i46 != 0 ? 1 : i15)) ^ 1;
                            i42 = i53;
                        } else {
                            c2 = 1;
                        }
                        fwVar.d(i42, i43, i45);
                    } else {
                        c2 = c;
                    }
                    fwVar2.e(i23, iArr2[i15], i19, iArr2[c2]);
                    fwVar2.e(iArr2[c4], i21, iArr2[3], i17);
                    c3 = c4;
                    i12 = i15;
                    i13 = i25;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c3 = c4;
            i12 = i15;
            i13 = i25;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i54 = i12;
        int i55 = fwVar.b;
        if (i55 % 3 != 0) {
            cv.b("Array size not a multiple of 3");
        }
        if (i55 > 3) {
            i3 = i54;
            fwVar.f(i3, i55 - 3);
        } else {
            i3 = i54;
        }
        fwVar.d(i9, i10, i3);
        int i56 = i3;
        int i57 = i56;
        int i58 = i57;
        while (i56 < fwVar.b) {
            int[] iArr8 = fwVar.a;
            int i59 = iArr8[i56];
            int i60 = iArr8[i56 + 2];
            int i61 = i59 - i60;
            int i62 = iArr8[i56 + 1] - i60;
            i56 += 3;
            while (i57 < i61) {
                t20 t20Var2 = w50Var.a.j;
                t20Var2.getClass();
                if ((t20Var2.g & 2) != 0) {
                    d60 d60Var = t20Var2.l;
                    d60Var.getClass();
                    d60 d60Var2 = d60Var.A;
                    d60 d60Var3 = d60Var.z;
                    d60Var3.getClass();
                    if (d60Var2 != null) {
                        d60Var2.z = d60Var3;
                    }
                    d60Var3.A = d60Var2;
                    y50Var.d(w50Var.a, d60Var3);
                }
                w50Var.a = b(t20Var2);
                i57++;
            }
            while (i58 < i62) {
                t20 a = a((s20) w50Var.d.g(w50Var.b + i58), w50Var.a);
                w50Var.a = a;
                if (w50Var.e) {
                    t20 t20Var3 = a.j;
                    t20Var3.getClass();
                    d60 d60Var4 = t20Var3.l;
                    d60Var4.getClass();
                    ay g = nh.g(w50Var.a);
                    if (g != null) {
                        dy dyVar = new dy(y50Var.a, g);
                        w50Var.a.n0(dyVar);
                        y50Var.d(w50Var.a, dyVar);
                        dyVar.A = d60Var4.A;
                        dyVar.z = d60Var4;
                        d60Var4.A = dyVar;
                    } else {
                        w50Var.a.n0(d60Var4);
                    }
                    w50Var.a.e0();
                    w50Var.a.k0();
                    t20 t20Var4 = w50Var.a;
                    g40 g40Var = e60.a;
                    if (!t20Var4.r) {
                        cv.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    e60.a(t20Var4, -1, 1);
                } else {
                    a.m = true;
                }
                i58++;
            }
            while (true) {
                int i63 = i60 - 1;
                if (i60 > 0) {
                    t20 t20Var5 = w50Var.a.j;
                    t20Var5.getClass();
                    w50Var.a = t20Var5;
                    s20 s20Var = (s20) w50Var.c.g(w50Var.b + i57);
                    s20 s20Var2 = (s20) w50Var.d.g(w50Var.b + i58);
                    if (!lw.i(s20Var, s20Var2)) {
                        h(s20Var, s20Var2, w50Var.a);
                    }
                    i57++;
                    i58++;
                    i60 = i63;
                }
            }
        }
        this.j = w50Var;
        int i64 = i3;
        for (t20 t20Var6 = this.e.i; t20Var6 != null && t20Var6 != this.b; t20Var6 = t20Var6.i) {
            i64 |= t20Var6.g;
            t20Var6.h = i64;
        }
    }

    public final void g() {
        iy iyVar;
        dy dyVar;
        t20 t20Var = this.e.i;
        d60 d60Var = this.c;
        t20 t20Var2 = t20Var;
        while (true) {
            iyVar = this.a;
            if (t20Var2 == null) {
                break;
            }
            ay g = nh.g(t20Var2);
            if (g != null) {
                d60 d60Var2 = t20Var2.l;
                if (d60Var2 != null) {
                    dy dyVar2 = (dy) d60Var2;
                    ay ayVar = dyVar2.e0;
                    dyVar2.b1(g);
                    dyVar = dyVar2;
                    if (ayVar != t20Var2) {
                        y80 y80Var = dyVar2.X;
                        dyVar = dyVar2;
                        if (y80Var != null) {
                            ((hs) y80Var).c();
                            dyVar = dyVar2;
                        }
                    }
                } else {
                    dy dyVar3 = new dy(iyVar, g);
                    t20Var2.n0(dyVar3);
                    dyVar = dyVar3;
                }
                d60Var.A = dyVar;
                dyVar.z = d60Var;
                d60Var = dyVar;
            } else {
                t20Var2.n0(d60Var);
            }
            t20Var2 = t20Var2.i;
        }
        iy n = iyVar.n();
        d60Var.A = n != null ? n.H.c : null;
        this.d = d60Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        t20 t20Var = this.f;
        ro0 ro0Var = this.e;
        if (t20Var != ro0Var) {
            while (true) {
                if (t20Var == null || t20Var == ro0Var) {
                    break;
                }
                sb.append(String.valueOf(t20Var));
                if (t20Var.j == ro0Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                t20Var = t20Var.j;
            }
        } else {
            sb.append("]");
        }
        return sb.toString();
    }
}
