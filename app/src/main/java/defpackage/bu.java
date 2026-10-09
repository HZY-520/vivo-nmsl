package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class bu {
    public static final /* synthetic */ int b = 0;
    public final h00 a = h00.g;

    static {
        new bu();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bu) && lw.i(this.a, ((bu) obj).a);
    }

    public final int hashCode() {
        return this.a.e.hashCode() + j2.b(1, j2.b(1, j2.e(true, j2.b(0, Boolean.hashCode(false) * 31, 31), 31), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=false, capitalization=None, autoCorrect=true, keyboardType=Text, imeAction=Default, platformImeOptions=null, hintLocales=" + this.a + ")";
    }
}
