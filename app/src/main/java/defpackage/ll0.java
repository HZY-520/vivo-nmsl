package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ll0 implements Iterable, fx {
    public int f;
    public int h;
    public int i;
    public boolean k;
    public int l;
    public HashMap n;
    public y30 o;
    public int[] e = new int[0];
    public Object[] g = new Object[0];
    public final Object j = new Object();
    public ArrayList m = new ArrayList();

    public final int a(er erVar) {
        if (this.k) {
            ue.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!erVar.a()) {
            dd0.a("Anchor refers to a group that was removed");
        }
        return erVar.a;
    }

    public final kl0 b() {
        if (this.k) {
            z6.m("Cannot read while a writer is pending");
            return null;
        }
        this.i++;
        return new kl0(this);
    }

    public final ol0 c() {
        if (this.k) {
            ue.a("Cannot start a writer when another writer is pending");
        }
        if (this.i > 0) {
            ue.a("Cannot start a writer when a reader is pending");
        }
        this.k = true;
        this.l++;
        return new ol0(this);
    }

    public final boolean d(er erVar) {
        int c;
        return erVar.a() && (c = nl0.c(this.m, erVar.a, this.f)) >= 0 && lw.i(this.m.get(c), erVar);
    }

    public final ir e(int i) {
        int i2;
        ArrayList arrayList;
        int c;
        HashMap hashMap = this.n;
        if (hashMap != null) {
            if (this.k) {
                ue.a("use active SlotWriter to crate an anchor for location instead");
            }
            er erVar = (i < 0 || i >= (i2 = this.f) || (c = nl0.c((arrayList = this.m), i, i2)) < 0) ? null : (er) arrayList.get(c);
            if (erVar != null) {
                return (ir) hashMap.get(erVar);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new qs(this, 0, this.f);
    }
}
