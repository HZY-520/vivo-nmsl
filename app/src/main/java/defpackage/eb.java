package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class eb extends CancellationException {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb() {
        super("The coroutine scope left the composition");
        this.e = 1;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.e) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 1:
                setStackTrace(dx0.t);
                break;
            default:
                setStackTrace(lr0.n);
                break;
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eb(String str, int i) {
        super(str);
        this.e = i;
    }
}
