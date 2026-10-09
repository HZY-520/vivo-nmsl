package com.vivo.cnm.lico;

import defpackage.ph;

/* compiled from: r8-map-id-55bc5e14ca4f0ce1fb1e9e77cc19bf795986c6a69e3d49814dc3ca7768ce79b2 */
/* loaded from: /tmp/classes.dex */
public final class ModuleStatus {
    public static final int $stable = 0;
    private final boolean injected;
    private final int pid;

    public /* synthetic */ ModuleStatus(boolean z, int i, int i2, ph phVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? -1 : i);
    }

    public static /* synthetic */ ModuleStatus copy$default(ModuleStatus moduleStatus, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = moduleStatus.injected;
        }
        if ((i2 & 2) != 0) {
            i = moduleStatus.pid;
        }
        return moduleStatus.copy(z, i);
    }

    public final boolean component1() {
        return this.injected;
    }

    public final int component2() {
        return this.pid;
    }

    public final ModuleStatus copy(boolean z, int i) {
        return new ModuleStatus(z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleStatus)) {
            return false;
        }
        ModuleStatus moduleStatus = (ModuleStatus) obj;
        return this.injected == moduleStatus.injected && this.pid == moduleStatus.pid;
    }

    public final boolean getInjected() {
        return this.injected;
    }

    public final int getPid() {
        return this.pid;
    }

    public int hashCode() {
        return Integer.hashCode(this.pid) + (Boolean.hashCode(this.injected) * 31);
    }

    public String toString() {
        return "ModuleStatus(injected=" + this.injected + ", pid=" + this.pid + ")";
    }

    public ModuleStatus(boolean z, int i) {
        this.injected = z;
        this.pid = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModuleStatus() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }
}
