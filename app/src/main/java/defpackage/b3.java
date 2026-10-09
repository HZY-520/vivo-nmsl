package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class b3 extends dr implements eq {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.m = i3;
    }

    @Override // defpackage.eq
    public final Object b() {
        ContentCaptureSession a;
        y50 y50Var;
        int i = this.m;
        int i2 = 3;
        Object obj = this.f;
        switch (i) {
            case 0:
                View view = (View) obj;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    e1.f(view);
                }
                if (i3 < 29 || (a = bg.a(view)) == null) {
                    return null;
                }
                return new p2(i2, a, view);
            case 1:
                po poVar = (po) obj;
                l40 l40Var = poVar.c;
                l40 l40Var2 = poVar.d;
                uo uoVar = poVar.a;
                yo f = uoVar.f();
                if (f == null) {
                    Object[] objArr = l40Var2.b;
                    long[] jArr = l40Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr[i4];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((j & 255) < 128) {
                                        ((a8) objArr[(i4 << 3) + i6]).p0();
                                        throw null;
                                    }
                                    j >>= 8;
                                }
                                if (i5 != 8) {
                                }
                            }
                            if (i4 != length) {
                                i4++;
                            }
                        }
                    }
                } else if (f.r) {
                    if (l40Var.c(f)) {
                        f.u0();
                    }
                    f.t0();
                    if (!f.e.r) {
                        cv.b("visitAncestors called on an unattached node");
                    }
                    t20 t20Var = f.e;
                    iy a0 = nh.a0(f);
                    int i7 = 0;
                    while (a0 != null) {
                        if ((a0.H.f.h & 5120) != 0) {
                            while (t20Var != null) {
                                int i8 = t20Var.g;
                                if ((i8 & 5120) != 0) {
                                    if ((i8 & 1024) != 0) {
                                        i7++;
                                    }
                                    if ((t20Var instanceof a8) && l40Var2.c(t20Var)) {
                                        if (i7 <= 1) {
                                            ((a8) t20Var).p0();
                                            throw null;
                                        }
                                        ((a8) t20Var).p0();
                                        throw null;
                                    }
                                }
                                t20Var = t20Var.i;
                            }
                        }
                        a0 = a0.n();
                        t20Var = (a0 == null || (y50Var = a0.H) == null) ? null : y50Var.e;
                    }
                    Object[] objArr2 = l40Var2.b;
                    long[] jArr2 = l40Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j2 = jArr2[i9];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                for (int i11 = 0; i11 < i10; i11++) {
                                    if ((j2 & 255) < 128) {
                                        ((a8) objArr2[(i9 << 3) + i11]).p0();
                                        throw null;
                                    }
                                    j2 >>= 8;
                                }
                                if (i10 != 8) {
                                }
                            }
                            if (i9 != length2) {
                                i9++;
                            }
                        }
                    }
                }
                if (uoVar.f() == null || uoVar.c.t0() == xo.g) {
                    uoVar.c();
                }
                l40Var.b();
                l40Var2.b();
                poVar.e = false;
                return fs0.a;
            default:
                return Boolean.valueOf(((bp) obj).y.w0(7));
        }
    }
}
