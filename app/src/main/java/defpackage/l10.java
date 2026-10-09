package defpackage;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class l10 {
    public int e;
    public int f;
    public int g;
    public Object h;

    public l10() {
        if (ic0.f == null) {
            ic0.f = new ic0(16);
        }
    }

    public int a(int i) {
        if (i < this.g) {
            return ((ByteBuffer) this.h).getShort(this.f + i);
        }
        return 0;
    }

    public void b() {
        if (((m10) this.h).l != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i = this.e;
            m10 m10Var = (m10) this.h;
            if (i >= m10Var.j || m10Var.g[i] >= 0) {
                return;
            } else {
                this.e = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.e < ((m10) this.h).j;
    }

    public void remove() {
        m10 m10Var = (m10) this.h;
        b();
        if (this.f == -1) {
            z6.m("Call next() before removing element from the iterator.");
            return;
        }
        m10Var.b();
        m10Var.j(this.f);
        this.f = -1;
        this.g = m10Var.l;
    }
}
