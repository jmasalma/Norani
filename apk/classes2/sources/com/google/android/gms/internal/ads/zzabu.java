package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzabu implements DisplayManager.DisplayListener {
    final /* synthetic */ zzabw zza;
    private final DisplayManager zzb;

    public zzabu(zzabw zzabw, DisplayManager displayManager) {
        Objects.requireNonNull(zzabw);
        this.zza = zzabw;
        this.zzb = displayManager;
    }

    private final Display zzc() {
        return this.zzb.getDisplay(0);
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        if (i == 0) {
            zzabw.zzb(this.zza, zzc());
        }
    }

    public final void onDisplayRemoved(int i) {
    }

    public final void zza() {
        this.zzb.registerDisplayListener(this, zzex.zzy((Handler.Callback) null));
        zzabw.zzb(this.zza, zzc());
    }

    public final void zzb() {
        this.zzb.unregisterDisplayListener(this);
    }
}
