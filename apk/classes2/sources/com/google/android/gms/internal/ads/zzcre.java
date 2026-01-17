package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcre implements zzhgr {
    private final zzhha zza;

    private zzcre(zzhha zzhha) {
        this.zza = zzhha;
    }

    public static zzcre zza(zzhha zzhha) {
        return new zzcre(zzhha);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Map zzd = ((zzhgv) this.zza).zzb();
        Map map = zzd;
        return new zzcrc(zzd);
    }
}
