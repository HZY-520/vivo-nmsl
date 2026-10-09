package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import com.vivo.cnm.lico.Gates;
import java.nio.MappedByteBuffer;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01ad, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01b1, code lost:
    
        throw r0;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        int i3 = this.e;
        Object obj = this.f;
        switch (i3) {
            case 0:
                ((p) obj).b();
                return;
            case 1:
                k3 k3Var = (k3) obj;
                Trace.beginSection("Compose:semantics:measureAndLayout");
                try {
                    k3Var.h.r(true);
                    Trace.endSection();
                    Trace.beginSection("Compose:semantics:checkForSemanticsChanges");
                    try {
                        k3Var.f();
                        Trace.endSection();
                        k3Var.M = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 2:
                z3 z3Var = (z3) obj;
                boolean h = z3Var.h();
                e3 e3Var = z3Var.e;
                if (h) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        e3Var.r(true);
                        y30 y30Var = z3Var.n;
                        int[] iArr = y30Var.b;
                        long[] jArr = y30Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    int i6 = 0;
                                    while (i6 < i5) {
                                        if ((255 & j) < 128) {
                                            int i7 = iArr[(i4 << 3) + i6];
                                            if (!z3Var.g().a(i7)) {
                                                i2 = i4;
                                                z3Var.h.add(new zf(i7, z3Var.m, ag.f, null));
                                                z3Var.k.p(fs0.a);
                                                j >>= 8;
                                                i6++;
                                                i4 = i2;
                                            }
                                        }
                                        i2 = i4;
                                        j >>= 8;
                                        i6++;
                                        i4 = i2;
                                    }
                                    int i8 = i4;
                                    if (i5 == 8) {
                                        i = i8;
                                    }
                                } else {
                                    i = i4;
                                }
                                if (i != length) {
                                    i4 = i + 1;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        z3Var.j(e3Var.getSemanticsOwner().a(), z3Var.o);
                        Trace.endSection();
                        z3Var.f(z3Var.g());
                        z3Var.n();
                        z3Var.p = false;
                        return;
                    } finally {
                    }
                }
                return;
            case 3:
                ud udVar = (ud) obj;
                Runnable runnable = udVar.f;
                if (runnable != null) {
                    runnable.run();
                    udVar.f = null;
                    return;
                }
                return;
            case 4:
                qp qpVar = (qp) obj;
                synchronized (qpVar.g) {
                    try {
                        if (qpVar.k == null) {
                            return;
                        }
                        try {
                            zp b = qpVar.b();
                            int i9 = b.f;
                            if (i9 == 2) {
                                synchronized (qpVar.g) {
                                }
                            }
                            if (i9 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i9 + ")");
                            }
                            try {
                                int i10 = uq0.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Context context = qpVar.e;
                                zp[] zpVarArr = {b};
                                j20 j20Var = nr0.a;
                                z20.e("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface b2 = nr0.a.b(context, zpVarArr);
                                    Trace.endSection();
                                    MappedByteBuffer g = m20.g(qpVar.e, b.a);
                                    if (g == null || b2 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        l20 l20Var = new l20(b2, j20.m(g));
                                        Trace.endSection();
                                        synchronized (qpVar.g) {
                                            try {
                                                q3 q3Var = qpVar.k;
                                                if (q3Var != null) {
                                                    q3Var.G(l20Var);
                                                }
                                            } finally {
                                            }
                                        }
                                        qpVar.a();
                                        return;
                                    } finally {
                                        int i11 = uq0.a;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            synchronized (qpVar.g) {
                                try {
                                    q3 q3Var2 = qpVar.k;
                                    if (q3Var2 != null) {
                                        q3Var2.F(th);
                                    }
                                    qpVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case Gates.MAX_WINDOWS /* 5 */:
                ld0 ld0Var = (ld0) obj;
                gz gzVar = ld0Var.j;
                if (ld0Var.f == 0) {
                    ld0Var.g = true;
                    gzVar.e(xy.ON_PAUSE);
                }
                if (ld0Var.e == 0 && ld0Var.g) {
                    gzVar.e(xy.ON_STOP);
                    ld0Var.h = true;
                    return;
                }
                return;
            default:
                fg0.setRippleState$lambda$1((fg0) obj);
                return;
        }
    }
}
