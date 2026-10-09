package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class e30 {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final ArrayList d = new ArrayList();
    public final s00 e = new s00();
    public int f = -1;
    public int g = -1;
    public boolean h;
    public boolean i;
    public s60 j;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.a;
                this.a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.a;
            this.a = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f && source == this.g) {
            return;
        }
        this.f = toolType;
        this.g = source;
        this.c.clear();
        this.b.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r0 == 5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0097, code lost:
    
        if (r0 == 5) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p2 c(MotionEvent motionEvent, e3 e3Var) {
        int i;
        int classification;
        int classification2;
        int classification3;
        float rawX;
        float rawX2;
        float rawY;
        float rawY2;
        float rawX3;
        float rawY3;
        int classification4;
        boolean z;
        int classification5;
        int classification6;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        if (actionMasked == 3 || actionMasked == 4) {
            this.b.clear();
            sparseBooleanArray.clear();
            this.h = false;
            this.i = false;
            this.j = null;
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z2 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z3 = actionMasked == 8;
        if (z2) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            i = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            i = 0;
        }
        ArrayList arrayList = this.d;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            if (Build.VERSION.SDK_INT >= 34) {
                classification5 = motionEvent.getClassification();
                if (classification5 != 3) {
                    classification6 = motionEvent.getClassification();
                }
                z = true;
                boolean z4 = motionEvent.getButtonState() != 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
                if (!z || z4) {
                    this.h = true;
                }
            }
            z = false;
            if (motionEvent.getButtonState() != 0) {
            }
            if (!z) {
            }
            this.h = true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            classification = motionEvent.getClassification();
            if (classification != 3) {
                classification4 = motionEvent.getClassification();
            }
            classification2 = motionEvent.getClassification();
            if (classification2 == 5 && motionEvent.getPointerCount() == 1) {
                if (motionEvent.getActionMasked() == 1) {
                    this.h = false;
                    this.i = false;
                    this.j = null;
                }
                e(motionEvent);
                return null;
            }
            this.i = true;
            if (motionEvent.getActionMasked() == 0) {
                rawX3 = motionEvent.getRawX(0);
                rawY3 = motionEvent.getRawY(0);
                this.j = new s60((Float.floatToRawIntBits(rawX3) << 32) | (Float.floatToRawIntBits(rawY3) & 4294967295L));
            } else if (motionEvent.getActionMasked() == 5) {
                classification3 = motionEvent.getClassification();
                if (classification3 == 5 && motionEvent.getPointerCount() == 2) {
                    rawX = motionEvent.getRawX(0);
                    rawX2 = motionEvent.getRawX(1);
                    rawY = motionEvent.getRawY(0);
                    rawY2 = motionEvent.getRawY(1);
                    this.j = new s60((Float.floatToRawIntBits((rawX2 + rawX) / 2.0f) << 32) | (Float.floatToRawIntBits((rawY2 + rawY) / 2.0f) & 4294967295L));
                }
            }
            arrayList.add(d(e3Var, motionEvent, this.j, 0, false));
            if (motionEvent.getActionMasked() == 1) {
                this.h = false;
                this.i = false;
                this.j = null;
            }
            e(motionEvent);
            motionEvent.getEventTime();
            return new p2(15, arrayList, motionEvent);
        }
        this.i = false;
        int pointerCount = motionEvent.getPointerCount();
        int i2 = 0;
        while (i2 < pointerCount) {
            arrayList.add(d(e3Var, motionEvent, null, i2, (z2 || i2 == i || (z3 && motionEvent.getButtonState() == 0)) ? false : true));
            i2++;
        }
        if (motionEvent.getActionMasked() == 1) {
        }
        e(motionEvent);
        motionEvent.getEventTime();
        return new p2(15, arrayList, motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b3, code lost:
    
        if (r1 != 4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0182 A[EDGE_INSN: B:41:0x0182->B:42:0x0182 BREAK  A[LOOP:0: B:20:0x00ea->B:38:0x0179], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xc0 d(e3 e3Var, MotionEvent motionEvent, s60 s60Var, int i, boolean z) {
        long j;
        long j2;
        long q;
        long j3;
        float rawX;
        float rawY;
        long floatToRawIntBits;
        long D;
        boolean z2;
        int toolType;
        int i2;
        int historySize;
        int i3;
        long j4;
        float f;
        int i4;
        long j5;
        int classification;
        int classification2;
        Float valueOf;
        int i5;
        int classification3;
        boolean z3;
        boolean z4;
        int pointerId = motionEvent.getPointerId(i);
        SparseLongArray sparseLongArray = this.b;
        int indexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (indexOfKey >= 0) {
            j = sparseLongArray.valueAt(indexOfKey);
        } else {
            long j6 = this.a;
            this.a = 1 + j6;
            sparseLongArray.put(pointerId, j6);
            j = j6;
        }
        float pressure = motionEvent.getPressure(i);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(motionEvent.getY(i)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i)) << 32);
        if (i == 0) {
            if (s60Var != null) {
                q = s60Var.a;
                z4 = 32;
                j2 = 4294967295L;
            } else {
                float rawX2 = motionEvent.getRawX();
                float rawY2 = motionEvent.getRawY();
                long floatToRawIntBits3 = Float.floatToRawIntBits(rawX2);
                int floatToRawIntBits4 = Float.floatToRawIntBits(rawY2);
                z4 = 32;
                j2 = 4294967295L;
                q = (floatToRawIntBits3 << 32) | (floatToRawIntBits4 & 4294967295L);
            }
            D = e3Var.D(q);
            z3 = z4;
        } else {
            boolean z5 = 32;
            j2 = 4294967295L;
            if (Build.VERSION.SDK_INT < 29) {
                q = e3Var.q(floatToRawIntBits2);
                j3 = floatToRawIntBits2;
                z2 = z5;
                toolType = motionEvent.getToolType(i);
                if (toolType != 0) {
                    int i6 = 2;
                    if (toolType == 1) {
                        if ((!motionEvent.isFromSource(8194) && !motionEvent.isFromSource(1048584)) || (this.h && !this.i)) {
                            i2 = 1;
                        }
                        i2 = i6;
                    } else if (toolType != 2) {
                        if (toolType != 3) {
                            i6 = 4;
                        }
                        i2 = i6;
                    } else {
                        i2 = 3;
                    }
                    ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    boolean z6 = z2;
                    i3 = 0;
                    while (true) {
                        j4 = 0;
                        if (i3 >= historySize) {
                            break;
                        }
                        float historicalX = motionEvent.getHistoricalX(i, i3);
                        float historicalY = motionEvent.getHistoricalY(i, i3);
                        if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                            i5 = historySize;
                        } else {
                            long floatToRawIntBits5 = Float.floatToRawIntBits(historicalX);
                            int floatToRawIntBits6 = Float.floatToRawIntBits(historicalY);
                            i5 = historySize;
                            long j7 = (floatToRawIntBits5 << (z6 ? 1L : 0L)) | (floatToRawIntBits6 & j2);
                            long historicalEventTime = motionEvent.getHistoricalEventTime(i3);
                            float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i, i3);
                            valueOf = historicalAxisValue > 0.0f ? Float.valueOf(historicalAxisValue) : null;
                            float floatValue = valueOf != null ? valueOf.floatValue() : 1.0f;
                            if (Build.VERSION.SDK_INT >= 29) {
                                classification3 = motionEvent.getClassification();
                                if (classification3 == 3) {
                                    j4 = (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i3)) << (z6 ? 1L : 0L)) | (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i3)) & j2);
                                }
                            }
                            arrayList.add(new xs(historicalEventTime, j7, floatValue, j4, j7));
                        }
                        i3++;
                        historySize = i5;
                    }
                    long floatToRawIntBits7 = motionEvent.getActionMasked() == 8 ? (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << (z6 ? 1L : 0L)) | (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & j2) : 0L;
                    i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 29) {
                        classification2 = motionEvent.getClassification();
                        if (classification2 == 5) {
                            float axisValue = motionEvent.getAxisValue(52, i);
                            valueOf = axisValue > 0.0f ? Float.valueOf(axisValue) : null;
                            if (valueOf != null) {
                                f = valueOf.floatValue();
                            }
                        }
                    }
                    float f2 = f;
                    if (i4 >= 29) {
                        classification = motionEvent.getClassification();
                        if (classification == 3) {
                            j5 = floatToRawIntBits2;
                            j4 = (Float.floatToRawIntBits(motionEvent.getAxisValue(50, i)) << (z6 ? 1L : 0L)) | (Float.floatToRawIntBits(motionEvent.getAxisValue(51, i)) & j2);
                            return new xc0(j, motionEvent.getEventTime(), q, j3, z, pressure, i2, this.c.get(motionEvent.getPointerId(i), false), arrayList, floatToRawIntBits7, f2, j4, j5);
                        }
                    }
                    j5 = floatToRawIntBits2;
                    return new xc0(j, motionEvent.getEventTime(), q, j3, z, pressure, i2, this.c.get(motionEvent.getPointerId(i), false), arrayList, floatToRawIntBits7, f2, j4, j5);
                }
                i2 = 0;
                ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                boolean z62 = z2;
                i3 = 0;
                while (true) {
                    j4 = 0;
                    if (i3 >= historySize) {
                    }
                    i3++;
                    historySize = i5;
                }
                if (motionEvent.getActionMasked() == 8) {
                }
                i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                }
                float f22 = f;
                if (i4 >= 29) {
                }
                j5 = floatToRawIntBits2;
                return new xc0(j, motionEvent.getEventTime(), q, j3, z, pressure, i2, this.c.get(motionEvent.getPointerId(i), false), arrayList2, floatToRawIntBits7, f22, j4, j5);
            }
            if (s60Var != null) {
                floatToRawIntBits = s60Var.a;
            } else {
                rawX = motionEvent.getRawX(i);
                rawY = motionEvent.getRawY(i);
                floatToRawIntBits = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
            }
            q = floatToRawIntBits;
            D = e3Var.D(q);
            z3 = z5;
        }
        j3 = D;
        z2 = z3;
        toolType = motionEvent.getToolType(i);
        if (toolType != 0) {
        }
        i2 = 0;
        ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        boolean z622 = z2;
        i3 = 0;
        while (true) {
            j4 = 0;
            if (i3 >= historySize) {
            }
            i3++;
            historySize = i5;
        }
        if (motionEvent.getActionMasked() == 8) {
        }
        i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
        }
        float f222 = f;
        if (i4 >= 29) {
        }
        j5 = floatToRawIntBits2;
        return new xc0(j, motionEvent.getEventTime(), q, j3, z, pressure, i2, this.c.get(motionEvent.getPointerId(i), false), arrayList22, floatToRawIntBits7, f222, j4, j5);
    }

    public final void e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int keyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == keyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}
