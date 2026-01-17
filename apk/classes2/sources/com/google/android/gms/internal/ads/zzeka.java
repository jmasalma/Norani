package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbk;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeka implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;

    private zzeka(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
    }

    public static zzeka zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        return new zzeka(zzhha, zzhha2, zzhha3, zzhha4, zzhha5);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbk zza2 = ((zzdgx) this.zzb).zza();
        zzbk zzbk = zza2;
        zzfcw zzc2 = ((zzcvp) this.zzc).zzc();
        zzfcw zzfcw = zzc2;
        zzcos zza3 = ((zzcpf) this.zzd).zzb();
        zzcos zzcos = zza3;
        return new zzejz((Context) this.zza.zzb(), zza2, zzc2, zza3, (zzdsj) this.zze.zzb());
    }
}
