package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class p00 {
    public static final mm e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        Unsafe unsafe = p7.a;
        f = unsafe.objectFieldOffset(p00.class.getDeclaredField("_next$volatile"));
        g = unsafe.objectFieldOffset(p00.class.getDeclaredField("_state$volatile"));
        e = new mm("REMOVE_FROZEN", 1);
    }

    public p00(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            z6.m("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        z6.m("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        p00 p00Var = this;
        while (true) {
            Unsafe unsafe = p7.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(p00Var, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                return (2305843009213693952L & longVolatile) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = p00Var.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = p00Var.b;
            AtomicReferenceArray atomicReferenceArray = p00Var.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(p00Var, g, longVolatile, ((-1152921503533105153L) & longVolatile) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    p00 p00Var2 = this;
                    while ((p7.a.getLongVolatile(p00Var2, j) & 1152921504606846976L) != 0) {
                        p00Var2 = p00Var2.c();
                        AtomicReferenceArray atomicReferenceArray2 = p00Var2.d;
                        int i4 = p00Var2.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof o00) && ((o00) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            p00Var2 = null;
                        }
                        if (p00Var2 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                p00Var = this;
            } else {
                int i5 = p00Var.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            long longVolatile = p7.a.getLongVolatile(this, g);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            p00 p00Var = this;
            if (p7.a.compareAndSwapLong(p00Var, g, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = p00Var;
        }
    }

    public final p00 c() {
        long j;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = p7.a;
            long j2 = g;
            long longVolatile = unsafe2.getLongVolatile(this, j2);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j = longVolatile;
                break;
            }
            j = 1152921504606846976L | longVolatile;
            if (unsafe2.compareAndSwapLong(this, j2, longVolatile, j)) {
                break;
            }
        }
        while (true) {
            Unsafe unsafe3 = p7.a;
            long j3 = f;
            p00 p00Var = (p00) unsafe3.getObjectVolatile(this, j3);
            if (p00Var != null) {
                return p00Var;
            }
            p00 p00Var2 = new p00(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.d.get(i4);
                if (obj == null) {
                    obj = new o00(i);
                }
                p00Var2.d.set(p00Var2.c & i, obj);
                i++;
            }
            p7.a.putLongVolatile(p00Var2, g, j & (-1152921504606846977L));
            do {
                unsafe = p7.a;
                if (unsafe.compareAndSwapObject(this, f, (Object) null, p00Var2)) {
                    break;
                }
            } while (unsafe.getObjectVolatile(this, j3) == null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0044, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d() {
        p00 p00Var = this;
        while (true) {
            Unsafe unsafe = p7.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(p00Var, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return e;
            }
            int i = (int) (longVolatile & 1073741823);
            int i2 = p00Var.c;
            int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = p00Var.d;
            Object obj = atomicReferenceArray.get(i4);
            boolean z = p00Var.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof o00) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (unsafe.compareAndSwapLong(p00Var, j, longVolatile, (longVolatile & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                }
                p00Var = this;
                if (z) {
                    while (true) {
                        Unsafe unsafe2 = p7.a;
                        long j3 = g;
                        long longVolatile2 = unsafe2.getLongVolatile(p00Var, j3);
                        int i5 = (int) (longVolatile2 & 1073741823);
                        if ((longVolatile2 & 1152921504606846976L) != 0) {
                            p00Var = p00Var.c();
                        } else {
                            if (unsafe2.compareAndSwapLong(p00Var, j3, longVolatile2, (longVolatile2 & (-1073741824)) | j2)) {
                                p00Var.d.set(p00Var.c & i5, null);
                                p00Var = null;
                            } else {
                                continue;
                            }
                        }
                        if (p00Var == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
