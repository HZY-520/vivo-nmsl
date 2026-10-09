package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public abstract class op {
    public static final d10 a = new d10(2);
    public static final mp b = new mp(0);

    public static jd a(Context context, List list) {
        Typeface typeface;
        z20.e("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                pp ppVar = (pp) list.get(i);
                if (Build.VERSION.SDK_INT >= 31) {
                    String str = ppVar.e;
                    j20 j20Var = nr0.a;
                    if (str != null && !str.isEmpty()) {
                        typeface = Typeface.create(str, 0);
                        Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                        if (typeface != null && !typeface.equals(create)) {
                            if (typeface != null && nr0.a(typeface) != null) {
                                arrayList.add(new zp[]{new zp(str, ppVar.f)});
                            }
                        }
                    }
                    typeface = null;
                    if (typeface != null) {
                        arrayList.add(new zp[]{new zp(str, ppVar.f)});
                    }
                }
                ProviderInfo b2 = b(context.getPackageManager(), ppVar, context.getResources());
                if (b2 == null) {
                    jd jdVar = new jd();
                    jdVar.e = 1;
                    jdVar.f = Collections.singletonList(null);
                    return jdVar;
                }
                arrayList.add(c(context, ppVar, b2.authority));
            }
            jd jdVar2 = new jd();
            jdVar2.e = 0;
            jdVar2.f = arrayList;
            return jdVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, pp ppVar, Resources resources) {
        mp mpVar = b;
        d10 d10Var = a;
        z20.e("FontProvider.getProvider");
        try {
            List list = ppVar.d;
            String str = ppVar.a;
            String str2 = ppVar.b;
            if (list == null) {
                list = t10.A(resources, 0);
            }
            np npVar = new np();
            npVar.a = str;
            npVar.b = str2;
            npVar.c = list;
            ProviderInfo providerInfo = (ProviderInfo) d10Var.a(npVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, mpVar);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, mpVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    d10Var.b(npVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static zp[] c(Context context, pp ppVar, String str) {
        String[] strArr;
        z20.e("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr2 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                z20.e("ContentQueryWrapper.query");
                try {
                    String str2 = ppVar.f;
                    String str3 = ppVar.c;
                    if (str2 != null) {
                        int length = str2.length();
                        int i = 0;
                        while (i < length) {
                            int codePointAt = str2.codePointAt(i);
                            if (!Character.isWhitespace(codePointAt)) {
                                strArr = new String[]{str3, "VF"};
                                break;
                            }
                            i += Character.charCount(codePointAt);
                        }
                    }
                    strArr = new String[]{str3};
                    String[] strArr3 = strArr;
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr2, "query = ?", strArr3, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        arrayList = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList.add(new zp(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, ppVar.f, i2));
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (zp[]) arrayList.toArray(new zp[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}
