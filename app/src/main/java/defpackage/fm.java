package defpackage;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class fm implements ci {
    public final /* synthetic */ zy e;

    public fm(EmojiCompatInitializer emojiCompatInitializer, zy zyVar) {
        this.e = zyVar;
    }

    @Override // defpackage.ci
    public final void c(ez ezVar) {
        of.a(Looper.getMainLooper()).postDelayed(new im(), 500L);
        this.e.b(this);
    }
}
