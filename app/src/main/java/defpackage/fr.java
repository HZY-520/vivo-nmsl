package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class fr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fr(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                gr grVar = (gr) obj;
                grVar.A--;
                break;
            default:
                gm0 gm0Var = (gm0) obj;
                gm0Var.k--;
                break;
        }
    }

    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((gr) obj).A++;
                break;
            default:
                ((gm0) obj).k++;
                break;
        }
    }
}
