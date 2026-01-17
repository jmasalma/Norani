package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzemf implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzemf(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzemf zza(zzhha zzhha, zzhha zzhha2) {
        return new zzemf(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfcw zzc = ((zzcvp) this.zzb).zzc();
        zzfcw zzfcw = zzc;
        return new zzemd((Clock) this.zza.zzb(), zzc);
    }
}
