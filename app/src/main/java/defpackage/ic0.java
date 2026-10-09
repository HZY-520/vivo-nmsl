package defpackage;

import android.graphics.Typeface;
import android.util.Log;
import com.vivo.cnm.lico.Gates;
import com.vivo.cnm.lico.MainActivity;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ic0 implements pc0, od0 {
    public static ic0 f;
    public final /* synthetic */ int e;

    public /* synthetic */ ic0(int i) {
        this.e = i;
    }

    public static Typeface a(String str, xp xpVar, int i) {
        if (i == 0 && lw.i(xpVar, xp.g) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i == 0 && lw.i(xpVar, xp.j) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), xpVar.e, i == 1);
    }

    @Override // defpackage.od0
    public void d() {
        switch (this.e) {
            case 3:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // defpackage.od0
    public void f(int i, Object obj) {
        String str;
        switch (this.e) {
            case 3:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case Gates.MAX_WINDOWS /* 5 */:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case MainActivity.$stable /* 8 */:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }

    public String toString() {
        switch (this.e) {
            case 11:
                return "SharingStarted.Eagerly";
            case 12:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    private final void b() {
    }

    private final void c(int i, Object obj) {
    }
}
