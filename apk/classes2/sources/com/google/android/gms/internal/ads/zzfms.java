package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfms {
    private static final zzfms zza = new zzfms();
    private WeakReference zzb;
    /* access modifiers changed from: private */
    public boolean zzc = false;
    /* access modifiers changed from: private */
    public boolean zzd = false;

    public static zzfms zza() {
        return zza;
    }

    public final void zzc() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.zzb.get();
        if (context != null && (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) != null) {
            boolean isDeviceLocked = keyguardManager.isDeviceLocked();
            zzd(this.zzc, isDeviceLocked);
            this.zzd = isDeviceLocked;
        }
    }

    public final void zzd(boolean z, boolean z2) {
        if ((z2 || z) != (this.zzd || this.zzc)) {
            for (zzflp zzg : zzfmi.zza().zzc()) {
                zzg.zzg().zzm(z2 || z);
            }
        }
    }

    public final void zze(Context context) {
        if (context != null) {
            this.zzb = new WeakReference(context);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            context.registerReceiver(new zzfmr(this), intentFilter);
        }
    }
}
