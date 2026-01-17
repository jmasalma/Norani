package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdqa implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdqa(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzdqa zza(zzhha zzhha, zzhha zzhha2) {
        return new zzdqa(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfds zzc = ((zzckp) this.zza).zzb();
        zzfds zzfds = zzc;
        return new zzdpz(zzc, (zzdpw) this.zzb.zzb());
    }
}
