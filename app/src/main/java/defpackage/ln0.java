package defpackage;

/* loaded from: /tmp/classes.dex */
public abstract class ln0 extends sn0 {
    public static boolean D(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (G(2, charSequence, (String) charSequence2, z) >= 0) {
                return true;
            }
        } else if (F(charSequence, charSequence2, 0, charSequence.length(), z) >= 0) {
            return true;
        }
        return false;
    }

    public static final int E(int i, CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        return (z || !(charSequence instanceof String)) ? F(charSequence, str, i, charSequence.length(), z) : ((String) charSequence).indexOf(str, i);
    }

    public static int F(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length();
        if (i2 <= length) {
            length = i2;
        }
        aw awVar = new aw(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i3 = awVar.f;
        if (!z2 || !(charSequence2 instanceof String)) {
            if (i > i3) {
                return -1;
            }
            int i4 = i;
            while (!J(charSequence2, 0, charSequence, i4, charSequence2.length(), z)) {
                if (i4 == i3) {
                    return -1;
                }
                i4++;
            }
            return i4;
        }
        if (i > i3) {
            return -1;
        }
        int i5 = i;
        while (true) {
            String str = (String) charSequence2;
            String str2 = (String) charSequence;
            int length2 = str.length();
            if (!z ? str.regionMatches(0, str2, i5, length2) : str.regionMatches(z, 0, str2, i5, length2)) {
                return i5;
            }
            if (i5 == i3) {
                return -1;
            }
            i5++;
        }
    }

    public static /* synthetic */ int G(int i, CharSequence charSequence, String str, boolean z) {
        if ((i & 4) != 0) {
            z = false;
        }
        return E(0, charSequence, str, z);
    }

    public static int H(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (cArr[0] != charSequence.charAt(i)) {
            if (i == length) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public static boolean I(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!t10.z(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean J(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        int i4;
        char upperCase;
        char upperCase2;
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 >= 0 && i >= 0 && i <= charSequence.length() - i3 && i2 <= charSequence2.length() - i3) {
            for (0; i4 < i3; i4 + 1) {
                char charAt = charSequence.charAt(i + i4);
                char charAt2 = charSequence2.charAt(i2 + i4);
                i4 = (charAt == charAt2 || (z && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) ? i4 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    public static String K(String str, String str2) {
        int G = G(6, str, str2, false);
        return G == -1 ? str : str.substring(str2.length() + G, str.length());
    }

    public static CharSequence L(String str, int i) {
        if (i < 0) {
            z6.d(j2.h("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.subSequence(0, i);
    }
}
