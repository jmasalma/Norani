package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeav implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeav(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzeav zza(zzhha zzhha, zzhha zzhha2) {
        return new zzeav(zzhha, zzhha2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzebe zza2 = ((zzebg) this.zza).zzb();
        zzebe zzebe = zza2;
        zzg zza3 = ((zzchi) this.zzb).zzb();
        zzg zzg = zza3;
        return new zzeau(zza2, zza3);
    }
}
