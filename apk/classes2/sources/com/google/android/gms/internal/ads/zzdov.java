package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbcj;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdov implements zzhgr {
    private final zzhha zza;

    private zzdov(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzdov zza(zzhha zzhha) {
        return new zzdov(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbcj.zza.C0000zza zza2;
        zzfcw zzc = ((zzcvp) this.zza).zzc();
        zzfcw zzfcw = zzc;
        if (zzc.zzo.zza == 3) {
            zza2 = zzbcj.zza.C0000zza.REWARDED_INTERSTITIAL;
        } else {
            zza2 = zzbcj.zza.C0000zza.REWARD_BASED_VIDEO_AD;
        }
        zzhgz.zzb(zza2);
        zzbcj.zza.C0000zza zza3 = zza2;
        return zza2;
    }
}
