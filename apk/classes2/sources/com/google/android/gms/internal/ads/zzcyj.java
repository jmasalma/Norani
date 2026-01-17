package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcyj implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzcyj(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzcyj zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzcyj(zzhha, zzhha2, zzhha3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzc2 = ((zzhhd) this.zza).zzb();
        Set set = zzc2;
        zzfca zzc3 = ((zzcrr) this.zzb).zzc();
        zzfca zzfca = zzc3;
        zzfcn zzc4 = ((zzcru) this.zzc).zzc();
        zzfcn zzfcn = zzc4;
        return new zzcyi(zzc2, zzc3, zzc4);
    }
}
