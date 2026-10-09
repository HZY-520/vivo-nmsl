package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class rw0 extends go0 implements tq {
    public n9 e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ContentResolver h;
    public final /* synthetic */ Uri i;
    public final /* synthetic */ sw0 j;
    public final /* synthetic */ o9 k;
    public final /* synthetic */ Context l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw0(ContentResolver contentResolver, Uri uri, sw0 sw0Var, o9 o9Var, Context context, ng ngVar) {
        super(2, ngVar);
        this.h = contentResolver;
        this.i = uri;
        this.j = sw0Var;
        this.k = o9Var;
        this.l = context;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        rw0 rw0Var = new rw0(this.h, this.i, this.j, this.k, this.l, ngVar);
        rw0Var.g = obj;
        return rw0Var;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        return ((rw0) create((bo) obj, (ng) obj2)).invokeSuspend(fs0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r6.d(r7, r10) == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:9:0x0043, B:15:0x0054, B:17:0x005c, B:25:0x002b, B:27:0x003c), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007e -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        bo boVar;
        n9 n9Var;
        bo boVar2;
        n9 n9Var2;
        Object a;
        int i = this.f;
        sw0 sw0Var = this.j;
        ContentResolver contentResolver = this.h;
        dh dhVar = dh.e;
        try {
            if (i == 0) {
                t30.z(obj);
                boVar = (bo) this.g;
                contentResolver.registerContentObserver(this.i, false, sw0Var);
                n9Var = new n9(this.k);
                this.g = boVar;
                this.e = n9Var;
                this.f = 1;
                a = n9Var.a(this);
                if (a != dhVar) {
                }
            } else if (i == 1) {
                n9Var2 = this.e;
                boVar2 = (bo) this.g;
                t30.z(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    z6.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n9Var2 = this.e;
                boVar2 = (bo) this.g;
                t30.z(obj);
                boVar = boVar2;
                n9Var = n9Var2;
                this.g = boVar;
                this.e = n9Var;
                this.f = 1;
                a = n9Var.a(this);
                if (a != dhVar) {
                    return dhVar;
                }
                n9 n9Var3 = n9Var;
                boVar2 = boVar;
                obj = a;
                n9Var2 = n9Var3;
                if (((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(sw0Var);
                    return fs0.a;
                }
                n9Var2.c();
                Context context = this.l;
                k40 k40Var = tw0.a;
                Float f = new Float(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                this.g = boVar2;
                this.e = n9Var2;
                this.f = 2;
            }
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(sw0Var);
            throw th;
        }
    }
}
