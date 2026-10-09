package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.vivo.cnm.lico.MainActivity;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class v6 implements x6 {
    public static volatile v6 d;
    public static final Object e = new Object();
    public Object a;
    public Object b;
    public Object c;

    public v6(int i) {
        switch (i) {
            case 3:
                this.a = new t3(6);
                this.b = new t3(6);
                this.c = new t3(6);
                break;
            case MainActivity.$stable /* 8 */:
                this.a = new AtomicReference(dx0.z);
                this.b = new Object();
                break;
            case 10:
                this.a = new WeakHashMap();
                this.b = new WeakHashMap();
                this.c = new WeakHashMap();
                break;
            default:
                this.c = new ic0(15);
                break;
        }
    }

    public static v6 q(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        v6 v6Var = new v6();
                        v6Var.c = context.getApplicationContext();
                        v6Var.b = new HashSet();
                        v6Var.a = new HashMap();
                        d = v6Var;
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public void A(si siVar) {
        ((oa) this.c).e.a = siVar;
    }

    public void B(xx xxVar) {
        ((oa) this.c).e.b = xxVar;
    }

    public void C(long j) {
        ((oa) this.c).e.d = j;
    }

    public void D() {
        k40 k40Var = (k40) this.a;
        String str = (String) this.b;
        List list = (List) k40Var.j(str);
        if (list != null) {
            list.remove((eq) this.c);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        k40Var.l(str, list);
    }

    @Override // defpackage.x6
    public void a(int i, Object obj) {
        ((iy) this.c).v(i, (iy) obj);
    }

    @Override // defpackage.x6
    public void b(Object obj) {
        ((ArrayList) this.b).add(this.c);
        this.c = obj;
    }

    @Override // defpackage.x6
    public void c() {
        qe0 rectManager;
        l2 m32getAutofillManager;
        qe0 rectManager2;
        iy iyVar = (iy) this.c;
        y50 y50Var = iyVar.H;
        if (!iyVar.B()) {
            cv.a("onReuse is only expected on attached node");
        }
        iyVar.w = false;
        if (iyVar.P) {
            iyVar.P = false;
        } else {
            t20 t20Var = iyVar.H.e;
            for (t20 t20Var2 = t20Var; t20Var2 != null; t20Var2 = t20Var2.i) {
                if (t20Var2.r) {
                    t20Var2.j0();
                }
            }
            for (t20 t20Var3 = t20Var; t20Var3 != null; t20Var3 = t20Var3.i) {
                if (t20Var3.r) {
                    t20Var3.l0();
                }
            }
            while (t20Var != null) {
                if (t20Var.r) {
                    t20Var.f0();
                }
                t20Var = t20Var.i;
            }
        }
        int i = iyVar.f;
        e3 e3Var = iyVar.r;
        if (e3Var != null && (rectManager2 = e3Var.getRectManager()) != null) {
            rectManager2.h(iyVar);
        }
        iyVar.f = rj0.a.addAndGet(1);
        e3 e3Var2 = iyVar.r;
        if (e3Var2 != null) {
            e3Var2.getLayoutNodes().g(i);
            e3Var2.getLayoutNodes().h(iyVar.f, iyVar);
        }
        for (t20 t20Var4 = y50Var.f; t20Var4 != null; t20Var4 = t20Var4.j) {
            t20Var4.e0();
        }
        y50Var.e();
        if (y50Var.c(8)) {
            iyVar.z();
        }
        iy.O(iyVar);
        e3 e3Var3 = iyVar.r;
        if (e3Var3 != null && (m32getAutofillManager = e3Var3.m32getAutofillManager()) != null) {
            e3 e3Var4 = m32getAutofillManager.g;
            p2 p2Var = m32getAutofillManager.e;
            z30 z30Var = m32getAutofillManager.k;
            if (z30Var.e(i)) {
                p2Var.m(e3Var4, i, false);
            }
            qj0 q = iyVar.q();
            if (q != null && q.e.b(yj0.r)) {
                z30Var.a(iyVar.f);
                p2Var.m(e3Var4, iyVar.f, true);
            }
        }
        e3 e3Var5 = iyVar.r;
        if (e3Var5 == null || (rectManager = e3Var5.getRectManager()) == null) {
            return;
        }
        rectManager.g(iyVar);
    }

    @Override // defpackage.x6
    public void d(int i, Object obj) {
    }

    @Override // defpackage.x6
    public void e(int i, int i2, int i3) {
        iy iyVar = (iy) this.c;
        p2 p2Var = iyVar.n;
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            t40 t40Var = (t40) p2Var.f;
            f5 f5Var = (f5) p2Var.g;
            Object j = t40Var.j(i5);
            f5Var.b();
            ((t40) p2Var.f).a(i6, (iy) j);
            f5Var.b();
        }
        iyVar.H();
        iyVar.A();
        iyVar.y();
    }

    @Override // defpackage.x6
    public Object f() {
        return this.c;
    }

    @Override // defpackage.x6
    public void g(int i, int i2) {
        iy iyVar = (iy) this.c;
        p2 p2Var = iyVar.n;
        if (i2 < 0) {
            cv.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            iyVar.E((iy) ((t40) p2Var.f).e[i3]);
            Object j = ((t40) p2Var.f).j(i3);
            ((f5) p2Var.g).b();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    @Override // defpackage.x6
    public void i() {
        this.c = ((ArrayList) this.b).remove(r0.size() - 1);
    }

    public void j(iy iyVar, qw qwVar) {
        t3 t3Var = (t3) this.a;
        t3 t3Var2 = (t3) this.b;
        t3 t3Var3 = (t3) this.c;
        int ordinal = qwVar.ordinal();
        if (ordinal == 0) {
            t3Var.j(iyVar);
            t3Var3.j(iyVar);
            return;
        }
        if (ordinal == 1) {
            t3Var2.j(iyVar);
            t3Var3.j(iyVar);
            return;
        }
        if (ordinal == 2) {
            if (iyVar.l != null) {
                t3Var3.j(iyVar);
                return;
            } else {
                t3Var.j(iyVar);
                return;
            }
        }
        if (ordinal != 3) {
            z6.j();
        } else if (iyVar.l != null) {
            t3Var3.j(iyVar);
        } else {
            t3Var2.j(iyVar);
        }
    }

    public void k() {
        ((ArrayList) this.b).clear();
        this.c = this.a;
        iy iyVar = (iy) this.a;
        p2 p2Var = iyVar.n;
        int i = ((t40) p2Var.f).g;
        while (true) {
            i--;
            t40 t40Var = (t40) p2Var.f;
            if (-1 >= i) {
                t40Var.g();
                ((f5) p2Var.g).b();
                return;
            }
            iyVar.E((iy) t40Var.e[i]);
        }
    }

    public void l(Bundle bundle) {
        HashSet hashSet = (HashSet) this.b;
        String string = ((Context) this.c).getString(2131230722);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (zu.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new id(e2);
            }
        }
    }

    public Object m(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.a;
        if (z20.o()) {
            try {
                z20.e(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                zu zuVar = (zu) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = zuVar.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            m(cls2, hashSet);
                        }
                    }
                }
                obj = zuVar.b((Context) this.c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new id(th);
            }
        }
        return obj;
    }

    public Object n() {
        long c = v10.c();
        if (c == kq0.a) {
            return this.c;
        }
        hq0 hq0Var = (hq0) ((AtomicReference) this.a).get();
        int a = hq0Var.a(c);
        if (a >= 0) {
            return hq0Var.c[a];
        }
        return null;
    }

    public ma o() {
        return ((oa) this.c).e.c;
    }

    public si p() {
        return ((oa) this.c).e.a;
    }

    public xx r() {
        return ((oa) this.c).e.b;
    }

    public long s() {
        return ((oa) this.c).e.d;
    }

    public boolean t(CharSequence charSequence, int i, int i2, rr0 rr0Var) {
        if ((rr0Var.c & 3) == 0) {
            zh zhVar = (zh) this.c;
            h20 b = rr0Var.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.h).getShort(a + b.e);
            }
            zhVar.getClass();
            ThreadLocal threadLocal = zh.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = zhVar.a.hasGlyph(sb.toString());
            int i3 = rr0Var.c & 4;
            rr0Var.c = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (rr0Var.c & 3) == 2;
    }

    public boolean u() {
        return !(((km0) ((t3) this.a).f).isEmpty() && ((km0) ((t3) this.c).f).isEmpty() && ((km0) ((t3) this.b).f).isEmpty());
    }

    public boolean v() {
        if (((zm0) this.a).getValue() != this.c) {
            return true;
        }
        v6 v6Var = (v6) this.b;
        return v6Var != null && v6Var.v();
    }

    public void w() {
        e3 e3Var = ((iy) this.a).r;
        if (e3Var != null) {
            e3Var.s();
        }
    }

    public Object x(CharSequence charSequence, int i, int i2, int i3, boolean z, lm lmVar) {
        int i4;
        char c;
        nm nmVar = new nm((k20) ((l20) this.b).g);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                k20 k20Var = (k20) nmVar.c.a.get(codePointAt);
                if (nmVar.a == 2) {
                    if (k20Var != null) {
                        nmVar.c = k20Var;
                        nmVar.f++;
                    } else {
                        if (codePointAt == 65038) {
                            nmVar.a();
                        } else if (codePointAt != 65039) {
                            k20 k20Var2 = nmVar.c;
                            if (k20Var2.b != null) {
                                if (nmVar.f != 1) {
                                    nmVar.d = k20Var2;
                                    nmVar.a();
                                } else if (nmVar.b()) {
                                    nmVar.d = nmVar.c;
                                    nmVar.a();
                                } else {
                                    nmVar.a();
                                }
                                c = 3;
                            } else {
                                nmVar.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (k20Var == null) {
                    nmVar.a();
                    c = 1;
                } else {
                    nmVar.a = 2;
                    nmVar.c = k20Var;
                    nmVar.f = 1;
                    c = 2;
                }
                nmVar.e = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !t(charSequence, i4, i6, nmVar.d.b)) {
                        z2 = lmVar.d(charSequence, i4, i6, nmVar.d.b);
                        i5++;
                    }
                }
            }
        }
        if (nmVar.a == 2 && nmVar.c.b != null && ((nmVar.f > 1 || nmVar.b()) && i5 < i3 && z2 && (z || !t(charSequence, i4, i6, nmVar.c.b)))) {
            lmVar.d(charSequence, i4, i6, nmVar.c.b);
        }
        return lmVar.a();
    }

    public void y(Object obj) {
        long c = v10.c();
        if (c == kq0.a) {
            this.c = obj;
            return;
        }
        synchronized (this.b) {
            hq0 hq0Var = (hq0) ((AtomicReference) this.a).get();
            int a = hq0Var.a(c);
            if (a < 0) {
                ((AtomicReference) this.a).set(hq0Var.b(c, obj));
            } else {
                hq0Var.c[a] = obj;
            }
        }
    }

    public void z(ma maVar) {
        ((oa) this.c).e.c = maVar;
    }

    public /* synthetic */ v6(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public v6(ur0 ur0Var, v6 v6Var) {
        this.a = ur0Var;
        this.b = v6Var;
        this.c = ur0Var.e;
    }
}
