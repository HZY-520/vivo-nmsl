package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class o20 {
    public static final String a;
    public static final String b;

    static {
        String str;
        int length = "H".length();
        if (length != 0) {
            int i = 1;
            if (length != 1) {
                StringBuilder sb = new StringBuilder("H".length() * 10);
                while (true) {
                    sb.append((CharSequence) "H");
                    if (i == 10) {
                        break;
                    } else {
                        i++;
                    }
                }
                str = sb.toString();
            } else {
                char charAt = "H".charAt(0);
                char[] cArr = new char[10];
                for (int i2 = 0; i2 < 10; i2++) {
                    cArr[i2] = charAt;
                }
                str = new String(cArr);
            }
        } else {
            str = "";
        }
        a = str;
        b = str + "\n" + str;
    }
}
