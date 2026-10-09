package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ej {
    public final Executor a;
    public final od0 b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public fj[] g;
    public byte[] h;

    public ej(AssetManager assetManager, Executor executor, od0 od0Var, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = od0Var;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 28:
                case 29:
                case 30:
                    bArr = kw.j;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = kw.i;
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.b.d();
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.a.execute(new Runnable() { // from class: dj
            @Override // java.lang.Runnable
            public final void run() {
                ej.this.b.f(i, serializable);
            }
        });
    }
}
