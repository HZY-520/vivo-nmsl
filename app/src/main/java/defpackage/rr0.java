package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class rr0 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final l20 b;
    public volatile int c = 0;

    public rr0(l20 l20Var, int i) {
        this.b = l20Var;
        this.a = i;
    }

    public final int a(int i) {
        h20 b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b.h;
        int i2 = a + b.e;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final h20 b() {
        ThreadLocal threadLocal = d;
        h20 h20Var = (h20) threadLocal.get();
        if (h20Var == null) {
            h20Var = new h20();
            threadLocal.set(h20Var);
        }
        i20 i20Var = (i20) this.b.e;
        int a = i20Var.a(6);
        if (a != 0) {
            int i = a + i20Var.e;
            int i2 = (this.a * 4) + ((ByteBuffer) i20Var.h).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) i20Var.h).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) i20Var.h;
            h20Var.h = byteBuffer;
            if (byteBuffer != null) {
                h20Var.e = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                h20Var.f = i4;
                h20Var.g = ((ByteBuffer) h20Var.h).getShort(i4);
                return h20Var;
            }
            h20Var.e = 0;
            h20Var.f = 0;
            h20Var.g = 0;
        }
        return h20Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        h20 b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? ((ByteBuffer) b.h).getInt(a + b.e) : 0));
        sb.append(", codepoints:");
        h20 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.e;
            i = ((ByteBuffer) b2.h).getInt(((ByteBuffer) b2.h).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
