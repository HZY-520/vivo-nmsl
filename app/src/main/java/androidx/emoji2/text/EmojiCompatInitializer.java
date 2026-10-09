package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.em;
import defpackage.ez;
import defpackage.fm;
import defpackage.rp;
import defpackage.t3;
import defpackage.v6;
import defpackage.zu;
import defpackage.zy;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class EmojiCompatInitializer implements zu {
    @Override // defpackage.zu
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.zu
    public final Object b(Context context) {
        Object obj;
        rp rpVar = new rp(new t3(context));
        rpVar.b = 1;
        if (em.k == null) {
            synchronized (em.j) {
                try {
                    if (em.k == null) {
                        em.k = new em(rpVar);
                    }
                } finally {
                }
            }
        }
        v6 q = v6.q(context);
        q.getClass();
        synchronized (v6.e) {
            try {
                obj = ((HashMap) q.a).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = q.m(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        zy lifecycle = ((ez) obj).getLifecycle();
        lifecycle.a(new fm(this, lifecycle));
        return Boolean.TRUE;
    }
}
