package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class rh0 {
    public final th0 a;
    public me0 b;

    public rh0(th0 th0Var) {
        this.a = th0Var;
    }

    public final Bundle a(String str) {
        th0 th0Var = this.a;
        if (!th0Var.g) {
            z6.m("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = th0Var.f;
        if (bundle == null) {
            return null;
        }
        Bundle g = bundle.containsKey(str) ? p30.g(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            th0Var.f = null;
        }
        return g;
    }

    public final qh0 b(String str) {
        qh0 qh0Var;
        th0 th0Var = this.a;
        synchronized (th0Var.c) {
            Iterator it = th0Var.d.entrySet().iterator();
            do {
                qh0Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                qh0 qh0Var2 = (qh0) entry.getValue();
                if (lw.i(str2, str)) {
                    qh0Var = qh0Var2;
                }
            } while (qh0Var == null);
        }
        return qh0Var;
    }

    public final void c(String str, qh0 qh0Var) {
        th0 th0Var = this.a;
        synchronized (th0Var.c) {
            if (th0Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            th0Var.d.put(str, qh0Var);
        }
    }

    public final void d() {
        if (!this.a.h) {
            z6.m("Can not perform this action after onSaveInstanceState");
            return;
        }
        me0 me0Var = this.b;
        if (me0Var == null) {
            me0Var = new me0(this);
        }
        this.b = me0Var;
        try {
            sy.class.getDeclaredConstructor(null);
            me0 me0Var2 = this.b;
            if (me0Var2 != null) {
                me0Var2.a.add(sy.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + sy.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
