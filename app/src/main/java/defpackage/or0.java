package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class or0 extends j20 {
    public final Class a;
    public final Constructor b;
    public final Method c;
    public final Method d;
    public final Method e;
    public final Method f;
    public final Method g;

    public or0() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = s(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = t(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.a = cls;
        this.b = constructor;
        this.c = method2;
        this.d = method3;
        this.e = method4;
        this.f = method5;
        this.g = method;
    }

    public static Method s(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public static Method t(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.j20
    public final Typeface b(Context context, zp[] zpVarArr) {
        Object obj;
        boolean z;
        boolean z2;
        if (zpVarArr.length >= 1) {
            Method method = this.c;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (zp zpVar : zpVarArr) {
                        if (zpVar.f == 0) {
                            Uri uri = zpVar.a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, m20.g(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.b.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = zpVarArr.length;
                        int i = 0;
                        boolean z3 = false;
                        while (true) {
                            Method method2 = this.f;
                            if (i < length) {
                                zp zpVar2 = zpVarArr[i];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(zpVar2.a);
                                if (byteBuffer != null) {
                                    try {
                                        z2 = ((Boolean) this.d.invoke(obj, byteBuffer, Integer.valueOf(zpVar2.b), null, Integer.valueOf(zpVar2.c), Integer.valueOf(zpVar2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z3 = true;
                                }
                                i++;
                                z3 = z3;
                            } else if (z3) {
                                try {
                                    z = ((Boolean) this.e.invoke(obj, null)).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused3) {
                                    z = false;
                                }
                                if (z) {
                                    try {
                                        Object newInstance = Array.newInstance((Class<?>) this.a, 1);
                                        Array.set(newInstance, 0, obj);
                                        Typeface typeface = (Typeface) this.g.invoke(null, newInstance, "sans-serif", -1, -1);
                                        if (typeface != null) {
                                            return Typeface.create(typeface, 0);
                                        }
                                    } catch (IllegalAccessException | InvocationTargetException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                            } else {
                                method2.invoke(obj, null);
                            }
                        }
                    }
                } else {
                    int i2 = Integer.MAX_VALUE;
                    zp zpVar3 = null;
                    for (zp zpVar4 : zpVarArr) {
                        int abs = (Math.abs(zpVar4.c - 400) * 2) + (zpVar4.d ? 1 : 0);
                        if (zpVar3 == null || i2 > abs) {
                            zpVar3 = zpVar4;
                            i2 = abs;
                        }
                    }
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(zpVar3.a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(zpVar3.c).setItalic(zpVar3.d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused4) {
            }
        }
        return null;
    }
}
