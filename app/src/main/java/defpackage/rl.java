package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import com.vivo.cnm.lico.MainActivity;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class rl implements Runnable {
    public final /* synthetic */ ul e;
    public final /* synthetic */ mo0 f;
    public final /* synthetic */ mo0 g;
    public final /* synthetic */ MainActivity h;
    public final /* synthetic */ View i;

    public /* synthetic */ rl(ul ulVar, mo0 mo0Var, mo0 mo0Var2, MainActivity mainActivity, View view) {
        this.e = ulVar;
        this.f = mo0Var;
        this.g = mo0Var2;
        this.h = mainActivity;
        this.i = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.h.getWindow();
        window.getClass();
        mo0 mo0Var = this.f;
        pq pqVar = mo0Var.c;
        View view = this.i;
        Resources resources = view.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) pqVar.invoke(resources)).booleanValue();
        mo0 mo0Var2 = this.g;
        pq pqVar2 = mo0Var2.c;
        Resources resources2 = view.getResources();
        resources2.getClass();
        this.e.b(mo0Var, mo0Var2, window, view, booleanValue, ((Boolean) pqVar2.invoke(resources2)).booleanValue());
    }
}
