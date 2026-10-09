package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class pe {
    public final View a;
    public boolean b;
    public xe c;
    public ez d;
    public uh0 e;
    public iu0 f;
    public final zt g;
    public final nf0 h;
    public final Configuration i;
    public final p40 j;
    public final i2 k;
    public final i2 l;
    public final p2 m;
    public final vb n;
    public final fp o;
    public final p40 p;
    public final vs q;
    public final r5 r;
    public final ky s;
    public final t3 t;
    public final pa u;
    public int v;
    public h5 w;
    public final oe x;

    public pe(pe peVar, View view, xe xeVar, ez ezVar, uh0 uh0Var, iu0 iu0Var) {
        zt ztVar;
        Configuration configuration;
        p40 m;
        i2 i2Var;
        i2 i2Var2;
        p2 p2Var;
        vb i2Var3;
        fp i2Var4;
        p40 w90Var;
        r5 r5Var;
        boolean i = lw.i(peVar != null ? peVar.a.getContext() : null, view.getContext());
        this.a = view;
        this.c = xeVar;
        this.d = ezVar;
        this.e = uh0Var;
        this.f = iu0Var;
        if (i) {
            peVar.getClass();
            ztVar = peVar.g;
        } else {
            ztVar = new zt();
        }
        this.g = ztVar;
        this.h = peVar != null ? peVar.h : new nf0();
        if (i) {
            peVar.getClass();
            configuration = peVar.i;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.i = configuration;
        if (i) {
            peVar.getClass();
            m = peVar.j;
        } else {
            m = p30.m(new Configuration(configuration));
        }
        this.j = m;
        int i2 = 0;
        if (i) {
            peVar.getClass();
            i2Var = peVar.k;
        } else {
            Context context = view.getContext();
            i2Var = new i2(0);
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
        }
        this.k = i2Var;
        if (i) {
            peVar.getClass();
            i2Var2 = peVar.l;
        } else {
            view.getContext();
            i2Var2 = new i2(6);
        }
        this.l = i2Var2;
        if (i) {
            peVar.getClass();
            p2Var = peVar.m;
        } else {
            p2Var = new p2(view.getContext(), i2);
        }
        this.m = p2Var;
        if (i) {
            peVar.getClass();
            i2Var3 = peVar.n;
        } else {
            i2Var3 = new i2(1);
        }
        this.n = i2Var3;
        if (i) {
            peVar.getClass();
            i2Var4 = peVar.o;
        } else {
            view.getContext();
            i2Var4 = new i2(4);
        }
        this.o = i2Var4;
        if (i) {
            peVar.getClass();
            w90Var = peVar.p;
        } else {
            w90Var = new w90(lw.q(view.getContext()), b2.U);
        }
        this.p = w90Var;
        this.q = view == (peVar != null ? peVar.a : null) ? peVar.q : new jc0(view);
        if (i) {
            peVar.getClass();
            r5Var = peVar.r;
        } else {
            r5Var = new r5(ViewConfiguration.get(view.getContext()));
        }
        this.r = r5Var;
        this.s = peVar != null ? peVar.s : new ky();
        this.t = new t3(10);
        this.u = peVar != null ? peVar.u : new pa();
        new f5(2, this);
        this.x = new oe(this);
    }

    public final void a(e3 e3Var, be beVar, se seVar, int i) {
        gr grVar = (gr) seVar;
        grVar.Q(123858079);
        int i2 = (grVar.g(e3Var) ? 4 : 2) | i | (grVar.g(beVar) ? 32 : 16) | (grVar.g(this) ? 256 : 128);
        if (grVar.I(i2 & 1, (i2 & 147) != 146)) {
            Object tag = e3Var.getTag(2131034176);
            Set set = null;
            Set set2 = (!(tag instanceof Set) || ((tag instanceof fx) && !(tag instanceof ix))) ? null : (Set) tag;
            if (set2 == null) {
                Object parent = e3Var.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(2131034176) : null;
                if ((tag2 instanceof Set) && (!(tag2 instanceof fx) || (tag2 instanceof ix))) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                hr hrVar = grVar.R;
                if (hrVar == null) {
                    hrVar = new hr(grVar.h);
                    grVar.R = hrVar;
                }
                set.add(hrVar);
                grVar.q = true;
                grVar.C = true;
                grVar.c.n = new HashMap();
                ll0 ll0Var = grVar.H;
                ll0Var.getClass();
                ll0Var.n = new HashMap();
                ol0 ol0Var = grVar.I;
                ll0 ll0Var2 = ol0Var.a;
                ol0Var.e = ll0Var2.n;
                ol0Var.f = ll0Var2.o;
            }
            boolean e = grVar.e(e3Var.getView());
            Object G = grVar.G();
            i2 i2Var = re.a;
            if (e || G == i2Var) {
                e3Var.getView();
                G = new ju0();
                grVar.Y(G);
            }
            ju0 ju0Var = (ju0) G;
            xd0 a = d00.a.a(d());
            vd0 vd0Var = f00.a;
            g();
            uh0 uh0Var = this.e;
            uh0Var.getClass();
            xd0 a2 = vd0Var.a(uh0Var);
            xd0 a3 = s3.d.a(this.g);
            xd0 a4 = s3.e.a(this.h);
            ll llVar = kf.v;
            boolean g = grVar.g(this);
            Object G2 = grVar.G();
            if (g || G2 == i2Var) {
                G2 = new l(8, this);
                grVar.Y(G2);
            }
            xd0 c = llVar.c((pq) G2);
            xd0 a5 = s3.b.a(e3Var.getContext());
            xd0 a6 = sv.a.a(set);
            xd0 a7 = s3.a.a(e3Var.getConfiguration());
            ll llVar2 = jh0.a;
            boolean g2 = grVar.g(e3Var);
            Object G3 = grVar.G();
            if (g2 || G3 == i2Var) {
                G3 = new w2(e3Var, 2);
                grVar.Y(G3);
            }
            xd0 c2 = llVar2.c((pq) G3);
            xd0 a8 = s3.f.a(e3Var.getView());
            ll llVar3 = kf.x;
            boolean g3 = grVar.g(e3Var);
            Object G4 = grVar.G();
            if (g3 || G4 == i2Var) {
                G4 = new w2(e3Var, 3);
                grVar.Y(G4);
            }
            nh.c(new xd0[]{a, a2, a3, a4, c, a5, a6, a7, c2, a8, llVar3.c((pq) G4), kf.t.a(e3Var.getViewConfiguration()), nt.a.a(ju0Var)}, kw.J(1317454175, new ne(e3Var, this, beVar), grVar), grVar, 56);
        } else {
            grVar.L();
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new ne(this, e3Var, beVar, i);
        }
    }

    public final void b() {
        int i = this.v - 1;
        this.v = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            i = 0;
            this.v = 0;
        }
        if (i == 0) {
            View view = this.a;
            Context context = view.getContext();
            oe oeVar = this.x;
            context.unregisterComponentCallbacks(oeVar);
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(oeVar);
        }
    }

    public final xe c() {
        g();
        xe xeVar = this.c;
        xeVar.getClass();
        return xeVar;
    }

    public final ez d() {
        g();
        ez ezVar = this.d;
        ezVar.getClass();
        return ezVar;
    }

    public final void e() {
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            oe oeVar = this.x;
            context.registerComponentCallbacks(oeVar);
            f(view.getResources().getConfiguration());
            ((w90) this.t.f).setValue(Boolean.valueOf(view.hasWindowFocus()));
            view.getViewTreeObserver().addOnWindowFocusChangeListener(oeVar);
        }
    }

    public final void f(Configuration configuration) {
        int updateFrom = this.i.updateFrom(configuration);
        if (updateFrom != 0) {
            Iterator it = this.g.a.entrySet().iterator();
            while (it.hasNext()) {
                xt xtVar = (xt) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (xtVar == null || Configuration.needNewResources(updateFrom, xtVar.b)) {
                    it.remove();
                }
            }
            this.j.setValue(new Configuration(configuration));
            nf0 nf0Var = this.h;
            synchronized (nf0Var) {
                nf0Var.a.c();
            }
            if ((268435456 & updateFrom) != 0) {
                this.p.setValue(lw.q(this.a.getContext()));
            }
        }
    }

    public final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        xe xeVar = this.c;
        View view = this.a;
        if (xeVar == null) {
            xe a = tw0.a(view);
            if (a == null) {
                Object parent = view.getParent();
                while (a == null && (parent instanceof View)) {
                    View view2 = (View) parent;
                    a = tw0.a(view2);
                    parent = t30.l(view2);
                }
            }
            if (a == null) {
                a = tw0.b(view);
            }
            this.c = a;
        }
        if (this.d == null) {
            ez p = u10.p(view);
            if (p == null) {
                z6.m("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            this.d = p;
        }
        if (this.e == null) {
            uh0 e = v10.e(view);
            if (e == null) {
                z6.m("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return;
            }
            this.e = e;
        }
        if (this.f == null) {
            this.f = j20.d(view);
        }
    }
}
