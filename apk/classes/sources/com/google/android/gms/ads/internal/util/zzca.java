package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzca implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcb zza;
    private final String zzb;

    public zzca(zzcb zzcb, String str) {
        Objects.requireNonNull(zzcb);
        this.zza = zzcb;
        this.zzb = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzcb zzcb = this.zza;
        synchronized (zzcb) {
            for (zzbz zzbz : zzcb.zzb) {
                String str2 = this.zzb;
                Map map = zzbz.zza;
                if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                    zzv.zzp().zzi().zzE(false);
                }
            }
        }
    }
}
