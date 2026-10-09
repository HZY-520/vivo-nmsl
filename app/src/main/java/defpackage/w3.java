package defpackage;

import android.util.LongSparseArray;
import com.vivo.cnm.lico.MainActivity;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class w3 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ w3(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                x3.b((z3) obj2, (LongSparseArray) obj);
                break;
            case 1:
                MainActivity mainActivity = (MainActivity) obj2;
                mainActivity.getLifecycle().a(new md(0, (d70) obj, mainActivity));
                break;
            default:
                yw0 yw0Var = (yw0) obj2;
                zy zyVar = (zy) obj;
                if (!yw0Var.g) {
                    yw0Var.h = zyVar;
                    zyVar.a(yw0Var);
                    break;
                }
                break;
        }
    }
}
