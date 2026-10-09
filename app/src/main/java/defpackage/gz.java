package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class gz extends zy {
    public mn a;
    public yy b;
    public final WeakReference c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public final cn0 h;

    public gz(ez ezVar) {
        new AtomicReference(null);
        this.a = new mn();
        yy yyVar = yy.f;
        this.b = yyVar;
        this.g = new ArrayList();
        this.c = new WeakReference(ezVar);
        this.h = nh.d(yyVar);
    }

    @Override // defpackage.zy
    public final void a(dz dzVar) {
        cz eiVar;
        fz fzVar;
        ez ezVar;
        dzVar.getClass();
        d("addObserver");
        yy yyVar = this.b;
        yy yyVar2 = yy.e;
        if (yyVar != yyVar2) {
            yyVar2 = yy.f;
        }
        fz fzVar2 = new fz();
        HashMap hashMap = kz.a;
        boolean z = dzVar instanceof cz;
        boolean z2 = dzVar instanceof ci;
        Object obj = null;
        if (z && z2) {
            eiVar = new ei(r6, (ci) dzVar, (cz) dzVar);
        } else if (z2) {
            eiVar = new ei(r6, (ci) dzVar, obj);
        } else if (z) {
            eiVar = (cz) dzVar;
        } else {
            Class<?> cls = dzVar.getClass();
            if (kz.c(cls) == 2) {
                Object obj2 = kz.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    kz.a((Constructor) list.get(0), dzVar);
                    throw null;
                }
                int size = list.size();
                nr[] nrVarArr = new nr[size];
                if (size > 0) {
                    kz.a((Constructor) list.get(0), dzVar);
                    throw null;
                }
                eiVar = new ve(r6, nrVarArr);
            } else {
                eiVar = new ei(dzVar);
            }
        }
        fzVar2.b = eiVar;
        fzVar2.a = yyVar2;
        mn mnVar = this.a;
        HashMap hashMap2 = mnVar.i;
        dh0 dh0Var = (dh0) hashMap2.get(dzVar);
        if (dh0Var != null) {
            fzVar = dh0Var.f;
        } else {
            dh0 dh0Var2 = new dh0(dzVar, fzVar2);
            mnVar.h++;
            dh0 dh0Var3 = mnVar.f;
            if (dh0Var3 == null) {
                mnVar.e = dh0Var2;
                mnVar.f = dh0Var2;
            } else {
                dh0Var3.g = dh0Var2;
                dh0Var2.h = dh0Var3;
                mnVar.f = dh0Var2;
            }
            hashMap2.put(dzVar, dh0Var2);
            fzVar = null;
        }
        if (fzVar == null && (ezVar = (ez) this.c.get()) != null) {
            r6 = (this.d != 0 || this.e) ? 1 : 0;
            yy c = c(dzVar);
            this.d++;
            while (fzVar2.a.compareTo(c) < 0 && this.a.i.containsKey(dzVar)) {
                yy yyVar3 = fzVar2.a;
                ArrayList arrayList = this.g;
                arrayList.add(yyVar3);
                vy vyVar = xy.Companion;
                yy yyVar4 = fzVar2.a;
                vyVar.getClass();
                yyVar4.getClass();
                int ordinal = yyVar4.ordinal();
                xy xyVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : xy.ON_RESUME : xy.ON_START : xy.ON_CREATE;
                if (xyVar == null) {
                    z6.k(fzVar2.a, "no event up from ");
                    return;
                } else {
                    fzVar2.a(ezVar, xyVar);
                    arrayList.remove(arrayList.size() - 1);
                    c = c(dzVar);
                }
            }
            if (r6 == 0) {
                g();
            }
            this.d--;
        }
    }

    @Override // defpackage.zy
    public final void b(dz dzVar) {
        dzVar.getClass();
        d("removeObserver");
        mn mnVar = this.a;
        WeakHashMap weakHashMap = mnVar.g;
        HashMap hashMap = mnVar.i;
        dh0 dh0Var = (dh0) hashMap.get(dzVar);
        if (dh0Var != null) {
            mnVar.h--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((fh0) it.next()).a(dh0Var);
                }
            }
            dh0 dh0Var2 = dh0Var.h;
            dh0 dh0Var3 = dh0Var.g;
            if (dh0Var2 != null) {
                dh0Var2.g = dh0Var3;
            } else {
                mnVar.e = dh0Var3;
            }
            dh0 dh0Var4 = dh0Var.g;
            if (dh0Var4 != null) {
                dh0Var4.h = dh0Var2;
            } else {
                mnVar.f = dh0Var2;
            }
            dh0Var.g = null;
            dh0Var.h = null;
        }
        hashMap.remove(dzVar);
    }

    public final yy c(dz dzVar) {
        HashMap hashMap = this.a.i;
        dh0 dh0Var = hashMap.containsKey(dzVar) ? ((dh0) hashMap.get(dzVar)).h : null;
        yy yyVar = dh0Var != null ? dh0Var.f.a : null;
        ArrayList arrayList = this.g;
        yy yyVar2 = arrayList.isEmpty() ? null : (yy) arrayList.get(arrayList.size() - 1);
        yy yyVar3 = this.b;
        if (yyVar == null || yyVar.compareTo(yyVar3) >= 0) {
            yyVar = yyVar3;
        }
        return (yyVar2 == null || yyVar2.compareTo(yyVar) >= 0) ? yyVar : yyVar2;
    }

    public final void d(String str) {
        y6 y6Var;
        if (y6.a != null) {
            y6Var = y6.a;
        } else {
            synchronized (y6.class) {
                try {
                    if (y6.a == null) {
                        y6 y6Var2 = new y6();
                        Executors.newFixedThreadPool(4, new ji());
                        y6.a = y6Var2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            y6Var = y6.a;
        }
        y6Var.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(j2.j("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void e(xy xyVar) {
        xyVar.getClass();
        d("handleLifecycleEvent");
        f(xyVar.a());
    }

    public final void f(yy yyVar) {
        if (this.b == yyVar) {
            return;
        }
        ez ezVar = (ez) this.c.get();
        yy yyVar2 = this.b;
        yy yyVar3 = yy.f;
        yy yyVar4 = yy.e;
        if (yyVar2 == yyVar3 && yyVar == yyVar4) {
            throw new IllegalStateException(("State must be at least '" + yy.g + "' to be moved to '" + yyVar + "' in component " + ezVar).toString());
        }
        if (yyVar2 == yyVar4 && yyVar2 != yyVar) {
            throw new IllegalStateException(("State is '" + yyVar4 + "' and cannot be moved to `" + yyVar + "` in component " + ezVar).toString());
        }
        this.b = yyVar;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        g();
        this.e = false;
        if (this.b == yyVar4) {
            this.a = new mn();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        r11.f = false;
        r11.h.i(null, r11.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        ez ezVar = (ez) this.c.get();
        if (ezVar == null) {
            z6.m("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            mn mnVar = this.a;
            if (mnVar.h != 0) {
                dh0 dh0Var = mnVar.e;
                dh0Var.getClass();
                yy yyVar = dh0Var.f.a;
                dh0 dh0Var2 = this.a.f;
                dh0Var2.getClass();
                yy yyVar2 = dh0Var2.f.a;
                if (yyVar == yyVar2 && this.b == yyVar2) {
                    break;
                }
                this.f = false;
                yy yyVar3 = this.b;
                dh0 dh0Var3 = this.a.e;
                dh0Var3.getClass();
                int compareTo = yyVar3.compareTo(dh0Var3.f.a);
                ArrayList arrayList = this.g;
                if (compareTo < 0) {
                    mn mnVar2 = this.a;
                    ch0 ch0Var = new ch0(mnVar2.f, mnVar2.e, 1);
                    mnVar2.g.put(ch0Var, Boolean.FALSE);
                    while (ch0Var.hasNext() && !this.f) {
                        Map.Entry entry = (Map.Entry) ch0Var.next();
                        entry.getClass();
                        dz dzVar = (dz) entry.getKey();
                        fz fzVar = (fz) entry.getValue();
                        while (fzVar.a.compareTo(this.b) > 0 && !this.f && this.a.i.containsKey(dzVar)) {
                            vy vyVar = xy.Companion;
                            yy yyVar4 = fzVar.a;
                            vyVar.getClass();
                            yyVar4.getClass();
                            int ordinal = yyVar4.ordinal();
                            xy xyVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : xy.ON_PAUSE : xy.ON_STOP : xy.ON_DESTROY;
                            if (xyVar == null) {
                                z6.k(fzVar.a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(xyVar.a());
                                fzVar.a(ezVar, xyVar);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                dh0 dh0Var4 = this.a.f;
                if (!this.f && dh0Var4 != null && this.b.compareTo(dh0Var4.f.a) > 0) {
                    mn mnVar3 = this.a;
                    eh0 eh0Var = new eh0(mnVar3);
                    mnVar3.g.put(eh0Var, Boolean.FALSE);
                    while (eh0Var.hasNext() && !this.f) {
                        Map.Entry entry2 = (Map.Entry) eh0Var.next();
                        dz dzVar2 = (dz) entry2.getKey();
                        fz fzVar2 = (fz) entry2.getValue();
                        while (fzVar2.a.compareTo(this.b) < 0 && !this.f && this.a.i.containsKey(dzVar2)) {
                            arrayList.add(fzVar2.a);
                            vy vyVar2 = xy.Companion;
                            yy yyVar5 = fzVar2.a;
                            vyVar2.getClass();
                            yyVar5.getClass();
                            int ordinal2 = yyVar5.ordinal();
                            xy xyVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : xy.ON_RESUME : xy.ON_START : xy.ON_CREATE;
                            if (xyVar2 == null) {
                                z6.k(fzVar2.a, "no event up from ");
                                return;
                            } else {
                                fzVar2.a(ezVar, xyVar2);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
