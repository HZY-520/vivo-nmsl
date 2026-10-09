package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class kf {
    public static final ll a = new ll(new r3(10), 1);
    public static final ll b = new ll(new r3(11), 1);
    public static final ll c = new ll(new r3(16), 1);
    public static final ll d = new ll(new r3(17), 1);
    public static final ll e = new ll(new r3(18), 1);
    public static final ll f = new ll(new r3(19), 1);
    public static final ll g = new ll(new r3(20), 1);
    public static final ll h = new ll(new r3(22), 1);
    public static final ll i = new ll(new r3(23), 1);
    public static final ll j = new ll(new r3(24), 1);
    public static final ll k = new ll(new r3(21), 1);
    public static final ll l = new ll(new r3(25), 1);
    public static final ll m = new ll(new r3(26), 1);
    public static final ll n = new ll(new r3(27), 1);
    public static final ll o = new ll(new r3(28), 1);
    public static final ll p = new ll(new vs0(1), 1);
    public static final ll q = new ll(new hf(0), 1);
    public static final ll r = new ll(new hf(1), 1);
    public static final ll s = new ll(new hf(2), 1);
    public static final ll t = new ll(new r3(12), 1);
    public static final ll u = new ll(new r3(13), 1);
    public static final ll v = new ll(new r3(14), 1);
    public static final ll w = new ll(new r3(15), 1);
    public static final ll x = new ll(new hf(5), 0);

    public static final void a(e3 e3Var, i2 i2Var, be beVar, se seVar, int i2) {
        gr grVar = (gr) seVar;
        grVar.Q(1925803616);
        int i3 = (grVar.e(e3Var) ? 4 : 2) | i2 | (grVar.e(i2Var) ? 32 : 16) | (grVar.g(beVar) ? 256 : 128);
        if (grVar.I(i3 & 1, (i3 & 147) != 146)) {
            xd0 a2 = a.a(e3Var.getAccessibilityManager());
            xd0 a3 = b.a(e3Var.m31getAutofill());
            xd0 a4 = d.a(e3Var.m32getAutofillManager());
            xd0 a5 = c.a(e3Var.getAutofillTree());
            xd0 a6 = e.a(e3Var.getClipboardManager());
            xd0 a7 = f.a(e3Var.getClipboard());
            xd0 a8 = h.a(e3Var.getDensity());
            xd0 a9 = i.a(e3Var.getFocusOwner());
            xd0 a10 = j.a(e3Var.getFontLoader());
            a10.g = false;
            xd0 a11 = k.a(e3Var.getFontFamilyResolver());
            a11.g = false;
            xd0 a12 = l.a(e3Var.getHapticFeedBack());
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object G = grVar.G();
            i2 i2Var2 = re.a;
            if (z || G == i2Var2) {
                G = new w2(e3Var, 4);
                grVar.Y(G);
            }
            xd0 c2 = m.c((pq) G);
            xd0 a13 = n.a(e3Var.getLayoutDirection());
            boolean z2 = i4 == 4;
            Object G2 = grVar.G();
            if (z2 || G2 == i2Var2) {
                G2 = new w2(e3Var, 5);
                grVar.Y(G2);
            }
            xd0 c3 = p.c((pq) G2);
            boolean z3 = i4 == 4;
            Object G3 = grVar.G();
            if (z3 || G3 == i2Var2) {
                G3 = new w2(e3Var, 6);
                grVar.Y(G3);
            }
            xd0 c4 = q.c((pq) G3);
            boolean z4 = i4 == 4;
            Object G4 = grVar.G();
            if (z4 || G4 == i2Var2) {
                G4 = new w2(e3Var, 7);
                grVar.Y(G4);
            }
            xd0 c5 = r.c((pq) G4);
            xd0 a14 = s.a(i2Var);
            xd0 a15 = t.a(e3Var.getViewConfiguration());
            xd0 a16 = u.a(e3Var.getWindowInfo());
            boolean z5 = i4 == 4;
            Object G5 = grVar.G();
            if (z5 || G5 == i2Var2) {
                G5 = new w2(e3Var, 8);
                grVar.Y(G5);
            }
            nh.c(new xd0[]{a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, c2, a13, c3, c4, c5, a14, a15, a16, w.c((pq) G5), g.a(e3Var.getGraphicsContext()), e00.a.a(e3Var.getRetainedValuesStore()), o.a(e3Var.getLocaleList())}, beVar, grVar, ((i3 >> 3) & 112) | 8);
        } else {
            grVar.L();
        }
        de0 q2 = grVar.q();
        if (q2 != null) {
            q2.d = new gf(e3Var, i2Var, beVar, i2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
