package com.vivo.cnm.lico;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.widget.Toast;
import defpackage.fs0;
import defpackage.lw;
import defpackage.qf0;
import defpackage.rf0;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ShortcutHelper {
    public static final int $stable = 0;
    public static final ShortcutHelper INSTANCE = new ShortcutHelper();
    public static final String SHORTCUT_ID = "fucwb_workbench";

    private ShortcutHelper() {
    }

    private final void toast(Context context, String str) {
        try {
            Toast.makeText(context, str, 0).show();
        } catch (Throwable unused) {
        }
    }

    public final void create(Context context) {
        Object qf0Var;
        ShortcutManager shortcutManager;
        ShortcutInfo.Builder longLived;
        context.getClass();
        if (isPinned(context)) {
            toast(context, "桌面已经有快捷方式了");
            return;
        }
        try {
            shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (shortcutManager == null) {
            toast(context, "当前系统不支持快捷方式");
            return;
        }
        longLived = new ShortcutInfo.Builder(context, SHORTCUT_ID).setShortLabel("原子工作台").setLongLabel("启动原子工作台").setIcon(Icon.createWithResource(context, R.drawable.workbench_shortcut)).setIntent(new Intent(context, (Class<?>) EntryActivity.class).setAction("android.intent.action.MAIN").addFlags(268468224)).setLongLived(true);
        ShortcutInfo build = longLived.build();
        build.getClass();
        shortcutManager.requestPinShortcut(build, null);
        MLog.INSTANCE.i("Shortcut", "已请求钉住快捷方式 fucwb_workbench");
        qf0Var = fs0.a;
        Throwable a = rf0.a(qf0Var);
        if (a != null) {
            MLog.INSTANCE.e("Shortcut", "创建快捷方式失败", a);
            INSTANCE.toast(context, "创建失败：" + a.getMessage());
        }
    }

    public final boolean isPinned(Context context) {
        Object qf0Var;
        ShortcutManager shortcutManager;
        boolean z;
        context.getClass();
        try {
            shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            z = false;
        } catch (Throwable th) {
            qf0Var = new qf0(th);
        }
        if (shortcutManager == null) {
            return false;
        }
        List<ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
        pinnedShortcuts.getClass();
        if (!pinnedShortcuts.isEmpty()) {
            Iterator<T> it = pinnedShortcuts.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ShortcutInfo shortcutInfo = (ShortcutInfo) it.next();
                if (lw.i(shortcutInfo.getId(), SHORTCUT_ID) && shortcutInfo.isEnabled()) {
                    z = true;
                    break;
                }
            }
        }
        qf0Var = Boolean.valueOf(z);
        Object obj = Boolean.FALSE;
        if (qf0Var instanceof qf0) {
            qf0Var = obj;
        }
        return ((Boolean) qf0Var).booleanValue();
    }
}
