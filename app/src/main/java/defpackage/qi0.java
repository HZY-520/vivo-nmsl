package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class qi0 implements z80 {
    public final int e;
    public final List f;
    public Float g = null;
    public Float h = null;
    public ki0 i = null;
    public ki0 j = null;

    public qi0(int i, ArrayList arrayList) {
        this.e = i;
        this.f = arrayList;
    }

    @Override // defpackage.z80
    public final boolean p() {
        return this.f.contains(this);
    }
}
