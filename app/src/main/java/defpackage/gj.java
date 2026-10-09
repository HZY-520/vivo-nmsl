package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class gj extends RuntimeException {
    public final je e;

    public gj(je jeVar) {
        this.e = jeVar;
        if (jeVar.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = jeVar.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ke keVar = (ke) list.get(i);
            int i3 = keVar.a;
            int i4 = 0;
            while (true) {
                if (i4 >= 9) {
                    i4 = -1;
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                if (keVar.a == 100) {
                    int i5 = i + 2;
                    if (i5 < size && ((ke) list.get(i5)).a == 1000) {
                        break;
                    } else if (!arrayList.isEmpty()) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                } else {
                    arrayList.add(keVar);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            stackTraceElementArr[i6] = new StackTraceElement("$$compose", j2.g("m$", ((ke) arrayList.get(i6)).a), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        je jeVar = this.e;
        if (!jeVar.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        a00 a00Var = new a00(10);
        wf0 wf0Var = new wf0(jeVar.a);
        int a = wf0Var.a();
        for (int i = 0; i < a; i++) {
            ((ke) wf0Var.get(i)).getClass();
        }
        a00Var.f();
        a00Var.g = true;
        if (a00Var.f <= 0) {
            a00Var = a00.h;
        }
        a00Var.getClass();
        wf0 wf0Var2 = new wf0(a00Var);
        int a2 = wf0Var2.a();
        for (int i2 = 0; i2 < a2; i2++) {
            String str = (String) wf0Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
