package defpackage;

import android.graphics.Paint;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class zw0 {
    public static final zw0 a = new zw0();

    public final long a(Paint paint) {
        long colorLong;
        int i = gc.g;
        colorLong = paint.getColorLong();
        long j = 63 & colorLong;
        return j < 16 ? colorLong : (colorLong & (-64)) | (j + 1);
    }

    public final void b(Paint paint, int i) {
        paint.setBlendMode(t10.D(i));
    }

    public final void c(Paint paint, long j) {
        int i = (int) (63 & j);
        paint.setColor((i == qc.x.c || i == qc.s.c || i == qc.t.c) ? lr0.M(gc.a(j, qc.e)) : lr0.M(j));
    }
}
