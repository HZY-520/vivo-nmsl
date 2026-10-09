package defpackage;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract /* synthetic */ class j2 {
    public static int a(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int b(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int c(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int d(zp0 zp0Var, int i, int i2) {
        return (zp0Var.hashCode() + i) * i2;
    }

    public static int e(boolean z, int i, int i2) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static id f(String str) {
        cv.c(str);
        return new id();
    }

    public static String g(String str, int i) {
        return str + i;
    }

    public static String h(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String i(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void k(int i, int i2, int i3, int i4, int i5) {
        lr0.b(i);
        lr0.b(i2);
        lr0.b(i3);
        lr0.b(i4);
        lr0.b(i5);
    }

    public static void l(long j, StringBuilder sb, String str) {
        sb.append((Object) gc.h(j));
        sb.append(str);
    }

    public static /* synthetic */ void m(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else {
                if (!(autoCloseable instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void n(Object obj) {
        if (obj == null) {
            return;
        }
        z6.c();
    }
}
