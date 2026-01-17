package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzcai;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzd {
    public static void zza(Context context) {
        int i = zzl.zza;
        if (((Boolean) zzbfa.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0 && !zzl.zzl()) {
                    ListenableFuture zzb = new zzc(context).zzb();
                    int i2 = zze.zza;
                    zzo.zzi("Updating ad debug logging enablement.");
                    zzcai.zza(zzb, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e) {
                zzo.zzk("Fail to determine debug setting.", e);
            }
        }
    }
}
