package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class g4 extends pf0 implements tq {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ i4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(i4 i4Var, ng ngVar) {
        super(ngVar);
        this.g = i4Var;
    }

    @Override // defpackage.b8
    public final ng create(Object obj, ng ngVar) {
        g4 g4Var = new g4(this.g, ngVar);
        g4Var.f = obj;
        return g4Var;
    }

    @Override // defpackage.tq
    public final Object invoke(Object obj, Object obj2) {
        return ((g4) create((jo0) obj, (ng) obj2)).invokeSuspend(fs0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if (r14 != r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0039, code lost:
    
        if (r14 == r6) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004e -> B:6:0x0051). Please report as a decompilation issue!!! */
    @Override // defpackage.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jo0 jo0Var;
        Object obj2;
        int i = this.e;
        sc0 sc0Var = sc0.f;
        i4 i4Var = this.g;
        dh dhVar = dh.e;
        if (i == 0) {
            t30.z(obj);
            jo0Var = (jo0) this.f;
            this.f = jo0Var;
            this.e = 1;
            int i2 = to0.a;
            obj = to0.a(jo0Var, sc0Var, this);
        } else if (i == 1) {
            jo0Var = (jo0) this.f;
            t30.z(obj);
        } else {
            if (i != 2) {
                z6.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jo0Var = (jo0) this.f;
            t30.z(obj);
            List list = ((rc0) obj).a;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Object obj3 = list.get(i4);
                if (((vc0) obj3).d) {
                    arrayList.add(obj3);
                }
            }
            int size2 = arrayList.size();
            while (true) {
                if (i3 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i3);
                if (u10.l(((vc0) obj2).a, i4Var.h)) {
                    break;
                }
                i3++;
            }
            vc0 vc0Var = (vc0) obj2;
            if (vc0Var == null) {
                vc0Var = (vc0) ac.a0(arrayList);
            }
            if (vc0Var != null) {
                i4Var.h = vc0Var.a;
                i4Var.b = vc0Var.c;
            }
            if (arrayList.isEmpty()) {
                i4Var.h = -1L;
                return fs0.a;
            }
            this.f = jo0Var;
            this.e = 2;
            obj = jo0Var.b(sc0Var, this);
        }
        vc0 vc0Var2 = (vc0) obj;
        i4Var.h = vc0Var2.a;
        i4Var.b = vc0Var2.c;
        this.f = jo0Var;
        this.e = 2;
        obj = jo0Var.b(sc0Var, this);
    }
}
