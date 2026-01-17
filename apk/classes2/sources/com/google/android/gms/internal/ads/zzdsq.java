package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.zzad;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdsq implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ zzdss zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdsq(zzdss zzdss, String str) {
        this.zza = zzdss;
        this.zzb = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.zza.zzj.set(zzad.zzb(this.zza.zzb, this.zzb));
    }
}
