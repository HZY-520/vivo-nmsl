package defpackage;

import java.util.Arrays;

/* loaded from: /tmp/classes.dex */
public abstract class o7 extends lr0 {
    public static void P(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void Q(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void R(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void S(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        P(iArr, iArr2, i, 0, i2);
    }

    public static /* synthetic */ void T(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        R(objArr, objArr2, 0, i, i2);
    }

    public static Object[] U(Object[] objArr, int i, int i2) {
        objArr.getClass();
        int length = objArr.length;
        if (i2 > length) {
            z6.g("toIndex (", i2, ") is greater than size (", length, ").");
            return null;
        }
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static void V(Object[] objArr, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static void W(long[] jArr) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static int X(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static int Y(Object[] objArr, Object obj) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
