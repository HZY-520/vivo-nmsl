package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public class pr0 extends j20 {
    public static int u(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // defpackage.j20
    public final Typeface b(Context context, zp[] zpVarArr) {
        try {
            FontFamily s = s(zpVarArr, context.getContentResolver());
            if (s == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(s);
            FontStyle fontStyle = new FontStyle(400, 0);
            Font font = s.getFont(0);
            int u = u(fontStyle, font.getStyle());
            for (int i = 1; i < s.getSize(); i++) {
                Font font2 = s.getFont(i);
                int u2 = u(fontStyle, font2.getStyle());
                if (u2 < u) {
                    font = font2;
                    u = u2;
                }
            }
            return customFallbackBuilder.setStyle(font.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public final FontFamily s(zp[] zpVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (zp zpVar : zpVarArr) {
            if (Objects.equals(zpVar.a.getScheme(), "systemfont")) {
                font = t(zpVar);
            } else {
                try {
                    Uri uri = zpVar.a;
                    str = zpVar.e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(zpVar.c).setSlant(zpVar.d ? 1 : 0).setTtcIndex(zpVar.b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font t(zp zpVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
