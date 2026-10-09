package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class mm implements lm {
    public final /* synthetic */ int e;
    public final String f;

    public /* synthetic */ mm(String str, int i) {
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.lm
    public boolean d(CharSequence charSequence, int i, int i2, rr0 rr0Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f)) {
            return true;
        }
        rr0Var.c = (rr0Var.c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.e) {
            case 1:
                return "<" + this.f + '>';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.lm
    public Object a() {
        return this;
    }
}
