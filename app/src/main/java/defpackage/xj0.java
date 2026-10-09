package defpackage;

import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class xj0 {
    public final iy a;
    public final wm b;
    public final vv c;
    public final h40 d = new h40(2);

    public xj0(iy iyVar, wm wmVar, y30 y30Var) {
        this.a = iyVar;
        this.b = wmVar;
        this.c = y30Var;
    }

    public final uj0 a() {
        return new uj0(this.b, false, this.a, new qj0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0133  */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(iy iyVar, qj0 qj0Var) {
        a4 a4Var;
        a4 a4Var2;
        String str;
        String str2;
        qq0 qq0Var;
        qq0 qq0Var2;
        l4 l4Var;
        l4 l4Var2;
        h40 h40Var = this.d;
        Object[] objArr = h40Var.a;
        int i = h40Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            l2 l2Var = (l2) objArr[i2];
            l2Var.getClass();
            qj0 q = iyVar.q();
            int i3 = iyVar.f;
            p2 p2Var = l2Var.e;
            e3 e3Var = l2Var.g;
            if (qj0Var != null) {
                Object g = qj0Var.e.g(yj0.s);
                if (g == null) {
                    g = null;
                }
                a4Var = (a4) g;
            } else {
                a4Var = null;
            }
            if (q != null) {
                Object g2 = q.e.g(yj0.s);
                if (g2 == null) {
                    g2 = null;
                }
                a4Var2 = (a4) g2;
            } else {
                a4Var2 = null;
            }
            a4 a4Var3 = b2.A;
            if (!lw.i(a4Var2, a4Var3)) {
                if (lw.i(a4Var, a4Var3) && !lw.i(a4Var2, a4Var3)) {
                    p2Var.m(e3Var, i3, true);
                }
                if (qj0Var != null) {
                    Object g3 = qj0Var.e.g(yj0.D);
                    if (g3 == null) {
                        g3 = null;
                    }
                    p6 p6Var = (p6) g3;
                    if (p6Var != null) {
                        str = p6Var.f;
                        if (q != null) {
                            Object g4 = q.e.g(yj0.D);
                            if (g4 == null) {
                                g4 = null;
                            }
                            p6 p6Var2 = (p6) g4;
                            if (p6Var2 != null) {
                                str2 = p6Var2.f;
                                if (str != str2) {
                                    if (str == null) {
                                        p2Var.m(e3Var, i3, true);
                                    } else if (str2 == null) {
                                        p2Var.m(e3Var, i3, false);
                                    } else if (lw.i(a4Var2, b2.B)) {
                                        int length = str2.length();
                                        String str3 = str2;
                                        if (length > 5000) {
                                            str3 = (Character.isHighSurrogate(str2.charAt(4999)) && Character.isLowSurrogate(str2.charAt(5000))) ? ln0.L(str2, 4999) : ln0.L(str2, 5000);
                                        }
                                        p2Var.k().notifyValueChanged(e3Var, i3, AutofillValue.forText(str3));
                                    }
                                }
                                if (qj0Var != null) {
                                    Object g5 = qj0Var.e.g(yj0.I);
                                    if (g5 == null) {
                                        g5 = null;
                                    }
                                    qq0Var = (qq0) g5;
                                } else {
                                    qq0Var = null;
                                }
                                if (q != null) {
                                    Object g6 = q.e.g(yj0.I);
                                    if (g6 == null) {
                                        g6 = null;
                                    }
                                    qq0Var2 = (qq0) g6;
                                } else {
                                    qq0Var2 = null;
                                }
                                if (qq0Var != qq0Var2) {
                                    if (qq0Var == null) {
                                        p2Var.m(e3Var, i3, true);
                                    } else if (qq0Var2 == null) {
                                        p2Var.m(e3Var, i3, false);
                                    } else if (lw.i(a4Var2, b2.C)) {
                                        int ordinal = qq0Var2.ordinal();
                                        Boolean bool = ordinal != 0 ? ordinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                                        if (bool != null) {
                                            p2Var.k().notifyValueChanged(e3Var, i3, AutofillValue.forToggle(bool.booleanValue()));
                                        }
                                    }
                                }
                                if (qj0Var != null) {
                                    Object g7 = qj0Var.e.g(yj0.t);
                                    if (g7 == null) {
                                        g7 = null;
                                    }
                                    l4Var = (l4) g7;
                                } else {
                                    l4Var = null;
                                }
                                if (q != null) {
                                    Object g8 = q.e.g(yj0.t);
                                    if (g8 == null) {
                                        g8 = null;
                                    }
                                    l4Var2 = (l4) g8;
                                } else {
                                    l4Var2 = null;
                                }
                                if (!lw.i(l4Var, l4Var2)) {
                                    if (l4Var == null) {
                                        p2Var.m(e3Var, i3, true);
                                    } else if (l4Var2 == null) {
                                        p2Var.m(e3Var, i3, false);
                                    } else {
                                        p2Var.k().notifyValueChanged(e3Var, i3, l4Var2.a);
                                    }
                                }
                            }
                        }
                        str2 = null;
                        if (str != str2) {
                        }
                        if (qj0Var != null) {
                        }
                        if (q != null) {
                        }
                        if (qq0Var != qq0Var2) {
                        }
                        if (qj0Var != null) {
                        }
                        if (q != null) {
                        }
                        if (!lw.i(l4Var, l4Var2)) {
                        }
                    }
                }
                str = null;
                if (q != null) {
                }
                str2 = null;
                if (str != str2) {
                }
                if (qj0Var != null) {
                }
                if (q != null) {
                }
                if (qq0Var != qq0Var2) {
                }
                if (qj0Var != null) {
                }
                if (q != null) {
                }
                if (!lw.i(l4Var, l4Var2)) {
                }
            } else if (!lw.i(a4Var, a4Var3)) {
                p2Var.m(e3Var, i3, false);
            }
            boolean z = qj0Var != null && qj0Var.e.b(yj0.r);
            boolean z2 = q != null && q.e.b(yj0.r);
            if (z != z2) {
                z30 z30Var = l2Var.k;
                if (z2) {
                    z30Var.a(i3);
                } else {
                    z30Var.e(i3);
                }
            }
        }
    }
}
