package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class uv0 {
    public static final yv0 b;
    public final yv0 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 36 ? new kv0() : i >= 35 ? new jv0() : i >= 34 ? new iv0() : i >= 31 ? new hv0() : i >= 30 ? new gv0() : i >= 29 ? new fv0() : new ev0()).b().a.a().a.b().a.c();
    }

    public uv0(yv0 yv0Var) {
        this.a = yv0Var;
    }

    public yv0 a() {
        return this.a;
    }

    public yv0 b() {
        return this.a;
    }

    public yv0 c() {
        return this.a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv0)) {
            return false;
        }
        uv0 uv0Var = (uv0) obj;
        return r() == uv0Var.r() && q() == uv0Var.q() && Objects.equals(m(), uv0Var.m()) && Objects.equals(k(), uv0Var.k()) && Objects.equals(g(), uv0Var.g());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public qj g() {
        return null;
    }

    public nv h(int i) {
        return nv.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(r()), Boolean.valueOf(q()), m(), k(), g());
    }

    public nv i(int i) {
        if ((i & 8) == 0) {
            return nv.e;
        }
        z6.l("Unable to query the maximum insets for IME");
        return null;
    }

    public nv j() {
        return m();
    }

    public nv k() {
        return nv.e;
    }

    public nv l() {
        return m();
    }

    public nv m() {
        return nv.e;
    }

    public nv n() {
        return m();
    }

    public boolean q() {
        return false;
    }

    public boolean r() {
        return false;
    }

    public boolean s(int i) {
        return true;
    }

    public void p() {
    }

    public void d(View view) {
    }

    public void o(View view) {
    }

    public void t(sj sjVar) {
    }

    public void u(nv[] nvVarArr) {
    }

    public void v(yv0 yv0Var) {
    }

    public void w(nv nvVar) {
    }

    public void x(int i) {
    }

    public void y(Rect[][] rectArr) {
    }

    public void z(Rect[][] rectArr) {
    }
}
