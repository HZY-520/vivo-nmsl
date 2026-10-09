package defpackage;

import com.vivo.cnm.lico.BuildConfig;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class xs0 implements pq {
    public final /* synthetic */ int e;

    public /* synthetic */ xs0(int i) {
        this.e = i;
    }

    @Override // defpackage.pq
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                return new h6(((Float) obj).floatValue());
            case 1:
                return new h6(((Integer) obj).intValue());
            case 2:
                return Integer.valueOf((int) ((h6) obj).a);
            case 3:
                return new h6(((ck) obj).e);
            case 4:
                return new ck(((h6) obj).a);
            case Gates.MAX_WINDOWS /* 5 */:
                ek ekVar = (ek) obj;
                return new i6(Float.intBitsToFloat((int) (ekVar.a >> 32)), Float.intBitsToFloat((int) (4294967295L & ekVar.a)));
            case 6:
                float f = ((i6) obj).a;
                return new ek((Float.floatToRawIntBits(r8.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            case 7:
                hl0 hl0Var = (hl0) obj;
                return new i6(Float.intBitsToFloat((int) (hl0Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & hl0Var.a)));
            case MainActivity.$stable /* 8 */:
                float f2 = ((i6) obj).a;
                return new hl0((Float.floatToRawIntBits(r8.b) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
            case 9:
                s60 s60Var = (s60) obj;
                return new i6(Float.intBitsToFloat((int) (s60Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & s60Var.a)));
            case 10:
                float f3 = ((i6) obj).a;
                return new s60((Float.floatToRawIntBits(r8.b) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
            case 11:
                long j = ((xv) obj).a;
                return new i6((int) (j >> 32), (int) (4294967295L & j));
            case 12:
                i6 i6Var = (i6) obj;
                return new xv((Math.round(i6Var.b) & 4294967295L) | (Math.round(i6Var.a) << 32));
            case 13:
                long j2 = ((ew) obj).a;
                return new i6((int) (j2 >> 32), (int) (4294967295L & j2));
            case 14:
                i6 i6Var2 = (i6) obj;
                int round = Math.round(i6Var2.a);
                if (round < 0) {
                    round = 0;
                }
                return new ew((round << 32) | (4294967295L & (Math.round(i6Var2.b) >= 0 ? r8 : 0)));
            case 15:
                oe0 oe0Var = (oe0) obj;
                return new k6(oe0Var.a, oe0Var.b, oe0Var.c, oe0Var.d);
            case 16:
                k6 k6Var = (k6) obj;
                return new oe0(k6Var.a, k6Var.b, k6Var.c, k6Var.d);
            case BuildConfig.VERSION_CODE /* 17 */:
                return Float.valueOf(((h6) obj).a);
            case 18:
                return ((cw0) obj).l;
            default:
                jw0 jw0Var = (jw0) obj;
                jw0Var.getClass();
                return jw0Var;
        }
    }
}
