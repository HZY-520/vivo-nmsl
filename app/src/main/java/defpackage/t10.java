package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Base64;
import android.view.Display;
import android.view.KeyEvent;
import android.view.RoundedCorner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;

/* loaded from: /tmp/classes.dex */
public abstract class t10 {
    public static final mm c;
    public static final mm d;
    public static final mm i;
    public static final float[] a = new float[91];
    public static final qc0 b = new qc0(new nc0());
    public static final double[][] e = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final double[][] f = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final double[] g = {0.2126d, 0.7152d, 0.0722d};
    public static final double[] h = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
    public static final StackTraceElement[] j = new StackTraceElement[0];
    public static final cg0 k = new cg0();
    public static final on l = new on(jj.f);
    public static final on m = new on(jj.g);
    public static final ic0 n = new ic0(18);

    static {
        int i2 = 1;
        c = new mm("REMOVED_TASK", i2);
        d = new mm("CLOSED_EMPTY", i2);
        i = new mm("NO_OWNER", i2);
    }

    public static List A(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static int B(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        z6.l("Cannot round NaN value.");
        return 0;
    }

    public static final u20 C(float f2) {
        return new il0(f2, f2, f2, f2);
    }

    public static final BlendMode D(int i2) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (i2 == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (i2 == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (i2 == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (i2 == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (i2 == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (i2 == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (i2 == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (i2 == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (i2 == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (i2 == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (i2 == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (i2 == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (i2 == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (i2 == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (i2 == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (i2 == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i2 == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (i2 == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i2 == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i2 == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i2 == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i2 == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i2 == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i2 == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i2 == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i2 == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i2 == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i2 == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i2 == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final Bitmap.Config E(int i2) {
        return i2 == 0 ? Bitmap.Config.ARGB_8888 : i2 == 1 ? Bitmap.Config.ALPHA_8 : i2 == 2 ? Bitmap.Config.RGB_565 : i2 == 3 ? Bitmap.Config.RGBA_F16 : i2 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final PorterDuff.Mode F(int i2) {
        return i2 == 0 ? PorterDuff.Mode.CLEAR : i2 == 1 ? PorterDuff.Mode.SRC : i2 == 2 ? PorterDuff.Mode.DST : i2 == 3 ? PorterDuff.Mode.SRC_OVER : i2 == 4 ? PorterDuff.Mode.DST_OVER : i2 == 5 ? PorterDuff.Mode.SRC_IN : i2 == 6 ? PorterDuff.Mode.DST_IN : i2 == 7 ? PorterDuff.Mode.SRC_OUT : i2 == 8 ? PorterDuff.Mode.DST_OUT : i2 == 9 ? PorterDuff.Mode.SRC_ATOP : i2 == 10 ? PorterDuff.Mode.DST_ATOP : i2 == 11 ? PorterDuff.Mode.XOR : i2 == 12 ? PorterDuff.Mode.ADD : i2 == 14 ? PorterDuff.Mode.SCREEN : i2 == 15 ? PorterDuff.Mode.OVERLAY : i2 == 16 ? PorterDuff.Mode.DARKEN : i2 == 17 ? PorterDuff.Mode.LIGHTEN : i2 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static final long G(long j2) {
        return (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
    }

    public static String H(int i2) {
        return i2 == 0 ? "Clear" : i2 == 1 ? "Src" : i2 == 2 ? "Dst" : i2 == 3 ? "SrcOver" : i2 == 4 ? "DstOver" : i2 == 5 ? "SrcIn" : i2 == 6 ? "DstIn" : i2 == 7 ? "SrcOut" : i2 == 8 ? "DstOut" : i2 == 9 ? "SrcAtop" : i2 == 10 ? "DstAtop" : i2 == 11 ? "Xor" : i2 == 12 ? "Plus" : i2 == 13 ? "Modulate" : i2 == 14 ? "Screen" : i2 == 15 ? "Overlay" : i2 == 16 ? "Darken" : i2 == 17 ? "Lighten" : i2 == 18 ? "ColorDodge" : i2 == 19 ? "ColorBurn" : i2 == 20 ? "HardLight" : i2 == 21 ? "Softlight" : i2 == 22 ? "Difference" : i2 == 23 ? "Exclusion" : i2 == 24 ? "Multiply" : i2 == 25 ? "Hue" : i2 == 26 ? "Saturation" : i2 == 27 ? "Color" : i2 == 28 ? "Luminosity" : "Unknown";
    }

    public static double I(double d2) {
        double d3 = d2 / 100.0d;
        return (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static final boolean J(Throwable th, eq eqVar) {
        List asList;
        Object invoke;
        th.getClass();
        Integer num = vw.a;
        gj gjVar = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            asList = Arrays.asList(suppressed);
            asList.getClass();
        } else {
            Method method = kc0.b;
            if (method == null || (invoke = method.invoke(th, null)) == null) {
                asList = um.e;
            } else {
                asList = Arrays.asList((Throwable[]) invoke);
                asList.getClass();
            }
        }
        int size = asList.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Throwable) asList.get(i2)) instanceof gj) {
                return false;
            }
        }
        try {
            je jeVar = (je) eqVar.b();
            if (jeVar != null) {
                boolean z2 = jeVar.b;
                List list = jeVar.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((ke) list.get(i3)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                jeVar.getClass();
                gjVar = new gj(jeVar);
            }
        } catch (Throwable th2) {
            gjVar = th2;
        }
        if (gjVar != null) {
            lw.h(th, gjVar);
        }
        return z;
    }

    public static final mg a(tg tgVar) {
        if (tgVar.j(b2.N) == null) {
            tgVar = tgVar.g(new yw(null));
        }
        return new mg(tgVar);
    }

    public static final void b(final h90 h90Var, final u20 u20Var, j8 j8Var, i2 i2Var, float f2, se seVar, final int i2) {
        final j8 j8Var2;
        final i2 i2Var2;
        final float f3;
        gr grVar = (gr) seVar;
        grVar.Q(1142754848);
        int i3 = i2 | (grVar.g(h90Var) ? 4 : 2) | (grVar.e(u20Var) ? 256 : 128) | 1797120;
        if (grVar.I(i3 & 1, (599187 & i3) != 599186)) {
            j8Var2 = b2.j;
            grVar.P(1899381698);
            grVar.o(false);
            u20 D = kw.D(lw.v(u20Var.c(r20.a), 0.0f, 0L, null, true, 0L, 0L, 1044479), h90Var, 1.0f, null, 2);
            Object G = grVar.G();
            if (G == re.a) {
                G = s8.e;
                grVar.Y(G);
            }
            b20 b20Var = (b20) G;
            int hashCode = Long.hashCode(grVar.Q);
            u20 z = dx0.z(grVar, D);
            xa0 k2 = grVar.k();
            le.c.getClass();
            grVar.R();
            if (grVar.P) {
                grVar.j();
            } else {
                grVar.b0();
            }
            t30.t(grVar, b2.x, b20Var);
            t30.t(grVar, b2.w, k2);
            t30.p(grVar);
            t30.t(grVar, b2.v, z);
            t30.t(grVar, b2.y, Integer.valueOf(hashCode));
            grVar.o(true);
            i2Var2 = ig.a;
            f3 = 1.0f;
        } else {
            grVar.L();
            j8Var2 = j8Var;
            i2Var2 = i2Var;
            f3 = f2;
        }
        de0 q = grVar.q();
        if (q != null) {
            q.d = new tq(u20Var, j8Var2, i2Var2, f3, i2) { // from class: tt
                public final /* synthetic */ u20 f;
                public final /* synthetic */ j8 g;
                public final /* synthetic */ i2 h;
                public final /* synthetic */ float i;

                @Override // defpackage.tq
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int q2 = v10.q(57);
                    t10.b(h90.this, this.f, this.g, this.h, this.i, (se) obj, q2);
                    return fs0.a;
                }
            };
        }
    }

    public static boolean c(double d2, double d3, double d4) {
        return ((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d4 - d2) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static final void d(mg mgVar, x20 x20Var) {
        ww wwVar = (ww) mgVar.e.j(b2.N);
        if (wwVar != null) {
            wwVar.b(x20Var);
        } else {
            z6.e(mgVar, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static void e(int i2) {
        if (2 > i2 || i2 >= 37) {
            throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new aw(2, 36, 1));
        }
    }

    public static double f(double d2) {
        double pow = Math.pow(Math.abs(d2), 0.42d);
        return (((d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1) * 400.0d) * pow) / (pow + 27.13d);
    }

    public static u20 g(u20 u20Var, b40 b40Var, ig0 ig0Var, boolean z, eq eqVar) {
        u20 qeVar;
        if (ig0Var != null) {
            qeVar = new rb(b40Var, ig0Var, false, z, eqVar);
        } else if (ig0Var == null) {
            qeVar = new rb(b40Var, null, false, z, eqVar);
        } else if (b40Var != null) {
            ll llVar = ju.a;
            qeVar = new ku(b40Var, ig0Var).c(new rb(b40Var, null, false, z, eqVar));
        } else {
            qeVar = new qe(new sb(ig0Var, z, eqVar));
        }
        return u20Var.c(qeVar);
    }

    public static u20 h(u20 u20Var, eq eqVar) {
        return u20Var.c(new rb(null, null, true, true, eqVar));
    }

    public static final float i(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final Object j(tq tqVar, ng ngVar) {
        ji0 ji0Var = new ji0(ngVar, ngVar.getContext());
        return z20.u(ji0Var, ji0Var, tqVar);
    }

    public static final u20 k(float f2, float f3) {
        return new ks0(f2, f3);
    }

    public static final boolean l(long j2, long j3) {
        return j2 == j3;
    }

    public static final long m(long j2, boolean z, int i2, float f2) {
        int h2 = ((z || i2 == 2 || i2 == 4 || i2 == 5) && wf.d(j2)) ? wf.h(j2) : Integer.MAX_VALUE;
        if (wf.j(j2) != h2) {
            h2 = t30.g(m20.b(f2), wf.j(j2), h2);
        }
        return lw.t(0, h2, 0, wf.g(j2));
    }

    public static ea n(int i2) {
        cq cqVar = cq.k;
        float D = nh.D((i2 >> 16) & 255);
        float D2 = nh.D((i2 >> 8) & 255);
        float D3 = nh.D(i2 & 255);
        double[][] dArr = nh.e;
        double d2 = D;
        double[] dArr2 = dArr[0];
        double d3 = D2;
        double d4 = D3;
        double d5 = (dArr2[2] * d4) + (dArr2[1] * d3) + (dArr2[0] * d2);
        double[] dArr3 = dArr[1];
        double d6 = (dArr3[2] * d4) + (dArr3[1] * d3) + (dArr3[0] * d2);
        double[] dArr4 = dArr[2];
        float[] fArr = {(float) d5, (float) d6, (float) ((d4 * dArr4[2]) + (d3 * dArr4[1]) + (d2 * dArr4[0]))};
        float[][] fArr2 = nh.b;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0] * f2;
        float f4 = fArr[1];
        float f5 = (fArr3[1] * f4) + f3;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5;
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[2] * f6) + (fArr4[1] * f4) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f9 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + (f2 * fArr5[0]);
        float[] fArr6 = cqVar.g;
        float f10 = cqVar.e;
        float f11 = cqVar.b;
        float f12 = fArr6[0] * f7;
        float f13 = fArr6[1] * f8;
        float f14 = fArr6[2] * f9;
        float f15 = cqVar.h;
        float pow = (float) Math.pow((Math.abs(f12) * f15) / 100.0f, 0.41999998688697815d);
        float pow2 = (float) Math.pow((Math.abs(f13) * f15) / 100.0f, 0.41999998688697815d);
        float pow3 = (float) Math.pow((Math.abs(f14) * f15) / 100.0f, 0.41999998688697815d);
        float signum = ((Math.signum(f12) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f13) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f14) * 400.0f) * pow3) / (pow3 + 27.13f);
        float f16 = ((((-12.0f) * signum2) + (signum * 11.0f)) + signum3) / 11.0f;
        float f17 = ((signum + signum2) - (signum3 * 2.0f)) / 9.0f;
        float f18 = signum2 * 20.0f;
        float f19 = ((21.0f * signum3) + ((signum * 20.0f) + f18)) / 20.0f;
        float f20 = (((signum * 40.0f) + f18) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f21 = atan2;
        float f22 = (f21 * 3.1415927f) / 180.0f;
        float pow4 = ((float) Math.pow((f20 * cqVar.c) / f11, cqVar.j * f10)) * 100.0f;
        float pow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f21) < 20.14d ? 360.0f + f21 : f21) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * cqVar.f) * cqVar.d) * ((float) Math.sqrt((f17 * f17) + (f16 * f16)))) / (f19 + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, cqVar.a)), 0.7300000190734863d)) * ((float) Math.sqrt(pow4 / 100.0f));
        float f23 = cqVar.i * pow5;
        Math.sqrt((r2 * f10) / (f11 + 4.0f));
        float f24 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f23 * 0.0228f) + 1.0f)) * 43.85965f;
        double d7 = f22;
        return new ea(f21, pow5, pow4, f24, log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }

    public static ea o(float f2, float f3, float f4) {
        float f5 = cq.k.i * f3;
        Math.sqrt(((f3 / ((float) Math.sqrt(f2 / 100.0d))) * r0.e) / (r0.b + 4.0f));
        float f6 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((f5 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f4) / 180.0f;
        return new ea(f4, f3, f2, f6, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static final y00 p(y00 y00Var) {
        iy iyVar = y00Var.y.y;
        while (true) {
            iy n2 = iyVar.n();
            iy iyVar2 = null;
            if ((n2 != null ? n2.l : null) == null) {
                y00 y0 = iyVar.H.d.y0();
                y0.getClass();
                return y0;
            }
            iy n3 = iyVar.n();
            if (n3 != null) {
                iyVar2 = n3.l;
            }
            iyVar2.getClass();
            iy n4 = iyVar.n();
            n4.getClass();
            iyVar = n4.l;
            iyVar.getClass();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static og0 q(Display display, int i2) {
        RoundedCorner roundedCorner;
        int position;
        int i3;
        int radius;
        Point center;
        if (Build.VERSION.SDK_INT < 31 || roundedCorner == null) {
            return null;
        }
        position = roundedCorner.getPosition();
        if (position != 0) {
            i3 = 1;
            if (position != 1) {
                i3 = 2;
                if (position != 2) {
                    i3 = 3;
                    if (position != 3) {
                        z6.l(j2.g("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i3 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new og0(i3, radius, center);
    }

    public static final int r(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final u20 s(u20 u20Var, float f2) {
        return u20Var.c(new il0(Float.NaN, f2, Float.NaN, f2));
    }

    public static double t(double[] dArr) {
        double d2 = dArr[0];
        double[][] dArr2 = e;
        double[] dArr3 = dArr2[0];
        double d3 = dArr3[0] * d2;
        double d4 = dArr[1];
        double d5 = (dArr3[1] * d4) + d3;
        double d6 = dArr[2];
        double d7 = (dArr3[2] * d6) + d5;
        double[] dArr4 = dArr2[1];
        double d8 = (dArr4[2] * d6) + (dArr4[1] * d4) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        double d9 = (d6 * dArr5[2]) + (d4 * dArr5[1]) + (d2 * dArr5[0]);
        double f2 = f(d7);
        double f3 = f(d8);
        double f4 = f(d9);
        return Math.atan2(((f2 + f3) - (f4 * 2.0d)) / 9.0d, ((((-12.0d) * f3) + (f2 * 11.0d)) + f4) / 11.0d);
    }

    public static final int u(n7 n7Var, Object obj, int i2) {
        int i3 = n7Var.g;
        if (i3 == 0) {
            return -1;
        }
        try {
            int j2 = lw.j(n7Var.e, i3, i2);
            if (j2 < 0 || lw.i(obj, n7Var.f[j2])) {
                return j2;
            }
            int i4 = j2 + 1;
            while (i4 < i3 && n7Var.e[i4] == i2) {
                if (lw.i(obj, n7Var.f[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = j2 - 1; i5 >= 0 && n7Var.e[i5] == i2; i5--) {
                if (lw.i(obj, n7Var.f[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static double v(double d2) {
        double abs = Math.abs(d2);
        return Math.pow(Math.max(0.0d, (27.13d * abs) / (400.0d - abs)), 2.380952380952381d) * (d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1);
    }

    public static final void w(gr grVar, tq tqVar) {
        lr0.e(2, tqVar);
        tqVar.invoke(grVar, 1);
    }

    public static boolean x(double d2) {
        return 0.0d <= d2 && d2 <= 100.0d;
    }

    public static final boolean y(KeyEvent keyEvent) {
        long b2 = lr0.b(keyEvent.getKeyCode());
        return lx.a(b2, lx.h) || lx.a(b2, lx.k) || lx.a(b2, lx.o) || lx.a(b2, lx.j);
    }

    public static boolean z(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }
}
