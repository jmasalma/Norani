package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdow implements zzhgr {
    private final zzhha zza;

    private zzdow(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzdow zza(zzhha zzhha) {
        return new zzdow(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        String str;
        zzfcw zzc = ((zzcvp) this.zza).zzc();
        zzfcw zzfcw = zzc;
        if (zzc.zzo.zza == 3) {
            str = "rewarded_interstitial";
        } else {
            str = "rewarded";
        }
        String str2 = str;
        return str;
    }
}
