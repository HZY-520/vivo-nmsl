package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class yg0 extends og implements bo {
    public final bo e;
    public final tg f;
    public final int g;
    public tg h;
    public ng i;

    public yg0(bo boVar, tg tgVar) {
        super(gd.g, sm.e);
        this.e = boVar;
        this.f = tgVar;
        this.g = ((Number) tgVar.m(new bd(24), 0)).intValue();
    }

    @Override // defpackage.bo
    public final Object d(Object obj, ng ngVar) {
        try {
            Object e = e(ngVar, obj);
            return e == dh.e ? e : fs0.a;
        } catch (Throwable th) {
            this.h = new bk(ngVar.getContext(), th);
            throw th;
        }
    }

    public final Object e(ng ngVar, Object obj) {
        List list;
        Comparable comparable;
        String str;
        tg context = ngVar.getContext();
        q3.r(context);
        tg tgVar = this.h;
        if (tgVar != context) {
            int i = 0;
            if (tgVar instanceof bk) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((bk) tgVar).f + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                uz uzVar = new uz(str2);
                if (uzVar.hasNext()) {
                    Object next = uzVar.next();
                    if (uzVar.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (uzVar.hasNext()) {
                            arrayList.add(uzVar.next());
                        }
                        list = arrayList;
                    } else {
                        list = kw.B(next);
                    }
                } else {
                    list = um.e;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!ln0.I((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(bc.V(arrayList2));
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i3 = -1;
                            break;
                        }
                        if (!t10.z(str3.charAt(i3))) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 == -1) {
                        i3 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(i3));
                }
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                list.size();
                int size2 = list.size() - 1;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list) {
                    int i4 = i + 1;
                    if (i < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj4;
                    if ((i == 0 || i == size2) && ln0.I(str4)) {
                        str = null;
                    } else {
                        str4.getClass();
                        if (intValue < 0) {
                            z6.d(j2.h("Requested character count ", intValue, " is less than zero."));
                            return null;
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                    }
                    if (str != null) {
                        arrayList4.add(str);
                    }
                    i = i4;
                }
                StringBuilder sb = new StringBuilder(length2);
                ac.c0(arrayList4, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.m(new n(9, this), 0)).intValue() != this.g) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.h = context;
        }
        this.i = ngVar;
        uq uqVar = ah0.a;
        bo boVar = this.e;
        boVar.getClass();
        Object c = uqVar.c(boVar, obj, this);
        if (!lw.i(c, dh.e)) {
            this.i = null;
        }
        return c;
    }

    @Override // defpackage.b8, defpackage.eh
    public final eh getCallerFrame() {
        ng ngVar = this.i;
        if (ngVar instanceof eh) {
            return (eh) ngVar;
        }
        return null;
    }

    @Override // defpackage.og, defpackage.ng
    public final tg getContext() {
        tg tgVar = this.h;
        return tgVar == null ? sm.e : tgVar;
    }

    @Override // defpackage.b8
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.b8
    public final Object invokeSuspend(Object obj) {
        Throwable a = rf0.a(obj);
        if (a != null) {
            this.h = new bk(getContext(), a);
        }
        ng ngVar = this.i;
        if (ngVar != null) {
            ngVar.resumeWith(obj);
        }
        return dh.e;
    }
}
