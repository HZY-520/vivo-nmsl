package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.vivo.cnm.lico.BuildConfig;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class r3 implements eq {
    public final /* synthetic */ int e;

    public /* synthetic */ r3(int i) {
        this.e = i;
    }

    @Override // defpackage.eq
    public final Object b() {
        en enVar;
        tg r;
        Choreographer choreographer;
        switch (this.e) {
            case 0:
                s3.a("LocalConfiguration");
                throw null;
            case 1:
                s3.a("LocalContext");
                throw null;
            case 2:
                s3.a("LocalImageVectorCache");
                throw null;
            case 3:
                s3.a("LocalResourceIdCache");
                throw null;
            case 4:
                s3.a("LocalView");
                throw null;
            case Gates.MAX_WINDOWS /* 5 */:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    fi fiVar = pj.a;
                    ts tsVar = h10.a;
                    tq j5Var = new j5(2, null);
                    Thread currentThread = Thread.currentThread();
                    b2 b2Var = b2.D;
                    vg vgVar = (vg) tsVar.j(b2Var);
                    sm smVar = sm.e;
                    if (vgVar == null) {
                        enVar = gq0.a();
                        r = nh.r(smVar, q3.H(tsVar, enVar), true);
                        fi fiVar2 = pj.a;
                        if (r != fiVar2 && r.j(b2Var) == null) {
                            r = r.g(fiVar2);
                        }
                    } else {
                        enVar = (en) gq0.a.get();
                        r = nh.r(smVar, tsVar, true);
                        fi fiVar3 = pj.a;
                        if (r != fiVar3 && r.j(b2Var) == null) {
                            r = r.g(fiVar3);
                        }
                    }
                    m8 m8Var = new m8(r, currentThread, enVar);
                    m8Var.d0(fh.e, m8Var, j5Var);
                    en enVar2 = m8Var.i;
                    if (enVar2 != null) {
                        int i = en.j;
                        enVar2.v(false);
                    }
                    while (!Thread.interrupted()) {
                        try {
                            long w = enVar2 != null ? enVar2.w() : Long.MAX_VALUE;
                            if (m8Var.J() instanceof fu) {
                                LockSupport.parkNanos(m8Var, w);
                            } else {
                                if (enVar2 != null) {
                                    int i2 = en.j;
                                    enVar2.p(false);
                                }
                                Object G = dx0.G(m8Var.J());
                                hd hdVar = G instanceof hd ? (hd) G : null;
                                if (hdVar != null) {
                                    throw hdVar.a;
                                }
                                choreographer = (Choreographer) G;
                            }
                        } catch (Throwable th) {
                            if (enVar2 != null) {
                                int i3 = en.j;
                                enVar2.p(false);
                            }
                            throw th;
                        }
                    }
                    InterruptedException interruptedException = new InterruptedException();
                    m8Var.x(interruptedException);
                    throw interruptedException;
                }
                m5 m5Var = new m5(choreographer, Handler.createAsync(Looper.getMainLooper()));
                return q3.H(m5Var, m5Var.p);
            case 6:
                return null;
            case 7:
                return mc.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535);
            case MainActivity.$stable /* 8 */:
                return Boolean.TRUE;
            case 9:
            case 10:
            case 11:
                return null;
            case 12:
                kf.b("LocalViewConfiguration");
                throw null;
            case 13:
                kf.b("LocalWindowInfo");
                throw null;
            case 14:
                return new jf();
            case 15:
                return null;
            case 16:
                kf.b("LocalAutofillTree");
                throw null;
            case BuildConfig.VERSION_CODE /* 17 */:
                kf.b("LocalAutofillManager");
                throw null;
            case 18:
                kf.b("LocalClipboardManager");
                throw null;
            case 19:
                kf.b("LocalClipboard");
                throw null;
            case 20:
                kf.b("LocalGraphicsContext");
                throw null;
            case 21:
                kf.b("LocalFontFamilyResolver");
                throw null;
            case 22:
                kf.b("LocalDensity");
                throw null;
            case 23:
                kf.b("LocalFocusManager");
                throw null;
            case 24:
                kf.b("LocalFontLoader");
                throw null;
            case 25:
                kf.b("LocalHapticFeedback");
                throw null;
            case 26:
                kf.b("LocalInputManager");
                throw null;
            case 27:
                kf.b("LocalLayoutDirection");
                throw null;
            default:
                kf.b("LocalProvidableLocaleList");
                throw null;
        }
    }
}
