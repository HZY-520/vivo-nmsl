package defpackage;

import com.vivo.cnm.lico.EnterAngleRelaxer;
import com.vivo.cnm.lico.FoldStateForcer;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class zm implements XposedInterface.Hooker {
    public final /* synthetic */ int a;
    public final /* synthetic */ Field b;
    public final /* synthetic */ Field c;

    public /* synthetic */ zm(Field field, Field field2, int i) {
        this.a = i;
        this.b = field;
        this.c = field2;
    }

    public final Object intercept(XposedInterface.Chain chain) {
        Object install$lambda$8;
        Object install$lambda$18$lambda$10;
        int i = this.a;
        Field field = this.c;
        Field field2 = this.b;
        switch (i) {
            case 0:
                install$lambda$8 = EnterAngleRelaxer.install$lambda$8(field2, field, chain);
                return install$lambda$8;
            default:
                install$lambda$18$lambda$10 = FoldStateForcer.install$lambda$18$lambda$10(field2, field, chain);
                return install$lambda$18$lambda$10;
        }
    }
}
