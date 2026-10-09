package defpackage;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class z40 extends go0 implements tq {
    public d50 e;
    public Object f;
    public gi g;
    public a50 h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ v40 k;
    public final /* synthetic */ a50 l;
    public final /* synthetic */ f m;
    public final /* synthetic */ gi n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z40(v40 v40Var, a50 a50Var, f fVar, gi giVar, ng ngVar) {
        super(2, ngVar);
        this.k = v40Var;
        this.l = a50Var;
        this.m = fVar;
        this.n = giVar;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        z40 z40Var = new z40(this.k, this.l, this.m, this.n, ngVar);
        z40Var.j = obj;
        return z40Var;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        return ((z40) create((ch) obj, (ng) obj2)).invokeSuspend(fs0.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.b8
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
