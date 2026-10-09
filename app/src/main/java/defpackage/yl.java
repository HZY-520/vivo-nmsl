package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class yl extends xl {
    @Override // defpackage.wl, defpackage.ul
    public void b(mo0 mo0Var, mo0 mo0Var2, Window window, View view, boolean z, boolean z2) {
        mo0Var.getClass();
        mo0Var2.getClass();
        window.getClass();
        view.getClass();
        z20.t(window);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof jc)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        int i3 = Build.VERSION.SDK_INT;
        t30 bw0Var = i3 >= 35 ? new bw0(window) : i3 >= 30 ? new aw0(window) : new zv0(window);
        bw0Var.v(!z);
        bw0Var.u(true ^ z2);
    }
}
