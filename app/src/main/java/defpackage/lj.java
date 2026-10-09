package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class lj extends nj implements eh, ng {
    public static final /* synthetic */ long l = p7.a.objectFieldOffset(lj.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final vg h;
    public final og i;
    public Object j;
    public final Object k;

    public lj(vg vgVar, og ogVar) {
        super(-1);
        this.h = vgVar;
        this.i = ogVar;
        this.j = dx0.c;
        this.k = kw.P(ogVar.getContext());
    }

    @Override // defpackage.eh
    public final eh getCallerFrame() {
        return this.i;
    }

    @Override // defpackage.ng
    public final tg getContext() {
        return this.i.getContext();
    }

    @Override // defpackage.nj
    public final Object j() {
        Object obj = this.j;
        this.j = dx0.c;
        return obj;
    }

    @Override // defpackage.ng
    public final void resumeWith(Object obj) {
        Throwable a = rf0.a(obj);
        Object hdVar = a == null ? obj : new hd(a, false);
        og ogVar = this.i;
        tg context = ogVar.getContext();
        vg vgVar = this.h;
        if (vgVar.i(context)) {
            this.j = hdVar;
            this.g = 0;
            vgVar.h(ogVar.getContext(), this);
            return;
        }
        en a2 = gq0.a();
        if (a2.g >= 4294967296L) {
            this.j = hdVar;
            this.g = 0;
            a2.u(this);
            return;
        }
        a2.v(true);
        try {
            tg context2 = ogVar.getContext();
            Object R = kw.R(context2, this.k);
            try {
                ogVar.resumeWith(obj);
                while (a2.x()) {
                }
            } finally {
                kw.M(context2, R);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.h + ", " + nh.i0(this.i) + ']';
    }

    @Override // defpackage.nj
    public final ng d() {
        return this;
    }
}
