package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbys implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbyt zza;
    private final String zzb;

    public zzbys(zzbyt zzbyt, String str) {
        Objects.requireNonNull(zzbyt);
        this.zza = zzbyt;
        this.zzb = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzbyt zzbyt = this.zza;
        synchronized (zzbyt) {
            for (zzbyr zzbyr : zzbyt.zzb) {
                zzbyt.zzb(zzbyr.zza, zzbyr.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
