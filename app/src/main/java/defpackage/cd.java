package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class cd implements tg, Serializable {
    public final tg e;
    public final rg f;

    public cd(rg rgVar, tg tgVar) {
        tgVar.getClass();
        this.e = tgVar;
        this.f = rgVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof cd) {
            cd cdVar = (cd) obj;
            int i = 2;
            cd cdVar2 = cdVar;
            int i2 = 2;
            while (true) {
                tg tgVar = cdVar2.e;
                cdVar2 = tgVar instanceof cd ? (cd) tgVar : null;
                if (cdVar2 == null) {
                    break;
                }
                i2++;
            }
            cd cdVar3 = this;
            while (true) {
                tg tgVar2 = cdVar3.e;
                cdVar3 = tgVar2 instanceof cd ? (cd) tgVar2 : null;
                if (cdVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    rg rgVar = this.f;
                    if (!lw.i(cdVar.j(rgVar.getKey()), rgVar)) {
                        z = false;
                        break;
                    }
                    tg tgVar3 = this.e;
                    if (!(tgVar3 instanceof cd)) {
                        tgVar3.getClass();
                        rg rgVar2 = (rg) tgVar3;
                        z = lw.i(cdVar.j(rgVar2.getKey()), rgVar2);
                        break;
                    }
                    this = (cd) tgVar3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.tg
    public final tg g(tg tgVar) {
        tgVar.getClass();
        return tgVar == sm.e ? this : (tg) tgVar.m(new bd(9), this);
    }

    public final int hashCode() {
        return this.f.hashCode() + this.e.hashCode();
    }

    @Override // defpackage.tg
    public final rg j(sg sgVar) {
        sgVar.getClass();
        while (true) {
            rg j = this.f.j(sgVar);
            if (j != null) {
                return j;
            }
            tg tgVar = this.e;
            if (!(tgVar instanceof cd)) {
                return tgVar.j(sgVar);
            }
            this = (cd) tgVar;
        }
    }

    @Override // defpackage.tg
    public final Object m(tq tqVar, Object obj) {
        return tqVar.invoke(this.e.m(tqVar, obj), this.f);
    }

    @Override // defpackage.tg
    public final tg q(sg sgVar) {
        sgVar.getClass();
        rg rgVar = this.f;
        rg j = rgVar.j(sgVar);
        tg tgVar = this.e;
        if (j != null) {
            return tgVar;
        }
        tg q = tgVar.q(sgVar);
        return q == tgVar ? this : q == sm.e ? rgVar : new cd(rgVar, q);
    }

    public final String toString() {
        return "[" + ((String) m(new bd(0), "")) + ']';
    }
}
