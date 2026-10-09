package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class rc0 {
    public final List a;
    public final p2 b;
    public int c;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        if (r12 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        r1 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
    
        if (r12 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
    
        if (r12 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0098, code lost:
    
        if (r12 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a0, code lost:
    
        if (r12 == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rc0(List list, p2 p2Var) {
        boolean z;
        boolean z2;
        int actionMasked;
        int classification;
        int classification2;
        MotionEvent a;
        this.a = list;
        this.b = p2Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && (a = a()) != null) {
            a.getClassification();
        }
        MotionEvent a2 = a();
        if (a2 != null) {
            a2.getButtonState();
        }
        MotionEvent a3 = a();
        if (a3 != null) {
            a3.getMetaState();
        }
        MotionEvent a4 = a();
        int i2 = 0;
        if (a4 != null) {
            if (i >= 34) {
                classification2 = a4.getClassification();
                if (classification2 == 3) {
                    z = true;
                    if (i >= 34) {
                        classification = a4.getClassification();
                        if (classification == 5) {
                            z2 = true;
                            actionMasked = a4.getActionMasked();
                            if (actionMasked == 0) {
                                if (!z) {
                                    if (z2) {
                                    }
                                    i2 = 1;
                                }
                                i2 = 10;
                            } else if (actionMasked != 1) {
                                if (actionMasked != 2) {
                                    switch (actionMasked) {
                                        case Gates.MAX_WINDOWS /* 5 */:
                                            if (!z) {
                                                if (!z2) {
                                                }
                                                i2 = 7;
                                                break;
                                            }
                                            i2 = 10;
                                            break;
                                        case 6:
                                            if (!z) {
                                                if (!z2) {
                                                }
                                                i2 = 9;
                                                break;
                                            }
                                            i2 = 12;
                                            break;
                                        case MainActivity.$stable /* 8 */:
                                            i2 = 6;
                                            break;
                                        case 9:
                                            i2 = 4;
                                            break;
                                        case 10:
                                            i2 = 5;
                                            break;
                                    }
                                }
                                if (z) {
                                    i2 = 11;
                                }
                            } else {
                                if (!z) {
                                    if (z2) {
                                    }
                                    i2 = 2;
                                }
                                i2 = 12;
                            }
                        }
                    }
                    z2 = false;
                    actionMasked = a4.getActionMasked();
                    if (actionMasked == 0) {
                    }
                }
            }
            z = false;
            if (i >= 34) {
            }
            z2 = false;
            actionMasked = a4.getActionMasked();
            if (actionMasked == 0) {
            }
        } else {
            int size = list.size();
            while (i2 < size) {
                vc0 vc0Var = (vc0) list.get(i2);
                if (t30.d(vc0Var)) {
                    i2 = 2;
                } else if (t30.c(vc0Var)) {
                    i2 = 1;
                } else {
                    i2++;
                }
            }
            i2 = 3;
        }
        this.c = i2;
    }

    public final MotionEvent a() {
        p2 p2Var = this.b;
        if (p2Var != null) {
            return (MotionEvent) ((p2) p2Var.g).g;
        }
        return null;
    }
}
