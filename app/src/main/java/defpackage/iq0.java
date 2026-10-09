package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class iq0 {
    public static final /* synthetic */ long b = p7.a.objectFieldOffset(iq0.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public hn[] a;

    public final void a(hn hnVar) {
        hnVar.d((in) this);
        hn[] hnVarArr = this.a;
        if (hnVarArr == null) {
            hnVarArr = new hn[4];
            this.a = hnVarArr;
        } else if (b() >= hnVarArr.length) {
            hnVarArr = (hn[]) Arrays.copyOf(hnVarArr, b() * 2);
            this.a = hnVarArr;
        }
        int b2 = b();
        p7.a.putIntVolatile(this, b, b2 + 1);
        hnVarArr[b2] = hnVar;
        hnVar.f = b2;
        d(b2);
    }

    public final int b() {
        return p7.a.getIntVolatile(this, b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (r5.compareTo(r6) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hn c(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        p7.a.putIntVolatile(this, b, b() - 1);
        if (i < b()) {
            e(i, b());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                hn hnVar = objArr[i];
                hnVar.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (hnVar.compareTo(obj) < 0) {
                    e(i, i2);
                    d(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= b()) {
                    break;
                }
                Object[] objArr2 = this.a;
                objArr2.getClass();
                int i5 = i3 + 2;
                if (i5 < b()) {
                    Comparable comparable = objArr2[i5];
                    comparable.getClass();
                    Object obj2 = objArr2[i4];
                    obj2.getClass();
                }
                i5 = i4;
                Comparable comparable2 = objArr2[i];
                comparable2.getClass();
                Comparable comparable3 = objArr2[i5];
                comparable3.getClass();
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                e(i, i5);
                i = i5;
            }
        }
        hn hnVar2 = objArr[b()];
        hnVar2.getClass();
        hnVar2.d(null);
        hnVar2.f = -1;
        objArr[b()] = null;
        return hnVar2;
    }

    public final void d(int i) {
        while (i > 0) {
            hn[] hnVarArr = this.a;
            hnVarArr.getClass();
            int i2 = (i - 1) / 2;
            hn hnVar = hnVarArr[i2];
            hnVar.getClass();
            hn hnVar2 = hnVarArr[i];
            hnVar2.getClass();
            if (hnVar.compareTo(hnVar2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        hn[] hnVarArr = this.a;
        hnVarArr.getClass();
        hn hnVar = hnVarArr[i2];
        hnVar.getClass();
        hn hnVar2 = hnVarArr[i];
        hnVar2.getClass();
        hnVarArr[i] = hnVar;
        hnVarArr[i2] = hnVar2;
        hnVar.f = i;
        hnVar2.f = i2;
    }
}
