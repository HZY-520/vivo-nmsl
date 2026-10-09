package defpackage;

import com.vivo.cnm.lico.Gates;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class v7 implements eq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ v7(gr grVar, ta taVar, kl0 kl0Var, r30 r30Var) {
        this.e = 3;
        this.f = grVar;
        this.g = taVar;
        this.h = kl0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        if (r8.x == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fc, code lost:
    
        r9 = (defpackage.oe0) r8.v.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0205, code lost:
    
        if (r9 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0210, code lost:
    
        if (defpackage.hg.q0(r8, r9, 0, 0, 3) != true) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0212, code lost:
    
        r8.x = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0214, code lost:
    
        r6.e = r8.o0(r5, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021c, code lost:
    
        return r4;
     */
    @Override // defpackage.eq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        int i;
        oe0 oe0Var;
        oe0 f;
        Iterable iterable;
        int i2 = this.e;
        fs0 fs0Var = fs0.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (i2) {
            case 0:
                ((w7) obj3).a();
                q7 q7Var = (q7) ((x7) obj2).c;
                int i3 = ((te0) obj).e;
                do {
                    i = q7Var.get();
                } while (!q7Var.compareAndSet(i, ((i >>> 27) & 15) == i3 ? i - 1 : i));
                return fs0Var;
            case 1:
                a9 a9Var = (a9) obj3;
                oe0 o0 = a9.o0(a9Var, (d60) obj2, (s2) obj);
                if (o0 == null) {
                    return null;
                }
                hg hgVar = a9Var.s;
                if (ew.a(hgVar.y, -1L)) {
                    fv.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return o0.f(hgVar.s0(o0, hgVar.p0(), 0L) ^ (-9223372034707292160L));
            case 2:
                hg hgVar2 = (hg) obj3;
                os0 os0Var = (os0) obj2;
                d9 d9Var = (d9) obj;
                t3 t3Var = hgVar2.w;
                while (true) {
                    t40 t40Var = (t40) t3Var.f;
                    int i4 = t40Var.g;
                    if (i4 == 0) {
                        break;
                    } else {
                        if (i4 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        oe0 oe0Var2 = (oe0) ((eg) t40Var.e[i4 - 1]).a.b();
                        if (!(oe0Var2 == null ? true : hg.q0(hgVar2, oe0Var2, 0L, 0L, 3))) {
                            break;
                        } else {
                            t40 t40Var2 = (t40) t3Var.f;
                            ((eg) t40Var2.j(t40Var2.g - 1)).b.resumeWith(fs0Var);
                        }
                    }
                }
            case 3:
                gr grVar = (gr) obj3;
                ta taVar = (ta) obj2;
                kl0 kl0Var = (kl0) obj;
                te teVar = grVar.L;
                ta taVar2 = teVar.b;
                try {
                    teVar.b = taVar;
                    kl0 kl0Var2 = grVar.G;
                    int[] iArr = grVar.o;
                    y30 y30Var = grVar.v;
                    grVar.o = null;
                    grVar.v = null;
                    try {
                        grVar.G = kl0Var;
                        boolean z = teVar.e;
                        try {
                            teVar.e = false;
                            grVar.y(null, null);
                            teVar.b = taVar2;
                            return fs0Var;
                        } finally {
                            teVar.e = z;
                        }
                    } finally {
                        grVar.G = kl0Var2;
                        grVar.o = iArr;
                        grVar.v = y30Var;
                    }
                } catch (Throwable th) {
                    teVar.b = taVar2;
                    throw th;
                }
            case 4:
                tq tqVar = (tq) obj3;
                mt mtVar = (mt) obj;
                w00 w00Var = (w00) ((ve0) obj2).e;
                k40 k40Var = w00Var.q;
                if (k40Var == null) {
                    long[] jArr = gi0.a;
                    k40Var = new k40();
                    w00Var.q = k40Var;
                }
                Object g = k40Var.g(mtVar);
                if (g == null) {
                    g = new u00(w00Var);
                    k40Var.l(mtVar, g);
                }
                u00 u00Var = (u00) g;
                u00Var.e = false;
                tqVar.invoke(u00Var, mtVar);
                return fs0Var;
            case Gates.MAX_WINDOWS /* 5 */:
                d60 d60Var = (d60) obj2;
                re0 re0Var = (re0) obj;
                uf0 uf0Var = d60.a0;
                ((pq) obj3).invoke(uf0Var);
                boolean i5 = lw.i(d60Var.N, uf0Var.s);
                boolean z2 = d60Var.Q != uf0Var.t;
                v10 a = uf0Var.s.a(uf0Var.v, uf0Var.y, uf0Var.x);
                uf0Var.B = a;
                boolean i6 = lw.i(d60Var.P, a.f());
                re0Var.e = !i6;
                if (!i5 || z2 || !i6) {
                    d60Var.N = uf0Var.s;
                    d60Var.Q = uf0Var.t;
                    v10 v10Var = uf0Var.B;
                    oe0 oe0Var3 = oe0.e;
                    if (v10Var == null || (oe0Var = v10Var.f()) == null) {
                        oe0Var = oe0Var3;
                    }
                    d60Var.P = oe0Var;
                    v10 v10Var2 = uf0Var.B;
                    if (v10Var2 != null && (f = v10Var2.f()) != null) {
                        bw B = lw.B(f);
                        oe0Var3 = new oe0(B.a, B.b, B.c, B.d);
                    }
                    d60Var.O = oe0Var3;
                    if (d60Var.R && (z2 || (d60Var.Q && !i5))) {
                        d60Var.y.z();
                    }
                }
                d60Var.R = true;
                return fs0Var;
            case 6:
                er erVar = (er) obj3;
                ol0 ol0Var = (ol0) obj2;
                n80 n80Var = (n80) obj;
                if (erVar != null) {
                    ol0Var.a(ol0Var.c(erVar) - ol0Var.t);
                }
                List l = lw.l(ol0Var, null, ol0Var.t, null);
                ke keVar = (ke) ac.f0(l);
                Integer num = keVar != null ? keVar.b : null;
                List c = n80Var.c(num);
                if (num != null && !c.isEmpty()) {
                    ke keVar2 = (ke) ac.Z(c);
                    int size = c.size() - 1;
                    if (size <= 0) {
                        iterable = um.e;
                    } else if (size == 1) {
                        iterable = kw.B(ac.e0(c));
                    } else {
                        ArrayList arrayList = new ArrayList(size);
                        if (c instanceof RandomAccess) {
                            int size2 = c.size();
                            for (int i7 = 1; i7 < size2; i7++) {
                                arrayList.add(c.get(i7));
                            }
                        } else {
                            ListIterator listIterator = c.listIterator(1);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        iterable = arrayList;
                    }
                    c = ac.g0(kw.B(new ke(keVar2.a, null, num)), iterable);
                }
                return new je(ac.g0(l, c), n80Var.e());
            default:
                p pVar = (p) obj3;
                pVar.removeOnAttachStateChangeListener((q4) obj2);
                v10.g(pVar).a.remove((z6) obj);
                return fs0Var;
        }
    }

    public /* synthetic */ v7(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
