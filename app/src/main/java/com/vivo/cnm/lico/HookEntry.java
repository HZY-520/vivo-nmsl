package com.vivo.cnm.lico;

import defpackage.ln0;
import defpackage.m20;
import defpackage.ph;
import io.github.libxposed.api.XposedModule;
import io.github.libxposed.api.XposedModuleInterface;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class HookEntry extends XposedModule {
    private static final String PKG_SYSTEMUI = "com.android.systemui";
    private final ConcurrentHashMap.KeySetView<String, Boolean> installed = ConcurrentHashMap.newKeySet();
    private volatile String processName = "";
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String PKG_LAUNCHER_VIVO = "com.bbk.launcher2";
    private static final String PKG_LAUNCHER_AOSP = "com.android.launcher3";
    private static final String PKG_RECENTS = "com.vivo.recents";
    private static final String PKG_UPSLIDE = "com.vivo.upslide";
    private static final String PKG_SYSTEMUI_PLUGIN = "com.vivo.systemuiplugin";
    private static final String PKG_SETTINGS = "com.android.settings";
    private static final Set<String> TARGETS = m20.m("com.android.systemui", PKG_LAUNCHER_VIVO, PKG_LAUNCHER_AOSP, PKG_RECENTS, PKG_UPSLIDE, PKG_SYSTEMUI_PLUGIN, PKG_SETTINGS);

    private final boolean isTargetPackage(String str) {
        return str != null && TARGETS.contains(str);
    }

    private final boolean isUiProcess() {
        String str = this.processName;
        return ln0.D(str, "systemui", false) || ln0.D(str, "launcher", false) || ln0.D(str, "recents", false);
    }

    public void onModuleLoaded(XposedModuleInterface.ModuleLoadedParam moduleLoadedParam) {
        moduleLoadedParam.getClass();
        String processName = moduleLoadedParam.getProcessName();
        processName.getClass();
        this.processName = processName;
        try {
            Gates gates = Gates.INSTANCE;
            ClassLoader classLoader = HookEntry.class.getClassLoader();
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            classLoader.getClass();
            gates.installCore(this, classLoader);
        } catch (Throwable unused) {
        }
    }

    public void onPackageLoaded(XposedModuleInterface.PackageLoadedParam packageLoadedParam) {
        packageLoadedParam.getClass();
        if (packageLoadedParam.isFirstPackage()) {
            String packageName = packageLoadedParam.getPackageName();
            packageName.getClass();
            if (isTargetPackage(packageName) && this.installed.add("pkg:".concat(packageName))) {
                ClassLoader defaultClassLoader = packageLoadedParam.getDefaultClassLoader();
                defaultClassLoader.getClass();
                try {
                    Gates gates = Gates.INSTANCE;
                    gates.installCore(this, defaultClassLoader);
                    if (isUiProcess()) {
                        gates.installUi(this, defaultClassLoader);
                        if (packageName.equals("com.android.systemui")) {
                            DesktopEntry.INSTANCE.install(this, defaultClassLoader);
                        }
                        if (packageName.equals(PKG_LAUNCHER_VIVO) || packageName.equals(PKG_LAUNCHER_AOSP)) {
                            LauncherEntryHook.INSTANCE.install(this, defaultClassLoader);
                        }
                    }
                    if (packageName.equals(PKG_SETTINGS)) {
                        gates.hookSettingsDeviceType(this, defaultClassLoader);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void onSystemServerStarting(XposedModuleInterface.SystemServerStartingParam systemServerStartingParam) {
        systemServerStartingParam.getClass();
        if (this.installed.add("system")) {
            try {
                Gates gates = Gates.INSTANCE;
                ClassLoader classLoader = systemServerStartingParam.getClassLoader();
                classLoader.getClass();
                gates.installCore(this, classLoader);
                ClassLoader classLoader2 = systemServerStartingParam.getClassLoader();
                classLoader2.getClass();
                gates.installSystemServer(this, classLoader2);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
    public static final class Companion {
        public /* synthetic */ Companion(ph phVar) {
            this();
        }

        private Companion() {
        }
    }
}
