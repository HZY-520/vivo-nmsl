package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class jv {
    public final /* synthetic */ int a;
    public final mt b;
    public final mt c;
    public final mt d;
    public final mt e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public jv(jv[] jvVarArr) {
        final int i = 0;
        this.a = 0;
        this.f = jvVarArr;
        int length = jvVarArr.length;
        final mt[] mtVarArr = new mt[length];
        for (int i2 = 0; i2 < length; i2++) {
            mtVarArr[i2] = ((jv[]) this.f)[i2].b();
        }
        final int i3 = 1;
        this.b = new mt(new tq() { // from class: nt0
            @Override // defpackage.tq
            public final Object invoke(Object obj, Object obj2) {
                float f;
                int i4 = i3;
                mt[] mtVarArr2 = mtVarArr;
                dc0 dc0Var = (dc0) obj;
                float floatValue = ((Float) obj2).floatValue();
                switch (i4) {
                    case 0:
                        f = m20.f(dc0Var, false, mtVarArr2, floatValue);
                        break;
                    default:
                        f = m20.f(dc0Var, true, mtVarArr2, floatValue);
                        break;
                }
                return Float.valueOf(f);
            }
        }, 1);
        int length2 = ((jv[]) this.f).length;
        final mt[] mtVarArr2 = new mt[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            mtVarArr2[i4] = ((jv[]) this.f)[i4].d();
        }
        this.c = new mt(new tq() { // from class: lt
            @Override // defpackage.tq
            public final Object invoke(Object obj, Object obj2) {
                float f;
                int i5 = i3;
                mt[] mtVarArr3 = mtVarArr2;
                dc0 dc0Var = (dc0) obj;
                float floatValue = ((Float) obj2).floatValue();
                switch (i5) {
                    case 0:
                        f = m20.f(dc0Var, false, mtVarArr3, floatValue);
                        break;
                    default:
                        f = m20.f(dc0Var, true, mtVarArr3, floatValue);
                        break;
                }
                return Float.valueOf(f);
            }
        }, 0);
        int length3 = ((jv[]) this.f).length;
        final mt[] mtVarArr3 = new mt[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            mtVarArr3[i5] = ((jv[]) this.f)[i5].c();
        }
        this.d = new mt(new tq() { // from class: nt0
            @Override // defpackage.tq
            public final Object invoke(Object obj, Object obj2) {
                float f;
                int i42 = i;
                mt[] mtVarArr22 = mtVarArr3;
                dc0 dc0Var = (dc0) obj;
                float floatValue = ((Float) obj2).floatValue();
                switch (i42) {
                    case 0:
                        f = m20.f(dc0Var, false, mtVarArr22, floatValue);
                        break;
                    default:
                        f = m20.f(dc0Var, true, mtVarArr22, floatValue);
                        break;
                }
                return Float.valueOf(f);
            }
        }, 1);
        int length4 = ((jv[]) this.f).length;
        final mt[] mtVarArr4 = new mt[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            mtVarArr4[i6] = ((jv[]) this.f)[i6].a();
        }
        this.e = new mt(new tq() { // from class: lt
            @Override // defpackage.tq
            public final Object invoke(Object obj, Object obj2) {
                float f;
                int i52 = i;
                mt[] mtVarArr32 = mtVarArr4;
                dc0 dc0Var = (dc0) obj;
                float floatValue = ((Float) obj2).floatValue();
                switch (i52) {
                    case 0:
                        f = m20.f(dc0Var, false, mtVarArr32, floatValue);
                        break;
                    default:
                        f = m20.f(dc0Var, true, mtVarArr32, floatValue);
                        break;
                }
                return Float.valueOf(f);
            }
        }, 0);
    }

    public final mt a() {
        int i = this.a;
        return this.e;
    }

    public final mt b() {
        int i = this.a;
        return this.b;
    }

    public final mt c() {
        int i = this.a;
        return this.d;
    }

    public final mt d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "innermostOf(");
                int i2 = 0;
                for (jv jvVar : (jv[]) obj) {
                    i2++;
                    if (i2 > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    t30.b(sb, jvVar, null);
                }
                sb.append((CharSequence) ")");
                return sb.toString();
            default:
                return j2.j("RectRulers(", (String) obj, ")");
        }
    }

    public jv(String str) {
        this.a = 1;
        this.f = str;
        this.b = new mt(null, 1);
        this.c = new mt(null, 0);
        this.d = new mt(null, 1);
        this.e = new mt(null, 0);
    }
}
