package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import java.util.ArrayList;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ip0 {
    public final View a;

    public ip0(View view, e3 e3Var) {
        new t3(view);
        this.a = view;
        long j = sp0.b;
        int length = new p6("").f.length();
        int i = sp0.c;
        int i2 = (int) (j >> 32);
        int i3 = i2 < 0 ? 0 : i2;
        i3 = i3 > length ? length : i3;
        int i4 = (int) (j & 4294967295L);
        int i5 = i4 >= 0 ? i4 : 0;
        length = i5 <= length ? i5 : length;
        if (i3 != i2 || length != i4) {
            p30.b(i3, length);
        }
        int i6 = bu.b;
        new ArrayList();
        lr0.B(new f5(17, this));
        new CursorAnchorInfo.Builder();
        new Matrix();
    }
}
