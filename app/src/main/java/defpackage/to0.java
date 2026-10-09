package defpackage;

import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class to0 {
    public static final /* synthetic */ int a = 0;

    static {
        new dl(3, null, 2);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(defpackage.jo0 r5, defpackage.sc0 r6, defpackage.b8 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.so0
            if (r0 == 0) goto L13
            r0 = r7
            so0 r0 = (defpackage.so0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            so0 r0 = new so0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.g
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            sc0 r5 = r0.f
            jo0 r6 = r0.e
            defpackage.t30.z(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L45
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.z6.m(r5)
            r5 = 0
            return r5
        L33:
            defpackage.t30.z(r7)
        L36:
            r0.e = r5
            r0.f = r6
            r0.h = r2
            java.lang.Object r7 = r5.b(r6, r0)
            dh r1 = defpackage.dh.e
            if (r7 != r1) goto L45
            return r1
        L45:
            rc0 r7 = (defpackage.rc0) r7
            r1 = 0
            boolean r3 = b(r7, r1)
            if (r3 == 0) goto L36
            java.util.List r5 = r7.a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to0.a(jo0, sc0, b8):java.lang.Object");
    }

    public static boolean b(rc0 rc0Var, boolean z) {
        List list = rc0Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= size) {
                return true;
            }
            vc0 vc0Var = (vc0) list.get(i);
            if (!z) {
                z2 = t30.c(vc0Var);
            } else if (vc0Var.c() || vc0Var.h || !vc0Var.d) {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            i++;
        }
    }
}
