package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class np {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np)) {
            return false;
        }
        np npVar = (np) obj;
        return Objects.equals(this.a, npVar.a) && Objects.equals(this.b, npVar.b) && Objects.equals(this.c, npVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
