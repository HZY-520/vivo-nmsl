package defpackage;

import android.graphics.Typeface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class l20 implements o90, et0 {
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public l20(Typeface typeface, i20 i20Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.h = typeface;
        this.e = i20Var;
        this.g = new k20(1024);
        int a = i20Var.a(6);
        if (a != 0) {
            int i5 = a + i20Var.e;
            i = ((ByteBuffer) i20Var.h).getInt(((ByteBuffer) i20Var.h).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f = new char[i * 2];
        int a2 = i20Var.a(6);
        if (a2 != 0) {
            int i6 = a2 + i20Var.e;
            i2 = ((ByteBuffer) i20Var.h).getInt(((ByteBuffer) i20Var.h).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            rr0 rr0Var = new rr0(this, i7);
            h20 b = rr0Var.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.h).getInt(a3 + b.e) : 0, (char[]) this.f, i7 * 2);
            h20 b2 = rr0Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.e;
                i3 = ((ByteBuffer) b2.h).getInt(((ByteBuffer) b2.h).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                z6.l("invalid metadata codepoint length");
                throw null;
            }
            k20 k20Var = (k20) this.g;
            h20 b3 = rr0Var.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.e;
                i4 = ((ByteBuffer) b3.h).getInt(((ByteBuffer) b3.h).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            k20Var.a(rr0Var, 0, i4 - 1);
        }
    }

    @Override // defpackage.o90
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((n90) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.o90
    public float c() {
        return ((Number) ((oy) this.g).getValue()).floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(long j, long j2, og ogVar) {
        p50 p50Var;
        int i;
        long j3;
        if (ogVar instanceof p50) {
            p50Var = (p50) ogVar;
            int i2 = p50Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p50Var.g = i2 - Integer.MIN_VALUE;
                p50 p50Var2 = p50Var;
                Object obj = p50Var2.e;
                i = p50Var2.g;
                if (i != 0) {
                    t30.z(obj);
                    t50 t50Var = (t50) this.e;
                    t50 p0 = t50Var != null ? t50Var.p0() : null;
                    j3 = 0;
                    dh dhVar = dh.e;
                    if (p0 == null) {
                        t50 t50Var2 = (t50) this.f;
                        if (t50Var2 != null) {
                            p50Var2.g = 1;
                            obj = t50Var2.b0(j, j2, p50Var2);
                        }
                    } else {
                        t50 t50Var3 = (t50) this.e;
                        t50 p02 = t50Var3 != null ? t50Var3.p0() : null;
                        if (p02 != null) {
                            p50Var2.g = 2;
                            obj = p02.b0(j, j2, p50Var2);
                        }
                    }
                } else if (i == 1) {
                    t30.z(obj);
                    j3 = ((ft0) obj).a;
                } else {
                    if (i != 2) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t30.z(obj);
                    j3 = ((ft0) obj).a;
                }
                return new ft0(j3);
            }
        }
        p50Var = new p50(this, ogVar);
        p50 p50Var22 = p50Var;
        Object obj2 = p50Var22.e;
        i = p50Var22.g;
        if (i != 0) {
        }
        return new ft0(j3);
    }

    @Override // defpackage.et0
    public l6 e(long j, l6 l6Var, l6 l6Var2, l6 l6Var3) {
        l6 l6Var4 = (l6) this.g;
        if (l6Var4 == null) {
            l6Var4 = l6Var3.c();
            this.g = l6Var4;
        }
        int b = l6Var4.b();
        int i = 0;
        while (true) {
            l6 l6Var5 = (l6) this.g;
            if (i >= b) {
                if (l6Var5 != null) {
                    return l6Var5;
                }
                lw.E("velocityVector");
                throw null;
            }
            if (l6Var5 == null) {
                lw.E("velocityVector");
                throw null;
            }
            long j2 = j;
            l6Var5.e(((m6) this.e).get(i).c(j2, l6Var.a(i), l6Var2.a(i), l6Var3.a(i)), i);
            i++;
            j = j2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(long j, og ogVar) {
        q50 q50Var;
        int i;
        long j2;
        if (ogVar instanceof q50) {
            q50Var = (q50) ogVar;
            int i2 = q50Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q50Var.g = i2 - Integer.MIN_VALUE;
                Object obj = q50Var.e;
                i = q50Var.g;
                if (i != 0) {
                    t30.z(obj);
                    t50 t50Var = (t50) this.e;
                    t50 p0 = t50Var != null ? t50Var.p0() : null;
                    if (p0 == null) {
                        j2 = 0;
                        return new ft0(j2);
                    }
                    q50Var.g = 1;
                    obj = p0.M(j, q50Var);
                    dh dhVar = dh.e;
                    if (obj == dhVar) {
                        return dhVar;
                    }
                } else {
                    if (i != 1) {
                        z6.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t30.z(obj);
                }
                j2 = ((ft0) obj).a;
                return new ft0(j2);
            }
        }
        q50Var = new q50(this, ogVar);
        Object obj2 = q50Var.e;
        i = q50Var.g;
        if (i != 0) {
        }
        j2 = ((ft0) obj2).a;
        return new ft0(j2);
    }

    @Override // defpackage.et0
    public l6 g(long j, l6 l6Var, l6 l6Var2, l6 l6Var3) {
        l6 l6Var4 = (l6) this.f;
        if (l6Var4 == null) {
            l6Var4 = l6Var.c();
            this.f = l6Var4;
        }
        int b = l6Var4.b();
        int i = 0;
        while (true) {
            l6 l6Var5 = (l6) this.f;
            if (i >= b) {
                if (l6Var5 != null) {
                    return l6Var5;
                }
                lw.E("valueVector");
                throw null;
            }
            if (l6Var5 == null) {
                lw.E("valueVector");
                throw null;
            }
            long j2 = j;
            l6Var5.e(((m6) this.e).get(i).b(j2, l6Var.a(i), l6Var2.a(i), l6Var3.a(i)), i);
            i++;
            j = j2;
        }
    }

    @Override // defpackage.et0
    public l6 h(l6 l6Var, l6 l6Var2, l6 l6Var3) {
        l6 l6Var4 = (l6) this.h;
        if (l6Var4 == null) {
            l6Var4 = l6Var3.c();
            this.h = l6Var4;
        }
        int b = l6Var4.b();
        int i = 0;
        while (true) {
            l6 l6Var5 = (l6) this.h;
            if (i >= b) {
                if (l6Var5 != null) {
                    return l6Var5;
                }
                lw.E("endVelocityVector");
                throw null;
            }
            if (l6Var5 == null) {
                lw.E("endVelocityVector");
                throw null;
            }
            l6Var5.e(((m6) this.e).get(i).e(l6Var.a(i), l6Var2.a(i), l6Var3.a(i)), i);
            i++;
        }
    }

    @Override // defpackage.et0
    public long i(l6 l6Var, l6 l6Var2, l6 l6Var3) {
        int b = l6Var.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            j = Math.max(j, ((m6) this.e).get(i).d(l6Var.a(i), l6Var2.a(i), l6Var3.a(i)));
        }
        return j;
    }

    public ch j() {
        ch chVar = (ch) ((eq) this.g).b();
        if (chVar != null) {
            return chVar;
        }
        z6.m("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public l6 k(long j, l6 l6Var, l6 l6Var2) {
        l6 l6Var3 = (l6) this.g;
        if (l6Var3 == null) {
            l6Var3 = l6Var.c();
            this.g = l6Var3;
        }
        int b = l6Var3.b();
        int i = 0;
        while (true) {
            l6 l6Var4 = (l6) this.g;
            if (i >= b) {
                if (l6Var4 != null) {
                    return l6Var4;
                }
                lw.E("velocityVector");
                throw null;
            }
            if (l6Var4 == null) {
                lw.E("velocityVector");
                throw null;
            }
            t3 t3Var = (t3) this.e;
            l6Var.getClass();
            long j2 = j / 1000000;
            sn a = ((tn) t3Var.f).a(l6Var2.a(i));
            long j3 = a.c;
            l6Var4.e((((Math.signum(a.a) * n4.a(j3 > 0 ? j2 / j3 : 1.0f).b) * a.b) / j3) * 1000.0f, i);
            i++;
        }
    }

    public cu0 l(lb lbVar, String str) {
        cu0 cu0Var;
        boolean isInstance;
        cu0 a;
        synchronized (((ic0) this.h)) {
            try {
                hu0 hu0Var = (hu0) this.e;
                hu0Var.getClass();
                cu0Var = (cu0) hu0Var.a.get(str);
                Class cls = lbVar.a;
                cls.getClass();
                Map map = lb.b;
                map.getClass();
                Integer num = (Integer) map.get(cls);
                if (num != null) {
                    isInstance = lr0.y(num.intValue(), cu0Var);
                } else {
                    if (cls.isPrimitive()) {
                        cls = kw.u(we0.a(cls));
                    }
                    isInstance = cls.isInstance(cu0Var);
                }
                if (isInstance) {
                    fu0 fu0Var = (fu0) this.f;
                    if (fu0Var instanceof vh0) {
                        vh0 vh0Var = (vh0) fu0Var;
                        cu0Var.getClass();
                        zy zyVar = vh0Var.d;
                        if (zyVar != null) {
                            rh0 rh0Var = vh0Var.e;
                            rh0Var.getClass();
                            dx0.f(cu0Var, rh0Var, zyVar);
                        }
                    }
                    cu0Var.getClass();
                } else {
                    v30 v30Var = new v30((ih) this.g);
                    v30Var.a.put(t10.n, str);
                    fu0 fu0Var2 = (fu0) this.f;
                    try {
                        try {
                            a = fu0Var2.c(lbVar, v30Var);
                        } catch (AbstractMethodError unused) {
                            Class cls2 = lbVar.a;
                            cls2.getClass();
                            a = fu0Var2.a(cls2);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class cls3 = lbVar.a;
                        cls3.getClass();
                        a = fu0Var2.b(cls3, v30Var);
                    }
                    cu0Var = a;
                    hu0 hu0Var2 = (hu0) this.e;
                    hu0Var2.getClass();
                    cu0Var.getClass();
                    cu0 cu0Var2 = (cu0) hu0Var2.a.put(str, cu0Var);
                    if (cu0Var2 != null) {
                        cu0Var2.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cu0Var;
    }

    public l20(hu0 hu0Var, fu0 fu0Var, ih ihVar) {
        hu0Var.getClass();
        this.e = hu0Var;
        this.f = fu0Var;
        this.g = ihVar;
        this.h = new ic0(13);
    }

    public /* synthetic */ l20(Object obj) {
        this.e = obj;
    }

    public l20() {
        this.g = new f5(8, this);
    }

    public l20(xn xnVar) {
        this(new t3(26, xnVar));
    }
}
