package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class le0 extends xe {
    public static final cn0 y = nh.d(hb0.h);
    public static final AtomicReference z = new AtomicReference(Boolean.FALSE);
    public final p5 a;
    public final v6 b;
    public final Object c;
    public ww d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public l40 h;
    public final t40 i;
    public final ArrayList j;
    public final ArrayList k;
    public final k40 l;
    public final p2 m;
    public final k40 n;
    public final k40 o;
    public ArrayList p;
    public l40 q;
    public ja r;
    public final cn0 s;
    public boolean t;
    public final cn0 u;
    public final yw v;
    public final tg w;
    public final ic0 x;

    public le0(tg tgVar) {
        p5 p5Var = new p5(new ee0(this, 0));
        this.a = p5Var;
        ee0 ee0Var = new ee0(this, 1);
        v6 v6Var = new v6();
        v6Var.a = new q7(0);
        v6Var.b = new x7();
        v6Var.c = new s2(11, v6Var, ee0Var);
        this.b = v6Var;
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new l40();
        this.i = new t40(new cf[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new k40();
        this.m = new p2(10);
        this.n = new k40();
        this.o = new k40();
        this.s = nh.d(null);
        this.u = nh.d(ge0.g);
        new AtomicReference(dx0.z);
        yw ywVar = new yw((ww) tgVar.j(b2.N));
        ywVar.o(new l(20, this));
        this.v = ywVar;
        this.w = tgVar.g(p5Var).g(ywVar);
        this.x = new ic0(7);
    }

    public static void a(o40 o40Var) {
        try {
            if (o40Var.w() instanceof sl0) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            o40Var.c();
        }
    }

    public static final void j(ArrayList arrayList, le0 le0Var, cf cfVar) {
        arrayList.clear();
        synchronized (le0Var.c) {
            Iterator it = le0Var.k.iterator();
            if (it.hasNext()) {
                ((r30) it.next()).getClass();
                throw null;
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            if (((ge0) this.u.getValue()).compareTo(ge0.i) >= 0) {
                cn0 cn0Var = this.u;
                ge0 ge0Var = ge0.f;
                cn0Var.getClass();
                cn0Var.i(null, ge0Var);
            }
        }
        this.v.b(null);
    }

    public final ha c() {
        cn0 cn0Var = this.u;
        int compareTo = ((ge0) cn0Var.getValue()).compareTo(ge0.f);
        cn0 cn0Var2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        t40 t40Var = this.i;
        if (compareTo > 0) {
            Object value = cn0Var2.getValue();
            ge0 ge0Var = ge0.j;
            ge0 ge0Var2 = ge0.g;
            if (value == null) {
                if (this.d == null) {
                    this.h = new l40();
                    t40Var.g();
                    if (d() || f()) {
                        ge0Var2 = ge0.h;
                    }
                } else {
                    ge0Var2 = (t40Var.g == 0 && !this.h.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !d() && !f() && this.l.e == 0) ? ge0.i : ge0Var;
                }
            }
            cn0Var.i(null, ge0Var2);
            if (ge0Var2 != ge0Var) {
                return null;
            }
            ja jaVar = this.r;
            this.r = null;
            return jaVar;
        }
        List h = h();
        int size = h.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = um.e;
        this.h = new l40();
        t40Var.g();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        ja jaVar2 = this.r;
        if (jaVar2 != null) {
            jaVar2.i(null);
        }
        this.r = null;
        cn0Var2.h(null);
        return null;
    }

    public final boolean d() {
        return !this.t && (((q7) ((x7) this.a.g).c).get() & 134217727) > 0;
    }

    public final boolean e() {
        return this.i.g != 0 || d() || f() || this.l.e != 0;
    }

    public final boolean f() {
        return !this.t && (((q7) ((x7) this.b.b).c).get() & 134217727) > 0;
    }

    public final boolean g() {
        boolean z2;
        synchronized (this.c) {
            if (!this.h.h() && this.i.g == 0 && !d()) {
                z2 = f();
            }
        }
        return z2;
    }

    public final List h() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? um.e : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void i() {
        ha c;
        synchronized (this.c) {
            c = c();
            if (((ge0) this.u.getValue()).compareTo(ge0.f) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (c != null) {
            ((ja) c).resumeWith(fs0.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0139, code lost:
    
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013e, code lost:
    
        if (r4 >= r3) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0148, code lost:
    
        if (((defpackage.k90) r11.get(r4)).f == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014d, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015b, code lost:
    
        if (r9 >= r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015d, code lost:
    
        r12 = (defpackage.k90) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0165, code lost:
    
        if (r12.f != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0167, code lost:
    
        r12 = (defpackage.r30) r12.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016e, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0171, code lost:
    
        r4 = r18.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0173, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0174, code lost:
    
        defpackage.fc.X(r18.k, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0179, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017a, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0188, code lost:
    
        if (r9 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018a, code lost:
    
        r12 = r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0193, code lost:
    
        if (((defpackage.k90) r12).f == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0195, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0198, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019b, code lost:
    
        r11 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List k(List list, l40 l40Var) {
        o40 C;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((r30) obj).getClass();
            Object obj2 = hashMap.get(null);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(null, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            cf cfVar = (cf) entry.getKey();
            List list2 = (List) entry.getValue();
            if (cfVar.x.F) {
                ue.a("Check failed");
            }
            l lVar = new l(19, cfVar);
            c cVar = new c(6, cfVar, l40Var);
            ql0 h = xl0.h();
            o40 o40Var = h instanceof o40 ? (o40) h : null;
            if (o40Var == null || (C = o40Var.C(lVar, cVar)) == null) {
                z6.m("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                ql0 j = C.j();
                try {
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                r30 r30Var = (r30) list2.get(i2);
                                k40 k40Var = this.l;
                                r30Var.getClass();
                                Object a = u30.a(k40Var);
                                arrayList.add(new k90(r30Var, a));
                            }
                            int size3 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    break;
                                }
                                k90 k90Var = (k90) arrayList.get(i3);
                                if (k90Var.f == null) {
                                    p2 p2Var = this.m;
                                    ((r30) k90Var.e).getClass();
                                    if (((k40) p2Var.f).b(null)) {
                                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            k90 k90Var2 = (k90) arrayList.get(i4);
                                            if (k90Var2.f == null) {
                                                p2 p2Var2 = this.m;
                                                ((r30) k90Var2.e).getClass();
                                                k40 k40Var2 = (k40) p2Var2.f;
                                                if (k40Var2.i()) {
                                                    ((k40) p2Var2.g).a();
                                                }
                                            }
                                            arrayList2.add(k90Var2);
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                i3++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size5) {
                            break;
                        }
                        if (((k90) arrayList.get(i5)).f != null) {
                            break;
                        }
                        i5++;
                    }
                    cfVar.m(arrayList);
                    ql0.q(j);
                } catch (Throwable th) {
                    ql0.q(j);
                    throw th;
                }
            } finally {
                a(C);
            }
        }
        return ac.j0(hashMap.keySet());
    }

    public final cf l(cf cfVar, l40 l40Var) {
        l40 l40Var2;
        o40 C;
        if (!cfVar.x.F && cfVar.y != 3 && ((l40Var2 = this.q) == null || !l40Var2.c(cfVar))) {
            l lVar = new l(19, cfVar);
            c cVar = new c(6, cfVar, l40Var);
            ql0 h = xl0.h();
            o40 o40Var = h instanceof o40 ? (o40) h : null;
            if (o40Var == null || (C = o40Var.C(lVar, cVar)) == null) {
                z6.m("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    ql0 j = C.j();
                    if (l40Var != null) {
                        try {
                            if (l40Var.h()) {
                                s2 s2Var = new s2(12, l40Var, cfVar);
                                gr grVar = cfVar.x;
                                if (grVar.F) {
                                    ue.a("Preparing a composition while composing is not supported");
                                }
                                grVar.F = true;
                                try {
                                    s2Var.b();
                                    grVar.F = false;
                                } catch (Throwable th) {
                                    grVar.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            ql0.q(j);
                            throw th2;
                        }
                    }
                    boolean r = cfVar.r();
                    ql0.q(j);
                    if (r) {
                        return cfVar;
                    }
                } finally {
                    a(C);
                }
            }
        }
        return null;
    }

    public final void m(Throwable th, cf cfVar) {
        if (!((Boolean) z.get()).booleanValue() || (th instanceof ee)) {
            synchronized (this.c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                fe0 fe0Var = (fe0) this.s.getValue();
                if (fe0Var != null) {
                    throw fe0Var.a;
                }
                cn0 cn0Var = this.s;
                fe0 fe0Var2 = new fe0(th);
                cn0Var.getClass();
                cn0Var.i(null, fe0Var2);
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.g();
                this.h = new l40();
                this.k.clear();
                this.l.a();
                this.n.a();
                cn0 cn0Var2 = this.s;
                fe0 fe0Var3 = new fe0(th);
                cn0Var2.getClass();
                cn0Var2.i(null, fe0Var3);
                if (cfVar != null) {
                    o(cfVar);
                }
                if (c() != null) {
                    ue.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean n() {
        boolean e;
        synchronized (this.c) {
            if (this.h.g()) {
                return e();
            }
            List h = h();
            ii0 ii0Var = new ii0(this.h);
            this.h = new l40();
            try {
                int size = h.size();
                for (int i = 0; i < size; i++) {
                    ((cf) h.get(i)).s(ii0Var);
                    if (((ge0) this.u.getValue()).compareTo(ge0.f) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (c() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    e = e();
                }
                return e;
            } catch (Throwable th) {
                synchronized (this.c) {
                    l40 l40Var = this.h;
                    int i2 = l40Var.d;
                    Iterator<E> it = ii0Var.iterator();
                    while (it.hasNext()) {
                        l40Var.j(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void o(cf cfVar) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(cfVar)) {
            arrayList.add(cfVar);
        }
        if (this.f.remove(cfVar)) {
            this.g = null;
        }
    }
}
