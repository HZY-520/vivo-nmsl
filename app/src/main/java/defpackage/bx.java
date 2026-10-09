package defpackage;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class bx implements fu {
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final f60 e;

    static {
        Unsafe unsafe = p7.a;
        g = unsafe.objectFieldOffset(bx.class.getDeclaredField("_isCompleting$volatile"));
        h = unsafe.objectFieldOffset(bx.class.getDeclaredField("_rootCause$volatile"));
        f = unsafe.objectFieldOffset(bx.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public bx(f60 f60Var, Throwable th) {
        this.e = f60Var;
        this._rootCause$volatile = th;
    }

    @Override // defpackage.fu
    public final boolean a() {
        return c() == null;
    }

    public final void b(Throwable th) {
        Throwable c = c();
        if (c == null) {
            p7.a.putObjectVolatile(this, h, th);
            return;
        }
        if (th == c) {
            return;
        }
        Unsafe unsafe = p7.a;
        long j = f;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            unsafe.putObjectVolatile(this, j, th);
            return;
        }
        if (!(objectVolatile instanceof Throwable)) {
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
                return;
            } else {
                z6.e(objectVolatile, "State is ");
                return;
            }
        }
        if (th == objectVolatile) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objectVolatile);
        arrayList.add(th);
        unsafe.putObjectVolatile(this, j, arrayList);
    }

    public final Throwable c() {
        return (Throwable) p7.a.getObjectVolatile(this, h);
    }

    @Override // defpackage.fu
    public final f60 d() {
        return this.e;
    }

    public final boolean e() {
        return c() != null;
    }

    public final boolean f() {
        return p7.a.getIntVolatile(this, g) != 0;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = p7.a;
        long j = f;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                z6.e(objectVolatile, "State is ");
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable c = c();
        if (c != null) {
            arrayList.add(0, c);
        }
        if (th != null && !th.equals(c)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, dx0.p);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + c() + ", exceptions=" + p7.a.getObjectVolatile(this, f) + ", list=" + this.e + ']';
    }
}
