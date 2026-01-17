package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdft implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdft(zzdff zzdff, zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzdft zzc(zzdff zzdff, zzhha zzhha, zzhha zzhha2) {
        return new zzdft(zzdff, zzhha, zzhha2);
    }

    /* renamed from: zza */
    public final zzbyk zzb() {
        Context zza2 = ((zzchl) this.zza).zza();
        Context context = zza2;
        zzfcw zzc = ((zzcvp) this.zzb).zzc();
        zzfcw zzfcw = zzc;
        zzbyk zzbyk = new zzbyk(zza2, zzc.zzf);
        zzbyk zzbyk2 = zzbyk;
        return zzbyk;
    }
}
