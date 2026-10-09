package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class m00 {
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = p7.a;
        e = unsafe.objectFieldOffset(m00.class.getDeclaredField("_next$volatile"));
        f = unsafe.objectFieldOffset(m00.class.getDeclaredField("_prev$volatile"));
        g = unsafe.objectFieldOffset(m00.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean e(m00 m00Var, int i) {
        m00 m00Var2;
        m00 m00Var3;
        while (true) {
            m00 j = this.j();
            if (j instanceof b00) {
                return (((b00) j).h & i) == 0 && j.e(m00Var, i);
            }
            Unsafe unsafe = p7.a;
            unsafe.putObjectVolatile(m00Var, f, j);
            long j2 = e;
            unsafe.putObjectVolatile(m00Var, j2, this);
            while (true) {
                Unsafe unsafe2 = p7.a;
                m00Var2 = this;
                m00Var3 = m00Var;
                if (unsafe2.compareAndSwapObject(j, e, m00Var2, m00Var3)) {
                    m00Var3.g(m00Var2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(j, j2) != m00Var2) {
                    break;
                }
                this = m00Var2;
                m00Var = m00Var3;
            }
            this = m00Var2;
            m00Var = m00Var3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x002a, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m00 f() {
        m00 m00Var;
        Unsafe unsafe;
        loop0: while (true) {
            Unsafe unsafe2 = p7.a;
            long j = f;
            m00 m00Var2 = (m00) unsafe2.getObjectVolatile(this, j);
            m00 m00Var3 = null;
            m00 m00Var4 = m00Var2;
            while (m00Var4 != null) {
                Unsafe unsafe3 = p7.a;
                long j2 = e;
                Object objectVolatile = unsafe3.getObjectVolatile(m00Var4, j2);
                if (objectVolatile != this) {
                    m00 m00Var5 = m00Var2;
                    m00Var = this;
                    if (m00Var.k()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof ef0)) {
                        objectVolatile.getClass();
                        m00Var3 = m00Var4;
                        m00Var4 = (m00) objectVolatile;
                    } else if (m00Var3 != null) {
                        m00 m00Var6 = ((ef0) objectVolatile).a;
                        do {
                            m00 m00Var7 = m00Var4;
                            unsafe = p7.a;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(m00Var3, e, m00Var7, m00Var6);
                            m00Var4 = m00Var7;
                            if (compareAndSwapObject) {
                                this = m00Var;
                                m00Var4 = m00Var3;
                                m00Var2 = m00Var5;
                                m00Var3 = null;
                            }
                        } while (unsafe.getObjectVolatile(m00Var3, j2) == m00Var4);
                    } else {
                        if (m00Var4 == null) {
                            z6.c();
                            return null;
                        }
                        m00Var4 = (m00) unsafe3.getObjectVolatile(m00Var4, j);
                    }
                    this = m00Var;
                    m00Var2 = m00Var5;
                } else {
                    if (m00Var2 == m00Var4) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = p7.a;
                        m00 m00Var8 = this;
                        boolean compareAndSwapObject2 = unsafe4.compareAndSwapObject(m00Var8, f, m00Var2, m00Var4);
                        m00 m00Var9 = m00Var2;
                        m00Var = m00Var8;
                        if (compareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(m00Var, j) != m00Var9) {
                            break;
                        }
                        this = m00Var;
                        m00Var2 = m00Var9;
                    }
                }
                this = m00Var;
            }
            z6.c();
            return null;
        }
    }

    public final void g(m00 m00Var) {
        m00 m00Var2;
        while (true) {
            Unsafe unsafe = p7.a;
            long j = f;
            m00 m00Var3 = (m00) unsafe.getObjectVolatile(m00Var, j);
            if (this.h() != m00Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = p7.a;
                m00Var2 = this;
                m00 m00Var4 = m00Var;
                if (unsafe2.compareAndSwapObject(m00Var4, f, m00Var3, m00Var2)) {
                    if (m00Var2.k()) {
                        m00Var4.f();
                        return;
                    }
                    return;
                } else {
                    m00Var = m00Var4;
                    if (unsafe2.getObjectVolatile(m00Var4, j) != m00Var3) {
                        break;
                    } else {
                        this = m00Var2;
                    }
                }
            }
            this = m00Var2;
        }
    }

    public final Object h() {
        return p7.a.getObjectVolatile(this, e);
    }

    public final m00 i() {
        Object h = h();
        ef0 ef0Var = h instanceof ef0 ? (ef0) h : null;
        if (ef0Var != null) {
            return ef0Var.a;
        }
        h.getClass();
        return (m00) h;
    }

    public final m00 j() {
        m00 f2 = f();
        if (f2 != null) {
            return f2;
        }
        Unsafe unsafe = p7.a;
        long j = f;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            m00 m00Var = (m00) objectVolatile;
            if (!m00Var.k()) {
                return m00Var;
            }
            objectVolatile = p7.a.getObjectVolatile(m00Var, j);
        }
    }

    public boolean k() {
        return h() instanceof ef0;
    }

    public String toString() {
        return new l00(this, nh.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + nh.y(this);
    }
}
