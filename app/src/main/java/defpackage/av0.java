package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class av0 extends WindowInsetsAnimation$Callback {
    public final uu0 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public av0(uu0 uu0Var) {
        super(uu0Var.f);
        this.d = new HashMap();
        this.a = uu0Var;
    }

    public final dv0 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        dv0 dv0Var = (dv0) hashMap.get(windowInsetsAnimation);
        if (dv0Var != null) {
            return dv0Var;
        }
        dv0 dv0Var2 = new dv0(0, null, 0L);
        dv0Var2.a = new bv0(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, dv0Var2);
        return dv0Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j = a1.j(list.get(size));
            dv0 a = a(j);
            fraction = j.getFraction();
            a.a.e(fraction);
            this.c.add(a);
        }
        return this.a.d(yv0.b(windowInsets, null), this.b).a();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        p2 e = this.a.e(a(windowInsetsAnimation), new p2(bounds));
        e.getClass();
        a1.l();
        return a1.h(((nv) e.f).d(), ((nv) e.g).d());
    }
}
