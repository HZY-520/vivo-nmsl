package defpackage;

import android.os.Bundle;
import com.vivo.cnm.lico.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final /* synthetic */ class od implements qh0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ od(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x019e  */
    @Override // defpackage.qh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle a() {
        long j;
        char c;
        long j2;
        long j3;
        k40 k40Var;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        long j4;
        Map map;
        k90[] k90VarArr;
        int i3 = this.a;
        int i4 = 0;
        int i5 = 1;
        Map map2 = vm.e;
        Object obj = this.b;
        switch (i3) {
            case 0:
                return xd.b((MainActivity) obj);
            case 1:
                ih0 ih0Var = (ih0) obj;
                k40 k40Var2 = ih0Var.b;
                if (k40Var2 != null || ih0Var.c != null) {
                    int i6 = k40Var2 != null ? k40Var2.e : 0;
                    k40 k40Var3 = ih0Var.c;
                    HashMap hashMap = new HashMap(i6 + (k40Var3 != null ? k40Var3.e : 0));
                    long j5 = -9187201950435737472L;
                    int i7 = 8;
                    if (k40Var2 != null) {
                        Object[] objArr = k40Var2.b;
                        Object[] objArr2 = k40Var2.c;
                        long[] jArr3 = k40Var2.a;
                        int length = jArr3.length - 2;
                        if (length >= 0) {
                            int i8 = 0;
                            c = 7;
                            j2 = 128;
                            while (true) {
                                long j6 = jArr3[i8];
                                j3 = 255;
                                if ((((~j6) << 7) & j6 & j5) != j5) {
                                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                                    int i10 = 0;
                                    while (i10 < i9) {
                                        if ((j6 & 255) < 128) {
                                            int i11 = (i8 << 3) + i10;
                                            j4 = j5;
                                            hashMap.put((String) objArr[i11], (List) objArr2[i11]);
                                        } else {
                                            j4 = j5;
                                        }
                                        j6 >>= 8;
                                        i10++;
                                        j5 = j4;
                                    }
                                    j = j5;
                                    if (i9 != 8) {
                                    }
                                } else {
                                    j = j5;
                                }
                                if (i8 != length) {
                                    i8++;
                                    j5 = j;
                                }
                            }
                            k40Var = ih0Var.c;
                            if (k40Var != null) {
                                Object[] objArr3 = k40Var.b;
                                Object[] objArr4 = k40Var.c;
                                long[] jArr4 = k40Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i12 = 0;
                                    while (true) {
                                        long j7 = jArr4[i12];
                                        if ((((~j7) << c) & j7 & j) != j) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = i4;
                                            while (i14 < i13) {
                                                if ((j7 & j3) < j2) {
                                                    int i15 = (i12 << 3) + i14;
                                                    Object obj2 = objArr3[i15];
                                                    List list = (List) objArr4[i15];
                                                    String str = (String) obj2;
                                                    i2 = i7;
                                                    if (list.size() == i5) {
                                                        Object b = ((eq) list.get(i4)).b();
                                                        if (b != null) {
                                                            if (!ih0Var.b(b)) {
                                                                throw new IllegalStateException(p30.f(b).toString());
                                                            }
                                                            hashMap.put(str, kw.e(b));
                                                        }
                                                        jArr2 = jArr4;
                                                    } else {
                                                        int size = list.size();
                                                        ArrayList arrayList = new ArrayList(size);
                                                        int i16 = 0;
                                                        while (i16 < size) {
                                                            long[] jArr5 = jArr4;
                                                            Object b2 = ((eq) list.get(i16)).b();
                                                            if (b2 != null && !ih0Var.b(b2)) {
                                                                throw new IllegalStateException(p30.f(b2).toString());
                                                            }
                                                            arrayList.add(b2);
                                                            i16++;
                                                            jArr4 = jArr5;
                                                        }
                                                        jArr2 = jArr4;
                                                        hashMap.put(str, arrayList);
                                                    }
                                                } else {
                                                    jArr2 = jArr4;
                                                    i2 = i7;
                                                }
                                                j7 >>= i2;
                                                i14++;
                                                i7 = i2;
                                                jArr4 = jArr2;
                                                i4 = 0;
                                                i5 = 1;
                                            }
                                            jArr = jArr4;
                                            i = i7;
                                            if (i13 != i) {
                                            }
                                        } else {
                                            jArr = jArr4;
                                            i = i7;
                                        }
                                        if (i12 != length2) {
                                            i12++;
                                            i7 = i;
                                            jArr4 = jArr;
                                            i4 = 0;
                                            i5 = 1;
                                        }
                                    }
                                }
                            }
                            map2 = hashMap;
                        }
                    }
                    j = -9187201950435737472L;
                    c = 7;
                    j2 = 128;
                    j3 = 255;
                    k40Var = ih0Var.c;
                    if (k40Var != null) {
                    }
                    map2 = hashMap;
                }
                Bundle bundle = new Bundle();
                for (Map.Entry entry : map2.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list2 = (List) entry.getValue();
                    bundle.putParcelableArrayList(str2, list2 instanceof ArrayList ? (ArrayList) list2 : new ArrayList<>(list2));
                }
                return bundle;
            default:
                x7 x7Var = (x7) obj;
                LinkedHashMap linkedHashMap = (LinkedHashMap) x7Var.d;
                int size2 = linkedHashMap.size();
                if (size2 == 0) {
                    map = map2;
                } else if (size2 != 1) {
                    map = new LinkedHashMap(linkedHashMap);
                } else {
                    Map.Entry entry2 = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                    map = Collections.singletonMap(entry2.getKey(), entry2.getValue());
                    map.getClass();
                }
                for (Map.Entry entry3 : map.entrySet()) {
                    x7Var.f(((cn0) entry3.getValue()).getValue(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) x7Var.b;
                int size3 = linkedHashMap2.size();
                if (size3 != 0) {
                    if (size3 != 1) {
                        map2 = new LinkedHashMap(linkedHashMap2);
                    } else {
                        Map.Entry entry4 = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                        map2 = Collections.singletonMap(entry4.getKey(), entry4.getValue());
                        map2.getClass();
                    }
                }
                for (Map.Entry entry5 : map2.entrySet()) {
                    x7Var.f(((qh0) entry5.getValue()).a(), (String) entry5.getKey());
                }
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) x7Var.a;
                if (linkedHashMap3.isEmpty()) {
                    k90VarArr = new k90[0];
                } else {
                    ArrayList arrayList2 = new ArrayList(linkedHashMap3.size());
                    for (Map.Entry entry6 : linkedHashMap3.entrySet()) {
                        arrayList2.add(new k90((String) entry6.getKey(), entry6.getValue()));
                    }
                    k90VarArr = (k90[]) arrayList2.toArray(new k90[0]);
                }
                return nh.h((k90[]) Arrays.copyOf(k90VarArr, k90VarArr.length));
        }
    }
}
