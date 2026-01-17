package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaxf implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzaxg zza;

    zzaxf(zzaxg zzaxg) {
        this.zza = zzaxg;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            zzaxg zzaxg = this.zza;
            zzaxg.zzb = System.currentTimeMillis();
            zzaxg.zze = true;
            return;
        }
        zzaxg zzaxg2 = this.zza;
        long currentTimeMillis = System.currentTimeMillis();
        if (zzaxg2.zzc > 0 && currentTimeMillis >= zzaxg2.zzc) {
            zzaxg2.zzd = currentTimeMillis - zzaxg2.zzc;
        }
        zzaxg2.zze = false;
    }
}
